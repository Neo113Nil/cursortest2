package T4;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final B4.j f2931b = new B4.j("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    public static final B4.j f2932c = new B4.j(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f2933a;

    public s(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.i.e(mediaType, "mediaType");
        kotlin.jvm.internal.i.e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f2933a = mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && kotlin.jvm.internal.i.a(((s) obj).f2933a, this.f2933a);
    }

    public final int hashCode() {
        return this.f2933a.hashCode();
    }

    public final String toString() {
        return this.f2933a;
    }
}
