package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.fL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3199fL extends IK {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, AbstractC3199fL> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected XL zzt;

    public AbstractC3199fL() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = XL.f28633f;
    }

    public static Object j(Method method, IK ik, Object... objArr) {
        try {
            return method.invoke(ik, objArr);
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

    public static C4061vL k(InterfaceC3576mL interfaceC3576mL) {
        C4061vL c4061vL = (C4061vL) interfaceC3576mL;
        int i = c4061vL.f34757v;
        return c4061vL.A(i + i);
    }

    public static AbstractC3199fL l(AbstractC3199fL abstractC3199fL, S7.b bVar, YK yk) {
        AbstractC3199fL p6 = abstractC3199fL.p();
        try {
            OL a9 = IL.f25547c.a(p6.getClass());
            C4201y c4201y = (C4201y) bVar.f2982v;
            if (c4201y == null) {
                c4201y = new C4201y(bVar);
            }
            a9.c(p6, c4201y, yk);
            a9.h(p6);
            return p6;
        } catch (WL e6) {
            throw new C3845rL(e6.getMessage());
        } catch (C3845rL e9) {
            if (e9.f34009n) {
                throw new C3845rL(e9.getMessage(), e9);
            }
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C3845rL) {
                throw ((C3845rL) e10.getCause());
            }
            throw new C3845rL(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C3845rL) {
                throw ((C3845rL) e11.getCause());
            }
            throw e11;
        }
    }

    public static AbstractC3199fL m(AbstractC3199fL abstractC3199fL, SK sk, YK yk) {
        S7.b o9 = sk.o();
        AbstractC3199fL l9 = l(abstractC3199fL, o9, yk);
        o9.l(0);
        z(l9);
        return l9;
    }

    public static AbstractC3199fL n(AbstractC3199fL abstractC3199fL, byte[] bArr, YK yk) {
        AbstractC3199fL y6 = y(abstractC3199fL, bArr, bArr.length, yk);
        z(y6);
        return y6;
    }

    public static AbstractC3199fL t(Class cls) {
        Map<Class<?>, AbstractC3199fL> map = zzd;
        AbstractC3199fL abstractC3199fL = map.get(cls);
        if (abstractC3199fL == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3199fL = map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC3199fL != null) {
            return abstractC3199fL;
        }
        AbstractC3199fL abstractC3199fL2 = (AbstractC3199fL) ((AbstractC3199fL) AbstractC3036cM.e(cls)).w(6, null);
        if (abstractC3199fL2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC3199fL2);
        return abstractC3199fL2;
    }

    public static void u(Class cls, AbstractC3199fL abstractC3199fL) {
        abstractC3199fL.i();
        zzd.put(cls, abstractC3199fL);
    }

    public static final boolean x(AbstractC3199fL abstractC3199fL, boolean z8) {
        byte byteValue = ((Byte) abstractC3199fL.w(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f6 = IL.f25547c.a(abstractC3199fL.getClass()).f(abstractC3199fL);
        if (z8) {
            abstractC3199fL.w(2, true == f6 ? abstractC3199fL : null);
        }
        return f6;
    }

    public static AbstractC3199fL y(AbstractC3199fL abstractC3199fL, byte[] bArr, int i, YK yk) {
        if (i == 0) {
            return abstractC3199fL;
        }
        AbstractC3199fL p6 = abstractC3199fL.p();
        try {
            OL a9 = IL.f25547c.a(p6.getClass());
            a9.d(p6, bArr, 0, i, new LK(yk));
            a9.h(p6);
            return p6;
        } catch (WL e6) {
            throw new C3845rL(e6.getMessage());
        } catch (C3845rL e9) {
            if (e9.f34009n) {
                throw new C3845rL(e9.getMessage(), e9);
            }
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C3845rL) {
                throw ((C3845rL) e10.getCause());
            }
            throw new C3845rL(e10.getMessage(), e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void z(AbstractC3199fL abstractC3199fL) {
        if (abstractC3199fL != null && !x(abstractC3199fL, true)) {
            throw new C3845rL(new WL().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.IK
    public final int d(OL ol) {
        int i;
        int i4;
        if (h()) {
            if (ol == null) {
                i4 = IL.f25547c.a(getClass()).i(this);
            } else {
                i4 = ol.i(this);
            }
            if (i4 >= 0) {
                return i4;
            }
            throw new IllegalStateException(D.y.j(i4, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i4).length() + 42)));
        }
        int i9 = this.zzc;
        if ((i9 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i9 & Integer.MAX_VALUE;
        }
        if (ol == null) {
            i = IL.f25547c.a(getClass()).i(this);
        } else {
            i = ol.i(this);
        }
        g(i);
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return IL.f25547c.a(getClass()).g(this, (AbstractC3199fL) obj);
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException(D.y.j(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        this.zzc = i | (this.zzc & Integer.MIN_VALUE);
    }

    public final boolean h() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return IL.f25547c.a(getClass()).b(this);
        }
        if (this.zzq == 0) {
            this.zzq = IL.f25547c.a(getClass()).b(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final GL o() {
        return (GL) w(7, null);
    }

    public final AbstractC3199fL p() {
        return (AbstractC3199fL) w(4, null);
    }

    public final void q() {
        IL.f25547c.a(getClass()).h(this);
        i();
    }

    public final AbstractC3090dL r() {
        return (AbstractC3090dL) w(5, null);
    }

    public final AbstractC3090dL s() {
        AbstractC3090dL abstractC3090dL = (AbstractC3090dL) w(5, null);
        abstractC3090dL.k(this);
        return abstractC3090dL;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = BL.f24031a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        BL.b(this, sb, 0);
        return sb.toString();
    }

    public final void v(XK xk) {
        OL a9 = IL.f25547c.a(getClass());
        C2478Aq c2478Aq = xk.f28632b;
        if (c2478Aq == null) {
            c2478Aq = new C2478Aq(xk);
        }
        a9.j(this, c2478Aq);
    }

    public abstract Object w(int i, AbstractC3199fL abstractC3199fL);
}
