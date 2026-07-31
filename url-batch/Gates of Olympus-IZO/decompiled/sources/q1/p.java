package q1;

import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class p extends V {

    /* renamed from: c, reason: collision with root package name */
    public static final o f6932c = new o();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6933b = new LinkedHashMap();

    @Override // androidx.lifecycle.V
    public final void d() {
        LinkedHashMap linkedHashMap = this.f6933b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f6933b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        Z1.i.e(sb2, "sb.toString()");
        return sb2;
    }
}
