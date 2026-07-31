package com.bytedance.sdk.component.btk.fs.zn.fs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.btk.fs.zn.hhw;

/* loaded from: classes15.dex */
public class fs {
    private int btk;
    private int fb;
    private final int hhw;
    private final int nps;
    private final ImageView.ScaleType zg;
    private final Bitmap.Config zn;
    public static final ImageView.ScaleType zmn = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config fs = Bitmap.Config.ARGB_4444;
    private final int bvs = 1280;
    private final int iv = 83886080;

    private static int zmn(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    public fs(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.zn = config;
        this.fb = i;
        this.btk = i2;
        this.zg = scaleType;
        this.hhw = i3;
        this.nps = i4;
        zmn(i, i2);
    }

    static int zmn(int i, int i2, int i3, int i4, int i5, int i6) {
        double min = Math.min(i / i3, i2 / i4);
        if (i5 > 0 && i6 > 0) {
            min = Math.max(min, Math.min(Math.max(i, i2) / Math.max(i5, i6), Math.min(i, i2) / Math.min(i5, i6)));
        }
        return Integer.highestOneBit((int) min);
    }

    private float zmn(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        return Math.max(i4 / (i2 / f), i5 / (i3 / f));
    }

    public Bitmap zmn(byte[] bArr, hhw hhwVar) {
        Context context;
        boolean z;
        Bitmap decodeByteArray;
        if (hhwVar != null) {
            context = hhwVar.zmn();
            z = hhwVar.fs();
        } else {
            context = null;
            z = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.fb == 0 && this.btk == 0) {
            options.inPreferredConfig = this.zn;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int zmn2 = zmn(this.fb, this.btk, i, i2);
            int zmn3 = zmn(this.btk, this.fb, i2, i);
            options.inJustDecodeBounds = false;
            int zmn4 = zmn(i, i2, zmn2, zmn3, this.hhw, this.nps);
            options.inSampleSize = zmn4;
            float zmn5 = zmn(zmn4, i, i2, zmn2, zmn3);
            boolean z2 = zmn5 > 0.0f && zmn5 < 1.0f && context != null && z;
            if (z2) {
                options.inScaled = true;
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = Math.round(zmn5 * 2.1474836E9f);
            }
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z2 && decodeByteArray != null) {
                decodeByteArray.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            }
            if (decodeByteArray != null && (decodeByteArray.getWidth() > zmn2 || decodeByteArray.getHeight() > zmn3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, zmn2, zmn3, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 83886080) {
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

    private void zmn(int i, int i2) {
        if (i > 1280 && i2 > 1280) {
            if (i > i2) {
                this.fb = 1280;
                this.btk = (i2 * 1280) / i;
                return;
            } else {
                this.fb = (i * 1280) / i2;
                this.btk = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.fb = 1280;
            this.btk = (i2 * 1280) / i;
        } else if (i2 > 1280) {
            this.fb = (i * 1280) / i2;
            this.btk = 1280;
        }
    }
}
