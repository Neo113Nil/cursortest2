package b8;

import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1433e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1434i;

    public l(Object obj) {
        super(0);
        this.f1434i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f1433e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1433e) {
            i0.c();
            return null;
        }
        this.f1433e = true;
        return this.f1434i;
    }
}
