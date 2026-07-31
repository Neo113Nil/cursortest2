package t1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import n.z0;
import n0.C0714l;

@InterfaceC1018F("navigation")
/* loaded from: classes.dex */
public class z extends AbstractC1019G {

    /* renamed from: c, reason: collision with root package name */
    public final C1020H f8955c;

    public z(C1020H c1020h) {
        f2.j.f(c1020h, "navigatorProvider");
        this.f8955c = c1020h;
    }

    @Override // t1.AbstractC1019G
    public final void d(List list, C1016D c1016d) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1028h c1028h = (C1028h) it.next();
            u uVar = c1028h.f8874e;
            f2.j.d(uVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            x xVar = (x) uVar;
            f2.u uVar2 = new f2.u();
            uVar2.f5832d = c1028h.g();
            int i3 = xVar.f8949n;
            String str = xVar.f8951p;
            if (i3 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i4 = xVar.f8936i;
                sb.append(i4 != 0 ? String.valueOf(i4) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            u i5 = str != null ? xVar.i(str, false) : (u) xVar.f8948m.b(i3);
            if (i5 == null) {
                if (xVar.f8950o == null) {
                    String str2 = xVar.f8951p;
                    if (str2 == null) {
                        str2 = String.valueOf(xVar.f8949n);
                    }
                    xVar.f8950o = str2;
                }
                String str3 = xVar.f8950o;
                f2.j.c(str3);
                throw new IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            if (str != null) {
                if (!str.equals(i5.f8937j)) {
                    s d3 = i5.d(str);
                    Bundle bundle = d3 != null ? d3.f8924e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) uVar2.f5832d;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        uVar2.f5832d = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = i5.f8935h;
                if (S1.B.M(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList k3 = z0.k(S1.B.M(linkedHashMap), new C0714l(uVar2, 4));
                    if (!k3.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + i5 + ". Missing required arguments [" + k3 + ']').toString());
                    }
                }
            }
            AbstractC1019G b3 = this.f8955c.b(i5.f8931d);
            k b4 = b();
            Bundle b5 = i5.b((Bundle) uVar2.f5832d);
            C1013A c1013a = b4.f8898h;
            b3.d(O2.l.l0(m1.w.a(c1013a.f8806a, i5, b5, c1013a.g(), c1013a.f8821p)), c1016d);
        }
    }

    @Override // t1.AbstractC1019G
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x a() {
        return new x(this);
    }
}
