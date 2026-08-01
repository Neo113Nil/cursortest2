package D;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.room.D;
import b.C0093f;
import b.w;
import h.AbstractActivityC0132i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188c;

    public /* synthetic */ n(Object obj, int i, Object obj2) {
        this.f186a = i;
        this.f187b = obj;
        this.f188c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f187b;
        Object obj2 = this.f188c;
        switch (this.f186a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                j1.h.e(runnable, "$command");
                j1.h.e((D) obj2, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 2:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) obj;
                int i = b.l.f2176r;
                abstractActivityC0132i.f2177a.a(new C0093f((w) obj2, abstractActivityC0132i));
                return;
            case 3:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? f0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f0.g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable2 = (Runnable) obj2;
                ((D) obj).getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
