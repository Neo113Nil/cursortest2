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
    public final C1079wa f7506a = new C1079wa();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7507b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7508c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f7506a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f7507b.entrySet()) {
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
                C1079wa c1079wa = this.f7506a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c1079wa.f9514a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c1079wa.f9515b) {
                        c1079wa.f9514a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f7508c.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i2) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f7506a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f7507b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i2, int i3) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(S1 s12) {
        this.f7508c.put(s12, new Mo(this, 2));
    }

    public static final boolean a(T1 t1, Intent intent) {
        Collection collection;
        t1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && ((collection = (Collection) t1.f7506a.f9514a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    public final void c(S1 s12) {
        this.f7507b.put(s12, new Mo(this, 1));
    }

    public static final boolean c(T1 t1, Intent intent) {
        t1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(S1 s12) {
        this.f7507b.put(s12, new Mo(this, 0));
    }

    public static final boolean b(T1 t1, Intent intent) {
        Collection collection;
        t1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) t1.f7506a.f9514a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && kotlin.jvm.internal.i.a(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter("pid");
                kotlin.jvm.internal.i.b(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
