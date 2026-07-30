package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f61a;

    static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            if (f61a == null) {
                q qVar = new q(null);
                qVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f61a = qVar.b();
            }
            sVar = f61a;
        }
        return sVar;
    }
}
