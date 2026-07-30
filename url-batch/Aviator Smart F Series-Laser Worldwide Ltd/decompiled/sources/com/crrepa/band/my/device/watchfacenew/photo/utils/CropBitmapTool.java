package com.crrepa.band.my.device.watchfacenew.photo.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.crrepa.band.my.device.watchfacenew.delegate.img.i;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class CropBitmapTool {
    private static final int SAVE_ERROR = 1002;
    private static final int SAVE_SUCCESS = 1001;
    public static final File cropCacheFolder = new File(i.getCustomWatchFaceImgDir());
    private static final Handler mHandler = new b();
    private static c mListener;
    private final Style[] STYLES;
    private Style cropStyle;
    public boolean isSaving;
    private int mFocusHeight;
    private final RectF mFocusRect = new RectF();
    private int mFocusWidth;

    public enum Style {
        RECTANGLE,
        CIRCLE
    }

    class a extends Thread {
        final /* synthetic */ Context val$context;
        final /* synthetic */ Bitmap val$croppedImage;
        final /* synthetic */ Bitmap.CompressFormat val$finalOutputFormat;
        final /* synthetic */ File val$finalSaveFile;

        a(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file) {
            this.val$context = context;
            this.val$croppedImage = bitmap;
            this.val$finalOutputFormat = compressFormat;
            this.val$finalSaveFile = file;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            CropBitmapTool.this.saveOutput(this.val$context, this.val$croppedImage, this.val$finalOutputFormat, this.val$finalSaveFile);
        }
    }

    private static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            File file = (File) message.obj;
            int i8 = message.what;
            if (i8 == 1001) {
                if (CropBitmapTool.mListener != null) {
                    CropBitmapTool.mListener.onBitmapCropSaveSuccess(file);
                }
            } else if (i8 == 1002 && CropBitmapTool.mListener != null) {
                CropBitmapTool.mListener.onBitmapCropSaveError(file);
            }
        }
    }

    public interface c {
        void onBitmapCropSaveError(File file);

        void onBitmapCropSaveSuccess(File file);
    }

    public CropBitmapTool() {
        Style style = Style.CIRCLE;
        this.STYLES = new Style[]{Style.RECTANGLE, style};
        this.cropStyle = style;
        this.isSaving = false;
    }

    private File createFile(File file, int i8) {
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return new File(file, ((System.currentTimeMillis() / 1000) + i8) + ".png");
    }

    public static File getCropCacheFolder() {
        return new File(i.getCustomWatchFaceImgDir());
    }

    private float getScale(int i8, int i9, int i10, int i11) {
        return Math.max(i10 / i8, i11 / i9);
    }

    private Bitmap makeCropBitmap(Bitmap bitmap, int i8, int i9, boolean z7, float f8) {
        Bitmap createBitmap;
        float scale = getScale(bitmap.getWidth(), bitmap.getHeight(), this.mFocusWidth, this.mFocusHeight);
        int width = bitmap.getWidth() / 2;
        int i10 = (int) (width - ((this.mFocusWidth / scale) / 2.0f));
        int height = (int) ((bitmap.getHeight() / 2) - ((this.mFocusHeight / scale) / 2.0f));
        int width2 = (int) (this.mFocusRect.width() / scale);
        int height2 = (int) (this.mFocusRect.height() / scale);
        if (i10 < 0) {
            i10 = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if (i10 + width2 > bitmap.getWidth()) {
            width2 = bitmap.getWidth() - i10;
        }
        if (height + height2 > bitmap.getHeight()) {
            height2 = bitmap.getHeight() - height;
        }
        try {
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, i10, height, width2, height2);
            if (i8 == width2 && i9 == height2) {
                return createBitmap2;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap2, i8, i9, true);
            Style style = this.cropStyle;
            if (style == Style.CIRCLE && !z7) {
                int min = Math.min(i8, i9);
                int i11 = min / 2;
                createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createScaledBitmap, tileMode, tileMode);
                Paint paint = new Paint();
                paint.setShader(bitmapShader);
                canvas.drawCircle(i8 / 2.0f, i9 / 2.0f, i11, paint);
            } else {
                if (style != Style.RECTANGLE) {
                    return createScaledBitmap;
                }
                createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Paint paint2 = new Paint();
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(createScaledBitmap, tileMode2, tileMode2));
                canvas2.drawRoundRect(new RectF(0.0f, 0.0f, i8, i9), f8, f8, paint2);
            }
            return createBitmap;
        } catch (OutOfMemoryError e8) {
            e8.printStackTrace();
            return bitmap;
        }
    }

    private Bitmap rotate(Bitmap bitmap, int i8) {
        if (i8 != 0 && bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i8, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap != createBitmap) {
                    return createBitmap;
                }
            } catch (OutOfMemoryError e8) {
                e8.printStackTrace();
            }
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveOutput(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file) {
        OutputStream outputStream = null;
        try {
            try {
                try {
                    outputStream = context.getContentResolver().openOutputStream(Uri.parse("file://" + file));
                    if (outputStream != null) {
                        bitmap.compress(compressFormat, 100, outputStream);
                    }
                    if (!file.getPath().endsWith("101.png") && !file.getPath().endsWith("102.png")) {
                        Message.obtain(mHandler, 1001, file).sendToTarget();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            } catch (IOException e9) {
                e9.printStackTrace();
                if (!file.getPath().endsWith("101.png") && !file.getPath().endsWith("102.png")) {
                    Message.obtain(mHandler, 1001, file).sendToTarget();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            this.isSaving = false;
            bitmap.recycle();
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }

    public Bitmap getCropBitmap(Bitmap bitmap, int i8, int i9, boolean z7, float f8) {
        if (i8 <= 0 || i9 < 0) {
            return null;
        }
        return makeCropBitmap(rotate(bitmap, 0), i8, i9, z7, f8);
    }

    public void initData(int i8, int i9, int i10, int i11, Style style) {
        this.mFocusWidth = i10;
        this.mFocusHeight = i11;
        this.cropStyle = style;
        PointF pointF = new PointF(i8 / 2.0f, i9 / 2.0f);
        if (style == Style.CIRCLE) {
            int min = Math.min(this.mFocusWidth, this.mFocusHeight);
            this.mFocusWidth = min;
            this.mFocusHeight = min;
        }
        RectF rectF = this.mFocusRect;
        float f8 = pointF.x;
        int i12 = this.mFocusWidth;
        rectF.left = f8 - (i12 / 2.0f);
        rectF.right = f8 + (i12 / 2.0f);
        float f9 = pointF.y;
        int i13 = this.mFocusHeight;
        rectF.top = f9 - (i13 / 2.0f);
        rectF.bottom = f9 + (i13 / 2.0f);
    }

    public void saveBitmapToFile(Context context, int i8, Bitmap bitmap, File file, int i9, int i10, boolean z7, float f8) {
        this.isSaving = true;
        new a(context, getCropBitmap(bitmap, i9, i10, z7, f8), Bitmap.CompressFormat.PNG, (this.cropStyle != Style.CIRCLE || z7) ? createFile(file, i8) : createFile(file, i8)).start();
    }

    public void setOnBitmapSaveCompleteListener(c cVar) {
        mListener = cVar;
    }
}
