package T;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f2607a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f2608b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (A.class) {
            if (f2607a.add(str)) {
                f2608b += ", " + str;
            }
        }
    }
}
