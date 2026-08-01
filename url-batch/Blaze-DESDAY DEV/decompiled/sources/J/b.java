package J;

import g1.d;
import q.C0287b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f330a;

    /* renamed from: b, reason: collision with root package name */
    public int f331b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f330a = new Object[i];
    }

    public Object a() {
        int i = this.f331b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f330a;
        Object obj = objArr[i2];
        d.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f331b--;
        return obj;
    }

    public void b(C0287b c0287b) {
        int i = this.f331b;
        Object[] objArr = this.f330a;
        if (i < objArr.length) {
            objArr[i] = c0287b;
            this.f331b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        d.e(obj, "instance");
        int i = this.f331b;
        int i2 = 0;
        while (true) {
            objArr = this.f330a;
            if (i2 >= i) {
                z2 = false;
                break;
            }
            if (objArr[i2] == obj) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f331b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f331b = i3 + 1;
        return true;
    }

    public b() {
        this.f330a = new Object[256];
    }
}
