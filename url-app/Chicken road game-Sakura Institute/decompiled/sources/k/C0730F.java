package k;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0730F f7252b = new C0730F(new O(null, null, null, false, null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final O f7253a;

    public C0730F(O o4) {
        this.f7253a = o4;
    }

    public final C0730F a(C0730F c0730f) {
        u3.d dVar = null;
        O o4 = c0730f.f7253a;
        O o5 = this.f7253a;
        C0732H c0732h = o4.f7268a;
        if (c0732h == null) {
            c0732h = o5.f7268a;
        }
        t tVar = o4.f7269b;
        if (tVar == null) {
            tVar = o5.f7269b;
        }
        Map map = o5.f7271d;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map map2 = o4.f7271d;
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C0730F(new O(c0732h, tVar, dVar, false, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0730F) && Intrinsics.a(((C0730F) obj).f7253a, this.f7253a);
    }

    public final int hashCode() {
        return this.f7253a.hashCode();
    }

    public final String toString() {
        if (equals(f7252b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        O o4 = this.f7253a;
        C0732H c0732h = o4.f7268a;
        sb.append(c0732h != null ? c0732h.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        t tVar = o4.f7269b;
        sb.append(tVar != null ? tVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
