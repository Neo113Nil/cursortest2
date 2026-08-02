package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410c9 extends AbstractC0436d9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7131a;

    public C0410c9(List<Object> list) {
        this.f7131a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f7131a;
    }
}
