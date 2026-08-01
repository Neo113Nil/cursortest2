package i1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2726c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f2727d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f2728a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f2729b;

    public s(String str, String[] strArr) {
        this.f2728a = str;
        this.f2729b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && X0.f.a(((s) obj).f2728a, this.f2728a);
    }

    public final int hashCode() {
        return this.f2728a.hashCode();
    }

    public final String toString() {
        return this.f2728a;
    }
}
