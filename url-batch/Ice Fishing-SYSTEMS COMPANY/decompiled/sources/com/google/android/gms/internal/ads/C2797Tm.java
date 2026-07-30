package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2797Tm {

    /* renamed from: a, reason: collision with root package name */
    public final t2.s f27824a;

    /* renamed from: b, reason: collision with root package name */
    public final S2.a f27825b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f27826c;

    public C2797Tm(t2.s sVar, S2.a aVar, SD sd) {
        this.f27824a = sVar;
        this.f27825b = aVar;
        this.f27826c = sd;
    }

    public final Bitmap a(byte[] bArr, double d2, boolean z8) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z8) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        C3151ea c3151ea = AbstractC3368ia.f31621a7;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            options.inJustDecodeBounds = true;
            b(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) rVar.f40119c.a(AbstractC3368ia.f31631b7)).intValue())) / 2);
            }
        }
        return b(bArr, options);
    }

    public final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        this.f27825b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j9 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z8 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z8).length());
            AbstractC5051n.i(sb, "Decoded image w: ", width, " h:", height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j9);
            sb.append(" on ui thread: ");
            sb.append(z8);
            t2.C.k(sb.toString());
        }
        return decodeByteArray;
    }
}
