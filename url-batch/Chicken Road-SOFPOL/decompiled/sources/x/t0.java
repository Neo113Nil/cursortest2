package x;

import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8294d;

    public /* synthetic */ t0(int i) {
        this.f8294d = i;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f8294d) {
            case 0:
                return new x();
            case 1:
                u2 u2Var = x0.c.f8318a;
                return null;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                u2 u2Var2 = x0.e.f8320a;
                return null;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            default:
                return new z.p(0, 0);
        }
    }
}
