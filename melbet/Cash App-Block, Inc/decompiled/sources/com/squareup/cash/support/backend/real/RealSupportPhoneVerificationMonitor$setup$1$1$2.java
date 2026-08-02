package com.squareup.cash.support.backend.real;

import com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealSupportPhoneVerificationMonitor$setup$1$1$2 implements Function2 {
    public static final RealSupportPhoneVerificationMonitor$setup$1$1$2 INSTANCE = new RealSupportPhoneVerificationMonitor$setup$1$1$2();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) obj;
        SupportPhoneConfirmation supportPhoneConfirmation2 = (SupportPhoneConfirmation) obj2;
        return Boolean.valueOf(Intrinsics.areEqual(supportPhoneConfirmation != null ? supportPhoneConfirmation.verification_id : null, supportPhoneConfirmation2 != null ? supportPhoneConfirmation2.verification_id : null));
    }
}
