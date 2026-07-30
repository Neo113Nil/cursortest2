package i;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4759a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f4760b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4761c = new Object();

    public static final void a(h0 h0Var) {
        int i7 = h0Var.f4749i;
        int[] iArr = h0Var.f4747g;
        Object[] objArr = h0Var.f4748h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f4761c) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        h0Var.f4746f = false;
        h0Var.f4749i = i8;
    }

    public static final void b(f fVar, int i7) {
        fVar.f4737f = new int[i7];
        fVar.f4738g = new Object[i7];
    }

    public static final int c(f fVar, Object obj, int i7) {
        int i8 = fVar.f4739h;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a3 = j.a.a(fVar.f4737f, i8, i7);
            if (a3 < 0 || r6.k.a(obj, fVar.f4738g[a3])) {
                return a3;
            }
            int i9 = a3 + 1;
            while (i9 < i8 && fVar.f4737f[i9] == i7) {
                if (r6.k.a(obj, fVar.f4738g[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a3 - 1; i10 >= 0 && fVar.f4737f[i10] == i7; i10--) {
                if (r6.k.a(obj, fVar.f4738g[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
