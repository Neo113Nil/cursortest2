package io.appmetrica.analytics.impl;

import android.app.Application;

/* loaded from: classes.dex */
public final class Jf implements Hf {
    @Override // io.appmetrica.analytics.impl.Hf
    public String a() {
        String processName;
        processName = Application.getProcessName();
        return processName;
    }
}
