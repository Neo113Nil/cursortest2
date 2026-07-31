package kotlinx.coroutines.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f18314a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f18315b;

    /* renamed from: c, reason: collision with root package name */
    private int f18316c;

    private final void b() {
        Object[] objArr = this.f18314a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        w5.d.c(objArr, objArr2, 0, this.f18315b, 0, 10, null);
        Object[] objArr3 = this.f18314a;
        int length2 = objArr3.length;
        int i7 = this.f18315b;
        w5.d.c(objArr3, objArr2, length2 - i7, 0, i7, 4, null);
        this.f18314a = objArr2;
        this.f18315b = 0;
        this.f18316c = length;
    }

    public final void a(T t6) {
        Object[] objArr = this.f18314a;
        int i7 = this.f18316c;
        objArr[i7] = t6;
        int length = (objArr.length - 1) & (i7 + 1);
        this.f18316c = length;
        if (length == this.f18315b) {
            b();
        }
    }

    public final boolean c() {
        return this.f18315b == this.f18316c;
    }

    public final T d() {
        int i7 = this.f18315b;
        if (i7 == this.f18316c) {
            return null;
        }
        Object[] objArr = this.f18314a;
        T t6 = (T) objArr[i7];
        objArr[i7] = null;
        this.f18315b = (i7 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t6, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t6;
    }
}
