package E1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public static final f f667m = new f(new Object[0], 0);

    /* renamed from: i, reason: collision with root package name */
    public final transient Object[] f668i;

    /* renamed from: l, reason: collision with root package name */
    public final transient int f669l;

    public f(Object[] objArr, int i2) {
        this.f668i = objArr;
        this.f669l = i2;
    }

    @Override // E1.a
    public final Object[] a() {
        return this.f668i;
    }

    @Override // E1.a
    public final int b() {
        return 0;
    }

    @Override // E1.a
    public final int c() {
        return this.f669l;
    }

    @Override // E1.e, E1.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f668i;
        int i2 = this.f669l;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        d4.c.P(i2, this.f669l);
        Object obj = this.f668i[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f669l;
    }
}
