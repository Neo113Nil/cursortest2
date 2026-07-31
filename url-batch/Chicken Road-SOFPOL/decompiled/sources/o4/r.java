package o4;

import java.util.ArrayList;
import o.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends p {

    /* renamed from: f, reason: collision with root package name */
    public final z f5680f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5681g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5682h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, String str) {
        super(zVar.b(m.a.C(s.class)), null);
        q6.i.e(zVar, "provider");
        q6.i.e(str, "startDestination");
        this.f5682h = new ArrayList();
        this.f5680f = zVar;
        this.f5681g = str;
    }

    public final q c() {
        q qVar = (q) super.a();
        ArrayList arrayList = this.f5682h;
        q6.i.e(arrayList, "nodes");
        h4.j jVar = qVar.i;
        jVar.getClass();
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            o oVar = (o) obj;
            if (oVar != null) {
                u0 u0Var = (u0) jVar.f3191d;
                q qVar2 = (q) jVar.f3190c;
                l.n nVar = qVar2.f5671e;
                l.n nVar2 = oVar.f5671e;
                int i9 = nVar2.f4348a;
                String str = (String) nVar2.f4352e;
                if (i9 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) nVar.f4352e;
                if (str2 != null && q6.i.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + oVar + " cannot have the same route as graph " + qVar2).toString());
                }
                if (i9 == nVar.f4348a) {
                    throw new IllegalArgumentException(("Destination " + oVar + " cannot have the same id as graph " + qVar2).toString());
                }
                o oVar2 = (o) u0Var.c(i9);
                if (oVar2 == oVar) {
                    continue;
                } else {
                    if (oVar.f5672f != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (oVar2 != null) {
                        oVar2.f5672f = null;
                    }
                    oVar.f5672f = qVar2;
                    u0Var.e(nVar2.f4348a, oVar);
                }
            }
        }
        String str3 = this.f5681g;
        if (str3 == null) {
            if (this.f5675b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        q qVar3 = (q) jVar.f3190c;
        if (str3 != null) {
            if (str3.equals((String) qVar3.f5671e.f4352e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + qVar3).toString());
            }
            if (y6.j.e0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i10 = o.f5669h;
            i = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        jVar.f3189b = i;
        jVar.f3193f = str3;
        return qVar;
    }
}
