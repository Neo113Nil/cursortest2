package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbor {
    private static final Charset zzc = Charset.forName(Key.STRING_CHARSET_NAME);
    public static final zzboo zza = new zzboq();
    public static final zzbom zzb = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbop
        @Override // com.google.android.gms.internal.ads.zzbom
        public final Object zza(JSONObject jSONObject) {
            return zzbor.zza(jSONObject);
        }
    };

    static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
