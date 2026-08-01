package f0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.AbstractC0112k;
import g.LayoutInflaterFactory2C0101A;
import g.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0091g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2173b;

    public /* synthetic */ RunnableC0091g(Context context, int i) {
        this.f2172a = i;
        this.f2173b = context;
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
        switch (this.f2172a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0091g(this.f2173b, 1));
                break;
            case 1:
                AbstractC0090f.s(this.f2173b, new ExecutorC0088d(), AbstractC0090f.f2165a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f2173b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = o.f2328c;
                            break;
                        } else {
                            Iterator it = o.f2331g.iterator();
                            while (true) {
                                q.g gVar = (q.g) it;
                                if (gVar.hasNext()) {
                                    o oVar = (o) ((WeakReference) gVar.next()).get();
                                    if (oVar != null && (context = ((LayoutInflaterFactory2C0101A) oVar).f2221k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new I.f(new I.g(g.l.a(obj)));
                                if (fVar.f333a.f334a.isEmpty()) {
                                    String e2 = B.e.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, AbstractC0112k.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = I.f.f332b;
                            if (fVar.f333a.f334a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o.f2330f = true;
                break;
        }
    }
}
