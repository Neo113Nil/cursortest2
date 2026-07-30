package s6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import n6.M;
import n6.N;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7861b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public M[] f7862a;

    public final void a(M m2) {
        m2.c((N) this);
        M[] mArr = this.f7862a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7861b;
        if (mArr == null) {
            mArr = new M[4];
            this.f7862a = mArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= mArr.length) {
            Object[] copyOf = Arrays.copyOf(mArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            mArr = (M[]) copyOf;
            this.f7862a = mArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        mArr[i2] = m2;
        m2.f7021e = i2;
        c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(int i2) {
        Object[] objArr = this.f7862a;
        Intrinsics.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7861b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i2 < atomicIntegerFieldUpdater.get(this)) {
            d(i2, atomicIntegerFieldUpdater.get(this));
            int i5 = (i2 - 1) / 2;
            if (i2 > 0) {
                M m2 = objArr[i2];
                Intrinsics.b(m2);
                Object obj = objArr[i5];
                Intrinsics.b(obj);
                if (m2.compareTo(obj) < 0) {
                    d(i2, i5);
                    c(i5);
                }
            }
            while (true) {
                int i7 = i2 * 2;
                int i8 = i7 + 1;
                if (i8 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f7862a;
                Intrinsics.b(objArr2);
                int i9 = i7 + 2;
                if (i9 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i9];
                    Intrinsics.b(comparable);
                    Object obj2 = objArr2[i8];
                    Intrinsics.b(obj2);
                }
                i9 = i8;
                Comparable comparable2 = objArr2[i2];
                Intrinsics.b(comparable2);
                Comparable comparable3 = objArr2[i9];
                Intrinsics.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i2, i9);
                i2 = i9;
            }
        }
        M m7 = objArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.b(m7);
        m7.c(null);
        m7.f7021e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return m7;
    }

    public final void c(int i2) {
        while (i2 > 0) {
            M[] mArr = this.f7862a;
            Intrinsics.b(mArr);
            int i5 = (i2 - 1) / 2;
            M m2 = mArr[i5];
            Intrinsics.b(m2);
            M m7 = mArr[i2];
            Intrinsics.b(m7);
            if (m2.compareTo(m7) <= 0) {
                return;
            }
            d(i2, i5);
            i2 = i5;
        }
    }

    public final void d(int i2, int i5) {
        M[] mArr = this.f7862a;
        Intrinsics.b(mArr);
        M m2 = mArr[i5];
        Intrinsics.b(m2);
        M m7 = mArr[i2];
        Intrinsics.b(m7);
        mArr[i2] = m2;
        mArr[i5] = m7;
        m2.f7021e = i2;
        m7.f7021e = i5;
    }
}
