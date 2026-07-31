package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f13608a;

    static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            try {
                if (f13608a == null) {
                    q qVar = new q(null);
                    qVar.a(com.google.android.play.integrity.internal.ag.a(context));
                    f13608a = qVar.b();
                }
                sVar = f13608a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
