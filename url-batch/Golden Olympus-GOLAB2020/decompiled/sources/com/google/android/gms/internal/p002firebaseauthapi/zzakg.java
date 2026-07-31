package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzakg.zzb;
import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzakg<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzain<MessageType, BuilderType> {
    private static Map<Class<?>, zzakg<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamy zzb = zzamy.zzc();

    protected static class zza<T extends zzakg<T, ?>> extends zzair<T> {
        public zza(T t4) {
        }
    }

    static final class zzc implements zzaka<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzanh zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzank zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzalm zza(zzalm zzalmVar, zzaln zzalnVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzals zza(zzals zzalsVar, zzals zzalsVar2) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzakg<MessageType, BuilderType> implements zzalp {
        protected zzajy<zzc> zzc = zzajy.zzb();

        final zzajy<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzajy) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    public static class zzf<ContainingType extends zzaln, Type> extends zzajs<ContainingType, Type> {
    }

    static /* synthetic */ boolean zza(zzakg zzakgVar, boolean z4) {
        return zzb(zzakgVar, false);
    }

    private final int zzb(zzamc<?> zzamcVar) {
        return zzamcVar == null ? zzaly.zza().zza((zzaly) this).zza(this) : zzamcVar.zza(this);
    }

    protected static <E> zzakn<E> zzp() {
        return zzamb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaly.zza().zza((zzaly) this).zzb(this, (zzakg) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzw()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzalo.zza(this, super.toString());
    }

    protected abstract Object zza(int i4, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    final int zzi() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final int zzl() {
        return zza((zzamc) null);
    }

    protected final <MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    final MessageType zzo() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final /* synthetic */ zzalm zzq() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final /* synthetic */ zzalm zzr() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final /* synthetic */ zzaln zzs() {
        return (zzakg) zza(zze.zzf, (Object) null, (Object) null);
    }

    protected final void zzt() {
        zzaly.zza().zza((zzaly) this).zzd(this);
        zzu();
    }

    final void zzu() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final boolean zzv() {
        return zzb(this, true);
    }

    final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    private final int zza() {
        return zzaly.zza().zza((zzaly) this).zzb(this);
    }

    private static <T extends zzakg<T, ?>> T zzb(T t4, zzaiw zzaiwVar, zzajv zzajvVar) {
        zzaji zzc2 = zzaiwVar.zzc();
        T t5 = (T) zza(t4, zzc2, zzajvVar);
        zzc2.zzc(0);
        return t5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    final int zza(zzamc zzamcVar) {
        if (zzw()) {
            int zzb2 = zzb((zzamc<?>) zzamcVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int zzb3 = zzb((zzamc<?>) zzamcVar);
        zzb(zzb3);
        return zzb3;
    }

    public static abstract class zzb<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzaip<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzw()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzf();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzw()) {
                zzh();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
        /* renamed from: zzb */
        public final /* synthetic */ zzaip clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzv()) {
                return messagetype;
            }
            throw new zzamw(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzw()) {
                return this.zza;
            }
            this.zza.zzt();
            return this.zza;
        }

        protected final void zzg() {
            if (this.zza.zzw()) {
                return;
            }
            zzh();
        }

        protected void zzh() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
        public final /* synthetic */ zzaln zzs() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
        public final boolean zzv() {
            return zzakg.zza((zzakg) this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaly.zza().zza((zzaly) messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    final void zzb(int i4) {
        if (i4 >= 0) {
            this.zzd = (i4 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i4);
        }
    }

    private static final <T extends zzakg<T, ?>> boolean zzb(T t4, boolean z4) {
        byte byteValue = ((Byte) t4.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzaly.zza().zza((zzaly) t4).zze(t4);
        if (z4) {
            t4.zza(zze.zzb, zze2 ? t4 : null, null);
        }
        return zze2;
    }

    private static <T extends zzakg<T, ?>> T zza(T t4) {
        if (t4 == null || zzb(t4, true)) {
            return t4;
        }
        zzakm zza2 = new zzamw(t4).zza();
        zza2.getClass();
        throw zza2;
    }

    static <T extends zzakg<?, ?>> T zza(Class<T> cls) {
        T t4 = (T) zzc.get(cls);
        if (t4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t4 = (T) zzc.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (t4 != null) {
            return t4;
        }
        T t5 = (T) ((zzakg) zzana.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
        if (t5 != null) {
            zzc.put(cls, t5);
            return t5;
        }
        throw new IllegalStateException();
    }

    protected static <T extends zzakg<T, ?>> T zza(T t4, zzaiw zzaiwVar, zzajv zzajvVar) {
        return (T) zza(zzb(t4, zzaiwVar, zzajvVar));
    }

    protected static <T extends zzakg<T, ?>> T zza(T t4, InputStream inputStream, zzajv zzajvVar) {
        zzaji zzajkVar;
        if (inputStream == null) {
            byte[] bArr = zzaki.zzb;
            zzajkVar = zzaji.zza(bArr, 0, bArr.length, false);
        } else {
            zzajkVar = new zzajk(inputStream);
        }
        return (T) zza(zza(t4, zzajkVar, zzajvVar));
    }

    protected static <T extends zzakg<T, ?>> T zza(T t4, byte[] bArr, zzajv zzajvVar) {
        return (T) zza(zza(t4, bArr, 0, bArr.length, zzajvVar));
    }

    private static <T extends zzakg<T, ?>> T zza(T t4, zzaji zzajiVar, zzajv zzajvVar) {
        T t5 = (T) t4.zzo();
        try {
            zzamc zza2 = zzaly.zza().zza((zzaly) t5);
            zza2.zza(t5, zzajm.zza(zzajiVar), zzajvVar);
            zza2.zzd(t5);
            return t5;
        } catch (zzakm e4) {
            if (e4.zzl()) {
                throw new zzakm(e4);
            }
            throw e4;
        } catch (zzamw e5) {
            zzakm zza3 = e5.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzakm) {
                throw ((zzakm) e6.getCause());
            }
            throw new zzakm(e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof zzakm) {
                throw ((zzakm) e7.getCause());
            }
            throw e7;
        }
    }

    private static <T extends zzakg<T, ?>> T zza(T t4, byte[] bArr, int i4, int i5, zzajv zzajvVar) {
        if (i5 == 0) {
            return t4;
        }
        T t5 = (T) t4.zzo();
        try {
            zzamc zza2 = zzaly.zza().zza((zzaly) t5);
            zza2.zza(t5, bArr, 0, i5, new zzaiv(zzajvVar));
            zza2.zzd(t5);
            return t5;
        } catch (zzakm e4) {
            if (e4.zzl()) {
                throw new zzakm(e4);
            }
            throw e4;
        } catch (zzamw e5) {
            zzakm zza3 = e5.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzakm) {
                throw ((zzakm) e6.getCause());
            }
            throw new zzakm(e6);
        } catch (IndexOutOfBoundsException unused) {
            zzakm zzj = zzakm.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    protected static <E> zzakn<E> zza(zzakn<E> zzaknVar) {
        return zzaknVar.zza(zzaknVar.size() << 1);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static Object zza(zzaln zzalnVar, String str, Object[] objArr) {
        return new zzama(zzalnVar, str, objArr);
    }

    protected static <T extends zzakg<?, ?>> void zza(Class<T> cls, T t4) {
        t4.zzu();
        zzc.put(cls, t4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final void zza(zzajo zzajoVar) {
        zzaly.zza().zza((zzaly) this).zza((zzamc) this, (zzanm) zzajq.zza(zzajoVar));
    }
}
