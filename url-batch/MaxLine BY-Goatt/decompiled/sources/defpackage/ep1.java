package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ep1 implements fd1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ep1(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                up1 up1Var = (up1) obj;
                up1Var.r = yc1Var.a();
                if (up1Var.c != null) {
                    Iterator<E> it = up1Var.g.iterator();
                    while (it.hasNext()) {
                        cp1 cp1Var = (cp1) it.next();
                        cp1Var.getClass();
                        cp1Var.p = yc1Var.a();
                        cp1Var.b();
                    }
                    break;
                }
                break;
            default:
                yd2 yd2Var = (yd2) obj;
                if (yc1Var != yc1.ON_START) {
                    if (yc1Var == yc1.ON_STOP) {
                        yd2Var.h = false;
                        break;
                    }
                } else {
                    yd2Var.h = true;
                    break;
                }
                break;
        }
    }
}
