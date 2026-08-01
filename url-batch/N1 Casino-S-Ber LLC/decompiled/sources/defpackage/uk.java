package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class uk {
    public final ArrayList a = new ArrayList();
    public boolean b = false;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final /* synthetic */ bl d;

    public uk(bl blVar) {
        this.d = blVar;
    }

    public final void a(boolean z) {
        uu uuVar;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zv zvVar = (zv) obj;
            boolean z2 = zvVar.e && z;
            if (zvVar.b != z2) {
                zvVar.b = z2;
                we weVar = zvVar.c;
                if (weVar != null && (uuVar = (uu) weVar.g) != null) {
                    uuVar.b();
                }
            }
        }
    }
}
