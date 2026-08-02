package V0;

import java.util.List;
import s0.C1406b;

/* loaded from: classes.dex */
public final class c extends Z.g implements d {

    /* renamed from: e, reason: collision with root package name */
    public d f3189e;

    /* renamed from: f, reason: collision with root package name */
    public long f3190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3191g = 1;

    /* renamed from: h, reason: collision with root package name */
    public Object f3192h;

    public /* synthetic */ c() {
    }

    @Override // V0.d
    public final int b(long j4) {
        d dVar = this.f3189e;
        dVar.getClass();
        return dVar.b(j4 - this.f3190f);
    }

    @Override // V0.d
    public final long c(int i4) {
        d dVar = this.f3189e;
        dVar.getClass();
        return dVar.c(i4) + this.f3190f;
    }

    @Override // V0.d
    public final List e(long j4) {
        d dVar = this.f3189e;
        dVar.getClass();
        return dVar.e(j4 - this.f3190f);
    }

    @Override // V0.d
    public final int f() {
        d dVar = this.f3189e;
        dVar.getClass();
        return dVar.f();
    }

    @Override // Z.g
    public final void h() {
        this.f3496b = 0;
        this.f3786c = 0L;
        this.f3787d = false;
        this.f3189e = null;
    }

    @Override // Z.g
    public final void i() {
        switch (this.f3191g) {
            case 0:
                ((C1406b) this.f3192h).m(this);
                break;
            default:
                W0.h hVar = (W0.h) ((D0.a) this.f3192h).f331b;
                hVar.getClass();
                h();
                hVar.f3455b.add(this);
                break;
        }
    }

    public c(C1406b c1406b) {
        this.f3192h = c1406b;
    }
}
