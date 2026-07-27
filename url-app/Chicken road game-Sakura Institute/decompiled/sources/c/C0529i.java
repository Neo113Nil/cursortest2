package c;

import G.InterfaceC0191c0;
import M2.E;
import b.C0487b;
import b.v;
import kotlin.jvm.functions.Function2;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529i extends v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f5719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3.c f5720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f5721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0529i(boolean z4, E e4, b3.c cVar, InterfaceC0191c0 interfaceC0191c0) {
        super(z4);
        this.f5719d = e4;
        this.f5720e = cVar;
        this.f5721f = interfaceC0191c0;
    }

    @Override // b.v
    public final void a() {
        E e4 = this.f5719d;
        C0526f c0526f = (C0526f) e4.f3580d;
        if (c0526f != null) {
            c0526f.a();
        }
        C0526f c0526f2 = (C0526f) e4.f3580d;
        if (c0526f2 == null) {
            return;
        }
        c0526f2.f5709a = false;
    }

    @Override // b.v
    public final void b() {
        E e4 = this.f5719d;
        C0526f c0526f = (C0526f) e4.f3580d;
        if (c0526f != null && !c0526f.f5709a) {
            c0526f.a();
            e4.f3580d = null;
        }
        if (e4.f3580d == null) {
            e4.f3580d = new C0526f(this.f5720e, false, (Function2) this.f5721f.getValue());
        }
        C0526f c0526f2 = (C0526f) e4.f3580d;
        if (c0526f2 != null) {
            c0526f2.f5710b.g(null, false);
        }
        C0526f c0526f3 = (C0526f) e4.f3580d;
        if (c0526f3 == null) {
            return;
        }
        c0526f3.f5709a = false;
    }

    @Override // b.v
    public final void c(C0487b c0487b) {
        super.c(c0487b);
        C0526f c0526f = (C0526f) this.f5719d.f3580d;
        if (c0526f != null) {
            c0526f.f5710b.o(c0487b);
        }
    }

    @Override // b.v
    public final void d(C0487b c0487b) {
        super.d(c0487b);
        E e4 = this.f5719d;
        C0526f c0526f = (C0526f) e4.f3580d;
        if (c0526f != null) {
            c0526f.a();
        }
        e4.f3580d = new C0526f(this.f5720e, true, (Function2) this.f5721f.getValue());
    }
}
