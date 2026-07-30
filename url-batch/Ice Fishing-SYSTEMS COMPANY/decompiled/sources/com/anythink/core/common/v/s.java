package com.anythink.core.common.v;

import android.os.CountDownTimer;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17036a = "CountDownTimerExt";

    /* renamed from: b, reason: collision with root package name */
    private CountDownTimer f17037b;

    /* renamed from: c, reason: collision with root package name */
    private long f17038c = 500;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17039d = true;

    /* renamed from: e, reason: collision with root package name */
    private long f17040e;

    /* renamed from: f, reason: collision with root package name */
    private long f17041f;

    public s(long j9) {
        this.f17040e = j9;
        this.f17041f = j9;
    }

    private void a(boolean z8) {
        this.f17039d = z8;
    }

    private void c(long j9) {
        this.f17040e = j9;
    }

    private boolean f() {
        return this.f17039d;
    }

    private long g() {
        return this.f17040e;
    }

    private long h() {
        return this.f17041f;
    }

    private boolean i() {
        return !this.f17039d;
    }

    public abstract void a();

    public abstract void a(long j9);

    public final void b(long j9) {
        this.f17041f = j9;
    }

    public final void d() {
        if (this.f17039d) {
            return;
        }
        try {
            this.f17037b.cancel();
        } catch (Throwable unused) {
        }
        this.f17039d = true;
    }

    public final void e() {
        if (this.f17039d) {
            a(this.f17041f, this.f17038c);
        }
    }

    private void a(long j9, long j10, long j11) {
        this.f17040e = j9;
        this.f17041f = j10;
        this.f17038c = j11;
        b();
    }

    public final void b() {
        a(this.f17041f, this.f17038c);
    }

    public final void c() {
        try {
            this.f17037b.cancel();
        } catch (Throwable unused) {
        }
        this.f17039d = true;
        this.f17041f = this.f17040e;
    }

    private synchronized void a(long j9, long j10) {
        Throwable th;
        try {
            try {
                this.f17041f = j9;
                this.f17038c = j10;
                if (this.f17040e > 0 && j10 > 0) {
                    if (!this.f17039d) {
                        try {
                            c();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    if (this.f17039d) {
                        CountDownTimer countDownTimer = new CountDownTimer(this.f17041f, this.f17038c) { // from class: com.anythink.core.common.v.s.1
                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                s.this.a();
                                s.this.c();
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j11) {
                                s.this.b(j11);
                                s.this.a(j11);
                            }
                        };
                        this.f17037b = countDownTimer;
                        try {
                            countDownTimer.start();
                        } catch (Throwable unused) {
                        }
                        this.f17039d = false;
                        return;
                    }
                    Log.d(f17036a, "ignore start");
                    return;
                }
                Log.d(f17036a, "invalid parameter");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
