package S0;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f1335b;

    /* renamed from: a, reason: collision with root package name */
    public b f1336a;

    static {
        c cVar = new c();
        cVar.f1336a = null;
        f1335b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f1335b;
        synchronized (cVar) {
            try {
                if (cVar.f1336a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    b bVar2 = new b();
                    bVar2.f1334a = context;
                    cVar.f1336a = bVar2;
                }
                bVar = cVar.f1336a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
