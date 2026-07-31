package a5;

import a5.c;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class g implements c.d {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f257a = u5.a.a(Looper.getMainLooper());

    @Override // a5.c.d
    public void a(Runnable runnable) {
        this.f257a.post(runnable);
    }
}
