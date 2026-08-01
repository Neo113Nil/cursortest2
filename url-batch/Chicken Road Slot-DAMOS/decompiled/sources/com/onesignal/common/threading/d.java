package com.onesignal.common.threading;

import ie.g;
import ie.h;
import ie.i;
import ie.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d {
    private final g channel = j.a(-1, 6, null);

    public final Object waitForWake(ld.a aVar) {
        return this.channel.c(aVar);
    }

    public final void wake(Object obj) {
        Object b10 = this.channel.b(obj);
        if (b10 instanceof i) {
            h hVar = b10 instanceof h ? (h) b10 : null;
            throw new Exception("WaiterWithValue.wait failed", hVar != null ? hVar.f4750a : null);
        }
    }
}
