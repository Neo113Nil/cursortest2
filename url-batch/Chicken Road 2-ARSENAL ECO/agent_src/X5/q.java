package X5;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final F5.i f2982b = new F5.i("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    public static final F5.i f2983c = new F5.i(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f2984a;

    public q(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.i.e(mediaType, "mediaType");
        kotlin.jvm.internal.i.e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f2984a = mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.i.a(((q) obj).f2984a, this.f2984a);
    }

    public final int hashCode() {
        return this.f2984a.hashCode();
    }

    public final String toString() {
        return this.f2984a;
    }
}
