package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o40 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 1;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(fz2 fz2Var, Map map, so2 so2Var, ez ezVar, o30 o30Var) {
        super(2, o30Var);
        this.n = fz2Var;
        this.o = map;
        this.p = so2Var;
        this.q = ezVar;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                o40 o40Var = new o40((x22) obj4, (bu2) obj3, (gv2) obj2, o30Var);
                o40Var.n = obj;
                return o40Var;
            default:
                return new o40((fz2) this.n, (Map) obj4, (so2) obj3, (ez) obj2, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((o40) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                a50 a50Var = (a50) this.n;
                d50 d50Var = d50.m;
                x22 x22Var = (x22) obj4;
                o30 o30Var = null;
                z71.H(a50Var, null, new n40(x22Var, (bu2) obj3, o30Var, 0), 1);
                z71.H(a50Var, null, new v(x22Var, (gv2) obj2, o30Var, 17), 1);
                break;
            default:
                Map map = (Map) obj4;
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                fz2 fz2Var = (fz2) this.n;
                Object j = fz2Var.a.j();
                lz1 lz1Var = fz2Var.d;
                if (Intrinsics.b(j, lz1Var.getValue())) {
                    ez ezVar = (ez) obj2;
                    Iterator it = ((List) ((so2) obj3).getValue()).iterator();
                    while (it.hasNext()) {
                        ezVar.b().b((cp1) it.next());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!Intrinsics.b(entry.getKey(), ((cp1) lz1Var.getValue()).r)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        map.remove(((Map.Entry) it2.next()).getKey());
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(x22 x22Var, bu2 bu2Var, gv2 gv2Var, o30 o30Var) {
        super(2, o30Var);
        this.o = x22Var;
        this.p = bu2Var;
        this.q = gv2Var;
    }
}
