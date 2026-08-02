package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddk implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public ddk(int i) {
        this.b = i;
        this.a = new gbg(Looper.getMainLooper(), (byte[]) null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        Handler handler = this.a;
        if (i != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public ddk(Looper looper, int i) {
        this.b = i;
        this.a = new gbg(looper, (byte[]) null);
    }
}
