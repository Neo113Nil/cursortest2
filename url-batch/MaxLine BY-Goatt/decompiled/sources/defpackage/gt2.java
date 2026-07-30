package defpackage;

import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class gt2 implements Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ gt2(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = taskCompletionSource;
    }

    @Override // com.facebook.bolts.Continuation
    public final Object then(Task task) {
        Void whenAnyResult$lambda$3;
        Void whenAny$lambda$4;
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                whenAnyResult$lambda$3 = Task.Companion.whenAnyResult$lambda$3(atomicBoolean, taskCompletionSource, task);
                return whenAnyResult$lambda$3;
            default:
                whenAny$lambda$4 = Task.Companion.whenAny$lambda$4(atomicBoolean, taskCompletionSource, task);
                return whenAny$lambda$4;
        }
    }
}
