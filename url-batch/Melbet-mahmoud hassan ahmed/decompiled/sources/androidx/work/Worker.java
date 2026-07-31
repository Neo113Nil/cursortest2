package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.d;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: k, reason: collision with root package name */
    d<ListenableWorker.a> f1404k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f1404k.q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f1404k.r(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final p4.a<ListenableWorker.a> startWork() {
        this.f1404k = d.u();
        getBackgroundExecutor().execute(new a());
        return this.f1404k;
    }
}
