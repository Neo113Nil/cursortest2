package g4;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class f extends g {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == java.lang.ClassLoader.getSystemClassLoader().getParent()) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f() {
        super(r1, new ConcurrentHashMap());
        boolean z5;
        ClassLoader classLoader = C0397e.class.getClassLoader();
        if (classLoader != null) {
            z5 = false;
            try {
                if (classLoader != ClassLoader.getSystemClassLoader()) {
                }
            } catch (Throwable unused) {
            }
        }
        z5 = true;
    }

    @Override // g4.AbstractRunnableC0396d
    public final Object a(Object obj) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.a(obj);
            }
            this.f4281f.remove(poll);
        }
    }

    @Override // g4.g, g4.AbstractRunnableC0396d
    public final C0397e b(Object obj) {
        C0397e c0397e = this.f4285g ? (C0397e) g.f4284h.get() : new C0397e();
        c0397e.f4282a = obj;
        c0397e.f4283b = System.identityHashCode(obj);
        return c0397e;
    }

    @Override // g4.AbstractRunnableC0396d
    public final Object c(Object obj, Object obj2) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.c(obj, obj2);
            }
            this.f4281f.remove(poll);
        }
    }

    @Override // g4.g, g4.AbstractRunnableC0396d
    public final void d(Object obj) {
        C0397e c0397e = (C0397e) obj;
        c0397e.f4282a = null;
        c0397e.f4283b = 0;
    }

    @Override // g4.AbstractRunnableC0396d, java.lang.Iterable
    public final Iterator iterator() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.iterator();
            }
            this.f4281f.remove(poll);
        }
    }
}
