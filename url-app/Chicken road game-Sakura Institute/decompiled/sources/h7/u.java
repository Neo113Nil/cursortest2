package h7;

import c7.n0;
import c7.o0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4709b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public n0[] f4710a;

    public final void a(n0 n0Var) {
        n0Var.h((o0) this);
        n0[] n0VarArr = this.f4710a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4709b;
        if (n0VarArr == null) {
            n0VarArr = new n0[4];
            this.f4710a = n0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= n0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(n0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            r6.k.e(copyOf, "copyOf(...)");
            n0VarArr = (n0[]) copyOf;
            this.f4710a = n0VarArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        n0VarArr[i7] = n0Var;
        n0Var.f1717g = i7;
        c(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n0 b(int i7) {
        Object[] objArr = this.f4710a;
        r6.k.c(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4709b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                n0 n0Var = objArr[i7];
                r6.k.c(n0Var);
                Object obj = objArr[i8];
                r6.k.c(obj);
                if (n0Var.compareTo(obj) < 0) {
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
                Object[] objArr2 = this.f4710a;
                r6.k.c(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    r6.k.c(comparable);
                    Object obj2 = objArr2[i10];
                    r6.k.c(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i7];
                r6.k.c(comparable2);
                Comparable comparable3 = objArr2[i11];
                r6.k.c(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i7, i11);
                i7 = i11;
            }
        }
        n0 n0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        r6.k.c(n0Var2);
        n0Var2.h(null);
        n0Var2.f1717g = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return n0Var2;
    }

    public final void c(int i7) {
        while (i7 > 0) {
            n0[] n0VarArr = this.f4710a;
            r6.k.c(n0VarArr);
            int i8 = (i7 - 1) / 2;
            n0 n0Var = n0VarArr[i8];
            r6.k.c(n0Var);
            n0 n0Var2 = n0VarArr[i7];
            r6.k.c(n0Var2);
            if (n0Var.compareTo(n0Var2) <= 0) {
                return;
            }
            d(i7, i8);
            i7 = i8;
        }
    }

    public final void d(int i7, int i8) {
        n0[] n0VarArr = this.f4710a;
        r6.k.c(n0VarArr);
        n0 n0Var = n0VarArr[i8];
        r6.k.c(n0Var);
        n0 n0Var2 = n0VarArr[i7];
        r6.k.c(n0Var2);
        n0VarArr[i7] = n0Var;
        n0VarArr[i8] = n0Var2;
        n0Var.f1717g = i7;
        n0Var2.f1717g = i8;
    }
}
