package com.derinko.gbini.n1casino;

import android.app.Application;
import defpackage.d4;
import defpackage.j6;
import defpackage.p3;
import defpackage.p6;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class WinApp extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        if (p3.g != 2) {
            p3.g = 2;
            synchronized (p3.m) {
                try {
                    p6 p6Var = p3.l;
                    p6Var.getClass();
                    j6 j6Var = new j6(p6Var);
                    while (j6Var.hasNext()) {
                        p3 p3Var = (p3) ((WeakReference) j6Var.next()).get();
                        if (p3Var != null) {
                            ((d4) p3Var).m(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
