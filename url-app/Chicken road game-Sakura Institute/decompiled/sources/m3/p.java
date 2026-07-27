package m3;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8402c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8403d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f8404a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f8405b;

    public p(String str, String[] strArr) {
        this.f8404a = str;
        this.f8405b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Intrinsics.a(((p) obj).f8404a, this.f8404a);
    }

    public final int hashCode() {
        return this.f8404a.hashCode();
    }

    public final String toString() {
        return this.f8404a;
    }
}
