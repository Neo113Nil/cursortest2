package n;

import a0.C0241f;
import android.view.View;
import android.widget.Magnifier;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class r0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f7192a = new r0();

    @Override // n.n0
    public final m0 a(View view, boolean z3, long j3, float f3, float f4, boolean z4, O0.b bVar, float f5) {
        if (z3) {
            return new q0(new Magnifier(view));
        }
        long E3 = bVar.E(j3);
        float J3 = bVar.J(f3);
        float J4 = bVar.J(f4);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (E3 != 9205357640488583168L) {
            builder.setSize(AbstractC0508a.Q(C0241f.d(E3)), AbstractC0508a.Q(C0241f.b(E3)));
        }
        if (!Float.isNaN(J3)) {
            builder.setCornerRadius(J3);
        }
        if (!Float.isNaN(J4)) {
            builder.setElevation(J4);
        }
        if (!Float.isNaN(f5)) {
            builder.setInitialZoom(f5);
        }
        builder.setClippingEnabled(z4);
        return new q0(builder.build());
    }

    @Override // n.n0
    public final boolean b() {
        return true;
    }
}
