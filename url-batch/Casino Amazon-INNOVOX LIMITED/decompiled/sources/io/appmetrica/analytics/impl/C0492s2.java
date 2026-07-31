package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0492s2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f1476a;

    public C0492s2(Context context) {
        this((LocationManager) context.getSystemService(InAppMessagePromptTypes.LOCATION_PROMPT_KEY));
    }

    public C0492s2(LocationManager locationManager) {
        this.f1476a = locationManager;
    }
}
