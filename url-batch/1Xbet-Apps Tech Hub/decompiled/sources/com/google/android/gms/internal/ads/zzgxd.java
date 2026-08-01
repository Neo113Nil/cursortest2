package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgxd extends zzguo implements RandomAccess, zzgxe {

    @Deprecated
    public static final zzgxe zza;
    private static final zzgxd zzb;
    private final List zzc;

    static {
        zzgxd zzgxdVar = new zzgxd(false);
        zzb = zzgxdVar;
        zza = zzgxdVar;
    }

    public zzgxd() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzgve ? ((zzgve) obj).zzx(zzgww.zzb) : zzgww.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbN();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbN();
        if (collection instanceof zzgxe) {
            collection = ((zzgxe) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbN();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbN();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbN();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgwv
    public final /* bridge */ /* synthetic */ zzgwv zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzgxd(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final zzgxe zze() {
        return zzc() ? new zzgzl(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgve) {
            zzgve zzgveVar = (zzgve) obj;
            String zzx = zzgveVar.zzx(zzgww.zzb);
            if (zzgveVar.zzp()) {
                this.zzc.set(i, zzx);
            }
            return zzx;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzgww.zzd(bArr);
        if (zzgzv.zzi(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final void zzi(zzgve zzgveVar) {
        zzbN();
        this.zzc.add(zzgveVar);
        this.modCount++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgxd(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.zzc = arrayList;
    }

    private zzgxd(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzgxd(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzguo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
