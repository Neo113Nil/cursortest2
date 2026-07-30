package defpackage;

import com.facebook.bolts.CancellationToken;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ct2 implements Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationToken b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ct2(CancellationToken cancellationToken, Object obj, int i) {
        this.a = i;
        this.b = cancellationToken;
        this.c = obj;
    }

    @Override // com.facebook.bolts.Continuation
    public final Object then(Task task) {
        Task onSuccessTask$lambda$14;
        Task onSuccess$lambda$13;
        Void completeAfterTask$lambda$7$lambda$6;
        switch (this.a) {
            case 0:
                onSuccessTask$lambda$14 = Task.onSuccessTask$lambda$14(this.b, (Continuation) this.c, task);
                return onSuccessTask$lambda$14;
            case 1:
                onSuccess$lambda$13 = Task.onSuccess$lambda$13(this.b, (Continuation) this.c, task);
                return onSuccess$lambda$13;
            default:
                completeAfterTask$lambda$7$lambda$6 = Task.Companion.completeAfterTask$lambda$7$lambda$6(this.b, (TaskCompletionSource) this.c, task);
                return completeAfterTask$lambda$7$lambda$6;
        }
    }
}
