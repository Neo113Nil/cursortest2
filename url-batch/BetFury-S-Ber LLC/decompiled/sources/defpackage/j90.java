package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j90 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Serializable c;
    public final Object d;
    public final Map e;
    public Object f;

    public j90(Map map) {
        map.getClass();
        this.b = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new rd(3, this);
    }

    public wi a() {
        wi wiVar = new wi();
        wiVar.i = new LinkedHashMap();
        wiVar.f = (ou) this.b;
        wiVar.g = (String) this.c;
        Map map = this.e;
        wiVar.i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        wiVar.h = ((bt) this.d).c();
        return wiVar;
    }

    public void b(Object obj, String str) {
        lm lmVar = n9.n;
        str.getClass();
        ((LinkedHashMap) this.b).put(str, obj);
        ef0 ef0Var = (ef0) ((LinkedHashMap) this.d).get(str);
        if (ef0Var != null) {
            ef0Var.i0(null, obj == null ? lmVar : obj);
        }
        ef0 ef0Var2 = (ef0) ((LinkedHashMap) this.e).get(str);
        if (ef0Var2 != null) {
            if (obj == null) {
                obj = lmVar;
            }
            ef0Var2.i0(null, obj);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.c);
                sb.append(", url=");
                sb.append((ou) this.b);
                bt btVar = (bt) this.d;
                if (btVar.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = btVar.iterator();
                    int i = 0;
                    while (true) {
                        k kVar = (k) it;
                        if (kVar.hasNext()) {
                            Object next = kVar.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            k50 k50Var = (k50) next;
                            String str = (String) k50Var.f;
                            String str2 = (String) k50Var.g;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = this.e;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public j90(ou ouVar, String str, bt btVar, n9 n9Var, Map map) {
        ouVar.getClass();
        str.getClass();
        this.b = ouVar;
        this.c = str;
        this.d = btVar;
        this.e = map;
    }
}
