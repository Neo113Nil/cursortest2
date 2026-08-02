package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992yn {

    /* renamed from: a, reason: collision with root package name */
    public final String f8649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8650b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8651c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8652d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f8653e;
    public final List f;

    public C0992yn(String str, int i3, long j3, String str2, Integer num, List list) {
        this.f8649a = str;
        this.f8650b = i3;
        this.f8651c = j3;
        this.f8652d = str2;
        this.f8653e = num;
        this.f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
