package a1;

import D0.k;
import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3126b;

    /* renamed from: a, reason: collision with root package name */
    public k f3127a;

    static {
        b bVar = new b();
        bVar.f3127a = null;
        f3126b = bVar;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f3126b;
        synchronized (bVar) {
            try {
                if (bVar.f3127a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    k kVar2 = new k();
                    kVar2.f345a = context;
                    bVar.f3127a = kVar2;
                }
                kVar = bVar.f3127a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }
}
