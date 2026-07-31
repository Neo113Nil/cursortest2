package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class G0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f1158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1161h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.X f1162i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f1163j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1164k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(U.q qVar, long j3, long j4, float f3, r.X x3, Q.a aVar, int i3) {
        super(2);
        this.f1158e = qVar;
        this.f1159f = j3;
        this.f1160g = j4;
        this.f1161h = f3;
        this.f1162i = x3;
        this.f1163j = aVar;
        this.f1164k = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1164k | 1);
        Q.a aVar = this.f1163j;
        long j3 = this.f1160g;
        float f3 = this.f1161h;
        O0.a(this.f1158e, this.f1159f, j3, f3, this.f1162i, aVar, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
