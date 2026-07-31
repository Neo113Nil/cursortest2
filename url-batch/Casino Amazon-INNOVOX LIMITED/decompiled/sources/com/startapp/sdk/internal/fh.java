package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class fh extends y2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd f239a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hh c;

    public fh(hh hhVar, pd pdVar, long j) {
        this.c = hhVar;
        this.f239a = pdVar;
        this.b = j;
    }

    @Override // com.startapp.sdk.internal.y2
    public final void a(ga gaVar) {
        hh hhVar = this.c;
        int abs = Math.abs(Arrays.hashCode(this.f239a.f380a));
        long j = this.b;
        synchronized (hhVar) {
            hhVar.b.put(Integer.valueOf(abs), hhVar.c.scheduleAtFixedRate(gaVar, j, j, TimeUnit.MILLISECONDS));
        }
    }
}
