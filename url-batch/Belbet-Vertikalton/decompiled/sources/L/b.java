package L;

import j1.h;
import s.C0377b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f690a;

    /* renamed from: b, reason: collision with root package name */
    public int f691b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f690a = new Object[i];
    }

    public Object a() {
        int i = this.f691b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f690a;
        Object obj = objArr[i2];
        h.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f691b--;
        return obj;
    }

    public void b(C0377b c0377b) {
        int i = this.f691b;
        Object[] objArr = this.f690a;
        if (i < objArr.length) {
            objArr[i] = c0377b;
            this.f691b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        h.e(obj, "instance");
        int i = this.f691b;
        int i2 = 0;
        while (true) {
            objArr = this.f690a;
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
        int i3 = this.f691b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f691b = i3 + 1;
        return true;
    }

    public b() {
        this.f690a = new Object[256];
    }
}
