package c;

import B.U;
import b.AbstractC0327w;
import b.C0306b;
import e2.InterfaceC0426e;
import n.AbstractC0695v;

/* loaded from: classes.dex */
public final class f extends AbstractC0327w {

    /* renamed from: d, reason: collision with root package name */
    public v2.c f5455d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0426e f5456e;

    /* renamed from: f, reason: collision with root package name */
    public U f5457f;

    @Override // b.AbstractC0327w
    public final void a() {
        U u3 = this.f5457f;
        if (u3 != null) {
            u3.c();
        }
        U u4 = this.f5457f;
        if (u4 == null) {
            return;
        }
        u4.f318b = false;
    }

    @Override // b.AbstractC0327w
    public final void b() {
        U u3 = this.f5457f;
        if (u3 != null && !u3.f318b) {
            u3.c();
            this.f5457f = null;
        }
        if (this.f5457f == null) {
            this.f5457f = new U(this.f5455d, false, this.f5456e, this);
        }
        U u4 = this.f5457f;
        if (u4 != null) {
            AbstractC0695v.h((s2.g) u4.f319c);
        }
        U u5 = this.f5457f;
        if (u5 == null) {
            return;
        }
        u5.f318b = false;
    }

    @Override // b.AbstractC0327w
    public final void c(C0306b c0306b) {
        super.c(c0306b);
        U u3 = this.f5457f;
        if (u3 != null) {
            ((s2.g) u3.f319c).p(c0306b);
        }
    }

    @Override // b.AbstractC0327w
    public final void d(C0306b c0306b) {
        super.d(c0306b);
        U u3 = this.f5457f;
        if (u3 != null) {
            u3.c();
        }
        if (this.f5337a) {
            this.f5457f = new U(this.f5455d, true, this.f5456e, this);
        }
    }
}
