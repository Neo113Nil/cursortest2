package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhzc extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzhyv();
    zzhzb zza;
    int zzb;
    int zzc;
    final zzhzb zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzhyx zzh;
    private zzhyz zzi;

    public zzhzc() {
        this(zze, true);
    }

    private final void zzf(zzhzb zzhzbVar, zzhzb zzhzbVar2) {
        zzhzb zzhzbVar3 = zzhzbVar.zza;
        zzhzbVar.zza = null;
        if (zzhzbVar2 != null) {
            zzhzbVar2.zza = zzhzbVar3;
        }
        if (zzhzbVar3 == null) {
            this.zza = zzhzbVar2;
        } else if (zzhzbVar3.zzb == zzhzbVar) {
            zzhzbVar3.zzb = zzhzbVar2;
        } else {
            zzhzbVar3.zzc = zzhzbVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzg(zzhzb zzhzbVar, boolean z) {
        while (zzhzbVar != null) {
            zzhzb zzhzbVar2 = zzhzbVar.zzb;
            zzhzb zzhzbVar3 = zzhzbVar.zzc;
            boolean z2 = false;
            int i = zzhzbVar2 != null ? zzhzbVar2.zzi : 0;
            int i2 = zzhzbVar3 != null ? zzhzbVar3.zzi : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                zzhzb zzhzbVar4 = zzhzbVar3.zzb;
                zzhzb zzhzbVar5 = zzhzbVar3.zzc;
                int i4 = (zzhzbVar4 != null ? zzhzbVar4.zzi : 0) - (zzhzbVar5 != null ? zzhzbVar5.zzi : 0);
                if (i4 != -1) {
                    if (i4 != 0) {
                        z3 = z;
                    }
                    zzi(zzhzbVar3);
                    zzh(zzhzbVar);
                    if (!z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzh(zzhzbVar);
                z3 = z2;
                if (!z3) {
                }
            } else if (i3 == 2) {
                zzhzb zzhzbVar6 = zzhzbVar2.zzb;
                zzhzb zzhzbVar7 = zzhzbVar2.zzc;
                int i5 = (zzhzbVar6 != null ? zzhzbVar6.zzi : 0) - (zzhzbVar7 != null ? zzhzbVar7.zzi : 0);
                if (i5 != 1) {
                    if (i5 != 0) {
                        z3 = z;
                    }
                    zzh(zzhzbVar2);
                    zzi(zzhzbVar);
                    if (!z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzi(zzhzbVar);
                z3 = z2;
                if (!z3) {
                }
            } else if (i3 == 0) {
                zzhzbVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzhzbVar.zzi = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzhzbVar = zzhzbVar.zza;
        }
    }

    private final void zzh(zzhzb zzhzbVar) {
        zzhzb zzhzbVar2 = zzhzbVar.zzb;
        zzhzb zzhzbVar3 = zzhzbVar.zzc;
        zzhzb zzhzbVar4 = zzhzbVar3.zzb;
        zzhzb zzhzbVar5 = zzhzbVar3.zzc;
        zzhzbVar.zzc = zzhzbVar4;
        if (zzhzbVar4 != null) {
            zzhzbVar4.zza = zzhzbVar;
        }
        zzf(zzhzbVar, zzhzbVar3);
        zzhzbVar3.zzb = zzhzbVar;
        zzhzbVar.zza = zzhzbVar3;
        int max = Math.max(zzhzbVar2 != null ? zzhzbVar2.zzi : 0, zzhzbVar4 != null ? zzhzbVar4.zzi : 0) + 1;
        zzhzbVar.zzi = max;
        zzhzbVar3.zzi = Math.max(max, zzhzbVar5 != null ? zzhzbVar5.zzi : 0) + 1;
    }

    private final void zzi(zzhzb zzhzbVar) {
        zzhzb zzhzbVar2 = zzhzbVar.zzb;
        zzhzb zzhzbVar3 = zzhzbVar.zzc;
        zzhzb zzhzbVar4 = zzhzbVar2.zzb;
        zzhzb zzhzbVar5 = zzhzbVar2.zzc;
        zzhzbVar.zzb = zzhzbVar5;
        if (zzhzbVar5 != null) {
            zzhzbVar5.zza = zzhzbVar;
        }
        zzf(zzhzbVar, zzhzbVar2);
        zzhzbVar2.zzc = zzhzbVar;
        zzhzbVar.zza = zzhzbVar2;
        int max = Math.max(zzhzbVar3 != null ? zzhzbVar3.zzi : 0, zzhzbVar5 != null ? zzhzbVar5.zzi : 0) + 1;
        zzhzbVar.zzi = max;
        zzhzbVar2.zzi = Math.max(max, zzhzbVar4 != null ? zzhzbVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzhzb zzhzbVar = this.zzd;
        zzhzbVar.zze = zzhzbVar;
        zzhzbVar.zzd = zzhzbVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzhyx zzhyxVar = this.zzh;
        if (zzhyxVar != null) {
            return zzhyxVar;
        }
        zzhyx zzhyxVar2 = new zzhyx(this);
        this.zzh = zzhyxVar2;
        return zzhyxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzhzb zzb = zzb(obj);
        if (zzb != null) {
            return zzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzhyz zzhyzVar = this.zzi;
        if (zzhyzVar != null) {
            return zzhyzVar;
        }
        zzhyz zzhyzVar2 = new zzhyz(this);
        this.zzi = zzhyzVar2;
        return zzhyzVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzhzb zza = zza(obj, true);
        Object obj3 = zza.zzh;
        zza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzhzb zze2 = zze(obj);
        if (zze2 != null) {
            return zze2.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzhzb zza(Object obj, boolean z) {
        int i;
        zzhzb zzhzbVar;
        Comparator comparator = this.zzf;
        zzhzb zzhzbVar2 = this.zza;
        if (zzhzbVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(zzhzbVar2.zzf) : comparator.compare(obj, zzhzbVar2.zzf);
                if (i == 0) {
                    return zzhzbVar2;
                }
                zzhzb zzhzbVar3 = i < 0 ? zzhzbVar2.zzb : zzhzbVar2.zzc;
                if (zzhzbVar3 == null) {
                    break;
                }
                zzhzbVar2 = zzhzbVar3;
            }
        } else {
            i = 0;
        }
        int i2 = i;
        if (!z) {
            return null;
        }
        zzhzb zzhzbVar4 = this.zzd;
        if (zzhzbVar2 != null) {
            zzhzb zzhzbVar5 = zzhzbVar2;
            zzhzbVar = new zzhzb(this.zzg, zzhzbVar5, obj, zzhzbVar4, zzhzbVar4.zze);
            if (i2 < 0) {
                zzhzbVar5.zzb = zzhzbVar;
            } else {
                zzhzbVar5.zzc = zzhzbVar;
            }
            zzg(zzhzbVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                String name = obj.getClass().getName();
                String.valueOf(name);
                throw new ClassCastException(String.valueOf(name).concat(" is not Comparable"));
            }
            zzhzbVar = new zzhzb(this.zzg, null, obj, zzhzbVar4, zzhzbVar4.zze);
            this.zza = zzhzbVar;
        }
        this.zzb++;
        this.zzc++;
        return zzhzbVar;
    }

    final zzhzb zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    final zzhzb zzc(Map.Entry entry) {
        zzhzb zzb = zzb(entry.getKey());
        if (zzb == null || !Objects.equals(zzb.zzh, entry.getValue())) {
            return null;
        }
        return zzb;
    }

    final void zzd(zzhzb zzhzbVar, boolean z) {
        zzhzb zzhzbVar2;
        zzhzb zzhzbVar3;
        int i;
        if (z) {
            zzhzb zzhzbVar4 = zzhzbVar.zze;
            zzhzbVar4.zzd = zzhzbVar.zzd;
            zzhzbVar.zzd.zze = zzhzbVar4;
        }
        zzhzb zzhzbVar5 = zzhzbVar.zzb;
        zzhzb zzhzbVar6 = zzhzbVar.zzc;
        zzhzb zzhzbVar7 = zzhzbVar.zza;
        int i2 = 0;
        if (zzhzbVar5 == null || zzhzbVar6 == null) {
            if (zzhzbVar5 != null) {
                zzf(zzhzbVar, zzhzbVar5);
                zzhzbVar.zzb = null;
            } else if (zzhzbVar6 != null) {
                zzf(zzhzbVar, zzhzbVar6);
                zzhzbVar.zzc = null;
            } else {
                zzf(zzhzbVar, null);
            }
            zzg(zzhzbVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzhzbVar5.zzi > zzhzbVar6.zzi) {
            do {
                zzhzbVar3 = zzhzbVar5;
                zzhzbVar5 = zzhzbVar5.zzc;
            } while (zzhzbVar5 != null);
        } else {
            do {
                zzhzbVar2 = zzhzbVar6;
                zzhzbVar6 = zzhzbVar6.zzb;
            } while (zzhzbVar6 != null);
            zzhzbVar3 = zzhzbVar2;
        }
        zzd(zzhzbVar3, false);
        zzhzb zzhzbVar8 = zzhzbVar.zzb;
        if (zzhzbVar8 != null) {
            i = zzhzbVar8.zzi;
            zzhzbVar3.zzb = zzhzbVar8;
            zzhzbVar8.zza = zzhzbVar3;
            zzhzbVar.zzb = null;
        } else {
            i = 0;
        }
        zzhzb zzhzbVar9 = zzhzbVar.zzc;
        if (zzhzbVar9 != null) {
            i2 = zzhzbVar9.zzi;
            zzhzbVar3.zzc = zzhzbVar9;
            zzhzbVar9.zza = zzhzbVar3;
            zzhzbVar.zzc = null;
        }
        zzhzbVar3.zzi = Math.max(i, i2) + 1;
        zzf(zzhzbVar, zzhzbVar3);
    }

    final zzhzb zze(Object obj) {
        zzhzb zzb = zzb(obj);
        if (zzb != null) {
            zzd(zzb, true);
        }
        return zzb;
    }

    public zzhzc(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzhzb(z);
    }

    public zzhzc(boolean z) {
        this(zze, false);
    }
}
