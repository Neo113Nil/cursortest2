package d0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import g.AbstractC0133k;
import g.LayoutInflaterFactory2C0115A;
import g.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1971b;

    public /* synthetic */ g(Context context, int i) {
        this.f1970a = i;
        this.f1971b = context;
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
        switch (this.f1970a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f1971b, 1));
                break;
            case 1:
                f.s(this.f1971b, new d(), f.f1963a, false);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f1971b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            fVar = o.f2403c;
                            break;
                        } else {
                            Iterator it = o.f2406g.iterator();
                            while (true) {
                                o.g gVar = (o.g) it;
                                if (gVar.hasNext()) {
                                    o oVar = (o) ((WeakReference) gVar.next()).get();
                                    if (oVar != null && (context = ((LayoutInflaterFactory2C0115A) oVar).f2296k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                fVar = new G.f(new G.g(g.l.a(obj)));
                                if (fVar.f185a.f186a.isEmpty()) {
                                    String e2 = z.c.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        g.l.b(systemService, AbstractC0133k.a(e2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            fVar = G.f.f184b;
                            if (fVar.f185a.f186a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o.f2405f = true;
                break;
        }
    }
}
