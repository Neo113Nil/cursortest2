package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.play_billing.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0334g1 extends S0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected H1 zzc;
    private int zzd;

    public AbstractC0334g1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = H1.f5055f;
    }

    public static AbstractC0334g1 h(Class cls) {
        Map map = zzb;
        AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) map.get(cls);
        if (abstractC0334g1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0334g1 = (AbstractC0334g1) map.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0334g1 == null) {
            abstractC0334g1 = (AbstractC0334g1) ((AbstractC0334g1) M1.h(cls)).d(6);
            if (abstractC0334g1 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC0334g1);
        }
        return abstractC0334g1;
    }

    public static Object i(Method method, S0 s02, Object... objArr) {
        try {
            return method.invoke(s02, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void k(Class cls, AbstractC0334g1 abstractC0334g1) {
        abstractC0334g1.j();
        zzb.put(cls, abstractC0334g1);
    }

    public static final boolean m(AbstractC0334g1 abstractC0334g1, boolean z) {
        byte byteValue = ((Byte) abstractC0334g1.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i2 = A1.f5019c.a(abstractC0334g1.getClass()).i(abstractC0334g1);
        if (z) {
            abstractC0334g1.d(2);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int a(D1 d12) {
        if (c()) {
            int c2 = d12.c(this);
            if (c2 >= 0) {
                return c2;
            }
            throw new IllegalStateException(AbstractC0279e.d(c2, "serialized size must be non-negative, was "));
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int c6 = d12.c(this);
        if (c6 < 0) {
            throw new IllegalStateException(AbstractC0279e.d(c6, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | c6;
        return c6;
    }

    public final boolean c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object d(int i2);

    public final int e() {
        int i2;
        if (c()) {
            i2 = A1.f5019c.a(getClass()).c(this);
            if (i2 < 0) {
                throw new IllegalStateException(AbstractC0279e.d(i2, "serialized size must be non-negative, was "));
            }
        } else {
            i2 = this.zzd & Integer.MAX_VALUE;
            if (i2 == Integer.MAX_VALUE) {
                i2 = A1.f5019c.a(getClass()).c(this);
                if (i2 < 0) {
                    throw new IllegalStateException(AbstractC0279e.d(i2, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i2;
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A1.f5019c.a(getClass()).g(this, (AbstractC0334g1) obj);
    }

    public final AbstractC0331f1 f() {
        return (AbstractC0331f1) d(5);
    }

    public final AbstractC0331f1 g() {
        AbstractC0331f1 abstractC0331f1 = (AbstractC0331f1) d(5);
        if (!abstractC0331f1.f5182a.equals(this)) {
            if (!abstractC0331f1.f5183b.c()) {
                AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) abstractC0331f1.f5182a.d(4);
                A1.f5019c.a(abstractC0334g1.getClass()).d(abstractC0334g1, abstractC0331f1.f5183b);
                abstractC0331f1.f5183b = abstractC0334g1;
            }
            AbstractC0334g1 abstractC0334g12 = abstractC0331f1.f5183b;
            A1.f5019c.a(abstractC0334g12.getClass()).d(abstractC0334g12, this);
        }
        return abstractC0331f1;
    }

    public final int hashCode() {
        if (c()) {
            return A1.f5019c.a(getClass()).e(this);
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int e3 = A1.f5019c.a(getClass()).e(this);
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
        char[] cArr = AbstractC0378v1.f5271a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC0378v1.c(this, sb, 0);
        return sb.toString();
    }
}
