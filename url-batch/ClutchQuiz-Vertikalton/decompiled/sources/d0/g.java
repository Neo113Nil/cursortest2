package d0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2097b;

    public /* synthetic */ g(Context context, int i) {
        this.f2096a = i;
        this.f2097b = context;
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
        G.f fVar;
        Object obj;
        Context context;
        switch (this.f2096a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f2097b, 1));
                break;
            case 1:
                AbstractC0092f.s(this.f2097b, new ExecutorC0090d(0), AbstractC0092f.f2089a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f2097b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = g.n.f2458c;
                            break;
                        } else {
                            Iterator it = g.n.f2461g.iterator();
                            while (true) {
                                o.g gVar = (o.g) it;
                                if (gVar.hasNext()) {
                                    g.n nVar = (g.n) ((WeakReference) gVar.next()).get();
                                    if (nVar != null && (context = ((z) nVar).f2524k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new G.f(new G.g(g.l.a(obj)));
                                if (fVar.f209a.f210a.isEmpty()) {
                                    String e2 = z.c.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, g.k.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = G.f.f208b;
                            if (fVar.f209a.f210a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                g.n.f2460f = true;
                break;
        }
    }
}
