package m;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class o0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f8151a = new o0();

    @Override // m.k0
    public final boolean a() {
        return true;
    }

    @Override // m.k0
    public final j0 b(View view, boolean z4, long j4, float f4, float f5, boolean z5, M0.b bVar, float f6) {
        if (z4) {
            return new n0(new Magnifier(view));
        }
        long E3 = bVar.E(j4);
        float L3 = bVar.L(f4);
        float L4 = bVar.L(f5);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (E3 != 9205357640488583168L) {
            builder.setSize(O2.c.a(Y.f.d(E3)), O2.c.a(Y.f.b(E3)));
        }
        if (!Float.isNaN(L3)) {
            builder.setCornerRadius(L3);
        }
        if (!Float.isNaN(L4)) {
            builder.setElevation(L4);
        }
        if (!Float.isNaN(f6)) {
            builder.setInitialZoom(f6);
        }
        builder.setClippingEnabled(z5);
        return new n0(builder.build());
    }
}
