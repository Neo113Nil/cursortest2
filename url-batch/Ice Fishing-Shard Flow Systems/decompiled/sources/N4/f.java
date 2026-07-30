package N4;

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
        boolean z7;
        ClassLoader classLoader = e.class.getClassLoader();
        if (classLoader != null) {
            z7 = false;
            try {
                if (classLoader != ClassLoader.getSystemClassLoader()) {
                }
            } catch (Throwable unused) {
            }
        }
        z7 = true;
    }

    @Override // N4.d
    public final Object a(Object obj) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.a(obj);
            }
            this.f1836d.remove(poll);
        }
    }

    @Override // N4.g, N4.d
    public final e b(Object obj) {
        e eVar = this.f1840e ? (e) g.f1839i.get() : new e();
        eVar.f1837a = obj;
        eVar.f1838b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // N4.d
    public final Object c(Object obj, Object obj2) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.c(obj, obj2);
            }
            this.f1836d.remove(poll);
        }
    }

    @Override // N4.g, N4.d
    public final void d(Object obj) {
        e eVar = (e) obj;
        eVar.f1837a = null;
        eVar.f1838b = 0;
    }

    @Override // N4.d, java.lang.Iterable
    public final Iterator iterator() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.iterator();
            }
            this.f1836d.remove(poll);
        }
    }
}
