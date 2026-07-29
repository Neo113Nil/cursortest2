package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import g.AbstractActivityC0125i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f37a = i;
        this.f38b = obj;
        this.f39c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f38b;
        Object obj2 = this.f39c;
        switch (this.f37a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0125i abstractActivityC0125i = (AbstractActivityC0125i) obj;
                int i = a.l.f1054r;
                abstractActivityC0125i.f1055a.a(new a.f((x) obj2, abstractActivityC0125i));
                return;
            case 2:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? d0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d0.g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
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
