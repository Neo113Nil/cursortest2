package androidx.room;

import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.widget.Toast;
import b.i0;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1067h;

    public /* synthetic */ b0(f5.a aVar, Runnable runnable) {
        this.f1065f = 5;
        this.f1067h = aVar;
        this.f1066g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z5.a aVar;
        switch (this.f1065f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Runnable runnable = (Runnable) this.f1066g;
                c0 c0Var = (c0) this.f1067h;
                r6.k.f(runnable, "$command");
                r6.k.f(c0Var, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    c0Var.a();
                }
            case 1:
                b.o oVar = (b.o) this.f1066g;
                i0 i0Var = (i0) this.f1067h;
                int i7 = b.o.f1195y;
                oVar.f8494f.a(new b.g(i0Var, oVar));
                return;
            case 2:
                e5.r rVar = (e5.r) this.f1066g;
                z5.b bVar = (z5.b) this.f1067h;
                if (rVar.f2797b != e5.r.f2795d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (rVar) {
                    aVar = rVar.f2796a;
                    rVar.f2796a = null;
                    rVar.f2797b = bVar;
                }
                aVar.a(bVar);
                return;
            case 3:
                e5.q qVar = (e5.q) this.f1066g;
                z5.b bVar2 = (z5.b) this.f1067h;
                synchronized (qVar) {
                    try {
                        if (qVar.f2793b == null) {
                            qVar.f2792a.add(bVar2);
                        } else {
                            qVar.f2793b.add(bVar2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                PlatePageActivity platePageActivity = (PlatePageActivity) this.f1066g;
                r6.v vVar = (r6.v) this.f1067h;
                f4.m mVar = PlatePageActivity.Companion;
                String string = platePageActivity.getString(R.string.web_download_saved, vVar.f7968f);
                r6.k.e(string, "getString(...)");
                Toast.makeText(platePageActivity, string, 0).show();
                return;
            case 5:
                f5.a aVar2 = (f5.a) this.f1067h;
                Runnable runnable2 = (Runnable) this.f1066g;
                Process.setThreadPriority(aVar2.f3367c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f3368d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 6:
                Callable callable = (Callable) this.f1066g;
                b6.c cVar = (b6.c) this.f1067h;
                try {
                    Object call = callable.call();
                    f5.i iVar = (f5.i) cVar.f1394g;
                    if (call == null) {
                        call = q2.h.f7507l;
                    }
                    if (q2.h.f7506k.r(iVar, null, call)) {
                        q2.h.g(iVar);
                        return;
                    }
                    return;
                } catch (Exception e9) {
                    cVar.z(e9);
                    return;
                }
            default:
                u0.a.a((u0.c) this.f1066g, (LongSparseArray) this.f1067h);
                return;
        }
    }

    public /* synthetic */ b0(Object obj, int i7, Object obj2) {
        this.f1065f = i7;
        this.f1066g = obj;
        this.f1067h = obj2;
    }
}
