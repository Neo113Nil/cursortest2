package a0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f85g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.a f86h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f87i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j8, q6.a aVar, boolean z8) {
        super(1);
        this.f85g = j8;
        this.f86h = aVar;
        this.f87i = z8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        w0.c cVar = (w0.c) obj;
        z0.h q8 = a.a.q(cVar, y0.f.d(cVar.f9477f.d()) / 2.0f);
        int i7 = Build.VERSION.SDK_INT;
        long j8 = this.f85g;
        return cVar.b(new h(this.f86h, this.f87i, q8, new z0.m(j8, 5, i7 >= 29 ? z0.n.f10013a.a(j8, 5) : new PorterDuffColorFilter(z0.l0.w(j8), z0.l0.z(5)))));
    }
}
