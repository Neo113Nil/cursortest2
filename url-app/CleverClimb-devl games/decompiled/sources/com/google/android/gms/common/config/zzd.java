package com.google.android.gms.common.config;

import android.content.Context;
import com.google.android.gms.common.config.GservicesValue;

/* loaded from: classes.dex */
final class zzd extends GservicesValue<Double> {
    zzd(String str, Double d2) {
        super(str, d2);
    }

    private static Double zza(Context context, String str, Double d2) {
        String string = context.getSharedPreferences("gservices-direboot-cache", 0).getString(str, null);
        if (string != null) {
            try {
                return Double.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
            }
        }
        return d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.config.GservicesValue
    protected final /* synthetic */ Double retrieve(String str) {
        GservicesValue.zza zzaVar;
        zzaVar = GservicesValue.zzmu;
        return zzaVar.zza(this.mKey, (Double) this.mDefaultValue);
    }

    @Override // com.google.android.gms.common.config.GservicesValue
    protected final /* synthetic */ Double retrieveFromDirectBootCache(Context context, String str, Double d2) {
        return zza(context, str, d2);
    }
}
