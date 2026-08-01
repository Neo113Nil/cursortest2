package c3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final m f1127a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1128b;
    public final k c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f1129d;

    /* renamed from: e, reason: collision with root package name */
    public c f1130e;

    public s(m mVar, String str, k kVar, k3.m mVar2, Map map) {
        u2.c.e(mVar, "url");
        u2.c.e(str, "method");
        this.f1127a = mVar;
        this.f1128b = str;
        this.c = kVar;
        this.f1129d = map;
    }

    public final androidx.emoji2.text.w a() {
        androidx.emoji2.text.w wVar = new androidx.emoji2.text.w();
        wVar.f369i = new LinkedHashMap();
        wVar.f368f = this.f1127a;
        wVar.g = this.f1128b;
        Map map = this.f1129d;
        wVar.f369i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        wVar.h = this.c.c();
        return wVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f1128b);
        sb.append(", url=");
        sb.append(this.f1127a);
        k kVar = this.c;
        if (kVar.size() != 0) {
            sb.append(", headers=[");
            Iterator it = kVar.iterator();
            int i4 = 0;
            while (true) {
                a3.b bVar = (a3.b) it;
                if (!bVar.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = bVar.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                m2.a aVar = (m2.a) next;
                String str = (String) aVar.f2914f;
                String str2 = (String) aVar.g;
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i4 = i5;
            }
        }
        Map map = this.f1129d;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        u2.c.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
