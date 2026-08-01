package i1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final p f2780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2781b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2782c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2783d;

    /* renamed from: e, reason: collision with root package name */
    public c f2784e;

    public w(p pVar, String str, n nVar, r rVar, Map map) {
        X0.f.e(pVar, "url");
        X0.f.e(str, "method");
        this.f2780a = pVar;
        this.f2781b = str;
        this.f2782c = nVar;
        this.f2783d = map;
    }

    public final T.v a() {
        T.v vVar = new T.v();
        vVar.f827d = new LinkedHashMap();
        vVar.f824a = this.f2780a;
        vVar.f825b = this.f2781b;
        Map map = this.f2783d;
        vVar.f827d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        vVar.f826c = this.f2782c.c();
        return vVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f2781b);
        sb.append(", url=");
        sb.append(this.f2780a);
        n nVar = this.f2782c;
        if (nVar.size() != 0) {
            sb.append(", headers=[");
            Iterator it = nVar.iterator();
            int i = 0;
            while (true) {
                O0.a aVar = (O0.a) it;
                if (!aVar.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = aVar.next();
                int i2 = i + 1;
                if (i < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                N0.d dVar = (N0.d) next;
                String str = (String) dVar.f671a;
                String str2 = (String) dVar.f672b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.f2783d;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        X0.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
