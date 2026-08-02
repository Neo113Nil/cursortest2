package s0;

import E1.AbstractC0033i;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10289a;

    public C1185b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10289a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185b)) {
            return false;
        }
        return this.f10289a.equals(((C1185b) obj).f10289a);
    }

    public final int hashCode() {
        return this.f10289a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0033i.m(new StringBuilder("Encoding{name=\""), this.f10289a, "\"}");
    }
}
