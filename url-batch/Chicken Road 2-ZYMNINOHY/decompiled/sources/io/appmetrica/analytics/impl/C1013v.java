package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013v implements InterfaceC1039w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12861a;

    public C1013v(Context context) {
        this.f12861a = context;
    }

    public final String a() {
        C0501b4 l4 = C0501b4.l();
        Context context = this.f12861a;
        M9 m9 = l4.f11472t;
        if (m9 == null) {
            synchronized (l4) {
                try {
                    m9 = l4.f11472t;
                    if (m9 == null) {
                        m9 = new M9(context);
                        l4.f11472t = m9;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = m9.f10640d.getApplicationMetaData(m9.f10637a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
