package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class k54 {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f7388d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final li1 f7389a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7390b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f7391c;

    public k54(long j7, li1 li1Var, Uri uri, Map<String, List<String>> map, long j8, long j9, long j10) {
        this.f7389a = li1Var;
        this.f7390b = uri;
        this.f7391c = map;
    }

    public static long a() {
        return f7388d.getAndIncrement();
    }
}
