package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class exg extends kmx {
    public exg() {
        super(kqo.a);
    }

    public Object a(ewz ewzVar, kqj kqjVar) {
        throw null;
    }

    public Object b(exd exdVar) {
        throw null;
    }

    public Object c(exb exbVar) {
        throw null;
    }

    @Override // defpackage.jwu
    public final kuq e() {
        kbl kblVar = exf.a;
        if (kblVar == null) {
            synchronized (exf.class) {
                kblVar = exf.a;
                if (kblVar == null) {
                    kuq kuqVar = new kuq("com.google.android.libraries.restore.osmigration.systemappapi.TargetService");
                    kuqVar.e(exf.a());
                    kuqVar.e(exf.b());
                    kuqVar.e(exf.c());
                    kblVar = new kbl(kuqVar);
                    exf.a = kblVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        kqn kqnVar = this.b;
        kuq c = koc.c(kqnVar, exf.a(), new ajv((Object) this, 2, (char[]) null));
        String str = kblVar.a;
        ixg.k(c, str, hashMap);
        ixg.k(koc.c(kqnVar, exf.b(), new ajv((Object) this, 3, (short[]) null)), str, hashMap);
        ixg.k(koc.c(kqnVar, exf.c(), new ajv(this, 4, (int[]) null)), str, hashMap);
        return ixg.j(str, kblVar, hashMap);
    }

    public exg(kqn kqnVar) {
        super(kqnVar);
    }
}
