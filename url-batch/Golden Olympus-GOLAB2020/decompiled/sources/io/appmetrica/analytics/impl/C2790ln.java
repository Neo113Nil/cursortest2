package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2790ln {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2842nn f39411a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2842nn f39412b;

    public C2790ln(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f39411a = new Y2(new C2840nl(context));
            this.f39412b = new Y2(new C2651gd(context));
        } else {
            this.f39411a = new C2956s8();
            this.f39412b = new C2956s8();
        }
    }
}
