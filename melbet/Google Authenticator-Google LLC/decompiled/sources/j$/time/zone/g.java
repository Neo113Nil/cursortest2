package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class g implements PrivilegedAction {
    public final /* synthetic */ ArrayList a;

    public g(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            h.b(new h());
            return null;
        }
        try {
            h hVar = (h) h.class.cast(Class.forName(property, true, h.class.getClassLoader()).newInstance());
            h.b(hVar);
            this.a.add(hVar);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
