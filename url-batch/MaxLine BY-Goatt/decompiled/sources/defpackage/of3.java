package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class of3 implements Executor {
    public static final /* synthetic */ of3 n = new of3(0);
    public static final /* synthetic */ of3 o = new of3(1);
    public final /* synthetic */ int m;

    public /* synthetic */ of3(int i) {
        this.m = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.m) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
