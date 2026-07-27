package androidx.compose.material3;

import D.S1;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import p.C0935k;
import r0.AbstractC1065f;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class ThumbElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C0935k f5148a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5149b;

    public ThumbElement(C0935k c0935k, boolean z4) {
        this.f5148a = c0935k;
        this.f5149b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.a(this.f5148a, thumbElement.f5148a) && this.f5149b == thumbElement.f5149b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5149b) + (this.f5148a.hashCode() * 31);
    }

    @Override // r0.T
    public final n l() {
        S1 s12 = new S1();
        s12.f1619t = this.f5148a;
        s12.f1620u = this.f5149b;
        s12.f1624y = Float.NaN;
        s12.f1625z = Float.NaN;
        return s12;
    }

    @Override // r0.T
    public final void m(n nVar) {
        S1 s12 = (S1) nVar;
        s12.f1619t = this.f5148a;
        boolean z4 = s12.f1620u;
        boolean z5 = this.f5149b;
        if (z4 != z5) {
            AbstractC1065f.o(s12);
        }
        s12.f1620u = z5;
        if (s12.f1623x == null && !Float.isNaN(s12.f1625z)) {
            s12.f1623x = AbstractC0779e.a(s12.f1625z);
        }
        if (s12.f1622w != null || Float.isNaN(s12.f1624y)) {
            return;
        }
        s12.f1622w = AbstractC0779e.a(s12.f1624y);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f5148a + ", checked=" + this.f5149b + ')';
    }
}
