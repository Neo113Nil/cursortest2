package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143yn {

    /* renamed from: a, reason: collision with root package name */
    public final String f9605a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9606b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9607c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9608d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f9609e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9610f;

    public C1143yn(String str, int i2, long j2, String str2, Integer num, List list) {
        this.f9605a = str;
        this.f9606b = i2;
        this.f9607c = j2;
        this.f9608d = str2;
        this.f9609e = num;
        this.f9610f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}
