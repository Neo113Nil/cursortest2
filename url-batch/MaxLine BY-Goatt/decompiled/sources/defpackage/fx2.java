package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class fx2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(fx2.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public si0[] a;

    public final void a(si0 si0Var) {
        si0Var.d((ti0) this);
        si0[] si0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (si0VarArr == null) {
            si0VarArr = new si0[4];
            this.a = si0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= si0VarArr.length) {
            si0VarArr = (si0[]) Arrays.copyOf(si0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = si0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        si0VarArr[i] = si0Var;
        si0Var.n = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final si0 b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                si0 si0Var = objArr[i];
                si0Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (si0Var.compareTo(obj) < 0) {
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
        si0 si0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        si0Var2.getClass();
        si0Var2.d(null);
        si0Var2.n = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return si0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            si0[] si0VarArr = this.a;
            si0VarArr.getClass();
            int i2 = (i - 1) / 2;
            si0 si0Var = si0VarArr[i2];
            si0Var.getClass();
            si0 si0Var2 = si0VarArr[i];
            si0Var2.getClass();
            if (si0Var.compareTo(si0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        si0[] si0VarArr = this.a;
        si0VarArr.getClass();
        si0 si0Var = si0VarArr[i2];
        si0Var.getClass();
        si0 si0Var2 = si0VarArr[i];
        si0Var2.getClass();
        si0VarArr[i] = si0Var;
        si0VarArr[i2] = si0Var2;
        si0Var.n = i;
        si0Var2.n = i2;
    }
}
