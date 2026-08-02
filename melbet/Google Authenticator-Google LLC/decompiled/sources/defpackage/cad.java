package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cad {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/osmigrationtargetservice/dataservice/StagedMigrationImporterImpl");
    public final bov b;
    public final kvm c;
    public final car d;
    public final caa e;

    public cad(car carVar, caa caaVar, bov bovVar, dih dihVar, kvm kvmVar) {
        dihVar.getClass();
        kvmVar.getClass();
        this.d = carVar;
        this.e = caaVar;
        this.b = bovVar;
        this.c = kvmVar;
    }

    public final void a(int i, String str) {
        jkj k = hqu.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        hqu hquVar = (hqu) jkpVar;
        hquVar.j = i - 2;
        hquVar.b |= 256;
        if (str != null) {
            if (!jkpVar.M()) {
                k.t();
            }
            hqu hquVar2 = (hqu) k.b;
            hquVar2.b |= 512;
            hquVar2.k = str;
        }
        bov bovVar = this.b;
        jkj k2 = hqs.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        hqs hqsVar = (hqs) k2.b;
        hqsVar.c = 37;
        hqsVar.b |= 1;
        hqu hquVar3 = (hqu) k.q();
        if (!k2.b.M()) {
            k2.t();
        }
        hqs hqsVar2 = (hqs) k2.b;
        hquVar3.getClass();
        hqsVar2.j = hquVar3;
        hqsVar2.b |= 512;
        bovVar.a((hqs) k2.q());
    }
}
