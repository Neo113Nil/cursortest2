package com.google.android.gms.common;

import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        super(i, r2.toString());
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + LocationRequestCompat.QUALITY_LOW_POWER + String.valueOf(i).length() + 194);
        sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb.append(i2);
        sb.append(" but found ");
        sb.append(i);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
