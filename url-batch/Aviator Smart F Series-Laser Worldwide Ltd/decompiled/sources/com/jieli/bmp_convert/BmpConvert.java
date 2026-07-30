package com.jieli.bmp_convert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class BmpConvert {
    public static final int ERR_FILE_TYPE = -3588;
    public static final int ERR_INVALID_PARAM = -3584;
    public static final int ERR_IN_PROGRESS = -3587;
    public static final int ERR_IO_EXCEPTION = -3586;
    public static final int ERR_NOT_FOUND_FILE = -3585;
    public static final int TYPE_695N_RBG = 0;
    public static final int TYPE_701N_ARGB = 2;
    public static final int TYPE_701N_ARGB_NO_PACK = 4;
    public static final int TYPE_701N_JPEG = 9;
    public static final int TYPE_701N_RGB = 1;
    public static final int TYPE_701N_RGB_NO_PACK = 3;
    public static final int TYPE_707N_ARGB = 6;
    public static final int TYPE_707N_ARGB_NO_PACK = 8;
    public static final int TYPE_707N_RGB = 5;
    public static final int TYPE_707N_RGB_NO_PACK = 7;

    @Deprecated
    public static final int TYPE_BR_23 = 0;

    @Deprecated
    public static final int TYPE_BR_28 = 1;

    @Deprecated
    public static final int TYPE_BR_28_ALPHA = 2;

    @Deprecated
    public static final int TYPE_BR_28_ALPHA_RAW = 4;

    @Deprecated
    public static final int TYPE_BR_28_RAW = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final String f15130d = "BmpConvert";

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f15131e = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static boolean isLog = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f15132a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f15133b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15134c = new Handler(Looper.getMainLooper());

    static {
        try {
            System.loadLibrary("jl_bmp_convert");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public BmpConvert() {
        b("init", String.format(Locale.ENGLISH, "Library name = %s(%d), clazz : %s", getLibVersionName(), Integer.valueOf(getLibVersionCode()), this));
    }

    public static int getLibVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    public static String getLibVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    public final String a(String str, String str2) {
        return String.format(Locale.ENGLISH, "[%s]\t%s", str, str2);
    }

    public final void b(String str) {
        if (!isLog || str == null || str.isEmpty()) {
            return;
        }
        Log.i(f15130d, str);
    }

    public void bitmapConvert(final int i8, final String str, final String str2, final ConvertParam convertParam, final OnConvertListener onConvertListener) {
        ExecutorService executorService = this.f15133b;
        if (executorService == null || executorService.isShutdown()) {
            this.f15133b = Executors.newSingleThreadExecutor();
        }
        this.f15133b.submit(new Runnable() { // from class: com.jieli.bmp_convert.c
            @Override // java.lang.Runnable
            public final void run() {
                BmpConvert.this.a(onConvertListener, str, convertParam, i8, str2);
            }
        });
    }

    public ConvertResult bitmapConvertAndCompressBlock(int i8, String str, String str2) {
        return bitmapConvertAndCompressBlock(i8, str, str2, new ConvertParam());
    }

    public int bitmapConvertBlock(int i8, String str, String str2) {
        ConvertResult bitmapConvertAndCompressBlock = bitmapConvertAndCompressBlock(i8, str, str2);
        return bitmapConvertAndCompressBlock == null ? ERR_INVALID_PARAM : bitmapConvertAndCompressBlock.getResult();
    }

    public native ConvertResult bmpConvert_native(int i8, String str, int i9, int i10, String str2, ConvertParam convertParam);

    public boolean isWorking() {
        return this.f15132a;
    }

    public void release() {
        b("release", "clazz : " + this);
        ExecutorService executorService = this.f15133b;
        if (executorService != null && !executorService.isShutdown()) {
            this.f15133b.shutdownNow();
        }
        this.f15133b = null;
        this.f15132a = false;
        this.f15134c.removeCallbacksAndMessages(null);
    }

    public final /* synthetic */ void a(ConvertResult convertResult, OnConvertListener onConvertListener, String str) {
        b("bitmapConvert", "end ... " + convertResult);
        if (convertResult.isConvertSuccess()) {
            onConvertListener.onStop(true, str);
        } else {
            onConvertListener.onStop(false, (String) null);
        }
        onConvertListener.onStop(convertResult, str);
    }

    public final void b(String str, String str2) {
        b(a(str, str2));
    }

    public void bitmapConvert(int i8, String str, String str2, OnConvertListener onConvertListener) {
        bitmapConvert(i8, str, str2, new ConvertParam(), onConvertListener);
    }

    public ConvertResult bitmapConvertAndCompressBlock(int i8, String str, String str2, ConvertParam convertParam) {
        File file;
        String str3 = str;
        if (a(i8)) {
            b("bitmapConvertAndCompressBlock", "Unknown Type : " + i8);
            return new ConvertResult().setAlgorithm(i8).setResult(ERR_INVALID_PARAM);
        }
        File file2 = new File(str3);
        if (!file2.exists() || !file2.isFile()) {
            b("bitmapConvertAndCompressBlock", "File not found. path : " + str3);
            return new ConvertResult().setAlgorithm(i8).setResult(ERR_NOT_FOUND_FILE);
        }
        if (isWorking()) {
            b("bitmapConvertAndCompressBlock", "Conversion in progress.");
            return new ConvertResult().setAlgorithm(i8).setResult(ERR_IN_PROGRESS);
        }
        this.f15132a = true;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFile = BitmapFactory.decodeFile(str3, options);
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        if (i8 != 9) {
            int i9 = width * height;
            int[] iArr = new int[i9];
            decodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i9 * 4];
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i10 << 2;
                int i12 = iArr[i10];
                bArr[i11] = (byte) (i12 & 255);
                bArr[i11 + 1] = (byte) ((i12 >> 8) & 255);
                bArr[i11 + 2] = (byte) ((i12 >> 16) & 255);
                bArr[i11 + 3] = (byte) ((i12 >> 24) & 255);
            }
            str3 = str3.substring(0, str3.lastIndexOf(".")) + ".bin";
            file = new File(str3);
            try {
                if (file.exists() && !file.delete()) {
                    b("bitmapConvertAndCompressBlock", "Failed to delete file. path : " + str3);
                }
                if (!file.createNewFile()) {
                    b("bitmapConvertAndCompressBlock", "Failed to create new file. path : " + str3);
                    this.f15132a = false;
                    return new ConvertResult().setAlgorithm(i8).setResult(ERR_IO_EXCEPTION);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str3);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
                b("bitmapConvertAndCompressBlock", "IOException : " + e8);
                this.f15132a = false;
                return new ConvertResult().setAlgorithm(i8).setResult(ERR_IO_EXCEPTION);
            }
        } else {
            if (!a(file2.getName())) {
                b("bitmapConvertAndCompressBlock", "It's not a JPG image.");
                return new ConvertResult().setAlgorithm(i8).setResult(ERR_FILE_TYPE);
            }
            file = null;
        }
        File file3 = file;
        ConvertResult bmpConvert_native = bmpConvert_native(i8, str3, width, height, str2, convertParam);
        b("bitmapConvertAndCompressBlock", "result : " + bmpConvert_native);
        if (bmpConvert_native.isConvertSuccess() && file3 != null && file3.exists() && !file3.delete()) {
            b("bitmapConvertAndCompressBlock", "Failed to delete cache file. path : " + str3);
        }
        this.f15132a = false;
        return bmpConvert_native;
    }

    public final /* synthetic */ void a(OnConvertListener onConvertListener, String str) {
        b("bitmapConvert", "start");
        onConvertListener.onStart(str);
    }

    @Deprecated
    public void bitmapConvert(String str, String str2, OnConvertListener onConvertListener) {
        bitmapConvert(0, str, str2, onConvertListener);
    }

    public final /* synthetic */ void a(final OnConvertListener onConvertListener, final String str, ConvertParam convertParam, int i8, final String str2) {
        if (onConvertListener != null) {
            this.f15134c.post(new Runnable() { // from class: com.jieli.bmp_convert.a
                @Override // java.lang.Runnable
                public final void run() {
                    BmpConvert.this.a(onConvertListener, str);
                }
            });
        }
        if (convertParam == null) {
            convertParam = new ConvertParam();
        }
        final ConvertResult bitmapConvertAndCompressBlock = bitmapConvertAndCompressBlock(i8, str, str2, convertParam);
        if (onConvertListener != null) {
            this.f15134c.post(new Runnable() { // from class: com.jieli.bmp_convert.b
                @Override // java.lang.Runnable
                public final void run() {
                    BmpConvert.this.a(bitmapConvertAndCompressBlock, onConvertListener, str2);
                }
            });
        }
    }

    public final boolean a(int i8) {
        for (int i9 : f15131e) {
            if (i9 == i8) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(".jpg") || str.endsWith(".JPG") || str.endsWith(".jpeg") || str.endsWith(".JPEG");
    }
}
