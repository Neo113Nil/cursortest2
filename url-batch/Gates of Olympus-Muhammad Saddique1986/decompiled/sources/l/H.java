package l;

import a.AbstractC0235a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final H f6454b;

    /* renamed from: c, reason: collision with root package name */
    public static final H f6455c;

    /* renamed from: a, reason: collision with root package name */
    public final P f6456a;

    static {
        LinkedHashMap linkedHashMap = null;
        I i3 = null;
        v vVar = null;
        AbstractC0235a abstractC0235a = null;
        f6454b = new H(new P(i3, vVar, abstractC0235a, false, linkedHashMap, 63));
        f6455c = new H(new P(i3, vVar, abstractC0235a, true, linkedHashMap, 47));
    }

    public H(P p3) {
        this.f6456a = p3;
    }

    public final H a(H h3) {
        P p3 = h3.f6456a;
        P p4 = this.f6456a;
        I i3 = p3.f6468a;
        if (i3 == null) {
            i3 = p4.f6468a;
        }
        v vVar = p3.f6469b;
        if (vVar == null) {
            vVar = p4.f6469b;
        }
        boolean z3 = p3.f6470c || p4.f6470c;
        Map map = p4.f6471d;
        f2.j.f(map, "<this>");
        Map map2 = p3.f6471d;
        f2.j.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new H(new P(i3, vVar, null, z3, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof H) && f2.j.a(((H) obj).f6456a, this.f6456a);
    }

    public final int hashCode() {
        return this.f6456a.hashCode();
    }

    public final String toString() {
        if (equals(f6454b)) {
            return "ExitTransition.None";
        }
        if (equals(f6455c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        P p3 = this.f6456a;
        I i3 = p3.f6468a;
        sb.append(i3 != null ? i3.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        v vVar = p3.f6469b;
        sb.append(vVar != null ? vVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(p3.f6470c);
        return sb.toString();
    }
}
