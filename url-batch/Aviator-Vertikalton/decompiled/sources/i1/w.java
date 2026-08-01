package i1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final p f2776a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2777b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2778c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2779d;

    /* renamed from: e, reason: collision with root package name */
    public c f2780e;

    public w(p pVar, String str, n nVar, r rVar, Map map) {
        X0.f.e(pVar, "url");
        X0.f.e(str, "method");
        this.f2776a = pVar;
        this.f2777b = str;
        this.f2778c = nVar;
        this.f2779d = map;
    }

    public final T.v a() {
        T.v vVar = new T.v();
        vVar.f826d = new LinkedHashMap();
        vVar.f823a = this.f2776a;
        vVar.f824b = this.f2777b;
        Map map = this.f2779d;
        vVar.f826d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        vVar.f825c = this.f2778c.c();
        return vVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f2777b);
        sb.append(", url=");
        sb.append(this.f2776a);
        n nVar = this.f2778c;
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
                N0.c cVar = (N0.c) next;
                String str = (String) cVar.f670a;
                String str2 = (String) cVar.f671b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.f2779d;
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
