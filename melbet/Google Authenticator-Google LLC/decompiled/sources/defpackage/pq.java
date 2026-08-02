package defpackage;

import android.content.DialogInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pq extends agd {
    private pv A;
    private px B;
    public pe a;
    public pc b;
    public DialogInterface.OnClickListener c;
    public DialogInterface.OnClickListener d;
    public CharSequence e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public afc o;
    public afc p;
    public afc q;
    public afc r;
    public afc s;
    public afc t;
    public afc v;
    public afc x;
    public afc y;
    public ox z;
    public int f = 0;
    public boolean u = true;
    public int w = 0;

    public static void p(afc afcVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            afcVar.i(obj);
        } else {
            afcVar.k(obj);
        }
    }

    final pv a() {
        pv pvVar = this.A;
        if (pvVar != null) {
            return pvVar;
        }
        pv pvVar2 = new pv(new po(this));
        this.A = pvVar2;
        return pvVar2;
    }

    final px b() {
        px pxVar = this.B;
        if (pxVar != null) {
            return pxVar;
        }
        px pxVar2 = new px();
        this.B = pxVar2;
        return pxVar2;
    }

    final CharSequence d() {
        pe peVar = this.a;
        if (peVar != null) {
            return peVar.c;
        }
        return null;
    }

    final CharSequence e() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        if (this.a != null) {
            return "";
        }
        return null;
    }

    final CharSequence f() {
        pe peVar = this.a;
        if (peVar != null) {
            return peVar.b;
        }
        return null;
    }

    final CharSequence g() {
        pe peVar = this.a;
        if (peVar != null) {
            return peVar.a;
        }
        return null;
    }

    final void h(pw pwVar) {
        afc afcVar = this.p;
        if (afcVar == null) {
            afcVar = new afc();
            this.p = afcVar;
        }
        p(afcVar, pwVar);
    }

    final void i(boolean z) {
        afc afcVar = this.r;
        if (afcVar == null) {
            afcVar = new afc();
            this.r = afcVar;
        }
        p(afcVar, Boolean.valueOf(z));
    }

    final void j(boolean z) {
        afc afcVar = this.v;
        if (afcVar == null) {
            afcVar = new afc();
            this.v = afcVar;
        }
        p(afcVar, Boolean.valueOf(z));
    }

    public final void k(CharSequence charSequence) {
        afc afcVar = this.y;
        if (afcVar == null) {
            afcVar = new afc();
            this.y = afcVar;
        }
        p(afcVar, charSequence);
    }

    public final void l(int i) {
        afc afcVar = this.x;
        if (afcVar == null) {
            afcVar = new afc();
            this.x = afcVar;
        }
        p(afcVar, Integer.valueOf(i));
    }

    final void m(boolean z) {
        afc afcVar = this.t;
        if (afcVar == null) {
            afcVar = new afc();
            this.t = afcVar;
        }
        p(afcVar, Boolean.valueOf(z));
    }

    public final void n(boolean z) {
        afc afcVar = this.s;
        if (afcVar == null) {
            afcVar = new afc();
            this.s = afcVar;
        }
        p(afcVar, Boolean.valueOf(z));
    }

    public final void o() {
        int i;
        pe peVar = this.a;
        pc pcVar = this.b;
        if (peVar == null) {
            i = 0;
        } else {
            i = peVar.e;
            if (i == 0) {
                i = pcVar != null ? 15 : 255;
            }
        }
        this.n = i;
    }

    public final ox q() {
        ox oxVar = this.z;
        if (oxVar != null) {
            return oxVar;
        }
        ox oxVar2 = new ox();
        this.z = oxVar2;
        return oxVar2;
    }

    final void r(bsh bshVar) {
        afc afcVar = this.o;
        if (afcVar == null) {
            afcVar = new afc();
            this.o = afcVar;
        }
        p(afcVar, bshVar);
    }
}
