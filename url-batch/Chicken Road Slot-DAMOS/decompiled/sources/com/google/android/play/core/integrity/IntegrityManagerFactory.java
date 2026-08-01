package com.google.android.play.core.integrity;

import android.content.Context;
import x7.c;
import x7.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        c cVar;
        synchronized (k.class) {
            try {
                if (k.f10539a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    k.f10539a = new c(context);
                }
                cVar = k.f10539a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (IntegrityManager) cVar.f10521d.a();
    }
}
