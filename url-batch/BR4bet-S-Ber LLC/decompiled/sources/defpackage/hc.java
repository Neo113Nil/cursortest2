package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc implements ho {
    public final /* synthetic */ int f;

    public /* synthetic */ hc(int i) {
        this.f = i;
    }

    @Override // defpackage.ho
    public final Object f(Object obj, Object obj2) {
        ic icVar;
        Object obj3;
        switch (this.f) {
            case 0:
                String str = (String) obj;
                we weVar = (we) obj2;
                str.getClass();
                if (str.length() == 0) {
                    return weVar.toString();
                }
                return str + ", " + weVar;
            case 1:
                ye yeVar = (ye) obj;
                we weVar2 = (we) obj2;
                yeVar.getClass();
                ye k = yeVar.k(weVar2.getKey());
                gk gkVar = gk.f;
                if (k == gkVar) {
                    return weVar2;
                }
                ej ejVar = ej.h;
                bf bfVar = (bf) k.h(ejVar);
                if (bfVar == null) {
                    icVar = new ic(weVar2, k);
                } else {
                    ye k2 = k.k(ejVar);
                    if (k2 == gkVar) {
                        return new ic(bfVar, weVar2);
                    }
                    icVar = new ic(bfVar, new ic(weVar2, k2));
                }
                return icVar;
            case 2:
                return ((ye) obj).g((we) obj2);
            case 3:
                return ((ye) obj).g((we) obj2);
            case 4:
                obj3 = (Boolean) obj;
                obj3.getClass();
                break;
            case 5:
                return obj;
            case 6:
                if (obj == null) {
                    return null;
                }
                g9.b();
                return null;
            default:
                obj3 = (c90) obj;
                break;
        }
        return obj3;
    }
}
