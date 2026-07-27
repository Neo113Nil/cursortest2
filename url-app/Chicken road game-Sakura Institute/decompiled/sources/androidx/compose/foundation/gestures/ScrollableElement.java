package androidx.compose.foundation.gestures;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l0.C0802C;
import m.i0;
import o.C0882e;
import o.C0891i0;
import o.C0894k;
import o.C0898m;
import o.C0908r0;
import o.InterfaceC0880d;
import o.InterfaceC0893j0;
import o.N;
import p.C0935k;
import r0.AbstractC1065f;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class ScrollableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0893j0 f5046a;

    /* renamed from: b, reason: collision with root package name */
    public final N f5047b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f5048c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5049d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5050e;

    /* renamed from: f, reason: collision with root package name */
    public final C0898m f5051f;

    /* renamed from: g, reason: collision with root package name */
    public final C0935k f5052g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0880d f5053h;

    public ScrollableElement(i0 i0Var, InterfaceC0880d interfaceC0880d, C0898m c0898m, N n2, InterfaceC0893j0 interfaceC0893j0, C0935k c0935k, boolean z4, boolean z5) {
        this.f5046a = interfaceC0893j0;
        this.f5047b = n2;
        this.f5048c = i0Var;
        this.f5049d = z4;
        this.f5050e = z5;
        this.f5051f = c0898m;
        this.f5052g = c0935k;
        this.f5053h = interfaceC0880d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.a(this.f5046a, scrollableElement.f5046a) && this.f5047b == scrollableElement.f5047b && Intrinsics.a(this.f5048c, scrollableElement.f5048c) && this.f5049d == scrollableElement.f5049d && this.f5050e == scrollableElement.f5050e && Intrinsics.a(this.f5051f, scrollableElement.f5051f) && Intrinsics.a(this.f5052g, scrollableElement.f5052g) && Intrinsics.a(this.f5053h, scrollableElement.f5053h);
    }

    public final int hashCode() {
        int hashCode = (this.f5047b.hashCode() + (this.f5046a.hashCode() * 31)) * 31;
        i0 i0Var = this.f5048c;
        int d4 = AbstractC0017m.d(AbstractC0017m.d((hashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31, 31, this.f5049d), 31, this.f5050e);
        C0898m c0898m = this.f5051f;
        int hashCode2 = (d4 + (c0898m != null ? c0898m.hashCode() : 0)) * 31;
        C0935k c0935k = this.f5052g;
        int hashCode3 = (hashCode2 + (c0935k != null ? c0935k.hashCode() : 0)) * 31;
        InterfaceC0880d interfaceC0880d = this.f5053h;
        return hashCode3 + (interfaceC0880d != null ? interfaceC0880d.hashCode() : 0);
    }

    @Override // r0.T
    public final n l() {
        C0935k c0935k = this.f5052g;
        return new C0891i0(this.f5048c, this.f5053h, this.f5051f, this.f5047b, this.f5046a, c0935k, this.f5049d, this.f5050e);
    }

    @Override // r0.T
    public final void m(n nVar) {
        boolean z4;
        C0802C c0802c;
        C0891i0 c0891i0 = (C0891i0) nVar;
        boolean z5 = c0891i0.f8799x;
        boolean z6 = this.f5049d;
        boolean z7 = true;
        boolean z8 = false;
        if (z5 != z6) {
            c0891i0.f8792J.f3320a = z6;
            c0891i0.f8789G.f8714t = z6;
            z4 = true;
        } else {
            z4 = false;
        }
        C0898m c0898m = this.f5051f;
        C0898m c0898m2 = c0898m == null ? c0891i0.f8790H : c0898m;
        C0908r0 c0908r0 = c0891i0.f8791I;
        InterfaceC0893j0 interfaceC0893j0 = c0908r0.f8865a;
        InterfaceC0893j0 interfaceC0893j02 = this.f5046a;
        if (!Intrinsics.a(interfaceC0893j0, interfaceC0893j02)) {
            c0908r0.f8865a = interfaceC0893j02;
            z8 = true;
        }
        i0 i0Var = this.f5048c;
        c0908r0.f8866b = i0Var;
        N n2 = c0908r0.f8868d;
        N n4 = this.f5047b;
        if (n2 != n4) {
            c0908r0.f8868d = n4;
            z8 = true;
        }
        boolean z9 = c0908r0.f8869e;
        boolean z10 = this.f5050e;
        if (z9 != z10) {
            c0908r0.f8869e = z10;
            z8 = true;
        }
        c0908r0.f8867c = c0898m2;
        c0908r0.f8870f = c0891i0.f8788F;
        C0894k c0894k = c0891i0.f8793K;
        c0894k.f8809t = n4;
        c0894k.f8811v = z10;
        c0894k.f8812w = this.f5053h;
        c0891i0.f8786D = i0Var;
        c0891i0.f8787E = c0898m;
        C0882e c0882e = C0882e.f8759i;
        N n5 = c0908r0.f8868d;
        N n6 = N.f8665d;
        if (n5 != n6) {
            n6 = N.f8666e;
        }
        c0891i0.f8798w = c0882e;
        if (c0891i0.f8799x != z6) {
            c0891i0.f8799x = z6;
            if (!z6) {
                c0891i0.H0();
                C0802C c0802c2 = c0891i0.f8785C;
                if (c0802c2 != null) {
                    c0891i0.C0(c0802c2);
                }
                c0891i0.f8785C = null;
            }
            z8 = true;
        }
        C0935k c0935k = c0891i0.f8800y;
        C0935k c0935k2 = this.f5052g;
        if (!Intrinsics.a(c0935k, c0935k2)) {
            c0891i0.H0();
            c0891i0.f8800y = c0935k2;
        }
        if (c0891i0.f8797v != n6) {
            c0891i0.f8797v = n6;
        } else {
            z7 = z8;
        }
        if (z7 && (c0802c = c0891i0.f8785C) != null) {
            c0802c.D0();
        }
        if (z4) {
            c0891i0.f8795M = null;
            c0891i0.f8796N = null;
            AbstractC1065f.p(c0891i0);
        }
    }
}
