package com.onesignal.location.internal.controller.impl;

import B1.l;
import B1.m;
import E1.c;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.debug.internal.logging.Logging;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.i;
import o1.u;

/* loaded from: classes.dex */
public final class FusedLocationApiWrapperImpl implements IFusedLocationApiWrapper {
    @Override // com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, E1.b locationListener) {
        i.e(googleApiClient, "googleApiClient");
        i.e(locationListener, "locationListener");
        if (!googleApiClient.f()) {
            Logging.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        } else {
            c.f642b.getClass();
            googleApiClient.a(new m(googleApiClient, locationListener));
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        String str;
        i.e(googleApiClient, "googleApiClient");
        if (!googleApiClient.f()) {
            return null;
        }
        c.f642b.getClass();
        B1.i iVar = (B1.i) googleApiClient.c();
        u.i("GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.", iVar != null);
        Context d6 = googleApiClient.d();
        try {
            if (Build.VERSION.SDK_INT >= 30 && d6 != null) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", null).invoke(d6, null);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return iVar.A(str);
            }
            return iVar.A(str);
        } catch (Exception unused2) {
            return null;
        }
        str = null;
    }

    @Override // com.onesignal.location.internal.controller.impl.IFusedLocationApiWrapper
    public void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, E1.b locationListener) {
        i.e(googleApiClient, "googleApiClient");
        i.e(locationRequest, "locationRequest");
        i.e(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.f()) {
                c.f642b.getClass();
                u.h(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                googleApiClient.a(new l(googleApiClient, locationRequest, locationListener));
            }
        } catch (Throwable th) {
            Logging.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
