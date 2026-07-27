package com.onesignal.core.internal.config;

import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class ConfigModel$remoteLoggingParams$1 extends j implements InterfaceC1430a {
    final /* synthetic */ ConfigModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigModel$remoteLoggingParams$1(ConfigModel configModel) {
        super(0);
        this.this$0 = configModel;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return new RemoteLoggingConfigModel(this.this$0, "remoteLoggingParams");
    }
}
