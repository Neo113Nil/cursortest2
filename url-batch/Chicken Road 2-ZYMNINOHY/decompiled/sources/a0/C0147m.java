package a0;

import q0.InterfaceC1352A;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0147m implements u2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4193b;

    public /* synthetic */ C0147m(int i4, Object obj) {
        this.f4192a = i4;
        this.f4193b = obj;
    }

    @Override // u2.m
    public final Object get() {
        switch (this.f4192a) {
            case 0:
                return (t0.r) this.f4193b;
            case 1:
                return (InterfaceC1352A) this.f4193b;
            default:
                try {
                    return (InterfaceC1352A) ((Class) this.f4193b).getConstructor(null).newInstance(null);
                } catch (Exception e4) {
                    throw new IllegalStateException(e4);
                }
        }
    }
}
