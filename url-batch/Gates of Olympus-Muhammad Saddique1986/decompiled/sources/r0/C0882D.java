package r0;

import u0.C1123s;

/* renamed from: r0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882D extends AbstractC0892N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8116b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8117c;

    public /* synthetic */ C0882D(int i3, Object obj) {
        this.f8116b = i3;
        this.f8117c = obj;
    }

    @Override // r0.AbstractC0892N
    public final O0.k b() {
        switch (this.f8116b) {
            case 0:
                return ((t0.P) this.f8117c).getLayoutDirection();
            default:
                return ((C1123s) this.f8117c).getLayoutDirection();
        }
    }

    @Override // r0.AbstractC0892N
    public final int c() {
        switch (this.f8116b) {
            case 0:
                return ((t0.P) this.f8117c).c0();
            default:
                return ((C1123s) this.f8117c).getRoot().f8562z.f8642r.f8126d;
        }
    }
}
