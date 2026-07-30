package q0;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4866a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39879a;

    public C4866a(boolean z8) {
        this.f39879a = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4866a)) {
            return false;
        }
        C4866a c4866a = (C4866a) obj;
        c4866a.getClass();
        return this.f39879a == c4866a.f39879a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39879a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f39879a;
    }
}
