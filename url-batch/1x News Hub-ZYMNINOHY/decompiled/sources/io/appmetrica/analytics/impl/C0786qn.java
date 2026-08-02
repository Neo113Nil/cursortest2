package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786qn {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0837sn f8185a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0837sn f8186b;

    public C0786qn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f8185a = new T2(new C0809rl(context));
            this.f8186b = new T2(new Sc(context));
        } else {
            this.f8185a = new C0460e8();
            this.f8186b = new C0460e8();
        }
    }
}
