package com.cmplay.base.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Environment;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* compiled from: BitmapUtil.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f4014a = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "colornum";

    public static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        String encodeToString;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            if (bitmap != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        byteArrayOutputStream2 = byteArrayOutputStream;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.flush();
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        try {
                            byteArrayOutputStream2.flush();
                            byteArrayOutputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                encodeToString = null;
            }
            if (byteArrayOutputStream2 == null) {
                return encodeToString;
            }
            try {
                byteArrayOutputStream2.flush();
                byteArrayOutputStream2.close();
                return encodeToString;
            } catch (IOException e5) {
                e5.printStackTrace();
                return encodeToString;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap a(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options.outWidth, options.outHeight, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile != null) {
            h.a("BitmapResize", "BitmapUtil.decodeBitmap  maxDisplayWidth:" + i + "  maxDisplayHeight:" + i2 + " op.outWidth:" + options.outWidth + "  op.outHeight:" + options.outHeight + "  op.inSampleSize:" + options.inSampleSize + "  bmp.getWidth():" + decodeFile.getWidth() + "  bmp.getHeight():" + decodeFile.getHeight());
        }
        return decodeFile;
    }

    public static Bitmap a(byte[] bArr, int i, int i2) {
        float f;
        h.a("BitmapResize", "BitmapUtil.decodeBitmap  ################ maxDisplayWidth:" + i + "  maxDisplayHeight:" + i2);
        if (bArr == null) {
            return null;
        }
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            return null;
        }
        h.a("BitmapResize", "BitmapUtil.decodeBitmap  before zoomImg  tempBitmap.getWidth():" + decodeByteArray.getWidth() + "  tempBitmap.getHeight():" + decodeByteArray.getHeight());
        int width = decodeByteArray.getWidth();
        int height = decodeByteArray.getHeight();
        boolean z2 = true;
        float f2 = 1.0f;
        if (width > i) {
            f = i / width;
            z = true;
        } else {
            f = 1.0f;
        }
        if (height > i2) {
            f2 = i2 / height;
        } else {
            z2 = z;
        }
        if (!z2) {
            return decodeByteArray;
        }
        float f3 = f > f2 ? f2 : f;
        h.a("BitmapResize", "BitmapUtil.decodeBitmap zoomImg   wScale:" + f + "  hScale:" + f2 + "  scale:" + f3);
        Matrix matrix = new Matrix();
        matrix.postScale(f3, f3);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height, matrix, true);
        h.a("BitmapResize", "BitmapUtil.decodeBitmap  after zoomImg  newBmp.getWidth():" + createBitmap.getWidth() + "  newBmp.getHeight():" + createBitmap.getHeight());
        decodeByteArray.recycle();
        return createBitmap;
    }

    public static int a(int i, int i2, int i3, int i4) {
        int ceil = (int) Math.ceil(i / i3);
        int ceil2 = (int) Math.ceil(i2 / i4);
        if (ceil <= 1 || ceil2 <= 1) {
            return 1;
        }
        return ceil > ceil2 ? ceil : ceil2;
    }

    public static String a(byte[] bArr) {
        if (bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
            return "PNG";
        }
        if (bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
            return "GIF";
        }
        if (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) {
            return "JPG";
        }
        return null;
    }
}
