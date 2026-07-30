package z1;

import a1.j;
import android.content.Context;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1054b f8714b;

    /* renamed from: a, reason: collision with root package name */
    public j f8715a;

    static {
        C1054b c1054b = new C1054b();
        c1054b.f8715a = null;
        f8714b = c1054b;
    }

    public static j a(Context context) {
        j jVar;
        C1054b c1054b = f8714b;
        synchronized (c1054b) {
            try {
                if (c1054b.f8715a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    j jVar2 = new j();
                    jVar2.f3070a = context;
                    c1054b.f8715a = jVar2;
                }
                jVar = c1054b.f8715a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}
