package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgwd {
    private static final zzgwd zzb = new zzgwd(true);
    final zzgzc zza = new zzgys(16);
    private boolean zzc;
    private boolean zzd;

    private zzgwd() {
    }

    public static zzgwd zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzd(zzgwc zzgwcVar, Object obj) {
        boolean z;
        zzgzw zzb2 = zzgwcVar.zzb();
        byte[] bArr = zzgww.zzd;
        obj.getClass();
        zzgzw zzgzwVar = zzgzw.DOUBLE;
        zzgzx zzgzxVar = zzgzx.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof zzgve) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgwo)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof zzgxw) || (obj instanceof zzgxb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwcVar.zza()), zzgwcVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgwd zzgwdVar = new zzgwd();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgwdVar.zzc((zzgwc) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgwdVar.zzc((zzgwc) entry.getKey(), entry.getValue());
        }
        zzgwdVar.zzd = this.zzd;
        return zzgwdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgwd) {
            return this.zza.equals(((zzgwd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof zzgwm) {
                ((zzgwm) zzg.getValue()).zzaS();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzgwc zzgwcVar, Object obj) {
        if (!zzgwcVar.zzc()) {
            zzd(zzgwcVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzgwcVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzgxb) {
            this.zzd = true;
        }
        this.zza.put(zzgwcVar, obj);
    }

    private zzgwd(boolean z) {
        zzb();
        zzb();
    }
}
