package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import io.invertase.googlemobileads.BuildConfig;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfct {
    public final List zza;
    public final zzfcm zzb;
    public final List zzc;
    public final Bundle zzd;

    zzfct(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && bundle != null) {
            bundle.putLong(zzdru.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfcm zzfcmVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfcj(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfcmVar = new zzfcm(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcs)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdru.NORMALIZATION_AD_RESPONSE_START.zza(), zzfcmVar.zzs);
                            bundle.putLong(zzdru.NORMALIZATION_AD_RESPONSE_END.zza(), zzfcmVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfcs(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfcmVar == null ? new zzfcm(new JsonReader(new StringReader(BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW))) : zzfcmVar;
    }

    public static zzfct zza(Reader reader, Bundle bundle) throws zzfcn {
        try {
            try {
                return new zzfct(new JsonReader(reader), bundle);
            } finally {
                IOUtils.closeQuietly(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfcn("unable to parse ServerResponse", e);
        }
    }
}
