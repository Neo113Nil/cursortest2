package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jkp extends jja {
    private static final ConcurrentMap a = new ConcurrentHashMap();
    public static final /* synthetic */ int t = 0;
    private int b = -1;
    protected jmk s = jmk.a;

    public static jkx A(jkx jkxVar) {
        int size = jkxVar.size();
        return jkxVar.d(size + size);
    }

    public static jlr D(Class cls) {
        ConcurrentMap concurrentMap = a;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            n(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            throw new IllegalStateException("Default instance cannot be null.");
        }
        if (obj instanceof jlr) {
            return (jlr) obj;
        }
        jkk jkkVar = new jkk((jkp) obj);
        return concurrentMap.replace(cls, obj, jkkVar) ? jkkVar : (jlr) concurrentMap.get(cls);
    }

    static Object F(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void I(Class cls, jkp jkpVar) {
        jkpVar.H();
        a.put(cls, jkpVar);
    }

    public static final boolean L(jkp jkpVar, boolean z) {
        byte byteValue = ((Byte) jkpVar.a(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean l = jlt.a.a(jkpVar).l(jkpVar);
        if (z) {
            jkpVar.a(2, true == l ? jkpVar : null);
        }
        return l;
    }

    public static void N(jkp jkpVar) {
        if (jkpVar != null && !L(jkpVar, true)) {
            throw new jmi().a();
        }
    }

    public static iwq O(jll jllVar, Object obj, jll jllVar2, int i, jmr jmrVar) {
        return new iwq(jllVar, obj, jllVar2, new jko(i, jmrVar));
    }

    private final int b(jlz jlzVar) {
        return jlzVar == null ? jlt.a.a(this).a(this) : jlzVar.a(this);
    }

    static jkp n(Class cls) {
        ConcurrentMap concurrentMap = a;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                obj = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (obj == null) {
            obj = ((jkp) jmp.e(cls)).s();
            if (obj == null) {
                throw new IllegalStateException();
            }
            concurrentMap.put(cls, obj);
        }
        if (obj instanceof jkp) {
            return (jkp) obj;
        }
        int i = jkk.b;
        return ((jkk) obj).a;
    }

    public static jkp q(jkp jkpVar, InputStream inputStream) {
        jkp w;
        jkd jkdVar = jkd.a;
        try {
            int read = inputStream.read();
            if (read == -1) {
                w = null;
            } else {
                int i = jju.f;
                if ((read & 128) != 0) {
                    read &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int read2 = inputStream.read();
                                if (read2 == -1) {
                                    throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if ((read2 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new jld("CodedInputStream encountered a malformed varint.");
                        }
                        int read3 = inputStream.read();
                        if (read3 == -1) {
                            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        read |= (read3 & 127) << i2;
                        if ((read3 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                jju L = jju.L(new jiy(inputStream, read), 4096);
                w = w(jkpVar, L, jkdVar);
                L.D(0);
            }
            N(w);
            return w;
        } catch (jld e) {
            if (e.a) {
                throw new jld(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new jld(e2);
        }
    }

    public static jkp r(jkp jkpVar, byte[] bArr) {
        jkp x = x(jkpVar, bArr, 0, bArr.length, jkd.a);
        N(x);
        return x;
    }

    public static jkp t(jkp jkpVar, InputStream inputStream, jkd jkdVar) {
        jkp w = w(jkpVar, jju.L(inputStream, 4096), jkdVar);
        N(w);
        return w;
    }

    public static jkp v(jkp jkpVar, byte[] bArr, jkd jkdVar) {
        jkp x = x(jkpVar, bArr, 0, bArr.length, jkdVar);
        N(x);
        return x;
    }

    public static jkp w(jkp jkpVar, jju jjuVar, jkd jkdVar) {
        jkp p = jkpVar.p();
        try {
            jlz a2 = jlt.a.a(p);
            a2.i(p, jjv.p(jjuVar), jkdVar);
            a2.g(p);
            return p;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof jld) {
                throw ((jld) e.getCause());
            }
            throw e;
        } catch (jld e2) {
            if (e2.a) {
                throw new jld(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof jld) {
                throw ((jld) e3.getCause());
            }
            throw new jld(e3);
        } catch (jmi e4) {
            throw e4.a();
        }
    }

    public static jkp x(jkp jkpVar, byte[] bArr, int i, int i2, jkd jkdVar) {
        if (i2 == 0) {
            return jkpVar;
        }
        jkp p = jkpVar.p();
        try {
            jlz a2 = jlt.a.a(p);
            a2.j(p, bArr, i, i + i2, new jje(jkdVar));
            a2.g(p);
            return p;
        } catch (jld e) {
            if (e.a) {
                throw new jld(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof jld) {
                throw ((jld) e2.getCause());
            }
            throw new jld(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (jmi e3) {
            throw e3.a();
        }
    }

    public static jkt y(jkt jktVar) {
        int size = jktVar.size();
        return jktVar.d(size + size);
    }

    public static jkw z(jkw jkwVar) {
        int size = jkwVar.size();
        return jkwVar.d(size + size);
    }

    @Override // defpackage.jll
    public final jlr E() {
        return (jlr) a(7, null);
    }

    protected final void G() {
        jlt.a.a(this).g(this);
        H();
    }

    final void H() {
        this.b &= Integer.MAX_VALUE;
    }

    final void J(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.Y(i, "serialized size must be non-negative, was "));
        }
        this.b = i | (this.b & Integer.MIN_VALUE);
    }

    @Override // defpackage.jll
    public final void K(jjz jjzVar) {
        jlz a2 = jlt.a.a(this);
        Object obj = jjzVar.a;
        if (obj == null) {
            obj = new ikk(jjzVar);
        }
        a2.m(this, (ikk) obj);
    }

    public final boolean M() {
        return this.b < 0;
    }

    protected abstract Object a(int i, Object obj);

    @Override // defpackage.jja
    public final int c(jlz jlzVar) {
        if (M()) {
            int b = b(jlzVar);
            if (b >= 0) {
                return b;
            }
            throw new IllegalStateException(a.Y(b, "serialized size must be non-negative, was "));
        }
        if (i() != Integer.MAX_VALUE) {
            return i();
        }
        int b2 = b(jlzVar);
        J(b2);
        return b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return jlt.a.a(this).k(this, (jkp) obj);
        }
        return false;
    }

    final int h() {
        return jlt.a.a(this).b(this);
    }

    public final int hashCode() {
        if (M()) {
            return h();
        }
        int i = this.r;
        if (i != 0) {
            return i;
        }
        int h = h();
        this.r = h;
        return h;
    }

    final int i() {
        return this.b & Integer.MAX_VALUE;
    }

    @Override // defpackage.jll
    public final int j() {
        return c(null);
    }

    public final jkj k() {
        return (jkj) a(5, null);
    }

    @Override // defpackage.jll
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final jkj B() {
        return (jkj) a(5, null);
    }

    @Override // defpackage.jll
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final jkj C() {
        jkj jkjVar = (jkj) a(5, null);
        jkjVar.w(this);
        return jkjVar;
    }

    @Override // defpackage.jlm
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final jkp s() {
        return (jkp) a(6, null);
    }

    final jkp p() {
        return (jkp) a(4, null);
    }

    public final String toString() {
        String obj = super.toString();
        int i = jln.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        jln.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.jlm
    public final boolean u() {
        return L(this, true);
    }
}
