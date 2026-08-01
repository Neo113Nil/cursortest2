package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dn implements cn {
    public final int a;
    public final /* synthetic */ en b;

    public dn(en enVar, int i) {
        this.b = enVar;
        this.a = i;
    }

    @Override // defpackage.cn
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        en enVar = this.b;
        pm pmVar = enVar.w;
        int i = this.a;
        if (pmVar == null || i >= 0 || !pmVar.g().O(-1, 0)) {
            return enVar.P(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
