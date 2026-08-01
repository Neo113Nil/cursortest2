package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ z3(Context context, int i) {
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
        sr srVar;
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
                            srVar = f4.h;
                            break;
                        } else {
                            g7 g7Var = f4.l;
                            g7Var.getClass();
                            a7 a7Var = new a7(g7Var);
                            while (true) {
                                if (a7Var.hasNext()) {
                                    f4 f4Var = (f4) ((WeakReference) a7Var.next()).get();
                                    if (f4Var != null && (context = ((t4) f4Var).p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                srVar = new sr(new tr(b4.a(obj)));
                                if (srVar.a.a.isEmpty()) {
                                    String c0 = vw.c0(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        b4.b(systemService, a4.a(c0));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            srVar = sr.b;
                            if (srVar.a.a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                f4.k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new z3(context2, 2));
                break;
            default:
                j8.Y(context2, new vx(), j8.d, false);
                break;
        }
    }
}
