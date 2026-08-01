package b5;

import com.google.android.gms.internal.measurement.w5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import s7.j4;
import s7.k1;
import s7.q1;
import s7.v0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends s.r {
    public final /* synthetic */ int g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1139h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k1 k1Var) {
        super(20);
        this.f1139h = k1Var;
    }

    @Override // s.r
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((i) this.f1139h).f1140d.K(str);
            default:
                String str2 = (String) obj;
                c7.c0.d(str2);
                k1 k1Var = (k1) this.f1139h;
                k1Var.t();
                c7.c0.d(str2);
                s7.m mVar = k1Var.f9150e.f8762i;
                j4.T(mVar);
                p.e A0 = mVar.A0(str2);
                if (A0 == null) {
                    return null;
                }
                v0 v0Var = ((q1) k1Var.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.B.b(str2, "Populate EES config from database on cache miss. appId");
                k1Var.A(str2, k1Var.B(str2, (byte[]) A0.f7588e));
                h hVar = k1Var.f8783y;
                synchronized (hVar.f8363c) {
                    Set entrySet = hVar.f8362b.f5388a.entrySet();
                    entrySet.getClass();
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = hVar.f8362b.f5388a.entrySet();
                    entrySet2.getClass();
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (w5) linkedHashMap.get(str2);
        }
    }

    @Override // s.r
    public void b(Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 0:
                ((String) obj).getClass();
                ((i5.c) obj2).close();
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(25);
        this.f1139h = iVar;
    }
}
