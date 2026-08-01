package r1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3469c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f3470a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3471b;

    public o(String str, String[] strArr) {
        this.f3470a = str;
        this.f3471b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && g1.d.a(((o) obj).f3470a, this.f3470a);
    }

    public final int hashCode() {
        return this.f3470a.hashCode();
    }

    public final String toString() {
        return this.f3470a;
    }
}
