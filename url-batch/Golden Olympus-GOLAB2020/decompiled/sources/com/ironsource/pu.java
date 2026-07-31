package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.ironsource.zt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class pu implements zt.c, zt.d, zt.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<TestSuiteActivity> f18733a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f18734b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private RelativeLayout f18735c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private IronSourceBannerLayout f18736d;

    public pu(@NotNull TestSuiteActivity activity, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f18733a = new WeakReference<>(activity);
        this.f18734b = handler;
    }

    private final RelativeLayout a(TestSuiteActivity testSuiteActivity) {
        RelativeLayout relativeLayout = new RelativeLayout(testSuiteActivity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    private final TestSuiteActivity f() {
        return this.f18733a.get();
    }

    @Override // com.ironsource.zt.d
    public void d() {
        mu.f18248a.b((Activity) this.f18733a.get());
    }

    @Override // com.ironsource.zt.c
    public boolean e() {
        return mu.f18248a.e();
    }

    @Override // com.ironsource.zt.b
    public void a(double d4) {
        final TestSuiteActivity f4;
        if (this.f18735c != null || (f4 = f()) == null) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f18736d;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.setLayoutParams(ru.f18924a.a((Context) f4));
        }
        this.f18735c = a(f4);
        this.f18734b.post(new Runnable() { // from class: com.ironsource.A3
            @Override // java.lang.Runnable
            public final void run() {
                pu.a(pu.this, f4);
            }
        });
    }

    @Override // com.ironsource.zt.b
    public void b() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f18736d;
        if (ironSourceBannerLayout != null) {
            mu.f18248a.a(ironSourceBannerLayout);
        }
        this.f18734b.post(new Runnable() { // from class: com.ironsource.Z2
            @Override // java.lang.Runnable
            public final void run() {
                pu.a(pu.this);
            }
        });
        this.f18736d = null;
    }

    @Override // com.ironsource.zt.c
    public void c() {
        mu.f18248a.a((Activity) this.f18733a.get());
    }

    @Override // com.ironsource.zt.c
    public void a(@NotNull fu loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        mu muVar = mu.f18248a;
        muVar.a(IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        muVar.g();
    }

    @Override // com.ironsource.zt.d
    public void b(@NotNull fu loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        mu muVar = mu.f18248a;
        muVar.a(IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        muVar.h();
    }

    @Override // com.ironsource.zt.b
    public void a(@NotNull fu loadAdConfig, @NotNull String description, int i4, int i5) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        b();
        mu muVar = mu.f18248a;
        muVar.a(IronSource.AD_UNIT.BANNER, loadAdConfig);
        TestSuiteActivity f4 = f();
        if (f4 != null) {
            IronSourceBannerLayout a4 = muVar.a(f4, muVar.a(description, i4, i5));
            this.f18736d = a4;
            muVar.b(a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pu this$0) {
        RelativeLayout container;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f18735c;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        TestSuiteActivity f4 = this$0.f();
        if (f4 != null && (container = f4.getContainer()) != null) {
            container.removeView(this$0.f18735c);
        }
        this$0.f18735c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pu this$0, TestSuiteActivity testSuiteActivity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f18735c;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.f18736d);
        }
        testSuiteActivity.getContainer().addView(this$0.f18735c);
    }

    @Override // com.ironsource.zt.d
    public boolean a() {
        return mu.f18248a.f();
    }
}
