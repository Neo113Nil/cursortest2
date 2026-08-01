package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.browser.trusted.sharing.ShareTarget;
import com.bumptech.glide.load.Key;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
final class zzx {
    private final Application zza;
    private final zzae zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzas zze;
    private final zzbq zzf;
    private final zzn zzg;
    private final zzaa zzh;
    private final zzg zzi;

    zzx(Application application, zzae zzaeVar, Handler handler, Executor executor, zzas zzasVar, zzbq zzbqVar, zzn zznVar, zzaa zzaaVar, zzg zzgVar) {
        this.zza = application;
        this.zzb = zzaeVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzasVar;
        this.zzf = zzbqVar;
        this.zzg = zznVar;
        this.zzh = zzaaVar;
        this.zzi = zzgVar;
    }

    private final zzcm zzd(zzck zzckVar) throws zzi {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Key.STRING_CHARSET_NAME);
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzckVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = zzckVar.zzb;
                    if (str2 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str2);
                    }
                    zzcg zzcgVar = zzckVar.zzc;
                    if (zzcgVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzcgVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = zzcgVar.zza;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = zzcgVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = zzckVar.zzd;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = zzckVar.zze;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzckVar.zzf;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzci zzciVar = zzckVar.zzg;
                    if (zzciVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzciVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzciVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = zzciVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzch> list = zzciVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzch zzchVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzchVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzchVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzchVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzchVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzce zzceVar = zzckVar.zzh;
                    if (zzceVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = zzceVar.zza;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzceVar.zzb;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzceVar.zzc;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    zzcj zzcjVar = zzckVar.zzi;
                    if (zzcjVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = zzcjVar.zza;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzckVar.zzj;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int ordinal = ((zzcf) it.next()).ordinal();
                            if (ordinal == 0) {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            } else if (ordinal == 1) {
                                jsonWriter.value("ALWAYS_SHOW");
                            } else if (ordinal == 2) {
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                            } else if (ordinal == 3) {
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            } else if (ordinal == 4) {
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcm zza = zzcm.zza(new JsonReader(new StringReader(headerField)));
                        zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Key.STRING_CHARSET_NAME));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcm zza2 = zzcm.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zza2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new zzi(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzi(2, "Error making request.", e2);
        }
    }

    final /* synthetic */ void zza(final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzac zzacVar) {
        Handler handler = this.zzc;
        onConsentInfoUpdateSuccessListener.getClass();
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                ConsentInformation.OnConsentInfoUpdateSuccessListener.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzacVar.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzb(Activity activity, ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzcn.zza(this.zza) + "\") to set this as a debug device.");
            }
            final zzac zza = new zzz(this.zzh, zzd(this.zzg.zzd(activity, consentRequestParameters))).zza();
            this.zze.zzg(zza.zza);
            this.zze.zzh(zza.zzb);
            this.zzf.zzd(zza.zzc);
            this.zzi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    zzx.this.zza(onConsentInfoUpdateSuccessListener, zza);
                }
            });
        } catch (zzi e) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(e.zza());
                }
            });
        } catch (RuntimeException e2) {
            final zzi zziVar = new zzi(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.OnConsentInfoUpdateFailureListener.this.onConsentInfoUpdateFailure(zziVar.zza());
                }
            });
        }
    }

    final void zzc(final Activity activity, final ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzx.this.zzb(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
            }
        });
    }
}
