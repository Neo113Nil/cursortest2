package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzhhw {
    private static final zzhhw zzd = new zzhhw(true);
    final zzhkr zza = new zzhkn();
    boolean zzb;
    boolean zzc;

    private zzhhw() {
    }

    public static zzhhw zza() {
        return zzd;
    }

    static void zzf(zzhhm zzhhmVar, zzhli zzhliVar, int i, Object obj) throws IOException {
        if (zzhliVar == zzhli.GROUP) {
            zzhhmVar.zzJ(i, 3);
            ((zzhjs) obj).zzdc(zzhhmVar);
            zzhhmVar.zzJ(i, 4);
            return;
        }
        zzhhmVar.zzJ(i, zzhliVar.zzb());
        zzhlj zzhljVar = zzhlj.INT;
        switch (zzhliVar) {
            case DOUBLE:
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zzhhmVar.zzu(((Long) obj).longValue());
                break;
            case UINT64:
                zzhhmVar.zzu(((Long) obj).longValue());
                break;
            case INT32:
                zzhhmVar.zzr(((Integer) obj).intValue());
                break;
            case FIXED64:
                zzhhmVar.zzv(((Long) obj).longValue());
                break;
            case FIXED32:
                zzhhmVar.zzt(((Integer) obj).intValue());
                break;
            case BOOL:
                zzhhmVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzhhb)) {
                    zzhhmVar.zzx((String) obj);
                    break;
                } else {
                    zzhhmVar.zzl((zzhhb) obj);
                    break;
                }
            case GROUP:
                ((zzhjs) obj).zzdc(zzhhmVar);
                break;
            case MESSAGE:
                zzhhmVar.zzp((zzhjs) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzhhb)) {
                    byte[] bArr = (byte[]) obj;
                    zzhhmVar.zzm(bArr, 0, bArr.length);
                    break;
                } else {
                    zzhhmVar.zzl((zzhhb) obj);
                    break;
                }
            case UINT32:
                zzhhmVar.zzs(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zzhil)) {
                    zzhhmVar.zzr(((Integer) obj).intValue());
                    break;
                } else {
                    zzhhmVar.zzr(((zzhil) obj).zza());
                    break;
                }
            case SFIXED32:
                zzhhmVar.zzt(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zzhhmVar.zzv(((Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                zzhhmVar.zzs((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                zzhhmVar.zzu((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int zzh(zzhli zzhliVar, int i, Object obj) {
        int zzA = zzhhm.zzA(i << 3);
        if (zzhliVar == zzhli.GROUP) {
            zzA += zzA;
        }
        return zzA + zzi(zzhliVar, obj);
    }

    static int zzi(zzhli zzhliVar, Object obj) {
        int zzc;
        int zzA;
        zzhli zzhliVar2 = zzhli.DOUBLE;
        zzhlj zzhljVar = zzhlj.INT;
        switch (zzhliVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzhhm.zzf;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzhhm.zzf;
                return 4;
            case INT64:
                return zzhhm.zzB(((Long) obj).longValue());
            case UINT64:
                return zzhhm.zzB(((Long) obj).longValue());
            case INT32:
                return zzhhm.zzB(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzhhm.zzf;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzhhm.zzf;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzhhm.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof zzhhb)) {
                    return zzhhm.zzC((String) obj);
                }
                int i6 = zzhhm.zzf;
                zzc = ((zzhhb) obj).zzc();
                zzA = zzhhm.zzA(zzc);
                break;
            case GROUP:
                return ((zzhjs) obj).zzbr();
            case MESSAGE:
                if (!(obj instanceof zzhjb)) {
                    return zzhhm.zzD((zzhjs) obj);
                }
                zzc = ((zzhjb) obj).zzb();
                zzA = zzhhm.zzA(zzc);
                break;
            case BYTES:
                if (!(obj instanceof zzhhb)) {
                    int i7 = zzhhm.zzf;
                    zzc = ((byte[]) obj).length;
                    zzA = zzhhm.zzA(zzc);
                    break;
                } else {
                    int i8 = zzhhm.zzf;
                    zzc = ((zzhhb) obj).zzc();
                    zzA = zzhhm.zzA(zzc);
                    break;
                }
            case UINT32:
                return zzhhm.zzA(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzhil ? zzhhm.zzB(((zzhil) obj).zza()) : zzhhm.zzB(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i9 = zzhhm.zzf;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i10 = zzhhm.zzf;
                return 8;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                return zzhhm.zzA((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((Long) obj).longValue();
                return zzhhm.zzB((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzA + zzc;
    }

    public static int zzj(zzhhv zzhhvVar, Object obj) {
        zzhli zzb = zzhhvVar.zzb();
        int zza = zzhhvVar.zza();
        if (!zzhhvVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzhhvVar.zze()) {
            int i2 = 0;
            while (i < size) {
                i2 += zzh(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzi(zzb, list.get(i));
            i++;
        }
        return zzhhm.zzA(zza << 3) + i3 + zzhhm.zzA(i3);
    }

    private static boolean zzk(Map.Entry entry) {
        zzhhv zzhhvVar = (zzhhv) entry.getKey();
        if (zzhhvVar.zzc() != zzhlj.MESSAGE) {
            return true;
        }
        if (!zzhhvVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhjt) {
            return ((zzhjt) obj).zzbi();
        }
        if (obj instanceof zzhjb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzA;
        int zzA2;
        zzhhv zzhhvVar = (zzhhv) entry.getKey();
        Object value = entry.getValue();
        if (zzhhvVar.zzc() != zzhlj.MESSAGE || zzhhvVar.zzd() || zzhhvVar.zze()) {
            return zzj(zzhhvVar, value);
        }
        if (value instanceof zzhjb) {
            int zza = ((zzhhv) entry.getKey()).zza();
            int zzA3 = zzhhm.zzA(8);
            i = zzA3 + zzA3;
            zzA = zzhhm.zzA(16) + zzhhm.zzA(zza);
            int zzA4 = zzhhm.zzA(24);
            int zzb = ((zzhjb) value).zzb();
            zzA2 = zzA4 + zzhhm.zzA(zzb) + zzb;
        } else {
            int zza2 = ((zzhhv) entry.getKey()).zza();
            int zzA5 = zzhhm.zzA(8);
            i = zzA5 + zzA5;
            zzA = zzhhm.zzA(16) + zzhhm.zzA(zza2);
            zzA2 = zzhhm.zzA(24) + zzhhm.zzD((zzhjs) value);
        }
        return i + zzA + zzA2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzhhv zzhhvVar, Object obj) {
        boolean z;
        zzhhvVar.zzb();
        byte[] bArr = zzhiu.zzb;
        obj.getClass();
        zzhli zzhliVar = zzhli.DOUBLE;
        zzhlj zzhljVar = zzhlj.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzhhb) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzhil)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhjs) || (obj instanceof zzhjb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhhw zzhhwVar = new zzhhw();
        zzhkr zzhkrVar = this.zza;
        int zzc = zzhkrVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzd2 = zzhkrVar.zzd(i);
            zzhhwVar.zzd((zzhhv) ((zzhko) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zzhkrVar.zze()) {
            zzhhwVar.zzd((zzhhv) entry.getKey(), entry.getValue());
        }
        zzhhwVar.zzc = this.zzc;
        return zzhhwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhhw) {
            return this.zza.equals(((zzhhw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzhkr zzhkrVar = this.zza;
        int zzc = zzhkrVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzhkrVar.zzd(i).getValue();
            if (value instanceof zzhih) {
                ((zzhih) value).zzbm();
            }
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhih) {
                ((zzhih) value2).zzbm();
            }
        }
        zzhkrVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzhkr zzhkrVar = this.zza;
        return zzhkrVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzhja(zzhkrVar.entrySet().iterator()) : zzhkrVar.entrySet().iterator();
    }

    public final void zzd(zzhhv zzhhvVar, Object obj) {
        if (!zzhhvVar.zzd()) {
            zzn(zzhhvVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzhhvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhjb) {
            this.zzc = true;
        }
        this.zza.put(zzhhvVar, obj);
    }

    public final boolean zze() {
        zzhkr zzhkrVar = this.zza;
        int zzc = zzhkrVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzhkrVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzhkr zzhkrVar = this.zza;
        int zzc = zzhkrVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzhkrVar.zzd(i2));
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    private zzhhw(boolean z) {
        zzb();
        zzb();
    }
}
