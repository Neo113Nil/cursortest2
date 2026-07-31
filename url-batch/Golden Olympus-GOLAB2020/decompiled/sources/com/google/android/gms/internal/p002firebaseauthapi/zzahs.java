package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahs implements zzaea<zzahs> {
    private static final String zza = "zzahs";

    public String zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzahs zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzahw) ((zzahs) new zzahw().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzahy) ((zzahs) new zzahy().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e4) {
            e = e4;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e5) {
            e = e5;
            throw zzail.zza(e, zza, str);
        }
    }
}
