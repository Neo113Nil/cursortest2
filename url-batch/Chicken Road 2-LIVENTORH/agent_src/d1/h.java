package d1;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.c0;
import g.m;
import g.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f1111g;

    public /* synthetic */ h(Context context, int i) {
        this.f1110f = i;
        this.f1111g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        j0.e eVar;
        Object obj;
        Context context;
        switch (this.f1110f) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f1111g, 1));
                break;
            case 1:
                f.t(this.f1111g, new d(), f.f1100a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f1111g;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            eVar = p.f1678h;
                            break;
                        } else {
                            q.g gVar = p.f1681l;
                            gVar.getClass();
                            q.b bVar = new q.b(gVar);
                            while (true) {
                                if (bVar.hasNext()) {
                                    p pVar = (p) ((WeakReference) bVar.next()).get();
                                    if (pVar != null && (context = ((c0) pVar).f1595p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                eVar = new j0.e(new j0.f(m.a(obj)));
                                if (eVar.f1891a.f1892a.isEmpty()) {
                                    String e4 = c0.c.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        m.b(systemService, g.l.a(e4));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            eVar = j0.e.f1890b;
                            if (eVar.f1891a.f1892a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                p.f1680k = true;
                break;
        }
    }
}
