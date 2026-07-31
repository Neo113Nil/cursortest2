package M5;

import H5.M;
import H5.N;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1631b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public M[] f1632a;

    public final void a(M m4) {
        m4.d((N) this);
        M[] mArr = this.f1632a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1631b;
        if (mArr == null) {
            mArr = new M[4];
            this.f1632a = mArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= mArr.length) {
            Object[] copyOf = Arrays.copyOf(mArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            mArr = (M[]) copyOf;
            this.f1632a = mArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        mArr[i7] = m4;
        m4.f1038g = i7;
        c(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(int i7) {
        Object[] objArr = this.f1632a;
        kotlin.jvm.internal.i.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1631b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                M m4 = objArr[i7];
                kotlin.jvm.internal.i.b(m4);
                Object obj = objArr[i8];
                kotlin.jvm.internal.i.b(obj);
                if (m4.compareTo(obj) < 0) {
                    d(i7, i8);
                    c(i8);
                }
            }
            while (true) {
                int i9 = i7 * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f1632a;
                kotlin.jvm.internal.i.b(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    kotlin.jvm.internal.i.b(comparable);
                    Object obj2 = objArr2[i10];
                    kotlin.jvm.internal.i.b(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i7];
                kotlin.jvm.internal.i.b(comparable2);
                Comparable comparable3 = objArr2[i11];
                kotlin.jvm.internal.i.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i7, i11);
                i7 = i11;
            }
        }
        M m7 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.i.b(m7);
        m7.d(null);
        m7.f1038g = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return m7;
    }

    public final void c(int i7) {
        while (i7 > 0) {
            M[] mArr = this.f1632a;
            kotlin.jvm.internal.i.b(mArr);
            int i8 = (i7 - 1) / 2;
            M m4 = mArr[i8];
            kotlin.jvm.internal.i.b(m4);
            M m7 = mArr[i7];
            kotlin.jvm.internal.i.b(m7);
            if (m4.compareTo(m7) <= 0) {
                return;
            }
            d(i7, i8);
            i7 = i8;
        }
    }

    public final void d(int i7, int i8) {
        M[] mArr = this.f1632a;
        kotlin.jvm.internal.i.b(mArr);
        M m4 = mArr[i8];
        kotlin.jvm.internal.i.b(m4);
        M m7 = mArr[i7];
        kotlin.jvm.internal.i.b(m7);
        mArr[i7] = m4;
        mArr[i8] = m7;
        m4.f1038g = i7;
        m7.f1038g = i8;
    }
}
