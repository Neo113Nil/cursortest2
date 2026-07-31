package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class oq extends zd {
    oq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long C3(mq mqVar) {
        Parcel E = E();
        be.d(E, mqVar);
        Parcel q02 = q0(3, E);
        long readLong = q02.readLong();
        q02.recycle();
        return readLong;
    }

    public final jq C5(mq mqVar) {
        Parcel E = E();
        be.d(E, mqVar);
        Parcel q02 = q0(2, E);
        jq jqVar = (jq) be.a(q02, jq.CREATOR);
        q02.recycle();
        return jqVar;
    }

    public final jq o4(mq mqVar) {
        Parcel E = E();
        be.d(E, mqVar);
        Parcel q02 = q0(1, E);
        jq jqVar = (jq) be.a(q02, jq.CREATOR);
        q02.recycle();
        return jqVar;
    }
}
