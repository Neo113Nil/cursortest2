package e0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: e0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123k implements InterfaceC0117e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1884a;

    public C0123k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f1884a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // e0.InterfaceC0117e
    public final void a(RunnableC0115c runnableC0115c) {
        this.f1884a.post(runnableC0115c);
    }
}
