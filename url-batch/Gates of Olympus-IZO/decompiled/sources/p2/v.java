package p2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k2.L;
import k2.M;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6809b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public L[] f6810a;

    public final void a(L l3) {
        l3.d((M) this);
        L[] lArr = this.f6810a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6809b;
        if (lArr == null) {
            lArr = new L[4];
            this.f6810a = lArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= lArr.length) {
            Object[] copyOf = Arrays.copyOf(lArr, atomicIntegerFieldUpdater.get(this) * 2);
            Z1.i.e(copyOf, "copyOf(...)");
            lArr = (L[]) copyOf;
            this.f6810a = lArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        lArr[i3] = l3;
        l3.f5321e = i3;
        c(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L b(int i3) {
        Object[] objArr = this.f6810a;
        Z1.i.c(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6809b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i3 < atomicIntegerFieldUpdater.get(this)) {
            d(i3, atomicIntegerFieldUpdater.get(this));
            int i4 = (i3 - 1) / 2;
            if (i3 > 0) {
                L l3 = objArr[i3];
                Z1.i.c(l3);
                Object obj = objArr[i4];
                Z1.i.c(obj);
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
                Object[] objArr2 = this.f6810a;
                Z1.i.c(objArr2);
                int i7 = i5 + 2;
                if (i7 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i7];
                    Z1.i.c(comparable);
                    Object obj2 = objArr2[i6];
                    Z1.i.c(obj2);
                }
                i7 = i6;
                Comparable comparable2 = objArr2[i3];
                Z1.i.c(comparable2);
                Comparable comparable3 = objArr2[i7];
                Z1.i.c(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i3, i7);
                i3 = i7;
            }
        }
        L l4 = objArr[atomicIntegerFieldUpdater.get(this)];
        Z1.i.c(l4);
        l4.d(null);
        l4.f5321e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return l4;
    }

    public final void c(int i3) {
        while (i3 > 0) {
            L[] lArr = this.f6810a;
            Z1.i.c(lArr);
            int i4 = (i3 - 1) / 2;
            L l3 = lArr[i4];
            Z1.i.c(l3);
            L l4 = lArr[i3];
            Z1.i.c(l4);
            if (l3.compareTo(l4) <= 0) {
                return;
            }
            d(i3, i4);
            i3 = i4;
        }
    }

    public final void d(int i3, int i4) {
        L[] lArr = this.f6810a;
        Z1.i.c(lArr);
        L l3 = lArr[i4];
        Z1.i.c(l3);
        L l4 = lArr[i3];
        Z1.i.c(l4);
        lArr[i3] = l3;
        lArr[i4] = l4;
        l3.f5321e = i3;
        l4.f5321e = i4;
    }
}
