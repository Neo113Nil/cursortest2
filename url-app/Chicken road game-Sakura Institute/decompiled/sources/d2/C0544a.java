package d2;

import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544a implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f6065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6066e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0545b f6067i;

    public C0544a(C0545b c0545b, int i2, boolean z4) {
        this.f6067i = c0545b;
        this.f6066e = z4;
        this.f6065d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6066e) {
            if (this.f6065d < 0) {
                return false;
            }
        } else if (this.f6065d >= this.f6067i.f6068d.length) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0545b c0545b = this.f6067i;
        Object[] objArr = c0545b.f6068d;
        int i2 = this.f6065d;
        Object obj = objArr[i2];
        Object obj2 = c0545b.f6069e[i2];
        this.f6065d = this.f6066e ? i2 - 1 : i2 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
