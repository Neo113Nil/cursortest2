package m2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Handler f19072f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19072f.post(runnable);
    }
}
