package r;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6389a;

    public p1(int i) {
        switch (i) {
            case 1:
                this.f6389a = new ArrayList();
                break;
            default:
                this.f6389a = m0.b.q(Boolean.FALSE);
                break;
        }
    }

    public boolean a(m0.m0 m0Var, Object obj) {
        ArrayList arrayList = m0Var.f5016a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof m0.a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof m0.m0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (a((m0.m0) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract Object b();

    public abstract void d(Object obj);

    public abstract void e(l1 l1Var);

    public abstract void f();

    public void c(m0.m0 m0Var, Object obj) {
    }
}
