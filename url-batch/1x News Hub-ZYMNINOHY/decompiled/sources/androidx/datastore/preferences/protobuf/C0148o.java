package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0148o f2334a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0148o f2335b;

    static {
        C0148o c0148o = new C0148o();
        Map map = Collections.EMPTY_MAP;
        f2335b = c0148o;
    }

    public static C0148o a() {
        C0148o c0148o;
        T t3 = T.f2253c;
        C0148o c0148o2 = f2334a;
        if (c0148o2 != null) {
            return c0148o2;
        }
        synchronized (C0148o.class) {
            try {
                c0148o = f2334a;
                if (c0148o == null) {
                    Class cls = AbstractC0147n.f2333a;
                    C0148o c0148o3 = null;
                    if (cls != null) {
                        try {
                            c0148o3 = (C0148o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c0148o = c0148o3 != null ? c0148o3 : f2335b;
                    f2334a = c0148o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0148o;
    }
}
