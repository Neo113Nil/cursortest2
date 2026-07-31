package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaka;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajy<T extends zzaka<T>> {
    private static final zzajy<?> zzb = new zzajy<>(true);
    final zzamh<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzajy() {
        this.zza = new zzamg();
    }

    static int zza(zzanh zzanhVar, int i4, Object obj) {
        int zzg = zzajo.zzg(i4);
        if (zzanhVar == zzanh.zzj) {
            zzaki.zza((zzaln) obj);
            zzg <<= 1;
        }
        return zzg + zza(zzanhVar, obj);
    }

    public static <T extends zzaka<T>> zzajy<T> zzb() {
        return (zzajy<T>) zzb;
    }

    public final /* synthetic */ Object clone() {
        zzajy zzajyVar = new zzajy();
        int zzb2 = this.zza.zzb();
        for (int i4 = 0; i4 < zzb2; i4++) {
            Map.Entry<T, Object> zza = this.zza.zza(i4);
            zzajyVar.zzb(zza.getKey(), zza.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzajyVar.zzb(entry.getKey(), entry.getValue());
        }
        zzajyVar.zzd = this.zzd;
        return zzajyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzajy) {
            return this.zza.equals(((zzajy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzakt(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzakt(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zzb2 = this.zza.zzb();
        for (int i4 = 0; i4 < zzb2; i4++) {
            Object value = this.zza.zza(i4).getValue();
            if (value instanceof zzakg) {
                ((zzakg) value).zzt();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzakg) {
                ((zzakg) value2).zzt();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zzb2 = this.zza.zzb();
        for (int i4 = 0; i4 < zzb2; i4++) {
            if (!zzc(this.zza.zza(i4))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z4 = value instanceof zzakr;
        if (key.zze()) {
            if (z4) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzajy<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i4 = 0; i4 < size; i4++) {
                list2.add(zza(list.get(i4)));
            }
            this.zza.zza((zzamh<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzank.MESSAGE) {
            if (z4) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzamh<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzajy<T>) key);
        if (zza2 != null) {
            if (z4) {
                throw new NoSuchMethodError();
            }
            this.zza.zza((zzamh<T, Object>) key, (T) (zza2 instanceof zzals ? key.zza((zzals) zza2, (zzals) value) : key.zza(((zzaln) zza2).zzr(), (zzaln) value).zze()));
        } else {
            this.zza.zza((zzamh<T, Object>) key, (T) zza(value));
            if (z4) {
                this.zzd = true;
            }
        }
    }

    private zzajy(zzamh<T, Object> zzamhVar) {
        this.zza = zzamhVar;
        zze();
    }

    private static int zza(zzanh zzanhVar, Object obj) {
        switch (zzakb.zzb[zzanhVar.ordinal()]) {
            case 1:
                return zzajo.zza(((Double) obj).doubleValue());
            case 2:
                return zzajo.zza(((Float) obj).floatValue());
            case 3:
                return zzajo.zzb(((Long) obj).longValue());
            case 4:
                return zzajo.zze(((Long) obj).longValue());
            case 5:
                return zzajo.zzc(((Integer) obj).intValue());
            case 6:
                return zzajo.zza(((Long) obj).longValue());
            case 7:
                return zzajo.zzb(((Integer) obj).intValue());
            case 8:
                return zzajo.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzajo.zza((zzaln) obj);
            case 10:
                if (obj instanceof zzakr) {
                    return zzajo.zza((zzakr) obj);
                }
                return zzajo.zzb((zzaln) obj);
            case 11:
                if (obj instanceof zzaiw) {
                    return zzajo.zza((zzaiw) obj);
                }
                return zzajo.zza((String) obj);
            case 12:
                if (obj instanceof zzaiw) {
                    return zzajo.zza((zzaiw) obj);
                }
                return zzajo.zza((byte[]) obj);
            case 13:
                return zzajo.zzh(((Integer) obj).intValue());
            case 14:
                return zzajo.zze(((Integer) obj).intValue());
            case 15:
                return zzajo.zzc(((Long) obj).longValue());
            case 16:
                return zzajo.zzf(((Integer) obj).intValue());
            case 17:
                return zzajo.zzd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzakl) {
                    return zzajo.zza(((zzakl) obj).zza());
                }
                return zzajo.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakr) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakl) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t4, Object obj) {
        zzanh zzb2 = t4.zzb();
        zzaki.zza(obj);
        boolean z4 = true;
        switch (zzakb.zza[zzb2.zzb().ordinal()]) {
            case 1:
                z4 = obj instanceof Integer;
                break;
            case 2:
                z4 = obj instanceof Long;
                break;
            case 3:
                z4 = obj instanceof Float;
                break;
            case 4:
                z4 = obj instanceof Double;
                break;
            case 5:
                z4 = obj instanceof Boolean;
                break;
            case 6:
                z4 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzaiw)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzaln)) {
                    break;
                }
                break;
            default:
                z4 = false;
                break;
        }
        if (!z4) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t4.zza()), t4.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzajy(boolean z4) {
        this(new zzamg());
        zze();
    }

    private static <T extends zzaka<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzank.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!zzb(list.get(i4))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t4, Object obj) {
        if (t4.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj2 = list.get(i4);
                    zzc(t4, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t4, obj);
        }
        if (obj instanceof zzakr) {
            this.zzd = true;
        }
        this.zza.zza((zzamh<T, Object>) t4, (T) obj);
    }

    public static int zza(zzaka<?> zzakaVar, Object obj) {
        zzanh zzb2 = zzakaVar.zzb();
        int zza = zzakaVar.zza();
        if (zzakaVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i4 = 0;
            if (!zzakaVar.zzd()) {
                int i5 = 0;
                while (i4 < size) {
                    i5 += zza(zzb2, zza, list.get(i4));
                    i4++;
                }
                return i5;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int i6 = 0;
            while (i4 < size) {
                i6 += zza(zzb2, list.get(i4));
                i4++;
            }
            return zzajo.zzg(zza) + i6 + zzajo.zzh(i6);
        }
        return zza(zzb2, zza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzalp) {
            return ((zzalp) obj).zzv();
        }
        if (obj instanceof zzakr) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int zzb2 = this.zza.zzb();
        int i4 = 0;
        for (int i5 = 0; i5 < zzb2; i5++) {
            i4 += zza((Map.Entry) this.zza.zza(i5));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i4 += zza((Map.Entry) it.next());
        }
        return i4;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzank.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzakr) {
                return zzajo.zza(entry.getKey().zza(), (zzakr) value);
            }
            return zzajo.zza(entry.getKey().zza(), (zzaln) value);
        }
        return zza((zzaka<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzals) {
            return ((zzals) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t4) {
        Object obj = this.zza.get(t4);
        if (obj instanceof zzakr) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzajy<T> zzajyVar) {
        int zzb2 = zzajyVar.zza.zzb();
        for (int i4 = 0; i4 < zzb2; i4++) {
            zzb((Map.Entry) zzajyVar.zza.zza(i4));
        }
        Iterator<Map.Entry<T, Object>> it = zzajyVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    static void zza(zzajo zzajoVar, zzanh zzanhVar, int i4, Object obj) {
        if (zzanhVar == zzanh.zzj) {
            zzaln zzalnVar = (zzaln) obj;
            zzaki.zza(zzalnVar);
            zzajoVar.zzj(i4, 3);
            zzalnVar.zza(zzajoVar);
            zzajoVar.zzj(i4, 4);
        }
        zzajoVar.zzj(i4, zzanhVar.zza());
        switch (zzakb.zzb[zzanhVar.ordinal()]) {
            case 1:
                zzajoVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzajoVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzajoVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzajoVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzajoVar.zzj(((Integer) obj).intValue());
                break;
            case 6:
                zzajoVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzajoVar.zzi(((Integer) obj).intValue());
                break;
            case 8:
                zzajoVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzaln) obj).zza(zzajoVar);
                break;
            case 10:
                zzajoVar.zzc((zzaln) obj);
                break;
            case 11:
                if (obj instanceof zzaiw) {
                    zzajoVar.zzb((zzaiw) obj);
                    break;
                } else {
                    zzajoVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzaiw) {
                    zzajoVar.zzb((zzaiw) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzajoVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzajoVar.zzl(((Integer) obj).intValue());
                break;
            case 14:
                zzajoVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzajoVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzajoVar.zzk(((Integer) obj).intValue());
                break;
            case 17:
                zzajoVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzakl) {
                    zzajoVar.zzj(((zzakl) obj).zza());
                    break;
                } else {
                    zzajoVar.zzj(((Integer) obj).intValue());
                    break;
                }
        }
    }
}
