package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class et extends kr {
    public final es a;
    private final e e;

    protected et(ez ezVar) {
        e eVar = new e();
        this.e = eVar;
        es esVar = new es(new ev(this), new eq(ezVar).a());
        this.a = esVar;
        esVar.c.add(eVar);
    }

    @Override // defpackage.kr
    public final int a() {
        return this.a.e.size();
    }
}
