package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f606a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f607b = new m0();

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f608c = new m0();

    public static final void a(g1.e eVar) {
        g1.b bVar;
        m mVar = eVar.e().f630c;
        if (mVar != m.f618g && mVar != m.f619h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) eVar.b().d).iterator();
        while (true) {
            n.b bVar2 = (n.b) it;
            if (!bVar2.hasNext()) {
                bVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar2.next();
            f3.d.d(entry, "components");
            String str = (String) entry.getKey();
            bVar = (g1.b) entry.getValue();
            if (f3.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (bVar == null) {
            i0 i0Var = new i0(eVar.b(), (p0) eVar);
            eVar.b().e("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
            eVar.e().a(new SavedStateHandleAttacher(i0Var));
        }
    }
}
