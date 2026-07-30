package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.yr1;
import defpackage.zq1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        zq1 zq1Var;
        synchronized (yr1.class) {
            try {
                if (yr1.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    yr1.a = new zq1(context);
                }
                zq1Var = yr1.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (IntegrityManager) zq1Var.d.a();
    }
}
