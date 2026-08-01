package K0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i extends A1.d {
    @Override // A1.d
    public final void E(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(RecyclerView.A0, RecyclerView.A0, f4, f4);
        qVar.f457f = 180.0f;
        qVar.f458g = 90.0f;
        uVar.f468f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f469g.add(oVar);
        uVar.d = 270.0f;
        float f5 = (RecyclerView.A0 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.A0) / 2.0f;
        double d = 270.0f;
        uVar.f465b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        uVar.f466c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
