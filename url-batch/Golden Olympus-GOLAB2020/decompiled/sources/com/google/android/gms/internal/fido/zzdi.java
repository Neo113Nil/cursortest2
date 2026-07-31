package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzdi extends zzdr {
    private final zzaz zza;
    private final int zzb;

    zzdi(zzaz zzazVar) {
        zzazVar.getClass();
        this.zza = zzazVar;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            zzaz zzazVar2 = this.zza;
            if (i4 >= zzazVar2.size()) {
                break;
            }
            int zzb = ((zzdr) zzazVar2.get(i4)).zzb();
            if (i5 < zzb) {
                i5 = zzb;
            }
            i4++;
        }
        int i6 = i5 + 1;
        this.zzb = i6;
        if (i6 > 4) {
            throw new zzdh("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        if (zzdr.zzd(Byte.MIN_VALUE) != zzdrVar.zza()) {
            return zzdr.zzd(Byte.MIN_VALUE) - zzdrVar.zza();
        }
        zzdi zzdiVar = (zzdi) zzdrVar;
        zzaz zzazVar = this.zza;
        int size = zzazVar.size();
        zzaz zzazVar2 = zzdiVar.zza;
        if (size != zzazVar2.size()) {
            return zzazVar.size() - zzazVar2.size();
        }
        int i4 = 0;
        while (true) {
            zzaz zzazVar3 = this.zza;
            if (i4 >= zzazVar3.size()) {
                return 0;
            }
            int compareTo = ((zzdr) zzazVar3.get(i4)).compareTo((zzdr) zzdiVar.zza.get(i4));
            if (compareTo != 0) {
                return compareTo;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdi.class == obj.getClass()) {
            return this.zza.equals(((zzdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd(Byte.MIN_VALUE)), this.zza});
    }

    public final String toString() {
        if (this.zza.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        zzaz zzazVar = this.zza;
        int size = zzazVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(((zzdr) zzazVar.get(i4)).toString().replace("\n", "\n  "));
        }
        zzag zza = zzag.zza(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        try {
            zza.zzb(sb, arrayList.iterator());
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    protected final int zza() {
        return zzdr.zzd(Byte.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    protected final int zzb() {
        return this.zzb;
    }
}
