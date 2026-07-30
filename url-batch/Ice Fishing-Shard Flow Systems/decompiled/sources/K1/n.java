package K1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n f1442e = new n(3);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n f1443i = new n(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1444d;

    public /* synthetic */ n(int i2) {
        this.f1444d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1444d) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
