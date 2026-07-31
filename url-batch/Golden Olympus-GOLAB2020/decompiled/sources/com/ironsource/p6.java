package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.bi;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class p6 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sj f18598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wg f18599b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1587w4 f18600c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f18601d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final nn f18602e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final vu f18603f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final bi f18604g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final bi.a f18605h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private BannerAdInfo f18606i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private WeakReference<q6> f18607j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private WeakReference<FrameLayout> f18608k;

    @Metadata
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v4) {
            Intrinsics.checkNotNullParameter(v4, "v");
            ug size = p6.this.d().getSize();
            ((FrameLayout) v4).addView(p6.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v4) {
            Intrinsics.checkNotNullParameter(v4, "v");
            ((FrameLayout) v4).removeAllViews();
        }
    }

    public p6(@NotNull sj adInstance, @NotNull wg container, @NotNull C1587w4 auctionDataReporter, @NotNull InterfaceC1541q3 analytics, @NotNull nn networkDestroyAPI, @NotNull vu threadManager, @NotNull bi sessionDepthService, @NotNull bi.a sessionDepthServiceEditor) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.f18598a = adInstance;
        this.f18599b = container;
        this.f18600c = auctionDataReporter;
        this.f18601d = analytics;
        this.f18602e = networkDestroyAPI;
        this.f18603f = threadManager;
        this.f18604g = sessionDepthService;
        this.f18605h = sessionDepthServiceEditor;
        String f4 = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adInstance.instanceId");
        String e4 = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e4, "adInstance.id");
        this.f18606i = new BannerAdInfo(f4, e4);
        this.f18607j = new WeakReference<>(null);
        this.f18608k = new WeakReference<>(null);
        lo loVar = new lo();
        adInstance.a(loVar);
        loVar.a(this);
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        vu.a(this.f18603f, new Runnable() { // from class: com.ironsource.M2
            @Override // java.lang.Runnable
            public final void run() {
                p6.a(p6.this);
            }
        }, 0L, 2, null);
    }

    @NotNull
    public final BannerAdInfo c() {
        return this.f18606i;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.c6
    public void onBannerClick() {
        InterfaceC1490j3.a.f16785a.a().a(this.f18601d);
        this.f18603f.a(new Runnable() { // from class: com.ironsource.N2
            @Override // java.lang.Runnable
            public final void run() {
                p6.b(p6.this);
            }
        });
    }

    @Override // com.ironsource.c6
    public void onBannerShowSuccess() {
        bi biVar = this.f18604g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        InterfaceC1490j3.a.f16785a.f(new C1511m3.w(biVar.a(ad_unit))).a(this.f18601d);
        this.f18605h.b(ad_unit);
        this.f18600c.c("onBannerShowSuccess");
        this.f18603f.a(new Runnable() { // from class: com.ironsource.L2
            @Override // java.lang.Runnable
            public final void run() {
                p6.c(p6.this);
            }
        });
    }

    public /* synthetic */ p6(sj sjVar, wg wgVar, C1587w4 c1587w4, InterfaceC1541q3 interfaceC1541q3, nn nnVar, vu vuVar, bi biVar, bi.a aVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(sjVar, wgVar, c1587w4, interfaceC1541q3, (i4 & 16) != 0 ? new on() : nnVar, (i4 & 32) != 0 ? ig.f16710a : vuVar, (i4 & 64) != 0 ? nm.f18364r.d().k() : biVar, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nm.f18364r.a().e() : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1490j3.d.f16808a.b().a(this$0.f18601d);
        this$0.f18602e.a(this$0.f18598a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q6 q6Var = this$0.f18607j.get();
        if (q6Var != null) {
            q6Var.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q6 q6Var = this$0.f18607j.get();
        if (q6Var != null) {
            q6Var.onBannerAdShown();
        }
    }

    @NotNull
    public final wg d() {
        return this.f18599b;
    }

    @NotNull
    public final WeakReference<q6> e() {
        return this.f18607j;
    }

    @NotNull
    public final WeakReference<FrameLayout> f() {
        return this.f18608k;
    }

    public final void a(@NotNull BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.f18606i = bannerAdInfo;
    }

    public final void b(@NotNull WeakReference<FrameLayout> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f18608k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    public final void a(@NotNull WeakReference<q6> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f18607j = weakReference;
    }
}
