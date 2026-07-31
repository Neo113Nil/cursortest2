package B;

import I.InterfaceC0142c0;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import n.p0;
import n.r0;

/* loaded from: classes.dex */
public final class g0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O0.b f402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(O0.b bVar, InterfaceC0142c0 interfaceC0142c0, int i3) {
        super(1);
        this.f401e = i3;
        this.f402f = bVar;
        this.f403g = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f401e) {
            case 0:
                long j3 = ((O0.g) obj).f3733a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                O0.b bVar = this.f402f;
                this.f403g.setValue(new O0.j(O2.d.d(bVar.l(intBitsToFloat), bVar.l(Float.intBitsToFloat((int) (j3 & 4294967295L))))));
                return R1.y.f4171a;
            default:
                U.n nVar = U.n.f4488a;
                A0.l lVar = new A0.l(2, (InterfaceC0422a) obj);
                g0 g0Var = new g0(this.f402f, this.f403g, 0);
                if (n.d0.a()) {
                    return n.d0.a() ? new MagnifierElement(lVar, null, g0Var, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? p0.f7186a : r0.f7192a) : nVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
