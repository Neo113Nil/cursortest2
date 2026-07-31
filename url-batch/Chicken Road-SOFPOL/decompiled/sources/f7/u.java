package f7;

import a7.j0;
import a7.k0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2802b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public j0[] f2803a;

    public final void a(j0 j0Var) {
        j0Var.d((k0) this);
        j0[] j0VarArr = this.f2803a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2802b;
        if (j0VarArr == null) {
            j0VarArr = new j0[4];
            this.f2803a = j0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= j0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(j0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            q6.i.d(copyOf, "copyOf(...)");
            j0VarArr = (j0[]) copyOf;
            this.f2803a = j0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        j0VarArr[i] = j0Var;
        j0Var.f268e = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j0 b(int i) {
        Object[] objArr = this.f2803a;
        q6.i.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2802b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i8 = (i - 1) / 2;
            if (i > 0) {
                j0 j0Var = objArr[i];
                q6.i.b(j0Var);
                Object obj = objArr[i8];
                q6.i.b(obj);
                if (j0Var.compareTo(obj) < 0) {
                    d(i, i8);
                    c(i8);
                }
            }
            while (true) {
                int i9 = i * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f2803a;
                q6.i.b(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    q6.i.b(comparable);
                    Object obj2 = objArr2[i10];
                    q6.i.b(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i];
                q6.i.b(comparable2);
                Comparable comparable3 = objArr2[i11];
                q6.i.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i11);
                i = i11;
            }
        }
        j0 j0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        q6.i.b(j0Var2);
        j0Var2.d(null);
        j0Var2.f268e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return j0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            j0[] j0VarArr = this.f2803a;
            q6.i.b(j0VarArr);
            int i8 = (i - 1) / 2;
            j0 j0Var = j0VarArr[i8];
            q6.i.b(j0Var);
            j0 j0Var2 = j0VarArr[i];
            q6.i.b(j0Var2);
            if (j0Var.compareTo(j0Var2) <= 0) {
                return;
            }
            d(i, i8);
            i = i8;
        }
    }

    public final void d(int i, int i8) {
        j0[] j0VarArr = this.f2803a;
        q6.i.b(j0VarArr);
        j0 j0Var = j0VarArr[i8];
        q6.i.b(j0Var);
        j0 j0Var2 = j0VarArr[i];
        q6.i.b(j0Var2);
        j0VarArr[i] = j0Var;
        j0VarArr[i8] = j0Var2;
        j0Var.f268e = i;
        j0Var2.f268e = i8;
    }
}
