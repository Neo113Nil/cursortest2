package k;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731G {

    /* renamed from: b, reason: collision with root package name */
    public static final C0731G f7254b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0731G f7255c;

    /* renamed from: a, reason: collision with root package name */
    public final O f7256a;

    static {
        LinkedHashMap linkedHashMap = null;
        C0732H c0732h = null;
        t tVar = null;
        u3.d dVar = null;
        f7254b = new C0731G(new O(c0732h, tVar, dVar, false, linkedHashMap, 63));
        f7255c = new C0731G(new O(c0732h, tVar, dVar, true, linkedHashMap, 47));
    }

    public C0731G(O o4) {
        this.f7256a = o4;
    }

    public final C0731G a(C0731G c0731g) {
        O o4 = c0731g.f7256a;
        O o5 = this.f7256a;
        C0732H c0732h = o4.f7268a;
        if (c0732h == null) {
            c0732h = o5.f7268a;
        }
        t tVar = o4.f7269b;
        if (tVar == null) {
            tVar = o5.f7269b;
        }
        boolean z4 = o4.f7270c || o5.f7270c;
        Map map = o5.f7271d;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map map2 = o4.f7271d;
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C0731G(new O(c0732h, tVar, null, z4, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0731G) && Intrinsics.a(((C0731G) obj).f7256a, this.f7256a);
    }

    public final int hashCode() {
        return this.f7256a.hashCode();
    }

    public final String toString() {
        if (equals(f7254b)) {
            return "ExitTransition.None";
        }
        if (equals(f7255c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        O o4 = this.f7256a;
        C0732H c0732h = o4.f7268a;
        sb.append(c0732h != null ? c0732h.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        t tVar = o4.f7269b;
        sb.append(tVar != null ? tVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(o4.f7270c);
        return sb.toString();
    }
}
