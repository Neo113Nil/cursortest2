package i1;

import Z1.i;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5110a;

    public C0467d(String str) {
        i.f(str, "name");
        this.f5110a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0467d)) {
            return false;
        }
        return i.a(this.f5110a, ((C0467d) obj).f5110a);
    }

    public final int hashCode() {
        return this.f5110a.hashCode();
    }

    public final String toString() {
        return this.f5110a;
    }
}
