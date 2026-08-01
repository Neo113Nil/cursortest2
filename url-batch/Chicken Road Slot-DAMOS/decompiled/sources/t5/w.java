package t5;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9321a = o.f("WorkerFactory");

    public final n a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f9321a;
        n nVar = null;
        try {
            cls = Class.forName(str).asSubclass(n.class);
        } catch (Throwable th) {
            o.d().c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                nVar = (n) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (nVar == null || !nVar.isUsed()) {
            return nVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
