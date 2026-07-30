package s7;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8617c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8618d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f8619a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f8620b;

    public n(String str, String[] strArr) {
        this.f8619a = str;
        this.f8620b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && r6.k.a(((n) obj).f8619a, this.f8619a);
    }

    public final int hashCode() {
        return this.f8619a.hashCode();
    }

    public final String toString() {
        return this.f8619a;
    }
}
