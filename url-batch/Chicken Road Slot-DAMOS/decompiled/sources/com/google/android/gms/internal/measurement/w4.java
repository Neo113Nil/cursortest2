package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w4 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f2928d;

    public w4(Iterator it) {
        this.f2928d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2928d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new i5((String) this.f2928d.next());
    }
}
