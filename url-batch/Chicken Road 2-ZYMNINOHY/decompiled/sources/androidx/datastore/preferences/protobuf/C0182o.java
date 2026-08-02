package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0182o f4679a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0182o f4680b;

    static {
        C0182o c0182o = new C0182o();
        Map map = Collections.EMPTY_MAP;
        f4680b = c0182o;
    }

    public static C0182o a() {
        C0182o c0182o;
        T t4 = T.f4591c;
        C0182o c0182o2 = f4679a;
        if (c0182o2 != null) {
            return c0182o2;
        }
        synchronized (C0182o.class) {
            try {
                c0182o = f4679a;
                if (c0182o == null) {
                    Class cls = AbstractC0181n.f4678a;
                    C0182o c0182o3 = null;
                    if (cls != null) {
                        try {
                            c0182o3 = (C0182o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0182o = c0182o3 != null ? c0182o3 : f4680b;
                    f4679a = c0182o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0182o;
    }
}
