package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f586a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f587b;

    static {
        n nVar = new n();
        Map map = Collections.EMPTY_MAP;
        f587b = nVar;
    }

    public static n a() {
        n nVar;
        t0 t0Var = t0.f636c;
        n nVar2 = f586a;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.class) {
            try {
                nVar = f586a;
                if (nVar == null) {
                    Class cls = m.f583a;
                    n nVar3 = null;
                    if (cls != null) {
                        try {
                            nVar3 = (n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nVar = nVar3 != null ? nVar3 : f587b;
                    f586a = nVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }
}
