package b8;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends g {

    /* renamed from: i, reason: collision with root package name */
    public final transient Object[] f1449i;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f1450r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f1451s;

    public w(Object[] objArr, int i3, int i10) {
        this.f1449i = objArr;
        this.f1450r = i3;
        this.f1451s = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        i7.a.v(i3, this.f1451s);
        Object obj = this.f1449i[(i3 * 2) + this.f1450r];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // b8.b
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1451s;
    }
}
