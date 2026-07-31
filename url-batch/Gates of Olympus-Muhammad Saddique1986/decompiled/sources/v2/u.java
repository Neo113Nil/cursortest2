package v2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.L;
import q2.M;

/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9829b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public L[] f9830a;

    public final void a(L l3) {
        l3.d((M) this);
        L[] lArr = this.f9830a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9829b;
        if (lArr == null) {
            lArr = new L[4];
            this.f9830a = lArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= lArr.length) {
            Object[] copyOf = Arrays.copyOf(lArr, atomicIntegerFieldUpdater.get(this) * 2);
            f2.j.e(copyOf, "copyOf(...)");
            lArr = (L[]) copyOf;
            this.f9830a = lArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        lArr[i3] = l3;
        l3.f7860e = i3;
        c(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L b(int i3) {
        Object[] objArr = this.f9830a;
        f2.j.c(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9829b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i3 < atomicIntegerFieldUpdater.get(this)) {
            d(i3, atomicIntegerFieldUpdater.get(this));
            int i4 = (i3 - 1) / 2;
            if (i3 > 0) {
                L l3 = objArr[i3];
                f2.j.c(l3);
                Object obj = objArr[i4];
                f2.j.c(obj);
                if (l3.compareTo(obj) < 0) {
                    d(i3, i4);
                    c(i4);
                }
            }
            while (true) {
                int i5 = i3 * 2;
                int i6 = i5 + 1;
                if (i6 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f9830a;
                f2.j.c(objArr2);
                int i7 = i5 + 2;
                if (i7 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i7];
                    f2.j.c(comparable);
                    Object obj2 = objArr2[i6];
                    f2.j.c(obj2);
                }
                i7 = i6;
                Comparable comparable2 = objArr2[i3];
                f2.j.c(comparable2);
                Comparable comparable3 = objArr2[i7];
                f2.j.c(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i3, i7);
                i3 = i7;
            }
        }
        L l4 = objArr[atomicIntegerFieldUpdater.get(this)];
        f2.j.c(l4);
        l4.d(null);
        l4.f7860e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return l4;
    }

    public final void c(int i3) {
        while (i3 > 0) {
            L[] lArr = this.f9830a;
            f2.j.c(lArr);
            int i4 = (i3 - 1) / 2;
            L l3 = lArr[i4];
            f2.j.c(l3);
            L l4 = lArr[i3];
            f2.j.c(l4);
            if (l3.compareTo(l4) <= 0) {
                return;
            }
            d(i3, i4);
            i3 = i4;
        }
    }

    public final void d(int i3, int i4) {
        L[] lArr = this.f9830a;
        f2.j.c(lArr);
        L l3 = lArr[i4];
        f2.j.c(l3);
        L l4 = lArr[i3];
        f2.j.c(l4);
        lArr[i3] = l3;
        lArr[i4] = l4;
        l3.f7860e = i3;
        l4.f7860e = i4;
    }
}
