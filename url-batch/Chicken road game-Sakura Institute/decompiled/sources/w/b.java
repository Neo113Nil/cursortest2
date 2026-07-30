package w;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import o.s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9192g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f9193h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j8, int i7) {
        super(1);
        this.f9192g = i7;
        this.f9193h = j8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f9192g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                w0.c cVar = (w0.c) obj;
                float d8 = y0.f.d(cVar.f9477f.d()) / 2.0f;
                z0.h q8 = a.a.q(cVar, d8);
                int i7 = Build.VERSION.SDK_INT;
                long j8 = this.f9193h;
                return cVar.b(new s1(d8, q8, new z0.m(j8, 5, i7 >= 29 ? z0.n.f10013a.a(j8, 5) : new PorterDuffColorFilter(z0.l0.w(j8), z0.l0.z(5)))));
            default:
                ((y1.i) obj).m(a0.g0.f72c, new a0.f0(z.f9467f, this.f9193h, 2, true));
                return d6.z.f2639a;
        }
    }
}
