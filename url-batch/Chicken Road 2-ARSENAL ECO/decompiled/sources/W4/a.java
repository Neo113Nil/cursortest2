package W4;

import a5.C0232b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    public final C0232b f2802f;

    public a(C0232b c0232b) {
        this.f2802f = c0232b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f2802f.equals(((a) obj).f2802f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2802f.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.f2802f + '}';
    }
}
