package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xm {
    public final ArrayList a = new ArrayList();
    public boolean b = false;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final /* synthetic */ en d;

    public xm(en enVar) {
        this.d = enVar;
    }

    public final void a(boolean z) {
        wx wxVar;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cz czVar = (cz) obj;
            boolean z2 = czVar.e && z;
            if (czVar.b != z2) {
                czVar.b = z2;
                rg rgVar = czVar.c;
                if (rgVar != null && (wxVar = (wx) rgVar.g) != null) {
                    wxVar.b();
                }
            }
        }
    }
}
