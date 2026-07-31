package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0387nl implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0412ol f1401a;

    public C0387nl(C0412ol c0412ol) {
        this.f1401a = c0412ol;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0412ol c0412ol = this.f1401a;
        if (c0412ol.b.hasPermission(c0412ol.f1420a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
