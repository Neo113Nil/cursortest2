package com.onesignal.internal;

import com.onesignal.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public final e evaluate(d dVar, d dVar2) {
        i2.c cVar;
        i.e(dVar2, "new");
        boolean z5 = false;
        if (dVar != null && dVar.isEnabled()) {
            z5 = true;
        }
        boolean isEnabled = dVar2.isEnabled();
        if (!z5 && isEnabled) {
            i2.c logLevel = dVar2.getLogLevel();
            if (logLevel == null) {
                logLevel = i2.c.ERROR;
            }
            return new e.b(logLevel);
        }
        if (z5 && !isEnabled) {
            return e.a.INSTANCE;
        }
        if (z5 && isEnabled) {
            if ((dVar != null ? dVar.getLogLevel() : null) != dVar2.getLogLevel()) {
                if (dVar == null || (cVar = dVar.getLogLevel()) == null) {
                    cVar = i2.c.ERROR;
                }
                i2.c logLevel2 = dVar2.getLogLevel();
                if (logLevel2 == null) {
                    logLevel2 = i2.c.ERROR;
                }
                return new e.d(cVar, logLevel2);
            }
        }
        return e.c.INSTANCE;
    }
}
