package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891v implements InterfaceC0917w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8474a;

    public C0891v(Context context) {
        this.f8474a = context;
    }

    public final String a() {
        C0585j4 l3 = C0585j4.l();
        Context context = this.f8474a;
        T9 t9 = l3.f7609t;
        if (t9 == null) {
            synchronized (l3) {
                try {
                    t9 = l3.f7609t;
                    if (t9 == null) {
                        t9 = new T9(context);
                        l3.f7609t = t9;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = t9.f6698d.getApplicationMetaData(t9.f6695a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
