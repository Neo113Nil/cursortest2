package u0;

import e2.InterfaceC0424c;

/* renamed from: u0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114n extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z.b f9408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1114n(Z.b bVar, int i3) {
        super(1);
        this.f9407e = i3;
        this.f9408f = bVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f9407e) {
            case 0:
                Boolean C = Z.d.C((Z.t) obj, this.f9408f.f4666a);
                return Boolean.valueOf(C != null ? C.booleanValue() : true);
            default:
                Boolean C3 = Z.d.C((Z.t) obj, this.f9408f.f4666a);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : true);
        }
    }
}
