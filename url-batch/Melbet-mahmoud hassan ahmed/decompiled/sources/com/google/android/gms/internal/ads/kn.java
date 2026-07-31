package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes.dex */
public final class kn {

    /* renamed from: a, reason: collision with root package name */
    private final jn f7542a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7543b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7544c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7545d;

    /* renamed from: e, reason: collision with root package name */
    private long f7546e;

    /* renamed from: f, reason: collision with root package name */
    private long f7547f;

    /* renamed from: g, reason: collision with root package name */
    private long f7548g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7549h;

    /* renamed from: i, reason: collision with root package name */
    private long f7550i;

    /* renamed from: j, reason: collision with root package name */
    private long f7551j;

    /* renamed from: k, reason: collision with root package name */
    private long f7552k;

    private kn(double d7) {
        long j7;
        boolean z6 = d7 != -1.0d;
        this.f7543b = z6;
        if (z6) {
            this.f7542a = jn.a();
            long j8 = (long) (1.0E9d / d7);
            this.f7544c = j8;
            j7 = (j8 * 80) / 100;
        } else {
            this.f7542a = null;
            j7 = -1;
            this.f7544c = -1L;
        }
        this.f7545d = j7;
    }

    public kn(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private final boolean d(long j7, long j8) {
        return Math.abs((j8 - this.f7550i) - (j7 - this.f7551j)) > 20000000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (d(r0, r14) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j7, long j8) {
        long j9;
        long j10;
        jn jnVar;
        long j11;
        long j12 = 1000 * j7;
        if (this.f7549h) {
            if (j7 != this.f7546e) {
                this.f7552k++;
                this.f7547f = this.f7548g;
            }
            long j13 = this.f7552k;
            if (j13 >= 6) {
                j10 = this.f7547f + ((j12 - this.f7551j) / j13);
                if (!d(j10, j8)) {
                    j9 = (this.f7550i + j10) - this.f7551j;
                    if (!this.f7549h) {
                        this.f7551j = j12;
                        this.f7550i = j8;
                        this.f7552k = 0L;
                        this.f7549h = true;
                    }
                    this.f7546e = j7;
                    this.f7548g = j10;
                    jnVar = this.f7542a;
                    if (jnVar != null || jnVar.f7185f == 0) {
                        return j9;
                    }
                    long j14 = this.f7542a.f7185f;
                    long j15 = this.f7544c;
                    long j16 = j14 + (((j9 - j14) / j15) * j15);
                    if (j9 <= j16) {
                        j11 = j16 - j15;
                    } else {
                        j16 = j15 + j16;
                        j11 = j16;
                    }
                    if (j16 - j9 >= j9 - j11) {
                        j16 = j11;
                    }
                    return j16 - this.f7545d;
                }
            }
            this.f7549h = false;
        }
        j9 = j8;
        j10 = j12;
        if (!this.f7549h) {
        }
        this.f7546e = j7;
        this.f7548g = j10;
        jnVar = this.f7542a;
        if (jnVar != null) {
        }
        return j9;
    }

    public final void b() {
        if (this.f7543b) {
            this.f7542a.c();
        }
    }

    public final void c() {
        this.f7549h = false;
        if (this.f7543b) {
            this.f7542a.b();
        }
    }
}
