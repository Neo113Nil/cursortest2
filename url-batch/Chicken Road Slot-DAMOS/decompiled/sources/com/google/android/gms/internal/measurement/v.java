package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final int f2858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f2859e;

    public v(w wVar, int i3) {
        this.f2859e = wVar;
        this.f2858d = i3;
    }

    public final int b() {
        int i3 = this.f2858d;
        if (i3 == -1) {
            return 0;
        }
        return this.f2859e.f2905e[i3];
    }

    public final int c() {
        return this.f2859e.f2905e[this.f2858d + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f2859e.f2904d, b(), c(), obj, this.f2858d == -1 ? w.f2903t : x.f2958b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c() - b();
    }
}
