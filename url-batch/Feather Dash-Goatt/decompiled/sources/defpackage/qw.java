package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qw {
    public static volatile qw a;
    public static final qw b;

    static {
        qw qwVar = new qw();
        Map map = Collections.EMPTY_MAP;
        b = qwVar;
    }

    public static qw a() {
        qw qwVar;
        i01 i01Var = i01.c;
        qw qwVar2 = a;
        if (qwVar2 != null) {
            return qwVar2;
        }
        synchronized (qw.class) {
            try {
                qwVar = a;
                if (qwVar == null) {
                    Class cls = pw.a;
                    qw qwVar3 = null;
                    if (cls != null) {
                        try {
                            qwVar3 = (qw) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qwVar = qwVar3 != null ? qwVar3 : b;
                    a = qwVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qwVar;
    }
}
