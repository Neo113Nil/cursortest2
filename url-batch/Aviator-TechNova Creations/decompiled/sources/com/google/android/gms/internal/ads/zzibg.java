package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzibg {
    private static final zzibg zzd = new zzibg(true);
    final zzieb zza = new zzidx();
    boolean zzb;
    boolean zzc;

    private zzibg() {
    }

    public static zzibg zza() {
        return zzd;
    }

    static void zzf(zziaw zziawVar, zzies zziesVar, int i, Object obj) throws IOException {
        if (zziesVar == zzies.GROUP) {
            zziawVar.zzH(i, 3);
            ((zzidc) obj).zzcX(zziawVar);
            zziawVar.zzH(i, 4);
            return;
        }
        zziawVar.zzH(i, zziesVar.zzb());
        zziet zzietVar = zziet.INT;
        switch (zziesVar) {
            case DOUBLE:
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zziawVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case UINT64:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case INT32:
                zziawVar.zzr(((Integer) obj).intValue());
                break;
            case FIXED64:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case FIXED32:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case BOOL:
                zziawVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzian)) {
                    zziawVar.zzx((String) obj);
                    break;
                } else {
                    zziawVar.zzl((zzian) obj);
                    break;
                }
            case GROUP:
                ((zzidc) obj).zzcX(zziawVar);
                break;
            case MESSAGE:
                zziawVar.zzp((zzidc) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzian)) {
                    byte[] bArr = (byte[]) obj;
                    zziawVar.zzm(bArr, 0, bArr.length);
                    break;
                } else {
                    zziawVar.zzl((zzian) obj);
                    break;
                }
            case UINT32:
                zziawVar.zzs(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zzibv)) {
                    zziawVar.zzr(((Integer) obj).intValue());
                    break;
                } else {
                    zziawVar.zzr(((zzibv) obj).zza());
                    break;
                }
            case SFIXED32:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                zziawVar.zzs((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                zziawVar.zzu((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int zzh(zzies zziesVar, int i, Object obj) {
        int zzA = zziaw.zzA(i << 3);
        if (zziesVar == zzies.GROUP) {
            zzA += zzA;
        }
        return zzA + zzi(zziesVar, obj);
    }

    static int zzi(zzies zziesVar, Object obj) {
        int zzc;
        int zzA;
        zzies zziesVar2 = zzies.DOUBLE;
        zziet zzietVar = zziet.INT;
        switch (zziesVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zziaw.zzf;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zziaw.zzf;
                return 4;
            case INT64:
                return zziaw.zzB(((Long) obj).longValue());
            case UINT64:
                return zziaw.zzB(((Long) obj).longValue());
            case INT32:
                return zziaw.zzB(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zziaw.zzf;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zziaw.zzf;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zziaw.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof zzian)) {
                    int i6 = zziaw.zzf;
                    zzc = zzier.zzc((String) obj);
                    zzA = zziaw.zzA(zzc);
                    break;
                } else {
                    int i7 = zziaw.zzf;
                    zzc = ((zzian) obj).zzc();
                    zzA = zziaw.zzA(zzc);
                    break;
                }
            case GROUP:
                return ((zzidc) obj).zzbr();
            case MESSAGE:
                if (!(obj instanceof zzicl)) {
                    return zziaw.zzC((zzidc) obj);
                }
                zzc = ((zzicl) obj).zzb();
                zzA = zziaw.zzA(zzc);
                break;
            case BYTES:
                if (!(obj instanceof zzian)) {
                    int i8 = zziaw.zzf;
                    zzc = ((byte[]) obj).length;
                    zzA = zziaw.zzA(zzc);
                    break;
                } else {
                    int i9 = zziaw.zzf;
                    zzc = ((zzian) obj).zzc();
                    zzA = zziaw.zzA(zzc);
                    break;
                }
            case UINT32:
                return zziaw.zzA(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzibv ? zziaw.zzB(((zzibv) obj).zza()) : zziaw.zzB(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i10 = zziaw.zzf;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i11 = zziaw.zzf;
                return 8;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                return zziaw.zzA((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((Long) obj).longValue();
                return zziaw.zzB((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzA + zzc;
    }

    public static int zzj(zzibf zzibfVar, Object obj) {
        zzies zzb = zzibfVar.zzb();
        int zza = zzibfVar.zza();
        if (!zzibfVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzibfVar.zze()) {
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
        return zziaw.zzA(zza << 3) + i3 + zziaw.zzA(i3);
    }

    private static boolean zzk(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        if (zzibfVar.zzc() != zziet.MESSAGE) {
            return true;
        }
        if (!zzibfVar.zzd()) {
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
        if (obj instanceof zzidd) {
            return ((zzidd) obj).zzbi();
        }
        if (obj instanceof zzicl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzA;
        int zzA2;
        zzibf zzibfVar = (zzibf) entry.getKey();
        Object value = entry.getValue();
        if (zzibfVar.zzc() != zziet.MESSAGE || zzibfVar.zzd() || zzibfVar.zze()) {
            return zzj(zzibfVar, value);
        }
        if (value instanceof zzicl) {
            int zza = ((zzibf) entry.getKey()).zza();
            int zzA3 = zziaw.zzA(8);
            i = zzA3 + zzA3;
            zzA = zziaw.zzA(16) + zziaw.zzA(zza);
            int zzA4 = zziaw.zzA(24);
            int zzb = ((zzicl) value).zzb();
            zzA2 = zzA4 + zziaw.zzA(zzb) + zzb;
        } else {
            int zza2 = ((zzibf) entry.getKey()).zza();
            int zzA5 = zziaw.zzA(8);
            i = zzA5 + zzA5;
            zzA = zziaw.zzA(16) + zziaw.zzA(zza2);
            zzA2 = zziaw.zzA(24) + zziaw.zzC((zzidc) value);
        }
        return i + zzA + zzA2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzibf zzibfVar, Object obj) {
        boolean z;
        zzibfVar.zzb();
        byte[] bArr = zzice.zzb;
        obj.getClass();
        zzies zziesVar = zzies.DOUBLE;
        zziet zzietVar = zziet.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzian) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzibv)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzidc) || (obj instanceof zzicl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzibg zzibgVar = new zzibg();
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzd2 = zziebVar.zzd(i);
            zzibgVar.zzd((zzibf) ((zzidy) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zziebVar.zze()) {
            zzibgVar.zzd((zzibf) entry.getKey(), entry.getValue());
        }
        zzibgVar.zzc = this.zzc;
        return zzibgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzibg) {
            return this.zza.equals(((zzibg) obj).zza);
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
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zziebVar.zzd(i).getValue();
            if (value instanceof zzibr) {
                ((zzibr) value).zzbm();
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzibr) {
                ((zzibr) value2).zzbm();
            }
        }
        zziebVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzieb zziebVar = this.zza;
        return zziebVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzick(zziebVar.entrySet().iterator()) : zziebVar.entrySet().iterator();
    }

    public final void zzd(zzibf zzibfVar, Object obj) {
        if (!zzibfVar.zzd()) {
            zzn(zzibfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzibfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzicl) {
            this.zzc = true;
        }
        this.zza.put(zzibfVar, obj);
    }

    public final boolean zze() {
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zziebVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzieb zziebVar = this.zza;
        int zzc = zziebVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zziebVar.zzd(i2));
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    private zzibg(boolean z) {
        zzb();
        zzb();
    }
}
