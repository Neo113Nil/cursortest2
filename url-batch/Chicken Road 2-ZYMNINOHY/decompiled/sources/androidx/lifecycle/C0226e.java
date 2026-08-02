package androidx.lifecycle;

import m1.C1307e;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226e implements InterfaceC0234m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0231j f5038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1307e f5039b;

    public C0226e(AbstractC0231j abstractC0231j, C1307e c1307e) {
        this.f5038a = abstractC0231j;
        this.f5039b = c1307e;
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        if (enumC0229h == EnumC0229h.ON_START) {
            this.f5038a.b(this);
            this.f5039b.d();
        }
    }
}
