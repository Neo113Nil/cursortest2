package com.crrepa.band.my.training.map.google;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationServices;
import com.orhanobut.logger.f;

/* loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static boolean isGoogleAvalible() {
        int i8 = -1;
        try {
            i8 = Runtime.getRuntime().exec("ping -c 3 www.google.com").waitFor();
            f.d("GoogleApiHelper isGoogleAvalible: " + i8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return i8 == 0;
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        try {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            f.d("GoogleApiHelper isGooglePlayServicesAvailable: " + isGooglePlayServicesAvailable);
            if (isGooglePlayServicesAvailable != 0) {
                return false;
            }
            return LocationServices.getFusedLocationProviderClient(context) != null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
