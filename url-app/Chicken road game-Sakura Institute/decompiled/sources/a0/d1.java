package a0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f41g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m2.b f42h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f43i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(m2.b bVar, g0.z0 z0Var, int i7) {
        super(1);
        this.f41g = i7;
        this.f42h = bVar;
        this.f43i = z0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f41g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j8 = ((m2.g) obj).f6314a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                m2.b bVar = this.f42h;
                this.f43i.setValue(new m2.j(j1.c.G(bVar.K(intBitsToFloat), bVar.K(Float.intBitsToFloat((int) (j8 & 4294967295L))))));
                return d6.z.f2639a;
            default:
                c1 c1Var = new c1((q6.a) obj, 0);
                d1 d1Var = new d1(this.f42h, this.f43i, 0);
                if (m.o0.a()) {
                    return m.o0.a() ? new MagnifierElement(c1Var, d1Var, Build.VERSION.SDK_INT == 28 ? m.a1.f6107b : m.a1.f6108c) : s0.l.f8103a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
