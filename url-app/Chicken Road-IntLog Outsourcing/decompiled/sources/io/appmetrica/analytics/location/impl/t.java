package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public LocationFilter f9733a;

    /* renamed from: d, reason: collision with root package name */
    public Location f9736d;

    /* renamed from: e, reason: collision with root package name */
    public long f9737e;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f9735c = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f9734b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f9733a = locationFilter;
    }
}
