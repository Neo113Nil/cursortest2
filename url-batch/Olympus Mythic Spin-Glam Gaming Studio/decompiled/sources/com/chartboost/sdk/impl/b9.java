package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.mobilefuse.sdk.MobileFuseDefaults;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b9 extends i1 {
    public final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = context;
    }

    public h1 b() {
        String str = null;
        if (a()) {
            return new h1(xi.e, null);
        }
        xi xiVar = xi.c;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.b);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                xiVar = xi.e;
            } else {
                xiVar = xi.d;
                String id = advertisingIdInfo.getId();
                try {
                    if (Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, id)) {
                        xiVar = xi.e;
                    } else {
                        str = id;
                    }
                } catch (GooglePlayServicesNotAvailableException e) {
                    e = e;
                    str = id;
                    xb.b("Google play service is not available.", e);
                    return new h1(xiVar, str);
                } catch (GooglePlayServicesRepairableException e2) {
                    e = e2;
                    str = id;
                    xb.b("There was a recoverable error connecting to Google Play Services.", e);
                    return new h1(xiVar, str);
                } catch (IOException e3) {
                    e = e3;
                    str = id;
                    xb.b("The connection to Google Play Services failed.", e);
                    return new h1(xiVar, str);
                } catch (IllegalStateException e4) {
                    e = e4;
                    str = id;
                    xb.b("This should have been called off the main thread.", e);
                    return new h1(xiVar, str);
                } catch (NoClassDefFoundError e5) {
                    e = e5;
                    str = id;
                    xb.b("Google play service is accessing a class that doesn't exist on this version of Android.", e);
                    return new h1(xiVar, str);
                }
            }
        } catch (GooglePlayServicesNotAvailableException e6) {
            e = e6;
        } catch (GooglePlayServicesRepairableException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        } catch (IllegalStateException e9) {
            e = e9;
        } catch (NoClassDefFoundError e10) {
            e = e10;
        }
        return new h1(xiVar, str);
    }
}
