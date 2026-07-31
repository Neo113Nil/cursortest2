package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzana {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    private static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final double zza(Object obj, long j4) {
            return Double.longBitsToDouble(zze(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final float zzb(Object obj, long j4) {
            return Float.intBitsToFloat(zzd(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final boolean zzc(Object obj, long j4) {
            return zzana.zza ? zzana.zzf(obj, j4) : zzana.zzg(obj, j4);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, boolean z4) {
            if (zzana.zza) {
                zzana.zza(obj, j4, z4);
            } else {
                zzana.zzb(obj, j4, z4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, byte b4) {
            if (!zzana.zza) {
                zzana.zzd(obj, j4, b4);
            } else {
                zzana.zzc(obj, j4, b4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, double d4) {
            zza(obj, j4, Double.doubleToLongBits(d4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, float f4) {
            zza(obj, j4, Float.floatToIntBits(f4));
        }
    }

    private static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final double zza(Object obj, long j4) {
            return Double.longBitsToDouble(zze(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final float zzb(Object obj, long j4) {
            return Float.intBitsToFloat(zzd(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final boolean zzc(Object obj, long j4) {
            return zzana.zza ? zzana.zzf(obj, j4) : zzana.zzg(obj, j4);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, boolean z4) {
            if (zzana.zza) {
                zzana.zza(obj, j4, z4);
            } else {
                zzana.zzb(obj, j4, z4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, byte b4) {
            if (!zzana.zza) {
                zzana.zzd(obj, j4, b4);
            } else {
                zzana.zzc(obj, j4, b4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, double d4) {
            zza(obj, j4, Double.doubleToLongBits(d4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object obj, long j4, float f4) {
            zza(obj, j4, Float.floatToIntBits(f4));
        }
    }

    private static abstract class zzc {
        Unsafe zza;

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j4);

        public abstract void zza(Object obj, long j4, byte b4);

        public abstract void zza(Object obj, long j4, double d4);

        public abstract void zza(Object obj, long j4, float f4);

        public final void zza(Object obj, long j4, int i4) {
            this.zza.putInt(obj, j4, i4);
        }

        public abstract void zza(Object obj, long j4, boolean z4);

        public abstract float zzb(Object obj, long j4);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzana.zze() != null;
            } catch (Throwable th) {
                zzana.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j4);

        public final int zzd(Object obj, long j4) {
            return this.zza.getInt(obj, j4);
        }

        public final long zze(Object obj, long j4) {
            return this.zza.getLong(obj, j4);
        }

        public final void zza(Object obj, long j4, long j5) {
            this.zza.putLong(obj, j4, j5);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzana.zza(th);
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        zzc zzcVar;
        Field zze2;
        Unsafe zzb2 = zzb();
        zzb = zzb2;
        zzc = zzait.zza();
        boolean zzd2 = zzd(Long.TYPE);
        zzd = zzd2;
        boolean zzd3 = zzd(Integer.TYPE);
        zze = zzd3;
        if (zzb2 != null) {
            if (zzd2) {
                zzcVar = new zza(zzb2);
            } else if (zzd3) {
                zzcVar = new zzb(zzb2);
            }
            zzf = zzcVar;
            zzg = zzcVar != null ? false : zzcVar.zzb();
            zzh = zzcVar != null ? false : zzcVar.zza();
            zzi = zzb(byte[].class);
            zzb(boolean[].class);
            zzc(boolean[].class);
            zzb(int[].class);
            zzc(int[].class);
            zzb(long[].class);
            zzc(long[].class);
            zzb(float[].class);
            zzc(float[].class);
            zzb(double[].class);
            zzc(double[].class);
            zzb(Object[].class);
            zzc(Object[].class);
            zze2 = zze();
            if (zze2 != null && zzcVar != null) {
                zzcVar.zza.objectFieldOffset(zze2);
            }
            zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        zzcVar = null;
        zzf = zzcVar;
        zzg = zzcVar != null ? false : zzcVar.zzb();
        zzh = zzcVar != null ? false : zzcVar.zza();
        zzi = zzb(byte[].class);
        zzb(boolean[].class);
        zzc(boolean[].class);
        zzb(int[].class);
        zzc(int[].class);
        zzb(long[].class);
        zzc(long[].class);
        zzb(float[].class);
        zzc(float[].class);
        zzb(double[].class);
        zzc(double[].class);
        zzb(Object[].class);
        zzc(Object[].class);
        zze2 = zze();
        if (zze2 != null) {
            zzcVar.zza.objectFieldOffset(zze2);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzana() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static long zzd(Object obj, long j4) {
        return zzf.zze(obj, j4);
    }

    static Object zze(Object obj, long j4) {
        return zzf.zza.getObject(obj, j4);
    }

    static /* synthetic */ boolean zzf(Object obj, long j4) {
        return ((byte) (zzc(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j4) {
        return ((byte) (zzc(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j4) {
        return zzf.zzc(obj, j4);
    }

    static float zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        zza(obj, j5, ((255 & b4) << i4) | (zzc(obj, j5) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i4))));
    }

    static double zza(Object obj, long j4) {
        return zzf.zza(obj, j4);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j4) {
        return zzf.zzd(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    static void zzc(Object obj, long j4, boolean z4) {
        zzf.zza(obj, j4, z4);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzamz());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int zzc2 = zzc(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        zza(obj, j5, ((255 & b4) << i4) | (zzc2 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i4))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzana.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static /* synthetic */ void zzb(Object obj, long j4, boolean z4) {
        zzd(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static boolean zzc() {
        return zzh;
    }

    static /* synthetic */ void zza(Object obj, long j4, boolean z4) {
        zzc(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static void zza(byte[] bArr, long j4, byte b4) {
        zzf.zza((Object) bArr, zzi + j4, b4);
    }

    static void zza(Object obj, long j4, double d4) {
        zzf.zza(obj, j4, d4);
    }

    static void zza(Object obj, long j4, float f4) {
        zzf.zza(obj, j4, f4);
    }

    static void zza(Object obj, long j4, int i4) {
        zzf.zza(obj, j4, i4);
    }

    static boolean zzd() {
        return zzg;
    }

    static void zza(Object obj, long j4, long j5) {
        zzf.zza(obj, j4, j5);
    }

    static void zza(Object obj, long j4, Object obj2) {
        zzf.zza.putObject(obj, j4, obj2);
    }
}
