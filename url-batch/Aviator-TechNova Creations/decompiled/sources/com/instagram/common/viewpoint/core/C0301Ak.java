package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.facebook.ads.redexgen.X.Ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0301Ak<T> extends AbstractC1870pg<T> {
    public final /* synthetic */ Iterator A00;

    public C0301Ak(final Iterator val$iterator) {
        this.A00 = val$iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        return (T) this.A00.next();
    }
}
