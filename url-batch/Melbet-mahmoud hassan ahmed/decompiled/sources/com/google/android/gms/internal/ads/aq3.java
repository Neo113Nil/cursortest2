package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq3;
import com.google.android.gms.internal.ads.xp3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class aq3<MessageType extends aq3<MessageType, BuilderType>, BuilderType extends xp3<MessageType, BuilderType>> extends bo3<MessageType, BuilderType> {
    private static final Map<Object, aq3<?, ?>> zzb = new ConcurrentHashMap();
    protected xs3 zzc = xs3.c();
    protected int zzd = -1;

    protected static <T extends aq3<T, ?>> T A(T t6, uo3 uo3Var) {
        mp3 a7 = mp3.a();
        try {
            cp3 x6 = uo3Var.x();
            T t7 = (T) t6.E(4, null, null);
            try {
                es3 b7 = tr3.a().b(t7.getClass());
                b7.e(t7, dp3.T(x6), a7);
                b7.d(t7);
                try {
                    x6.A(0);
                    m(t7);
                    m(t7);
                    return t7;
                } catch (mq3 e7) {
                    e7.h(t7);
                    throw e7;
                }
            } catch (mq3 e8) {
                e = e8;
                if (e.l()) {
                    e = new mq3(e);
                }
                e.h(t7);
                throw e;
            } catch (IOException e9) {
                if (e9.getCause() instanceof mq3) {
                    throw ((mq3) e9.getCause());
                }
                mq3 mq3Var = new mq3(e9);
                mq3Var.h(t7);
                throw mq3Var;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof mq3) {
                    throw ((mq3) e10.getCause());
                }
                throw e10;
            }
        } catch (mq3 e11) {
            throw e11;
        }
    }

    protected static <T extends aq3<T, ?>> T B(T t6, byte[] bArr) {
        T t7 = (T) n(t6, bArr, 0, bArr.length, mp3.a());
        m(t7);
        return t7;
    }

    protected static <T extends aq3<T, ?>> T C(T t6, uo3 uo3Var, mp3 mp3Var) {
        try {
            cp3 x6 = uo3Var.x();
            T t7 = (T) t6.E(4, null, null);
            try {
                try {
                    es3 b7 = tr3.a().b(t7.getClass());
                    b7.e(t7, dp3.T(x6), mp3Var);
                    b7.d(t7);
                    try {
                        x6.A(0);
                        m(t7);
                        return t7;
                    } catch (mq3 e7) {
                        e7.h(t7);
                        throw e7;
                    }
                } catch (RuntimeException e8) {
                    if (e8.getCause() instanceof mq3) {
                        throw ((mq3) e8.getCause());
                    }
                    throw e8;
                }
            } catch (mq3 e9) {
                e = e9;
                if (e.l()) {
                    e = new mq3(e);
                }
                e.h(t7);
                throw e;
            } catch (IOException e10) {
                if (e10.getCause() instanceof mq3) {
                    throw ((mq3) e10.getCause());
                }
                mq3 mq3Var = new mq3(e10);
                mq3Var.h(t7);
                throw mq3Var;
            }
        } catch (mq3 e11) {
            throw e11;
        }
    }

    protected static <T extends aq3<T, ?>> T D(T t6, byte[] bArr, mp3 mp3Var) {
        T t7 = (T) n(t6, bArr, 0, bArr.length, mp3Var);
        m(t7);
        return t7;
    }

    private static <T extends aq3<T, ?>> T m(T t6) {
        if (t6 == null || t6.w()) {
            return t6;
        }
        mq3 mq3Var = new mq3(new vs3(t6).getMessage());
        mq3Var.h(t6);
        throw mq3Var;
    }

    static <T extends aq3<T, ?>> T n(T t6, byte[] bArr, int i7, int i8, mp3 mp3Var) {
        T t7 = (T) t6.E(4, null, null);
        try {
            es3 b7 = tr3.a().b(t7.getClass());
            b7.h(t7, bArr, 0, i8, new eo3(mp3Var));
            b7.d(t7);
            if (t7.zza == 0) {
                return t7;
            }
            throw new RuntimeException();
        } catch (mq3 e7) {
            e = e7;
            if (e.l()) {
                e = new mq3(e);
            }
            e.h(t7);
            throw e;
        } catch (IOException e8) {
            if (e8.getCause() instanceof mq3) {
                throw ((mq3) e8.getCause());
            }
            mq3 mq3Var = new mq3(e8);
            mq3Var.h(t7);
            throw mq3Var;
        } catch (IndexOutOfBoundsException unused) {
            mq3 j7 = mq3.j();
            j7.h(t7);
            throw j7;
        }
    }

    protected static fq3 o() {
        return bq3.k();
    }

    protected static fq3 p(fq3 fq3Var) {
        int size = fq3Var.size();
        return fq3Var.e(size == 0 ? 10 : size + size);
    }

    protected static iq3 q() {
        return zq3.k();
    }

    protected static <E> jq3<E> r() {
        return ur3.j();
    }

    protected static <E> jq3<E> s(jq3<E> jq3Var) {
        int size = jq3Var.size();
        return jq3Var.e(size == 0 ? 10 : size + size);
    }

    static Object t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object u(kr3 kr3Var, String str, Object[] objArr) {
        return new vr3(kr3Var, str, objArr);
    }

    protected static <T extends aq3> void v(Class<T> cls, T t6) {
        zzb.put(cls, t6);
    }

    static <T extends aq3> T z(Class<T> cls) {
        Map<Object, aq3<?, ?>> map = zzb;
        aq3<?, ?> aq3Var = map.get(cls);
        if (aq3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                aq3Var = map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (aq3Var == null) {
            aq3Var = (aq3) ((aq3) gt3.o(cls)).E(6, null, null);
            if (aq3Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, aq3Var);
        }
        return aq3Var;
    }

    protected abstract Object E(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.lr3
    public final /* synthetic */ kr3 a() {
        return (aq3) E(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.kr3
    public final void e(hp3 hp3Var) {
        tr3.a().b(getClass()).g(this, ip3.l(hp3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return tr3.a().b(getClass()).i(this, (aq3) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kr3
    public final /* synthetic */ jr3 f() {
        return (xp3) E(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.kr3
    public final int h() {
        int i7 = this.zzd;
        if (i7 != -1) {
            return i7;
        }
        int c7 = tr3.a().b(getClass()).c(this);
        this.zzd = c7;
        return c7;
    }

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int a7 = tr3.a().b(getClass()).a(this);
        this.zza = a7;
        return a7;
    }

    @Override // com.google.android.gms.internal.ads.kr3
    public final /* synthetic */ jr3 i() {
        xp3 xp3Var = (xp3) E(5, null, null);
        xp3Var.m(this);
        return xp3Var;
    }

    @Override // com.google.android.gms.internal.ads.bo3
    final int j() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.bo3
    final void l(int i7) {
        this.zzd = i7;
    }

    public final String toString() {
        return mr3.a(this, super.toString());
    }

    public final boolean w() {
        byte byteValue = ((Byte) E(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean j7 = tr3.a().b(getClass()).j(this);
        E(2, true != j7 ? null : this, null);
        return j7;
    }

    protected final <MessageType extends aq3<MessageType, BuilderType>, BuilderType extends xp3<MessageType, BuilderType>> BuilderType x() {
        return (BuilderType) E(5, null, null);
    }

    public final BuilderType y() {
        BuilderType buildertype = (BuilderType) E(5, null, null);
        buildertype.m(this);
        return buildertype;
    }
}
