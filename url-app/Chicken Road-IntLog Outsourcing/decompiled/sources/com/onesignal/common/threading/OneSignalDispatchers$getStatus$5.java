package com.onesignal.common.threading;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$getStatus$5 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$getStatus$5 INSTANCE = new OneSignalDispatchers$getStatus$5();

    public OneSignalDispatchers$getStatus$5() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Boolean invoke() {
        InterfaceC0022w defaultScope;
        defaultScope = OneSignalDispatchers.INSTANCE.getDefaultScope();
        return Boolean.valueOf(AbstractC0024y.l(defaultScope));
    }
}
