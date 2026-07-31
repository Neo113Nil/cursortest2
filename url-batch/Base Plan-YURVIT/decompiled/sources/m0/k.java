package m0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2890a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f2890a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // m0.e
    public final void a(c cVar) {
        this.f2890a.post(cVar);
    }
}
