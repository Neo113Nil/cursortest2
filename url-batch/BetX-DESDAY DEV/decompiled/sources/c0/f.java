package c0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.AbstractC0161m;
import g.AbstractC0162n;
import g.LayoutInflaterFactory2C0142C;
import g.q;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1694b;

    public /* synthetic */ f(Context context, int i) {
        this.f1693a = i;
        this.f1694b = context;
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
        G.g gVar;
        Object obj;
        Context context;
        switch (this.f1693a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f1694b, 1));
                break;
            case 1:
                e.s(this.f1694b, new c(), e.f1685a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f1694b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            gVar = q.f2589c;
                            break;
                        } else {
                            Iterator it = q.f2593g.iterator();
                            while (true) {
                                o.g gVar2 = (o.g) it;
                                if (gVar2.hasNext()) {
                                    q qVar = (q) ((WeakReference) gVar2.next()).get();
                                    if (qVar != null && (context = ((LayoutInflaterFactory2C0142C) qVar).f2471k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                gVar = new G.g(new G.h(AbstractC0162n.a(obj)));
                                if (gVar.f201a.f202a.isEmpty()) {
                                    String e2 = z.f.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC0162n.b(systemService, AbstractC0161m.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            gVar = G.g.f200b;
                            if (gVar.f201a.f202a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                q.f2592f = true;
                break;
        }
    }
}
