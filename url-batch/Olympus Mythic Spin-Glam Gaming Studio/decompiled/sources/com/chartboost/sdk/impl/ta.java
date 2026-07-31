package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ta implements va {
    public final q1 a;
    public final q3 b;
    public final a7 c;
    public final r0 d;
    public final pa e;
    public final ca f;
    public final WeakReference g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public ta(q1 appRequest, q3 viewProtocol, a7 downloader, ViewGroup viewGroup, r0 adUnitRendererImpressionCallback, pa impressionIntermediateCallback, ca impressionClickCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        this.a = appRequest;
        this.b = viewProtocol;
        this.c = downloader;
        this.d = adUnitRendererImpressionCallback;
        this.e = impressionIntermediateCallback;
        this.f = impressionClickCallback;
        this.g = new WeakReference(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean f() {
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.va
    public ViewGroup i() {
        return (ViewGroup) this.g.get();
    }

    @Override // com.chartboost.sdk.impl.va
    public void c(boolean z) {
        this.h = z;
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean e() {
        return this.h;
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean h() {
        return this.i;
    }

    @Override // com.chartboost.sdk.impl.va
    public void d(boolean z) {
        this.l = z;
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean j() {
        return this.l;
    }

    @Override // com.chartboost.sdk.impl.va
    public void g() {
        this.d.o();
    }

    @Override // com.chartboost.sdk.impl.va
    public void l() {
        this.d.b(this.a);
    }

    @Override // com.chartboost.sdk.impl.va
    public void onStart() {
        this.f.a(false);
    }

    @Override // com.chartboost.sdk.impl.va
    public void onResume() {
        this.f.a(false);
        if (this.k) {
            this.k = false;
            this.b.z();
        }
    }

    @Override // com.chartboost.sdk.impl.va
    public void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.b.y();
    }

    @Override // com.chartboost.sdk.impl.va
    public void k() {
        if (a()) {
            return;
        }
        e(true);
        if (j()) {
            this.e.c();
        } else {
            a(CBError.Impression.INTERNAL);
        }
        this.b.a(ek.k);
        this.e.g();
        this.b.C();
    }

    public void e(boolean z) {
        this.m = z;
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            xb.b("Cannot display on host because view was not created!", (Throwable) null, 2, (Object) null);
            ta.this.a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
        Unit unit;
        Context context;
        this.e.a(ra.e);
        cl u = this.b.u();
        if (u == null || (context = u.getContext()) == null) {
            unit = null;
        } else {
            this.d.a(context);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.b("Missing context on onImpressionViewCreated", (Throwable) null, 2, (Object) null);
        }
        viewGroup.addView(view);
        this.c.a();
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(ra state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (state != ra.c) {
            a(activity);
            return;
        }
        xb.a("displayOnActivity invalid state: " + state, (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.va
    public void b(boolean z) {
        this.i = z;
    }

    public final void a(CBImpressionActivity cBImpressionActivity) {
        this.e.a(ra.e);
        try {
            CBError.Impression a2 = this.b.a(cBImpressionActivity);
            if (a2 != null) {
                a(a2);
            } else {
                xb.c("Displaying the impression", null, 2, null);
            }
        } catch (Exception e) {
            xb.b("Cannot create view in protocol", e);
            a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(ViewGroup viewGroup) {
        try {
            if (viewGroup == null) {
                xb.b("Cannot display on host because it is null!", (Throwable) null, 2, (Object) null);
                a(CBError.Impression.ERROR_DISPLAYING_VIEW);
                return;
            }
            CBError.Impression a2 = this.b.a(viewGroup);
            if (a2 != null) {
                xb.b("displayOnHostView tryCreatingViewOnHostView error " + a2, (Throwable) null, 2, (Object) null);
                a(a2);
                return;
            }
            cl u = this.b.u();
            if (u != null) {
                a(viewGroup, u);
                Unit unit = Unit.INSTANCE;
            } else {
                new a();
            }
        } catch (Exception e) {
            xb.b("displayOnHostView e", e);
            a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    public boolean a() {
        return this.m;
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.l = true;
        this.d.a(this.a, error);
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(boolean z) {
        this.j = z;
    }
}
