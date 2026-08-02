package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgs implements bge {
    public static final bbk a = new bbk("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, bbk.a);
    private final brn b;

    public bgs(brn brnVar) {
        this.b = brnVar;
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        bfv bfvVar = (bfv) obj;
        bgd b = bgd.b(bfvVar);
        bme bmeVar = (bme) this.b.a;
        Object f = bmeVar.f(b);
        b.a();
        bfv bfvVar2 = (bfv) f;
        if (bfvVar2 == null) {
            bmeVar.g(bgd.b(bfvVar), bfvVar);
        } else {
            bfvVar = bfvVar2;
        }
        return new bvw(bfvVar, new bcd(bfvVar, ((Integer) bblVar.b(a)).intValue()));
    }
}
