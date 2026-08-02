package io.appmetrica.analytics.billingv6.impl;

import E1.AbstractC0028d;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0028d f9550a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9551b = new LinkedHashSet();

    public d(AbstractC0028d abstractC0028d) {
        this.f9550a = abstractC0028d;
    }

    public final void a(Object obj) {
        this.f9551b.remove(obj);
        if (this.f9551b.size() == 0) {
            this.f9550a.c();
        }
    }
}
