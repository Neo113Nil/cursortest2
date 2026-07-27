package I4;

import D4.L;
import D4.M;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1330b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public L[] f1331a;

    public final void a(L l2) {
        l2.d((M) this);
        L[] lArr = this.f1331a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1330b;
        if (lArr == null) {
            lArr = new L[4];
            this.f1331a = lArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= lArr.length) {
            Object[] copyOf = Arrays.copyOf(lArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            lArr = (L[]) copyOf;
            this.f1331a = lArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        lArr[i2] = l2;
        l2.f470b = i2;
        c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L b(int i2) {
        Object[] objArr = this.f1331a;
        kotlin.jvm.internal.i.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1330b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i2 < atomicIntegerFieldUpdater.get(this)) {
            d(i2, atomicIntegerFieldUpdater.get(this));
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                L l2 = objArr[i2];
                kotlin.jvm.internal.i.b(l2);
                Object obj = objArr[i3];
                kotlin.jvm.internal.i.b(obj);
                if (l2.compareTo(obj) < 0) {
                    d(i2, i3);
                    c(i3);
                }
            }
            while (true) {
                int i6 = i2 * 2;
                int i7 = i6 + 1;
                if (i7 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f1331a;
                kotlin.jvm.internal.i.b(objArr2);
                int i8 = i6 + 2;
                if (i8 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i8];
                    kotlin.jvm.internal.i.b(comparable);
                    Object obj2 = objArr2[i7];
                    kotlin.jvm.internal.i.b(obj2);
                }
                i8 = i7;
                Comparable comparable2 = objArr2[i2];
                kotlin.jvm.internal.i.b(comparable2);
                Comparable comparable3 = objArr2[i8];
                kotlin.jvm.internal.i.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i2, i8);
                i2 = i8;
            }
        }
        L l6 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.i.b(l6);
        l6.d(null);
        l6.f470b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return l6;
    }

    public final void c(int i2) {
        while (i2 > 0) {
            L[] lArr = this.f1331a;
            kotlin.jvm.internal.i.b(lArr);
            int i3 = (i2 - 1) / 2;
            L l2 = lArr[i3];
            kotlin.jvm.internal.i.b(l2);
            L l6 = lArr[i2];
            kotlin.jvm.internal.i.b(l6);
            if (l2.compareTo(l6) <= 0) {
                return;
            }
            d(i2, i3);
            i2 = i3;
        }
    }

    public final void d(int i2, int i3) {
        L[] lArr = this.f1331a;
        kotlin.jvm.internal.i.b(lArr);
        L l2 = lArr[i3];
        kotlin.jvm.internal.i.b(l2);
        L l6 = lArr[i2];
        kotlin.jvm.internal.i.b(l6);
        lArr[i2] = l2;
        lArr[i3] = l6;
        l2.f470b = i2;
        l6.f470b = i3;
    }
}
