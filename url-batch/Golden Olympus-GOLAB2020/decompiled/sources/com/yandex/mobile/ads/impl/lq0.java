package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lq0 implements gs0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final is0 f28710a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final LocationManager f28711b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q32 f28712c;

    public lq0(@NotNull Context context, @NotNull is0 locationSelector) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationSelector, "locationSelector");
        this.f28710a = locationSelector;
        Object systemService = context.getApplicationContext().getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.f28711b = locationManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f28712c = new q32(applicationContext, locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.yandex.mobile.ads.impl.gs0
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location a() {
        List<String> list;
        LocationManager locationManager;
        try {
            locationManager = this.f28711b;
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
        if (locationManager != null) {
            list = locationManager.getAllProviders();
            if (list != null) {
                return null;
            }
            List createListBuilder = CollectionsKt.createListBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Location a4 = this.f28712c.a(it.next());
                if (a4 != null) {
                    createListBuilder.add(a4);
                }
            }
            return this.f28710a.a(CollectionsKt.build(createListBuilder));
        }
        list = null;
        if (list != null) {
        }
    }
}
