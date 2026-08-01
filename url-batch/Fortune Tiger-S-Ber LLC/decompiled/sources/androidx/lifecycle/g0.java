package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f581a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f582b = new m0();
    public static final m0 c = new m0();

    public static final void a(c1.f fVar) {
        c1.c cVar;
        m mVar = fVar.f().c;
        if (mVar != m.g && mVar != m.h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((m.f) fVar.a().f1000d).iterator();
        while (true) {
            m.b bVar = (m.b) it;
            if (!bVar.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            u2.c.d(entry, "components");
            String str = (String) entry.getKey();
            cVar = (c1.c) entry.getValue();
            if (u2.c.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            i0 i0Var = new i0(fVar.a(), (p0) fVar);
            fVar.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", i0Var);
            fVar.f().a(new SavedStateHandleAttacher(i0Var));
        }
    }
}
