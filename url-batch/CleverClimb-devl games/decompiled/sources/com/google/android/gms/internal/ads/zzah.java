package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.a.c.f;
import org.apache.a.d;
import org.apache.a.r;

/* loaded from: classes2.dex */
final class zzah extends zzai {
    private final zzar zzbo;

    zzah(zzar zzarVar) {
        this.zzbo = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzai
    public final zzaq zza(zzr<?> zzrVar, Map<String, String> map) throws IOException, zza {
        try {
            r zzb = this.zzbo.zzb(zzrVar, map);
            int b2 = zzb.a().b();
            d[] allHeaders = zzb.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (d dVar : allHeaders) {
                arrayList.add(new zzl(dVar.c(), dVar.d()));
            }
            if (zzb.b() == null) {
                return new zzaq(b2, arrayList);
            }
            long c2 = zzb.b().c();
            if (((int) c2) == c2) {
                return new zzaq(b2, arrayList, (int) zzb.b().c(), zzb.b().f());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(c2);
            throw new IOException(sb.toString());
        } catch (f e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
