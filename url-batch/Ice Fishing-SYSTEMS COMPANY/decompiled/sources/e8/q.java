package e8;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final M7.i f37445b = new M7.i("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    public static final M7.i f37446c = new M7.i(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f37447a;

    public q(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.h.e(mediaType, "mediaType");
        kotlin.jvm.internal.h.e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f37447a = mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.h.a(((q) obj).f37447a, this.f37447a);
    }

    public final int hashCode() {
        return this.f37447a.hashCode();
    }

    public final String toString() {
        return this.f37447a;
    }
}
