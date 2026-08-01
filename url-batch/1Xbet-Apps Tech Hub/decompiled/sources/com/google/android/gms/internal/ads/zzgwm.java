package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwi;
import com.google.android.gms.internal.ads.zzgwm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgwm<MessageType extends zzgwm<MessageType, BuilderType>, BuilderType extends zzgwi<MessageType, BuilderType>> extends zzgun<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgzh zzc = zzgzh.zzc();

    private final int zza(zzgyp zzgypVar) {
        return zzgye.zza().zzb(getClass()).zza(this);
    }

    static zzgwm zzaC(Class cls) {
        Map map = zzb;
        zzgwm zzgwmVar = (zzgwm) map.get(cls);
        if (zzgwmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgwmVar = (zzgwm) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgwmVar == null) {
            zzgwmVar = (zzgwm) ((zzgwm) zzgzq.zzg(cls)).zzb(6, null, null);
            if (zzgwmVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgwmVar);
        }
        return zzgwmVar;
    }

    protected static zzgwm zzaE(zzgwm zzgwmVar, zzgve zzgveVar) throws zzgwy {
        zzgvy zzgvyVar = zzgvy.zza;
        zzgvm zzl = zzgveVar.zzl();
        zzgwm zzaD = zzgwmVar.zzaD();
        try {
            zzgyp zzb2 = zzgye.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgvn.zzq(zzl), zzgvyVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgwy e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgwy e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgwy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgzf e3) {
            zzgwy zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgwy) {
                throw ((zzgwy) e4.getCause());
            }
            zzgwy zzgwyVar = new zzgwy(e4);
            zzgwyVar.zzh(zzaD);
            throw zzgwyVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgwy) {
                throw ((zzgwy) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgwm zzaF(zzgwm zzgwmVar, byte[] bArr) throws zzgwy {
        zzgwm zzd = zzd(zzgwmVar, bArr, 0, bArr.length, zzgvy.zza);
        zzc(zzd);
        return zzd;
    }

    protected static zzgwm zzaG(zzgwm zzgwmVar, zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        zzgvm zzl = zzgveVar.zzl();
        zzgwm zzaD = zzgwmVar.zzaD();
        try {
            zzgyp zzb2 = zzgye.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgvn.zzq(zzl), zzgvyVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgwy e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgwy e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgwy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgzf e3) {
            zzgwy zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgwy) {
                throw ((zzgwy) e4.getCause());
            }
            zzgwy zzgwyVar = new zzgwy(e4);
            zzgwyVar.zzh(zzaD);
            throw zzgwyVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgwy) {
                throw ((zzgwy) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgwm zzaH(zzgwm zzgwmVar, InputStream inputStream, zzgvy zzgvyVar) throws zzgwy {
        zzgvm zzH = zzgvm.zzH(inputStream, 4096);
        zzgwm zzaD = zzgwmVar.zzaD();
        try {
            zzgyp zzb2 = zzgye.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgvn.zzq(zzH), zzgvyVar);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgwy e) {
            e = e;
            if (e.zzl()) {
                e = new zzgwy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgzf e2) {
            zzgwy zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgwy) {
                throw ((zzgwy) e3.getCause());
            }
            zzgwy zzgwyVar = new zzgwy(e3);
            zzgwyVar.zzh(zzaD);
            throw zzgwyVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgwy) {
                throw ((zzgwy) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzgwm zzaI(zzgwm zzgwmVar, byte[] bArr, zzgvy zzgvyVar) throws zzgwy {
        zzgwm zzd = zzd(zzgwmVar, bArr, 0, bArr.length, zzgvyVar);
        zzc(zzd);
        return zzd;
    }

    protected static zzgwr zzaJ() {
        return zzgwn.zzf();
    }

    protected static zzgwr zzaK(zzgwr zzgwrVar) {
        int size = zzgwrVar.size();
        return zzgwrVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzgwu zzaL() {
        return zzgxl.zzf();
    }

    protected static zzgwu zzaM(zzgwu zzgwuVar) {
        int size = zzgwuVar.size();
        return zzgwuVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzgwv zzaN() {
        return zzgyf.zze();
    }

    protected static zzgwv zzaO(zzgwv zzgwvVar) {
        int size = zzgwvVar.size();
        return zzgwvVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaQ(Method method, Object obj, Object... objArr) {
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

    protected static Object zzaR(zzgxw zzgxwVar, String str, Object[] objArr) {
        return new zzgyg(zzgxwVar, str, objArr);
    }

    protected static void zzaU(Class cls, zzgwm zzgwmVar) {
        zzgwmVar.zzaT();
        zzb.put(cls, zzgwmVar);
    }

    private static zzgwm zzc(zzgwm zzgwmVar) throws zzgwy {
        if (zzgwmVar == null || zzgwmVar.zzaX()) {
            return zzgwmVar;
        }
        zzgwy zza = new zzgzf(zzgwmVar).zza();
        zza.zzh(zzgwmVar);
        throw zza;
    }

    private static zzgwm zzd(zzgwm zzgwmVar, byte[] bArr, int i, int i2, zzgvy zzgvyVar) throws zzgwy {
        zzgwm zzaD = zzgwmVar.zzaD();
        try {
            zzgyp zzb2 = zzgye.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i2, new zzguq(zzgvyVar));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgwy e) {
            e = e;
            if (e.zzl()) {
                e = new zzgwy(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgzf e2) {
            zzgwy zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgwy) {
                throw ((zzgwy) e3.getCause());
            }
            zzgwy zzgwyVar = new zzgwy(e3);
            zzgwyVar.zzh(zzaD);
            throw zzgwyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgwy zzj = zzgwy.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgye.zza().zzb(getClass()).zzj(this, (zzgwm) obj);
    }

    public final int hashCode() {
        if (zzaY()) {
            return zzay();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzay = zzay();
        this.zza = zzay;
        return zzay;
    }

    public final String toString() {
        return zzgxy.zza(this, super.toString());
    }

    protected final zzgwi zzaA() {
        return (zzgwi) zzb(5, null, null);
    }

    public final zzgwi zzaB() {
        zzgwi zzgwiVar = (zzgwi) zzb(5, null, null);
        zzgwiVar.zzaj(this);
        return zzgwiVar;
    }

    final zzgwm zzaD() {
        return (zzgwm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final /* synthetic */ zzgxv zzaP() {
        return (zzgwi) zzb(5, null, null);
    }

    protected final void zzaS() {
        zzgye.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    final void zzaT() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzaV(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final void zzaW(zzgvt zzgvtVar) throws IOException {
        zzgye.zza().zzb(getClass()).zzm(this, zzgvu.zza(zzgvtVar));
    }

    public final boolean zzaX() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgye.zza().zzb(getClass()).zzk(this);
        if (!booleanValue) {
            return zzk;
        }
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgun
    final int zzat(zzgyp zzgypVar) {
        if (zzaY()) {
            int zza = zzgypVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzgypVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int zzay() {
        return zzgye.zza().zzb(getClass()).zzb(this);
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final /* synthetic */ zzgxw zzbg() {
        return (zzgwm) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final int zzaz() {
        int i;
        if (zzaY()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }
}
