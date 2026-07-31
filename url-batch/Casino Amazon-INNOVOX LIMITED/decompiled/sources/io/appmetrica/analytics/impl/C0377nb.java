package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0377nb implements InterfaceC0079bl {
    @Override // io.appmetrica.analytics.impl.InterfaceC0079bl
    public final boolean a(C0301kb c0301kb) {
        Integer num = c0301kb.f;
        return num == null || num.intValue() != Process.myPid();
    }
}
