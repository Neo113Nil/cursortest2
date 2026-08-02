package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ca extends agd {
    public static final agh a = new agw(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public ca(boolean z) {
        this.e = z;
    }

    public final void a(bd bdVar, boolean z) {
        if (by.U(3)) {
            Objects.toString(bdVar);
        }
        b(bdVar.m, z);
    }

    public final void b(String str, boolean z) {
        HashMap hashMap = this.c;
        ca caVar = (ca) hashMap.get(str);
        if (caVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(caVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    caVar.b((String) arrayList.get(i), true);
                }
            }
            caVar.c();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        agk agkVar = (agk) hashMap2.get(str);
        if (agkVar != null) {
            agkVar.c();
            hashMap2.remove(str);
        }
    }

    @Override // defpackage.agd
    protected final void c() {
        if (by.U(3)) {
            toString();
        }
        this.f = true;
    }

    final void d(bd bdVar) {
        if (this.g || this.b.remove(bdVar.m) == null || !by.U(2)) {
            return;
        }
        Objects.toString(bdVar);
    }

    public final boolean e(bd bdVar) {
        if (this.b.containsKey(bdVar.m) && this.e) {
            return this.f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ca caVar = (ca) obj;
            if (this.b.equals(caVar.b) && this.c.equals(caVar.c) && this.d.equals(caVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
