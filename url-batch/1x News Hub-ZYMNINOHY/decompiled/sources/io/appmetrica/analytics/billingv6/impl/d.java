package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashSet;
import n0.AbstractC1142d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1142d f5305a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f5306b = new LinkedHashSet();

    public d(AbstractC1142d abstractC1142d) {
        this.f5305a = abstractC1142d;
    }

    public final void a(Object obj) {
        this.f5306b.remove(obj);
        if (this.f5306b.size() == 0) {
            this.f5305a.a();
        }
    }
}
