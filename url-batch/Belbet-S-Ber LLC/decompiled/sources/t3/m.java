package t3;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3461c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f3462a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3463b;

    public m(String str, String[] strArr) {
        this.f3462a = str;
        this.f3463b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && i3.d.a(((m) obj).f3462a, this.f3462a);
    }

    public final int hashCode() {
        return this.f3462a.hashCode();
    }

    public final String toString() {
        return this.f3462a;
    }
}
