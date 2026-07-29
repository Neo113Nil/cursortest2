package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzyr<FieldDescriptorType extends zzyt<FieldDescriptorType>> {
    private static final zzyr zzbug = new zzyr(true);
    private boolean zzbmk;
    private boolean zzbuf = false;
    private final zzaad<FieldDescriptorType, Object> zzbue = zzaad.zzai(16);

    private zzyr() {
    }

    private zzyr(boolean z) {
        if (this.zzbmk) {
            return;
        }
        this.zzbue.zzqy();
        this.zzbmk = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzyx) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzyz) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzaau zzaauVar, Object obj) {
        boolean z;
        zzyw.checkNotNull(obj);
        boolean z2 = false;
        switch (zzys.zzbuh[zzaauVar.zzvn().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                break;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                break;
            case 7:
                if (!(obj instanceof zzyb)) {
                    break;
                }
                z2 = true;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = true;
                break;
            case 9:
                if (!(obj instanceof zzzq)) {
                    break;
                }
                z2 = true;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzuc()) {
            zza(fielddescriptortype.zzub(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzub(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzyz) {
            this.zzbuf = true;
        }
        this.zzbue.zza((zzaad<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    public static <T extends zzyt<T>> zzyr<T> zzua() {
        return zzbug;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzyr zzyrVar = new zzyr();
        for (int i = 0; i < this.zzbue.zzvb(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzaj = this.zzbue.zzaj(i);
            zzyrVar.zza((zzyr) zzaj.getKey(), zzaj.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzbue.zzvc()) {
            zzyrVar.zza((zzyr) entry.getKey(), entry.getValue());
        }
        zzyrVar.zzbuf = this.zzbuf;
        return zzyrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzyr) {
            return this.zzbue.equals(((zzyr) obj).zzbue);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbue.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzbuf ? new zzzc(this.zzbue.entrySet().iterator()) : this.zzbue.entrySet().iterator();
    }
}
