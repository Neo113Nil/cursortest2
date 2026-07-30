package defpackage;

import android.view.View;
import defpackage.aa2;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q83 implements fd1 {
    public final /* synthetic */ m30 m;
    public final /* synthetic */ n02 n;
    public final /* synthetic */ r72 o;
    public final /* synthetic */ c82 p;
    public final /* synthetic */ View q;

    public q83(m30 m30Var, n02 n02Var, r72 r72Var, c82 c82Var, View view) {
        this.m = m30Var;
        this.n = n02Var;
        this.o = r72Var;
        this.p = c82Var;
        this.q = view;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        boolean z;
        ds dsVar = null;
        switch (p83.a[yc1Var.ordinal()]) {
            case 1:
                m30 m30Var = this.m;
                d50 d50Var = d50.m;
                z71.H(m30Var, null, new kc(this.p, this.o, id1Var, this, this.q, null), 1);
                return;
            case 2:
                n02 n02Var = this.n;
                if (n02Var != null) {
                    w50 w50Var = n02Var.n;
                    synchronized (w50Var.b) {
                        try {
                            synchronized (w50Var.b) {
                                z = w50Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) w50Var.c;
                                w50Var.c = (ArrayList) w50Var.d;
                                w50Var.d = arrayList;
                                w50Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    o30 o30Var = (o30) arrayList.get(i);
                                    aa2.a aVar = aa2.m;
                                    o30Var.resumeWith(Unit.a);
                                }
                                arrayList.clear();
                                Unit unit = Unit.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                r72 r72Var = this.o;
                synchronized (r72Var.b) {
                    if (r72Var.s) {
                        r72Var.s = false;
                        dsVar = r72Var.t();
                    }
                }
                if (dsVar != null) {
                    aa2.a aVar2 = aa2.m;
                    ((fs) dsVar).resumeWith(Unit.a);
                    return;
                }
                return;
            case 3:
                r72 r72Var2 = this.o;
                synchronized (r72Var2.b) {
                    r72Var2.s = true;
                    Unit unit2 = Unit.a;
                }
                return;
            case 4:
                this.o.s();
                return;
            case 5:
            case 6:
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                a.b();
                return;
        }
    }
}
