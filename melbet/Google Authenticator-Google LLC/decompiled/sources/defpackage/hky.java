package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hky {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    private final Class e;

    public hky(String str, Class cls, boolean z, boolean z2) {
        if (!hoq.i(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!hoq.i(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.a = str;
        this.e = cls;
        this.b = z;
        this.c = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.d = j;
    }

    public void a(Iterator it, hkx hkxVar) {
        while (it.hasNext()) {
            b(it.next(), hkxVar);
        }
    }

    public void b(Object obj, hkx hkxVar) {
        hkxVar.a(this.a, obj);
    }

    public final Object c(Object obj) {
        return this.e.cast(obj);
    }

    public final String toString() {
        Class cls = this.e;
        return getClass().getName() + "/" + this.a + "[" + cls.getName() + "]";
    }
}
