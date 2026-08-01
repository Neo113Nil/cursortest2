package s1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3656c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f3657a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3658b;

    public n(String str, String[] strArr) {
        this.f3657a = str;
        this.f3658b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && h1.d.a(((n) obj).f3657a, this.f3657a);
    }

    public final int hashCode() {
        return this.f3657a.hashCode();
    }

    public final String toString() {
        return this.f3657a;
    }
}
