package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class al implements zk {
    public final int a;
    public final /* synthetic */ bl b;

    public al(bl blVar, int i) {
        this.b = blVar;
        this.a = i;
    }

    @Override // defpackage.zk
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        bl blVar = this.b;
        mk mkVar = blVar.w;
        int i = this.a;
        if (mkVar == null || i >= 0 || !mkVar.g().O(-1, 0)) {
            return blVar.P(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
