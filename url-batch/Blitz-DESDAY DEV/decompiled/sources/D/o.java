package D;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import f0.AbstractC0094j;
import f0.RunnableC0091g;
import g.AbstractActivityC0110i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f140a = i;
        this.f141b = obj;
        this.f142c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f141b;
        Object obj2 = this.f142c;
        switch (this.f140a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0110i abstractActivityC0110i = (AbstractActivityC0110i) obj;
                int i = a.l.f1259r;
                abstractActivityC0110i.f1260a.a(new a.f((x) obj2, abstractActivityC0110i));
                return;
            case 2:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0094j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0091g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
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
