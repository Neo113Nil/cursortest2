package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class atf {
    public abstract asp a(Context context, String str, WorkerParameters workerParameters);

    public final asp b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        asp a = a(context, str, workerParameters);
        if (a == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(asp.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    a = (asp) newInstance;
                } catch (Throwable th) {
                    asq.a().d(atg.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                asq.a().d(atg.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!a.c) {
            return a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
