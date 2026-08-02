package j1;

import java.util.concurrent.Executor;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1174c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13874a;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f13874a) {
            case 0:
                runnable.run();
                break;
        }
    }
}
