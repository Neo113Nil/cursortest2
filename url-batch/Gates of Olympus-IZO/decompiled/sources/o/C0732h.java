package o;

import e2.AbstractC0381e;
import k2.AbstractC0549v;
import k2.C0536h;
import v.C1013b;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732h {

    /* renamed from: a, reason: collision with root package name */
    public final C1013b f6530a;

    /* renamed from: b, reason: collision with root package name */
    public final C0536h f6531b;

    public C0732h(C1013b c1013b, C0536h c0536h) {
        this.f6530a = c1013b;
        this.f6531b = c0536h;
    }

    public final String toString() {
        C0536h c0536h = this.f6531b;
        if (c0536h.f5365h.k(AbstractC0549v.f5393e) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        AbstractC0381e.m(16);
        String num = Integer.toString(hashCode, 16);
        Z1.i.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f6530a.b());
        sb.append(", continuation=");
        sb.append(c0536h);
        sb.append(')');
        return sb.toString();
    }
}
