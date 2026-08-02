package io.appmetrica.analytics.impl;

import android.app.Application;

/* loaded from: classes.dex */
public final class Ef implements Cf {
    @Override // io.appmetrica.analytics.impl.Cf
    public String a() {
        String processName;
        processName = Application.getProcessName();
        return processName;
    }
}
