package A2;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f138c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f139d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f140a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f141b;

    public s(String str, String[] strArr) {
        this.f140a = str;
        this.f141b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && Z1.i.a(((s) obj).f140a, this.f140a);
    }

    public final int hashCode() {
        return this.f140a.hashCode();
    }

    public final String toString() {
        return this.f140a;
    }
}
