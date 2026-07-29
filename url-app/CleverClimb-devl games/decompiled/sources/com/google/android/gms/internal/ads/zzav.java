package com.google.android.gms.internal.ads;

import com.aiming.mdt.utils.Constants;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class zzav extends zzr<String> {
    private final Object mLock;
    private zzz<String> zzck;

    public zzav(int i, String str, zzz<String> zzzVar, zzy zzyVar) {
        super(i, str, zzyVar);
        this.mLock = new Object();
        this.zzck = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    protected final zzx<String> zza(zzp zzpVar) {
        String str;
        try {
            byte[] bArr = zzpVar.data;
            String str2 = "ISO-8859-1";
            String str3 = zzpVar.zzab.get(Constants.KEY_CONTENT_TYPE);
            if (str3 != null) {
                String[] split = str3.split(";");
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzpVar.data);
        }
        return zzx.zza(str, zzap.zzb(zzpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public void zza(String str) {
        zzz<String> zzzVar;
        synchronized (this.mLock) {
            zzzVar = this.zzck;
        }
        if (zzzVar != null) {
            zzzVar.zzb(str);
        }
    }
}
