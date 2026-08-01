package J0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i extends w1.l {
    @Override // w1.l
    public final void x(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(RecyclerView.f1530C0, RecyclerView.f1530C0, f4, f4);
        qVar.f390f = 180.0f;
        qVar.f391g = 90.0f;
        uVar.f401f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f402g.add(oVar);
        uVar.d = 270.0f;
        float f5 = (RecyclerView.f1530C0 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.f1530C0) / 2.0f;
        double d = 270.0f;
        uVar.f398b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        uVar.f399c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
