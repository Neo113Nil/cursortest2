package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class su extends sy {
    private final void g(sq sqVar) {
        sq sqVar2 = this.h;
        sqVar2.j.add(sqVar);
        sqVar.k.add(sqVar2);
    }

    @Override // defpackage.sy
    public final void b() {
        sd sdVar = this.d;
        if (sdVar instanceof sa) {
            sq sqVar = this.h;
            sqVar.b = true;
            sa saVar = (sa) sdVar;
            int i = saVar.a;
            boolean z = saVar.b;
            int i2 = 0;
            if (i == 0) {
                sqVar.l = 4;
                while (i2 < saVar.aK) {
                    sd sdVar2 = saVar.aJ[i2];
                    if (z || sdVar2.ai != 8) {
                        sq sqVar2 = sdVar2.h.h;
                        sqVar2.j.add(sqVar);
                        sqVar.k.add(sqVar2);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 1) {
                sqVar.l = 5;
                while (i2 < saVar.aK) {
                    sd sdVar3 = saVar.aJ[i2];
                    if (z || sdVar3.ai != 8) {
                        sq sqVar3 = sdVar3.h.i;
                        sqVar3.j.add(sqVar);
                        sqVar.k.add(sqVar3);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 2) {
                sqVar.l = 6;
                while (i2 < saVar.aK) {
                    sd sdVar4 = saVar.aJ[i2];
                    if (z || sdVar4.ai != 8) {
                        sq sqVar4 = sdVar4.i.h;
                        sqVar4.j.add(sqVar);
                        sqVar.k.add(sqVar4);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
                return;
            }
            if (i != 3) {
                return;
            }
            sqVar.l = 7;
            while (i2 < saVar.aK) {
                sd sdVar5 = saVar.aJ[i2];
                if (z || sdVar5.ai != 8) {
                    sq sqVar5 = sdVar5.i.i;
                    sqVar5.j.add(sqVar);
                    sqVar.k.add(sqVar5);
                }
                i2++;
            }
            g(this.d.i.h);
            g(this.d.i.i);
        }
    }

    @Override // defpackage.sy
    public final void c() {
        sd sdVar = this.d;
        if (sdVar instanceof sa) {
            int i = ((sa) sdVar).a;
            if (i == 0 || i == 1) {
                sdVar.aa = this.h.f;
            } else {
                sdVar.ab = this.h.f;
            }
        }
    }

    @Override // defpackage.sy
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override // defpackage.sy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.sy, defpackage.so
    public final void f() {
        sa saVar = (sa) this.d;
        int i = saVar.a;
        sq sqVar = this.h;
        Iterator it = sqVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((sq) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            sqVar.c(i3 + saVar.c);
        } else {
            sqVar.c(i2 + saVar.c);
        }
    }
}
