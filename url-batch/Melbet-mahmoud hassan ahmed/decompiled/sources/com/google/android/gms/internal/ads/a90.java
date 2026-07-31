package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class a90 implements xa3<y80, ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s80 f2683a;

    a90(e90 e90Var, s80 s80Var) {
        this.f2683a = s80Var;
    }

    @Override // com.google.android.gms.internal.ads.xa3
    public final /* bridge */ /* synthetic */ cc3<ParcelFileDescriptor> c(y80 y80Var) {
        bp0 bp0Var = new bp0();
        y80Var.C3(this.f2683a, new z80(this, bp0Var));
        return bp0Var;
    }
}
