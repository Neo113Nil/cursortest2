package b3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: x, reason: collision with root package name */
    public static final f f5535x = new f(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f5536v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f5537w;

    public f(Object[] objArr, int i) {
        this.f5536v = objArr;
        this.f5537w = i;
    }

    @Override // b3.AbstractC0526a
    public final Object[] a() {
        return this.f5536v;
    }

    @Override // b3.AbstractC0526a
    public final int c() {
        return 0;
    }

    @Override // b3.AbstractC0526a
    public final int d() {
        return this.f5537w;
    }

    @Override // b3.e, b3.AbstractC0526a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f5536v;
        int i = this.f5537w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.bumptech.glide.g.V(i, this.f5537w);
        Object obj = this.f5536v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5537w;
    }
}
