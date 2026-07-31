package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0204n f3906a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0204n f3907b;

    static {
        C0204n c0204n = new C0204n();
        Collections.emptyMap();
        f3907b = c0204n;
    }

    public static C0204n a() {
        C0204n c0204n = f3906a;
        if (c0204n == null) {
            synchronized (C0204n.class) {
                try {
                    c0204n = f3906a;
                    if (c0204n == null) {
                        Class cls = AbstractC0203m.f3904a;
                        C0204n c0204n2 = null;
                        if (cls != null) {
                            try {
                                c0204n2 = (C0204n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0204n2 == null) {
                            c0204n2 = f3907b;
                        }
                        f3906a = c0204n2;
                        c0204n = c0204n2;
                    }
                } finally {
                }
            }
        }
        return c0204n;
    }
}
