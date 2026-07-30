package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Context n;

    public /* synthetic */ ze(Context context, int i) {
        this.m = i;
        this.n = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        tf1 tf1Var;
        int i = this.m;
        Context context = this.n;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 < 33) {
                            tf1Var = df.o;
                            break;
                        } else {
                            Object b = df.b();
                            if (b != null) {
                                tf1Var = new tf1(new vf1(bf.a(b)));
                                if (tf1Var.a.a.isEmpty()) {
                                    String R = iv1.R(context);
                                    Object systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        bf.b(systemService, af.a(R));
                                    }
                                }
                                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            tf1Var = tf1.b;
                            if (tf1Var.a.a.isEmpty()) {
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                df.r = true;
                break;
            case 1:
                df.p(context);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ze(context, 3));
                break;
            default:
                ll3.c0(context, new th(1), ll3.f, false);
                break;
        }
    }
}
