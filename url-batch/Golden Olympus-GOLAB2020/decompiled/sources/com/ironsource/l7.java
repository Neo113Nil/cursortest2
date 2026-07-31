package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.m7;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.n7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class l7<Smash extends m7<?>, Listener extends AdapterAdInteractionListener> extends n7<Smash, Listener> implements InterfaceC1489j2 {

    class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f16993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Placement f16994b;

        a(Activity activity, Placement placement) {
            this.f16993a = activity;
            this.f16994b = placement;
        }

        @Override // com.ironsource.ir
        public void a() {
            l7.this.b(this.f16993a, this.f16994b);
        }
    }

    protected l7(C1571u0 c1571u0, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(c1571u0, rkVar, ironSourceSegment);
    }

    private String a(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb.append(smash.c());
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb.append(smash.e());
                sb.append(StringUtils.COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, Placement placement) {
        m7 m7Var;
        IronSourceError ironSourceError;
        String a4;
        IronLog.INTERNAL.verbose(b("state = " + this.f18299p));
        synchronized (this.f18307x) {
            try {
                this.f18292i = placement;
                this.f18302s.f15955j.a(activity, n());
                n7.f fVar = this.f18299p;
                n7.f fVar2 = n7.f.SHOWING;
                m7Var = null;
                if (fVar == fVar2) {
                    ironSourceError = new IronSourceError(C1426a2.g(this.f18298o.b()), "can't show ad while an ad is already showing");
                } else if (fVar != n7.f.READY_TO_SHOW) {
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
                } else if (placement == null) {
                    ironSourceError = new IronSourceError(C1426a2.b(this.f18298o.b()), "empty default placement");
                } else if (this.f18278E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.f18298o.b())) {
                    ironSourceError = new IronSourceError(C1426a2.f(this.f18298o.b()), "placement " + placement.getPlacementName() + " is capped");
                } else {
                    ironSourceError = null;
                }
                if (ironSourceError != null) {
                    IronLog.API.error(b(ironSourceError.getErrorMessage()));
                    a4 = "";
                } else {
                    List b4 = this.f18284a.b();
                    jw jwVar = new jw(this.f18298o);
                    m7Var = (m7) jwVar.c(b4);
                    a((l7<Smash, Listener>) m7Var, (List<l7<Smash, Listener>>) jwVar.b(b4));
                    if (m7Var != null) {
                        a(fVar2);
                        i(m7Var);
                    } else {
                        ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.f18298o.b().toString());
                        a4 = a(b4);
                    }
                }
                a(ironSourceError, a4);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m7Var != null) {
            a(activity, (m7<?>) m7Var, this.f18292i);
        }
    }

    @Override // com.ironsource.InterfaceC1489j2
    public void c(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.f18303t.a();
    }

    @Override // com.ironsource.InterfaceC1489j2
    public String d() {
        StringBuilder sb = new StringBuilder();
        if (this.f18299p == n7.f.READY_TO_SHOW) {
            for (m7 m7Var : this.f18284a.b()) {
                if (m7Var.y()) {
                    sb.append(m7Var.c());
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ironsource.n7
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.f18293j && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f18284a.b().iterator();
        while (it.hasNext()) {
            if (((m7) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.n7
    protected boolean v() {
        return false;
    }

    l7(yf yfVar, xf xfVar, C1571u0 c1571u0, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(yfVar, xfVar, c1571u0, rkVar, ironSourceSegment);
    }

    private void a(Activity activity, m7<?> m7Var, Placement placement) {
        if (this.f18298o.h().e()) {
            this.f18301r.a();
        }
        m7Var.a(activity, placement);
    }

    @Override // com.ironsource.InterfaceC1489j2
    public void b(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.f18303t.g(m7Var.f());
    }

    @Override // com.ironsource.InterfaceC1489j2
    public void d(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.f18303t.b();
    }

    public void a(Activity activity, Placement placement) {
        if (c()) {
            a(new a(activity, placement));
        } else {
            b(activity, placement);
        }
    }

    @Override // com.ironsource.InterfaceC1489j2
    public void a(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        if (this.f18299p == n7.f.SHOWING) {
            a(n7.f.READY_TO_LOAD);
        }
        this.f18300q.f();
        this.f18303t.a(m7Var.f());
    }

    private void a(@Nullable Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    @Override // com.ironsource.InterfaceC1489j2
    public void a(IronSourceError ironSourceError, m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k() + " - error = " + ironSourceError));
        this.f18285b.put(m7Var.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(n7.f.READY_TO_LOAD);
        a(ironSourceError, m7Var, "");
    }

    private void a(IronSourceError ironSourceError, m7<?> m7Var, String str) {
        this.f18302s.f15955j.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f18300q.g();
        this.f18303t.a(ironSourceError, m7Var != null ? m7Var.f() : null);
        if (this.f18298o.h().e()) {
            b(false);
        }
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (m7<?>) null, str);
    }
}
