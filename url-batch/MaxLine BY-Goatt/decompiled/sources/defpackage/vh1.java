package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vh1 extends xh1 implements Iterator, k71 {
    public final /* synthetic */ int q;

    public vh1(uh1 uh1Var, int i) {
        this.q = i;
        uh1Var.getClass();
        this.p = uh1Var;
        this.n = -1;
        this.o = uh1Var.t;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.q) {
            case 0:
                b();
                int i = this.m;
                uh1 uh1Var = (uh1) this.p;
                if (i >= uh1Var.r) {
                    b71.f();
                    break;
                } else {
                    this.m = i + 1;
                    this.n = i;
                    wh1 wh1Var = new wh1(uh1Var, i);
                    e();
                    break;
                }
            case 1:
                b();
                int i2 = this.m;
                uh1 uh1Var2 = (uh1) this.p;
                if (i2 >= uh1Var2.r) {
                    b71.f();
                    break;
                } else {
                    this.m = i2 + 1;
                    this.n = i2;
                    Object obj = uh1Var2.m[i2];
                    e();
                    break;
                }
            default:
                b();
                int i3 = this.m;
                uh1 uh1Var3 = (uh1) this.p;
                if (i3 >= uh1Var3.r) {
                    b71.f();
                    break;
                } else {
                    this.m = i3 + 1;
                    this.n = i3;
                    Object[] objArr = uh1Var3.n;
                    objArr.getClass();
                    Object obj2 = objArr[this.n];
                    e();
                    break;
                }
        }
        return null;
    }
}
