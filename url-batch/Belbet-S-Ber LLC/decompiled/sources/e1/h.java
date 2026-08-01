package e1;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.a0;
import g.o;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f1374g;

    public /* synthetic */ h(Context context, int i) {
        this.f1373f = i;
        this.f1374g = context;
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
        j0.f fVar;
        Object obj;
        Context context;
        switch (this.f1373f) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.f1374g, 1));
                break;
            case 1:
                f.t(this.f1374g, new d(), f.f1364a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f1374g;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = o.h;
                            break;
                        } else {
                            q.g gVar = o.f1561l;
                            gVar.getClass();
                            q.b bVar = new q.b(gVar);
                            while (true) {
                                if (bVar.hasNext()) {
                                    o oVar = (o) ((WeakReference) bVar.next()).get();
                                    if (oVar != null && (context = ((a0) oVar).f1459p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new j0.f(new j0.g(g.l.a(obj)));
                                if (fVar.f2134a.f2135a.isEmpty()) {
                                    String f5 = c0.c.f(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, g.k.a(f5));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = j0.f.f2133b;
                            if (fVar.f2134a.f2135a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o.f1560k = true;
                break;
        }
    }
}
