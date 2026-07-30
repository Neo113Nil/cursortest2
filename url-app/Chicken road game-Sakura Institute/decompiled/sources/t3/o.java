package t3;

import androidx.lifecycle.b1;
import androidx.lifecycle.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final n f8827c = new n();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8828b = new LinkedHashMap();

    @Override // androidx.lifecycle.w0
    public final void d() {
        LinkedHashMap linkedHashMap = this.f8828b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f8828b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        r6.k.e(sb2, "sb.toString()");
        return sb2;
    }
}
