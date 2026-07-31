package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqr;
import com.ironsource.cc;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzho {
    final /* synthetic */ zzht zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzho(zzht zzhtVar, String str, Bundle bundle) {
        this.zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    public final Bundle zza() {
        char c4;
        if (this.zzd == null) {
            zzht zzhtVar = this.zza;
            String string = zzhtVar.zzb().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            String string2 = jSONObject.getString(cc.f15745q);
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c4 = 1;
                                }
                                c4 = 65535;
                            } else if (hashCode == 108) {
                                if (string3.equals("l")) {
                                    c4 = 2;
                                }
                                c4 = 65535;
                            } else if (hashCode == 115) {
                                if (string3.equals("s")) {
                                    c4 = 0;
                                }
                                c4 = 65535;
                            } else if (hashCode != 3352) {
                                if (hashCode == 3445 && string3.equals("la")) {
                                    c4 = 4;
                                }
                                c4 = 65535;
                            } else {
                                if (string3.equals("ia")) {
                                    c4 = 3;
                                }
                                c4 = 65535;
                            }
                            if (c4 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c4 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c4 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (c4 == 3) {
                                zzqr.zzb();
                                if (zzhtVar.zzu.zzf().zzx(null, zzgi.zzaW)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        iArr[i5] = jSONArray2.optInt(i5);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (c4 != 4) {
                                zzhtVar.zzu.zzaW().zze().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzqr.zzb();
                                if (zzhtVar.zzu.zzf().zzx(null, zzgi.zzaW)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i6 = 0; i6 < length2; i6++) {
                                        jArr[i6] = jSONArray3.optLong(i6);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaW().zze().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    this.zza.zzu.zzaW().zze().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzht zzhtVar = this.zza;
        SharedPreferences.Editor edit = zzhtVar.zzb().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(cc.f15745q, str2);
                        zzqr.zzb();
                        zzio zzioVar = zzhtVar.zzu;
                        if (!zzioVar.zzf().zzx(null, zzgi.zzaW)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzioVar.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            zzioVar.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e4) {
                        this.zza.zzu.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences", e4);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle2;
    }
}
