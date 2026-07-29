package android.support.constraint.a.a;

import android.support.constraint.a.a.a;
import java.util.ArrayList;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class d extends b {
    protected float aa = -1.0f;
    protected int ab = -1;
    protected int ac = -1;
    private a ad = this.j;
    private int ae = 0;
    private boolean af = false;
    private int ag = 0;
    private f ah = new f();
    private int ai = 8;

    public d() {
        this.q.clear();
        this.q.add(this.ad);
    }

    public void m(int i) {
        if (this.ae == i) {
            return;
        }
        this.ae = i;
        this.q.clear();
        if (this.ae == 1) {
            this.ad = this.i;
        } else {
            this.ad = this.j;
        }
        this.q.add(this.ad);
    }

    public int D() {
        return this.ae;
    }

    @Override // android.support.constraint.a.a.b
    public a a(a.c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.ae == 1) {
                    break;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.ae == 0) {
                    break;
                }
                break;
        }
        return this.ad;
    }

    @Override // android.support.constraint.a.a.b
    public ArrayList<a> y() {
        return this.q;
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.aa = f;
            this.ab = -1;
            this.ac = -1;
        }
    }

    public void n(int i) {
        if (i > -1) {
            this.aa = -1.0f;
            this.ab = i;
            this.ac = -1;
        }
    }

    public void o(int i) {
        if (i > -1) {
            this.aa = -1.0f;
            this.ab = -1;
            this.ac = i;
        }
    }

    public float E() {
        return this.aa;
    }

    public int F() {
        return this.ab;
    }

    public int G() {
        return this.ac;
    }

    @Override // android.support.constraint.a.a.b
    public void a(android.support.constraint.a.e eVar, int i) {
        c cVar = (c) c();
        if (cVar == null) {
            return;
        }
        a a2 = cVar.a(a.c.LEFT);
        a a3 = cVar.a(a.c.RIGHT);
        if (this.ae == 0) {
            a2 = cVar.a(a.c.TOP);
            a3 = cVar.a(a.c.BOTTOM);
        }
        if (this.ab != -1) {
            eVar.a(android.support.constraint.a.e.a(eVar, eVar.a(this.ad), eVar.a(a2), this.ab, false));
        } else if (this.ac != -1) {
            eVar.a(android.support.constraint.a.e.a(eVar, eVar.a(this.ad), eVar.a(a3), -this.ac, false));
        } else if (this.aa != -1.0f) {
            eVar.a(android.support.constraint.a.e.a(eVar, eVar.a(this.ad), eVar.a(a2), eVar.a(a3), this.aa, this.af));
        }
    }

    @Override // android.support.constraint.a.a.b
    public void b(android.support.constraint.a.e eVar, int i) {
        if (c() == null) {
            return;
        }
        int b2 = eVar.b(this.ad);
        if (this.ae == 1) {
            b(b2);
            c(0);
            e(c().l());
            d(0);
            return;
        }
        b(0);
        c(b2);
        d(c().h());
        e(0);
    }
}
