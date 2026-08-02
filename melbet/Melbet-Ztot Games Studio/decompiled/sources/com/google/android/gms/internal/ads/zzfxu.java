package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzfxu implements Map, Serializable {

    @CheckForNull
    private transient zzfxw zza;

    @CheckForNull
    private transient zzfxw zzb;

    @CheckForNull
    private transient zzfxm zzc;

    zzfxu() {
    }

    public static zzfxu zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfxt zzfxtVar = new zzfxt(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfxtVar.zzb(entrySet);
        return zzfxtVar.zzc();
    }

    public static zzfxu zzd() {
        return zzfzi.zza;
    }

    public static zzfxu zze(Object obj, Object obj2) {
        zzfwo.zzb("dialog_not_shown_reason", obj2);
        return zzfzi.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfyo.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfzt.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfwo.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzfxm zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfxm values() {
        zzfxm zzfxmVar = this.zzc;
        if (zzfxmVar != null) {
            return zzfxmVar;
        }
        zzfxm zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzfxw zzf();

    abstract zzfxw zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfxw entrySet() {
        zzfxw zzfxwVar = this.zza;
        if (zzfxwVar != null) {
            return zzfxwVar;
        }
        zzfxw zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfxw keySet() {
        zzfxw zzfxwVar = this.zzb;
        if (zzfxwVar != null) {
            return zzfxwVar;
        }
        zzfxw zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
