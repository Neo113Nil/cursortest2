package defpackage;

import com.facebook.bolts.CancellationToken;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ft2 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ CancellationToken n;
    public final /* synthetic */ TaskCompletionSource o;
    public final /* synthetic */ Continuation p;
    public final /* synthetic */ Task q;

    public /* synthetic */ ft2(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task, int i) {
        this.m = i;
        this.n = cancellationToken;
        this.o = taskCompletionSource;
        this.p = continuation;
        this.q = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                Task.Companion.completeAfterTask$lambda$7(this.n, this.o, this.p, this.q);
                break;
            default:
                Task.Companion.completeImmediately$lambda$5(this.n, this.o, this.p, this.q);
                break;
        }
    }
}
