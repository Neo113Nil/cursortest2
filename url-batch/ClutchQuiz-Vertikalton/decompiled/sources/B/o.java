package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.room.A;
import g.AbstractActivityC0136i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f65c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f63a = i;
        this.f64b = obj;
        this.f65c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f64b;
        Object obj2 = this.f65c;
        switch (this.f63a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0136i abstractActivityC0136i = (AbstractActivityC0136i) obj;
                int i = a.l.f1198r;
                abstractActivityC0136i.f1199a.a(new a.f((x) obj2, abstractActivityC0136i));
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                g1.f.e(runnable, "$command");
                g1.f.e((A) obj2, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 3:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? d0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d0.g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable2 = (Runnable) obj2;
                ((A) obj).getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
