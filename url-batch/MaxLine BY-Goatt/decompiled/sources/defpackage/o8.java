package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o8 implements bc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.bc0
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((q8) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((r8) obj);
                break;
            case 2:
                ((cp1) obj2).t.c((wa0) obj);
                break;
            case 3:
                ((gc1) obj2).o.add(obj);
                break;
            case 4:
                Iterator it = ((List) ((so2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((ez) obj).b().b((cp1) it.next());
                }
                break;
            case 5:
                um umVar = (um) obj2;
                iz izVar = (iz) obj;
                if (umVar.a == null) {
                    if (umVar.b == null) {
                        lh.g("Unreachable");
                        break;
                    } else {
                        izVar.a.d();
                        break;
                    }
                } else {
                    izVar.b.e();
                    break;
                }
            case 6:
                zn1 zn1Var = (zn1) obj2;
                u42 u42Var = (u42) zn1Var.getValue();
                if (u42Var != null) {
                    t42 t42Var = new t42(u42Var);
                    bn1 bn1Var = (bn1) obj;
                    if (bn1Var != null) {
                        bn1Var.c(t42Var);
                    }
                    zn1Var.setValue(null);
                    break;
                }
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((fz2) obj2).j.remove((fz2) obj);
                break;
            case 8:
                fz2 fz2Var = (fz2) obj2;
                fz2Var.getClass();
                az2 az2Var = (az2) ((bz2) obj).b.getValue();
                if (az2Var != null) {
                    fz2Var.i.remove(az2Var.m);
                    break;
                }
                break;
            case 9:
                ((fz2) obj2).i.remove((ez2) obj);
                break;
            default:
                i83 i83Var = (i83) obj2;
                View view = (View) obj;
                int i2 = i83Var.s - 1;
                i83Var.s = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = e53.a;
                    x43.c(view, null);
                    e53.k(view, null);
                    view.removeOnAttachStateChangeListener(i83Var.t);
                    break;
                }
                break;
        }
    }
}
