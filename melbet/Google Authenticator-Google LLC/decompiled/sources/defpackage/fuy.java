package defpackage;

import j$.time.Instant;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuy {
    public final koe a;
    public final koe b;
    public final int c;
    public final Executor d;
    public final fcu e;
    public final fwm f;
    private final hum g = new hum();

    public fuy(koe koeVar, fwm fwmVar, fcu fcuVar, koe koeVar2, int i, Executor executor) {
        this.a = koeVar;
        this.f = fwmVar;
        this.e = fcuVar;
        this.b = koeVar2;
        this.c = i;
        this.d = executor;
    }

    public final hvi a() {
        final long epochMilli = Instant.now().toEpochMilli();
        return this.g.a(gvx.b(new htq() { // from class: fuw
            @Override // defpackage.htq
            public final hvi a() {
                fuy fuyVar = fuy.this;
                hvi d = fuyVar.e.d();
                boolean isEmpty = hfm.n(((fwm) fuyVar.a.b()).d().values()).isEmpty();
                long j = epochMilli;
                if (isEmpty) {
                    return hti.g(d, gvx.c(new cax(fuyVar, j, 2)), fuyVar.d);
                }
                htr c = gvx.c(new doj(fuyVar, 19));
                Executor executor = fuyVar.d;
                return hti.g(hti.g(hvc.v(hti.g(d, c, executor)), gvx.c(new doj(fuyVar, 20)), executor), gvx.c(new bpm(fuyVar, j, d, 8)), executor);
            }
        }), this.d);
    }

    public final hvi b(final long j, final fuz fuzVar) {
        return this.e.a(new gzf() { // from class: fux
            @Override // defpackage.gzf
            public final Object a(Object obj) {
                fuz fuzVar2 = (fuz) obj;
                int i = fuzVar2.b;
                int i2 = i & 1;
                long j2 = j;
                if (i2 == 0 && (i & 2) != 0) {
                    long j3 = fuzVar2.d;
                    if (j3 > j2) {
                        fuz fuzVar3 = fuzVar;
                        if ((fuzVar3.b & 2) == 0 || fuzVar3.d != j3) {
                            return fuzVar2;
                        }
                    }
                }
                jkj C = fuzVar2.C();
                if (!C.b.M()) {
                    C.t();
                }
                fuy fuyVar = fuy.this;
                jkp jkpVar = C.b;
                fuz fuzVar4 = (fuz) jkpVar;
                fuzVar4.b |= 1;
                fuzVar4.c = j2;
                if (!jkpVar.M()) {
                    C.t();
                }
                int i3 = fuyVar.c;
                jkp jkpVar2 = C.b;
                fuz fuzVar5 = (fuz) jkpVar2;
                fuzVar5.b |= 4;
                fuzVar5.e = i3;
                if (!jkpVar2.M()) {
                    C.t();
                }
                fuz fuzVar6 = (fuz) C.b;
                fuzVar6.b &= -3;
                fuzVar6.d = 0L;
                return (fuz) C.q();
            }
        }, huf.a);
    }

    public final void c(hvi hviVar) {
        hnu.aS(hviVar, gvx.f(new gai(this, 1)), this.d);
    }

    public final hvi d() {
        return this.e.d();
    }
}
