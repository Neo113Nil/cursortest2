package h6;

import com.android.installreferrer.api.InstallReferrerClient;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final b f4655h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f4656i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4657g;

    static {
        int i7 = 2;
        f4655h = new b(i7, 0);
        f4656i = new b(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f4657g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f4657g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                g gVar = (g) obj2;
                r6.k.f(str, "acc");
                r6.k.f(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                r6.k.f(iVar, "acc");
                r6.k.f(gVar2, "element");
                i F = iVar.F(gVar2.getKey());
                j jVar = j.f4661f;
                if (F == jVar) {
                    return gVar2;
                }
                e eVar = e.f4660f;
                f fVar = (f) F.u(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, F);
                } else {
                    i F2 = F.F(eVar);
                    if (F2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, F2));
                }
                return cVar;
        }
    }
}
