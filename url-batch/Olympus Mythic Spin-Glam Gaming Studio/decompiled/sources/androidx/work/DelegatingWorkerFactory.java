package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class DelegatingWorkerFactory extends WorkerFactory {
    private static final String TAG = Logger.tagWithPrefix("DelegatingWkrFctry");
    private final List mFactories;

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.mFactories.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker createWorker = ((WorkerFactory) it.next()).createWorker(context, str, workerParameters);
                if (createWorker != null) {
                    return createWorker;
                }
            } catch (Throwable th) {
                Logger.get().error(TAG, "Unable to instantiate a ListenableWorker (" + str + ")", th);
                throw th;
            }
        }
        return null;
    }
}
