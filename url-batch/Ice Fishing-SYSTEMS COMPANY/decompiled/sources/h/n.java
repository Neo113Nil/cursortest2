package h;

import D.AbstractC0290j;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4797a;
import r0.AbstractC4955d;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38116n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f38117u;

    public /* synthetic */ n(Context context, int i) {
        this.f38116n = i;
        this.f38117u = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        K.l lVar;
        Object obj;
        Context context;
        switch (this.f38116n) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f38117u;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            lVar = q.f38122v;
                            break;
                        } else {
                            Iterator it = q.f38126z.iterator();
                            while (true) {
                                s.f fVar = (s.f) it;
                                if (fVar.hasNext()) {
                                    q qVar = (q) ((WeakReference) fVar.next()).get();
                                    if (qVar != null && (context = ((LayoutInflaterFactory2C4535B) qVar).f37973D) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                lVar = new K.l(new K.m(p.a(obj)));
                                if (lVar.f1480a.f1481a.isEmpty()) {
                                    String e6 = AbstractC0290j.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        p.b(systemService, o.a(e6));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            lVar = K.l.f1479b;
                            if (lVar.f1480a.f1481a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                q.f38125y = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new n(this.f38117u, 2));
                break;
            default:
                AbstractC4955d.t(this.f38117u, new ExecutorC4797a(1), AbstractC4955d.f40214a, false);
                break;
        }
    }
}
