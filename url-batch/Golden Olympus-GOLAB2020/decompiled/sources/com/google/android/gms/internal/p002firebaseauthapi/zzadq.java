package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzao;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.ironsource.b9;
import com.ironsource.cc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes.dex */
public final class zzadq extends AsyncTask<Void, Void, zzadt> {
    private static final Logger zza = new Logger("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzads> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final FirebaseApp zzg;

    public zzadq(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzads zzadsVar) {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String checkNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzadsVar.zza(checkNotEmpty)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(b9.h.f15463W, checkNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadsVar);
        this.zze = zzadsVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadt doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzads zzadsVar = this.zzd.get();
            HttpURLConnection zza2 = zzadsVar.zza(url);
            zza2.addRequestProperty(cc.f15718K, "application/json; charset=UTF-8");
            zza2.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            new zzaef(zzadsVar.zza(), this.zzg, zzaed.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.e(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzadt.zzb(zza3);
            }
            zzagr zzagrVar = new zzagr();
            zzagrVar.zza(new String(zza(zza2.getInputStream(), UserVerificationMethods.USER_VERIFY_PATTERN)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagrVar.zza().contains(this.zzf) ? zzadt.zzb("UNAUTHORIZED_DOMAIN") : zzadt.zza(this.zzf);
            }
            for (String str : zzagrVar.zza()) {
                if (zza(str)) {
                    return zzadt.zza(str);
                }
            }
            return null;
        } catch (zzabr e4) {
            zza.e("ConversionException encountered: " + e4.getMessage(), new Object[0]);
            return null;
        } catch (IOException e5) {
            zza.e("IOException occurred: " + e5.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e6) {
            zza.e("Null pointer encountered: " + e6.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzadt zzadtVar) {
        onPostExecute((zzadt) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzady.zza(new String(zza(errorStream, UserVerificationMethods.USER_VERIFY_PATTERN)), String.class);
        } catch (IOException e4) {
            zza.w("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e4), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadt zzadtVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzads zzadsVar = this.zzd.get();
        if (zzadtVar != null) {
            str = zzadtVar.zza();
            str2 = zzadtVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzadsVar == null) {
            zza.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzadsVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).zzc());
        } else {
            zzadsVar.zza(this.zzb, zzao.zza(str2));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e4) {
            zza.e("Error parsing URL for auth domain check: " + str + ". " + e4.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
