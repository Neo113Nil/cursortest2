package q1;

import a.AbstractC0157a;
import android.os.Bundle;
import f.AbstractC0382a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k.C0523b;

@I("navigation")
/* renamed from: q1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0774C extends J {

    /* renamed from: c, reason: collision with root package name */
    public final K f6826c;

    public C0774C(K k3) {
        Z1.i.f(k3, "navigatorProvider");
        this.f6826c = k3;
    }

    @Override // q1.J
    public final void d(List list, G g3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0784h c0784h = (C0784h) it.next();
            w wVar = c0784h.f6895e;
            Z1.i.d(wVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            z zVar = (z) wVar;
            Z1.t tVar = new Z1.t();
            tVar.f3480d = c0784h.g();
            int i3 = zVar.f6980n;
            String str = zVar.p;
            if (i3 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i4 = zVar.f6967i;
                sb.append(i4 != 0 ? String.valueOf(i4) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            w i5 = str != null ? zVar.i(str, false) : (w) zVar.f6979m.b(i3);
            if (i5 == null) {
                if (zVar.f6981o == null) {
                    String str2 = zVar.p;
                    if (str2 == null) {
                        str2 = String.valueOf(zVar.f6980n);
                    }
                    zVar.f6981o = str2;
                }
                String str3 = zVar.f6981o;
                Z1.i.c(str3);
                throw new IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            if (str != null) {
                if (!str.equals(i5.f6968j)) {
                    u d3 = i5.d(str);
                    Bundle bundle = d3 != null ? d3.f6955e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) tVar.f3480d;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        tVar.f3480d = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = i5.f6966h;
                if (M1.B.Q(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList t3 = AbstractC0382a.t(M1.B.Q(linkedHashMap), new C0773B(tVar, 0));
                    if (!t3.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + i5 + ". Missing required arguments [" + t3 + ']').toString());
                    }
                }
            }
            J b2 = this.f6826c.b(i5.f6962d);
            C0787k b3 = b();
            Bundle b4 = i5.b((Bundle) tVar.f3480d);
            C0775D c0775d = b3.f6919h;
            b2.d(AbstractC0157a.M(C0523b.c(c0775d.f6828a, i5, b4, c0775d.g(), c0775d.p)), g3);
        }
    }

    @Override // q1.J
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public z a() {
        return new z(this);
    }
}
