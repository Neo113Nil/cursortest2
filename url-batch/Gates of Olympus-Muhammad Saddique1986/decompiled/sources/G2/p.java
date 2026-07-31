package G2;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2224c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f2225d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f2226a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f2227b;

    public p(String str, String[] strArr) {
        this.f2226a = str;
        this.f2227b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && f2.j.a(((p) obj).f2226a, this.f2226a);
    }

    public final int hashCode() {
        return this.f2226a.hashCode();
    }

    public final String toString() {
        return this.f2226a;
    }
}
