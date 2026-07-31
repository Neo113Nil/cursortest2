package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Ka f38149a = new Ka();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38150b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f38151c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f38149a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f38150b.entrySet()) {
                P1 p12 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p12.a(intent);
                }
            }
        }
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Ka ka = this.f38149a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) ka.f37877a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && ka.f37878b) {
                        ka.f37877a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f38151c.entrySet()) {
                P1 p12 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i4) {
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f38149a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f38150b.entrySet()) {
                P1 p12 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i4, int i5) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull P1 p12) {
        this.f38151c.put(p12, new O1() { // from class: io.appmetrica.analytics.impl.To
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.a(Q1.this, intent);
            }
        });
    }

    public static final boolean a(Q1 q12, Intent intent) {
        q12.getClass();
        if (!Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) q12.f38149a.f37877a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(@NotNull P1 p12) {
        this.f38150b.put(p12, new O1() { // from class: io.appmetrica.analytics.impl.So
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.c(Q1.this, intent);
            }
        });
    }

    public static final boolean c(Q1 q12, Intent intent) {
        q12.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void b(@NotNull P1 p12) {
        this.f38150b.put(p12, new O1() { // from class: io.appmetrica.analytics.impl.Ro
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.b(Q1.this, intent);
            }
        });
    }

    public static final boolean b(Q1 q12, Intent intent) {
        Collection collection;
        q12.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) q12.f38149a.f37877a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            Intrinsics.checkNotNull(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
