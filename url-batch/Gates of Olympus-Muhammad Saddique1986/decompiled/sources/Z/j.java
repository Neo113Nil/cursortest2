package Z;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class j extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i3, int i4) {
        super(1);
        this.f4684e = i4;
        this.f4685f = i3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4684e) {
            case 0:
                Boolean C = d.C((t) obj, this.f4685f);
                return Boolean.valueOf(C != null ? C.booleanValue() : false);
            default:
                Boolean C3 = d.C((t) obj, this.f4685f);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : false);
        }
    }
}
