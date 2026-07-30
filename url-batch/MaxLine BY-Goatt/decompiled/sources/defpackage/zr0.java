package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zr0 implements yr0 {
    public final int a;
    public final /* synthetic */ as0 b;

    public zr0(as0 as0Var, int i) {
        this.b = as0Var;
        this.a = i;
    }

    @Override // defpackage.yr0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        as0 as0Var = this.b;
        fr0 fr0Var = as0Var.w;
        int i = this.a;
        if (fr0Var == null || i >= 0 || !fr0Var.getChildFragmentManager().N(-1, 0)) {
            return as0Var.O(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
