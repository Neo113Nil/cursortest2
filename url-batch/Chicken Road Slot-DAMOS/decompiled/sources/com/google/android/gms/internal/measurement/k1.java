package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k1 extends o0 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected u2 zzc;

    public k1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = u2.f2837f;
    }

    public static k1 e(k1 k1Var, byte[] bArr, c1 c1Var) {
        int length = bArr.length;
        if (length != 0) {
            k1 i3 = k1Var.i();
            try {
                o2 a9 = l2.f2493c.a(i3.getClass());
                a9.c(i3, bArr, 0, length, new r0(c1Var));
                a9.h(i3);
                k1Var = i3;
            } catch (s2 e2) {
                throw e2.a();
            } catch (v1 e9) {
                if (e9.f2862d) {
                    throw new v1(e9.getMessage(), e9);
                }
                throw e9;
            } catch (IOException e10) {
                if (e10.getCause() instanceof v1) {
                    throw ((v1) e10.getCause());
                }
                throw new v1(e10.getMessage(), e10);
            } catch (IndexOutOfBoundsException unused) {
                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        r(k1Var);
        return k1Var;
    }

    public static k1 n(Class cls) {
        Map map = zze;
        k1 k1Var = (k1) map.get(cls);
        if (k1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k1Var = (k1) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1Var2 = (k1) ((k1) z2.d(cls)).s(6);
        if (k1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, k1Var2);
        return k1Var2;
    }

    public static void o(Class cls, k1 k1Var) {
        k1Var.h();
        zze.put(cls, k1Var);
    }

    public static Object p(Method method, k1 k1Var, Object... objArr) {
        try {
            return method.invoke(k1Var, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean q(k1 k1Var, boolean z10) {
        byte byteValue = ((Byte) k1Var.s(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g = l2.f2493c.a(k1Var.getClass()).g(k1Var);
        if (z10) {
            k1Var.s(2);
        }
        return g;
    }

    public static void r(k1 k1Var) {
        if (k1Var != null && !q(k1Var, true)) {
            throw new s2().a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final int c(o2 o2Var) {
        if (g()) {
            int b10 = o2Var.b(this);
            if (b10 >= 0) {
                return b10;
            }
            a2.r.c(String.valueOf(b10).length() + 42, b10);
            return 0;
        }
        int i3 = this.zzb & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int b11 = o2Var.b(this);
        if (b11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | b11;
            return b11;
        }
        a2.r.c(String.valueOf(b11).length() + 42, b11);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return l2.f2493c.a(getClass()).i(this, (k1) obj);
    }

    public final void f(b1 b1Var) {
        o2 a9 = l2.f2493c.a(getClass());
        v5 v5Var = b1Var.f2158a;
        if (v5Var == null) {
            v5Var = new v5(b1Var);
        }
        a9.e(this, v5Var);
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return l2.f2493c.a(getClass()).j(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int j = l2.f2493c.a(getClass()).j(this);
        this.zza = j;
        return j;
    }

    public final k1 i() {
        return (k1) s(4);
    }

    public final i1 j() {
        return (i1) s(5);
    }

    public final i1 k() {
        i1 i1Var = (i1) s(5);
        i1Var.e(this);
        return i1Var;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int m() {
        if (g()) {
            int b10 = l2.f2493c.a(getClass()).b(this);
            if (b10 >= 0) {
                return b10;
            }
            a2.r.c(String.valueOf(b10).length() + 42, b10);
            return 0;
        }
        int i3 = this.zzb & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int b11 = l2.f2493c.a(getClass()).b(this);
        if (b11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | b11;
            return b11;
        }
        a2.r.c(String.valueOf(b11).length() + 42, b11);
        return 0;
    }

    public abstract Object s(int i3);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = f2.f2275a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        f2.b(this, sb2, 0);
        return sb2.toString();
    }
}
