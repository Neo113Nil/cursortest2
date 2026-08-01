package com.bytedance.sdk.component.NB.vG.icD;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: DefaultDecoder.java */
/* loaded from: classes.dex */
public class pvs {
    private int Jd;
    private int NB;
    private final int sUS;
    private final ImageView.ScaleType so;
    private final Bitmap.Config vG;
    private final int yiw;
    public static final ImageView.ScaleType pvs = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config icD = Bitmap.Config.ARGB_4444;
    private final int Mxy = 3840;
    private final int Wyp = 104857600;

    public pvs(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.vG = config;
        this.Jd = i;
        this.NB = i2;
        this.so = scaleType;
        this.sUS = i3;
        this.yiw = i4;
        pvs(i, i2);
    }

    static int pvs(int i, int i2, int i3, int i4, int i5, int i6) {
        double min = Math.min(i / i3, i2 / i4);
        if (i5 > 0 && i6 > 0) {
            min = Math.max(min, Math.min(Math.max(i, i2) / Math.max(i5, i6), Math.min(i, i2) / Math.min(i5, i6)));
        }
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int pvs(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = i2;
            return ((double) i) * d < d2 ? (int) (d2 / d) : i;
        }
        double d3 = i2;
        return ((double) i) * d > d3 ? (int) (d3 / d) : i;
    }

    public Bitmap pvs(byte[] bArr) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.Jd == 0 && this.NB == 0) {
            options.inPreferredConfig = this.vG;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int pvs2 = pvs(this.Jd, this.NB, i, i2, this.so);
            int pvs3 = pvs(this.NB, this.Jd, i2, i, this.so);
            options.inJustDecodeBounds = false;
            options.inSampleSize = pvs(i, i2, pvs2, pvs3, this.sUS, this.yiw);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > pvs2 || decodeByteArray.getHeight() > pvs3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, pvs2, pvs3, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 104857600) {
            int width = decodeByteArray.getWidth() / 2;
            int height = decodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeByteArray, width, height, true);
                if (createScaledBitmap2 != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap2;
            }
        }
        return decodeByteArray;
    }

    private void pvs(int i, int i2) {
        if (i > 3840 && i2 > 3840) {
            if (i > i2) {
                this.Jd = 3840;
                this.NB = (i2 * 3840) / i;
                return;
            } else {
                this.Jd = (i * 3840) / i2;
                this.NB = 3840;
                return;
            }
        }
        if (i > 3840) {
            this.Jd = 3840;
            this.NB = (i2 * 3840) / i;
        } else if (i2 > 3840) {
            this.Jd = (i * 3840) / i2;
            this.NB = 3840;
        }
    }
}
