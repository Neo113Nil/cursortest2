package f0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.A;
import g.AbstractC0108k;
import g.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2186b;

    public /* synthetic */ g(Context context, int i) {
        this.f2185a = i;
        this.f2186b = context;
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
        H.f fVar;
        Object obj;
        Context context;
        switch (this.f2185a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f2186b, 1));
                break;
            case 1:
                f.s(this.f2186b, new d(), f.f2177a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f2186b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = o.f2346c;
                            break;
                        } else {
                            Iterator it = o.f2349g.iterator();
                            while (true) {
                                p.g gVar = (p.g) it;
                                if (gVar.hasNext()) {
                                    o oVar = (o) ((WeakReference) gVar.next()).get();
                                    if (oVar != null && (context = ((A) oVar).f2234k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new H.f(new H.g(g.l.a(obj)));
                                if (fVar.f293a.f294a.isEmpty()) {
                                    String e2 = A.e.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, AbstractC0108k.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = H.f.f292b;
                            if (fVar.f293a.f294a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o.f2348f = true;
                break;
        }
    }
}
