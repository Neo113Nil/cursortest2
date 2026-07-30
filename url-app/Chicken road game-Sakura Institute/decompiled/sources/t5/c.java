package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class c implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final c f8886g = new c("[MIN_NAME]");

    /* renamed from: h, reason: collision with root package name */
    public static final c f8887h = new c("[MAX_KEY]");

    /* renamed from: i, reason: collision with root package name */
    public static final c f8888i = new c(".priority");

    /* renamed from: f, reason: collision with root package name */
    public final String f8889f;

    public c(String str) {
        this.f8889f = str;
    }

    public static c e(String str) {
        Integer g9 = o5.j.g(str);
        if (g9 != null) {
            return new b(str, g9.intValue());
        }
        if (str.equals(".priority")) {
            return f8888i;
        }
        o5.j.c(!str.contains("/"));
        return new c(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        if (this == cVar) {
            return 0;
        }
        String str = this.f8889f;
        if (!str.equals("[MIN_NAME]")) {
            String str2 = cVar.f8889f;
            if (!str2.equals("[MAX_KEY]")) {
                if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
                    return 1;
                }
                if (!(this instanceof b)) {
                    if (cVar instanceof b) {
                        return 1;
                    }
                    return str.compareTo(str2);
                }
                if (cVar instanceof b) {
                    int g9 = cVar.g();
                    char[] cArr = o5.j.f6853a;
                    int i7 = ((b) this).f8885j;
                    int i8 = i7 < g9 ? -1 : i7 == g9 ? 0 : 1;
                    if (i8 != 0) {
                        return i8;
                    }
                    int length = str.length();
                    int length2 = str2.length();
                    if (length < length2) {
                        return -1;
                    }
                    return length == length2 ? 0 : 1;
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f8889f.equals(((c) obj).f8889f);
    }

    public int g() {
        return 0;
    }

    public final int hashCode() {
        return this.f8889f.hashCode();
    }

    public String toString() {
        return a0.m.m(new StringBuilder("ChildKey(\""), this.f8889f, "\")");
    }
}
