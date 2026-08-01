package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ t3(Context context, int i) {
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
        wt wtVar;
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
                            wtVar = z3.h;
                            break;
                        } else {
                            z6 z6Var = z3.l;
                            z6Var.getClass();
                            t6 t6Var = new t6(z6Var);
                            while (true) {
                                if (t6Var.hasNext()) {
                                    z3 z3Var = (z3) ((WeakReference) t6Var.next()).get();
                                    if (z3Var != null && (context = ((n4) z3Var).p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                wtVar = new wt(new xt(v3.a(obj)));
                                if (wtVar.a.a.isEmpty()) {
                                    String U = kr.U(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        v3.b(systemService, u3.a(U));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            wtVar = wt.b;
                            if (wtVar.a.a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                z3.k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new t3(context2, 2));
                break;
            default:
                mz.S(context2, new k00(), mz.e, false);
                break;
        }
    }
}
