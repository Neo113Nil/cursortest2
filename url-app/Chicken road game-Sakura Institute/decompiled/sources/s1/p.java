package s1;

import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends T {

    /* renamed from: c, reason: collision with root package name */
    public static final o f10542c = new o();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10543b = new LinkedHashMap();

    @Override // androidx.lifecycle.T
    public final void c() {
        LinkedHashMap linkedHashMap = this.f10543b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Y) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f10543b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
