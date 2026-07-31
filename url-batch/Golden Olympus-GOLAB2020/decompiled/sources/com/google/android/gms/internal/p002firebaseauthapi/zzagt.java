package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagt implements zzaea<zzagt> {
    private static final String zza = "zzagt";
    private String zzb;
    private zzaj<zzahe> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagt zza(String str) {
        zzaj<zzahe> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzam zzg = zzaj.zzg();
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                        zzg.zza(jSONObject2 == null ? zzahe.zza(null, null) : zzahe.zza(Strings.emptyToNull(jSONObject2.optString(IronSourceConstants.EVENTS_PROVIDER)), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaj.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException e4) {
            e = e4;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e5) {
            e = e5;
            throw zzail.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzaj<zzahe> zzajVar = this.zzc;
        if (zzajVar != null && !zzajVar.isEmpty()) {
            zzaj<zzahe> zzajVar2 = this.zzc;
            int size = zzajVar2.size();
            int i4 = 0;
            while (i4 < size) {
                zzahe zzaheVar = zzajVar2.get(i4);
                i4++;
                zzahe zzaheVar2 = zzaheVar;
                String zza2 = zzaheVar2.zza();
                String zzb = zzaheVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzaheVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
