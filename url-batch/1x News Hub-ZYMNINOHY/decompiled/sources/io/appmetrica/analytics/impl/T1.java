package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0928wa f6678a = new C0928wa();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6679b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6680c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f6678a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f6679b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C0928wa c0928wa = this.f6678a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c0928wa.f8560a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c0928wa.f8561b) {
                        c0928wa.f8560a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f6680c.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i3) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f6678a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f6679b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i3, int i4) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(S1 s12) {
        this.f6680c.put(s12, new Mo(this, 2));
    }

    public static final boolean a(T1 t12, Intent intent) {
        t12.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) t12.f6678a.f8560a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(S1 s12) {
        this.f6679b.put(s12, new Mo(this, 1));
    }

    public static final boolean c(T1 t12, Intent intent) {
        t12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(S1 s12) {
        this.f6679b.put(s12, new Mo(this, 0));
    }

    public static final boolean b(T1 t12, Intent intent) {
        Collection collection;
        t12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) t12.f6678a.f8560a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !kotlin.jvm.internal.j.a(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            kotlin.jvm.internal.j.b(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
