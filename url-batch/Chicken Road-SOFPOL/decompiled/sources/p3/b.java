package p3;

import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f5736a;

    /* renamed from: b, reason: collision with root package name */
    public int f5737b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5736a = new Object[i];
    }

    public Object a() {
        int i = this.f5737b;
        if (i <= 0) {
            return null;
        }
        int i8 = i - 1;
        Object[] objArr = this.f5736a;
        Object obj = objArr[i8];
        i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i8] = null;
        this.f5737b--;
        return obj;
    }

    public void b(w2.b bVar) {
        int i = this.f5737b;
        Object[] objArr = this.f5736a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f5737b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z3;
        i.e(obj, "instance");
        int i = this.f5737b;
        int i8 = 0;
        while (true) {
            objArr = this.f5736a;
            if (i8 >= i) {
                z3 = false;
                break;
            }
            if (objArr[i8] == obj) {
                z3 = true;
                break;
            }
            i8++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i9 = this.f5737b;
        if (i9 >= objArr.length) {
            return false;
        }
        objArr[i9] = obj;
        this.f5737b = i9 + 1;
        return true;
    }

    public b() {
        this.f5736a = new Object[256];
    }
}
