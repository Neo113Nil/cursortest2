package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.oa;
import com.chartboost.sdk.impl.pl;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes10.dex */
public final class o0 implements r0, pa, ca, oa, p0, q7 {
    public final c0 a;
    public final j3 b;
    public final u8 c;
    public final xk d;
    public final aa e;
    public final s0 f;
    public final fe g;
    public final ua h;
    public final ag i;
    public final pd j;
    public final uh k;
    public final Mediation l;
    public final CoroutineScope m;
    public final q7 n;
    public final EndpointRepository o;
    public q0 p;
    public a3 q;
    public final Map r;
    public final c s;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ViewGroup c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.c = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.removeAllViews();
            this.c.invalidate();
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ a3 c;
        public final /* synthetic */ o0 d;
        public final /* synthetic */ q1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a3 a3Var, o0 o0Var, q1 q1Var, Continuation continuation) {
            super(2, continuation);
            this.c = a3Var;
            this.d = o0Var;
            this.e = q1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a3 a3Var = this.c;
            if (a3Var != null) {
                a3Var.J();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.d.d(this.e, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            return Unit.INSTANCE;
        }
    }

    public o0(c0 adType, j3 reachability, u8 fileCache, xk videoRepository, aa impressionBuilder, s0 adUnitRendererShowRequest, fe openMeasurementController, ua viewProtocolBuilder, ag rendererActivityBridge, pd nativeBridgeCommand, uh templateLoader, Mediation mediation, CoroutineScope uiScope, q7 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(impressionBuilder, "impressionBuilder");
        Intrinsics.checkNotNullParameter(adUnitRendererShowRequest, "adUnitRendererShowRequest");
        Intrinsics.checkNotNullParameter(openMeasurementController, "openMeasurementController");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.a = adType;
        this.b = reachability;
        this.c = fileCache;
        this.d = videoRepository;
        this.e = impressionBuilder;
        this.f = adUnitRendererShowRequest;
        this.g = openMeasurementController;
        this.h = viewProtocolBuilder;
        this.i = rendererActivityBridge;
        this.j = nativeBridgeCommand;
        this.k = templateLoader;
        this.l = mediation;
        this.m = uiScope;
        this.n = eventTracker;
        this.o = endpointRepository;
        this.r = new LinkedHashMap();
        this.s = new c();
    }

    @Override // com.chartboost.sdk.impl.r0
    public void b(String impressionId) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        a(si.b.c, "");
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.b(impressionId);
        }
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.n.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.n.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.n.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.n.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.n.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.n.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.n.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo3222track(event);
    }

    public final Mediation F() {
        return this.l;
    }

    public final void E() {
        try {
            a3 a3Var = this.q;
            if (a3Var != null) {
                this.g.f();
                ViewGroup i = a3Var.i();
                if (i != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new a(i, null), 3, null);
                }
                a3Var.P();
                this.q = null;
                this.p = null;
            }
        } catch (Exception e) {
            xb.b("detachBannerImpression error", e);
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void o() {
        Unit unit;
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.b(ra.d);
            if (a3Var.L()) {
                a3Var.a(a3Var.i());
            } else {
                this.i.a(this);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.b("Cannot display missing impression onImpressionReadyToBeDisplayed", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void p() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.onStart();
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void r() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.onResume();
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void y() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.b();
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void x() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.k();
        }
        this.j.a((d9) null);
        this.j.a();
    }

    @Override // com.chartboost.sdk.impl.p0
    public void e() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.O();
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void m() {
        this.i.finishActivity();
    }

    public final int G() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            return a3Var.x();
        }
        return -1;
    }

    @Override // com.chartboost.sdk.impl.pa
    public void n() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.P();
        }
        this.q = null;
        this.p = null;
    }

    @Override // com.chartboost.sdk.impl.ca
    public void d() {
        Unit unit;
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.E();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Missing impression on impression click success callback ", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ca
    public void D() {
        a3 a3Var = this.q;
        if ((a3Var != null ? a3Var.q() : null) != ra.e || Intrinsics.areEqual(this.a, c0.a.g)) {
            return;
        }
        this.i.finishActivity();
    }

    public boolean H() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            return a3Var.e();
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.pa
    public void g() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.m();
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(int i, boolean z) {
        this.i.a(i, z);
    }

    @Override // com.chartboost.sdk.impl.pa
    public void c() {
        xb.a("DISMISS_MISSING event was successfully removed upon dismiss callback", (Throwable) null, 2, (Object) null);
        clearFromStorage((pi) new l7(si.i.o, "", "", "", null, 16, null));
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.c();
        }
    }

    @Override // com.chartboost.sdk.impl.ca
    public void a(String str, CBError.Click error) {
        Unit unit;
        Intrinsics.checkNotNullParameter(error, "error");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(str, error);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Missing impression on impression click failure callback ", (Throwable) null, 2, (Object) null);
        }
    }

    public static final class c implements xl {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.xl
        public void a() {
            a3 a3Var = o0.this.q;
            if (a3Var != null) {
                a3Var.b(CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void t() {
        this.i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.oa
    public String j() {
        String p;
        a3 a3Var = this.q;
        return (a3Var == null || (p = a3Var.p()) == null) ? "" : p;
    }

    @Override // com.chartboost.sdk.impl.oa
    public String h() {
        String u;
        a3 a3Var = this.q;
        return (a3Var == null || (u = a3Var.u()) == null) ? "" : u;
    }

    @Override // com.chartboost.sdk.impl.oa
    public String B() {
        String w;
        a3 a3Var = this.q;
        return (a3Var == null || (w = a3Var.w()) == null) ? "" : w;
    }

    @Override // com.chartboost.sdk.impl.oa
    public String s() {
        String s;
        a3 a3Var = this.q;
        return (a3Var == null || (s = a3Var.s()) == null) ? "" : s;
    }

    private final void e(q1 q1Var) {
        q1Var.b(false);
        q1Var.a((d0) null);
    }

    @Override // com.chartboost.sdk.impl.oa
    public String w() {
        String t;
        a3 a3Var = this.q;
        return (a3Var == null || (t = a3Var.t()) == null) ? "" : t;
    }

    @Override // com.chartboost.sdk.impl.oa
    public void e(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(event);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public String C() {
        String v;
        a3 a3Var = this.q;
        return (a3Var == null || (v = a3Var.v()) == null) ? "" : v;
    }

    public final void b(q1 q1Var, CBError.Impression impression) {
        d(q1Var, impression);
        if (impression != CBError.Impression.IMPRESSION_ALREADY_VISIBLE) {
            e(q1Var);
        }
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.oa
    public void l() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.M();
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void b(q1 appRequest) {
        Unit unit;
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        c(true);
        String c2 = c(appRequest);
        if (c2 != null) {
            this.r.put(c2, appRequest);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.b("Unable to store app request because impression ID is missing. Impression tracking will not work.", (Throwable) null, 2, (Object) null);
        }
        f(appRequest.d());
        if (H()) {
            g(c2);
        }
    }

    public /* synthetic */ o0(c0 c0Var, j3 j3Var, u8 u8Var, xk xkVar, aa aaVar, s0 s0Var, fe feVar, ua uaVar, ag agVar, pd pdVar, uh uhVar, Mediation mediation, CoroutineScope coroutineScope, q7 q7Var, EndpointRepository endpointRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, j3Var, u8Var, xkVar, aaVar, s0Var, feVar, uaVar, agVar, pdVar, uhVar, mediation, (i & 4096) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope, q7Var, endpointRepository);
    }

    @Override // com.chartboost.sdk.impl.oa
    public void u() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.G();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void i() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.A();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void A() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.z();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void q() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.F();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void v() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.I();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void k() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.H();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void z() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.n();
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void f() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.D();
        }
    }

    public final void h(q1 q1Var) {
        if (q1Var.e()) {
            return;
        }
        q1Var.b(true);
        track((pi) new ya(si.i.c, "", this.a.b(), q1Var.d(), null, null, 48, null));
    }

    public final void d(q1 q1Var) {
        s0 s0Var = this.f;
        URL endPointUrl = this.o.getEndPointUrl(this.a.d());
        d0 a2 = q1Var.a();
        s0Var.a(endPointUrl, new fh(a2 != null ? a2.a() : null, q1Var.d(), G(), this.a.b(), this.l));
    }

    @Override // com.chartboost.sdk.impl.oa
    public void d(o3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.c(url);
        }
    }

    private final String c(q1 q1Var) {
        d0 a2;
        if (q1Var == null || (a2 = q1Var.a()) == null) {
            return null;
        }
        return a2.m();
    }

    @Override // com.chartboost.sdk.impl.oa
    public void c(o3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.b(url);
        }
    }

    public final void g(String str) {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(true);
        }
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.c(str);
        }
        this.g.i();
        q1 q1Var = (q1) TypeIntrinsics.asMutableMap(this.r).remove(str);
        if (q1Var != null) {
            q0 q0Var2 = this.p;
            if (q0Var2 != null) {
                q0Var2.e(str);
            }
            d(q1Var);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void b(o3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.d(cbUrl);
        }
    }

    @Override // com.chartboost.sdk.impl.p0
    public void a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(error);
        }
    }

    public final void f(String str) {
        if (Intrinsics.areEqual(this.a, c0.a.g)) {
            return;
        }
        persist((pi) new ya(si.i.o, "dismiss_missing due to ad not finished", this.a.b(), str, this.l, null, 32, null));
    }

    public final void g(final q1 q1Var) {
        String str;
        String B;
        d0 a2 = q1Var.a();
        if (a2 != null && a2.D()) {
            xk xkVar = this.d;
            d0 a3 = q1Var.a();
            String str2 = "";
            if (a3 == null || (str = a3.C()) == null) {
                str = "";
            }
            d0 a4 = q1Var.a();
            if (a4 != null && (B = a4.B()) != null) {
                str2 = B;
            }
            xkVar.a(str, str2, true, new t0() { // from class: com.chartboost.sdk.impl.o0$$ExternalSyntheticLambda0
                @Override // com.chartboost.sdk.impl.t0
                public final void a(String str3) {
                    o0.a(o0.this, q1Var, str3);
                }
            });
            return;
        }
        f(q1Var);
    }

    public final void f(q1 q1Var) {
        if (this.q != null && q1Var.b() == null) {
            xb.b("Fullscreen impression is currently loading.", (Throwable) null, 2, (Object) null);
            return;
        }
        if (!this.b.e()) {
            c(q1Var, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.d(c(q1Var));
        }
        aa aaVar = this.e;
        e0 b2 = q1Var.b();
        na a2 = aaVar.a(q1Var, this, b2 != null ? b2.b() : null, this, this, this.h, this, this.s, this.j, this.k);
        this.q = a2.b();
        a(q1Var, a2.b(), a2.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    @Override // com.chartboost.sdk.impl.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(CBImpressionActivity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(a3Var.q(), activity);
            cl y = a3Var.y();
            if (y != null) {
                this.i.a(y);
                unit = Unit.INSTANCE;
                if (unit != null) {
                    xb.b("Cannot display missing impression onActivityIsReadyToDisplay", (Throwable) null, 2, (Object) null);
                    return;
                }
                return;
            }
        }
        unit = null;
        if (unit != null) {
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public CBError.Impression d(String str) {
        return oa.a.a(this, str);
    }

    private final void c(q1 q1Var, CBError.Impression impression) {
        Unit unit;
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.a(c(q1Var), impression);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("Missing AdUnitRendererAdCallback while sending onShowFailure with error: " + impression, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(String impressionId, String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(error, "error");
        a(si.b.d, error.name());
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.a(impressionId, str, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(q1 q1Var, CBError.Impression impression) {
        c(q1Var, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String b2 = this.a.b();
        d0 a2 = q1Var.a();
        String a3 = a2 != null ? a2.a() : null;
        xb.b("reportError: adTypeTraits: " + b2 + " reason: cache  format: web error: " + impression + " adId: " + a3 + " appRequest.location: " + q1Var.d(), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(q1 appRequest) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        e(appRequest);
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.ca
    public void b(boolean z) {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.f(z);
        }
    }

    public void c(boolean z) {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.b(z);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void c(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        xb.b("WebView warning occurred closing the webview " + msg, (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(String str) {
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.a(str);
        }
        this.g.g();
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(q1 appRequest, CBError.Impression error) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(error, "error");
        b(appRequest, error);
        track((pi) new s5(si.i.l, "", this.a.b(), appRequest.d(), this.l, null, 32, null));
        this.i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.oa
    public void b(float f) {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(f);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void b() {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.N();
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a(String str, int i) {
        q0 q0Var = this.p;
        if (q0Var != null) {
            q0Var.a(str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.chartboost.sdk.impl.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        final a3 a3Var = this.q;
        if (a3Var != null) {
            if (!this.g.h()) {
                a3Var.c(true);
                xb.a("Cannot create visibility tracker due to the OM SDK being disabled!", (Throwable) null, 2, (Object) null);
                return;
            }
            if (a3Var.C()) {
                xb.b("Cannot create VisibilityTracker due to missing view!", (Throwable) null, 2, (Object) null);
                return;
            }
            cl y = a3Var.y();
            if (y != null) {
                fe feVar = this.g;
                View rootView = y.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
                feVar.a(context, y, rootView, new pl.b() { // from class: com.chartboost.sdk.impl.o0$$ExternalSyntheticLambda1
                    @Override // com.chartboost.sdk.impl.pl.b
                    public final void a() {
                        o0.a(o0.this, a3Var);
                    }
                });
                unit = Unit.INSTANCE;
                if (unit != null) {
                    xb.b("Missing impression onImpressionViewCreated", (Throwable) null, 2, (Object) null);
                    return;
                }
                return;
            }
        }
        unit = null;
        if (unit != null) {
        }
    }

    public static final void a(o0 this$0, a3 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.a(it);
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(o3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(url);
        }
    }

    public final void a(a3 a3Var) {
        xb.b("Visibility check success!", (Throwable) null, 2, (Object) null);
        a3Var.c(true);
        if (!a3Var.h() || a3Var.f()) {
            return;
        }
        g(a3Var.o());
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(verificationScriptResourceList, num);
        }
    }

    public final void a(q1 appRequest, q0 callback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.p = callback;
        if (!this.b.e()) {
            c(appRequest, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        d0 a2 = appRequest.a();
        if (a2 == null) {
            d(appRequest, CBError.Impression.NO_AD_FOUND);
        } else if (!this.c.a(a2).booleanValue()) {
            d(appRequest, CBError.Impression.ASSET_MISSING);
        } else {
            h(appRequest);
            g(appRequest);
        }
    }

    @Override // com.chartboost.sdk.impl.r0
    public void a() {
        this.i.a();
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(float f, float f2) {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(f, f2);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(ek vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(vastVideoEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.ca
    public void a(boolean z) {
        a3 a3Var = this.q;
        if (a3Var == null) {
            return;
        }
        a3Var.e(z);
    }

    @Override // com.chartboost.sdk.impl.pa
    public void a(ra state) {
        Intrinsics.checkNotNullParameter(state, "state");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.b(state);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(z, forceOrientation);
        }
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(float f) {
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.b(f);
        }
    }

    public final void a(q1 q1Var, a3 a3Var, CBError.Impression impression) {
        if (impression == null) {
            BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new b(a3Var, this, q1Var, null), 3, null);
        } else {
            d(q1Var, impression);
            e(q1Var);
        }
    }

    public static final void a(o0 this$0, q1 appRequest, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appRequest, "$appRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f(appRequest);
    }

    public final void a(si siVar, String str) {
        String str2;
        String b2 = this.a.b();
        a3 a3Var = this.q;
        if (a3Var == null || (str2 = a3Var.r()) == null) {
            str2 = "No location";
        }
        track((pi) new ya(siVar, str, b2, str2, this.l, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.oa
    public void a(xe playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        a3 a3Var = this.q;
        if (a3Var != null) {
            a3Var.a(playerState);
        }
    }
}
