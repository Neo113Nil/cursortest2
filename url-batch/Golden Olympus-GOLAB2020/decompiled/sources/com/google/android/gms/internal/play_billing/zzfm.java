package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfm {
    private static final zzfm zzd = new zzfm(true);
    final zzht zza = new zzho();
    boolean zzb;
    boolean zzc;

    private zzfm() {
    }

    static int zza(zzir zzirVar, int i4, Object obj) {
        int zzy = zzfc.zzy(i4 << 3);
        if (zzirVar == zzir.zzj) {
            zzy += zzy;
        }
        return zzy + zzb(zzirVar, obj);
    }

    static int zzb(zzir zzirVar, Object obj) {
        int zzb;
        int zzy;
        zzir zzirVar2 = zzir.zza;
        zzis zzisVar = zzis.INT;
        switch (zzirVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i4 = zzfc.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i5 = zzfc.zzb;
                return 4;
            case 2:
                return zzfc.zzz(((Long) obj).longValue());
            case 3:
                return zzfc.zzz(((Long) obj).longValue());
            case 4:
                return zzfc.zzz(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i6 = zzfc.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i7 = zzfc.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i8 = zzfc.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzev)) {
                    int i9 = zzfc.zzb;
                    zzb = zzin.zzb((String) obj);
                    zzy = zzfc.zzy(zzb);
                    break;
                } else {
                    int i10 = zzfc.zzb;
                    zzb = ((zzev) obj).zze();
                    zzy = zzfc.zzy(zzb);
                    break;
                }
            case 9:
                return ((zzhb) obj).zzn();
            case 10:
                if (!(obj instanceof zzgh)) {
                    return zzfc.zzx((zzhb) obj);
                }
                zzb = ((zzgh) obj).zza();
                zzy = zzfc.zzy(zzb);
                break;
            case 11:
                if (!(obj instanceof zzev)) {
                    int i11 = zzfc.zzb;
                    zzb = ((byte[]) obj).length;
                    zzy = zzfc.zzy(zzb);
                    break;
                } else {
                    int i12 = zzfc.zzb;
                    zzb = ((zzev) obj).zze();
                    zzy = zzfc.zzy(zzb);
                    break;
                }
            case 12:
                return zzfc.zzy(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzfw ? zzfc.zzz(((zzfw) obj).zza()) : zzfc.zzz(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i13 = zzfc.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i14 = zzfc.zzb;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzfc.zzy((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzfc.zzz((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzy + zzb;
    }

    public static int zzc(zzfl zzflVar, Object obj) {
        zzir zzb = zzflVar.zzb();
        int zza = zzflVar.zza();
        if (!zzflVar.zze()) {
            return zza(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i4 = 0;
        if (!zzflVar.zzd()) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zza(zzb, zza, list.get(i4));
                i4++;
            }
            return i5;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i6 = 0;
        while (i4 < size) {
            i6 += zzb(zzb, list.get(i4));
            i4++;
        }
        return zzfc.zzy(zza << 3) + i6 + zzfc.zzy(i6);
    }

    public static zzfm zze() {
        return zzd;
    }

    static void zzi(zzfc zzfcVar, zzir zzirVar, int i4, Object obj) {
        if (zzirVar == zzir.zzj) {
            zzfcVar.zzs(i4, 3);
            ((zzhb) obj).zzD(zzfcVar);
            zzfcVar.zzs(i4, 4);
            return;
        }
        zzfcVar.zzs(i4, zzirVar.zza());
        zzis zzisVar = zzis.INT;
        switch (zzirVar.ordinal()) {
            case 0:
                zzfcVar.zzk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzfcVar.zzi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzfcVar.zzw(((Long) obj).longValue());
                break;
            case 3:
                zzfcVar.zzw(((Long) obj).longValue());
                break;
            case 4:
                zzfcVar.zzm(((Integer) obj).intValue());
                break;
            case 5:
                zzfcVar.zzk(((Long) obj).longValue());
                break;
            case 6:
                zzfcVar.zzi(((Integer) obj).intValue());
                break;
            case 7:
                zzfcVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzev)) {
                    zzfcVar.zzr((String) obj);
                    break;
                } else {
                    zzfcVar.zzg((zzev) obj);
                    break;
                }
            case 9:
                ((zzhb) obj).zzD(zzfcVar);
                break;
            case 10:
                zzfcVar.zzn((zzhb) obj);
                break;
            case 11:
                if (!(obj instanceof zzev)) {
                    byte[] bArr = (byte[]) obj;
                    zzfcVar.zze(bArr, 0, bArr.length);
                    break;
                } else {
                    zzfcVar.zzg((zzev) obj);
                    break;
                }
            case 12:
                zzfcVar.zzu(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzfw)) {
                    zzfcVar.zzm(((Integer) obj).intValue());
                    break;
                } else {
                    zzfcVar.zzm(((zzfw) obj).zza());
                    break;
                }
            case 14:
                zzfcVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzfcVar.zzk(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzfcVar.zzu((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzfcVar.zzw((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzfl zzflVar = (zzfl) entry.getKey();
        if (zzflVar.zzc() != zzis.MESSAGE) {
            return true;
        }
        if (!zzflVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!zzl(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhc) {
            return ((zzhc) obj).zzo();
        }
        if (obj instanceof zzgh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i4;
        int zzy;
        int zzy2;
        zzfl zzflVar = (zzfl) entry.getKey();
        Object value = entry.getValue();
        if (zzflVar.zzc() != zzis.MESSAGE || zzflVar.zze() || zzflVar.zzd()) {
            return zzc(zzflVar, value);
        }
        if (value instanceof zzgh) {
            int zza = ((zzfl) entry.getKey()).zza();
            int zzy3 = zzfc.zzy(8);
            i4 = zzy3 + zzy3;
            zzy = zzfc.zzy(16) + zzfc.zzy(zza);
            int zzy4 = zzfc.zzy(24);
            int zza2 = ((zzgh) value).zza();
            zzy2 = zzy4 + zzfc.zzy(zza2) + zza2;
        } else {
            int zza3 = ((zzfl) entry.getKey()).zza();
            int zzy5 = zzfc.zzy(8);
            i4 = zzy5 + zzy5;
            zzy = zzfc.zzy(16) + zzfc.zzy(zza3);
            zzy2 = zzfc.zzy(24) + zzfc.zzx((zzhb) value);
        }
        return i4 + zzy + zzy2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzfl zzflVar, Object obj) {
        boolean z4;
        zzflVar.zzb();
        byte[] bArr = zzga.zzb;
        obj.getClass();
        zzir zzirVar = zzir.zza;
        zzis zzisVar = zzis.INT;
        switch (r0.zzb()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzev) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzfw)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhb) || (obj instanceof zzgh)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzfm zzfmVar = new zzfm();
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            Map.Entry zzg = zzhtVar.zzg(i4);
            zzfmVar.zzh((zzfl) ((zzhp) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzhtVar.zzd()) {
            zzfmVar.zzh((zzfl) entry.getKey(), entry.getValue());
        }
        zzfmVar.zzc = this.zzc;
        return zzfmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfm) {
            return this.zza.equals(((zzfm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        int i4 = 0;
        for (int i5 = 0; i5 < zzc; i5++) {
            i4 += zzm(zzhtVar.zzg(i5));
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            i4 += zzm((Map.Entry) it.next());
        }
        return i4;
    }

    public final Iterator zzf() {
        zzht zzhtVar = this.zza;
        return zzhtVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzgf(zzhtVar.entrySet().iterator()) : zzhtVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            Object value = zzhtVar.zzg(i4).getValue();
            if (value instanceof zzfu) {
                ((zzfu) value).zzz();
            }
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzfu) {
                ((zzfu) value2).zzz();
            }
        }
        zzhtVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzfl zzflVar, Object obj) {
        if (!zzflVar.zze()) {
            zzn(zzflVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = list.get(i4);
                zzn(zzflVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgh) {
            this.zzc = true;
        }
        this.zza.put(zzflVar, obj);
    }

    public final boolean zzj() {
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            if (!zzk(zzhtVar.zzg(i4))) {
                return false;
            }
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzfm(boolean z4) {
        zzg();
        zzg();
    }
}
