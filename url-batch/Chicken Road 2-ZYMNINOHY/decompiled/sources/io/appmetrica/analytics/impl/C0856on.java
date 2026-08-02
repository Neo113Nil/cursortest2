package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856on {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0908qn f12534a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0908qn f12535b;

    public C0856on(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f12534a = new L2(new C0828nl(context));
            this.f12535b = new L2(new Lc(context));
        } else {
            this.f12534a = new Y7();
            this.f12535b = new Y7();
        }
    }
}
