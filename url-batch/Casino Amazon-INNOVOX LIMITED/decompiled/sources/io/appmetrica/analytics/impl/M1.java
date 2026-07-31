package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class M1 {
    public static B1 d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f945a;
    public final A1 b;
    public BinderC0666z1 c;

    public M1(Context context, A1 a1) {
        this.f945a = context;
        this.b = a1;
    }

    public final void b() {
        C0401oa.a(this.f945a);
        PublicLogger.INSTANCE.init(this.f945a);
        Context context = this.f945a;
        A1 a1 = this.b;
        if (d == null) {
            C1 c1 = new C1(context, a1, new C0140e5(context));
            C0181fk c0181fk = C0401oa.I.v;
            F1 f1 = new F1(c1);
            LinkedHashMap linkedHashMap = c0181fk.f1260a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(f1);
            d = c1;
        }
        B1 b1 = d;
        if (b1 != null) {
            this.c = new BinderC0666z1(b1);
            C0401oa c0401oa = C0401oa.I;
            c0401oa.f = new C0385nj(c0401oa.f1412a, new C0410oj(b1));
            ((C1) b1).onCreate();
        }
    }

    public final boolean c(Intent intent) {
        B1 b1 = d;
        if (b1 != null) {
            ((C1) b1).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !StringsKt.startsWith$default(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, (Object) null)) && intent.getData() == null;
    }

    public final void d() {
        d = null;
    }

    public final void a(Intent intent, int i) {
        B1 b1 = d;
        if (b1 != null) {
            ((C0540u0) ((C1) b1).c).f1506a.stopSelf(i);
        }
    }

    public final void c() {
        B1 b1 = d;
        if (b1 != null) {
            ((C1) b1).onDestroy();
        }
    }

    public final int a(Intent intent, int i, int i2) {
        B1 b1 = d;
        if (b1 == null) {
            return 2;
        }
        ((C0540u0) ((C1) b1).c).f1506a.stopSelf(i2);
        return 2;
    }

    public final IBinder a(Intent intent) {
        B1 b1 = d;
        if (b1 != null) {
            ((C1) b1).a(intent);
        }
        String action = intent.getAction();
        if (action != null && StringsKt.startsWith$default(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, (Object) null)) {
            return new Do();
        }
        BinderC0666z1 binderC0666z1 = this.c;
        if (binderC0666z1 != null) {
            return binderC0666z1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coreBinder");
        return null;
    }

    public final void a(Configuration configuration) {
        if (d != null) {
            C0401oa.I.v().a(configuration);
        }
    }

    public final void b(Intent intent) {
        B1 b1 = d;
        if (b1 != null) {
            ((C1) b1).c(intent);
        }
    }
}
