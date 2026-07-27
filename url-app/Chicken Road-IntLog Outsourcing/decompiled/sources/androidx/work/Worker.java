package androidx.work;

import D0.k;
import J1.a;
import android.content.Context;
import s0.m;
import s0.p;
import s0.r;

/* loaded from: classes.dex */
public abstract class Worker extends r {

    /* renamed from: a, reason: collision with root package name */
    public k f4708a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract p a();

    @Override // s0.r
    public final a getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new m(this, kVar, 1, false));
        return kVar;
    }

    @Override // s0.r
    public final a startWork() {
        this.f4708a = new k();
        getBackgroundExecutor().execute(new B.a(22, this));
        return this.f4708a;
    }
}
