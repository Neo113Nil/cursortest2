package j1;

import android.util.Log;
import java.util.HashSet;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4591d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4590c f38485a = new C4590c();

    public static void a() {
        f38485a.getClass();
    }

    public static void b(String str) {
        f38485a.getClass();
        HashSet hashSet = C4590c.f38484a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f38485a.getClass();
        HashSet hashSet = C4590c.f38484a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
