package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends a implements i {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(Bundle bundle, r rVar) {
        Parcel a4 = a();
        c.c(a4, bundle);
        a4.writeStrongBinder(rVar);
        b(6, a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(Bundle bundle, k kVar) {
        Parcel a4 = a();
        c.c(a4, bundle);
        a4.writeStrongBinder(kVar);
        b(3, a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void e(Bundle bundle, k kVar) {
        Parcel a4 = a();
        c.c(a4, bundle);
        a4.writeStrongBinder(kVar);
        b(2, a4);
    }
}
