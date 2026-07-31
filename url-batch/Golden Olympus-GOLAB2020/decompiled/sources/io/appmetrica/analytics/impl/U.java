package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C2997tn f38337a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38338b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38339c;

    public U(C2997tn c2997tn, ArrayList arrayList, String str) {
        this.f38337a = c2997tn;
        this.f38338b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f38339c = str;
    }
}
