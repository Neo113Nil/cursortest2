package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j72 extends yg1 {
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(dj3 dj3Var) {
        super(20);
        this.h = dj3Var;
    }

    @Override // defpackage.yg1
    public Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.g) {
            case 1:
                String str = (String) obj;
                ll3.s(str);
                dj3 dj3Var = (dj3) this.h;
                dj3Var.x();
                ll3.s(str);
                tc3 tc3Var = dj3Var.n.o;
                oq3.U(tc3Var);
                t13 C0 = tc3Var.C0(str);
                if (C0 == null) {
                    return null;
                }
                vh3 vh3Var = ((pj3) dj3Var.m).r;
                pj3.m(vh3Var);
                vh3Var.z.c(str, "Populate EES config from database on cache miss. appId");
                dj3Var.E(str, dj3Var.F(str, (byte[]) C0.o));
                j72 j72Var = dj3Var.v;
                synchronized (j72Var.c) {
                    Set entrySet = j72Var.b.a.entrySet();
                    entrySet.getClass();
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = j72Var.b.a.entrySet();
                    entrySet2.getClass();
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (xd3) linkedHashMap.get(str);
            default:
                return super.a(obj);
        }
    }

    @Override // defpackage.yg1
    public void b(Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 0:
                i72 i72Var = (i72) obj2;
                ((r5) ((tt1) this.h).n).j((ak1) obj, i72Var.a, i72Var.b, i72Var.c);
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    @Override // defpackage.yg1
    public int g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ((i72) obj2).c;
            default:
                return super.g(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(int i, tt1 tt1Var) {
        super(i);
        this.h = tt1Var;
    }
}
