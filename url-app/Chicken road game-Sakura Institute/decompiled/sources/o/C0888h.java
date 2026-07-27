package o;

import W2.AbstractC0301x;
import W2.C0286h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import t.C1201e;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888h {

    /* renamed from: a, reason: collision with root package name */
    public final C1201e f8773a;

    /* renamed from: b, reason: collision with root package name */
    public final C0286h f8774b;

    public C0888h(C1201e c1201e, C0286h c0286h) {
        this.f8773a = c1201e;
        this.f8774b = c0286h;
    }

    public final String toString() {
        C0286h c0286h = this.f8774b;
        if (c0286h.f4266k.k(AbstractC0301x.f4299e) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f8773a.invoke());
        sb.append(", continuation=");
        sb.append(c0286h);
        sb.append(')');
        return sb.toString();
    }
}
