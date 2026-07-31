package o4;

import a0.c1;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
@x("navigation")
/* loaded from: classes.dex */
public class s extends y {

    /* renamed from: c, reason: collision with root package name */
    public final z f5683c;

    public s(z zVar) {
        q6.i.e(zVar, "navigatorProvider");
        this.f5683c = zVar;
    }

    @Override // o4.y
    public final void d(List list, v vVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            o oVar = dVar.f5621e;
            q6.i.c(oVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            q qVar = (q) oVar;
            l.n nVar = qVar.f5671e;
            q6.s sVar = new q6.s();
            sVar.f6205d = dVar.f5626k.a();
            h4.j jVar = qVar.i;
            int i = jVar.f3189b;
            String str = (String) jVar.f3193f;
            if (i == 0 && str == null) {
                nVar.getClass();
                String valueOf = String.valueOf(nVar.f4348a);
                q6.i.e(valueOf, "superName");
                if (((q) jVar.f3190c).f5671e.f4348a == 0) {
                    valueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            o k3 = str != null ? jVar.k(str, false) : (o) ((u0) jVar.f3191d).c(i);
            if (k3 == null) {
                if (((String) jVar.f3192e) == null) {
                    String str2 = (String) jVar.f3193f;
                    if (str2 == null) {
                        str2 = String.valueOf(jVar.f3189b);
                    }
                    jVar.f3192e = str2;
                }
                String str3 = (String) jVar.f3192e;
                q6.i.b(str3);
                throw new IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            l.n nVar2 = k3.f5671e;
            if (str != null) {
                if (!str.equals((String) nVar2.f4352e)) {
                    n e8 = nVar2.e(str);
                    Bundle bundle = e8 != null ? e8.f5665e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                        j7.putAll(bundle);
                        Bundle bundle2 = (Bundle) sVar.f6205d;
                        if (bundle2 != null) {
                            j7.putAll(bundle2);
                        }
                        sVar.f6205d = j7;
                    }
                }
                if (k3.b().isEmpty()) {
                    continue;
                } else {
                    ArrayList N = h0.a.N(k3.b(), new c1(sVar, 1));
                    if (!N.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + k3 + ". Missing required arguments [" + N + ']').toString());
                    }
                }
            }
            this.f5683c.b(k3.f5670d).d(s6.a.x(b().b(k3, k3.a((Bundle) sVar.f6205d))), vVar);
        }
    }

    @Override // o4.y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public q a() {
        return new q(this);
    }
}
