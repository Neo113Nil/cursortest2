package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0638xn f1082a;
    public final List b;
    public final String c;

    public V(C0638xn c0638xn, ArrayList arrayList, String str) {
        this.f1082a = c0638xn;
        this.b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.c = str;
    }
}
