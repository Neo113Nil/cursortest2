package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzal;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagm implements zzaea<zzagm> {
    private static final String zza = "zzagm";
    private zzago zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) {
        zzago zzagoVar;
        int i4;
        zzagl zzaglVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z4 = false;
                    int i5 = 0;
                    while (i5 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                        if (jSONObject2 == null) {
                            zzaglVar = new zzagl();
                            i4 = i5;
                        } else {
                            i4 = i5;
                            zzaglVar = new zzagl(Strings.emptyToNull(jSONObject2.optString("localId", null)), Strings.emptyToNull(jSONObject2.optString(Scopes.EMAIL, null)), jSONObject2.optBoolean("emailVerified", z4), Strings.emptyToNull(jSONObject2.optString("displayName", null)), Strings.emptyToNull(jSONObject2.optString("photoUrl", null)), zzahb.zza(jSONObject2.optJSONArray("providerUserInfo")), Strings.emptyToNull(jSONObject2.optString("rawPassword", null)), Strings.emptyToNull(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzagz.zza(jSONObject2.optJSONArray("mfaInfo")), zzal.zza(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzaglVar);
                        i5 = i4 + 1;
                        z4 = false;
                    }
                    zzagoVar = new zzago(arrayList);
                }
                zzagoVar = new zzago(new ArrayList());
            } else {
                zzagoVar = new zzago();
            }
            this.zzb = zzagoVar;
            return this;
        } catch (NullPointerException e4) {
            e = e4;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e5) {
            e = e5;
            throw zzail.zza(e, zza, str);
        }
    }

    public final List<zzagl> zza() {
        return this.zzb.zza();
    }
}
