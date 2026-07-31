package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC1489j2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.q7;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class m7<Listener extends InterfaceC1489j2> extends q7<Listener> implements AdapterAdInteractionListener {

    class a extends ir {
        a() {
        }

        @Override // com.ironsource.ir
        public void a() {
            m7.this.P();
        }
    }

    class b extends ir {
        b() {
        }

        @Override // com.ironsource.ir
        public void a() {
            m7.this.S();
        }
    }

    class c extends ir {
        c() {
        }

        @Override // com.ironsource.ir
        public void a() {
            m7.this.Q();
        }
    }

    class d extends ir {
        d() {
        }

        @Override // com.ironsource.ir
        public void a() {
            m7.this.T();
        }
    }

    class e extends ir {
        e() {
        }

        @Override // com.ironsource.ir
        public void a() {
            m7.this.R();
        }
    }

    class f extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17207b;

        f(int i4, String str) {
            this.f17206a = i4;
            this.f17207b = str;
        }

        @Override // com.ironsource.ir
        public void a() {
            m7.this.b(this.f17206a, this.f17207b);
        }
    }

    public m7(up upVar, C1509m1 c1509m1, BaseAdAdapter<?, ?> baseAdAdapter, C1441c3 c1441c3, C1513m5 c1513m5, Listener listener) {
        super(upVar, c1509m1, baseAdAdapter, c1441c3, c1513m5, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f18790q) {
            try {
                if (this.f18778e != q7.h.SHOWING) {
                    ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f18778e);
                    C1454e2 c1454e2 = this.f18777d;
                    if (c1454e2 != null) {
                        c1454e2.f15956k.k("unexpected ad closed - state = " + this.f18778e);
                    }
                    return;
                }
                a(q7.h.NONE);
                if (this.f18777d != null) {
                    String str2 = "";
                    if (this.f18774a.a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        String d4 = ((InterfaceC1489j2) this.f18775b).d();
                        StringBuilder sb = new StringBuilder();
                        sb.append("otherInstanceAvailable = ");
                        if (d4.length() > 0) {
                            str = "true|" + d4;
                        } else {
                            str = "false";
                        }
                        sb.append(str);
                        str2 = sb.toString();
                    }
                    this.f18777d.f15955j.a(j(), str2);
                }
                ((InterfaceC1489j2) this.f18775b).a(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.d(j());
        }
        ((InterfaceC1489j2) this.f18775b).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        IronLog.INTERNAL.verbose(d());
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.l(j());
        }
        ((InterfaceC1489j2) this.f18775b).b((m7<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.i(j());
        }
        ((InterfaceC1489j2) this.f18775b).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.k(j());
        }
    }

    static String a(q7.h hVar, int i4, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i4), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i4, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i4 + ", " + str));
        q7.h hVar = this.f18778e;
        if (hVar == q7.h.SHOWING) {
            a(q7.h.FAILED);
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15955j.a(j(), i4, str, "");
            }
            ((InterfaceC1489j2) this.f18775b).a(new IronSourceError(i4, str), (m7<?>) this);
            return;
        }
        String a4 = a(hVar, i4, str);
        ironLog.error(a(a4));
        C1454e2 c1454e22 = this.f18777d;
        if (c1454e22 != null) {
            c1454e22.f15956k.s(a4);
        }
    }

    @Override // com.ironsource.q7
    public boolean B() {
        Object obj;
        if (this.f18784k == null || !y()) {
            return false;
        }
        try {
            obj = this.f18776c;
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "isReadyToShow - exception = " + th.getMessage() + " - state = " + this.f18778e;
            IronLog.INTERNAL.error(a(str));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15956k.g(str);
            }
        }
        if (obj instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f18784k);
        }
        IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        C1454e2 c1454e22 = this.f18777d;
        if (c1454e22 != null) {
            c1454e22.f15956k.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().c()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().c()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i4, String str) {
        if (u().c()) {
            u().a(new f(i4, str));
        } else {
            b(i4, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (u().c()) {
            u().a(new e());
        } else {
            R();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().c()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().c()) {
            u().a(new d());
        } else {
            T();
        }
    }

    public void a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + placement.getPlacementName()));
        try {
            this.f18780g = placement;
            a(q7.h.SHOWING);
            this.f18777d.f15955j.a(activity, j());
            Object obj = this.f18776c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f18784k, this);
                return;
            }
            ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15956k.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            o9.d().a(th);
            a(q7.h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.f18778e;
            IronLog.INTERNAL.error(a(str));
            C1454e2 c1454e22 = this.f18777d;
            if (c1454e22 != null) {
                c1454e22.f15956k.g(str);
            }
            onAdShowFailed(C1426a2.h(this.f18774a.a()), str);
        }
    }

    public void b(boolean z4) {
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.a(z4);
        }
    }
}
