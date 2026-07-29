package com.tapjoy;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* loaded from: classes2.dex */
public class TapjoyGpsHelper {

    /* renamed from: a, reason: collision with root package name */
    private Context f7779a;

    /* renamed from: b, reason: collision with root package name */
    private String f7780b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7781c;

    /* renamed from: d, reason: collision with root package name */
    private int f7782d = 0;
    private int e = 0;
    private boolean f;
    private Boolean g;
    private Boolean h;

    public TapjoyGpsHelper(Context context) {
        this.f7779a = context;
    }

    public void loadAdvertisingId(boolean z) {
        TapjoyLog.i("TapjoyGpsHelper", "Looking for Google Play Services...");
        if (isGooglePlayServicesAvailable() && isGooglePlayManifestConfigured()) {
            TapjoyLog.i("TapjoyGpsHelper", "Packaged Google Play Services found, fetching advertisingID...");
            TapjoyLog.i("TapjoyGpsHelper", "Packaged Google Play Services version: " + this.e);
            TapjoyAdIdClient tapjoyAdIdClient = new TapjoyAdIdClient(this.f7779a);
            this.f = tapjoyAdIdClient.setupAdIdInfo();
            try {
                this.f7782d = this.f7779a.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                TapjoyLog.i("TapjoyGpsHelper", "Device's Google Play Services version: " + this.f7782d);
            } catch (Exception unused) {
                TapjoyLog.i("TapjoyGpsHelper", "Error getting device's Google Play Services version");
            }
            if (this.f) {
                this.f7781c = tapjoyAdIdClient.isAdTrackingEnabled();
                this.f7780b = tapjoyAdIdClient.getAdvertisingId();
                TapjoyLog.i("TapjoyGpsHelper", "Found advertising ID: " + this.f7780b);
                TapjoyLog.i("TapjoyGpsHelper", "Is ad tracking enabled: " + Boolean.toString(this.f7781c));
                return;
            }
            TapjoyLog.i("TapjoyGpsHelper", "Error getting advertisingID from Google Play Services");
            if (z) {
                this.f7781c = false;
                this.f7780b = "00000000-0000-0000-0000-000000000000";
                this.f = true;
                return;
            }
            return;
        }
        TapjoyLog.i("TapjoyGpsHelper", "Google Play Services not found");
    }

    public void checkGooglePlayIntegration() {
        if (!isGooglePlayServicesAvailable()) {
            throw new TapjoyIntegrationException("Tapjoy SDK is disabled because Google Play Services was not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
        if (!isGooglePlayManifestConfigured()) {
            throw new TapjoyIntegrationException("Failed to load manifest.xml meta-data, 'com.google.android.gms.version' not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
    }

    public boolean isGooglePlayServicesAvailable() {
        if (this.g == null) {
            try {
                this.f7779a.getClassLoader().loadClass("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                this.g = true;
            } catch (Error unused) {
                this.g = false;
            } catch (Exception unused2) {
                this.g = false;
            }
        }
        return this.g.booleanValue();
    }

    public boolean isGooglePlayManifestConfigured() {
        if (this.h == null) {
            try {
                this.e = this.f7779a.getPackageManager().getApplicationInfo(this.f7779a.getPackageName(), 128).metaData.getInt(GooglePlayServicesUtilLight.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION);
                this.h = true;
            } catch (Exception unused) {
                this.h = false;
            }
        }
        return this.h.booleanValue();
    }

    public String getAdvertisingId() {
        return this.f7780b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f7781c;
    }

    public boolean isAdIdAvailable() {
        return this.f;
    }

    public int getDeviceGooglePlayServicesVersion() {
        return this.f7782d;
    }

    public int getPackagedGooglePlayServicesVersion() {
        return this.e;
    }
}
