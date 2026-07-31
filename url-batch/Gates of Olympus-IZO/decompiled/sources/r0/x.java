package r0;

import u0.C0997t;

/* loaded from: classes.dex */
public final class x extends G {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7192b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7193c;

    public /* synthetic */ x(int i3, Object obj) {
        this.f7192b = i3;
        this.f7193c = obj;
    }

    @Override // r0.G
    public final M0.j b() {
        switch (this.f7192b) {
            case 0:
                return ((t0.O) this.f7193c).getLayoutDirection();
            default:
                return ((C0997t) this.f7193c).getLayoutDirection();
        }
    }

    @Override // r0.G
    public final int c() {
        switch (this.f7192b) {
            case 0:
                return ((t0.O) this.f7193c).N();
            default:
                return ((C0997t) this.f7193c).getRoot().f7736y.f7813r.f7114d;
        }
    }
}
