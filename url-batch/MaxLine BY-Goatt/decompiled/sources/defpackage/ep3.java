package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ep3 extends xg3 {
    public bb3 o;
    public boolean p;
    public final ot2 q;
    public final o42 r;
    public final tt1 s;

    public ep3(pj3 pj3Var) {
        super(pj3Var);
        this.p = true;
        this.q = new ot2(25, this);
        this.r = new o42(this);
        this.s = new tt1(this);
    }

    public final void A() {
        v();
        if (this.o == null) {
            this.o = new bb3(Looper.getMainLooper(), 2);
        }
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return false;
    }
}
