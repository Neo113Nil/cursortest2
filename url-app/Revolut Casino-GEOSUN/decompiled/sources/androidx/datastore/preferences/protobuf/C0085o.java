package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0085o f1480a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0085o f1481b;

    static {
        C0085o c0085o = new C0085o();
        Collections.emptyMap();
        f1481b = c0085o;
    }

    public static C0085o a() {
        T t2 = T.f1395c;
        C0085o c0085o = f1480a;
        if (c0085o == null) {
            synchronized (C0085o.class) {
                try {
                    c0085o = f1480a;
                    if (c0085o == null) {
                        Class cls = AbstractC0084n.f1479a;
                        C0085o c0085o2 = null;
                        if (cls != null) {
                            try {
                                c0085o2 = (C0085o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0085o2 == null) {
                            c0085o2 = f1481b;
                        }
                        f1480a = c0085o2;
                        c0085o = c0085o2;
                    }
                } finally {
                }
            }
        }
        return c0085o;
    }
}
