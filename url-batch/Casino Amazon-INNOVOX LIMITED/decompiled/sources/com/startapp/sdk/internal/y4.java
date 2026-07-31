package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class y4 implements b7 {
    @Override // com.startapp.sdk.internal.b7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        List list = (List) obj2;
        TrackingParams trackingParams = (TrackingParams) obj3;
        if (context == null || list == null) {
            return null;
        }
        return new m8(context, list, trackingParams, new x4());
    }
}
