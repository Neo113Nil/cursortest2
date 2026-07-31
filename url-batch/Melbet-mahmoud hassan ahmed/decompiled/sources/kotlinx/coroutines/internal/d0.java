package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.e0;
import m6.p0;

/* loaded from: classes.dex */
public class d0<T extends e0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a, reason: collision with root package name */
    private T[] f18329a;

    private final T[] f() {
        T[] tArr = this.f18329a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new e0[4];
            this.f18329a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        kotlin.jvm.internal.i.c(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((e0[]) copyOf);
        this.f18329a = tArr3;
        return tArr3;
    }

    private final void j(int i7) {
        this._size = i7;
    }

    private final void k(int i7) {
        while (true) {
            int i8 = (i7 * 2) + 1;
            if (i8 >= c()) {
                return;
            }
            T[] tArr = this.f18329a;
            kotlin.jvm.internal.i.b(tArr);
            int i9 = i8 + 1;
            if (i9 < c()) {
                T t6 = tArr[i9];
                kotlin.jvm.internal.i.b(t6);
                T t7 = tArr[i8];
                kotlin.jvm.internal.i.b(t7);
                if (((Comparable) t6).compareTo(t7) < 0) {
                    i8 = i9;
                }
            }
            T t8 = tArr[i7];
            kotlin.jvm.internal.i.b(t8);
            T t9 = tArr[i8];
            kotlin.jvm.internal.i.b(t9);
            if (((Comparable) t8).compareTo(t9) <= 0) {
                return;
            }
            m(i7, i8);
            i7 = i8;
        }
    }

    private final void l(int i7) {
        while (i7 > 0) {
            T[] tArr = this.f18329a;
            kotlin.jvm.internal.i.b(tArr);
            int i8 = (i7 - 1) / 2;
            T t6 = tArr[i8];
            kotlin.jvm.internal.i.b(t6);
            T t7 = tArr[i7];
            kotlin.jvm.internal.i.b(t7);
            if (((Comparable) t6).compareTo(t7) <= 0) {
                return;
            }
            m(i7, i8);
            i7 = i8;
        }
    }

    private final void m(int i7, int i8) {
        T[] tArr = this.f18329a;
        kotlin.jvm.internal.i.b(tArr);
        T t6 = tArr[i8];
        kotlin.jvm.internal.i.b(t6);
        T t7 = tArr[i7];
        kotlin.jvm.internal.i.b(t7);
        tArr[i7] = t6;
        tArr[i8] = t7;
        t6.b(i7);
        t7.b(i8);
    }

    public final void a(T t6) {
        if (p0.a()) {
            if (!(t6.h() == null)) {
                throw new AssertionError();
            }
        }
        t6.e(this);
        T[] f7 = f();
        int c7 = c();
        j(c7 + 1);
        f7[c7] = t6;
        t6.b(c7);
        l(c7);
    }

    public final T b() {
        T[] tArr = this.f18329a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b7;
        synchronized (this) {
            b7 = b();
        }
        return b7;
    }

    public final boolean g(T t6) {
        boolean z6;
        synchronized (this) {
            z6 = true;
            if (t6.h() == null) {
                z6 = false;
            } else {
                int f7 = t6.f();
                if (p0.a()) {
                    if (!(f7 >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(f7);
            }
        }
        return z6;
    }

    public final T h(int i7) {
        if (p0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f18329a;
        kotlin.jvm.internal.i.b(tArr);
        j(c() - 1);
        if (i7 < c()) {
            m(i7, c());
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                T t6 = tArr[i7];
                kotlin.jvm.internal.i.b(t6);
                T t7 = tArr[i8];
                kotlin.jvm.internal.i.b(t7);
                if (((Comparable) t6).compareTo(t7) < 0) {
                    m(i7, i8);
                    l(i8);
                }
            }
            k(i7);
        }
        T t8 = tArr[c()];
        kotlin.jvm.internal.i.b(t8);
        if (p0.a()) {
            if (!(t8.h() == this)) {
                throw new AssertionError();
            }
        }
        t8.e(null);
        t8.b(-1);
        tArr[c()] = null;
        return t8;
    }

    public final T i() {
        T h7;
        synchronized (this) {
            h7 = c() > 0 ? h(0) : null;
        }
        return h7;
    }
}
