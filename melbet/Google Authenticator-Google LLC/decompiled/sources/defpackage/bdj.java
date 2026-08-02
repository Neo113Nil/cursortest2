package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdj {
    public final bcr a;
    public final bev b;
    public final car c;
    public final efg d;
    public final cme e;
    public final ifn f;
    public final ajz g;
    public final brn h;

    public bdj(bev bevVar, brn brnVar, bfc bfcVar, bfc bfcVar2, bfc bfcVar3) {
        this.b = bevVar;
        cme cmeVar = new cme(brnVar);
        this.e = cmeVar;
        bcr bcrVar = new bcr();
        this.a = bcrVar;
        synchronized (this) {
            try {
                synchronized (bcrVar) {
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.g = new ajz(null);
                this.h = new brn((boolean[]) null);
                this.c = new car(bfcVar, bfcVar2, bfcVar3, this, this);
                this.f = new ifn(cmeVar);
                this.d = new efg((byte[]) null);
                bevVar.a = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final synchronized void a(bdn bdnVar, bbh bbhVar) {
        this.h.u(bbhVar, bdnVar);
    }

    public final synchronized void b(bdn bdnVar, bbh bbhVar, bdp bdpVar) {
        if (bdpVar != null) {
            if (bdpVar.a) {
                this.a.b(bbhVar, bdpVar);
            }
        }
        this.h.u(bbhVar, bdnVar);
    }
}
