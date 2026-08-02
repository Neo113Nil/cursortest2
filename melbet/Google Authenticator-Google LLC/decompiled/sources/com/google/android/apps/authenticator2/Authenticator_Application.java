package com.google.android.apps.authenticator2;

import defpackage.bog;
import defpackage.glm;
import defpackage.gta;
import defpackage.gtt;
import defpackage.gty;
import defpackage.gut;
import defpackage.gvz;
import defpackage.hnu;
import defpackage.hoq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Authenticator_Application extends bog {
    @Override // defpackage.bog, defpackage.gll, android.app.Application
    public final void onCreate() {
        gty aC;
        if (!d()) {
            super.onCreate();
            return;
        }
        gvz c = gvz.c();
        if (c.e()) {
            long bl = hnu.bl();
            gtt b = ((glm) hnu.bp(this, glm.class)).e().b(193, hnu.bk(bl), 1000000 * bl);
            try {
                gta.p();
                aC = hoq.aC(3, "Application.onCreate");
                try {
                    super.onCreate();
                    aC.close();
                    b.close();
                } finally {
                }
            } finally {
            }
        } else {
            gut a = c.a();
            try {
                aC = hoq.aC(1, "Application creation");
                try {
                    gty aC2 = hoq.aC(2, "Application.onCreate");
                    try {
                        super.onCreate();
                        aC2.close();
                        aC.close();
                        a.close();
                    } finally {
                    }
                } finally {
                    try {
                        aC.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        }
    }
}
