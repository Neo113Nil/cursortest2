package o4;

import androidx.lifecycle.r0;
import androidx.lifecycle.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5639b = new LinkedHashMap();

    @Override // androidx.lifecycle.r0
    public final void b() {
        LinkedHashMap linkedHashMap = this.f5639b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        r2.o.p(16);
        long j7 = identityHashCode & 4294967295L;
        if (j7 >= 0) {
            r2.o.p(16);
            concat = Long.toString(j7, 16);
            q6.i.d(concat, "toString(...)");
        } else {
            long j8 = 16;
            long j9 = ((j7 >>> 1) / j8) << 1;
            long j10 = j7 - (j9 * j8);
            if (j10 >= j8) {
                j10 -= j8;
                j9++;
            }
            r2.o.p(16);
            String l3 = Long.toString(j9, 16);
            q6.i.d(l3, "toString(...)");
            r2.o.p(16);
            String l7 = Long.toString(j10, 16);
            q6.i.d(l7, "toString(...)");
            concat = l3.concat(l7);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        Iterator it = this.f5639b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
