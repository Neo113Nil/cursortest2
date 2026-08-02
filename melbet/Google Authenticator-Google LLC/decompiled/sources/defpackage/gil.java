package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gil implements ghh {
    private final AtomicReference a;

    public gil(Map map, ghm ghmVar) {
        this.a = new AtomicReference(new gik(map, ghmVar, false));
    }

    @Override // defpackage.ghh
    public final ggn a(String str, krt krtVar) {
        gik gikVar;
        gik gikVar2 = null;
        while (true) {
            AtomicReference atomicReference = this.a;
            gikVar = (gik) atomicReference.get();
            gikVar.getClass();
            boolean z = gikVar.b;
            if (z) {
                break;
            }
            if (gikVar2 == null) {
                gikVar2 = new gik(gikVar.c, gikVar.a, true);
            } else {
                her herVar = gikVar.c;
                herVar.getClass();
                gikVar2.c = herVar;
                ghm ghmVar = gikVar.a;
                ghmVar.getClass();
                gikVar2.a = ghmVar;
            }
            if (a.a(atomicReference, gikVar, gikVar2)) {
                if (!z) {
                    krtVar.a(gikVar.a);
                }
                gikVar = gikVar2;
            }
        }
        Object p = ixd.p(gikVar.c, str);
        p.getClass();
        return (ggn) p;
    }

    @Override // defpackage.ghh
    public final ghm b() {
        return ((gik) this.a.get()).a;
    }

    @Override // defpackage.ghh
    public final void c() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    @Override // defpackage.ghh
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ghh
    public final boolean e(Map map, ghm ghmVar) {
        AtomicReference atomicReference;
        gik gikVar;
        gik gikVar2 = null;
        do {
            atomicReference = this.a;
            gikVar = (gik) atomicReference.get();
            if (gikVar.b) {
                return false;
            }
            if (gikVar2 == null) {
                gikVar2 = new gik(map, ghmVar, false);
            }
        } while (!a.a(atomicReference, gikVar, gikVar2));
        return true;
    }
}
