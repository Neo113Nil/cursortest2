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
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0869pa f10458a = new C0869pa();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10459b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10460c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f10458a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f10459b.entrySet()) {
                I1 i12 = (I1) entry.getKey();
                if (((H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C0869pa c0869pa = this.f10458a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c0869pa.f12571a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c0869pa.f12572b) {
                        c0869pa.f12571a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f10460c.entrySet()) {
                I1 i12 = (I1) entry.getKey();
                if (((H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i4) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f10458a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f10459b.entrySet()) {
                I1 i12 = (I1) entry.getKey();
                if (((H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i4, int i5) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(I1 i12) {
        this.f10460c.put(i12, new Lo(this, 1));
    }

    public static final boolean a(J1 j12, Intent intent) {
        j12.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) j12.f10458a.f12571a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(I1 i12) {
        this.f10459b.put(i12, new Lo(this, 2));
    }

    public static final boolean c(J1 j12, Intent intent) {
        j12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(I1 i12) {
        this.f10459b.put(i12, new Lo(this, 0));
    }

    public static final boolean b(J1 j12, Intent intent) {
        Collection collection;
        j12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) j12.f10458a.f12571a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !kotlin.jvm.internal.i.a(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            kotlin.jvm.internal.i.b(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
