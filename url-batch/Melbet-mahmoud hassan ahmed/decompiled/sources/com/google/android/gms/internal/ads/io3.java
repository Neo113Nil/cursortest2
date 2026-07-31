package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class io3 extends lo3 {

    /* renamed from: f, reason: collision with root package name */
    private int f6728f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final int f6729g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ uo3 f6730h;

    io3(uo3 uo3Var) {
        this.f6730h = uo3Var;
        this.f6729g = uo3Var.q();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6728f < this.f6729g;
    }

    @Override // com.google.android.gms.internal.ads.no3
    public final byte zza() {
        int i7 = this.f6728f;
        if (i7 >= this.f6729g) {
            throw new NoSuchElementException();
        }
        this.f6728f = i7 + 1;
        return this.f6730h.o(i7);
    }
}
