package G0;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final String f777a = s.f("WorkerFactory");

    public final r a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f777a;
        r rVar = null;
        try {
            cls = Class.forName(str).asSubclass(r.class);
        } catch (Throwable th) {
            s.d().c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                rVar = (r) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                s.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (rVar == null || !rVar.isUsed()) {
            return rVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
