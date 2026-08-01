package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f517d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f518e = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f519i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f520r;

    public c(com.google.android.gms.internal.measurement.v0 v0Var) {
        this.f520r = v0Var;
        this.f519i = v0Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f517d) {
            case 0:
                if (this.f518e < this.f519i) {
                }
                break;
            default:
                if (this.f518e < this.f519i) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f517d) {
            case 0:
                int i3 = this.f518e;
                if (i3 >= this.f519i) {
                    kotlin.collections.i0.c();
                    break;
                } else {
                    this.f518e = i3 + 1;
                    break;
                }
            default:
                int i10 = this.f518e;
                if (i10 >= this.f519i) {
                    kotlin.collections.i0.c();
                    break;
                } else {
                    this.f518e = i10 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f517d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c(f fVar) {
        this.f520r = fVar;
        this.f519i = fVar.size();
    }
}
