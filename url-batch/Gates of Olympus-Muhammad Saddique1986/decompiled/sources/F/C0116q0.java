package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import h0.C0463f;

/* renamed from: F.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116q0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0463f f1743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.q f1745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1747i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1748j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116q0(C0463f c0463f, String str, U.q qVar, long j3, int i3, int i4) {
        super(2);
        this.f1743e = c0463f;
        this.f1744f = str;
        this.f1745g = qVar;
        this.f1746h = j3;
        this.f1747i = i3;
        this.f1748j = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1747i | 1);
        C0463f c0463f = this.f1743e;
        String str = this.f1744f;
        AbstractC0119s0.a(c0463f, str, this.f1745g, this.f1746h, (C0167p) obj, U3, this.f1748j);
        return R1.y.f4171a;
    }
}
