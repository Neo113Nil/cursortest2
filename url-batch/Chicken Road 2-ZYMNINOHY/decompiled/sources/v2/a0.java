package v2;

import a.AbstractC0124a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a0 extends I {

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f15605e = new a0(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f15606c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15607d;

    public a0(int i4, Object[] objArr) {
        this.f15606c = objArr;
        this.f15607d = i4;
    }

    @Override // v2.I, v2.D
    public final int c(int i4, Object[] objArr) {
        Object[] objArr2 = this.f15606c;
        int i5 = this.f15607d;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // v2.D
    public final Object[] d() {
        return this.f15606c;
    }

    @Override // v2.D
    public final int e() {
        return this.f15607d;
    }

    @Override // v2.D
    public final int f() {
        return 0;
    }

    @Override // v2.D
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0124a.m(i4, this.f15607d);
        Object obj = this.f15606c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15607d;
    }
}
