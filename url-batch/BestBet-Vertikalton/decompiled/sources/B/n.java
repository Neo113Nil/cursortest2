package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import e0.RunnableC0108g;
import g.AbstractActivityC0128i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50c;

    public /* synthetic */ n(Object obj, int i, Object obj2) {
        this.f48a = i;
        this.f49b = obj;
        this.f50c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f50c;
        Object obj2 = this.f49b;
        switch (this.f48a) {
            case 0:
                ((b) obj2).h((Typeface) obj);
                return;
            case 1:
                AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) obj2;
                int i = a.l.f1578r;
                abstractActivityC0128i.f1579a.a(new a.f((x) obj, abstractActivityC0128i));
                return;
            case 2:
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? e0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0108g((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                Runnable runnable = (Runnable) obj;
                ((g.m) obj2).getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                }
            default:
                Runnable runnable2 = (Runnable) obj2;
                k1.e.e(runnable2, "$command");
                k1.e.e((g.m) obj, "this$0");
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
