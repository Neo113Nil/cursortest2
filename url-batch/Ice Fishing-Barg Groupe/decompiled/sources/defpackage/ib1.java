package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class ib1 implements le0 {
    public final /* synthetic */ zt1 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ ib1(int i, zt1 zt1Var) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = zt1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        zt1 zt1Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = zt1Var.rtx2ld2ELZv4;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
            default:
                ol2 ol2Var = (ol2) obj;
                ol2Var.getClass();
                ny0 ny0Var = ((ql2) ol2Var).VhhvGxCb8gfr;
                List list = (List) zt1Var.rtx2ld2ELZv4;
                if (list != null) {
                    list.add(ny0Var);
                } else {
                    list = fx1.PsecLrZVVK61(ny0Var);
                }
                zt1Var.rtx2ld2ELZv4 = list;
                return ml2.OPXfSBeufaJ8;
        }
    }
}
