package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements xr {
    public final /* synthetic */ int f;

    public /* synthetic */ gd(int i) {
        this.f = i;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        hd hdVar;
        switch (this.f) {
            case 0:
                String str = (String) obj;
                og ogVar = (og) obj2;
                str.getClass();
                ogVar.getClass();
                if (str.length() == 0) {
                    return ogVar.toString();
                }
                return str + ", " + ogVar;
            case 1:
                qg qgVar = (qg) obj;
                og ogVar2 = (og) obj2;
                qgVar.getClass();
                ogVar2.getClass();
                qg D = qgVar.D(ogVar2.getKey());
                um umVar = um.f;
                if (D == umVar) {
                    return ogVar2;
                }
                sl slVar = sl.g;
                tg tgVar = (tg) D.w(slVar);
                if (tgVar == null) {
                    hdVar = new hd(ogVar2, D);
                } else {
                    qg D2 = D.D(slVar);
                    if (D2 == umVar) {
                        return new hd(tgVar, ogVar2);
                    }
                    hdVar = new hd(tgVar, new hd(ogVar2, D2));
                }
                return hdVar;
            case 2:
                return ((qg) obj).r((og) obj2);
            case 3:
                return ((qg) obj).r((og) obj2);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                og ogVar3 = (og) obj2;
                if (!(ogVar3 instanceof zh0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? ogVar3 : Integer.valueOf(intValue + 1);
            case 6:
                zh0 zh0Var = (zh0) obj;
                og ogVar4 = (og) obj2;
                if (zh0Var != null) {
                    return zh0Var;
                }
                if (ogVar4 instanceof zh0) {
                    return (zh0) ogVar4;
                }
                return null;
            default:
                di0 di0Var = (di0) obj;
                og ogVar5 = (og) obj2;
                if (ogVar5 instanceof zh0) {
                    zh0 zh0Var2 = (zh0) ogVar5;
                    qg qgVar2 = di0Var.a;
                    ThreadLocal threadLocal = zh0Var2.g;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(zh0Var2.f);
                    Object[] objArr = di0Var.b;
                    int i = di0Var.d;
                    objArr[i] = obj3;
                    zh0[] zh0VarArr = di0Var.c;
                    di0Var.d = i + 1;
                    zh0VarArr[i] = zh0Var2;
                }
                return di0Var;
        }
    }
}
