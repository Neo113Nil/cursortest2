package com.google.android.gms.fitness.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: classes3.dex */
public final class zzo {

    @Nullable
    private static String zza = null;
    private static int zzb = -1;

    public static int zza(Context context) {
        int i8 = zzb;
        if (i8 != -1) {
            return i8;
        }
        if (DeviceProperties.isWearable(context)) {
            zzb = 3;
            return 3;
        }
        if (DeviceProperties.isTv(context) || DeviceProperties.isAuto(context)) {
            zzb = 0;
            return 0;
        }
        if (DeviceProperties.isTablet(context.getResources()) && !zzc(context)) {
            zzb = 2;
            return 2;
        }
        String str = Build.PRODUCT;
        int i9 = (TextUtils.isEmpty(str) || !str.startsWith("glass_")) ? 1 : 6;
        zzb = i9;
        return i9;
    }

    @SuppressLint({"HardwareIds"})
    public static String zzb(Context context) {
        String str = zza;
        if (str != null) {
            return str;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        zza = string;
        return string;
    }

    private static boolean zzc(Context context) {
        try {
            return ((TelephonyManager) Preconditions.checkNotNull((TelephonyManager) context.getSystemService("phone"))).getPhoneType() != 0;
        } catch (Resources.NotFoundException e8) {
            Log.e("Fitness", "Unable to determine type of device, assuming phone.", e8);
            return true;
        }
    }
}
