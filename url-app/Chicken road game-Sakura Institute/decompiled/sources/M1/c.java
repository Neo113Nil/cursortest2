package M1;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3574b;

    /* renamed from: a, reason: collision with root package name */
    public b f3575a;

    static {
        c cVar = new c();
        cVar.f3575a = null;
        f3574b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f3574b;
        synchronized (cVar) {
            try {
                if (cVar.f3575a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f3575a = new b(context, 0);
                }
                bVar = cVar.f3575a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
