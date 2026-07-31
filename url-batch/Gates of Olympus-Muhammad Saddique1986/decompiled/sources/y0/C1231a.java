package y0;

import A.k;
import f2.j;
import h0.C0463f;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231a {

    /* renamed from: a, reason: collision with root package name */
    public final C0463f f10378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10379b;

    public C1231a(C0463f c0463f, int i3) {
        this.f10378a = c0463f;
        this.f10379b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1231a)) {
            return false;
        }
        C1231a c1231a = (C1231a) obj;
        return j.a(this.f10378a, c1231a.f10378a) && this.f10379b == c1231a.f10379b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10379b) + (this.f10378a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f10378a);
        sb.append(", configFlags=");
        return k.j(sb, this.f10379b, ')');
    }
}
