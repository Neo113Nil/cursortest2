package l1;

import f2.j;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6589a;

    public C0595d(String str) {
        j.f(str, "name");
        this.f6589a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0595d)) {
            return false;
        }
        return j.a(this.f6589a, ((C0595d) obj).f6589a);
    }

    public final int hashCode() {
        return this.f6589a.hashCode();
    }

    public final String toString() {
        return this.f6589a;
    }
}
