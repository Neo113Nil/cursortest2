package R0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i extends H1.d {
    @Override // H1.d
    public final void A(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(RecyclerView.f1937A0, RecyclerView.f1937A0, f4, f4);
        qVar.f972f = 180.0f;
        qVar.f973g = 90.0f;
        uVar.f983f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f984g.add(oVar);
        uVar.d = 270.0f;
        float f5 = (RecyclerView.f1937A0 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.f1937A0) / 2.0f;
        double d = 270.0f;
        uVar.f980b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        uVar.f981c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
