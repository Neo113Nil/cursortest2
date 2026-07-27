package com.onesignal.internal;

import android.content.Context;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProvider;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class OtelLifecycleManager$platformProvider$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OtelLifecycleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelLifecycleManager$platformProvider$2(OtelLifecycleManager otelLifecycleManager) {
        super(0);
        this.this$0 = otelLifecycleManager;
    }

    @Override // t4.InterfaceC1430a
    public final OtelPlatformProvider invoke() {
        InterfaceC1445p interfaceC1445p;
        Context context;
        InterfaceC1430a interfaceC1430a;
        interfaceC1445p = this.this$0.platformProviderFactory;
        context = this.this$0.context;
        interfaceC1430a = this.this$0.featureManagerProvider;
        return (OtelPlatformProvider) interfaceC1445p.invoke(context, interfaceC1430a);
    }
}
