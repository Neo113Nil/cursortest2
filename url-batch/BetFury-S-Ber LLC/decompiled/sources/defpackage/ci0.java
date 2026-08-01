package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ci0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ci0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public nn[] a;

    public final void a(nn nnVar) {
        nnVar.d((on) this);
        nn[] nnVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (nnVarArr == null) {
            nnVarArr = new nn[4];
            this.a = nnVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= nnVarArr.length) {
            nnVarArr = (nn[]) Arrays.copyOf(nnVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = nnVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        nnVarArr[i] = nnVar;
        nnVar.g = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nn b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                nn nnVar = objArr[i];
                nnVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (nnVar.compareTo(obj) < 0) {
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
        nn nnVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        nnVar2.getClass();
        nnVar2.d(null);
        nnVar2.g = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return nnVar2;
    }

    public final void c(int i) {
        while (i > 0) {
            nn[] nnVarArr = this.a;
            nnVarArr.getClass();
            int i2 = (i - 1) / 2;
            nn nnVar = nnVarArr[i2];
            nnVar.getClass();
            nn nnVar2 = nnVarArr[i];
            nnVar2.getClass();
            if (nnVar.compareTo(nnVar2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        nn[] nnVarArr = this.a;
        nnVarArr.getClass();
        nn nnVar = nnVarArr[i2];
        nnVar.getClass();
        nn nnVar2 = nnVarArr[i];
        nnVar2.getClass();
        nnVarArr[i] = nnVar;
        nnVarArr[i2] = nnVar2;
        nnVar.g = i;
        nnVar2.g = i2;
    }
}
