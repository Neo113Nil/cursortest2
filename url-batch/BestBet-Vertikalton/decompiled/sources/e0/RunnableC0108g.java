package e0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.AbstractC0130k;
import g.LayoutInflaterFactory2C0112A;
import g.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z.AbstractC0400c;

/* renamed from: e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0108g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2502b;

    public /* synthetic */ RunnableC0108g(Context context, int i) {
        this.f2501a = i;
        this.f2502b = context;
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
        switch (this.f2501a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0108g(this.f2502b, 1));
                break;
            case 1:
                AbstractC0107f.s(this.f2502b, new ExecutorC0105d(0), AbstractC0107f.f2494a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f2502b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = o.f2684c;
                            break;
                        } else {
                            Iterator it = o.f2687g.iterator();
                            while (true) {
                                o.g gVar = (o.g) it;
                                if (gVar.hasNext()) {
                                    o oVar = (o) ((WeakReference) gVar.next()).get();
                                    if (oVar != null && (context = ((LayoutInflaterFactory2C0112A) oVar).f2576k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new G.f(new G.g(g.l.a(obj)));
                                if (fVar.f289a.f290a.isEmpty()) {
                                    String e2 = AbstractC0400c.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, AbstractC0130k.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = G.f.f288b;
                            if (fVar.f289a.f290a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o.f2686f = true;
                break;
        }
    }
}
