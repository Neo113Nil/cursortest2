package H;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Method;
import s1.AbstractC0335s;
import z.AbstractC0399b;
import z.C0398a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f474a;

    /* renamed from: b, reason: collision with root package name */
    public Object f475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f476c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f474a = i;
        this.f475b = obj;
        this.f476c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1.g gVar;
        switch (this.f474a) {
            case 0:
                B.b bVar = (B.b) ((A0.c) this.f475b).f6b;
                if (bVar != null) {
                    bVar.h((Typeface) this.f476c);
                    return;
                }
                return;
            case 1:
                ((g) this.f475b).a(this.f476c);
                return;
            case 2:
                int i = 0;
                do {
                    try {
                        ((Runnable) this.f475b).run();
                    } catch (Throwable th) {
                        AbstractC0335s.d(b1.k.f2050a, th);
                    }
                    gVar = (w1.g) this.f476c;
                    Runnable t2 = gVar.t();
                    if (t2 == null) {
                        return;
                    }
                    this.f475b = t2;
                    i++;
                } while (i < 16);
                y1.l lVar = gVar.f4500c;
                lVar.getClass();
                lVar.r(gVar, this);
                return;
            case 3:
                ((C0398a) this.f475b).f4611a = this.f476c;
                return;
            case 4:
                ((Application) this.f475b).unregisterActivityLifecycleCallbacks((C0398a) this.f476c);
                return;
            default:
                try {
                    Method method = AbstractC0399b.d;
                    Object obj = this.f476c;
                    Object obj2 = this.f475b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0399b.f4619e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
        }
    }

    public a(w1.g gVar, Runnable runnable) {
        this.f474a = 2;
        this.f476c = gVar;
        this.f475b = runnable;
    }
}
