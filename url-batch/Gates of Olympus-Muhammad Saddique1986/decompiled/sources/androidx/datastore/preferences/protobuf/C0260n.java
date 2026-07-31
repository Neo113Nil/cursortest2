package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0260n f5107a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0260n f5108b;

    static {
        C0260n c0260n = new C0260n();
        Collections.emptyMap();
        f5108b = c0260n;
    }

    public static C0260n a() {
        C0260n c0260n = f5107a;
        if (c0260n == null) {
            synchronized (C0260n.class) {
                try {
                    c0260n = f5107a;
                    if (c0260n == null) {
                        Class cls = AbstractC0259m.f5105a;
                        C0260n c0260n2 = null;
                        if (cls != null) {
                            try {
                                c0260n2 = (C0260n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0260n2 == null) {
                            c0260n2 = f5108b;
                        }
                        f5107a = c0260n2;
                        c0260n = c0260n2;
                    }
                } finally {
                }
            }
        }
        return c0260n;
    }
}
