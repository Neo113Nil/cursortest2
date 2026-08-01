package p1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3369c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f3370a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3371b;

    public o(String str, String[] strArr) {
        this.f3370a = str;
        this.f3371b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && e1.d.a(((o) obj).f3370a, this.f3370a);
    }

    public final int hashCode() {
        return this.f3370a.hashCode();
    }

    public final String toString() {
        return this.f3370a;
    }
}
