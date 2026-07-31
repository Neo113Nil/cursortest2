package q1;

import f.AbstractC0382a;
import h2.AbstractC0447i;
import j.C0481G;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: q1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772A extends x {

    /* renamed from: f, reason: collision with root package name */
    public final K f6821f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6822g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6823h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0772A(K k3, String str) {
        super(k3.b(AbstractC0382a.p(C0774C.class)), str);
        Z1.i.f(k3, "provider");
        this.f6823h = new ArrayList();
        this.f6821f = k3;
        this.f6822g = "joints";
    }

    public final z c() {
        int hashCode;
        z zVar = (z) super.a();
        ArrayList arrayList = this.f6823h;
        Z1.i.f(arrayList, "nodes");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar != null) {
                int i3 = wVar.f6967i;
                String str = wVar.f6968j;
                if (i3 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = zVar.f6968j;
                if (str2 != null && Z1.i.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + wVar + " cannot have the same route as graph " + zVar).toString());
                }
                if (i3 == zVar.f6967i) {
                    throw new IllegalArgumentException(("Destination " + wVar + " cannot have the same id as graph " + zVar).toString());
                }
                C0481G c0481g = zVar.f6979m;
                w wVar2 = (w) c0481g.b(i3);
                if (wVar2 == wVar) {
                    continue;
                } else {
                    if (wVar.f6963e != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (wVar2 != null) {
                        wVar2.f6963e = null;
                    }
                    wVar.f6963e = zVar;
                    c0481g.d(wVar.f6967i, wVar);
                }
            }
        }
        String str3 = this.f6822g;
        if (str3 == null) {
            if (this.f6971b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            hashCode = 0;
        } else {
            if (str3.equals(zVar.f6968j)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + zVar).toString());
            }
            if (AbstractC0447i.t0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        zVar.f6980n = hashCode;
        zVar.p = str3;
        return zVar;
    }
}
