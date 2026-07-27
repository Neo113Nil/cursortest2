package com.onesignal.common.threading;

import F4.f;
import F4.h;
import F4.i;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public class WaiterWithValue<TType> {
    private final f channel = i.a(-1, 0, 6);

    public final Object waitForWake(InterfaceC1218d interfaceC1218d) {
        return this.channel.e(interfaceC1218d);
    }

    public final void wake(TType ttype) {
        Object h3 = this.channel.h(ttype);
        if (h3 instanceof h) {
            throw new Exception("WaiterWithValue.wait failed", i.c(h3));
        }
    }
}
