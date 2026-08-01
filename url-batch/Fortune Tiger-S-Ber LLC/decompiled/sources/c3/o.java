package c3;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f1082d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f1083a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f1084b;

    public o(String str, String[] strArr) {
        this.f1083a = str;
        this.f1084b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && u2.c.a(((o) obj).f1083a, this.f1083a);
    }

    public final int hashCode() {
        return this.f1083a.hashCode();
    }

    public final String toString() {
        return this.f1083a;
    }
}
