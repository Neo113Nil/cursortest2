package com.onesignal.common.threading;

import Q7.g;
import Q7.i;
import Q7.j;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public class f {
    private final g channel = j.a(-1, null, 6);

    public final Object waitForWake(InterfaceC5133d interfaceC5133d) {
        return this.channel.c(interfaceC5133d);
    }

    public final void wake(Object obj) {
        Object e6 = this.channel.e(obj);
        if (e6 instanceof i) {
            throw new Exception("WaiterWithValue.wait failed", j.b(e6));
        }
    }
}
