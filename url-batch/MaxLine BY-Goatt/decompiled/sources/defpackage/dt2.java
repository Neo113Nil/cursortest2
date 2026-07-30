package defpackage;

import com.facebook.bolts.CancellationToken;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dt2 implements Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ Continuation c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ CancellationToken e;

    public /* synthetic */ dt2(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i) {
        this.a = i;
        this.b = taskCompletionSource;
        this.c = continuation;
        this.d = executor;
        this.e = cancellationToken;
    }

    @Override // com.facebook.bolts.Continuation
    public final Object then(Task task) {
        Void continueWith$lambda$10$lambda$9;
        Void continueWithTask$lambda$12$lambda$11;
        int i = this.a;
        CancellationToken cancellationToken = this.e;
        Executor executor = this.d;
        Continuation continuation = this.c;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                continueWith$lambda$10$lambda$9 = Task.continueWith$lambda$10$lambda$9(taskCompletionSource, continuation, executor, cancellationToken, task);
                return continueWith$lambda$10$lambda$9;
            default:
                continueWithTask$lambda$12$lambda$11 = Task.continueWithTask$lambda$12$lambda$11(taskCompletionSource, continuation, executor, cancellationToken, task);
                return continueWithTask$lambda$12$lambda$11;
        }
    }
}
