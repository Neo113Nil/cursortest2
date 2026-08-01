package i7;

import android.content.Context;
import c4.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4668b;

    /* renamed from: a, reason: collision with root package name */
    public o f4669a;

    static {
        b bVar = new b();
        bVar.f4669a = null;
        f4668b = bVar;
    }

    public static o a(Context context) {
        o oVar;
        b bVar = f4668b;
        synchronized (bVar) {
            try {
                if (bVar.f4669a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f4669a = new o(context, (char) 0);
                }
                oVar = bVar.f4669a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }
}
