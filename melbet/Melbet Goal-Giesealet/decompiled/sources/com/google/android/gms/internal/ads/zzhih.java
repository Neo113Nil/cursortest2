package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhih;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhih<MessageType extends zzhih<MessageType, BuilderType>, BuilderType extends zzhib<MessageType, BuilderType>> extends zzhgk<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzhih<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzhkw zzt = zzhkw.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
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

    protected static zzhip zzbC() {
        return zzhii.zzd();
    }

    protected static zzhip zzbD(zzhip zzhipVar) {
        int size = zzhipVar.size();
        return zzhipVar.zzh(size + size);
    }

    protected static zzhis zzbE() {
        return zzhjg.zzg();
    }

    protected static zzhis zzbF(zzhis zzhisVar) {
        int size = zzhisVar.size();
        return zzhisVar.zzh(size + size);
    }

    protected static zzhio zzbG() {
        return zzhhy.zzd();
    }

    protected static zzhio zzbH(zzhio zzhioVar) {
        int size = zzhioVar.size();
        return zzhioVar.zzh(size + size);
    }

    protected static zzhik zzbI() {
        return zzhho.zzd();
    }

    protected static zzhik zzbJ(zzhik zzhikVar) {
        int size = zzhikVar.size();
        return zzhikVar.zzh(size + size);
    }

    protected static zzhij zzbK() {
        return zzhgr.zzd();
    }

    protected static zzhij zzbL(zzhij zzhijVar) {
        int size = zzhijVar.size();
        return zzhijVar.zzh(size + size);
    }

    protected static <E> zzhit<E> zzbM() {
        return zzhkd.zzd();
    }

    protected static <E> zzhit<E> zzbN(zzhit<E> zzhitVar) {
        int size = zzhitVar.size();
        return zzhitVar.zzh(size + size);
    }

    static <T extends zzhih<T, ?>> T zzbO(T t, zzhhg zzhhgVar, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) t.zzbg();
        try {
            zzhkk zzb2 = zzhkc.zza().zzb(t2.getClass());
            zzb2.zzg(t2, zzhhh.zza(zzhhgVar), zzhhrVar);
            zzb2.zzk(t2);
            return t2;
        } catch (zzhiw e) {
            if (e.zzb()) {
                throw new zzhiw(e);
            }
            throw e;
        } catch (zzhku e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhiw) {
                throw ((zzhiw) e3.getCause());
            }
            throw new zzhiw(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhiw) {
                throw ((zzhiw) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zzhih<T, ?>> T zzbP(T t, zzhhg zzhhgVar) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return (T) zzbO(t, zzhhgVar, zzhhr.zza);
    }

    protected static <T extends zzhih<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zzhhr zzhhrVar) throws zzhiw {
        zzhhg zzG;
        int i = zzhhg.zzf;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzG = zzhhg.zzG(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            if (byteBuffer.isDirect()) {
                int i2 = zzhhf.zza;
                if (zzhlc.zzb()) {
                    zzG = new zzhhf(byteBuffer, z, null);
                }
            }
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzG = zzhhg.zzG(bArr, 0, remaining, true);
        }
        T t2 = (T) zzbZ(t, zzG, zzhhrVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return (T) zzbQ(t, byteBuffer, zzhhr.zza);
    }

    protected static <T extends zzhih<T, ?>> T zzbS(T t, zzhhb zzhhbVar) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzbT(t, zzhhbVar, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbT(T t, zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzj(t, zzhhbVar, zzhhrVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbU(T t, byte[] bArr) throws zzhiw {
        int length = bArr.length;
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbV(T t, byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzhhrVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbW(T t, InputStream inputStream) throws zzhiw {
        zzhhg zzF = zzhhg.zzF(inputStream, 4096);
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzbO(t, zzF, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbX(T t, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzbO(t, zzhhg.zzF(inputStream, 4096), zzhhrVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzbY(T t, zzhhg zzhhgVar) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        return (T) zzbZ(t, zzhhgVar, zzhhr.zza);
    }

    protected static <T extends zzhih<T, ?>> T zzbZ(T t, zzhhg zzhhgVar, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzbO(t, zzhhgVar, zzhhrVar);
        zzi(t2);
        return t2;
    }

    static <T extends zzhih> T zzbt(Class<T> cls) {
        zzhih<?, ?> zzhihVar = zzd.get(cls);
        if (zzhihVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhihVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhihVar != null) {
            return zzhihVar;
        }
        zzhih<?, ?> zzbw = ((zzhih) zzhlc.zzc(cls)).zzbw();
        if (zzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzbw);
        return zzbw;
    }

    protected static <T extends zzhih> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    protected static Object zzbv(zzhjs zzhjsVar, String str, Object[] objArr) {
        return new zzhke(zzhjsVar, str, objArr);
    }

    public static <ContainingType extends zzhjs, Type> zzhif<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzhjs zzhjsVar, zzhim zzhimVar, int i, zzhli zzhliVar, Class cls) {
        return new zzhif<>(containingtype, type, zzhjsVar, new zzhie(zzhimVar, i, zzhliVar, false, false), cls);
    }

    public static <ContainingType extends zzhjs, Type> zzhif<ContainingType, Type> zzbz(ContainingType containingtype, zzhjs zzhjsVar, zzhim zzhimVar, int i, zzhli zzhliVar, boolean z, Class cls) {
        return new zzhif<>(containingtype, zzhkd.zzd(), zzhjsVar, new zzhie(zzhimVar, i, zzhliVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzhkw.zza()) {
            this.zzt = zzhkw.zzb();
        }
    }

    protected static <T extends zzhih<T, ?>> T zzca(T t, InputStream inputStream) throws zzhiw {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
        T t2 = (T) zzk(t, inputStream, zzhhr.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzhih<T, ?>> T zzcb(T t, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        T t2 = (T) zzk(t, inputStream, zzhhrVar);
        zzi(t2);
        return t2;
    }

    static /* synthetic */ boolean zzcd(zzhih zzhihVar, boolean z) {
        return zzg(zzhihVar, false);
    }

    private int zzd(zzhkk<?> zzhkkVar) {
        if (zzhkkVar != null) {
            return zzhkkVar.zze(this);
        }
        return zzhkc.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzhid<MessageType, BuilderType>, BuilderType, T> zzhif<MessageType, T> zze(zzhhp<MessageType, T> zzhhpVar) {
        return (zzhif) zzhhpVar;
    }

    private static final <T extends zzhih<T, ?>> boolean zzg(T t, boolean z) {
        byte byteValue = ((Byte) t.zzdh(zzhig.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzhkc.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdh(zzhig.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t, null);
        }
        return zzl;
    }

    private static <T extends zzhih<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzhhr zzhhrVar) throws zzhiw {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzhkk zzb2 = zzhkc.zza().zzb(t2.getClass());
            zzb2.zzj(t2, bArr, i, i + i2, new zzhgp(zzhhrVar));
            zzb2.zzk(t2);
            return t2;
        } catch (zzhiw e) {
            if (e.zzb()) {
                throw new zzhiw(e);
            }
            throw e;
        } catch (zzhku e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhiw) {
                throw ((zzhiw) e3.getCause());
            }
            throw new zzhiw(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzhih<T, ?>> T zzi(T t) throws zzhiw {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zzhih<T, ?>> T zzj(T t, zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        zzhhg zzp = zzhhbVar.zzp();
        T t2 = (T) zzbO(t, zzp, zzhhrVar);
        zzp.zzb(0);
        return t2;
    }

    private static <T extends zzhih<T, ?>> T zzk(T t, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzhhg zzF = zzhhg.zzF(new zzhgi(inputStream, zzhhg.zzM(read, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzF, zzhhrVar);
            zzF.zzb(0);
            return t2;
        } catch (zzhiw e) {
            if (e.zzb()) {
                throw new zzhiw(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzhiw(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhkc.zza().zzb(getClass()).zzb(this, (zzhih) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzhju.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    void zzaR(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    int zzaT(zzhkk zzhkkVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int zzd2 = zzd(zzhkkVar);
            zzaR(zzd2);
            return zzd2;
        }
        int zzd3 = zzd(zzhkkVar);
        if (zzd3 >= 0) {
            return zzd3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzd3).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(zzd3);
        throw new IllegalStateException(sb.toString());
    }

    boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    int zzaZ() {
        return this.zzq;
    }

    void zzba(int i) {
        this.zzq = i;
    }

    void zzbb() {
        this.zzq = 0;
    }

    boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public final zzhka<MessageType> zzbd() {
        return (zzhka) zzdh(zzhig.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdh(zzhig.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzdd() {
        return (BuilderType) zzdh(zzhig.NEW_BUILDER, null, null);
    }

    MessageType zzbg() {
        return (MessageType) zzdh(zzhig.NEW_MUTABLE_INSTANCE, null, null);
    }

    int zzbh() {
        return zzhkc.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected boolean zzbj(int i, zzhhg zzhhgVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zzhhgVar);
    }

    protected void zzbk(int i, int i2) {
        zzc();
        zzhkw zzhkwVar = this.zzt;
        zzhkwVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhkwVar.zzk(i << 3, Long.valueOf(i2));
    }

    protected void zzbl(int i, zzhhb zzhhbVar) {
        zzc();
        zzhkw zzhkwVar = this.zzt;
        zzhkwVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhkwVar.zzk((i << 3) | 2, zzhhbVar);
    }

    protected void zzbm() {
        zzhkc.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzhih<MessageType2, BuilderType2>, BuilderType2 extends zzhib<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdh(zzhig.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zzhih<MessageType2, BuilderType2>, BuilderType2 extends zzhib<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdh(zzhig.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public int zzbr() {
        return zzaT(null);
    }

    Object zzbs() throws Exception {
        return zzdh(zzhig.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzhkw zzhkwVar) {
        this.zzt = zzhkw.zzc(this.zzt, zzhkwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public void zzdc(zzhhm zzhhmVar) throws IOException {
        zzhkc.zza().zzb(getClass()).zzf(this, zzhhn.zza(zzhhmVar));
    }

    protected abstract Object zzdh(zzhig zzhigVar, Object obj, Object obj2);
}
