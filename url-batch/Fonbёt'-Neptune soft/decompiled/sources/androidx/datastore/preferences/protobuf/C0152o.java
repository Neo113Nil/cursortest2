package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0152o f1729a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0152o f1730b;

    static {
        C0152o c0152o = new C0152o();
        Collections.emptyMap();
        f1730b = c0152o;
    }

    public static C0152o a() {
        T t2 = T.f1643c;
        C0152o c0152o = f1729a;
        if (c0152o == null) {
            synchronized (C0152o.class) {
                try {
                    c0152o = f1729a;
                    if (c0152o == null) {
                        Class cls = AbstractC0151n.f1728a;
                        C0152o c0152o2 = null;
                        if (cls != null) {
                            try {
                                c0152o2 = (C0152o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0152o2 == null) {
                            c0152o2 = f1730b;
                        }
                        f1729a = c0152o2;
                        c0152o = c0152o2;
                    }
                } finally {
                }
            }
        }
        return c0152o;
    }
}
