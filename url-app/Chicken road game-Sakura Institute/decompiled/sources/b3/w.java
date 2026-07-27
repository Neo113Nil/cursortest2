package b3;

import W2.Q;
import W2.S;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class w {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5695b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public Q[] f5696a;

    public final void a(Q q2) {
        q2.h((S) this);
        Q[] qArr = this.f5696a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5695b;
        if (qArr == null) {
            qArr = new Q[4];
            this.f5696a = qArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= qArr.length) {
            Object[] copyOf = Arrays.copyOf(qArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            qArr = (Q[]) copyOf;
            this.f5696a = qArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        qArr[i2] = q2;
        q2.f4234e = i2;
        c(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q b(int i2) {
        Object[] objArr = this.f5696a;
        Intrinsics.c(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5695b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i2 < atomicIntegerFieldUpdater.get(this)) {
            d(i2, atomicIntegerFieldUpdater.get(this));
            int i4 = (i2 - 1) / 2;
            if (i2 > 0) {
                Q q2 = objArr[i2];
                Intrinsics.c(q2);
                Object obj = objArr[i4];
                Intrinsics.c(obj);
                if (q2.compareTo(obj) < 0) {
                    d(i2, i4);
                    c(i4);
                }
            }
            while (true) {
                int i5 = i2 * 2;
                int i6 = i5 + 1;
                if (i6 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f5696a;
                Intrinsics.c(objArr2);
                int i7 = i5 + 2;
                if (i7 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i7];
                    Intrinsics.c(comparable);
                    Object obj2 = objArr2[i6];
                    Intrinsics.c(obj2);
                }
                i7 = i6;
                Comparable comparable2 = objArr2[i2];
                Intrinsics.c(comparable2);
                Comparable comparable3 = objArr2[i7];
                Intrinsics.c(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i2, i7);
                i2 = i7;
            }
        }
        Q q4 = objArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.c(q4);
        q4.h(null);
        q4.f4234e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return q4;
    }

    public final void c(int i2) {
        while (i2 > 0) {
            Q[] qArr = this.f5696a;
            Intrinsics.c(qArr);
            int i4 = (i2 - 1) / 2;
            Q q2 = qArr[i4];
            Intrinsics.c(q2);
            Q q4 = qArr[i2];
            Intrinsics.c(q4);
            if (q2.compareTo(q4) <= 0) {
                return;
            }
            d(i2, i4);
            i2 = i4;
        }
    }

    public final void d(int i2, int i4) {
        Q[] qArr = this.f5696a;
        Intrinsics.c(qArr);
        Q q2 = qArr[i4];
        Intrinsics.c(q2);
        Q q4 = qArr[i2];
        Intrinsics.c(q4);
        qArr[i2] = q2;
        qArr[i4] = q4;
        q2.f4234e = i2;
        q4.f4234e = i4;
    }
}
