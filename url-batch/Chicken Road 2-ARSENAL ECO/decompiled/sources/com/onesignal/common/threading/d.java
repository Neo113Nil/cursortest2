package com.onesignal.common.threading;

import J5.f;
import J5.g;
import J5.h;
import J5.i;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public class d {
    private final f channel = i.a(-1, 0, 6);

    public final Object waitForWake(InterfaceC0564d interfaceC0564d) {
        return this.channel.c(interfaceC0564d);
    }

    public final void wake(Object obj) {
        Object g7 = this.channel.g(obj);
        if (g7 instanceof h) {
            g gVar = g7 instanceof g ? (g) g7 : null;
            throw new Exception("WaiterWithValue.wait failed", gVar != null ? gVar.f1327a : null);
        }
    }
}
