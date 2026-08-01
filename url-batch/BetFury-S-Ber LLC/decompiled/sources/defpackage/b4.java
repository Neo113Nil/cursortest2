package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ b4(Context context, int i) {
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
        vy vyVar;
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
                            vyVar = h4.h;
                            break;
                        } else {
                            i7 i7Var = h4.l;
                            i7Var.getClass();
                            c7 c7Var = new c7(i7Var);
                            while (true) {
                                if (c7Var.hasNext()) {
                                    h4 h4Var = (h4) ((WeakReference) c7Var.next()).get();
                                    if (h4Var != null && (context = ((v4) h4Var).p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                vyVar = new vy(new wy(d4.a(obj)));
                                if (vyVar.a.a.isEmpty()) {
                                    String J = d50.J(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        d4.b(systemService, c4.a(J));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            vyVar = vy.b;
                            if (vyVar.a.a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                h4.k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b4(context2, 2));
                break;
            default:
                mv.W(context2, new w6(1), mv.l, false);
                break;
        }
    }
}
