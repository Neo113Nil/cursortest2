package l;

import a.AbstractC0235a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final G f6452b = new G(new P(null, null, null, false, null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final P f6453a;

    public G(P p3) {
        this.f6453a = p3;
    }

    public final G a(G g3) {
        AbstractC0235a abstractC0235a = null;
        P p3 = g3.f6453a;
        P p4 = this.f6453a;
        I i3 = p3.f6468a;
        if (i3 == null) {
            i3 = p4.f6468a;
        }
        v vVar = p3.f6469b;
        if (vVar == null) {
            vVar = p4.f6469b;
        }
        Map map = p4.f6471d;
        f2.j.f(map, "<this>");
        Map map2 = p3.f6471d;
        f2.j.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new G(new P(i3, vVar, abstractC0235a, false, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && f2.j.a(((G) obj).f6453a, this.f6453a);
    }

    public final int hashCode() {
        return this.f6453a.hashCode();
    }

    public final String toString() {
        if (equals(f6452b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        P p3 = this.f6453a;
        I i3 = p3.f6468a;
        sb.append(i3 != null ? i3.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        v vVar = p3.f6469b;
        sb.append(vVar != null ? vVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
