package j4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: j4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582k implements InterfaceC0576e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5988a;

    public C0582k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f5988a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // j4.InterfaceC0576e
    public final void a(RunnableC0574c runnableC0574c) {
        this.f5988a.post(runnableC0574c);
    }
}
