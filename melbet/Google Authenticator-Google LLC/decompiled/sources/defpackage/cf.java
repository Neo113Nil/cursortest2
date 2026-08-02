package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cf {
    int e;
    int f;
    int g;
    int h;
    int i;
    public boolean j;
    public String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    ArrayList t;
    final ArrayList d = new ArrayList();
    public boolean k = true;
    boolean s = false;

    public abstract void c();

    public void d(int i, bd bdVar, String str, int i2) {
        throw null;
    }

    public boolean g() {
        throw null;
    }

    public void i(bd bdVar) {
        throw null;
    }

    public void j(bd bdVar, aek aekVar) {
        throw null;
    }

    public final void k(ce ceVar) {
        this.d.add(ceVar);
        ceVar.d = this.e;
        ceVar.e = this.f;
        ceVar.f = this.g;
        ceVar.g = this.h;
    }

    public final void l() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void m(int i, bd bdVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i, bdVar, str, 2);
    }

    public final void n() {
        this.s = true;
    }
}
