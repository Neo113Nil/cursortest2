package com.google.android.gms.internal.ads;

import io.ktor.http.ContentDisposition;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfwx implements Map, Serializable {

    @CheckForNull
    private transient zzfwz zza;

    @CheckForNull
    private transient zzfwz zzb;

    @CheckForNull
    private transient zzfwp zzc;

    zzfwx() {
    }

    public static zzfwx zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfww zzfwwVar = new zzfww(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfwwVar.zzb(entrySet);
        return zzfwwVar.zzc();
    }

    public static zzfwx zzd() {
        return zzfyj.zza;
    }

    public static zzfwx zze(Object obj, Object obj2) {
        zzfvr.zzb("dialog_not_shown_reason", obj2);
        return zzfyj.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
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
        return zzfxp.zzb(this, obj);
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
        return zzfyq.zza(entrySet());
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
        zzfvr.zza(size, ContentDisposition.Parameters.Size);
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    abstract zzfwp zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfwp values() {
        zzfwp zzfwpVar = this.zzc;
        if (zzfwpVar != null) {
            return zzfwpVar;
        }
        zzfwp zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzfwz zzf();

    abstract zzfwz zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfwz entrySet() {
        zzfwz zzfwzVar = this.zza;
        if (zzfwzVar != null) {
            return zzfwzVar;
        }
        zzfwz zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfwz keySet() {
        zzfwz zzfwzVar = this.zzb;
        if (zzfwzVar != null) {
            return zzfwzVar;
        }
        zzfwz zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
