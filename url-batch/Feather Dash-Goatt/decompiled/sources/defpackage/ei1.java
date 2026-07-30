package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ei1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ei1.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public hw[] a;

    public final void a(hw hwVar) {
        hwVar.d((iw) this);
        hw[] hwVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (hwVarArr == null) {
            hwVarArr = new hw[4];
            this.a = hwVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= hwVarArr.length) {
            hwVarArr = (hw[]) Arrays.copyOf(hwVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = hwVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        hwVarArr[i] = hwVar;
        hwVar.e = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hw b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                hw hwVar = objArr[i];
                hwVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (hwVar.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i5);
                i = i5;
            }
        }
        hw hwVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        hwVar2.getClass();
        hwVar2.d(null);
        hwVar2.e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return hwVar2;
    }

    public final void c(int i) {
        while (i > 0) {
            hw[] hwVarArr = this.a;
            hwVarArr.getClass();
            int i2 = (i - 1) / 2;
            hw hwVar = hwVarArr[i2];
            hwVar.getClass();
            hw hwVar2 = hwVarArr[i];
            hwVar2.getClass();
            if (hwVar.compareTo(hwVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        hw[] hwVarArr = this.a;
        hwVarArr.getClass();
        hw hwVar = hwVarArr[i2];
        hwVar.getClass();
        hw hwVar2 = hwVarArr[i];
        hwVar2.getClass();
        hwVarArr[i] = hwVar;
        hwVarArr[i2] = hwVar2;
        hwVar.e = i;
        hwVar2.e = i2;
    }
}
