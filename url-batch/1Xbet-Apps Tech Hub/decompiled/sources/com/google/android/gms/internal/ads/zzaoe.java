package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzaoe extends zzana {
    private final Object zza;
    private final zzanf zzb;

    public zzaoe(int i, String str, zzanf zzanfVar, zzane zzaneVar) {
        super(i, str, zzaneVar);
        this.zza = new Object();
        this.zzb = zzanfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    protected final zzang zzh(zzamw zzamwVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzamwVar.zzb;
            Map map = zzamwVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals(HttpAuthHeader.Parameters.Charset)) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzamwVar.zzb);
        }
        return zzang.zzb(str, zzanx.zzb(zzamwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzanf zzanfVar;
        synchronized (this.zza) {
            zzanfVar = this.zzb;
        }
        zzanfVar.zza(str);
    }
}
