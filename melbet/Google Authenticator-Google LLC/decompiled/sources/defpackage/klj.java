package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klj implements kmb {
    public final klk a;
    private final jxk b;
    private final ixf c;

    public klj(klk klkVar, ixf ixfVar, jxk jxkVar) {
        this.a = klkVar;
        this.c = ixfVar;
        this.b = jxkVar;
        jxkVar.d(new kli(this, 0), huf.a);
    }

    @Override // defpackage.kmb
    public final void a(kbq kbqVar) {
        int i = kob.a;
        klk klkVar = this.a;
        jyu jyuVar = null;
        try {
            if (kbqVar.g()) {
                this.c.b();
            } else {
                klkVar.c = true;
                this.c.a();
                kbq e = kbq.c.e("RPC cancelled");
                jzw jzwVar = jyt.a;
                jyuVar = new jyu(e);
            }
        } finally {
            this.b.j(null);
        }
    }

    @Override // defpackage.kmb
    public final void b() {
        int i = kob.a;
        if (this.a.c) {
            return;
        }
        this.c.c();
    }

    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        int i = kob.a;
        klk klkVar = this.a;
        if (klkVar.c) {
            khd.e(kmoVar);
            return;
        }
        while (true) {
            try {
                InputStream e = kmoVar.e();
                if (e == null) {
                    return;
                }
                try {
                    this.c.d(klkVar.a.d.b(e));
                    e.close();
                } finally {
                }
            } catch (Throwable th) {
                khd.e(kmoVar);
                hag.b(th);
                throw new RuntimeException(th);
            }
        }
    }

    @Override // defpackage.kmp
    public final void e() {
        int i = kob.a;
        if (this.a.c) {
            return;
        }
        this.c.e();
    }
}
