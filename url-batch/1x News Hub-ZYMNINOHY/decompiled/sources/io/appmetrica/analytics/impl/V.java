package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0992yn f6775a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6776b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6777c;

    public V(C0992yn c0992yn, ArrayList arrayList, String str) {
        this.f6775a = c0992yn;
        this.f6776b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f6777c = str;
    }
}
