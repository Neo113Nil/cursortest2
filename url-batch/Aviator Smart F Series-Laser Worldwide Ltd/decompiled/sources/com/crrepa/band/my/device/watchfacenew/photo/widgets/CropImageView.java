package com.crrepa.band.my.device.watchfacenew.photo.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.crrepa.band.my.R$styleable;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.utils.o;
import com.orhanobut.logger.f;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class CropImageView extends ImageView {
    private static final int DRAG = 1;
    private static final float MAX_SCALE = 4.0f;
    private static final int NONE = 0;
    private static final int ROTATE = 3;
    private static final int SAVE_ERROR = 1002;
    private static final int SAVE_SUCCESS = 1001;
    private static final int ZOOM = 2;
    private static final int ZOOM_OR_ROTATE = 4;
    private static final Handler mHandler = new b();
    private static d mListener;
    private static c mMatrixListener;
    private final PointF doubleClickPos;
    private long doubleClickTime;
    private boolean isInited;
    public boolean isSaving;
    private int mBorderColor;
    private Paint mBorderPaint;
    private int mBorderWidth;
    private int mDefaultStyleIndex;
    private int mFocusHeight;
    private PointF mFocusMidPoint;
    private Path mFocusPath;
    private RectF mFocusRect;
    private int mFocusWidth;
    private int mImageHeight;
    private int mImageWidth;
    private int mMaskColor;
    private float mMaxScale;
    private int mRotatedImageHeight;
    private int mRotatedImageWidth;
    private Style mStyle;
    private Matrix matrix;
    private final PointF midPoint;
    private int mode;
    private float oldDist;
    private final PointF pA;
    private final PointF pB;
    private double rotation;
    private final Matrix savedMatrix;
    private Style[] styles;
    private int sumRotateLevel;

    public enum Style {
        RECTANGLE,
        CIRCLE
    }

    class a extends Thread {
        final /* synthetic */ Bitmap val$croppedImage;
        final /* synthetic */ Bitmap.CompressFormat val$finalOutputFormat;
        final /* synthetic */ File val$finalSaveFile;

        a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file) {
            this.val$croppedImage = bitmap;
            this.val$finalOutputFormat = compressFormat;
            this.val$finalSaveFile = file;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            CropImageView.this.saveOutput(this.val$croppedImage, this.val$finalOutputFormat, this.val$finalSaveFile);
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
                if (CropImageView.mListener != null) {
                    CropImageView.mListener.onBitmapSaveSuccess(file);
                }
            } else if (i8 == 1002 && CropImageView.mListener != null) {
                CropImageView.mListener.onBitmapSaveError(file);
            }
        }
    }

    public interface c {
        void OnBitmapMatrixChange(Matrix matrix);

        void OnInitBitmap();
    }

    public interface d {
        void onBitmapSaveError(File file);

        void onBitmapSaveSuccess(File file);
    }

    public CropImageView(Context context) {
        this(context, null);
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

    private void doubleClick(float f8, float f9) {
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]) + Math.abs(fArr[1]);
        float scale = getScale(this.mRotatedImageWidth, this.mRotatedImageHeight, this.mFocusWidth, this.mFocusHeight);
        float f10 = this.mMaxScale;
        if (abs < f10) {
            float min = Math.min(scale + abs, f10) / abs;
            this.matrix.postScale(min, min, f8, f9);
        } else {
            float f11 = scale / abs;
            this.matrix.postScale(f11, f11, f8, f9);
            fixTranslation();
        }
        setImageMatrix(this.matrix);
    }

    private void fixScale() {
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]) + Math.abs(fArr[1]);
        float scale = getScale(this.mRotatedImageWidth, this.mRotatedImageHeight, this.mFocusWidth, this.mFocusHeight);
        float f8 = 4.0f * scale;
        this.mMaxScale = f8;
        if (abs < scale) {
            float f9 = scale / abs;
            this.matrix.postScale(f9, f9);
        } else if (abs > f8) {
            float f10 = f8 / abs;
            this.matrix.postScale(f10, f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void fixTranslation() {
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, this.mImageWidth, this.mImageHeight);
        this.matrix.mapRect(rectF);
        float f12 = rectF.left;
        RectF rectF2 = this.mFocusRect;
        float f13 = rectF2.left;
        if (f12 <= f13) {
            f12 = rectF.right;
            f13 = rectF2.right;
            if (f12 >= f13) {
                f8 = 0.0f;
                f9 = rectF.top;
                f10 = rectF2.top;
                if (f9 <= f10) {
                    f11 = (-f9) + f10;
                } else {
                    float f14 = rectF.bottom;
                    float f15 = rectF2.bottom;
                    if (f14 < f15) {
                        f11 = (-f14) + f15;
                    }
                }
                this.matrix.postTranslate(f8, f11);
            }
        }
        f8 = (-f12) + f13;
        f9 = rectF.top;
        f10 = rectF2.top;
        if (f9 <= f10) {
        }
        this.matrix.postTranslate(f8, f11);
    }

    private RectF getImageMatrixRect() {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        this.matrix.mapRect(rectF);
        return rectF;
    }

    private float getScale(int i8, int i9, int i10, int i11) {
        return Math.max(i10 / i8, i11 / i9);
    }

    private void initImage() {
        Drawable drawable = getDrawable();
        if (!this.isInited || drawable == null) {
            return;
        }
        this.mode = 0;
        this.matrix = getImageMatrix();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.mRotatedImageWidth = intrinsicWidth;
        this.mImageWidth = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.mRotatedImageHeight = intrinsicHeight;
        this.mImageHeight = intrinsicHeight;
        int width = getWidth();
        int height = getHeight();
        this.mFocusMidPoint = new PointF(width / 2.0f, height / 2.0f);
        if (this.mStyle == Style.CIRCLE) {
            int min = Math.min(this.mFocusWidth, this.mFocusHeight);
            this.mFocusWidth = min;
            this.mFocusHeight = min;
        }
        RectF rectF = this.mFocusRect;
        PointF pointF = this.mFocusMidPoint;
        float f8 = pointF.x;
        int i8 = this.mFocusWidth;
        rectF.left = f8 - (i8 / 2.0f);
        rectF.right = f8 + (i8 / 2.0f);
        float f9 = pointF.y;
        int i9 = this.mFocusHeight;
        rectF.top = f9 - (i9 / 2.0f);
        rectF.bottom = f9 + (i9 / 2.0f);
        float scale = getScale(this.mImageWidth, this.mImageHeight, i8, i9);
        this.mMaxScale = 4.0f * scale;
        float max = Math.max(getScale(this.mImageWidth, this.mImageHeight, width, height), scale);
        this.matrix.setScale(max, max, this.mImageWidth / 2.0f, this.mImageHeight / 2.0f);
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        PointF pointF2 = this.mFocusMidPoint;
        this.matrix.postTranslate(pointF2.x - (fArr[2] + ((this.mImageWidth * fArr[0]) / 2.0f)), pointF2.y - (fArr[5] + ((this.mImageHeight * fArr[4]) / 2.0f)));
        super.setImageMatrix(this.matrix);
        mMatrixListener.OnInitBitmap();
    }

    private Bitmap makeCropBitmap(Bitmap bitmap, RectF rectF, RectF rectF2, int i8, int i9, boolean z7) {
        float width = rectF2.width() / bitmap.getWidth();
        int i10 = (int) ((rectF.left - rectF2.left) / width);
        int i11 = (int) ((rectF.top - rectF2.top) / width);
        int width2 = (int) (rectF.width() / width);
        int height = (int) (rectF.height() / width);
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i10 + width2 > bitmap.getWidth()) {
            width2 = bitmap.getWidth() - i10;
        }
        if (i11 + height > bitmap.getHeight()) {
            height = bitmap.getHeight() - i11;
        }
        if (Math.min(width2, height) <= 0) {
            f.e("makeCropBitmap: " + width2 + ", " + height, new Object[0]);
            return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i10, i11, width2, height);
            if (i8 == width2 && i9 == height) {
                return createBitmap;
            }
            bitmap = Bitmap.createScaledBitmap(createBitmap, i8, i9, true);
            if (this.mStyle != Style.CIRCLE || z7) {
                return bitmap;
            }
            int min = Math.min(i8, i9);
            int i12 = min / 2;
            Bitmap createBitmap2 = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = new Paint();
            paint.setShader(bitmapShader);
            canvas.drawCircle(i8 / 2.0f, i9 / 2.0f, i12, paint);
            return createBitmap2;
        } catch (OutOfMemoryError e8) {
            e8.printStackTrace();
            return bitmap;
        }
    }

    private float maxPostScale() {
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        return this.mMaxScale / (Math.abs(fArr[0]) + Math.abs(fArr[1]));
    }

    private Bitmap processBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getByteCount() <= 104857600) {
            return bitmap;
        }
        float sqrt = (float) Math.sqrt(1.048576E8f / r0);
        return Bitmap.createScaledBitmap(bitmap, Math.max((int) (bitmap.getWidth() * sqrt), 100), Math.max((int) (bitmap.getHeight() * sqrt), 100), true);
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
    public void saveOutput(Bitmap bitmap, Bitmap.CompressFormat compressFormat, File file) {
        OutputStream outputStream = null;
        try {
            try {
                try {
                    outputStream = getContext().getContentResolver().openOutputStream(Uri.parse("file://" + file));
                    if (outputStream != null) {
                        bitmap.compress(compressFormat, 10, outputStream);
                    }
                    Message.obtain(mHandler, 1001, file).sendToTarget();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            } catch (IOException e9) {
                e9.printStackTrace();
                Message.obtain(mHandler, 1002, file).sendToTarget();
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            this.isSaving = false;
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

    private float spacing(float f8, float f9, float f10, float f11) {
        float f12 = f8 - f10;
        float f13 = f9 - f11;
        return (float) Math.sqrt((f12 * f12) + (f13 * f13));
    }

    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    public Bitmap getCropBitmap(int i8, int i9, boolean z7) {
        if (i8 <= 0 || i9 < 0) {
            return null;
        }
        return makeCropBitmap(rotate(((BitmapDrawable) getDrawable()).getBitmap(), this.sumRotateLevel * 90), this.mFocusRect, getImageMatrixRect(), i8, i9, z7);
    }

    public int getFocusColor() {
        return this.mBorderColor;
    }

    public int getFocusHeight() {
        return this.mFocusHeight;
    }

    public Style getFocusStyle() {
        return this.mStyle;
    }

    public int getFocusWidth() {
        return this.mFocusWidth;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getByteCount() > 262144000) {
            canvas.drawColor(this.mMaskColor);
            return;
        }
        super.onDraw(canvas);
        Style style = Style.RECTANGLE;
        Style style2 = this.mStyle;
        if (style == style2) {
            this.mFocusPath.addRect(this.mFocusRect, Path.Direction.CCW);
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.clipPath(this.mFocusPath, Region.Op.DIFFERENCE);
            canvas.drawColor(this.mMaskColor);
            canvas.restore();
        } else if (Style.CIRCLE == style2) {
            RectF rectF = this.mFocusRect;
            float min = Math.min((rectF.right - rectF.left) / 2.0f, (rectF.bottom - rectF.top) / 2.0f);
            Path path = this.mFocusPath;
            PointF pointF = this.mFocusMidPoint;
            path.addCircle(pointF.x, pointF.y, min, Path.Direction.CCW);
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.clipPath(this.mFocusPath, Region.Op.DIFFERENCE);
            canvas.drawColor(this.mMaskColor);
            canvas.restore();
        }
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        this.mBorderPaint.setAntiAlias(true);
        canvas.drawPath(this.mFocusPath, this.mBorderPaint);
        this.mFocusPath.reset();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.isInited = true;
        initImage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r2 != 6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (this.isSaving || getDrawable() == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.mode == 4) {
                        PointF pointF = new PointF((motionEvent.getX(1) - motionEvent.getX(0)) + this.pA.x, (motionEvent.getY(1) - motionEvent.getY(0)) + this.pA.y);
                        PointF pointF2 = this.pB;
                        double spacing = spacing(pointF2.x, pointF2.y, pointF.x, pointF.y);
                        PointF pointF3 = this.pA;
                        double spacing2 = spacing(pointF3.x, pointF3.y, pointF.x, pointF.y);
                        PointF pointF4 = this.pA;
                        float f8 = pointF4.x;
                        float f9 = pointF4.y;
                        PointF pointF5 = this.pB;
                        double spacing3 = spacing(f8, f9, pointF5.x, pointF5.y);
                        if (spacing >= 10.0d) {
                            double acos = Math.acos((((spacing * spacing) + (spacing3 * spacing3)) - (spacing2 * spacing2)) / ((spacing * 2.0d) * spacing3));
                            if (acos <= 0.7853981633974483d || acos >= 2.356194490192345d) {
                                this.mode = 2;
                            } else {
                                this.mode = 3;
                            }
                        }
                    }
                    int i8 = this.mode;
                    if (i8 == 1) {
                        this.matrix.set(this.savedMatrix);
                        this.matrix.postTranslate(motionEvent.getX() - this.pA.x, motionEvent.getY() - this.pA.y);
                        fixTranslation();
                        setImageMatrix(this.matrix);
                    } else if (i8 == 2) {
                        float spacing4 = spacing(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                        if (spacing4 > 10.0f) {
                            this.matrix.set(this.savedMatrix);
                            float min = Math.min(spacing4 / this.oldDist, maxPostScale());
                            if (min != 0.0f) {
                                Matrix matrix = this.matrix;
                                PointF pointF6 = this.midPoint;
                                matrix.postScale(min, min, pointF6.x, pointF6.y);
                                fixScale();
                                fixTranslation();
                                setImageMatrix(this.matrix);
                            }
                        }
                    } else if (i8 == 3) {
                        PointF pointF7 = new PointF((motionEvent.getX(1) - motionEvent.getX(0)) + this.pA.x, (motionEvent.getY(1) - motionEvent.getY(0)) + this.pA.y);
                        PointF pointF8 = this.pB;
                        double spacing5 = spacing(pointF8.x, pointF8.y, pointF7.x, pointF7.y);
                        PointF pointF9 = this.pA;
                        double spacing6 = spacing(pointF9.x, pointF9.y, pointF7.x, pointF7.y);
                        PointF pointF10 = this.pA;
                        float f10 = pointF10.x;
                        float f11 = pointF10.y;
                        PointF pointF11 = this.pB;
                        double spacing7 = spacing(f10, f11, pointF11.x, pointF11.y);
                        if (spacing6 > 10.0d) {
                            double acos2 = Math.acos((((spacing6 * spacing6) + (spacing7 * spacing7)) - (spacing5 * spacing5)) / ((spacing6 * 2.0d) * spacing7));
                            PointF pointF12 = this.pB;
                            float f12 = pointF12.y;
                            PointF pointF13 = this.pA;
                            double d8 = f12 - pointF13.y;
                            float f13 = pointF13.x;
                            float f14 = pointF12.x;
                            if ((d8 * pointF7.x) + ((f13 - f14) * pointF7.y) + ((f14 * r7) - (f13 * f12)) > i.DOUBLE_EPSILON) {
                                acos2 = 6.283185307179586d - acos2;
                            }
                            this.rotation = acos2;
                            this.matrix.set(this.savedMatrix);
                            Matrix matrix2 = this.matrix;
                            float f15 = (float) ((this.rotation * 180.0d) / 3.141592653589793d);
                            PointF pointF14 = this.midPoint;
                            matrix2.postRotate(f15, pointF14.x, pointF14.y);
                            setImageMatrix(this.matrix);
                        }
                    }
                } else if (action == 5) {
                    if (motionEvent.getActionIndex() <= 1) {
                        this.pA.set(motionEvent.getX(0), motionEvent.getY(0));
                        this.pB.set(motionEvent.getX(1), motionEvent.getY(1));
                        PointF pointF15 = this.midPoint;
                        PointF pointF16 = this.pA;
                        float f16 = pointF16.x;
                        PointF pointF17 = this.pB;
                        pointF15.set((f16 + pointF17.x) / 2.0f, (pointF16.y + pointF17.y) / 2.0f);
                        this.oldDist = spacing(this.pA, this.pB);
                        this.savedMatrix.set(this.matrix);
                        if (this.oldDist > 10.0f) {
                            this.mode = 4;
                        }
                    }
                }
                z7 = true;
            }
            mMatrixListener.OnBitmapMatrixChange(this.matrix);
            Log.e("onItemChildClick", "ACTION_UP  matrix: " + this.matrix.toString());
            int i9 = this.mode;
            if (i9 == 1) {
                if (spacing(this.pA, this.pB) < 50.0f) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.doubleClickTime < 500 && spacing(this.pA, this.doubleClickPos) < 50.0f) {
                        PointF pointF18 = this.pA;
                        doubleClick(pointF18.x, pointF18.y);
                        currentTimeMillis = 0;
                    }
                    this.doubleClickPos.set(this.pA);
                    this.doubleClickTime = currentTimeMillis;
                }
            } else if (i9 == 3) {
                int floor = (int) Math.floor((this.rotation + 0.7853981633974483d) / 1.5707963267948966d);
                if (floor == 4) {
                    floor = 0;
                }
                this.matrix.set(this.savedMatrix);
                PointF pointF19 = this.midPoint;
                this.matrix.postRotate(floor * 90, pointF19.x, pointF19.y);
                if (floor == 1 || floor == 3) {
                    int i10 = this.mRotatedImageWidth;
                    this.mRotatedImageWidth = this.mRotatedImageHeight;
                    this.mRotatedImageHeight = i10;
                }
                fixScale();
                fixTranslation();
                setImageMatrix(this.matrix);
                this.sumRotateLevel += floor;
            }
            this.mode = 0;
            z7 = true;
        } else {
            this.savedMatrix.set(this.matrix);
            this.pA.set(motionEvent.getX(), motionEvent.getY());
            this.pB.set(motionEvent.getX(), motionEvent.getY());
            z7 = true;
            this.mode = 1;
        }
        ViewCompat.postInvalidateOnAnimation(this);
        return z7;
    }

    public void saveBitmapToFile(File file, int i8, int i9, int i10, boolean z7) {
        if (this.isSaving) {
            return;
        }
        this.isSaving = true;
        Bitmap cropBitmap = getCropBitmap(i9, i10, z7);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        File createFile = createFile(file, i8);
        if (this.mStyle == Style.CIRCLE && !z7) {
            createFile = createFile(file, i8);
        }
        Log.e("imgPath", createFile.getPath());
        new a(cropBitmap, compressFormat, createFile).start();
    }

    public void setBorderColor(int i8) {
        this.mBorderColor = i8;
        invalidate();
    }

    public void setBorderWidth(int i8) {
        this.mBorderWidth = i8;
        invalidate();
    }

    public void setFocusHeight(int i8) {
        this.mFocusHeight = i8;
        initImage();
    }

    public void setFocusStyle(Style style) {
        this.mStyle = style;
        invalidate();
    }

    public void setFocusWidth(int i8) {
        this.mFocusWidth = i8;
        initImage();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(processBitmap(bitmap));
        initImage();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            drawable = new BitmapDrawable(getResources(), processBitmap(((BitmapDrawable) drawable).getBitmap()));
        }
        super.setImageDrawable(drawable);
        initImage();
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        super.setImageResource(i8);
        initImage();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        initImage();
    }

    public void setMaskColor(int i8) {
        this.mMaskColor = i8;
        invalidate();
    }

    public void setOnBitmapMatrixListener(c cVar) {
        mMatrixListener = cVar;
    }

    public void setOnBitmapSaveCompleteListener(d dVar) {
        mListener = dVar;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float spacing(PointF pointF, PointF pointF2) {
        return spacing(pointF.x, pointF.y, pointF2.x, pointF2.y);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Style style = Style.RECTANGLE;
        this.styles = new Style[]{style, Style.CIRCLE};
        this.mMaskColor = -1358954496;
        this.mBorderColor = -1434419072;
        this.mBorderWidth = 1;
        this.mFocusWidth = 250;
        this.mFocusHeight = 250;
        this.mDefaultStyleIndex = 0;
        this.mStyle = style;
        this.mBorderPaint = new Paint();
        this.mFocusPath = new Path();
        this.mFocusRect = new RectF();
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.pA = new PointF();
        this.pB = new PointF();
        this.midPoint = new PointF();
        this.doubleClickPos = new PointF();
        this.mFocusMidPoint = new PointF();
        this.mode = 0;
        this.doubleClickTime = 0L;
        this.rotation = i.DOUBLE_EPSILON;
        this.oldDist = 1.0f;
        this.sumRotateLevel = 0;
        this.mMaxScale = 4.0f;
        this.isInited = false;
        this.isSaving = false;
        this.mFocusWidth = (int) TypedValue.applyDimension(1, this.mFocusWidth, getResources().getDisplayMetrics());
        this.mFocusHeight = (int) TypedValue.applyDimension(1, this.mFocusHeight, getResources().getDisplayMetrics());
        this.mBorderWidth = (int) TypedValue.applyDimension(1, this.mBorderWidth, getResources().getDisplayMetrics());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CropImageView);
        this.mMaskColor = obtainStyledAttributes.getColor(4, this.mMaskColor);
        this.mBorderColor = obtainStyledAttributes.getColor(0, this.mBorderColor);
        this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(1, this.mBorderWidth);
        this.mFocusWidth = obtainStyledAttributes.getDimensionPixelSize(3, this.mFocusWidth);
        this.mFocusHeight = obtainStyledAttributes.getDimensionPixelSize(2, this.mFocusHeight);
        int i9 = obtainStyledAttributes.getInt(5, 0);
        this.mDefaultStyleIndex = i9;
        Style style2 = this.styles[i9];
        this.mStyle = style2;
        if (style2 == style) {
            this.mFocusWidth = o.dp2px(context, 211.5f);
            this.mFocusHeight = o.dp2px(context, 278.0f);
        }
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
