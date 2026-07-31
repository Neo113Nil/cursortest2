package F;

import I.C0089d;
import I.C0113p;

/* loaded from: classes.dex */
public final class Y extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0.I f1162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.l f1164g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1165h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(h0.I i3, String str, U.l lVar, long j3, int i4) {
        super(2);
        this.f1162e = i3;
        this.f1163f = str;
        this.f1164g = lVar;
        this.f1165h = j3;
        this.f1166i = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f1166i | 1);
        String str = this.f1163f;
        AbstractC0029a0.b(this.f1162e, str, this.f1164g, this.f1165h, (C0113p) obj, T2);
        return L1.z.f2729a;
    }
}
