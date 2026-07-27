package p0;

import s0.C1166s;

/* renamed from: p0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942C extends AbstractC0953N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8994b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8995c;

    public /* synthetic */ C0942C(int i2, Object obj) {
        this.f8994b = i2;
        this.f8995c = obj;
    }

    @Override // p0.AbstractC0953N
    public final M0.k b() {
        switch (this.f8994b) {
            case 0:
                return ((r0.O) this.f8995c).getLayoutDirection();
            default:
                return ((C1166s) this.f8995c).getLayoutDirection();
        }
    }

    @Override // p0.AbstractC0953N
    public final int c() {
        switch (this.f8994b) {
            case 0:
                return ((r0.O) this.f8995c).g0();
            default:
                return ((C1166s) this.f8995c).getRoot().f9584C.f9691r.f9005d;
        }
    }
}
