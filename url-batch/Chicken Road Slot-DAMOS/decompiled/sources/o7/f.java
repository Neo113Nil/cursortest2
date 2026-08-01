package o7;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: s, reason: collision with root package name */
    public static final f f7547s = new f(0, new Object[0]);

    /* renamed from: i, reason: collision with root package name */
    public final transient Object[] f7548i;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f7549r;

    public f(int i3, Object[] objArr) {
        this.f7548i = objArr;
        this.f7549r = i3;
    }

    @Override // o7.a
    public final Object[] b() {
        return this.f7548i;
    }

    @Override // o7.a
    public final int c() {
        return 0;
    }

    @Override // o7.a
    public final int e() {
        return this.f7549r;
    }

    @Override // o7.e, o7.a
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f7548i;
        int i3 = this.f7549r;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a.a.f0(i3, this.f7549r);
        Object obj = this.f7548i[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7549r;
    }
}
