package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ j3(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        er erVar;
        Object obj;
        Context context;
        int i = this.f;
        Context context2 = this.g;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 < 33) {
                            erVar = p3.h;
                            break;
                        } else {
                            p6 p6Var = p3.l;
                            p6Var.getClass();
                            j6 j6Var = new j6(p6Var);
                            while (true) {
                                if (j6Var.hasNext()) {
                                    p3 p3Var = (p3) ((WeakReference) j6Var.next()).get();
                                    if (p3Var != null && (context = ((d4) p3Var).p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                erVar = new er(new fr(l3.a(obj)));
                                if (erVar.a.a.isEmpty()) {
                                    String V = jw.V(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        l3.b(systemService, k3.a(V));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            erVar = er.b;
                            if (erVar.a.a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                p3.k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j3(context2, 2));
                break;
            default:
                jw.g0(context2, new hx(), jw.j, false);
                break;
        }
    }
}
