package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class u61 implements aa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f32845a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o71 f32846b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f32847c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yg1 f32848d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private v61 f32849e;

    public /* synthetic */ u61(Context context, o71 o71Var, C2360y7 c2360y7) {
        this(context, o71Var, c2360y7, yg1.f35123h.a(context));
    }

    @NotNull
    public c92 a(@NotNull Context context, int i4, boolean z4, boolean z5) {
        View view;
        View f4;
        View f5;
        Intrinsics.checkNotNullParameter(context, "context");
        if (z4 && !z5) {
            return new c92(c92.a.f24128d, null);
        }
        if (b()) {
            return new c92(c92.a.f24139o, null);
        }
        v61 v61Var = this.f32849e;
        if (v61Var != null && (view = v61Var.f()) != null) {
            int i5 = lh2.f28593b;
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getWidth() >= 10 && view.getHeight() >= 10) {
                v61 v61Var2 = this.f32849e;
                if (v61Var2 == null || (f4 = v61Var2.f()) == null || lh2.b(f4) < 1) {
                    return new c92(c92.a.f24141q, null);
                }
                v61 v61Var3 = this.f32849e;
                if ((v61Var3 == null || (f5 = v61Var3.f()) == null || !lh2.a(f5, i4)) && !z5) {
                    return new c92(c92.a.f24135k, null);
                }
                if (Intrinsics.areEqual(v00.f33455c.a(), this.f32847c.w())) {
                    return new c92(c92.a.f24127c, null);
                }
                o71 o71Var = this.f32846b;
                int i6 = ew1.f25476l;
                du1 a4 = ew1.a.a().a(this.f32845a);
                return o71Var.a(z5, a4 != null ? a4.K() : false);
            }
        }
        return new c92(c92.a.f24140p, null);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public final boolean b() {
        View f4;
        v61 v61Var = this.f32849e;
        if (v61Var == null || (f4 = v61Var.f()) == null) {
            return true;
        }
        return lh2.d(f4);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public final boolean c() {
        View f4;
        v61 v61Var = this.f32849e;
        return (v61Var == null || (f4 = v61Var.f()) == null || lh2.b(f4) < 1) ? false : true;
    }

    public u61(@NotNull Context context, @NotNull o71 nativeAdAssetsValidator, @NotNull C2360y7<?> adResponse, @NotNull yg1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssetsValidator, "nativeAdAssetsValidator");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f32845a = context;
        this.f32846b = nativeAdAssetsValidator;
        this.f32847c = adResponse;
        this.f32848d = phoneStateTracker;
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    @NotNull
    public final c92 b(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(i4, context, true);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public final void a(@Nullable v61 v61Var) {
        this.f32846b.a(v61Var);
        this.f32849e = v61Var;
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    @NotNull
    public final jq1 a() {
        return this.f32846b.a();
    }

    private final c92 a(int i4, Context context, boolean z4) {
        return a(context, i4, !this.f32848d.b(), z4);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    @NotNull
    public final c92 a(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(i4, context, false);
    }
}
