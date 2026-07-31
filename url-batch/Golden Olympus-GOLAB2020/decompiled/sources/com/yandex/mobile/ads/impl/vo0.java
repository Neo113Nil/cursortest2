package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class vo0 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f33708a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ps0 f33709b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ts0 f33710c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final ew1 f33711d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1977hi f33712e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final wo0 f33713f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f33714g;

    /* renamed from: h, reason: collision with root package name */
    private int f33715h;

    /* renamed from: i, reason: collision with root package name */
    private int f33716i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull C2286v2 adConfiguration) {
        this(context, attributeSet, i4, adConfiguration, null, null, null, null, null, 496, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
    }

    private final wo0 a() {
        return xo0.a(this, this.f33712e);
    }

    @NotNull
    protected abstract C1977hi a(@NotNull Context context, @NotNull C1953gi c1953gi, @NotNull C2105n4 c2105n4);

    public final void addVisibilityChangeListener(@NotNull mh2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33714g.add(listener);
    }

    @Nullable
    protected final String c() {
        this.f33710c.a();
        return this.f33712e.A();
    }

    @NotNull
    protected final fe2 d() {
        this.f33710c.a();
        return this.f33712e.C();
    }

    protected void destroy() {
        this.f33710c.a();
        this.f33709b.a();
        this.f33714g.clear();
        int i4 = C2362y9.f34935b;
        if (C2362y9.a((ao) this.f33712e)) {
            return;
        }
        this.f33712e.d();
    }

    @NotNull
    public final C2286v2 getAdConfiguration$mobileads_externalRelease() {
        return this.f33708a;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.f33716i;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.f33715h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        ap0.d(new Object[0]);
        wo0 wo0Var = this.f33713f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        wo0Var.b(context);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(@NotNull Configuration newConfig) {
        int i4;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i5 = C2362y9.f34935b;
        if (!C2362y9.a((ao) this.f33712e)) {
            if (this.f33712e.y()) {
                i4 = 0;
            } else {
                C1918f7 a4 = this.f33708a.a();
                if (a4 != null) {
                    a(a4);
                }
                i4 = 8;
            }
            setVisibility(i4);
        }
        Objects.toString(newConfig);
        ap0.d(new Object[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        ap0.d(new Object[0]);
        wo0 wo0Var = this.f33713f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        wo0Var.a(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f33715h = i4;
        this.f33716i = i5;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(@NotNull View changedView, int i4) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i4);
        if (this.f33711d == null) {
            return;
        }
        Objects.toString(changedView);
        ap0.d(new Object[0]);
        ew1 ew1Var = this.f33711d;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        du1 a4 = ew1Var.a(context);
        if (a4 == null || !a4.m0()) {
            a(i4);
        } else if (this == changedView) {
            a(i4);
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        getVisibility();
        ap0.d(new Object[0]);
        a((i4 == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(@NotNull mh2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33714g.remove(listener);
    }

    protected void setAdUnitId(@Nullable String str) {
        this.f33710c.a();
        this.f33712e.a(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull C2286v2 adConfiguration, @NotNull ps0 mainThreadExecutor) {
        this(context, attributeSet, i4, adConfiguration, mainThreadExecutor, null, null, null, null, 480, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
    }

    protected final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f33710c.a();
        this.f33709b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Uh
            @Override // java.lang.Runnable
            public final void run() {
                vo0.a(vo0.this, adRequestData);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == null) goto L13;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final ms b() {
        vy1 p4;
        this.f33710c.a();
        C1977hi c1977hi = this.f33712e;
        Intrinsics.checkNotNullParameter(c1977hi, "<this>");
        C2360y7<String> j4 = c1977hi.j();
        if (j4 != null && (p4 = j4.M()) != null) {
            Intrinsics.checkNotNullParameter(p4, "<this>");
            if (p4.getWidth() == 0 && p4.getHeight() == 0) {
                p4 = null;
            }
        }
        p4 = c1977hi.p();
        if (p4 != null) {
            return new ms(p4);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull C2286v2 adConfiguration, @NotNull ps0 mainThreadExecutor, @NotNull ts0 mainThreadUsageValidator) {
        this(context, attributeSet, i4, adConfiguration, mainThreadExecutor, mainThreadUsageValidator, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull C2286v2 adConfiguration, @NotNull ps0 mainThreadExecutor, @NotNull ts0 mainThreadUsageValidator, @NotNull C2105n4 adLoadingPhasesManager) {
        this(context, attributeSet, i4, adConfiguration, mainThreadExecutor, mainThreadUsageValidator, adLoadingPhasesManager, null, null, 384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull C2286v2 adConfiguration, @NotNull ps0 mainThreadExecutor, @NotNull ts0 mainThreadUsageValidator, @NotNull C2105n4 adLoadingPhasesManager, @NotNull C1953gi bannerAdListener) {
        this(context, attributeSet, i4, adConfiguration, mainThreadExecutor, mainThreadUsageValidator, adLoadingPhasesManager, bannerAdListener, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(bannerAdListener, "bannerAdListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vo0 this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f33712e.b(adRequestData);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull C2286v2 adConfiguration, @NotNull ps0 mainThreadExecutor, @NotNull ts0 mainThreadUsageValidator, @NotNull C2105n4 adLoadingPhasesManager, @NotNull C1953gi bannerAdListener, @Nullable ew1 ew1Var) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(bannerAdListener, "bannerAdListener");
        this.f33708a = adConfiguration;
        this.f33709b = mainThreadExecutor;
        this.f33710c = mainThreadUsageValidator;
        this.f33711d = ew1Var;
        this.f33714g = new ArrayList();
        mainThreadUsageValidator.a();
        C1977hi a4 = a(context, bannerAdListener, adLoadingPhasesManager);
        this.f33712e = a4;
        bannerAdListener.a(a4.e());
        wo0 a5 = a();
        this.f33713f = a5;
        a5.a(context, this);
    }

    private final void a(int i4) {
        int i5 = 0;
        ap0.d(new Object[0]);
        int i6 = C2362y9.f34935b;
        if (C2362y9.a((ao) this.f33712e)) {
            return;
        }
        ArrayList arrayList = this.f33714g;
        int size = arrayList.size();
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((mh2) obj).a(i4);
        }
    }

    protected final void a(@Nullable ls lsVar) {
        this.f33710c.a();
        this.f33712e.a(lsVar);
    }

    protected final void a(@Nullable ms msVar) {
        this.f33710c.a();
        this.f33712e.a(msVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vo0(Context context, AttributeSet attributeSet, int i4, C2286v2 c2286v2, ps0 ps0Var, ts0 ts0Var, C2105n4 c2105n4, C1953gi c1953gi, ew1 ew1Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, r3, c2286v2, r5, r6, r7, r8, r9);
        ew1 ew1Var2;
        AttributeSet attributeSet2 = (i5 & 2) != 0 ? null : attributeSet;
        int i6 = (i5 & 4) != 0 ? 0 : i4;
        ps0 ps0Var2 = (i5 & 16) != 0 ? new ps0() : ps0Var;
        ts0 ts0Var2 = (i5 & 32) != 0 ? new ts0(context) : ts0Var;
        C2105n4 c2105n42 = (i5 & 64) != 0 ? new C2105n4() : c2105n4;
        C1953gi c1953gi2 = (i5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new C1953gi(context, c2286v2, c2105n42) : c1953gi;
        if ((i5 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            int i7 = ew1.f25476l;
            ew1Var2 = ew1.a.a();
        } else {
            ew1Var2 = ew1Var;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull C2286v2 adConfiguration) {
        this(context, attributeSet, 0, adConfiguration, null, null, null, null, null, 500, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vo0(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        this(context, null, 0, adConfiguration, null, null, null, null, null, IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
    }
}
