package u1;

import U.e;
import android.content.Context;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1478b f12047b;

    /* renamed from: a, reason: collision with root package name */
    public e f12048a;

    static {
        C1478b c1478b = new C1478b();
        c1478b.f12048a = null;
        f12047b = c1478b;
    }

    public static e a(Context context) {
        e eVar;
        C1478b c1478b = f12047b;
        synchronized (c1478b) {
            try {
                if (c1478b.f12048a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c1478b.f12048a = new e((Object) context);
                }
                eVar = c1478b.f12048a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
