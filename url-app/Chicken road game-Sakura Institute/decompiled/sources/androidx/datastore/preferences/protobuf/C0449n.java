package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0449n f5381a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0449n f5382b;

    static {
        C0449n c0449n = new C0449n();
        Collections.emptyMap();
        f5382b = c0449n;
    }

    public static C0449n a() {
        C0449n c0449n = f5381a;
        if (c0449n == null) {
            synchronized (C0449n.class) {
                try {
                    c0449n = f5381a;
                    if (c0449n == null) {
                        Class cls = AbstractC0448m.f5379a;
                        C0449n c0449n2 = null;
                        if (cls != null) {
                            try {
                                c0449n2 = (C0449n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0449n2 == null) {
                            c0449n2 = f5382b;
                        }
                        f5381a = c0449n2;
                        c0449n = c0449n2;
                    }
                } finally {
                }
            }
        }
        return c0449n;
    }
}
