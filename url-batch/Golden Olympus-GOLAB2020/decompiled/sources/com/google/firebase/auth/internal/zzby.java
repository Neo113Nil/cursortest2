package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzby {
    private Context zza;
    private String zzb;
    private SharedPreferences zzc;
    private Logger zzd;

    public zzby(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zza = context.getApplicationContext();
        this.zzc = this.zza.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.zzb), 0);
        this.zzd = new Logger("StorageHelpers", new String[0]);
    }

    private final String zzc(FirebaseUser firebaseUser) {
        boolean z4;
        JSONObject jSONObject = new JSONObject();
        if (!zzaf.class.isAssignableFrom(firebaseUser.getClass())) {
            return null;
        }
        zzaf zzafVar = (zzaf) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzafVar.zze());
            jSONObject.put("applicationName", zzafVar.zza().getName());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzafVar.zzj() != null) {
                JSONArray jSONArray = new JSONArray();
                List<zzab> zzj = zzafVar.zzj();
                int size = zzj.size();
                if (zzj.size() > 30) {
                    this.zzd.w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(zzj.size()));
                    size = 30;
                }
                int i4 = 0;
                boolean z5 = false;
                while (true) {
                    z4 = true;
                    if (i4 >= size) {
                        break;
                    }
                    zzab zzabVar = zzj.get(i4);
                    if (zzabVar.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                        z5 = true;
                    }
                    if (i4 == size - 1 && !z5) {
                        break;
                    }
                    jSONArray.put(zzabVar.zzb());
                    i4++;
                }
                if (!z5) {
                    for (int i5 = size - 1; i5 < zzj.size() && i5 >= 0; i5++) {
                        zzab zzabVar2 = zzj.get(i5);
                        if (zzabVar2.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                            jSONArray.put(zzabVar2.zzb());
                            break;
                        }
                        if (i5 == zzj.size() - 1) {
                            jSONArray.put(zzabVar2.zzb());
                        }
                    }
                    z4 = z5;
                    if (!z4) {
                        this.zzd.w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(zzj.size()), Integer.valueOf(size));
                        if (zzj.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator<zzab> it = zzj.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", it.next().getProviderId()));
                            }
                            this.zzd.w(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzafVar.isAnonymous());
            jSONObject.put("version", "2");
            if (zzafVar.getMetadata() != null) {
                jSONObject.put("userMetadata", ((zzah) zzafVar.getMetadata()).zza());
            }
            List<MultiFactorInfo> enrolledFactors = ((zzaj) zzafVar.getMultiFactor()).getEnrolledFactors();
            if (enrolledFactors != null && !enrolledFactors.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i6 = 0; i6 < enrolledFactors.size(); i6++) {
                    jSONArray2.put(enrolledFactors.get(i6).toJson());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List<com.google.firebase.auth.zzal> zzf = zzafVar.zzf();
            if (zzf != null && !zzf.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i7 = 0; i7 < zzf.size(); i7++) {
                    jSONArray3.put(com.google.firebase.auth.zzal.zza(zzf.get(i7)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e4) {
            this.zzd.wtf("Failed to turn object into JSON", e4, new Object[0]);
            throw new zzzp(e4);
        }
    }

    public final FirebaseUser zza() {
        String string = this.zzc.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return zza(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void zzb(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String zzc = zzc(firebaseUser);
        if (TextUtils.isEmpty(zzc)) {
            return;
        }
        this.zzc.edit().putString("com.google.firebase.auth.FIREBASE_USER", zzc).apply();
    }

    public final zzagw zza(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String string = this.zzc.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), null);
        if (string != null) {
            return zzagw.zzb(string);
        }
        return null;
    }

    private final zzaf zza(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        MultiFactorInfo zza;
        zzah zza2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z4 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add(zzab.zza(jSONArray3.getString(i4)));
            }
            zzaf zzafVar = new zzaf(FirebaseApp.getInstance(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.zza(zzagw.zzb(string));
            }
            if (!z4) {
                zzafVar.zzb();
            }
            zzafVar.zza(str);
            if (jSONObject.has("userMetadata") && (zza2 = zzah.zza(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.zza(zza2);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i5));
                    String optString = jSONObject2.optString(MultiFactorInfo.FACTOR_ID_KEY);
                    if ("phone".equals(optString)) {
                        zza = PhoneMultiFactorInfo.zza(jSONObject2);
                    } else {
                        zza = Objects.equals(optString, TotpMultiFactorGenerator.FACTOR_ID) ? TotpMultiFactorInfo.zza(jSONObject2) : null;
                    }
                    arrayList2.add(zza);
                }
                zzafVar.zzc(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    arrayList3.add(com.google.firebase.auth.zzal.zza(new JSONObject(jSONArray.getString(i6))));
                }
                zzafVar.zzb(arrayList3);
            }
            return zzafVar;
        } catch (zzzp e4) {
            e = e4;
            this.zzd.wtf(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e5) {
            e = e5;
            this.zzd.wtf(e);
            return null;
        } catch (IllegalArgumentException e6) {
            e = e6;
            this.zzd.wtf(e);
            return null;
        } catch (JSONException e7) {
            e = e7;
            this.zzd.wtf(e);
            return null;
        }
    }

    public final void zza(String str) {
        this.zzc.edit().remove(str).apply();
    }

    public final void zza(FirebaseUser firebaseUser, zzagw zzagwVar) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzagwVar);
        this.zzc.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), zzagwVar.zzf()).apply();
    }
}
