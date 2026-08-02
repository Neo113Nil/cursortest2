package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public LocationFilter f8768a;

    /* renamed from: d, reason: collision with root package name */
    public Location f8771d;

    /* renamed from: e, reason: collision with root package name */
    public long f8772e;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f8770c = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f8769b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f8768a = locationFilter;
    }
}
