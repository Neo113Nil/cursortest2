package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.a.aa;
import org.apache.a.d;
import org.apache.a.h.b;
import org.apache.a.h.h;
import org.apache.a.h.n;
import org.apache.a.r;

/* loaded from: classes2.dex */
public abstract class zzai implements zzar {
    public abstract zzaq zza(zzr<?> zzrVar, Map<String, String> map) throws IOException, zza;

    @Override // com.google.android.gms.internal.ads.zzar
    @Deprecated
    public final r zzb(zzr<?> zzrVar, Map<String, String> map) throws IOException, zza {
        zzaq zza = zza(zzrVar, map);
        h hVar = new h(new n(new aa("HTTP", 1, 1), zza.getStatusCode(), ""));
        ArrayList arrayList = new ArrayList();
        for (zzl zzlVar : zza.zzq()) {
            arrayList.add(new b(zzlVar.getName(), zzlVar.getValue()));
        }
        hVar.setHeaders((d[]) arrayList.toArray(new d[arrayList.size()]));
        InputStream content = zza.getContent();
        if (content != null) {
            org.apache.a.e.b bVar = new org.apache.a.e.b();
            bVar.a(content);
            bVar.a(zza.getContentLength());
            hVar.a(bVar);
        }
        return hVar;
    }
}
