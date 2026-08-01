package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class c00 {
    public final Object[] a;
    public int b;

    public c00(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            g9.i("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(y6 y6Var) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = y6Var;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                g9.s("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public c00() {
        this.a = new Object[256];
    }
}
