package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cke implements dcy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cke(dbw dbwVar, etm etmVar, int i) {
        this.c = i;
        this.b = dbwVar;
        this.a = etmVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [gzf, java.lang.Object] */
    @Override // defpackage.dcy
    public final Object a(ddi ddiVar) {
        cjx cjxVar;
        int i = this.c;
        if (i == 0) {
            if (ddiVar.f()) {
                cjxVar = (cjx) ddiVar.d();
            } else {
                Log.e("ClearcutLoggerApiImpl", "Error sampling log.", ddiVar.c());
                cjxVar = cjx.b;
            }
            return ((ddw) this.a).o((cjf) this.b, cjxVar);
        }
        if (i == 1) {
            if (ddiVar.f()) {
                return (ddi) this.a.a(this.b);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", ddiVar.c());
            return ddiVar;
        }
        boolean z = ddiVar.c() instanceof cnf;
        Object obj = this.a;
        Object obj2 = this.b;
        if (z) {
            return ((dbw) obj2).b(((etm) obj).c);
        }
        if (ddiVar.c() instanceof cmm) {
            cmm cmmVar = (cmm) ddiVar.c();
            cmmVar.getClass();
            if (cmmVar.a() == 29514) {
                return ((dbw) obj2).b(((etm) obj).c);
            }
        }
        return ddiVar;
    }

    public /* synthetic */ cke(Object obj, cjf cjfVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = cjfVar;
    }
}
