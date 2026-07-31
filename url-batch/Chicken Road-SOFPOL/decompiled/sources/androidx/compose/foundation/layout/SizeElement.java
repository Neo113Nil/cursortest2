package androidx.compose.foundation.layout;

import a0.q;
import r2.f;
import w1.x0;
import x.n0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class SizeElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f495a;

    /* renamed from: b, reason: collision with root package name */
    public final float f496b;

    /* renamed from: c, reason: collision with root package name */
    public final float f497c;

    /* renamed from: d, reason: collision with root package name */
    public final float f498d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f499e;

    public SizeElement(float f6, float f8, float f9, float f10) {
        this.f495a = f6;
        this.f496b = f8;
        this.f497c = f9;
        this.f498d = f10;
        this.f499e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f495a, sizeElement.f495a) && f.a(this.f496b, sizeElement.f496b) && f.a(this.f497c, sizeElement.f497c) && f.a(this.f498d, sizeElement.f498d) && this.f499e == sizeElement.f499e;
    }

    @Override // w1.x0
    public final l f() {
        n0 n0Var = new n0();
        n0Var.f8251r = this.f495a;
        n0Var.f8252s = this.f496b;
        n0Var.f8253t = this.f497c;
        n0Var.f8254u = this.f498d;
        n0Var.f8255v = this.f499e;
        return n0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        n0 n0Var = (n0) lVar;
        n0Var.f8251r = this.f495a;
        n0Var.f8252s = this.f496b;
        n0Var.f8253t = this.f497c;
        n0Var.f8254u = this.f498d;
        n0Var.f8255v = this.f499e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f499e) + q.a(this.f498d, q.a(this.f497c, q.a(this.f496b, Float.hashCode(this.f495a) * 31, 31), 31), 31);
    }

    public /* synthetic */ SizeElement(float f6, float f8, float f9, float f10, int i) {
        this((i & 1) != 0 ? Float.NaN : f6, (i & 2) != 0 ? Float.NaN : f8, (i & 4) != 0 ? Float.NaN : f9, (i & 8) != 0 ? Float.NaN : f10);
    }
}
