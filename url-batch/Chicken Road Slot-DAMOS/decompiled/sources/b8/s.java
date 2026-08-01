package b8;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends g {

    /* renamed from: s, reason: collision with root package name */
    public static final s f1440s = new s(0, new Object[0]);

    /* renamed from: i, reason: collision with root package name */
    public final transient Object[] f1441i;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f1442r;

    public s(int i3, Object[] objArr) {
        this.f1441i = objArr;
        this.f1442r = i3;
    }

    @Override // b8.g, b8.b
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f1441i;
        int i3 = this.f1442r;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // b8.b
    public final Object[] e() {
        return this.f1441i;
    }

    @Override // b8.b
    public final int f() {
        return this.f1442r;
    }

    @Override // b8.b
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        i7.a.v(i3, this.f1442r);
        Object obj = this.f1441i[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // b8.b
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1442r;
    }
}
