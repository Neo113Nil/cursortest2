package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzlu {
    private static final zzlu zzb = new zzlu(true);
    final zzoa zza = new zznv();
    private boolean zzc;
    private boolean zzd;

    private zzlu() {
    }

    static int zza(zzop zzopVar, int i4, Object obj) {
        zzlk.zzz(i4 << 3);
        if (zzop.zzj == null) {
            byte[] bArr = zzmk.zzb;
            if (((zznh) obj) instanceof zzkp) {
                throw null;
            }
        }
        zzoq zzoqVar = zzoq.INT;
        throw null;
    }

    public static int zzb(zzlt zzltVar, Object obj) {
        zzop zzb2 = zzltVar.zzb();
        int zza = zzltVar.zza();
        if (!zzltVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!zzltVar.zzd()) {
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                i4 += zza(zzb2, zza, list.get(i5));
            }
            return i4;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return zzlk.zzz(zza << 3) + zzlk.zzz(0);
        }
        list.get(0);
        zzop zzopVar = zzop.zza;
        zzoq zzoqVar = zzoq.INT;
        throw null;
    }

    public static zzlu zzd() {
        return zzb;
    }

    private static boolean zzi(Map.Entry entry) {
        zzlt zzltVar = (zzlt) entry.getKey();
        if (zzltVar.zzc() != zzoq.MESSAGE) {
            return true;
        }
        if (!zzltVar.zze()) {
            return zzj(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!zzj(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzni) {
            return ((zzni) obj).zzcD();
        }
        if (obj instanceof zzmr) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(Map.Entry entry) {
        int i4;
        int zzz;
        int zzz2;
        int zzcf;
        int zzz3;
        zzlt zzltVar = (zzlt) entry.getKey();
        Object value = entry.getValue();
        if (zzltVar.zzc() != zzoq.MESSAGE || zzltVar.zze() || zzltVar.zzd()) {
            return zzb(zzltVar, value);
        }
        if (value instanceof zzmr) {
            int zza = ((zzlt) entry.getKey()).zza();
            int zzz4 = zzlk.zzz(8);
            i4 = zzz4 + zzz4;
            zzz = zzlk.zzz(16) + zzlk.zzz(zza);
            zzz2 = zzlk.zzz(24);
            zzcf = ((zzmr) value).zza();
            zzz3 = zzlk.zzz(zzcf);
        } else {
            int zza2 = ((zzlt) entry.getKey()).zza();
            int zzz5 = zzlk.zzz(8);
            i4 = zzz5 + zzz5;
            zzz = zzlk.zzz(16) + zzlk.zzz(zza2);
            zzz2 = zzlk.zzz(24);
            zzcf = ((zznh) value).zzcf();
            zzz3 = zzlk.zzz(zzcf);
        }
        return i4 + zzz + zzz2 + zzz3 + zzcf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzl(zzlt zzltVar, Object obj) {
        boolean z4;
        zzltVar.zzb();
        byte[] bArr = zzmk.zzb;
        obj.getClass();
        zzop zzopVar = zzop.zza;
        zzoq zzoqVar = zzoq.INT;
        switch (r0.zza()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzld) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzmf)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zznh) || (obj instanceof zzmr)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzltVar.zza()), zzltVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzlu zzluVar = new zzlu();
        zzoa zzoaVar = this.zza;
        int zzc = zzoaVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            Map.Entry zzg = zzoaVar.zzg(i4);
            zzluVar.zzg((zzlt) ((zznw) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzoaVar.zzd()) {
            zzluVar.zzg((zzlt) entry.getKey(), entry.getValue());
        }
        zzluVar.zzd = this.zzd;
        return zzluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlu) {
            return this.zza.equals(((zzlu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        zzoa zzoaVar = this.zza;
        int zzc = zzoaVar.zzc();
        int i4 = 0;
        for (int i5 = 0; i5 < zzc; i5++) {
            i4 += zzk(zzoaVar.zzg(i5));
        }
        Iterator it = zzoaVar.zzd().iterator();
        while (it.hasNext()) {
            i4 += zzk((Map.Entry) it.next());
        }
        return i4;
    }

    public final Iterator zze() {
        zzoa zzoaVar = this.zza;
        return zzoaVar.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzmp(zzoaVar.entrySet().iterator()) : zzoaVar.entrySet().iterator();
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        zzoa zzoaVar = this.zza;
        int zzc = zzoaVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            Object value = zzoaVar.zzg(i4).getValue();
            if (value instanceof zzmd) {
                ((zzmd) value).zzcr();
            }
        }
        Iterator it = zzoaVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzmd) {
                ((zzmd) value2).zzcr();
            }
        }
        zzoaVar.zza();
        this.zzc = true;
    }

    public final void zzg(zzlt zzltVar, Object obj) {
        if (!zzltVar.zze()) {
            zzl(zzltVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = list.get(i4);
                zzl(zzltVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzmr) {
            this.zzd = true;
        }
        this.zza.put(zzltVar, obj);
    }

    public final boolean zzh() {
        zzoa zzoaVar = this.zza;
        int zzc = zzoaVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            if (!zzi(zzoaVar.zzg(i4))) {
                return false;
            }
        }
        Iterator it = zzoaVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzi((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzlu(boolean z4) {
        zzf();
        zzf();
    }
}
