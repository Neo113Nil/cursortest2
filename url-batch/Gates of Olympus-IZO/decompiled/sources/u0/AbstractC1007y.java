package u0;

import android.R;
import b1.C0296c;
import java.util.LinkedHashMap;
import z0.C1076a;

/* renamed from: u0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1007y {
    public static final void a(b1.h hVar, z0.n nVar) {
        if (L.h(nVar)) {
            z0.t tVar = z0.h.f8977v;
            LinkedHashMap linkedHashMap = nVar.f8991d.f8982d;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            C1076a c1076a = (C1076a) obj;
            if (c1076a != null) {
                hVar.a(new C0296c(null, R.id.accessibilityActionPageUp, c1076a.f8942a, null));
            }
            Object obj2 = linkedHashMap.get(z0.h.f8979x);
            if (obj2 == null) {
                obj2 = null;
            }
            C1076a c1076a2 = (C1076a) obj2;
            if (c1076a2 != null) {
                hVar.a(new C0296c(null, R.id.accessibilityActionPageDown, c1076a2.f8942a, null));
            }
            Object obj3 = linkedHashMap.get(z0.h.f8978w);
            if (obj3 == null) {
                obj3 = null;
            }
            C1076a c1076a3 = (C1076a) obj3;
            if (c1076a3 != null) {
                hVar.a(new C0296c(null, R.id.accessibilityActionPageLeft, c1076a3.f8942a, null));
            }
            Object obj4 = linkedHashMap.get(z0.h.f8980y);
            if (obj4 == null) {
                obj4 = null;
            }
            C1076a c1076a4 = (C1076a) obj4;
            if (c1076a4 != null) {
                hVar.a(new C0296c(null, R.id.accessibilityActionPageRight, c1076a4.f8942a, null));
            }
        }
    }
}
