package x;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188a extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f10050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188a(U.q qVar, int i3, int i4) {
        super(2);
        this.f10050e = qVar;
        this.f10051f = i3;
        this.f10052g = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f10051f | 1);
        int i3 = this.f10052g;
        AbstractC1191d.b(this.f10050e, (C0167p) obj, U3, i3);
        return R1.y.f4171a;
    }
}
