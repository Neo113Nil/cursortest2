package G;

import B0.C;
import I.C0089d;
import I.C0113p;
import L1.z;
import Z1.j;

/* loaded from: classes.dex */
public final class g extends j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f1520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1522h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j3, C c3, Y1.e eVar, int i3) {
        super(2);
        this.f1519e = j3;
        this.f1520f = c3;
        this.f1521g = eVar;
        this.f1522h = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f1522h | 1);
        C c3 = this.f1520f;
        Y1.e eVar = this.f1521g;
        a.a(this.f1519e, c3, eVar, (C0113p) obj, T2);
        return z.f2729a;
    }
}
