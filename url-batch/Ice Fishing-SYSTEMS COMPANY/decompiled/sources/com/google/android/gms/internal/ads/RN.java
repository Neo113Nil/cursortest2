package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class RN extends Exception {

    /* renamed from: A, reason: collision with root package name */
    public final BQ f27348A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f27349B;

    /* renamed from: n, reason: collision with root package name */
    public final int f27350n;

    /* renamed from: u, reason: collision with root package name */
    public final long f27351u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27352v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27353w;

    /* renamed from: x, reason: collision with root package name */
    public final int f27354x;

    /* renamed from: y, reason: collision with root package name */
    public final TP f27355y;

    /* renamed from: z, reason: collision with root package name */
    public final int f27356z;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public RN(int i, Exception exc, int i4) {
        this(i, exc, i4, null, -1, null, 4, null, false);
    }

    public final RN a(BQ bq) {
        String message = getMessage();
        String str = AbstractC3548lu.f32613a;
        return new RN(message, getCause(), this.f27350n, this.f27352v, this.f27353w, this.f27354x, this.f27355y, this.f27356z, bq, this.f27351u, this.f27349B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RN(int i, Exception exc, int i4, String str, int i9, TP tp, int i10, BQ bq, boolean z8) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), exc, i4, i, r5, r6, tp, i10, bq, SystemClock.elapsedRealtime(), z8);
        String str2;
        int i11;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i11 = i9;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
            str2 = str;
            i11 = i9;
        } else {
            String valueOf = String.valueOf(tp);
            String str5 = AbstractC3548lu.f32613a;
            if (i10 == 0) {
                str4 = "NO";
            } else if (i10 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i10 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + valueOf.length() + AbstractC5051n.a(String.valueOf(str).length() + 14, 9, String.valueOf(i9)) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i11 = i9;
            sb.append(i11);
            sb.append(", format=");
            str3 = D.y.o(sb, valueOf, ", format_supported=", str4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RN(String str, Throwable th, int i, int i4, String str2, int i9, TP tp, int i10, BQ bq, long j9, boolean z8) {
        super(str, th);
        boolean z9;
        Bundle bundle = Bundle.EMPTY;
        this.f27350n = i;
        this.f27351u = j9;
        if (!z8) {
            z9 = true;
        } else if (i4 == 1) {
            i4 = 1;
            z9 = true;
        } else {
            z9 = false;
        }
        PA.n(z9);
        PA.n(th != null);
        this.f27352v = i4;
        this.f27353w = str2;
        this.f27354x = i9;
        this.f27355y = tp;
        this.f27356z = i10;
        this.f27348A = bq;
        this.f27349B = z8;
    }
}
