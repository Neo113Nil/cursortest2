package com.onesignal.internal;

import com.onesignal.internal.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public final e evaluate(d dVar, d dVar2) {
        K2.c cVar;
        Intrinsics.checkNotNullParameter(dVar2, "new");
        boolean z7 = false;
        if (dVar != null && dVar.isEnabled()) {
            z7 = true;
        }
        boolean isEnabled = dVar2.isEnabled();
        if (!z7 && isEnabled) {
            K2.c logLevel = dVar2.getLogLevel();
            if (logLevel == null) {
                logLevel = K2.c.ERROR;
            }
            return new e.b(logLevel);
        }
        if (z7 && !isEnabled) {
            return e.a.INSTANCE;
        }
        if (z7 && isEnabled) {
            if ((dVar != null ? dVar.getLogLevel() : null) != dVar2.getLogLevel()) {
                if (dVar == null || (cVar = dVar.getLogLevel()) == null) {
                    cVar = K2.c.ERROR;
                }
                K2.c logLevel2 = dVar2.getLogLevel();
                if (logLevel2 == null) {
                    logLevel2 = K2.c.ERROR;
                }
                return new e.d(cVar, logLevel2);
            }
        }
        return e.c.INSTANCE;
    }
}
