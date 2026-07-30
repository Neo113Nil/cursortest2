package C3;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i extends U2.a {
    @Override // U2.a
    public final void h(u uVar, float f6, float f9) {
        uVar.d(f9 * f6, 180.0f, 90.0f);
        float f10 = f9 * 2.0f * f6;
        q qVar = new q(0.0f, 0.0f, f10, f10);
        qVar.f467f = 180.0f;
        qVar.f468g = 90.0f;
        ((ArrayList) uVar.f479f).add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        ((ArrayList) uVar.f480g).add(oVar);
        uVar.f477d = 270.0f;
        float f11 = (0.0f + f10) * 0.5f;
        float f12 = (f10 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        uVar.f475b = (((float) Math.cos(Math.toRadians(d2))) * f12) + f11;
        uVar.f476c = (f12 * ((float) Math.sin(Math.toRadians(d2)))) + f11;
    }
}
