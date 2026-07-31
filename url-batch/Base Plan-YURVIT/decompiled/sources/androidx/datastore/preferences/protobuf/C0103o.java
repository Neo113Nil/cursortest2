package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0103o f1569a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0103o f1570b;

    static {
        C0103o c0103o = new C0103o();
        Map map = Collections.EMPTY_MAP;
        f1570b = c0103o;
    }

    public static C0103o a() {
        C0103o c0103o;
        T t = T.f1483c;
        C0103o c0103o2 = f1569a;
        if (c0103o2 != null) {
            return c0103o2;
        }
        synchronized (C0103o.class) {
            try {
                c0103o = f1569a;
                if (c0103o == null) {
                    Class cls = AbstractC0102n.f1567a;
                    C0103o c0103o3 = null;
                    if (cls != null) {
                        try {
                            c0103o3 = (C0103o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0103o = c0103o3 != null ? c0103o3 : f1570b;
                    f1569a = c0103o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0103o;
    }
}
