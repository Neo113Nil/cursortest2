package com.pgl.ssdk;

/* compiled from: Pair.java */
/* renamed from: com.pgl.ssdk.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1131k<A, B> {
    private final A a;
    private final B b;

    public C1131k(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A a() {
        return this.a;
    }

    public B b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1131k.class != obj.getClass()) {
            return false;
        }
        C1131k c1131k = (C1131k) obj;
        A a = this.a;
        if (a == null) {
            if (c1131k.a != null) {
                return false;
            }
        } else if (!a.equals(c1131k.a)) {
            return false;
        }
        B b = this.b;
        if (b == null) {
            if (c1131k.b != null) {
                return false;
            }
        } else if (!b.equals(c1131k.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }
}
