package f0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import h.AbstractC0134k;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2681b;

    public /* synthetic */ g(Context context, int i) {
        this.f2680a = i;
        this.f2681b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        I.f fVar;
        Object obj;
        Context context;
        switch (this.f2680a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f2681b, 1));
                break;
            case 1:
                f.s(this.f2681b, new ExecutorC0120d(0), f.f2673a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f2681b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = h.n.f2810c;
                            break;
                        } else {
                            Iterator it = h.n.f2813g.iterator();
                            while (true) {
                                q.g gVar = (q.g) it;
                                if (gVar.hasNext()) {
                                    h.n nVar = (h.n) ((WeakReference) gVar.next()).get();
                                    if (nVar != null && (context = ((z) nVar).f2877k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new I.f(new I.g(h.l.a(obj)));
                                if (fVar.f577a.f578a.isEmpty()) {
                                    String e = B.d.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        h.l.b(systemService, AbstractC0134k.a(e));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = I.f.f576b;
                            if (fVar.f577a.f578a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                h.n.f2812f = true;
                break;
        }
    }
}
