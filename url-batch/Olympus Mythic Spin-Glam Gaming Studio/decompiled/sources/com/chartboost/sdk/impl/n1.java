package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class n1 implements m1 {
    public final Context a;
    public final Application b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 mo4828invoke() {
            return l1.b();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2 mo4828invoke() {
            return new i2();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o6 mo4828invoke() {
            return new o6(n1.this.getContext(), n1.this.j());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6 mo4828invoke() {
            return new v6(n1.this.m(), n1.this.l(), null, null, 12, null);
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jg mo4828invoke() {
            Resources resources = n1.this.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return new jg(resources);
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dh mo4828invoke() {
            return new dh(n1.this.i());
        }
    }

    public static final class k extends Lambda implements Function0 {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zi mo4828invoke() {
            return new zi();
        }
    }

    public n1(Context context, Application app) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        this.a = context;
        this.b = app;
        this.c = LazyKt.lazy(new h());
        this.d = LazyKt.lazy(new j());
        this.e = LazyKt.lazy(a.b);
        this.f = LazyKt.lazy(k.b);
        this.g = LazyKt.lazy(b.b);
        this.h = LazyKt.lazy(new g());
        this.i = LazyKt.lazy(new i());
        this.j = LazyKt.lazy(new l());
        this.k = LazyKt.lazy(new f());
        this.l = LazyKt.lazy(new e());
        this.m = LazyKt.lazy(new d());
        this.n = LazyKt.lazy(new c());
    }

    @Override // com.chartboost.sdk.impl.m1
    public Context getContext() {
        return this.a;
    }

    @Override // com.chartboost.sdk.impl.m1
    public Application g() {
        return this.b;
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences mo4828invoke() {
            return n1.this.getContext().getSharedPreferences("cbPrefs", 0);
        }
    }

    @Override // com.chartboost.sdk.impl.m1
    public SharedPreferences i() {
        Object value = this.c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences mo4828invoke() {
            return n1.this.getContext().getSharedPreferences("cbPrefsTracking", 0);
        }
    }

    @Override // com.chartboost.sdk.impl.m1
    public SharedPreferences h() {
        Object value = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public l1 e() {
        Object value = this.e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l1) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public yi c() {
        return (yi) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public i2 a() {
        return (i2) this.g.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public jg k() {
        return (jg) this.h.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public dh d() {
        return (dh) this.i.getValue();
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowManager mo4828invoke() {
            Object systemService = n1.this.getContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    public WindowManager m() {
        return (WindowManager) this.j.getValue();
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayMetrics mo4828invoke() {
            return n1.this.getContext().getResources().getDisplayMetrics();
        }
    }

    public DisplayMetrics l() {
        Object value = this.k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public v6 j() {
        return (v6) this.l.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public o6 f() {
        return (o6) this.m.getValue();
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContentResolver mo4828invoke() {
            return n1.this.getContext().getContentResolver();
        }
    }

    @Override // com.chartboost.sdk.impl.m1
    public ContentResolver b() {
        Object value = this.n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ContentResolver) value;
    }
}
