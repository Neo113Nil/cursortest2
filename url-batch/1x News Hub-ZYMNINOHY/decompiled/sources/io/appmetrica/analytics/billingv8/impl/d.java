package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashSet;
import n0.AbstractC1142d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1142d f5354a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f5355b = new LinkedHashSet();

    public d(AbstractC1142d abstractC1142d) {
        this.f5354a = abstractC1142d;
    }

    public final void a(Object obj) {
        this.f5355b.remove(obj);
        if (this.f5355b.size() == 0) {
            this.f5354a.a();
        }
    }
}
