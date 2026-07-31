package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pa4 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f10157c;

    /* renamed from: e, reason: collision with root package name */
    private int f10159e;

    /* renamed from: a, reason: collision with root package name */
    private oa4 f10155a = new oa4();

    /* renamed from: b, reason: collision with root package name */
    private oa4 f10156b = new oa4();

    /* renamed from: d, reason: collision with root package name */
    private long f10158d = -9223372036854775807L;

    public final float a() {
        if (!this.f10155a.f()) {
            return -1.0f;
        }
        double a7 = this.f10155a.a();
        Double.isNaN(a7);
        return (float) (1.0E9d / a7);
    }

    public final int b() {
        return this.f10159e;
    }

    public final long c() {
        if (this.f10155a.f()) {
            return this.f10155a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f10155a.f()) {
            return this.f10155a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j7) {
        this.f10155a.c(j7);
        if (this.f10155a.f()) {
            this.f10157c = false;
        } else if (this.f10158d != -9223372036854775807L) {
            if (!this.f10157c || this.f10156b.e()) {
                this.f10156b.d();
                this.f10156b.c(this.f10158d);
            }
            this.f10157c = true;
            this.f10156b.c(j7);
        }
        if (this.f10157c && this.f10156b.f()) {
            oa4 oa4Var = this.f10155a;
            this.f10155a = this.f10156b;
            this.f10156b = oa4Var;
            this.f10157c = false;
        }
        this.f10158d = j7;
        this.f10159e = this.f10155a.f() ? 0 : this.f10159e + 1;
    }

    public final void f() {
        this.f10155a.d();
        this.f10156b.d();
        this.f10157c = false;
        this.f10158d = -9223372036854775807L;
        this.f10159e = 0;
    }

    public final boolean g() {
        return this.f10155a.f();
    }
}
