package Q0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h f1980g = new h(0);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h f1981h = new h(1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1982f;

    public /* synthetic */ h(int i7) {
        this.f1982f = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1982f) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
