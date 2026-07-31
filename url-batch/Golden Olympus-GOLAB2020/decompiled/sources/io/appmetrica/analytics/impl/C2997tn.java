package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2997tn {

    /* renamed from: a, reason: collision with root package name */
    public final String f39878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39879b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39880c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39881d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f39882e;

    /* renamed from: f, reason: collision with root package name */
    public final List f39883f;

    public C2997tn(String str, int i4, long j4, String str2, Integer num, List list) {
        this.f39878a = str;
        this.f39879b = i4;
        this.f39880c = j4;
        this.f39881d = str2;
        this.f39882e = num;
        this.f39883f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
