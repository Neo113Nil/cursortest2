package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0198n f3538a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0198n f3539b;

    static {
        C0198n c0198n = new C0198n();
        Map map = Collections.EMPTY_MAP;
        f3539b = c0198n;
    }

    public static C0198n a() {
        C0198n c0198n;
        S s7 = S.f3454c;
        C0198n c0198n2 = f3538a;
        if (c0198n2 != null) {
            return c0198n2;
        }
        synchronized (C0198n.class) {
            try {
                c0198n = f3538a;
                if (c0198n == null) {
                    Class cls = AbstractC0197m.f3537a;
                    C0198n c0198n3 = null;
                    if (cls != null) {
                        try {
                            c0198n3 = (C0198n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0198n = c0198n3 != null ? c0198n3 : f3539b;
                    f3538a = c0198n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0198n;
    }
}
