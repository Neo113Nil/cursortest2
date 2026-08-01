package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f710a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f711b = new m0();

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f712c = new m0();

    public static final void a(h1.e eVar) {
        h1.b bVar;
        m mVar = eVar.f().f734c;
        if (mVar != m.f723g && mVar != m.h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((n.f) eVar.a().d).iterator();
        while (true) {
            n.b bVar2 = (n.b) it;
            if (!bVar2.hasNext()) {
                bVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar2.next();
            i3.d.d(entry, "components");
            String str = (String) entry.getKey();
            bVar = (h1.b) entry.getValue();
            if (i3.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (bVar == null) {
            i0 i0Var = new i0(eVar.a(), (p0) eVar);
            eVar.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
            eVar.f().a(new SavedStateHandleAttacher(i0Var));
        }
    }
}
