package com.google.android.play.core.integrity;

import B.f;
import L1.j;
import N1.g;
import android.content.Context;

/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        f fVar;
        synchronized (j.class) {
            try {
                if (j.f1681a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    j.f1681a = new f(context, 8);
                }
                fVar = j.f1681a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (IntegrityManager) ((g) fVar.f152e).b();
    }
}
