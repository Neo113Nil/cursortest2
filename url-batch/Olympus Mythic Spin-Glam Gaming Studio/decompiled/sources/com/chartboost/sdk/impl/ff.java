package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.chartboost.sdk.impl.sg;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class ff implements ef {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var) {
            super(0);
            this.b = m1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8 mo4828invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b.getContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new x8(defaultSharedPreferences);
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m1 m1Var) {
            super(0);
            this.b = m1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ph mo4828invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b.getContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new ph(defaultSharedPreferences);
        }
    }

    public ff(m1 androidComponent, di trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.a = LazyKt.lazy(new c(androidComponent, trackerComponent, this));
        this.b = LazyKt.lazy(new d(androidComponent));
        this.c = LazyKt.lazy(new a(androidComponent));
        this.d = LazyKt.lazy(new b());
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ m1 b;
        public final /* synthetic */ di c;
        public final /* synthetic */ ff d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m1 m1Var, di diVar, ff ffVar) {
            super(0);
            this.b = m1Var;
            this.c = diVar;
            this.d = ffVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bf mo4828invoke() {
            SharedPreferences i = this.b.i();
            q7 a = this.c.a();
            gf gfVar = new gf(i, a);
            bf bfVar = new bf(new mf(gfVar, a), new y8(gfVar), new rf(gfVar), new z8(), new a9(gfVar), this.d.d(), this.d.b(), this.d.c());
            bfVar.a(new sg.b());
            return bfVar;
        }
    }

    @Override // com.chartboost.sdk.impl.ef
    public bf a() {
        return (bf) this.a.getValue();
    }

    public ph d() {
        return (ph) this.b.getValue();
    }

    public x8 b() {
        return (x8) this.c.getValue();
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return ff.this.b().a();
        }
    }

    public String c() {
        return (String) this.d.getValue();
    }
}
