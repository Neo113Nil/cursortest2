package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q32 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final HashSet f30650c = new HashSet(CollectionsKt.listOf("gps"));

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final HashSet f30651d = new HashSet(CollectionsKt.listOf((Object[]) new String[]{"gps", "passive"}));

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final LocationManager f30652a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lg1 f30653b;

    public /* synthetic */ q32(Context context, LocationManager locationManager) {
        this(context, locationManager, new lg1(context));
    }

    @Nullable
    public final Location a(@NotNull String locationProvider) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        boolean a4 = this.f30653b.a();
        boolean b4 = this.f30653b.b();
        boolean contains = f30650c.contains(locationProvider);
        if (!f30651d.contains(locationProvider) ? !(contains || !a4) : !(contains || !a4 || !b4)) {
            try {
                LocationManager locationManager = this.f30652a;
                if (locationManager != null) {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);
                    ap0.a(locationProvider, lastKnownLocation);
                    return lastKnownLocation;
                }
            } catch (Throwable unused) {
                ap0.b(new Object[0]);
            }
        }
        return null;
    }

    public q32(@NotNull Context context, @Nullable LocationManager locationManager, @NotNull lg1 permissionExtractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionExtractor, "permissionExtractor");
        this.f30652a = locationManager;
        this.f30653b = permissionExtractor;
    }
}
