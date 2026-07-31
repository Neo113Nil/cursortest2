package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import h0.C0456I;

/* renamed from: F.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117r0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0456I f1760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.q f1762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117r0(C0456I c0456i, String str, U.q qVar, long j3, int i3) {
        super(2);
        this.f1760e = c0456i;
        this.f1761f = str;
        this.f1762g = qVar;
        this.f1763h = j3;
        this.f1764i = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC0119s0.b(this.f1760e, this.f1761f, this.f1762g, this.f1763h, (C0167p) obj, C0143d.U(this.f1764i | 1));
        return R1.y.f4171a;
    }
}
