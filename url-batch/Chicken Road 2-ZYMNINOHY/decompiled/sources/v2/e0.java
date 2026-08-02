package v2;

import a.AbstractC0124a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e0 extends I {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f15625c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15626d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f15627e;

    public e0(Object[] objArr, int i4, int i5) {
        this.f15625c = objArr;
        this.f15626d = i4;
        this.f15627e = i5;
    }

    @Override // v2.D
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC0124a.m(i4, this.f15627e);
        Object obj = this.f15625c[(i4 * 2) + this.f15626d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15627e;
    }
}
