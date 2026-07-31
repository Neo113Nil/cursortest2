package c;

import Z.r;
import b.C0242b;
import b.w;

/* loaded from: classes.dex */
public final class f extends w {

    /* renamed from: d, reason: collision with root package name */
    public p2.c f4331d;

    /* renamed from: e, reason: collision with root package name */
    public Y1.e f4332e;

    /* renamed from: f, reason: collision with root package name */
    public r f4333f;

    @Override // b.w
    public final void a() {
        r rVar = this.f4333f;
        if (rVar != null) {
            rVar.c();
        }
        r rVar2 = this.f4333f;
        if (rVar2 == null) {
            return;
        }
        rVar2.f3453a = false;
    }

    @Override // b.w
    public final void b() {
        r rVar = this.f4333f;
        if (rVar != null && !rVar.f3453a) {
            rVar.c();
            this.f4333f = null;
        }
        if (this.f4333f == null) {
            this.f4333f = new r(this.f4331d, false, this.f4332e, this);
        }
        r rVar2 = this.f4333f;
        if (rVar2 != null) {
            ((m2.e) rVar2.f3454b).k(null, false);
        }
        r rVar3 = this.f4333f;
        if (rVar3 == null) {
            return;
        }
        rVar3.f3453a = false;
    }

    @Override // b.w
    public final void c(C0242b c0242b) {
        super.c(c0242b);
        r rVar = this.f4333f;
        if (rVar != null) {
            ((m2.e) rVar.f3454b).g(c0242b);
        }
    }

    @Override // b.w
    public final void d(C0242b c0242b) {
        super.d(c0242b);
        r rVar = this.f4333f;
        if (rVar != null) {
            rVar.c();
        }
        if (this.f4200a) {
            this.f4333f = new r(this.f4331d, true, this.f4332e, this);
        }
    }
}
