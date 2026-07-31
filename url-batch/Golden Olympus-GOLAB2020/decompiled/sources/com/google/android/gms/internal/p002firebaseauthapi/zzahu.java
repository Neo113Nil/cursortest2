package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahu implements zzaea<zzahu> {
    private static final String zza = "zzahu";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahu zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject == null) {
                return this;
            }
            this.zzb = Strings.emptyToNull(optJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e4) {
            throw zzail.zza(e4, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
