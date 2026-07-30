package y1;

import t0.AbstractC5051n;

/* renamed from: y1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5237l {

    /* renamed from: a, reason: collision with root package name */
    public final String f41846a;

    public C5237l(String str) {
        this.f41846a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5237l) {
            return this.f41846a.equals(((C5237l) obj).f41846a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41846a.hashCode();
    }

    public final String toString() {
        return AbstractC5051n.g(new StringBuilder("StringHeaderFactory{value='"), this.f41846a, "'}");
    }
}
