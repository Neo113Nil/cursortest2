package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2040ka implements aa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28128a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o71 f28129b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<? extends String> f28130c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yg1 f28131d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private v61 f28132e;

    public /* synthetic */ C2040ka(Context context, o71 o71Var, Set set) {
        this(context, o71Var, set, yg1.f35123h.a(context), 0);
    }

    @NotNull
    public c92 a(@NotNull Context context, int i4, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        v61 v61Var = this.f28132e;
        View view = v61Var != null ? v61Var.f() : null;
        Set<? extends String> set = this.f28130c;
        c92.a status = c92.a.f24128d;
        Intrinsics.checkNotNullParameter(status, "status");
        if (!set.contains(status.a()) && z4 && !z5) {
            return new c92(status, null);
        }
        if (view == null) {
            return new c92(c92.a.f24138n, null);
        }
        Set<? extends String> set2 = this.f28130c;
        c92.a status2 = c92.a.f24139o;
        Intrinsics.checkNotNullParameter(status2, "status");
        if (!set2.contains(status2.a()) && lh2.d(view)) {
            return new c92(status2, null);
        }
        Set<? extends String> set3 = this.f28130c;
        c92.a status3 = c92.a.f24140p;
        Intrinsics.checkNotNullParameter(status3, "status");
        if (!set3.contains(status3.a())) {
            int i5 = lh2.f28593b;
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getWidth() < 10 || view.getHeight() < 10) {
                return new c92(status3, null);
            }
        }
        Set<? extends String> set4 = this.f28130c;
        c92.a status4 = c92.a.f24141q;
        Intrinsics.checkNotNullParameter(status4, "status");
        if (!set4.contains(status4.a()) && lh2.b(view) < 1) {
            return new c92(status4, null);
        }
        Set<? extends String> set5 = this.f28130c;
        c92.a status5 = c92.a.f24135k;
        Intrinsics.checkNotNullParameter(status5, "status");
        if (!set5.contains(status5.a()) && !lh2.a(view, i4) && !z5) {
            return new c92(status5, null);
        }
        o71 o71Var = this.f28129b;
        int i6 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(this.f28128a);
        return o71Var.a(z5, a4 != null ? a4.K() : false);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public final boolean b() {
        View f4;
        v61 v61Var = this.f28132e;
        if (v61Var == null || (f4 = v61Var.f()) == null) {
            return true;
        }
        return lh2.d(f4);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public final boolean c() {
        View f4;
        v61 v61Var = this.f28132e;
        return (v61Var == null || (f4 = v61Var.f()) == null || lh2.b(f4) < 1) ? false : true;
    }

    private C2040ka(Context context, o71 nativeAdAssetsValidator, Set<? extends String> rules, yg1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssetsValidator, "nativeAdAssetsValidator");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f28128a = context;
        this.f28129b = nativeAdAssetsValidator;
        this.f28130c = rules;
        this.f28131d = phoneStateTracker;
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    @NotNull
    public final c92 b(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(i4, context, true);
    }

    public /* synthetic */ C2040ka(Context context, o71 o71Var, Set set, yg1 yg1Var, int i4) {
        this(context, o71Var, set, yg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public final void a(@Nullable v61 v61Var) {
        this.f28129b.a(v61Var);
        this.f28132e = v61Var;
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    @NotNull
    public final jq1 a() {
        return this.f28129b.a();
    }

    private final c92 a(int i4, Context context, boolean z4) {
        return a(context, i4, !this.f28131d.b(), z4);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    @NotNull
    public final c92 a(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(i4, context, false);
    }
}
