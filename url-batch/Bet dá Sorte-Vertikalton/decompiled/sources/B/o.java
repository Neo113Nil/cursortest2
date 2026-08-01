package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import g.AbstractActivityC0128i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f62c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f60a = i;
        this.f61b = obj;
        this.f62c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f61b;
        Object obj2 = this.f62c;
        switch (this.f60a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) obj;
                int i = a.l.f1131r;
                abstractActivityC0128i.f1132a.a(new a.f((x) obj2, abstractActivityC0128i));
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
