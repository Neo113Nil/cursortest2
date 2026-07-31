package r0;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f20884a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f20885b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (p1.class) {
            if (f20884a.add(str)) {
                f20885b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (p1.class) {
            str = f20885b;
        }
        return str;
    }
}
