package defpackage;

import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qk {
    public final ArrayList a = new ArrayList();
    public boolean b = false;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final /* synthetic */ n d;

    public qk(n nVar) {
        this.d = nVar;
    }

    public final void a(boolean z) {
        lv lvVar;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gw gwVar = (gw) obj;
            boolean z2 = gwVar.e && z;
            if (gwVar.b != z2) {
                gwVar.b = z2;
                iv ivVar = gwVar.c;
                if (ivVar != null && (lvVar = ivVar.b) != null) {
                    lvVar.b();
                }
            }
        }
    }
}
