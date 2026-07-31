package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public LocationFilter f40466a;

    /* renamed from: d, reason: collision with root package name */
    public Location f40469d;

    /* renamed from: e, reason: collision with root package name */
    public long f40470e;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f40468c = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f40467b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f40466a = locationFilter;
    }
}
