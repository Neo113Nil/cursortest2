package le;

import ge.s0;
import ge.t0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6010b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public s0[] f6011a;

    public final void a(s0 s0Var) {
        s0Var.d((t0) this);
        s0[] s0VarArr = this.f6011a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6010b;
        if (s0VarArr == null) {
            s0VarArr = new s0[4];
            this.f6011a = s0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= s0VarArr.length) {
            s0VarArr = (s0[]) Arrays.copyOf(s0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f6011a = s0VarArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        s0VarArr[i3] = s0Var;
        s0Var.f4399e = i3;
        c(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 b(int i3) {
        Object[] objArr = this.f6011a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6010b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i3 < atomicIntegerFieldUpdater.get(this)) {
            d(i3, atomicIntegerFieldUpdater.get(this));
            int i10 = (i3 - 1) / 2;
            if (i3 > 0) {
                s0 s0Var = objArr[i3];
                s0Var.getClass();
                Object obj = objArr[i10];
                obj.getClass();
                if (s0Var.compareTo(obj) < 0) {
                    d(i3, i10);
                    c(i10);
                }
            }
            while (true) {
                int i11 = i3 * 2;
                int i12 = i11 + 1;
                if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f6011a;
                objArr2.getClass();
                int i13 = i11 + 2;
                if (i13 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i13];
                    comparable.getClass();
                    Object obj2 = objArr2[i12];
                    obj2.getClass();
                }
                i13 = i12;
                Comparable comparable2 = objArr2[i3];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i13];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i3, i13);
                i3 = i13;
            }
        }
        s0 s0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        s0Var2.getClass();
        s0Var2.d(null);
        s0Var2.f4399e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return s0Var2;
    }

    public final void c(int i3) {
        while (i3 > 0) {
            s0[] s0VarArr = this.f6011a;
            s0VarArr.getClass();
            int i10 = (i3 - 1) / 2;
            s0 s0Var = s0VarArr[i10];
            s0Var.getClass();
            s0 s0Var2 = s0VarArr[i3];
            s0Var2.getClass();
            if (s0Var.compareTo(s0Var2) <= 0) {
                return;
            }
            d(i3, i10);
            i3 = i10;
        }
    }

    public final void d(int i3, int i10) {
        s0[] s0VarArr = this.f6011a;
        s0VarArr.getClass();
        s0 s0Var = s0VarArr[i10];
        s0Var.getClass();
        s0 s0Var2 = s0VarArr[i3];
        s0Var2.getClass();
        s0VarArr[i3] = s0Var;
        s0VarArr[i10] = s0Var2;
        s0Var.f4399e = i3;
        s0Var2.f4399e = i10;
    }
}
