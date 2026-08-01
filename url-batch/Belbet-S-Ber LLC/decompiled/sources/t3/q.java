package t3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final k f3506a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3507b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3508c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public c f3509e;

    public q(k kVar, String str, j jVar, s.a aVar, Map map) {
        i3.d.e(kVar, "url");
        i3.d.e(str, "method");
        this.f3506a = kVar;
        this.f3507b = str;
        this.f3508c = jVar;
        this.d = map;
    }

    public final a0.k a() {
        a0.k kVar = new a0.k();
        kVar.i = new LinkedHashMap();
        kVar.f97f = this.f3506a;
        kVar.f98g = this.f3507b;
        Map map = this.d;
        kVar.i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        kVar.h = this.f3508c.c();
        return kVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f3507b);
        sb.append(", url=");
        sb.append(this.f3506a);
        j jVar = this.f3508c;
        if (jVar.size() != 0) {
            sb.append(", headers=[");
            Iterator it = jVar.iterator();
            int i = 0;
            while (true) {
                i3.a aVar = (i3.a) it;
                if (!aVar.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = aVar.next();
                int i4 = i + 1;
                if (i < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                w2.a aVar2 = (w2.a) next;
                String str = (String) aVar2.f3814f;
                String str2 = (String) aVar2.f3815g;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i4;
            }
        }
        Map map = this.d;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
