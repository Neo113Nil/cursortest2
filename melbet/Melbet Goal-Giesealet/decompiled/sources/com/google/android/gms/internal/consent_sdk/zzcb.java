package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
final class zzcb implements zzd {
    private final Application zza;
    private final zzbx zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbc zzg;
    private final zzaq zzh;

    zzcb(Application application, zzbx zzbxVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbc zzbcVar, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbxVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbcVar;
        this.zzh = zzaqVar;
    }

    public static /* synthetic */ void zzc(zzcb zzcbVar) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = zzcbVar.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcbVar.zzh;
            for (String str : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str, zzaqVar.zzc().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcbVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void zzg(JSONObject jSONObject) {
        String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r3.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r3.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r3.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(String str, JSONObject jSONObject) {
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    this.zzg.zzi();
                    break;
                }
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    zzd();
                    break;
                }
                break;
            case 150940456:
                if (str.equals("browser")) {
                    zzg(jSONObject);
                    break;
                }
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    String optString = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                    switch (optString.hashCode()) {
                        case -954325659:
                            break;
                        case -258041904:
                            break;
                        case 429411856:
                            break;
                        case 467888915:
                            break;
                        case 1666911234:
                            break;
                        case 1725474845:
                            if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                int i = 1;
                                this.zzg.zzg(i);
                                break;
                            }
                            this.zzg.zzh(new zzg(1, "We are getting something wrong with the webview."));
                            break;
                        default:
                            this.zzg.zzh(new zzg(1, "We are getting something wrong with the webview."));
                            break;
                    }
                }
                break;
        }
        return true;
    }

    public final void zzd() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzca
            @Override // java.lang.Runnable
            public final void run() {
                zzcb.zzc(zzcb.this);
            }
        });
    }

    final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.zze.zzb(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    final void zzf(int i, String str, String str2) {
        this.zzg.zzj(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }
}
