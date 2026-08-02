package a0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: a0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0129E implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3845b;

    public /* synthetic */ ExecutorC0129E(int i4, Object obj) {
        this.f3844a = i4;
        this.f3845b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3844a) {
            case 0:
                ((W.F) this.f3845b).c(runnable);
                break;
            default:
                ((Handler) this.f3845b).post(runnable);
                break;
        }
    }
}
