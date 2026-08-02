package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glq extends ael {
    private gsh f;

    public glq(bg bgVar) {
        super(bgVar);
    }

    @Override // defpackage.ael
    public final void b(aej aejVar) {
        ael.e("getObserverCount");
        if (this.d.k() <= 0) {
            super.b(aejVar);
            return;
        }
        gsh gshVar = this.f;
        int ordinal = aejVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                guc gucVar = gub.a;
                gucVar.getClass();
                gshVar.r("Lifecycle.Started", gucVar);
            } else if (ordinal == 2) {
                guc gucVar2 = gub.a;
                gucVar2.getClass();
                gshVar.r("Lifecycle.Resumed", gucVar2);
            } else if (ordinal == 3) {
                guc gucVar3 = gub.a;
                gucVar3.getClass();
                gshVar.r("Lifecycle.Paused", gucVar3);
            } else if (ordinal == 4) {
                guc gucVar4 = gub.a;
                gucVar4.getClass();
                gshVar.r("Lifecycle.Stopped", gucVar4);
            } else {
                if (ordinal != 5) {
                    Objects.toString(aejVar);
                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(aejVar.toString()));
                }
                guc gucVar5 = gub.a;
                gucVar5.getClass();
                gshVar.r("Lifecycle.Destroyed", gucVar5);
            }
        } else if (gshVar.e == null) {
            guc gucVar6 = gub.a;
            gucVar6.getClass();
            gshVar.r("Lifecycle.Created", gucVar6);
            gshVar.d = true;
        }
        try {
            super.b(aejVar);
        } finally {
            this.f.p(aejVar);
        }
    }

    public final void f(gsh gshVar) {
        hoq.I(this.f == null, "Activity was already created");
        this.f = gshVar;
    }
}
