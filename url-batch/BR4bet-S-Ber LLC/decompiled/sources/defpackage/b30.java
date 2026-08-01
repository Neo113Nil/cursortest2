package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b30 {
    public final uq a;
    public final String b;
    public final kp c;
    public final Map d;
    public m9 e;

    public b30(uq uqVar, String str, kp kpVar, la0 la0Var, Map map) {
        uqVar.getClass();
        str.getClass();
        this.a = uqVar;
        this.b = str;
        this.c = kpVar;
        this.d = map;
    }

    public final rg a() {
        rg rgVar = new rg();
        rgVar.i = new LinkedHashMap();
        rgVar.f = this.a;
        rgVar.g = this.b;
        Map map = this.d;
        rgVar.i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        rgVar.h = this.c.c();
        return rgVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        kp kpVar = this.c;
        if (kpVar.size() != 0) {
            sb.append(", headers=[");
            Iterator it = kpVar.iterator();
            int i = 0;
            while (true) {
                j jVar = (j) it;
                if (!jVar.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = jVar.next();
                int i2 = i + 1;
                if (i < 0) {
                    xb.j0();
                    throw null;
                }
                tz tzVar = (tz) next;
                String str = (String) tzVar.f;
                String str2 = (String) tzVar.g;
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
