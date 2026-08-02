package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzhaz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhay zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        boolean z;
        zzhay zzhayVar;
        boolean z2;
        Field zzE;
        long j;
        zzhay zzhayVar2;
        Unsafe zzi2 = zzi();
        zzc = zzi2;
        int i = zzgvz.zza;
        zzd = Memory.class;
        boolean zzy = zzy(Long.TYPE);
        zze = zzy;
        boolean zzy2 = zzy(Integer.TYPE);
        zzhay zzhayVar3 = null;
        if (zzi2 != null) {
            if (zzy) {
                zzhayVar3 = new zzhax(zzi2);
            } else if (zzy2) {
                zzhayVar3 = new zzhaw(zzi2);
            }
        }
        zzf = zzhayVar3;
        if (zzhayVar3 != null) {
            try {
                Class<?> cls = zzhayVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzj(th);
            }
            if (zzE() != null) {
                z = true;
                zzg = z;
                zzhayVar = zzf;
                if (zzhayVar != null) {
                    try {
                        Class<?> cls2 = zzhayVar.zza.getClass();
                        cls2.getMethod("objectFieldOffset", Field.class);
                        cls2.getMethod("arrayBaseOffset", Class.class);
                        cls2.getMethod("arrayIndexScale", Class.class);
                        cls2.getMethod("getInt", Object.class, Long.TYPE);
                        cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                        cls2.getMethod("getLong", Object.class, Long.TYPE);
                        Class<?> cls3 = Long.TYPE;
                        cls2.getMethod("putLong", Object.class, cls3, cls3);
                        cls2.getMethod("getObject", Object.class, Long.TYPE);
                        cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        zzj(th2);
                    }
                    zzh = z2;
                    zza = zzC(byte[].class);
                    zzC(boolean[].class);
                    zzD(boolean[].class);
                    zzC(int[].class);
                    zzD(int[].class);
                    zzC(long[].class);
                    zzD(long[].class);
                    zzC(float[].class);
                    zzD(float[].class);
                    zzC(double[].class);
                    zzD(double[].class);
                    zzC(Object[].class);
                    zzD(Object[].class);
                    zzE = zzE();
                    j = -1;
                    if (zzE != null && (zzhayVar2 = zzf) != null) {
                        j = zzhayVar2.zza.objectFieldOffset(zzE);
                    }
                    zzi = j;
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzh = z2;
                zza = zzC(byte[].class);
                zzC(boolean[].class);
                zzD(boolean[].class);
                zzC(int[].class);
                zzD(int[].class);
                zzC(long[].class);
                zzD(long[].class);
                zzC(float[].class);
                zzD(float[].class);
                zzC(double[].class);
                zzD(double[].class);
                zzC(Object[].class);
                zzD(Object[].class);
                zzE = zzE();
                j = -1;
                if (zzE != null) {
                    j = zzhayVar2.zza.objectFieldOffset(zzE);
                }
                zzi = j;
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzhayVar = zzf;
        if (zzhayVar != null) {
        }
        z2 = false;
        zzh = z2;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(Object[].class);
        zzD(Object[].class);
        zzE = zzE();
        j = -1;
        if (zzE != null) {
        }
        zzi = j;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhaz() {
    }

    static boolean zzA() {
        return zzh;
    }

    static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzgvz.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF != null) {
            return zzF;
        }
        Field zzF2 = zzF(Buffer.class, "address");
        if (zzF2 == null || zzF2.getType() != Long.TYPE) {
            return null;
        }
        return zzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b) {
        zzhay zzhayVar = zzf;
        long j2 = (-4) & j;
        int i = zzhayVar.zza.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zzhayVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        zzhay zzhayVar = zzf;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzhayVar.zza.putInt(obj, j2, ((255 & b) << i) | (zzhayVar.zza.getInt(obj, j2) & (~(255 << i))));
    }

    static byte zza(long j) {
        return zzf.zza(j);
    }

    static double zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static float zzc(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static long zze(ByteBuffer byteBuffer) {
        zzhay zzhayVar = zzf;
        return zzhayVar.zza.getLong(byteBuffer, zzi);
    }

    static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static Object zzh(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhav());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhaz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzo(long j, byte[] bArr, long j2, long j3) {
        zzf.zzd(j, bArr, j2, j3);
    }

    static void zzp(Object obj, long j, boolean z) {
        zzf.zze(obj, j, z);
    }

    static void zzq(byte[] bArr, long j, byte b) {
        zzf.zzf(bArr, zza + j, b);
    }

    static void zzr(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static void zzs(Object obj, long j, float f) {
        zzf.zzh(obj, j, f);
    }

    static void zzt(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static void zzu(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static void zzv(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzy(Class cls) {
        int i = zzgvz.zza;
        try {
            Class cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            Class cls3 = Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzz(Object obj, long j) {
        return zzf.zzi(obj, j);
    }
}
