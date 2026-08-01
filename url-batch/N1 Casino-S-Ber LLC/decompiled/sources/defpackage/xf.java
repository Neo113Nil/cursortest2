package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class xf extends hf {
    public int m;

    public xf(ka0 ka0Var) {
        super(ka0Var);
        if (ka0Var instanceof en) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.hf
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
            ff ffVar = (ff) obj;
            ffVar.a(ffVar);
        }
    }
}
