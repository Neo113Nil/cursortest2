package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ss3 extends zb3 {
    public final boolean o;
    public final boolean p;
    public final /* synthetic */ ol3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss3(ol3 ol3Var, boolean z, boolean z2) {
        super("log");
        this.q = ol3Var;
        this.o = z;
        this.p = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // defpackage.zb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kc3 h(js0 js0Var, List list) {
        int i;
        int i2;
        ak2.n("log", 1, list);
        int size = list.size();
        qc3 qc3Var = kc3.e;
        ol3 ol3Var = this.q;
        if (size == 1) {
            ((ot2) ol3Var.p).r(3, ((tt1) js0Var.p).x(js0Var, (kc3) list.get(0)).zzc(), Collections.EMPTY_LIST, this.o, this.p);
            return qc3Var;
        }
        kc3 kc3Var = (kc3) list.get(0);
        tt1 tt1Var = (tt1) js0Var.p;
        tt1 tt1Var2 = (tt1) js0Var.p;
        int s = ak2.s(tt1Var.x(js0Var, kc3Var).f().doubleValue());
        if (s != 2) {
            i = 3;
            if (s == 3) {
                i2 = 1;
            } else if (s == 5) {
                i2 = 5;
            } else if (s == 6) {
                i2 = 2;
            }
            String zzc = tt1Var2.x(js0Var, (kc3) list.get(1)).zzc();
            if (list.size() != 2) {
                ((ot2) ol3Var.p).r(i2, zzc, Collections.EMPTY_LIST, this.o, this.p);
                return qc3Var;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(tt1Var2.x(js0Var, (kc3) list.get(i3)).zzc());
            }
            ((ot2) ol3Var.p).r(i2, zzc, arrayList, this.o, this.p);
            return qc3Var;
        }
        i = 4;
        i2 = i;
        String zzc2 = tt1Var2.x(js0Var, (kc3) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }
}
