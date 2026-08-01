package n4;

import androidx.lifecycle.u0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7084b = new LinkedHashMap();

    @Override // androidx.lifecycle.u0
    public final void d() {
        LinkedHashMap linkedHashMap = this.f7084b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((z0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        hd.w wVar = hd.x.f4529e;
        sb2.append(kotlin.text.s.a(identityHashCode));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f7084b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
