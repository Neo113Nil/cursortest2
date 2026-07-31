package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.impl.je;
import com.chartboost.sdk.impl.pl;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class fe implements ge {
    public final he a;
    public final je b;
    public ke c;
    public pl d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[nf.values().length];
            try {
                iArr[nf.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nf.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nf.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public fe(he openMeasurementManager, je openMeasurementSessionBuilder) {
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(openMeasurementSessionBuilder, "openMeasurementSessionBuilder");
        this.a = openMeasurementManager;
        this.b = openMeasurementSessionBuilder;
    }

    public final void a(Context context, View trackedView, View rootView, pl.b visibilityTrackerListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(visibilityTrackerListener, "visibilityTrackerListener");
        g();
        ce b = this.a.b();
        pl plVar = new pl(context, trackedView, rootView, b.a(), b.b(), b.f(), b.c(), false, 128, null);
        plVar.a(visibilityTrackerListener);
        plVar.i();
        this.d = plVar;
    }

    public final boolean h() {
        return this.a.g();
    }

    public final void i() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.a();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("signalImpressionEvent missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    public final void g() {
        pl plVar = this.d;
        if (plVar != null) {
            plVar.b();
        }
        this.d = null;
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ke keVar = this.c;
        if (keVar != null) {
            keVar.a(view);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void f() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.m();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionDestroyWebview missing om tracker", (Throwable) null, 2, (Object) null);
        }
        this.c = null;
    }

    @Override // com.chartboost.sdk.impl.ge
    public void d() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.d();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoComplete missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void c() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.i();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoSkipped missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void e() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.h();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoResumed missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(PlayerState state) {
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        ke keVar = this.c;
        if (keVar != null) {
            keVar.a(state);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyStateChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    public final void b(jc jcVar, r3 r3Var, Integer num, List list) {
        this.a.e();
        j();
        je.a a2 = this.b.a(r3Var, jcVar, this.a.c(), this.a.a(), list, this.a.h(), this.a.d());
        if (a2 != null) {
            this.c = new ke(a2, this.a.g());
        }
        a(num);
    }

    public final void j() {
        ke keVar = this.c;
        if (keVar != null) {
            keVar.m();
        }
        this.c = null;
    }

    @Override // com.chartboost.sdk.impl.ge
    public void b() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.k();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyClick missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(boolean z) {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            if (z) {
                keVar.c();
            } else {
                keVar.b();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoBuffer missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a() {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.g();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoPaused missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(nf quartile) {
        Unit unit;
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        ke keVar = this.c;
        if (keVar != null) {
            int i = a.a[quartile.ordinal()];
            if (i == 1) {
                keVar.e();
            } else if (i == 2) {
                keVar.f();
            } else if (i == 3) {
                keVar.j();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoProgress missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(float f, float f2) {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.a(f, f2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVideoStarted missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(float f) {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.a(f);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("onImpressionNotifyVolumeChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ge
    public void a(jc mtype, r3 webview, Integer num, List verificationScriptResourcesList) {
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        if (this.c != null && verificationScriptResourcesList.isEmpty()) {
            xb.a("OMSDK skipping session rebuild; tracker already active and no new verification resources", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            b(mtype, webview, num, verificationScriptResourcesList);
        } catch (Exception e) {
            xb.a("OMSDK Session error", e);
        }
    }

    public final void a(Integer num) {
        Unit unit;
        ke keVar = this.c;
        if (keVar != null) {
            keVar.l();
            keVar.a(num);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("startAndLoadSession missing tracker", (Throwable) null, 2, (Object) null);
        }
    }
}
