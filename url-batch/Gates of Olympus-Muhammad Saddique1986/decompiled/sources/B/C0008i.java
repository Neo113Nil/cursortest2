package B;

import a0.C0241f;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.C0338g;
import b0.C0344m;
import b0.C0345n;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;

/* renamed from: B.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008i extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008i(long j3, InterfaceC0422a interfaceC0422a, boolean z3) {
        super(1);
        this.f410e = j3;
        this.f411f = interfaceC0422a;
        this.f412g = z3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        Y.c cVar = (Y.c) obj;
        C0338g w2 = AbstractC0508a.w(cVar, C0241f.d(cVar.f4651d.d()) / 2.0f);
        int i3 = Build.VERSION.SDK_INT;
        long j3 = this.f410e;
        return cVar.b(new C0007h(this.f411f, this.f412g, w2, new C0344m(j3, 5, i3 >= 29 ? C0345n.f5427a.a(j3, 5) : new PorterDuffColorFilter(b0.M.D(j3), b0.M.G(5)))));
    }
}
