package x0;

import H2.AbstractC0080b;
import Z1.i;
import h0.C0425f;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051a {

    /* renamed from: a, reason: collision with root package name */
    public final C0425f f8717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8718b;

    public C1051a(C0425f c0425f, int i3) {
        this.f8717a = c0425f;
        this.f8718b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1051a)) {
            return false;
        }
        C1051a c1051a = (C1051a) obj;
        return i.a(this.f8717a, c1051a.f8717a) && this.f8718b == c1051a.f8718b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8718b) + (this.f8717a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f8717a);
        sb.append(", configFlags=");
        return AbstractC0080b.k(sb, this.f8718b, ')');
    }
}
