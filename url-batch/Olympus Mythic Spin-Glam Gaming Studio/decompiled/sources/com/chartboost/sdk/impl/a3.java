package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class a3 implements da, la, ea, va {
    public final ja a;
    public final /* synthetic */ da b;
    public final /* synthetic */ la c;
    public final /* synthetic */ ea d;
    public final /* synthetic */ va e;
    public ra f;

    public a3(ja impressionDependency, da impressionClick, la impressionDismiss, ea impressionComplete, va impressionView) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        Intrinsics.checkNotNullParameter(impressionClick, "impressionClick");
        Intrinsics.checkNotNullParameter(impressionDismiss, "impressionDismiss");
        Intrinsics.checkNotNullParameter(impressionComplete, "impressionComplete");
        Intrinsics.checkNotNullParameter(impressionView, "impressionView");
        this.a = impressionDependency;
        this.b = impressionClick;
        this.c = impressionDismiss;
        this.d = impressionComplete;
        this.e = impressionView;
        this.f = ra.c;
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.b.a(str, error);
    }

    public final void b(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (j()) {
            this.a.c().m();
        } else {
            a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.la
    public void c() {
        this.c.c();
    }

    @Override // com.chartboost.sdk.impl.da
    public void d() {
        this.b.d();
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean e() {
        return this.e.e();
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean f() {
        return this.e.f();
    }

    @Override // com.chartboost.sdk.impl.va
    public void g() {
        this.e.g();
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean h() {
        return this.e.h();
    }

    @Override // com.chartboost.sdk.impl.va
    public ViewGroup i() {
        return this.e.i();
    }

    @Override // com.chartboost.sdk.impl.va
    public boolean j() {
        return this.e.j();
    }

    @Override // com.chartboost.sdk.impl.va
    public void k() {
        this.e.k();
    }

    @Override // com.chartboost.sdk.impl.va
    public void l() {
        this.e.l();
    }

    @Override // com.chartboost.sdk.impl.va
    public void onResume() {
        this.e.onResume();
    }

    @Override // com.chartboost.sdk.impl.va
    public void onStart() {
        this.e.onStart();
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(ra state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(state, activity);
    }

    @Override // com.chartboost.sdk.impl.da
    public void c(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.b.c(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.va
    public void d(boolean z) {
        this.e.d(z);
    }

    @Override // com.chartboost.sdk.impl.da
    public void e(boolean z) {
        this.b.e(z);
    }

    @Override // com.chartboost.sdk.impl.la
    public void f(boolean z) {
        this.c.f(z);
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(ViewGroup viewGroup) {
        this.e.a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.va
    public void c(boolean z) {
        this.e.c(z);
    }

    public final void d(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), this.f);
    }

    @Override // com.chartboost.sdk.impl.ea
    public void a() {
        this.d.a();
    }

    @Override // com.chartboost.sdk.impl.da
    public boolean a(String urlFromCreative, Boolean bool, ra impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        return this.b.a(urlFromCreative, bool, impressionState);
    }

    @Override // com.chartboost.sdk.impl.la
    public void a(ra state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.c.a(state);
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.e.a(error);
    }

    @Override // com.chartboost.sdk.impl.da
    public void a(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.b.a(cbUrl);
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        this.a.r().a(verificationScriptResourceList, num);
    }

    public final void J() {
        this.f = ra.c;
        CBError.Impression A = this.a.r().A();
        if (A == null) {
            g();
        } else {
            b(A);
        }
    }

    public final void K() {
        a(this.a.n(), Float.valueOf(this.a.r().t()), Float.valueOf(this.a.r().s()));
    }

    public final void G() {
        if (this.f != ra.e || j()) {
            return;
        }
        l();
        d(true);
    }

    public final void E() {
        b(this.a.n(), Float.valueOf(this.a.r().t()), Float.valueOf(this.a.r().s()));
        d();
    }

    public ra q() {
        return this.f;
    }

    public final void m() {
        a(this.f);
    }

    public final String r() {
        return this.a.n();
    }

    public final boolean L() {
        return this.a.a().c();
    }

    public final String o() {
        return this.a.b().m();
    }

    public final void P() {
        this.a.r().f();
    }

    public final boolean C() {
        if (this.a.r().u() != null) {
            cl u = this.a.r().u();
            if ((u != null ? u.getRootView() : null) != null) {
                return false;
            }
        }
        return true;
    }

    public final cl y() {
        return this.a.r().u();
    }

    public final int x() {
        if (this.a.r() instanceof vk) {
            return ((vk) this.a.r()).G();
        }
        return -1;
    }

    public final void O() {
        this.a.r().w();
    }

    @Override // com.chartboost.sdk.impl.da
    public void b(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.b.b(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.va
    public void b() {
        this.e.b();
    }

    public void b(ra newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f = newState;
    }

    public final void A() {
        if (j() && Intrinsics.areEqual(this.a.a(), c0.c.g)) {
            z();
        }
    }

    public final void F() {
        if (this.a.l().c() <= 1) {
            B();
            ia l = this.a.l();
            l.c(l.c() + 1);
        }
    }

    public final void I() {
        try {
            q3 r = this.a.r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((vk) r).M();
        } catch (Exception e) {
            xb.b("Invalid play video command", e);
        }
    }

    public final void H() {
        try {
            q3 r = this.a.r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((vk) r).L();
        } catch (Exception e) {
            xb.b("Invalid pause video command", e);
        }
    }

    public final void n() {
        try {
            q3 r = this.a.r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((vk) r).E();
        } catch (Exception e) {
            xb.b("Invalid close video command", e);
        }
    }

    public final void D() {
        try {
            if (this.a.r() instanceof vk) {
                ((vk) this.a.r()).I();
            } else {
                this.a.r().v();
                this.a.r().a(ek.l);
            }
        } catch (Exception e) {
            xb.b("Invalid mute video command", e);
        }
    }

    public final void N() {
        try {
            if (this.a.r() instanceof vk) {
                ((vk) this.a.r()).O();
            } else {
                this.a.r().D();
                this.a.r().a(ek.l);
            }
        } catch (Exception e) {
            xb.b("Invalid unmute video command", e);
        }
    }

    @Override // com.chartboost.sdk.impl.va
    public void b(boolean z) {
        this.e.b(z);
    }

    public final void M() {
        if (this.a.l().d() <= 1) {
            z();
            B();
            ia l = this.a.l();
            l.d(l.d() + 1);
        }
    }

    public final String v() {
        return this.a.r().o();
    }

    public final String t() {
        return this.a.r().k();
    }

    public final String s() {
        return this.a.r().i();
    }

    public final String w() {
        return this.a.r().p();
    }

    public final String u() {
        return this.a.r().m();
    }

    public final String p() {
        return this.a.b().t();
    }

    public final void z() {
        if (this.a.l().a() <= 1) {
            a();
            ia l = this.a.l();
            l.a(l.a() + 1);
        }
    }

    public final void B() {
        if (this.a.l().b() <= 1) {
            K();
            ia l = this.a.l();
            l.b(l.b() + 1);
        }
    }

    public final void b(float f) {
        this.a.r().b(f);
    }

    @Override // com.chartboost.sdk.impl.da
    public void b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.b.b(location, f, f2);
    }

    public final void a(float f, float f2) {
        this.a.r().a(f, f2);
    }

    @Override // com.chartboost.sdk.impl.ea
    public void a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.d.a(location, f, f2);
    }

    public final void a(String event) {
        List list;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.length() <= 0 || (list = (List) this.a.b().l().get(event)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.r().d((String) it.next());
        }
    }

    public final void a(ek vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        this.a.r().a(vastVideoEvent);
    }

    public final void a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        this.a.r().a(z, forceOrientation);
    }

    public final void a(float f) {
        this.a.r().a(f);
    }

    @Override // com.chartboost.sdk.impl.va
    public void a(boolean z) {
        this.e.a(z);
    }

    public final void a(xe playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.a.r().a(playerState);
    }
}
