package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzciv extends zzhq {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzciv(int i, Map map, zzhf zzhfVar, int i2) {
        super(r0.toString(), zzhfVar, AdError.SERVER_ERROR_CODE, i2);
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
    }
}
