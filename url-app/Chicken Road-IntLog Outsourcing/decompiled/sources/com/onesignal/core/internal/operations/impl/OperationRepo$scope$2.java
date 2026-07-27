package com.onesignal.core.internal.operations.impl;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import D4.Q;
import D4.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OperationRepo$scope$2 extends j implements InterfaceC1430a {
    public static final OperationRepo$scope$2 INSTANCE = new OperationRepo$scope$2();

    public OperationRepo$scope$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final InterfaceC0022w invoke() {
        new AtomicInteger();
        return AbstractC0024y.b(new Q(Executors.newScheduledThreadPool(1, new q0())));
    }
}
