package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzy extends zzi<zzy> {
    private final Map<String, Object> zzsi = new HashMap();

    public final void set(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zzsi.put(str, str2);
    }

    public final String toString() {
        return zza((Object) this.zzsi);
    }

    public final Map<String, Object> zzas() {
        return Collections.unmodifiableMap(this.zzsi);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzy zzyVar) {
        zzy zzyVar2 = zzyVar;
        Preconditions.checkNotNull(zzyVar2);
        zzyVar2.zzsi.putAll(this.zzsi);
    }
}
