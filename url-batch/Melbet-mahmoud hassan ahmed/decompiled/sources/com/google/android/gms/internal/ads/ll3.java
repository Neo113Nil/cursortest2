package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ll3 extends c10 {

    /* renamed from: p, reason: collision with root package name */
    public static final my3<ll3> f8008p = new my3() { // from class: com.google.android.gms.internal.ads.kk3
    };

    /* renamed from: i, reason: collision with root package name */
    public final int f8009i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8010j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8011k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f8012l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8013m;

    /* renamed from: n, reason: collision with root package name */
    public final gv f8014n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f8015o;

    private ll3(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ll3(int i7, Throwable th, String str, int i8, String str2, int i9, c0 c0Var, int i10, boolean z6) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i8, i7, str2, i9, c0Var, i10, null, SystemClock.elapsedRealtime(), z6);
        String str3;
        if (i7 == 0) {
            str3 = "Source error";
        } else if (i7 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(c0Var);
            String e7 = nz3.e(i10);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53 + valueOf.length() + e7.length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i9);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(e7);
            str3 = sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ll3(String str, Throwable th, int i7, int i8, String str2, int i9, c0 c0Var, int i10, gv gvVar, long j7, boolean z6) {
        super(str, th, i7, j7);
        boolean z7;
        int i11 = i8;
        if (z6) {
            if (i11 != 1) {
                z7 = false;
                wu1.d(z7);
                wu1.d(th != null);
                this.f8009i = i11;
                this.f8010j = str2;
                this.f8011k = i9;
                this.f8012l = c0Var;
                this.f8013m = i10;
                this.f8014n = gvVar;
                this.f8015o = z6;
            }
            i11 = 1;
        }
        z7 = true;
        wu1.d(z7);
        wu1.d(th != null);
        this.f8009i = i11;
        this.f8010j = str2;
        this.f8011k = i9;
        this.f8012l = c0Var;
        this.f8013m = i10;
        this.f8014n = gvVar;
        this.f8015o = z6;
    }

    public static ll3 b(Throwable th, String str, int i7, c0 c0Var, int i8, boolean z6, int i9) {
        return new ll3(1, th, null, i9, str, i7, c0Var, c0Var == null ? 4 : i8, z6);
    }

    public static ll3 c(IOException iOException, int i7) {
        return new ll3(0, iOException, i7);
    }

    public static ll3 d(RuntimeException runtimeException, int i7) {
        return new ll3(2, runtimeException, i7);
    }

    final ll3 a(gv gvVar) {
        String message = getMessage();
        int i7 = n13.f8865a;
        return new ll3(message, getCause(), this.f3691f, this.f8009i, this.f8010j, this.f8011k, this.f8012l, this.f8013m, gvVar, this.f3692g, this.f8015o);
    }
}
