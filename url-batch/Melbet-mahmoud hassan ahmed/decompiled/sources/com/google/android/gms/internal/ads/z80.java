package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class z80 extends w80 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bp0 f15021f;

    z80(a90 a90Var, bp0 bp0Var) {
        this.f15021f = bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void g1(ParcelFileDescriptor parcelFileDescriptor) {
        this.f15021f.e(parcelFileDescriptor);
    }
}
