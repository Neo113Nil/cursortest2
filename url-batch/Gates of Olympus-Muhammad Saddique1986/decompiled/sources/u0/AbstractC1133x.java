package u0;

import android.R;
import java.util.LinkedHashMap;

/* renamed from: u0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1133x {
    public static final void a(d1.h hVar, A0.p pVar) {
        if (L.l(pVar)) {
            A0.v vVar = A0.h.f125w;
            LinkedHashMap linkedHashMap = pVar.f142d.f129d;
            Object obj = linkedHashMap.get(vVar);
            if (obj == null) {
                obj = null;
            }
            A0.a aVar = (A0.a) obj;
            if (aVar != null) {
                hVar.a(new d1.c(null, R.id.accessibilityActionPageUp, aVar.f88a, null));
            }
            Object obj2 = linkedHashMap.get(A0.h.f127y);
            if (obj2 == null) {
                obj2 = null;
            }
            A0.a aVar2 = (A0.a) obj2;
            if (aVar2 != null) {
                hVar.a(new d1.c(null, R.id.accessibilityActionPageDown, aVar2.f88a, null));
            }
            Object obj3 = linkedHashMap.get(A0.h.f126x);
            if (obj3 == null) {
                obj3 = null;
            }
            A0.a aVar3 = (A0.a) obj3;
            if (aVar3 != null) {
                hVar.a(new d1.c(null, R.id.accessibilityActionPageLeft, aVar3.f88a, null));
            }
            Object obj4 = linkedHashMap.get(A0.h.f128z);
            if (obj4 == null) {
                obj4 = null;
            }
            A0.a aVar4 = (A0.a) obj4;
            if (aVar4 != null) {
                hVar.a(new d1.c(null, R.id.accessibilityActionPageRight, aVar4.f88a, null));
            }
        }
    }
}
