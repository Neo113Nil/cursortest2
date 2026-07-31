package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class ak implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ IOException f2846f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ek f2847g;

    ak(ek ekVar, IOException iOException) {
        this.f2847g = ekVar;
        this.f2846f = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk fkVar;
        fkVar = this.f2847g.f4628j;
        fkVar.g(this.f2846f);
    }
}
