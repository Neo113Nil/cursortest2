package t1;

import j.C0525G;
import java.util.ArrayList;
import java.util.Iterator;
import n.t0;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class y extends v {

    /* renamed from: f, reason: collision with root package name */
    public final C1020H f8952f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8953g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8954h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1020H c1020h, String str, String str2) {
        super(c1020h.b(t0.m(z.class)), str2);
        f2.j.f(c1020h, "provider");
        f2.j.f(str, "startDestination");
        this.f8954h = new ArrayList();
        this.f8952f = c1020h;
        this.f8953g = str;
    }

    public final x c() {
        int hashCode;
        x xVar = (x) super.a();
        ArrayList arrayList = this.f8954h;
        f2.j.f(arrayList, "nodes");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar != null) {
                int i3 = uVar.f8936i;
                String str = uVar.f8937j;
                if (i3 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = xVar.f8937j;
                if (str2 != null && f2.j.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + uVar + " cannot have the same route as graph " + xVar).toString());
                }
                if (i3 == xVar.f8936i) {
                    throw new IllegalArgumentException(("Destination " + uVar + " cannot have the same id as graph " + xVar).toString());
                }
                C0525G c0525g = xVar.f8948m;
                u uVar2 = (u) c0525g.b(i3);
                if (uVar2 == uVar) {
                    continue;
                } else {
                    if (uVar.f8932e != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (uVar2 != null) {
                        uVar2.f8932e = null;
                    }
                    uVar.f8932e = xVar;
                    c0525g.d(uVar.f8936i, uVar);
                }
            }
        }
        String str3 = this.f8953g;
        if (str3 == null) {
            if (this.f8940b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            hashCode = 0;
        } else {
            if (str3.equals(xVar.f8937j)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + xVar).toString());
            }
            if (AbstractC0730j.K(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        xVar.f8949n = hashCode;
        xVar.f8951p = str3;
        return xVar;
    }
}
