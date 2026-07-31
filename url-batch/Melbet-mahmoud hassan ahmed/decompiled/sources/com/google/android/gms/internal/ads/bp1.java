package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bp1 {

    /* renamed from: a, reason: collision with root package name */
    private final a3.u0 f3486a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.d f3487b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3488c;

    public bp1(a3.u0 u0Var, v3.d dVar, Executor executor) {
        this.f3486a = u0Var;
        this.f3487b = dVar;
        this.f3488c = executor;
    }

    static /* bridge */ /* synthetic */ Bitmap a(bp1 bp1Var, byte[] bArr, double d7, boolean z6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d7 * 160.0d);
        if (!z6) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) sw.c().b(m10.B4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            bp1Var.c(bArr, options);
            options.inJustDecodeBounds = false;
            int i7 = options.outWidth * options.outHeight;
            if (i7 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i7 - 1) / ((Integer) sw.c().b(m10.C4)).intValue())) / 2);
            }
        }
        return bp1Var.c(bArr, options);
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long a7 = this.f3487b.a();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long a8 = this.f3487b.a();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j7 = a8 - a7;
            boolean z6 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j7);
            sb.append(" on ui thread: ");
            sb.append(z6);
            a3.r1.k(sb.toString());
        }
        return decodeByteArray;
    }

    public final cc3<Bitmap> b(String str, double d7, boolean z6) {
        return rb3.m(this.f3486a.a(str), new ap1(this, d7, z6), this.f3488c);
    }
}
