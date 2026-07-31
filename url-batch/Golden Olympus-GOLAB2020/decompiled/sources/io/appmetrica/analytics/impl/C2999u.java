package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2999u implements InterfaceC3025v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39888a;

    public C2999u(@NotNull Context context) {
        this.f39888a = context;
    }

    @Nullable
    public final String a() {
        C3082x4 l4 = C3082x4.l();
        Context context = this.f39888a;
        C2674ha c2674ha = l4.f40135t;
        if (c2674ha == null) {
            synchronized (l4) {
                try {
                    c2674ha = l4.f40135t;
                    if (c2674ha == null) {
                        c2674ha = new C2674ha(context);
                        l4.f40135t = c2674ha;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = c2674ha.f39138d.getApplicationMetaData(c2674ha.f39135a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
