package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class in3 extends zl3 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected jp3 zzc;

    public in3() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = jp3.f;
    }

    public static in3 l(Class cls) {
        Map map = zzd;
        in3 in3Var = (in3) map.get(cls);
        if (in3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                in3Var = (in3) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (in3Var != null) {
            return in3Var;
        }
        in3 in3Var2 = (in3) ((in3) sp3.e(cls)).o(6);
        if (in3Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, in3Var2);
        return in3Var2;
    }

    public static void m(Class cls, in3 in3Var) {
        in3Var.f();
        zzd.put(cls, in3Var);
    }

    public static Object n(Method method, in3 in3Var, Object... objArr) {
        try {
            return method.invoke(in3Var, objArr);
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

    @Override // defpackage.zl3
    public final int b(yo3 yo3Var) {
        if (e()) {
            int d = yo3Var.d(this);
            if (d >= 0) {
                return d;
            }
            ch2.b(String.valueOf(d).length() + 42, d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = yo3Var.d(this);
        if (d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d2;
            return d2;
        }
        ch2.b(String.valueOf(d2).length() + 42, d2);
        return 0;
    }

    public final void d(lm3 lm3Var) {
        yo3 a = uo3.c.a(getClass());
        ot2 ot2Var = lm3Var.a;
        if (ot2Var == null) {
            ot2Var = new ot2(lm3Var);
        }
        a.b(this, ot2Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return uo3.c.a(getClass()).f(this, (in3) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        uo3.c.a(getClass()).a(this);
        f();
    }

    public final en3 h() {
        return (en3) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return uo3.c.a(getClass()).c(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c = uo3.c.a(getClass()).c(this);
        this.zza = c;
        return c;
    }

    public final en3 i() {
        en3 en3Var = (en3) o(5);
        en3Var.e(this);
        return en3Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int d = uo3.c.a(getClass()).d(this);
            if (d >= 0) {
                return d;
            }
            ch2.b(String.valueOf(d).length() + 42, d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = uo3.c.a(getClass()).d(this);
        if (d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d2;
            return d2;
        }
        ch2.b(String.valueOf(d2).length() + 42, d2);
        return 0;
    }

    public abstract Object o(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = mo3.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        mo3.b(this, sb, 0);
        return sb.toString();
    }
}
