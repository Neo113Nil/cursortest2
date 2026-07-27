package com.onesignal.common.threading;

import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$getStatus$1 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$getStatus$1 INSTANCE = new OneSignalDispatchers$getStatus$1();

    public OneSignalDispatchers$getStatus$1() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Boolean invoke() {
        ThreadPoolExecutor ioExecutor;
        ioExecutor = OneSignalDispatchers.INSTANCE.getIoExecutor();
        return Boolean.valueOf(ioExecutor.isShutdown());
    }
}
