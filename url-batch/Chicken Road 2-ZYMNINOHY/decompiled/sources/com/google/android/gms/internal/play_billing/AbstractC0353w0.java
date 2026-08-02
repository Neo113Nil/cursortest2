package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.play_billing.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0353w0 extends AbstractC0320h0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected W0 zzc;
    private int zzd;

    public AbstractC0353w0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = W0.f5922f;
    }

    public static final boolean c(AbstractC0353w0 abstractC0353w0, boolean z) {
        byte byteValue = ((Byte) abstractC0353w0.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c4 = P0.f5897c.a(abstractC0353w0.getClass()).c(abstractC0353w0);
        if (z) {
            abstractC0353w0.d(2);
        }
        return c4;
    }

    public static AbstractC0353w0 h(Class cls) {
        Map map = zzb;
        AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) map.get(cls);
        if (abstractC0353w0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0353w0 = (AbstractC0353w0) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0353w0 != null) {
            return abstractC0353w0;
        }
        AbstractC0353w0 abstractC0353w02 = (AbstractC0353w0) ((AbstractC0353w0) AbstractC0303b1.g(cls)).d(6);
        if (abstractC0353w02 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC0353w02);
        return abstractC0353w02;
    }

    public static Object i(Method method, AbstractC0353w0 abstractC0353w0, Object... objArr) {
        try {
            return method.invoke(abstractC0353w0, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void k(Class cls, AbstractC0353w0 abstractC0353w0) {
        abstractC0353w0.j();
        zzb.put(cls, abstractC0353w0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0320h0
    public final int b(S0 s02) {
        if (m()) {
            int g4 = s02.g(this);
            if (g4 >= 0) {
                return g4;
            }
            throw new IllegalStateException(AbstractC0005f.j(g4, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int g5 = s02.g(this);
        if (g5 < 0) {
            throw new IllegalStateException(AbstractC0005f.j(g5, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | g5;
        return g5;
    }

    public abstract Object d(int i4);

    public final int e() {
        if (m()) {
            int g4 = P0.f5897c.a(getClass()).g(this);
            if (g4 >= 0) {
                return g4;
            }
            throw new IllegalStateException(AbstractC0005f.j(g4, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int g5 = P0.f5897c.a(getClass()).g(this);
        if (g5 < 0) {
            throw new IllegalStateException(AbstractC0005f.j(g5, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | g5;
        return g5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return P0.f5897c.a(getClass()).i(this, (AbstractC0353w0) obj);
    }

    public final AbstractC0351v0 f() {
        return (AbstractC0351v0) d(5);
    }

    public final AbstractC0351v0 g() {
        AbstractC0351v0 abstractC0351v0 = (AbstractC0351v0) d(5);
        if (!abstractC0351v0.f6023a.equals(this)) {
            if (!abstractC0351v0.f6024b.m()) {
                AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) abstractC0351v0.f6023a.d(4);
                P0.f5897c.a(abstractC0353w0.getClass()).d(abstractC0353w0, abstractC0351v0.f6024b);
                abstractC0351v0.f6024b = abstractC0353w0;
            }
            AbstractC0353w0 abstractC0353w02 = abstractC0351v0.f6024b;
            P0.f5897c.a(abstractC0353w02.getClass()).d(abstractC0353w02, this);
        }
        return abstractC0351v0;
    }

    public final int hashCode() {
        if (m()) {
            return P0.f5897c.a(getClass()).b(this);
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int b4 = P0.f5897c.a(getClass()).b(this);
        this.zza = b4;
        return b4;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean m() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L0.f5872a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        L0.c(this, sb, 0);
        return sb.toString();
    }
}
