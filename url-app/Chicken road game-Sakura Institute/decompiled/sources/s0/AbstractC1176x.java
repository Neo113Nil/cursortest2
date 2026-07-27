package s0;

import android.R;
import b1.C0503c;
import b1.C0508h;
import java.util.LinkedHashMap;
import y0.C1317a;

/* renamed from: s0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1176x {
    public static final void a(C0508h c0508h, y0.n nVar) {
        if (AbstractC1125K.a(nVar)) {
            y0.t tVar = y0.h.f11572w;
            LinkedHashMap linkedHashMap = nVar.f11587d.f11576d;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            C1317a c1317a = (C1317a) obj;
            if (c1317a != null) {
                c0508h.a(new C0503c(null, R.id.accessibilityActionPageUp, c1317a.f11535a, null));
            }
            Object obj2 = linkedHashMap.get(y0.h.f11574y);
            if (obj2 == null) {
                obj2 = null;
            }
            C1317a c1317a2 = (C1317a) obj2;
            if (c1317a2 != null) {
                c0508h.a(new C0503c(null, R.id.accessibilityActionPageDown, c1317a2.f11535a, null));
            }
            Object obj3 = linkedHashMap.get(y0.h.f11573x);
            if (obj3 == null) {
                obj3 = null;
            }
            C1317a c1317a3 = (C1317a) obj3;
            if (c1317a3 != null) {
                c0508h.a(new C0503c(null, R.id.accessibilityActionPageLeft, c1317a3.f11535a, null));
            }
            Object obj4 = linkedHashMap.get(y0.h.f11575z);
            if (obj4 == null) {
                obj4 = null;
            }
            C1317a c1317a4 = (C1317a) obj4;
            if (c1317a4 != null) {
                c0508h.a(new C0503c(null, R.id.accessibilityActionPageRight, c1317a4.f11535a, null));
            }
        }
    }
}
