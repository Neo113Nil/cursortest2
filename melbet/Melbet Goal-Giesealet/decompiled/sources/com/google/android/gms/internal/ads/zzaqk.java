package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzaqk extends zzaph {
    private final Object zza;
    private final zzapm zzb;

    public zzaqk(int i, String str, zzapm zzapmVar, zzapl zzaplVar) {
        super(i, str, zzaplVar);
        this.zza = new Object();
        this.zzb = zzapmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    protected final zzapn zzr(zzapd zzapdVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapdVar.zzb;
            Map map = zzapdVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapdVar.zzb);
        }
        return zzapn.zza(str, zzaqe.zza(zzapdVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaph
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzapm zzapmVar;
        synchronized (this.zza) {
            zzapmVar = this.zzb;
        }
        zzapmVar.zza(str);
    }
}
