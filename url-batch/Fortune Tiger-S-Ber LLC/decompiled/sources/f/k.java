package f;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1612f;
    public final /* synthetic */ Context g;

    public /* synthetic */ k(Context context, int i4) {
        this.f1612f = i4;
        this.g = context;
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
        g0.d dVar;
        Object obj;
        Context context;
        switch (this.f1612f) {
            case 0:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    Context context2 = this.g;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i4 < 33) {
                            dVar = p.h;
                            break;
                        } else {
                            n.g gVar = p.f1642l;
                            gVar.getClass();
                            n.b bVar = new n.b(gVar);
                            while (true) {
                                if (bVar.hasNext()) {
                                    p pVar = (p) ((WeakReference) bVar.next()).get();
                                    if (pVar != null && (context = ((b0) pVar).f1556p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                dVar = new g0.d(new g0.e(m.a(obj)));
                                if (dVar.f1757a.f1758a.isEmpty()) {
                                    String e4 = z.c.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        m.b(systemService, l.a(e4));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            dVar = g0.d.f1756b;
                            if (dVar.f1757a.f1758a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                p.f1641k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new k(this.g, 2));
                break;
            default:
                z0.f.t(this.g, new z0.d(), z0.f.f3646a, false);
                break;
        }
    }
}
