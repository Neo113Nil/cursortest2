package J;

import b1.d;
import q.C0285b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f343a;

    /* renamed from: b, reason: collision with root package name */
    public int f344b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f343a = new Object[i];
    }

    public Object a() {
        int i = this.f344b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f343a;
        Object obj = objArr[i2];
        d.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f344b--;
        return obj;
    }

    public void b(C0285b c0285b) {
        int i = this.f344b;
        Object[] objArr = this.f343a;
        if (i < objArr.length) {
            objArr[i] = c0285b;
            this.f344b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        d.e(obj, "instance");
        int i = this.f344b;
        int i2 = 0;
        while (true) {
            objArr = this.f343a;
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
        int i3 = this.f344b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f344b = i3 + 1;
        return true;
    }

    public b() {
        this.f343a = new Object[256];
    }
}
