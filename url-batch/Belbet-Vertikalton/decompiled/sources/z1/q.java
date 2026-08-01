package z1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4882c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4883d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f4884a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4885b;

    public q(String str, String[] strArr) {
        this.f4884a = str;
        this.f4885b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && j1.h.a(((q) obj).f4884a, this.f4884a);
    }

    public final int hashCode() {
        return this.f4884a.hashCode();
    }

    public final String toString() {
        return this.f4884a;
    }
}
