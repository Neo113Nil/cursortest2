package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C1063wn f11074a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11076c;

    public V(C1063wn c1063wn, ArrayList arrayList, String str) {
        this.f11074a = c1063wn;
        this.f11075b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f11076c = str;
    }
}
