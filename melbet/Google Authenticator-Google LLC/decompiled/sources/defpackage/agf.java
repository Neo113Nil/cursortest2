package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agf implements koi {
    private final ktj a;
    private final kri b;
    private final kri c;
    private final kri d;
    private agd e;

    public agf(ktj ktjVar, kri kriVar, kri kriVar2, kri kriVar3) {
        this.a = ktjVar;
        this.b = kriVar;
        this.c = kriVar2;
        this.d = kriVar3;
    }

    @Override // defpackage.koi
    public final /* bridge */ /* synthetic */ Object a() {
        agd agdVar = this.e;
        if (agdVar != null) {
            return agdVar;
        }
        agk agkVar = (agk) this.b.a();
        agh aghVar = (agh) this.c.a();
        ago agoVar = (ago) this.d.a();
        agkVar.getClass();
        aghVar.getClass();
        agoVar.getClass();
        agd b = new agj(agkVar, aghVar, agoVar).b(this.a);
        this.e = b;
        return b;
    }

    @Override // defpackage.koi
    public final boolean b() {
        throw null;
    }
}
