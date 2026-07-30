package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2117h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, int i7) {
        super(1);
        this.f2116g = i7;
        this.f2117h = str;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f2116g;
        d6.z zVar = d6.z.f2639a;
        String str = this.f2117h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x6.e[] eVarArr = y1.r.f9886a;
                y1.s sVar = y1.p.f9862d;
                x6.e eVar = y1.r.f9886a[2];
                sVar.a((y1.i) obj, str);
                break;
            case 1:
                y1.i iVar = (y1.i) obj;
                x6.e[] eVarArr2 = y1.r.f9886a;
                iVar.m(y1.p.f9859a, t6.a.F(str));
                y1.r.d(iVar, 5);
                break;
            default:
                x6.e[] eVarArr3 = y1.r.f9886a;
                ((y1.i) obj).m(y1.p.f9859a, t6.a.F(str));
                break;
        }
        return zVar;
    }
}
