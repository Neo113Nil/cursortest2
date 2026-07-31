package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.xi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2348xi extends cg0 {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final vy1 f34570o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private gb0 f34571p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f34572q;

    /* renamed from: r, reason: collision with root package name */
    private int f34573r;

    /* renamed from: s, reason: collision with root package name */
    private int f34574s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2348xi(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @NotNull vy1 configurationSizeInfo) {
        super(context, adResponse, adConfiguration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(configurationSizeInfo, "configurationSizeInfo");
        this.f34570o = configurationSizeInfo;
        this.f34572q = true;
        if (n()) {
            this.f34573r = configurationSizeInfo.c(context);
            this.f34574s = configurationSizeInfo.a(context);
        } else {
            this.f34573r = adResponse.r() == 0 ? configurationSizeInfo.c(context) : adResponse.r();
            this.f34574s = adResponse.c();
        }
        this.f34571p = a(this.f34573r, this.f34574s);
    }

    @Override // com.yandex.mobile.ads.impl.cg0
    @SuppressLint({"AddJavascriptInterface"})
    protected final void a(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        addJavascriptInterface(b(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.cg0
    public final void b(int i4, @Nullable String str) {
        if (k().c() != 0) {
            i4 = k().c();
        }
        this.f34574s = i4;
        super.b(i4, str);
    }

    @Override // com.yandex.mobile.ads.impl.cg0, com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.AbstractC1883dk
    @NotNull
    public final String c() {
        String str;
        if (k().V()) {
            int i4 = gj2.f26183c;
            str = gj2.a(this.f34573r);
        } else {
            str = "";
        }
        vy1 vy1Var = this.f34570o;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int c4 = vy1Var.c(context);
        vy1 vy1Var2 = this.f34570o;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return str + (n() ? gj2.a(c4, vy1Var2.a(context2)) : "") + super.c();
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    protected final void h() {
        if (this.f34572q) {
            this.f34571p = new gb0(this.f34573r, this.f34574s, this.f34570o.a());
            jg0 j4 = j();
            if (j4 != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (C1801aa.a(context, this.f34571p, this.f34570o) || k().O()) {
                    j4.a(this, l());
                } else {
                    Context context2 = getContext();
                    vy1 vy1Var = this.f34570o;
                    Intrinsics.checkNotNull(context2);
                    C1866d3 a4 = C1942g7.a(vy1Var.c(context2), this.f34570o.a(context2), this.f34571p.getWidth(), this.f34571p.getHeight(), lh2.d(context2), lh2.b(context2));
                    po0.a(a4.d(), new Object[0]);
                    j4.a(a4);
                }
            }
            this.f34572q = false;
        }
    }

    public final boolean n() {
        if (!m() || k().r() != 0 || k().c() != 0) {
            return false;
        }
        vy1 vy1Var = this.f34570o;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (vy1Var.c(context) <= 0) {
            return false;
        }
        vy1 vy1Var2 = this.f34570o;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return vy1Var2.a(context2) > 0;
    }

    @NotNull
    public final vy1 o() {
        return this.f34571p;
    }

    public final void setBannerHeight(int i4) {
        this.f34574s = i4;
    }

    public final void setBannerWidth(int i4) {
        this.f34573r = i4;
    }

    private final gb0 a(int i4, int i5) {
        return new gb0(i4, i5, this.f34570o.a());
    }
}
