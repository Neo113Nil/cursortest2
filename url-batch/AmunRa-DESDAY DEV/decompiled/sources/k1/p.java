package k1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2837c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f2838a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f2839b;

    public p(String str, String[] strArr) {
        this.f2838a = str;
        this.f2839b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Z0.d.a(((p) obj).f2838a, this.f2838a);
    }

    public final int hashCode() {
        return this.f2838a.hashCode();
    }

    public final String toString() {
        return this.f2838a;
    }
}
