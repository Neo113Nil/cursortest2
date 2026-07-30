package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.CL;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.consent_sdk.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4368o2 extends AbstractC4320c2 {
    private static final Map zzb = new ConcurrentHashMap();
    protected N2 zzc;
    private int zzd;

    public AbstractC4368o2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = N2.f35741e;
    }

    public static AbstractC4368o2 h(Class cls) {
        Map map = zzb;
        AbstractC4368o2 abstractC4368o2 = (AbstractC4368o2) map.get(cls);
        if (abstractC4368o2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4368o2 = (AbstractC4368o2) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC4368o2 != null) {
            return abstractC4368o2;
        }
        AbstractC4368o2 abstractC4368o22 = (AbstractC4368o2) ((AbstractC4368o2) T2.f(cls)).f(6);
        if (abstractC4368o22 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC4368o22);
        return abstractC4368o22;
    }

    public static Object i(Method method, AbstractC4320c2 abstractC4320c2, Object... objArr) {
        try {
            return method.invoke(abstractC4320c2, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
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

    public static void l(Class cls, AbstractC4368o2 abstractC4368o2) {
        abstractC4368o2.k();
        zzb.put(cls, abstractC4368o2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4320c2
    public final void a(C4344i2 c4344i2) {
        I2 a9 = F2.f35677c.a(getClass());
        C4399w2 c4399w2 = c4344i2.f35851b;
        if (c4399w2 == null) {
            c4399w2 = new C4399w2(c4344i2);
        }
        a9.d(this, c4399w2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4320c2
    public final int b(I2 i22) {
        if (e()) {
            int f6 = i22.f(this);
            if (f6 >= 0) {
                return f6;
            }
            throw new IllegalStateException(CL.i(f6, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f9 = i22.f(this);
        if (f9 < 0) {
            throw new IllegalStateException(CL.i(f9, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f9;
        return f9;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4320c2
    public final int c() {
        if (e()) {
            int f6 = F2.f35677c.a(getClass()).f(this);
            if (f6 >= 0) {
                return f6;
            }
            throw new IllegalStateException(CL.i(f6, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f9 = F2.f35677c.a(getClass()).f(this);
        if (f9 < 0) {
            throw new IllegalStateException(CL.i(f9, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f9;
        return f9;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return F2.f35677c.a(getClass()).c(this, (AbstractC4368o2) obj);
    }

    public abstract Object f(int i);

    public final AbstractC4364n2 g() {
        return (AbstractC4364n2) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return F2.f35677c.a(getClass()).b(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b9 = F2.f35677c.a(getClass()).b(this);
        this.zza = b9;
        return b9;
    }

    public final void j() {
        F2.f35677c.a(getClass()).a(this);
        k();
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = B2.f35654a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        B2.c(this, sb, 0);
        return sb.toString();
    }
}
