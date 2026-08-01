package z1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4699c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f4700a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4701b;

    public n(String str, String[] strArr) {
        this.f4700a = str;
        this.f4701b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && k1.e.a(((n) obj).f4700a, this.f4700a);
    }

    public final int hashCode() {
        return this.f4700a.hashCode();
    }

    public final String toString() {
        return this.f4700a;
    }
}
