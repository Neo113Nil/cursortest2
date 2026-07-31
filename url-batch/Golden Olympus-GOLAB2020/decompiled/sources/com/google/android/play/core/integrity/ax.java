package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f13524a;

    static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (f13524a == null) {
                    u uVar = new u(null);
                    uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                    f13524a = uVar.b();
                }
                awVar = f13524a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return awVar;
    }
}
