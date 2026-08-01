package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2833d;

    /* renamed from: e, reason: collision with root package name */
    public int f2834e = 0;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractSet f2835i;

    public /* synthetic */ u(AbstractSet abstractSet, int i3) {
        this.f2833d = i3;
        this.f2835i = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2833d) {
            case 0:
                int i3 = this.f2834e;
                v vVar = (v) this.f2835i;
                if (i3 < vVar.c() - vVar.b()) {
                }
                break;
            default:
                if (this.f2834e < ((ph) ((androidx.datastore.preferences.protobuf.b1) this.f2835i).f516e).f2683e) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2833d) {
            case 0:
                int i3 = this.f2834e;
                v vVar = (v) this.f2835i;
                if (i3 >= vVar.c() - vVar.b()) {
                    kotlin.collections.i0.c();
                    return null;
                }
                w wVar = vVar.f2859e;
                Object obj = wVar.f2904d[vVar.b() + i3];
                this.f2834e = i3 + 1;
                return obj;
            default:
                int i10 = this.f2834e;
                this.f2834e = i10 + 1;
                ph phVar = (ph) ((androidx.datastore.preferences.protobuf.b1) this.f2835i).f516e;
                return phVar.d(phVar.f2682d[i10] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2833d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
