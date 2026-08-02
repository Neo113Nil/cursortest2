package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063wn {

    /* renamed from: a, reason: collision with root package name */
    public final String f12981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12982b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12983c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12984d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f12985e;

    /* renamed from: f, reason: collision with root package name */
    public final List f12986f;

    public C1063wn(String str, int i4, long j4, String str2, Integer num, List list) {
        this.f12981a = str;
        this.f12982b = i4;
        this.f12983c = j4;
        this.f12984d = str2;
        this.f12985e = num;
        this.f12986f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
