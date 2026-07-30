package B6;

import androidx.datastore.preferences.protobuf.C0191g;
import androidx.datastore.preferences.protobuf.C0209z;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f215a;

    /* renamed from: b, reason: collision with root package name */
    public Object f216b;

    public abstract void a(int i2);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i2);

    public abstract int e(int i2);

    public abstract boolean f();

    public abstract C0191g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i2);

    public void y() {
        int u7;
        do {
            u7 = u();
            if (u7 == 0) {
                return;
            }
            int i2 = this.f215a;
            if (i2 >= 100) {
                throw new C0209z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f215a = i2 + 1;
            this.f215a--;
        } while (x(u7));
    }
}
