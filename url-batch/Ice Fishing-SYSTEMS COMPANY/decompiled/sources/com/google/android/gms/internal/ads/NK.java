package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class NK extends CC {

    /* renamed from: u, reason: collision with root package name */
    public int f26518u;

    /* renamed from: v, reason: collision with root package name */
    public final int f26519v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SK f26520w;

    public NK(SK sk) {
        super(1);
        Objects.requireNonNull(sk);
        this.f26520w = sk;
        this.f26518u = 0;
        this.f26519v = sk.f();
    }

    @Override // com.google.android.gms.internal.ads.CC
    public final byte a() {
        int i = this.f26518u;
        if (i >= this.f26519v) {
            throw new NoSuchElementException();
        }
        this.f26518u = i + 1;
        return this.f26520w.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26518u < this.f26519v;
    }
}
