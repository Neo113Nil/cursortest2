package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import java.security.MessageDigest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class RealDeviceVendorIDProvider implements DeviceVendorIDProvider {
    public final String androidId;
    public String appSetId;
    public final Context context;
    public final Lazy prefs$delegate;

    public RealDeviceVendorIDProvider(Context context) {
        context.getClass();
        this.context = context;
        Lazy lazy = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 5));
        this.prefs$delegate = lazy;
        String string2 = ((SharedPreferences) lazy.getValue()).getString("ANDROID_ID", null);
        if (string2 == null || StringsKt.isBlank(string2)) {
            String string3 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string3 == null || StringsKt.isBlank(string3)) {
                string2 = "";
            } else {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                String str = Build.MODEL;
                str.getClass();
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                byte[] digest = messageDigest.digest(bytes);
                digest.getClass();
                string2 = string3.concat(ArraysKt___ArraysKt.joinToString$default(digest, "", new EncodeKt$$ExternalSyntheticLambda0(22), 30));
                ((SharedPreferences) lazy.getValue()).edit().putString("ANDROID_ID", string2).apply();
            }
        }
        this.androidId = string2;
        this.appSetId = "";
    }

    public final void refreshDeviceVendorId() {
        if (StringsKt.isBlank(this.androidId)) {
            new zzr(this.context).getAppSetIdInfo().addOnSuccessListener(new MaterialButton$$ExternalSyntheticLambda3(new HCaptcha$$ExternalSyntheticLambda2(this, 7), 28));
        }
    }
}
