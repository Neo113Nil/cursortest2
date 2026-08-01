package m1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3189c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f3190a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3191b;

    public n(String str, String[] strArr) {
        this.f3190a = str;
        this.f3191b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && b1.d.a(((n) obj).f3190a, this.f3190a);
    }

    public final int hashCode() {
        return this.f3190a.hashCode();
    }

    public final String toString() {
        return this.f3190a;
    }
}
