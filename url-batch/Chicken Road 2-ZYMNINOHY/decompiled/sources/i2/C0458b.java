package i2;

import L1.k;
import android.content.Context;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0458b f9322b;

    /* renamed from: a, reason: collision with root package name */
    public k f9323a;

    static {
        C0458b c0458b = new C0458b();
        c0458b.f9323a = null;
        f9322b = c0458b;
    }

    public static k a(Context context) {
        k kVar;
        C0458b c0458b = f9322b;
        synchronized (c0458b) {
            try {
                if (c0458b.f9323a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0458b.f9323a = new k(context, false);
                }
                kVar = c0458b.f9323a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }
}
