package l0;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5290a = q.f("WorkerFactory");

    public final p a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f5290a;
        p pVar = null;
        try {
            cls = Class.forName(str).asSubclass(p.class);
        } catch (Throwable th) {
            q.d().c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                pVar = (p) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                q.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (pVar == null || !pVar.isUsed()) {
            return pVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
