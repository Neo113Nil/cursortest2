package A;

import G.InterfaceC0191c0;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.m0;
import m.o0;

/* loaded from: classes.dex */
public final class h0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M0.b f150e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f151i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(M0.b bVar, InterfaceC0191c0 interfaceC0191c0, int i2) {
        super(1);
        this.f149d = i2;
        this.f150e = bVar;
        this.f151i = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f149d) {
            case 0:
                long j4 = ((M0.g) obj).f3547a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                M0.b bVar = this.f150e;
                this.f151i.setValue(new M0.j(u3.d.c(bVar.l(intBitsToFloat), bVar.l(Float.intBitsToFloat((int) (j4 & 4294967295L))))));
                return Unit.f7487a;
            default:
                S.l lVar = S.l.f3977a;
                g0 g0Var = new g0(0, (Function0) obj);
                h0 h0Var = new h0(this.f150e, this.f151i, 0);
                if (m.a0.a()) {
                    return m.a0.a() ? new MagnifierElement(g0Var, null, h0Var, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? m0.f8145a : o0.f8151a) : lVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
