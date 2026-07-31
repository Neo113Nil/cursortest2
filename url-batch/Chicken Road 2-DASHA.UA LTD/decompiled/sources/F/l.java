package F;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f235a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f235a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // F.e
    public final void a(c cVar) {
        this.f235a.post(cVar);
    }
}
