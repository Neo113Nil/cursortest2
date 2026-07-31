package F;

import I.C0089d;
import I.C0113p;

/* renamed from: F.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045i0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.l f1262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.U f1266i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f1267j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1268k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045i0(U.l lVar, long j3, long j4, float f3, r.U u3, Q.a aVar, int i3) {
        super(2);
        this.f1262e = lVar;
        this.f1263f = j3;
        this.f1264g = j4;
        this.f1265h = f3;
        this.f1266i = u3;
        this.f1267j = aVar;
        this.f1268k = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f1268k | 1);
        Q.a aVar = this.f1267j;
        long j3 = this.f1264g;
        float f3 = this.f1265h;
        AbstractC0062r0.a(this.f1262e, this.f1263f, j3, f3, this.f1266i, aVar, (C0113p) obj, T2);
        return L1.z.f2729a;
    }
}
