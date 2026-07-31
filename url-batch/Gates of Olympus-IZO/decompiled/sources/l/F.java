package l;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final F f5431b = new F(new O(null, null, false, null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final O f5432a;

    public F(O o3) {
        this.f5432a = o3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && Z1.i.a(((F) obj).f5432a, this.f5432a);
    }

    public final int hashCode() {
        return this.f5432a.hashCode();
    }

    public final String toString() {
        if (equals(f5431b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        H h3 = this.f5432a.f5448a;
        sb.append(h3 != null ? h3.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
