package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ick implements icz {
    public static final eik a = new eik("frameworks.client.data.advancedhellooneplatform.HelloOnePlatformService.");
    public static final icy b = new icj(1, (byte[]) null);
    public static final icy c = new icj(0);
    public static final icy d = new icj(2, (char[]) null);
    public static final icy e = new icj(3, (short[]) null);
    public static final icy f = new icj(4, (int[]) null);
    public static final icy g = new icj(5, (boolean[]) null);
    public static final icy h = new icj(6, (float[]) null);
    public static final ick i = new ick();
    private static final eik l = new eik("boqhellooneplatform-pa.googleapis.com");
    public final hel j;
    public final hfm k;

    private ick() {
        int i2 = hel.d;
        heg hegVar = new heg(4);
        hegVar.h("autopush-boqhellooneplatform-pa.mtls.sandbox.googleapis.com");
        hegVar.h("autopush-boqhellooneplatform-pa.sandbox.googleapis.com");
        hegVar.h("boqhellooneplatform-pa.mtls.googleapis.com");
        hegVar.h("staging-boqhellooneplatform-pa.mtls.sandbox.googleapis.com");
        hegVar.h("staging-boqhellooneplatform-pa.sandbox.googleapis.com");
        hegVar.h("boqhellooneplatform-pa.googleapis.com");
        this.j = hegVar.g();
        this.k = new hfk().g();
        icy icyVar = b;
        icy icyVar2 = c;
        icy icyVar3 = d;
        icy icyVar4 = e;
        icy icyVar5 = f;
        icy icyVar6 = g;
        icy icyVar7 = h;
        hfm.s(icyVar, icyVar2, icyVar3, icyVar4, icyVar5, icyVar6, icyVar7);
        hen henVar = new hen(4);
        henVar.g("ConsistencyTokenDemo", icyVar);
        henVar.g("Hello", icyVar2);
        henVar.g("SetGreetingTemplate", icyVar3);
        henVar.g("HelloWithAuth", icyVar4);
        henVar.g("HelloWithReauth", icyVar5);
        henVar.g("HelloWithLanguageContext", icyVar6);
        henVar.g("CustomErrorDetails", icyVar7);
        henVar.d(true);
        new hen(4).d(true);
    }

    @Override // defpackage.icz
    public final eik a() {
        return l;
    }
}
