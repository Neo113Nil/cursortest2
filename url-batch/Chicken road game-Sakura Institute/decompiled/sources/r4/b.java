package r4;

import android.content.Context;
import l3.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7941b;

    /* renamed from: a, reason: collision with root package name */
    public n f7942a;

    static {
        b bVar = new b();
        bVar.f7942a = null;
        f7941b = bVar;
    }

    public static n a(Context context) {
        n nVar;
        b bVar = f7941b;
        synchronized (bVar) {
            try {
                if (bVar.f7942a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f7942a = new n(context, 1);
                }
                nVar = bVar.f7942a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }
}
