package C0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f351a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f351a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
