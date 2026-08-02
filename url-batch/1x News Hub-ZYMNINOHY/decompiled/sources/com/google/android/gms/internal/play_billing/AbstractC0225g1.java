package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.play_billing.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0225g1 extends S0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected H1 zzc;
    private int zzd;

    public AbstractC0225g1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = H1.f;
    }

    public static AbstractC0225g1 h(Class cls) {
        Map map = zzb;
        AbstractC0225g1 abstractC0225g1 = (AbstractC0225g1) map.get(cls);
        if (abstractC0225g1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0225g1 = (AbstractC0225g1) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0225g1 != null) {
            return abstractC0225g1;
        }
        AbstractC0225g1 abstractC0225g12 = (AbstractC0225g1) ((AbstractC0225g1) M1.f(cls)).d(6);
        if (abstractC0225g12 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC0225g12);
        return abstractC0225g12;
    }

    public static Object i(Method method, S0 s02, Object... objArr) {
        try {
            return method.invoke(s02, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void k(Class cls, AbstractC0225g1 abstractC0225g1) {
        abstractC0225g1.j();
        zzb.put(cls, abstractC0225g1);
    }

    public static final boolean m(AbstractC0225g1 abstractC0225g1, boolean z) {
        byte byteValue = ((Byte) abstractC0225g1.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i3 = A1.f2703c.a(abstractC0225g1.getClass()).i(abstractC0225g1);
        if (z) {
            abstractC0225g1.d(2);
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int a(D1 d12) {
        if (c()) {
            int c3 = d12.c(this);
            if (c3 >= 0) {
                return c3;
            }
            throw new IllegalStateException(AbstractC0033i.h(c3, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int c4 = d12.c(this);
        if (c4 < 0) {
            throw new IllegalStateException(AbstractC0033i.h(c4, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | c4;
        return c4;
    }

    public final boolean c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object d(int i3);

    public final int e() {
        if (c()) {
            int c3 = A1.f2703c.a(getClass()).c(this);
            if (c3 >= 0) {
                return c3;
            }
            throw new IllegalStateException(AbstractC0033i.h(c3, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int c4 = A1.f2703c.a(getClass()).c(this);
        if (c4 < 0) {
            throw new IllegalStateException(AbstractC0033i.h(c4, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | c4;
        return c4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A1.f2703c.a(getClass()).f(this, (AbstractC0225g1) obj);
    }

    public final AbstractC0222f1 f() {
        return (AbstractC0222f1) d(5);
    }

    public final AbstractC0222f1 g() {
        AbstractC0222f1 abstractC0222f1 = (AbstractC0222f1) d(5);
        if (!abstractC0222f1.f2859a.equals(this)) {
            if (!abstractC0222f1.f2860b.c()) {
                AbstractC0225g1 abstractC0225g1 = (AbstractC0225g1) abstractC0222f1.f2859a.d(4);
                A1.f2703c.a(abstractC0225g1.getClass()).d(abstractC0225g1, abstractC0222f1.f2860b);
                abstractC0222f1.f2860b = abstractC0225g1;
            }
            AbstractC0225g1 abstractC0225g12 = abstractC0222f1.f2860b;
            A1.f2703c.a(abstractC0225g12.getClass()).d(abstractC0225g12, this);
        }
        return abstractC0222f1;
    }

    public final int hashCode() {
        if (c()) {
            return A1.f2703c.a(getClass()).e(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int e3 = A1.f2703c.a(getClass()).e(this);
        this.zza = e3;
        return e3;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC0269v1.f2943a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC0269v1.c(this, sb, 0);
        return sb.toString();
    }
}
