package l;

import e2.AbstractC0381e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final G f5433b;

    /* renamed from: c, reason: collision with root package name */
    public static final G f5434c;

    /* renamed from: a, reason: collision with root package name */
    public final O f5435a;

    static {
        LinkedHashMap linkedHashMap = null;
        H h3 = null;
        AbstractC0381e abstractC0381e = null;
        f5433b = new G(new O(h3, abstractC0381e, false, linkedHashMap, 63));
        f5434c = new G(new O(h3, abstractC0381e, true, linkedHashMap, 47));
    }

    public G(O o3) {
        this.f5435a = o3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && Z1.i.a(((G) obj).f5435a, this.f5435a);
    }

    public final int hashCode() {
        return this.f5435a.hashCode();
    }

    public final String toString() {
        if (equals(f5433b)) {
            return "ExitTransition.None";
        }
        if (equals(f5434c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        O o3 = this.f5435a;
        H h3 = o3.f5448a;
        sb.append(h3 != null ? h3.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(o3.f5449b);
        return sb.toString();
    }
}
