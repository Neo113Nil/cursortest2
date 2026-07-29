package com.chartboost.sdk.Libraries;

import android.content.Context;
import com.chartboost.sdk.impl.s;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f3569a;

    /* renamed from: b, reason: collision with root package name */
    public String f3570b;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context) {
        AdvertisingIdClient.Info info;
        try {
            info = s.a().a(context);
        } catch (GooglePlayServicesNotAvailableException unused) {
            info = null;
            if (info == null) {
            }
        } catch (GooglePlayServicesRepairableException unused2) {
            CBLogging.b("ContentValues", "There was a recoverable error connecting to Google Play Services.");
            info = null;
            if (info == null) {
            }
        } catch (IOException unused3) {
            CBLogging.b("ContentValues", "The connection to Google Play Services failed.");
            info = null;
            if (info == null) {
            }
        } catch (IllegalStateException unused4) {
            CBLogging.b("ContentValues", "This should have been called off the main thread.");
            info = null;
            if (info == null) {
            }
        }
        if (info == null) {
            this.f3569a = -1;
            this.f3570b = null;
        } else if (info.isLimitAdTrackingEnabled()) {
            this.f3569a = 1;
            this.f3570b = null;
        } else {
            this.f3569a = 0;
            this.f3570b = info.getId();
        }
    }
}
