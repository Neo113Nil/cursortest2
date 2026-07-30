package t3;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends w {

    /* renamed from: f, reason: collision with root package name */
    public final h0 f8878f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8879g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h0 h0Var, String str) {
        super(h0Var.b(a8.d.H(a0.class)), null);
        r6.k.f(h0Var, "provider");
        r6.k.f(str, "startDestination");
        this.f8880h = new ArrayList();
        this.f8878f = h0Var;
        this.f8879g = str;
    }

    public final y c() {
        int hashCode;
        y yVar = (y) super.a();
        ArrayList arrayList = this.f8880h;
        r6.k.f(arrayList, "nodes");
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != null) {
                i.h0 h0Var = yVar.f8874o;
                int i8 = vVar.f8862k;
                String str = vVar.f8863l;
                if (i8 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = yVar.f8863l;
                if (str2 != null && r6.k.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + yVar).toString());
                }
                if (i8 == yVar.f8862k) {
                    throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + yVar).toString());
                }
                v vVar2 = (v) h0Var.b(i8);
                if (vVar2 == vVar) {
                    continue;
                } else {
                    if (vVar.f8858g != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (vVar2 != null) {
                        vVar2.f8858g = null;
                    }
                    vVar.f8858g = yVar;
                    h0Var.d(vVar.f8862k, vVar);
                }
            }
        }
        String str3 = this.f8879g;
        if (str3 == null) {
            if (this.f8866b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            hashCode = 0;
        } else {
            if (str3.equals(yVar.f8863l)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + yVar).toString());
            }
            if (z6.h.G(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        yVar.f8875p = hashCode;
        yVar.f8877r = str3;
        return yVar;
    }
}
