package X;

import T.D;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f3490a;

    public b(int i4) {
        this.f3490a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f3490a == ((b) obj).f3490a;
    }

    public final int hashCode() {
        return this.f3490a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f3490a;
    }
}
