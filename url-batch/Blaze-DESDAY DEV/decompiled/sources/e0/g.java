package e0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.AbstractC0110k;
import g.LayoutInflaterFactory2C0092A;
import g.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z.AbstractC0323c;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2087b;

    public /* synthetic */ g(Context context, int i) {
        this.f2086a = i;
        this.f2087b = context;
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
        switch (this.f2086a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f2087b, 1));
                break;
            case 1:
                f.s(this.f2087b, new d(), f.f2079a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f2087b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = o.f2266c;
                            break;
                        } else {
                            Iterator it = o.f2269g.iterator();
                            while (true) {
                                o.g gVar = (o.g) it;
                                if (gVar.hasNext()) {
                                    o oVar = (o) ((WeakReference) gVar.next()).get();
                                    if (oVar != null && (context = ((LayoutInflaterFactory2C0092A) oVar).f2159k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new G.f(new G.g(g.l.a(obj)));
                                if (fVar.f249a.f250a.isEmpty()) {
                                    String e2 = AbstractC0323c.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, AbstractC0110k.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = G.f.f248b;
                            if (fVar.f249a.f250a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o.f2268f = true;
                break;
        }
    }
}
