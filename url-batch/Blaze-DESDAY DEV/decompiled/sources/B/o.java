package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import g.AbstractActivityC0108i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f52a = i;
        this.f53b = obj;
        this.f54c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f53b;
        Object obj2 = this.f54c;
        switch (this.f52a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0108i abstractActivityC0108i = (AbstractActivityC0108i) obj;
                int i = a.l.f1204r;
                abstractActivityC0108i.f1205a.a(new a.f((x) obj2, abstractActivityC0108i));
                return;
            case 2:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? e0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e0.g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                g.m mVar = (g.m) obj;
                mVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    mVar.a();
                }
        }
    }
}
