package com.onesignal.internal;

import com.onesignal.core.internal.config.ConfigModel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$consentGiven$1 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$consentGiven$1(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final Boolean invoke() {
        ConfigModel configModel;
        Boolean bool;
        boolean a6;
        configModel = this.this$0.getConfigModel();
        Boolean consentGiven = configModel.getConsentGiven();
        if (consentGiven != null) {
            a6 = consentGiven.booleanValue();
        } else {
            bool = this.this$0._consentGiven;
            a6 = i.a(bool, Boolean.TRUE);
        }
        return Boolean.valueOf(a6);
    }
}
