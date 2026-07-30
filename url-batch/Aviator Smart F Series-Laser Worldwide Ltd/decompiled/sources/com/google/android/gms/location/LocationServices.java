package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzbb;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzcm;
import com.google.android.gms.internal.location.zzco;
import com.google.android.gms.internal.location.zzcu;
import com.google.android.gms.internal.location.zzcv;

/* loaded from: classes3.dex */
public class LocationServices {

    @NonNull
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = zzbi.zzb;

    @NonNull
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new zzbb();

    @NonNull
    @Deprecated
    public static final GeofencingApi GeofencingApi = new zzcm();

    @NonNull
    @Deprecated
    public static final SettingsApi SettingsApi = new zzcu();

    private LocationServices() {
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Activity activity) {
        return new zzbi(activity);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Activity activity) {
        return new zzco(activity);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Activity activity) {
        return new zzcv(activity);
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Context context) {
        return new zzbi(context);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Context context) {
        return new zzco(context);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Context context) {
        return new zzcv(context);
    }
}
