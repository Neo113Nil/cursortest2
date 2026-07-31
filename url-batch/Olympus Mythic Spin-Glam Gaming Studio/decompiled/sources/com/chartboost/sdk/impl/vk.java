package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.si;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class vk extends q3 implements g1 {
    public static final b e0 = new b(null);
    public final u8 O;
    public final xk P;
    public final String Q;
    public final Mediation R;
    public final Function5 S;
    public final String T;
    public final oa U;
    public final pd V;
    public final q7 W;
    public final Function1 X;
    public long Y;
    public long Z;
    public long a0;
    public int b0;
    public ik c0;
    public f1 d0;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r3 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new r3(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(Context context, String location, jc mtype, String adUnitParameters, yi uiPoster, u8 fileCache, n3 templateProxy, xk videoRepository, String videoFilename, Mediation mediation, Function5 adsVideoPlayerFactory, i3 networkService, String templateHtml, ge openMeasurementImpressionCallback, r0 adUnitRendererImpressionCallback, oa impressionInterface, xl webViewTimeoutInterface, pd nativeBridgeCommand, q7 eventTracker, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, networkService, templateProxy, mediation, templateHtml, openMeasurementImpressionCallback, adUnitRendererImpressionCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(adsVideoPlayerFactory, "adsVideoPlayerFactory");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(templateHtml, "templateHtml");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.O = fileCache;
        this.P = videoRepository;
        this.Q = videoFilename;
        this.R = mediation;
        this.S = adsVideoPlayerFactory;
        this.T = templateHtml;
        this.U = impressionInterface;
        this.V = nativeBridgeCommand;
        this.W = eventTracker;
        this.X = cbWebViewFactory;
    }

    @Override // com.chartboost.sdk.impl.g1
    public void a(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        xb.a("onVideoDisplayError: " + error, (Throwable) null, 2, (Object) null);
        a(false);
        n3 q = q();
        if (q != null) {
            q.d(H(), l(), g());
        }
        F();
        c(error);
    }

    @Override // com.chartboost.sdk.impl.q3
    public cl b(Context context) {
        ik ikVar;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        this.V.a(this.U);
        xb.a("createViewObject()", (Throwable) null, 2, (Object) null);
        try {
            SurfaceView surfaceView = new SurfaceView(context);
            try {
                ikVar = new ik(context, this.T, j(), this.U, this.V, h(), surfaceView, null, this.W, this.X, 128, null);
            } catch (Exception e) {
                c("Can't instantiate VideoBase: " + e);
                ikVar = null;
            }
            this.c0 = ikVar;
            f1 f1Var = (f1) this.S.invoke(context, surfaceView, this, r(), this.O);
            hk b2 = this.P.b(this.Q);
            if (b2 != null) {
                f1Var.a(b2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Video asset not found in the repository", (Throwable) null, 2, (Object) null);
            }
            this.d0 = f1Var;
            return this.c0;
        } catch (Exception e2) {
            c("Can't instantiate SurfaceView: " + e2);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.q3
    public void f() {
        xb.a("destroyView()", (Throwable) null, 2, (Object) null);
        F();
        super.f();
    }

    public /* synthetic */ vk(Context context, String str, jc jcVar, String str2, yi yiVar, u8 u8Var, n3 n3Var, xk xkVar, String str3, Mediation mediation, Function5 function5, i3 i3Var, String str4, ge geVar, r0 r0Var, oa oaVar, xl xlVar, pd pdVar, q7 q7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, jcVar, str2, yiVar, u8Var, n3Var, xkVar, str3, mediation, function5, i3Var, str4, geVar, r0Var, oaVar, xlVar, pdVar, q7Var, (i & 524288) != 0 ? a.b : function1);
    }

    @Override // com.chartboost.sdk.impl.q3
    public void z() {
        xb.c("onResume()", null, 2, null);
        this.P.a(null, 1, false);
        f1 f1Var = this.d0;
        if (f1Var != null) {
            d2 d2Var = f1Var instanceof d2 ? (d2) f1Var : null;
            if (d2Var != null) {
                d2Var.c();
            }
            f1Var.play();
        }
        super.z();
    }

    @Override // com.chartboost.sdk.impl.q3
    public void y() {
        xb.c("onPause()", null, 2, null);
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.pause();
        }
        super.y();
    }

    @Override // com.chartboost.sdk.impl.q3
    public void w() {
        ik ikVar = this.c0;
        int width = ikVar != null ? ikVar.getWidth() : 0;
        ik ikVar2 = this.c0;
        int height = ikVar2 != null ? ikVar2.getHeight() : 0;
        f1 f1Var = this.d0;
        if (f1Var == null) {
            f1Var = null;
        }
        if (f1Var != null) {
            f1Var.a(width, height);
        }
    }

    public final void M() {
        xb.a("playVideo()", (Throwable) null, 2, (Object) null);
        N();
        this.Z = oh.a();
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.play();
        }
    }

    public final void N() {
        n().a(PlayerState.FULLSCREEN);
        f1 f1Var = this.d0;
        if (f1Var != null && !f1Var.h()) {
            ge n = n();
            float f = this.Y / 1000.0f;
            f1 f1Var2 = this.d0;
            n.a(f, f1Var2 != null ? f1Var2.g() : 1.0f);
            return;
        }
        n().e();
    }

    public final void L() {
        xb.a("pauseVideo()", (Throwable) null, 2, (Object) null);
        n().a();
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.pause();
        }
    }

    public final void E() {
        F();
    }

    public final void I() {
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.f();
        }
        n().a(0.0f);
    }

    public final void O() {
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.b();
        }
        n().a(1.0f);
    }

    public final int G() {
        xb.a("getAssetDownloadStateNow()", (Throwable) null, 2, (Object) null);
        hk b2 = this.P.b(this.Q);
        if (b2 != null) {
            return this.P.a(b2);
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.g1
    public void c() {
        n().a(true);
    }

    @Override // com.chartboost.sdk.impl.g1
    public void d() {
        n().a(false);
    }

    public final void F() {
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.stop();
        }
        ik ikVar = this.c0;
        if (ikVar != null) {
            ikVar.b();
        }
        this.d0 = null;
        this.c0 = null;
    }

    public final void K() {
        xb.a("notifyTemplateVideoStarted() duration: " + this.Y, (Throwable) null, 2, (Object) null);
        n3 q = q();
        if (q != null) {
            q.b(H(), this.Y / 1000.0f, l(), g());
        }
    }

    public final void J() {
        n3 q = q();
        if (q != null) {
            q.c(H(), l(), g());
        }
    }

    public final r3 H() {
        ik ikVar = this.c0;
        if (ikVar != null) {
            return ikVar.getWebView();
        }
        return null;
    }

    public final void e(String str) {
        long a2;
        long j;
        l7 l7Var = new l7(si.j.d, str, g(), l(), this.R);
        if (this.a0 == 0) {
            a2 = this.Z;
            j = oh.a();
        } else {
            a2 = oh.a();
            j = this.a0;
        }
        l7Var.a(a2 - j);
        l7Var.a(true);
        l7Var.b(false);
        track((pi) l7Var);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.g1
    public void b() {
        xb.a("onVideoDisplayCompleted", (Throwable) null, 2, (Object) null);
        a(true);
        J();
        n().d();
    }

    public final void f(String str) {
        ya yaVar = new ya(si.j.c, str, g(), l(), this.R, null, 32, null);
        yaVar.a(this.a0 - this.Z);
        yaVar.a(true);
        yaVar.b(false);
        track((pi) yaVar);
    }

    @Override // com.chartboost.sdk.impl.g1
    public void a(long j) {
        float f = j / 1000.0f;
        float f2 = this.Y / 1000.0f;
        if (pg.a.d()) {
            xb.c("onVideoDisplayProgress: " + f + "/" + f2, null, 2, null);
        }
        n3 q = q();
        if (q != null) {
            q.a(H(), f, l(), g());
        }
        a(f2, f);
    }

    @Override // com.chartboost.sdk.impl.g1
    public void b(long j) {
        xb.a("onVideoDisplayPrepared ready to receive signal from template, duration: " + j, (Throwable) null, 2, (Object) null);
        this.b0 = G();
        this.Y = j;
        x();
    }

    @Override // com.chartboost.sdk.impl.g1
    public void a() {
        xb.a("onVideoDisplayStarted", (Throwable) null, 2, (Object) null);
        K();
        this.a0 = oh.a();
    }

    public final void a(boolean z) {
        String valueOf = String.valueOf(this.b0);
        if (z) {
            f(valueOf);
        } else {
            e(valueOf);
        }
    }
}
