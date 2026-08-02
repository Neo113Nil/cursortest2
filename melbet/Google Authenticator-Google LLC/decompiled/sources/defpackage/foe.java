package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class foe extends fny {
    public final float a;

    public foe() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.fny
    public final void a(foq foqVar, float f, float f2) {
        float f3 = f2 * f;
        foqVar.e(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        fom fomVar = new fom(0.0f, 0.0f, f4, f4);
        fomVar.e = 180.0f;
        fomVar.f = 90.0f;
        foqVar.f.add(fomVar);
        foqVar.b(new fok(fomVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        foqVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        foqVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
