package s1;

import android.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class w {
    public static final void a(c3.i iVar, y1.m mVar) {
        boolean l8 = j0.l(mVar);
        LinkedHashMap linkedHashMap = mVar.f9840d.f9832f;
        if (l8) {
            Object obj = linkedHashMap.get(y1.h.f9828w);
            if (obj == null) {
                obj = null;
            }
            y1.a aVar = (y1.a) obj;
            if (aVar != null) {
                iVar.a(new c3.c(null, R.id.accessibilityActionPageUp, aVar.f9793a, null));
            }
            Object obj2 = linkedHashMap.get(y1.h.f9830y);
            if (obj2 == null) {
                obj2 = null;
            }
            y1.a aVar2 = (y1.a) obj2;
            if (aVar2 != null) {
                iVar.a(new c3.c(null, R.id.accessibilityActionPageDown, aVar2.f9793a, null));
            }
            Object obj3 = linkedHashMap.get(y1.h.f9829x);
            if (obj3 == null) {
                obj3 = null;
            }
            y1.a aVar3 = (y1.a) obj3;
            if (aVar3 != null) {
                iVar.a(new c3.c(null, R.id.accessibilityActionPageLeft, aVar3.f9793a, null));
            }
            Object obj4 = linkedHashMap.get(y1.h.f9831z);
            if (obj4 == null) {
                obj4 = null;
            }
            y1.a aVar4 = (y1.a) obj4;
            if (aVar4 != null) {
                iVar.a(new c3.c(null, R.id.accessibilityActionPageRight, aVar4.f9793a, null));
            }
        }
    }
}
