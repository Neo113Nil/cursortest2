package com.onesignal.common.threading;

import p6.g;
import p6.h;
import p6.i;
import p6.j;

/* loaded from: classes.dex */
public class e {
    private final g channel = j.a(-1, null, 6);

    public final Object waitForWake(V5.b bVar) {
        return this.channel.b(bVar);
    }

    public final void wake(Object obj) {
        Object i2 = this.channel.i(obj);
        if (i2 instanceof i) {
            h hVar = i2 instanceof h ? (h) i2 : null;
            throw new Exception("WaiterWithValue.wait failed", hVar != null ? hVar.f7254a : null);
        }
    }
}
