package androidx.media2.session;

/* loaded from: classes.dex */
public final class SessionToken implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    SessionTokenImpl f1207a;

    interface SessionTokenImpl extends a0.b {
    }

    SessionToken() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof SessionToken) {
            return this.f1207a.equals(((SessionToken) obj).f1207a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1207a.hashCode();
    }

    public String toString() {
        return this.f1207a.toString();
    }
}
