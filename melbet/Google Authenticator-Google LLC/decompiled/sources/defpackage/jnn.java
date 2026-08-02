package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnn implements icz {
    public static final eik a = new eik("google.internal.identity.passbox.passbox.v1.PassboxExternalService.");
    public static final eik b = new eik("google.internal.identity.passbox.passbox.v1.PassboxExternalService/");
    public static final icy c = new icj(7, (byte[][]) null);
    public static final icy d = new icj(8, (char[][]) null);
    public static final icy e = new icj(9, (short[][]) null);
    public static final icy f = new icj(10, (int[][]) null);
    public static final icy g = new icj(11, (boolean[][]) null);
    public static final icy h = new icj(12, (float[][]) null);
    public static final icy i = new icj(13, (byte[][][]) null);
    public static final icy j = new icj(14, (char[][][]) null);
    public static final icy k = new icj(15, (short[][][]) null);
    public static final jnn l = new jnn();
    public static final eik m = new eik("passbox-pa.googleapis.com");
    public final hel n;
    public final hfm o;
    public final her p;

    private jnn() {
        int i2 = hel.d;
        heg hegVar = new heg(4);
        hegVar.h("autopush-passbox-pa.mtls.sandbox.googleapis.com");
        hegVar.h("autopush-passbox-pa.sandbox.googleapis.com");
        hegVar.h("passbox-pa.mtls.googleapis.com");
        hegVar.h("staging-passbox-pa.mtls.sandbox.googleapis.com");
        hegVar.h("staging-passbox-pa.sandbox.googleapis.com");
        hegVar.h("passbox-pa.googleapis.com");
        this.n = hegVar.g();
        this.o = new hfk().g();
        icy icyVar = c;
        icy icyVar2 = d;
        icy icyVar3 = e;
        icy icyVar4 = f;
        icy icyVar5 = g;
        icy icyVar6 = h;
        icy icyVar7 = i;
        icy icyVar8 = j;
        icy icyVar9 = k;
        hfm.s(icyVar, icyVar2, icyVar3, icyVar4, icyVar5, icyVar6, icyVar7, icyVar8, icyVar9);
        hen henVar = new hen(4);
        henVar.g("CreateCredential", icyVar);
        henVar.g("GetCredential", icyVar2);
        henVar.g("GetCredentialCount", icyVar3);
        henVar.g("ListCredentials", icyVar4);
        henVar.g("UpdateCredential", icyVar5);
        henVar.g("DeleteCredential", icyVar6);
        henVar.g("CheckExistCredential", icyVar7);
        henVar.g("BatchDeleteCredentials", icyVar8);
        henVar.g("BatchUpdateCredentials", icyVar9);
        this.p = henVar.d(true);
        new hen(4).d(true);
    }

    @Override // defpackage.icz
    public final eik a() {
        return m;
    }
}
