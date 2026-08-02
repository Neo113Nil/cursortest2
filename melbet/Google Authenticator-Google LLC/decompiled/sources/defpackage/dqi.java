package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqi implements dps {
    public final hel a;
    private boolean c;
    private Object d;
    private final dze e = new dze((byte[]) null);
    public final Map b = new HashMap();

    public dqi(hel helVar, aer aerVar) {
        this.a = helVar;
        int i = ((his) helVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            final dpp dppVar = (dpp) helVar.get(i2);
            dppVar.a.d(aerVar, new afd() { // from class: dqh
                @Override // defpackage.afd
                public final void a(Object obj) {
                    gzp gzpVar = (gzp) obj;
                    fao.c();
                    boolean f = gzpVar.f();
                    dqi dqiVar = dqi.this;
                    dpp dppVar2 = dppVar;
                    if (f) {
                        dqiVar.b.put(dppVar2, (dpo) gzpVar.b());
                    } else {
                        dqiVar.b.remove(dppVar2);
                    }
                    dqiVar.c();
                }
            });
        }
        c();
    }

    @Override // defpackage.dps
    public final dze b(Object obj) {
        if (obj != this.d) {
            fao.c();
            this.d = obj;
            this.c = true;
            hel helVar = this.a;
            for (int i = 0; i < ((his) helVar).c; i++) {
                ((dpp) helVar.get(i)).a(obj);
            }
            this.c = false;
            c();
        }
        return this.e;
    }

    public final void c() {
        fao.c();
        if (this.c) {
            return;
        }
        hel helVar = this.a;
        dpo dpoVar = null;
        for (int i = 0; i < ((his) helVar).c; i++) {
            dpo dpoVar2 = (dpo) this.b.get((dpp) helVar.get(i));
            if (dpoVar2 != null && (dpoVar == null || dpoVar2.compareTo(dpoVar) > 0)) {
                dpoVar = dpoVar2;
            }
        }
        gzp g = gzp.g(dpoVar);
        if (!g.f()) {
            this.e.d(null);
        } else {
            this.e.d((dpo) g.b());
        }
    }

    @Override // defpackage.dps
    public final /* synthetic */ void a() {
    }
}
