package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xz {
    public final jo a;
    public final String b;
    public final ym c;
    public final Map d;
    public z8 e;

    public xz(jo joVar, String str, ym ymVar, zo zoVar, Map map) {
        joVar.getClass();
        str.getClass();
        this.a = joVar;
        this.b = str;
        this.c = ymVar;
        this.d = map;
    }

    public final we a() {
        we weVar = new we();
        weVar.i = new LinkedHashMap();
        weVar.f = this.a;
        weVar.g = this.b;
        Map map = this.d;
        weVar.i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        weVar.h = this.c.c();
        return weVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        ym ymVar = this.c;
        if (ymVar.size() != 0) {
            sb.append(", headers=[");
            Iterator it = ymVar.iterator();
            int i = 0;
            while (true) {
                h hVar = (h) it;
                if (!hVar.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = hVar.next();
                int i2 = i + 1;
                if (i < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                pw pwVar = (pw) next;
                String str = (String) pwVar.f;
                String str2 = (String) pwVar.g;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        Map map = this.d;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
