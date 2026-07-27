package B1;

import a2.ScheduledFutureC0420i;
import a2.ThreadFactoryC0412a;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b.C0492g;
import com.chicken.road.kedro.laqer.R;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import java.util.Random;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import u1.AbstractC1224h;
import u1.RunnableC1222f;
import u2.InterfaceC1228a;
import u2.InterfaceC1229b;
import w2.C1294c;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1016e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1017i;

    public /* synthetic */ o(Object obj, int i2, Object obj2) {
        this.f1015d = i2;
        this.f1016e = obj;
        this.f1017i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1228a interfaceC1228a;
        int i2 = 0;
        switch (this.f1015d) {
            case 0:
                q qVar = VillagePageActivity.Companion;
                Object[] objArr = {((M2.E) this.f1017i).f3580d};
                VillagePageActivity villagePageActivity = (VillagePageActivity) this.f1016e;
                String string = villagePageActivity.getString(R.string.web_download_saved, objArr);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Toast.makeText(villagePageActivity, string, 0).show();
                return;
            case 1:
                U.a.a((U.c) this.f1016e, (LongSparseArray) this.f1017i);
                return;
            case 2:
                Z1.r rVar = (Z1.r) this.f1016e;
                InterfaceC1229b interfaceC1229b = (InterfaceC1229b) this.f1017i;
                if (rVar.f4601b != Z1.r.f4599d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (rVar) {
                    interfaceC1228a = rVar.f4600a;
                    rVar.f4600a = null;
                    rVar.f4601b = interfaceC1229b;
                }
                interfaceC1228a.b(interfaceC1229b);
                return;
            case 3:
                Z1.p pVar = (Z1.p) this.f1016e;
                InterfaceC1229b interfaceC1229b2 = (InterfaceC1229b) this.f1017i;
                synchronized (pVar) {
                    try {
                        if (pVar.f4594b == null) {
                            pVar.f4593a.add(interfaceC1229b2);
                        } else {
                            pVar.f4594b.add(interfaceC1229b2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                ThreadFactoryC0412a threadFactoryC0412a = (ThreadFactoryC0412a) this.f1016e;
                Process.setThreadPriority(threadFactoryC0412a.f4909c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC0412a.f4910d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f1017i).run();
                return;
            case 5:
                Callable callable = (Callable) this.f1016e;
                C1294c c1294c = (C1294c) this.f1017i;
                try {
                    Object call = callable.call();
                    ScheduledFutureC0420i scheduledFutureC0420i = (ScheduledFutureC0420i) c1294c.f11388d;
                    scheduledFutureC0420i.getClass();
                    if (call == null) {
                        call = Q0.h.f3935m;
                    }
                    if (Q0.h.f3934l.p(scheduledFutureC0420i, null, call)) {
                        Q0.h.e(scheduledFutureC0420i);
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    c1294c.o(e4);
                    return;
                }
            case 6:
                b.o this$0 = (b.o) this.f1016e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                b.D dispatcher = (b.D) this.f1017i;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                int i4 = b.o.f5560z;
                this$0.getClass();
                this$0.f5561d.a(new C0492g(dispatcher, this$0));
                return;
            default:
                ((ProfileInstallerInitializer) this.f1016e).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC1224h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1222f((Context) this.f1017i, i2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
