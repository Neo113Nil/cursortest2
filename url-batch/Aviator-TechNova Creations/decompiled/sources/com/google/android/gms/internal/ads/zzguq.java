package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzguq extends zzgul {
    public final zzguq zzb(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            zzgua zzguaVar = (zzgua) zza().get(obj);
            if (zzguaVar == null) {
                zzguaVar = zzgup.zzs(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                zza().put(obj, zzguaVar);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgtb.zza(obj, next);
                zzguaVar.zzd(next);
            }
        }
        return this;
    }

    public final zzgus zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgtt.zza;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return zzgtt.zza;
        }
        zzguh zzguhVar = new zzguh(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            zzgup zzo = zzgup.zzo(((zzguo) entry.getValue()).zzi());
            if (!zzo.isEmpty()) {
                zzguhVar.zza(key, zzo);
                i += zzo.size();
            }
        }
        return new zzgus(zzguhVar.zzc(), i, null);
    }
}
