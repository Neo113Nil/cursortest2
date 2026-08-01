package B;

import K.C0017m;
import a.C0039B;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.profileinstaller.ProfileInstallerInitializer;
import g.ExecutorC0163o;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f43a = i;
        this.f44b = obj;
        this.f45c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43a) {
            case 0:
                ((b) this.f44b).h((Typeface) this.f45c);
                return;
            case 1:
                r0.getLifecycle().a(new C0017m((C0039B) this.f45c, 1, (AbstractActivityC0064v) this.f44b));
                return;
            case 2:
                ((ProfileInstallerInitializer) this.f44b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? c0.i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new c0.f((Context) this.f45c, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable = (Runnable) this.f45c;
                ExecutorC0163o executorC0163o = (ExecutorC0163o) this.f44b;
                executorC0163o.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0163o.a();
                }
        }
    }
}
