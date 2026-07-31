package F;

import I.C0089d;
import I.C0113p;
import h0.C0425f;

/* loaded from: classes.dex */
public final class X extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0425f f1155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.l f1157g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1158h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1159i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1160j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C0425f c0425f, String str, U.l lVar, long j3, int i3, int i4) {
        super(2);
        this.f1155e = c0425f;
        this.f1156f = str;
        this.f1157g = lVar;
        this.f1158h = j3;
        this.f1159i = i3;
        this.f1160j = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T2 = C0089d.T(this.f1159i | 1);
        C0425f c0425f = this.f1155e;
        String str = this.f1156f;
        AbstractC0029a0.a(c0425f, str, this.f1157g, this.f1158h, (C0113p) obj, T2, this.f1160j);
        return L1.z.f2729a;
    }
}
