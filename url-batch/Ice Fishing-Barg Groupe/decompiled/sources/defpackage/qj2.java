package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class qj2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater lS5Rgt96tfkO = AtomicIntegerFieldUpdater.newUpdater(qj2.class, "_size$volatile");
    public w60[] PxuCJdSBwIXG;
    private volatile /* synthetic */ int _size$volatile;

    public final void PxuCJdSBwIXG(w60 w60Var) {
        w60Var.Y1f8riQaR6yg((x60) this);
        w60[] w60VarArr = this.PxuCJdSBwIXG;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = lS5Rgt96tfkO;
        if (w60VarArr == null) {
            w60VarArr = new w60[4];
            this.PxuCJdSBwIXG = w60VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= w60VarArr.length) {
            w60VarArr = (w60[]) Arrays.copyOf(w60VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.PxuCJdSBwIXG = w60VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        w60VarArr[i] = w60Var;
        w60Var.OPXfSBeufaJ8 = i;
        TSizfFm2Yiuu(i);
    }

    public final void TSizfFm2Yiuu(int i) {
        while (i > 0) {
            w60[] w60VarArr = this.PxuCJdSBwIXG;
            w60VarArr.getClass();
            int i2 = (i - 1) / 2;
            w60 w60Var = w60VarArr[i2];
            w60Var.getClass();
            w60 w60Var2 = w60VarArr[i];
            w60Var2.getClass();
            if (w60Var.compareTo(w60Var2) <= 0) {
                return;
            }
            Y1f8riQaR6yg(i, i2);
            i = i2;
        }
    }

    public final void Y1f8riQaR6yg(int i, int i2) {
        w60[] w60VarArr = this.PxuCJdSBwIXG;
        w60VarArr.getClass();
        w60 w60Var = w60VarArr[i2];
        w60Var.getClass();
        w60 w60Var2 = w60VarArr[i];
        w60Var2.getClass();
        w60VarArr[i] = w60Var;
        w60VarArr[i2] = w60Var2;
        w60Var.OPXfSBeufaJ8 = i;
        w60Var2.OPXfSBeufaJ8 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w60 lS5Rgt96tfkO(int i) {
        Object[] objArr = this.PxuCJdSBwIXG;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = lS5Rgt96tfkO;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            Y1f8riQaR6yg(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                w60 w60Var = objArr[i];
                w60Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (w60Var.compareTo(obj) < 0) {
                    Y1f8riQaR6yg(i, i2);
                    TSizfFm2Yiuu(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.PxuCJdSBwIXG;
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
                Y1f8riQaR6yg(i, i5);
                i = i5;
            }
        }
        w60 w60Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        w60Var2.getClass();
        w60Var2.Y1f8riQaR6yg(null);
        w60Var2.OPXfSBeufaJ8 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return w60Var2;
    }
}
