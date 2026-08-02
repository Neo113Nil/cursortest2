package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class flw {
    protected flx j;
    protected final List k = new ArrayList();

    protected flw(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new flu());
        }
    }

    protected static final float h(int i, int i2, int i3) {
        return pj.i((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(aqc aqcVar);

    public abstract void d();

    public abstract void f();

    public abstract void g();
}
