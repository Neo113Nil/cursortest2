package C;

import a.C0061f;
import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import g.AbstractActivityC0106i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f94b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f95c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f93a = i;
        this.f94b = obj;
        this.f95c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f94b;
        Object obj2 = this.f95c;
        switch (this.f93a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) obj;
                int i = a.l.f1249r;
                abstractActivityC0106i.f1250a.a(new C0061f((x) obj2, abstractActivityC0106i));
                return;
            case 2:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? f0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f0.g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
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
