package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2906q9 extends AbstractC2931r9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f39651a;

    public C2906q9(List<Object> list) {
        this.f39651a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f39651a;
    }
}
