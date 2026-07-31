package com.ironsource;

import java.util.Date;

/* loaded from: classes2.dex */
public class ib {

    /* renamed from: a, reason: collision with root package name */
    private long f16706a = new Date().getTime();

    public static long a(ib ibVar) {
        if (ibVar == null) {
            return 0L;
        }
        return new Date().getTime() - ibVar.f16706a;
    }
}
