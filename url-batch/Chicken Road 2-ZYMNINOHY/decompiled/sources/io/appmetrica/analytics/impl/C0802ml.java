package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802ml implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0828nl f12377a;

    public C0802ml(C0828nl c0828nl) {
        this.f12377a = c0828nl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0828nl c0828nl = this.f12377a;
        if (c0828nl.f12473b.hasPermission(c0828nl.f12472a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
