package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class r14 {

    /* renamed from: a, reason: collision with root package name */
    private final q14 f10976a;

    /* renamed from: b, reason: collision with root package name */
    private int f10977b;

    /* renamed from: c, reason: collision with root package name */
    private long f10978c;

    /* renamed from: d, reason: collision with root package name */
    private long f10979d;

    /* renamed from: e, reason: collision with root package name */
    private long f10980e;

    /* renamed from: f, reason: collision with root package name */
    private long f10981f;

    public r14(AudioTrack audioTrack) {
        if (n13.f8865a >= 19) {
            this.f10976a = new q14(audioTrack);
            e();
        } else {
            this.f10976a = null;
            h(3);
        }
    }

    private final void h(int i7) {
        this.f10977b = i7;
        long j7 = 10000;
        if (i7 == 0) {
            this.f10980e = 0L;
            this.f10981f = -1L;
            this.f10978c = System.nanoTime() / 1000;
        } else {
            if (i7 == 1) {
                this.f10979d = 10000L;
                return;
            }
            j7 = (i7 == 2 || i7 == 3) ? 10000000L : 500000L;
        }
        this.f10979d = j7;
    }

    @TargetApi(19)
    public final long a() {
        q14 q14Var = this.f10976a;
        if (q14Var != null) {
            return q14Var.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public final long b() {
        q14 q14Var = this.f10976a;
        if (q14Var != null) {
            return q14Var.b();
        }
        return -9223372036854775807L;
    }

    public final void c() {
        if (this.f10977b == 4) {
            e();
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        if (this.f10976a != null) {
            h(0);
        }
    }

    public final boolean f() {
        return this.f10977b == 2;
    }

    @TargetApi(19)
    public final boolean g(long j7) {
        q14 q14Var = this.f10976a;
        if (q14Var != null && j7 - this.f10980e >= this.f10979d) {
            this.f10980e = j7;
            boolean c7 = q14Var.c();
            int i7 = this.f10977b;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3 && c7) {
                            e();
                            return true;
                        }
                    } else if (!c7) {
                        e();
                        return false;
                    }
                } else if (!c7) {
                    e();
                } else if (this.f10976a.a() > this.f10981f) {
                    h(2);
                    return true;
                }
            } else {
                if (c7) {
                    if (this.f10976a.b() < this.f10978c) {
                        return false;
                    }
                    this.f10981f = this.f10976a.a();
                    h(1);
                    return true;
                }
                if (j7 - this.f10978c > 500000) {
                    h(3);
                }
            }
            return c7;
        }
        return false;
    }
}
