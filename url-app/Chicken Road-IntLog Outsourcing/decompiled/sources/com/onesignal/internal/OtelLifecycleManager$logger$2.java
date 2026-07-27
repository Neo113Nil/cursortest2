package com.onesignal.internal;

import com.onesignal.otel.IOtelLogger;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OtelLifecycleManager$logger$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OtelLifecycleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelLifecycleManager$logger$2(OtelLifecycleManager otelLifecycleManager) {
        super(0);
        this.this$0 = otelLifecycleManager;
    }

    @Override // t4.InterfaceC1430a
    public final IOtelLogger invoke() {
        InterfaceC1430a interfaceC1430a;
        interfaceC1430a = this.this$0.loggerFactory;
        return (IOtelLogger) interfaceC1430a.invoke();
    }
}
