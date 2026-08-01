package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class wh extends fh {
    public int m;

    public wh(rd0 rd0Var) {
        super(rd0Var);
        if (rd0Var instanceof qp) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.fh
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dh dhVar = (dh) obj;
            dhVar.a(dhVar);
        }
    }
}
