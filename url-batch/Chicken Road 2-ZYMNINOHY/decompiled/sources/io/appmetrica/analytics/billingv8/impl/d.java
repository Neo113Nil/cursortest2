package io.appmetrica.analytics.billingv8.impl;

import E1.AbstractC0028d;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0028d f9603a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9604b = new LinkedHashSet();

    public d(AbstractC0028d abstractC0028d) {
        this.f9603a = abstractC0028d;
    }

    public final void a(Object obj) {
        this.f9604b.remove(obj);
        if (this.f9604b.size() == 0) {
            this.f9603a.c();
        }
    }
}
