package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z4;
        zzhh zzhhVar;
        boolean z5;
        Field zzy;
        zzhh zzhhVar2;
        Unsafe zzg2 = zzg();
        zzb = zzg2;
        zzc = zzdr.zza();
        Class cls = Long.TYPE;
        boolean zzs = zzs(cls);
        zzd = zzs;
        Class cls2 = Integer.TYPE;
        boolean zzs2 = zzs(cls2);
        zzhh zzhhVar3 = null;
        if (zzg2 != null) {
            if (zzs) {
                zzhhVar3 = new zzhg(zzg2);
            } else if (zzs2) {
                zzhhVar3 = new zzhf(zzg2);
            }
        }
        zze = zzhhVar3;
        if (zzhhVar3 != null) {
            try {
                Class<?> cls3 = zzhhVar3.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzy() != null) {
                z4 = true;
                zzf = z4;
                zzhhVar = zze;
                if (zzhhVar != null) {
                    try {
                        Class<?> cls4 = zzhhVar.zza.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z5 = true;
                    } catch (Throwable th2) {
                        zzh(th2);
                    }
                    zzg = z5;
                    zzw(byte[].class);
                    zzw(boolean[].class);
                    zzx(boolean[].class);
                    zzw(int[].class);
                    zzx(int[].class);
                    zzw(long[].class);
                    zzx(long[].class);
                    zzw(float[].class);
                    zzx(float[].class);
                    zzw(double[].class);
                    zzx(double[].class);
                    zzw(Object[].class);
                    zzx(Object[].class);
                    zzy = zzy();
                    if (zzy != null && (zzhhVar2 = zze) != null) {
                        zzhhVar2.zzk(zzy);
                    }
                    zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z5 = false;
                zzg = z5;
                zzw(byte[].class);
                zzw(boolean[].class);
                zzx(boolean[].class);
                zzw(int[].class);
                zzx(int[].class);
                zzw(long[].class);
                zzx(long[].class);
                zzw(float[].class);
                zzx(float[].class);
                zzw(double[].class);
                zzx(double[].class);
                zzw(Object[].class);
                zzx(Object[].class);
                zzy = zzy();
                if (zzy != null) {
                    zzhhVar2.zzk(zzy);
                }
                zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z4 = false;
        zzf = z4;
        zzhhVar = zze;
        if (zzhhVar != null) {
        }
        z5 = false;
        zzg = z5;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhi() {
    }

    static double zza(Object obj, long j4) {
        return zze.zza(obj, j4);
    }

    static float zzb(Object obj, long j4) {
        return zze.zzb(obj, j4);
    }

    static int zzc(Object obj, long j4) {
        return zze.zzi(obj, j4);
    }

    static long zzd(Object obj, long j4) {
        return zze.zzj(obj, j4);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    static Object zzf(Object obj, long j4) {
        return zze.zzl(obj, j4);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhe());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j4, boolean z4) {
        long j5 = (-4) & j4;
        zzhh zzhhVar = zze;
        int zzi = zzhhVar.zzi(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        zzhhVar.zzm(obj, j5, ((z4 ? 1 : 0) << i4) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i4)) & zzi));
    }

    static /* synthetic */ void zzj(Object obj, long j4, boolean z4) {
        long j5 = (-4) & j4;
        zzhh zzhhVar = zze;
        int i4 = (((int) j4) & 3) << 3;
        zzhhVar.zzm(obj, j5, ((z4 ? 1 : 0) << i4) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i4)) & zzhhVar.zzi(obj, j5)));
    }

    static void zzk(Object obj, long j4, boolean z4) {
        zze.zzc(obj, j4, z4);
    }

    static void zzl(Object obj, long j4, double d4) {
        zze.zzd(obj, j4, d4);
    }

    static void zzm(Object obj, long j4, float f4) {
        zze.zze(obj, j4, f4);
    }

    static void zzn(Object obj, long j4, int i4) {
        zze.zzm(obj, j4, i4);
    }

    static void zzo(Object obj, long j4, long j5) {
        zze.zzn(obj, j4, j5);
    }

    static void zzp(Object obj, long j4, Object obj2) {
        zze.zzo(obj, j4, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j4) {
        return ((byte) ((zze.zzi(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j4) {
        return ((byte) ((zze.zzi(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    static boolean zzs(Class cls) {
        int i4 = zzdr.zza;
        try {
            Class cls2 = zzc;
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

    static boolean zzt(Object obj, long j4) {
        return zze.zzf(obj, j4);
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i4 = zzdr.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, "address");
        if (zzz2 == null || zzz2.getType() != Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
