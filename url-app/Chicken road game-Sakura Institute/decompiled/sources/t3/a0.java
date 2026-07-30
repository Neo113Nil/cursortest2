package t3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
@f0("navigation")
/* loaded from: classes.dex */
public class a0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final h0 f8736c;

    public a0(h0 h0Var) {
        r6.k.f(h0Var, "navigatorProvider");
        this.f8736c = h0Var;
    }

    @Override // t3.g0
    public final void d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            v vVar = hVar.f8792g;
            r6.k.d(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            y yVar = (y) vVar;
            r6.v vVar2 = new r6.v();
            vVar2.f7968f = hVar.g();
            int i7 = yVar.f8875p;
            String str = yVar.f8877r;
            if (i7 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i8 = yVar.f8862k;
                sb.append(i8 != 0 ? String.valueOf(i8) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            v w4 = str != null ? yVar.w(str, false) : (v) yVar.f8874o.b(i7);
            if (w4 == null) {
                if (yVar.f8876q == null) {
                    String str2 = yVar.f8877r;
                    if (str2 == null) {
                        str2 = String.valueOf(yVar.f8875p);
                    }
                    yVar.f8876q = str2;
                }
                String str3 = yVar.f8876q;
                r6.k.c(str3);
                throw new IllegalArgumentException(a0.m.j("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            LinkedHashMap linkedHashMap = w4.f8861j;
            if (str != null) {
                if (!str.equals(w4.f8863l)) {
                    t m8 = w4.m(str);
                    Bundle bundle = m8 != null ? m8.f8850g : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) vVar2.f7968f;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        vVar2.f7968f = bundle2;
                    }
                }
                if (e6.c0.m0(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList i02 = j1.c.i0(e6.c0.m0(linkedHashMap), new l1.m(vVar2, 2, (byte) 0));
                    if (!i02.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + w4 + ". Missing required arguments [" + i02 + ']').toString());
                    }
                }
            }
            g0 b9 = this.f8736c.b(w4.f8857f);
            k b10 = b();
            Bundle a3 = w4.a((Bundle) vVar2.f7968f);
            b0 b0Var = b10.f8818h;
            b9.d(t6.a.F(j4.i.k(b0Var.f8745a, w4, a3, b0Var.g(), b0Var.f8760p)), d0Var);
        }
    }

    @Override // t3.g0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public y a() {
        return new y(this);
    }
}
