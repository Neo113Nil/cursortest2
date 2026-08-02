package G1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f564a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f564a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // G1.e
    public final void a(c cVar) {
        this.f564a.post(cVar);
    }
}
