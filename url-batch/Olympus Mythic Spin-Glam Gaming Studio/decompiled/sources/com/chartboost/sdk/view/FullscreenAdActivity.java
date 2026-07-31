package com.chartboost.sdk.view;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.chartboost.sdk.impl.dg;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.m;
import com.chartboost.sdk.impl.m8;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.pl;
import com.chartboost.sdk.impl.re;
import com.chartboost.sdk.impl.xb;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.X3;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/chartboost/sdk/view/FullscreenAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", X3.i.u0, "()V", "onDestroy", "a", "", "Ljava/lang/String;", "auctionId", "Lcom/chartboost/sdk/impl/m;", "b", "Lcom/chartboost/sdk/impl/m;", "adContainerView", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "rootView", "Lcom/chartboost/sdk/impl/pl;", "d", "Lcom/chartboost/sdk/impl/pl;", "visibilityTracker", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Z", "dismissable", "Landroidx/activity/OnBackPressedCallback;", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "<init>", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FullscreenAdActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public String auctionId;

    /* renamed from: b, reason: from kotlin metadata */
    public m adContainerView;

    /* renamed from: c, reason: from kotlin metadata */
    public FrameLayout rootView;

    /* renamed from: d, reason: from kotlin metadata */
    public pl visibilityTracker;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean dismissable;

    /* renamed from: f, reason: from kotlin metadata */
    public final OnBackPressedCallback onBackPressedCallback = new a();

    public static final class a extends OnBackPressedCallback {
        public a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!FullscreenAdActivity.this.dismissable) {
                xb.a("Back pressed but disallowed. Ignoring.", (Throwable) null, 2, (Object) null);
                return;
            }
            m mVar = FullscreenAdActivity.this.adContainerView;
            if (mVar != null) {
                mVar.i();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.c, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        this.rootView = (FrameLayout) findViewById(R.id.content);
        String stringExtra = getIntent().getStringExtra("com.chartboost.sdk.internal.AdController.AdContainerMap");
        this.auctionId = stringExtra;
        if (stringExtra == null) {
            xb.e("Fullscreen activity launched without auction id (likely OS relaunch). Finishing.", null, 2, null);
            finish();
            return;
        }
        m mVar = (m) o.r.a().remove(stringExtra);
        this.adContainerView = mVar;
        if (mVar == null) {
            xb.e("No loaded ad found. Finishing ad activity.", null, 2, null);
            finish();
            return;
        }
        final l adContainerListener$ChartboostMonetization_9_12_1_productionRelease = mVar.getAdContainerListener$ChartboostMonetization_9_12_1_productionRelease();
        mVar.setAdContainerListener$ChartboostMonetization_9_12_1_productionRelease(new b(adContainerListener$ChartboostMonetization_9_12_1_productionRelease, this, mVar));
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(-16777216);
        }
        View a2 = pl.r.a(this, mVar);
        if (a2 == null) {
            a2 = mVar.getRootView();
        }
        View view = a2;
        Intrinsics.checkNotNull(view);
        pl plVar = new pl(this, mVar, view, 1, 0, 100L, 25, false, 128, null);
        this.visibilityTracker = plVar;
        plVar.a(new pl.b() { // from class: com.chartboost.sdk.view.FullscreenAdActivity$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.pl.b
            public final void a() {
                FullscreenAdActivity.a(l.this);
            }
        });
        pl plVar2 = this.visibilityTracker;
        if (plVar2 != null) {
            plVar2.i();
        }
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            frameLayout2.addView(mVar);
        }
        mVar.v();
        getOnBackPressedDispatcher().addCallback(this.onBackPressedCallback);
        if (mVar.k()) {
            this.dismissable = true;
        }
        mVar.m();
        a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pl plVar = this.visibilityTracker;
        if (plVar != null) {
            plVar.b();
        }
        this.visibilityTracker = null;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        m mVar = this.adContainerView;
        if (mVar != null) {
            mVar.j();
        }
        m mVar2 = this.adContainerView;
        if (mVar2 != null) {
            mVar2.setAdContainerListener$ChartboostMonetization_9_12_1_productionRelease(null);
        }
        this.adContainerView = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public static final class b implements l {
        public final /* synthetic */ l a;
        public final /* synthetic */ FullscreenAdActivity b;
        public final /* synthetic */ m c;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[re.values().length];
                try {
                    iArr[re.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[re.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[re.e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[re.d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public b(l lVar, FullscreenAdActivity fullscreenAdActivity, m mVar) {
            this.a = lVar;
            this.b = fullscreenAdActivity;
            this.c = mVar;
        }

        public static void safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(Context p0, Intent p1, Bundle p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, h.c);
            ContextCompat.startActivity(p0, p1, p2);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(m8 expirationReason) {
            Unit unit;
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            l lVar = this.a;
            if (lVar != null) {
                lVar.a(expirationReason);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.e("AdContainerListener null when onAdExpired()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            Unit unit;
            this.b.finish();
            l lVar = this.a;
            if (lVar != null) {
                lVar.b();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.e("AdContainerListener null when onAdClosed()", null, 2, null);
            }
            this.c.setAdContainerListener$ChartboostMonetization_9_12_1_productionRelease(null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            this.b.dismissable = true;
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            Unit unit;
            l lVar = this.a;
            if (lVar != null) {
                lVar.d();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            Unit unit;
            l lVar = this.a;
            if (lVar != null) {
                lVar.e();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.e("AdContainerListener null when onAdShown()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(re request) {
            Intrinsics.checkNotNullParameter(request, "request");
            l lVar = this.a;
            if (lVar != null) {
                lVar.a(request);
            }
            int i = this.b.getResources().getConfiguration().orientation;
            int i2 = 6;
            int i3 = i != 1 ? i != 2 ? -1 : 6 : 1;
            FullscreenAdActivity fullscreenAdActivity = this.b;
            int i4 = a.a[request.ordinal()];
            if (i4 == 1) {
                i2 = i3;
            } else if (i4 == 2) {
                i2 = -1;
            } else if (i4 == 3) {
                i2 = 1;
            } else if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fullscreenAdActivity.setRequestedOrientation(i2);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            Unit unit;
            l lVar = this.a;
            if (lVar != null) {
                lVar.a();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.e("AdContainerListener null when onAdClicked()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(this.b, new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
        }
    }

    public static final void a(l lVar) {
        if (lVar != null) {
            lVar.e();
        }
    }

    public final void a() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: com.chartboost.sdk.view.FullscreenAdActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FullscreenAdActivity.a(FullscreenAdActivity.this, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(FullscreenAdActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        xb.a("WindowInsets updated: " + insets, (Throwable) null, 2, (Object) null);
        m mVar = this$0.adContainerView;
        if (mVar != null) {
            mVar.setRenderingContainerCalculator(new dg(this$0));
        }
        return insets;
    }
}
