package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzibr<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzw<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzibr<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzieg zzt = zzieg.zza();

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

    protected static zzibz zzbC() {
        return zzibs.zzd();
    }

    protected static zzibz zzbD(zzibz zzibzVar) {
        int size = zzibzVar.size();
        return zzibzVar.zzh(size + size);
    }

    protected static zzicc zzbE() {
        return zzicq.zzg();
    }

    protected static zzicc zzbF(zzicc zziccVar) {
        int size = zziccVar.size();
        return zziccVar.zzh(size + size);
    }

    protected static zziby zzbG() {
        return zzibi.zzd();
    }

    protected static zziby zzbH(zziby zzibyVar) {
        int size = zzibyVar.size();
        return zzibyVar.zzh(size + size);
    }

    protected static zzibu zzbI() {
        return zziay.zzd();
    }

    protected static zzibu zzbJ(zzibu zzibuVar) {
        int size = zzibuVar.size();
        return zzibuVar.zzh(size + size);
    }

    protected static zzibt zzbK() {
        return zziad.zzd();
    }

    protected static zzibt zzbL(zzibt zzibtVar) {
        int size = zzibtVar.size();
        return zzibtVar.zzh(size + size);
    }

    protected static <E> zzicd<E> zzbM() {
        return zzidn.zzd();
    }

    protected static <E> zzicd<E> zzbN(zzicd<E> zzicdVar) {
        int size = zzicdVar.size();
        return zzicdVar.zzh(size + size);
    }

    static <T extends zzibr<T, ?>> T zzbO(T t, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t2 = (T) t.zzbg();
        try {
            zzidu zzb2 = zzidm.zza().zzb(t2.getClass());
            zzb2.zzg(t2, zziar.zza(zziaqVar), zzibbVar);
            zzb2.zzk(t2);
            return t2;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (zziee e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzicg) {
                throw ((zzicg) e3.getCause());
            }
            throw new zzicg(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzicg) {
                throw ((zzicg) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zzibr<T, ?>> T zzbP(T t, zziaq zziaqVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (T) zzbO(t, zziaqVar, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
        zziaq zzG;
        int i = zziaq.zze;
        if (byteBuffer.hasArray()) {
            zzG = zziaq.zzG(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzG = zziaq.zzG(bArr, 0, remaining, true);
        }
        T t2 = (T) zzbZ(t, zzG, zzibbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (T) zzbQ(t, byteBuffer, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbS(T t, zzian zzianVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzbT(t, zzianVar, zzibb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbT(T t, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzj(t, zzianVar, zzibbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbU(T t, byte[] bArr) throws zzicg {
        int length = bArr.length;
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzibb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbV(T t, byte[] bArr, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzibbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbW(T t, InputStream inputStream) throws zzicg {
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzbO(t, zzF, zzibb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbX(T t, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzbO(t, zziaq.zzF(inputStream, 4096), zzibbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzbY(T t, zziaq zziaqVar) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        return (T) zzbZ(t, zziaqVar, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbZ(T t, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzbO(t, zziaqVar, zzibbVar);
        zzi(t2);
        return t2;
    }

    static <T extends zzibr> T zzbt(Class<T> cls) {
        zzibr<?, ?> zzibrVar = zzd.get(cls);
        if (zzibrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzibrVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzibrVar != null) {
            return zzibrVar;
        }
        zzibr<?, ?> zzbw = ((zzibr) zziem.zzc(cls)).zzbw();
        if (zzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzbw);
        return zzbw;
    }

    protected static <T extends zzibr> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    protected static Object zzbv(zzidc zzidcVar, String str, Object[] objArr) {
        return new zzido(zzidcVar, str, objArr);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzidc zzidcVar, zzibw zzibwVar, int i, zzies zziesVar, Class cls) {
        return new zzibp<>(containingtype, type, zzidcVar, new zzibo(zzibwVar, i, zziesVar, false, false), cls);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzbz(ContainingType containingtype, zzidc zzidcVar, zzibw zzibwVar, int i, zzies zziesVar, boolean z, Class cls) {
        return new zzibp<>(containingtype, zzidn.zzd(), zzidcVar, new zzibo(zzibwVar, i, zziesVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzieg.zza()) {
            this.zzt = zzieg.zzb();
        }
    }

    protected static <T extends zzibr<T, ?>> T zzca(T t, InputStream inputStream) throws zzicg {
        int i = zzibb.zzb;
        int i2 = zziaa.zza;
        T t2 = (T) zzk(t, inputStream, zzibb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzibr<T, ?>> T zzcb(T t, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t2 = (T) zzk(t, inputStream, zzibbVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zzidu<?> zziduVar) {
        if (zziduVar != null) {
            return zziduVar.zze(this);
        }
        return zzidm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzibn<MessageType, BuilderType>, BuilderType, T> zzibp<MessageType, T> zze(zziaz<MessageType, T> zziazVar) {
        return (zzibp) zziazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzibr<T, ?>> boolean zzg(T t, boolean z) {
        byte byteValue = ((Byte) t.zzdc(zzibq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzidm.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(zzibq.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t, null);
        }
        return zzl;
    }

    private static <T extends zzibr<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzibb zzibbVar) throws zzicg {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzidu zzb2 = zzidm.zza().zzb(t2.getClass());
            zzb2.zzj(t2, bArr, i, i + i2, new zziab(zzibbVar));
            zzb2.zzk(t2);
            return t2;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (zziee e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzicg) {
                throw ((zzicg) e3.getCause());
            }
            throw new zzicg(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzibr<T, ?>> T zzi(T t) throws zzicg {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zzibr<T, ?>> T zzj(T t, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zziaq zzm = zzianVar.zzm();
        T t2 = (T) zzbO(t, zzm, zzibbVar);
        zzm.zzb(0);
        return t2;
    }

    private static <T extends zzibr<T, ?>> T zzk(T t, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zziaq zzF = zziaq.zzF(new zzhzu(inputStream, zziaq.zzM(read, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzF, zzibbVar);
            zzF.zzb(0);
            return t2;
        } catch (zzicg e) {
            if (e.zzb()) {
                throw new zzicg(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzicg(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzidm.zza().zzb(getClass()).zzb(this, (zzibr) obj);
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
        return zzide.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
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

    @Override // com.google.android.gms.internal.ads.zzhzw
    int zzaT(zzidu zziduVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int zzd2 = zzd(zziduVar);
            zzaR(zzd2);
            return zzd2;
        }
        int zzd3 = zzd(zziduVar);
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

    @Override // com.google.android.gms.internal.ads.zzidc
    public final zzidk<MessageType> zzbd() {
        return (zzidk) zzdc(zzibq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzibq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    MessageType zzbg() {
        return (MessageType) zzdc(zzibq.NEW_MUTABLE_INSTANCE, null, null);
    }

    int zzbh() {
        return zzidm.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected boolean zzbj(int i, zziaq zziaqVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zziaqVar);
    }

    protected void zzbk(int i, int i2) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk(i << 3, Long.valueOf(i2));
    }

    protected void zzbl(int i, zzian zzianVar) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziegVar.zzk((i << 3) | 2, zzianVar);
    }

    protected void zzbm() {
        zzidm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public int zzbr() {
        return zzaT(null);
    }

    Object zzbs() throws Exception {
        return zzdc(zzibq.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzieg zziegVar) {
        this.zzt = zzieg.zzc(this.zzt, zziegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzcX(zziaw zziawVar) throws IOException {
        zzidm.zza().zzb(getClass()).zzf(this, zziax.zza(zziawVar));
    }

    protected abstract Object zzdc(zzibq zzibqVar, Object obj, Object obj2);
}
