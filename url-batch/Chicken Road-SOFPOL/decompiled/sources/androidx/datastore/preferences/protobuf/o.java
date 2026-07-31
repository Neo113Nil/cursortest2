package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f735a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f736b;

    static {
        o oVar = new o();
        Map map = Collections.EMPTY_MAP;
        f736b = oVar;
    }

    public static o a() {
        o oVar;
        u0 u0Var = u0.f784c;
        o oVar2 = f735a;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = f735a;
                if (oVar == null) {
                    Class cls = n.f732a;
                    o oVar3 = null;
                    if (cls != null) {
                        try {
                            oVar3 = (o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oVar = oVar3 != null ? oVar3 : f736b;
                    f735a = oVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }
}
