package G3;

import c3.C0292d;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final p f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1014c;

    /* renamed from: d, reason: collision with root package name */
    public final w f1015d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f1016e;

    /* renamed from: f, reason: collision with root package name */
    public c f1017f;

    public v(p url, String method, n nVar, w wVar, Map map) {
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(method, "method");
        this.f1012a = url;
        this.f1013b = method;
        this.f1014c = nVar;
        this.f1015d = wVar;
        this.f1016e = map;
    }

    public final u a() {
        u uVar = new u();
        uVar.f1011e = new LinkedHashMap();
        uVar.f1007a = this.f1012a;
        uVar.f1008b = this.f1013b;
        uVar.f1010d = this.f1015d;
        Map map = this.f1016e;
        uVar.f1011e = map.isEmpty() ? new LinkedHashMap() : d3.t.H(map);
        uVar.f1009c = this.f1014c.d();
        return uVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f1013b);
        sb.append(", url=");
        sb.append(this.f1012a);
        n nVar = this.f1014c;
        if (nVar.size() != 0) {
            sb.append(", headers=[");
            int i4 = 0;
            for (Object obj : nVar) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    d3.j.X();
                    throw null;
                }
                C0292d c0292d = (C0292d) obj;
                String str = (String) c0292d.f5724a;
                String str2 = (String) c0292d.f5725b;
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i4 = i5;
            }
            sb.append(']');
        }
        Map map = this.f1016e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
