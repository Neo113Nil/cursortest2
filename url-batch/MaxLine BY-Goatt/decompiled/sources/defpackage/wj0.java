package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wj0 {
    public static volatile wj0 a;
    public static final wj0 b;

    static {
        wj0 wj0Var = new wj0();
        Map map = Collections.EMPTY_MAP;
        b = wj0Var;
    }

    public static wj0 a() {
        wj0 wj0Var;
        q52 q52Var = q52.c;
        wj0 wj0Var2 = a;
        if (wj0Var2 != null) {
            return wj0Var2;
        }
        synchronized (wj0.class) {
            try {
                wj0Var = a;
                if (wj0Var == null) {
                    Class cls = vj0.a;
                    wj0 wj0Var3 = null;
                    if (cls != null) {
                        try {
                            wj0Var3 = (wj0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    wj0Var = wj0Var3 != null ? wj0Var3 : b;
                    a = wj0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wj0Var;
    }
}
