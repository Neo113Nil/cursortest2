package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.t3;
import com.chartboost.sdk.internal.Model.CBError;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class l2 implements j9 {
    public static final a p = new a(null);
    public final Ad a;
    public final com.chartboost.sdk.impl.d b;
    public final AdCallback c;
    public final h6 d;
    public final com.chartboost.sdk.impl.j e;
    public final CoroutineDispatcher f;
    public final i2 g;
    public boolean h;
    public volatile boolean i;
    public final Lazy j;
    public volatile boolean k;
    public final CoroutineScope l;
    public Job m;
    public URL n;
    public final AdCallback o;

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o mo4828invoke() {
            return new o(l2.this.e, l2.this.e().getMediation(), l2.this.f(), l2.this.k().c(), l2.this.k().b(), l2.this.k().a().q(), l2.this.k().a().c(), l2.this.k().d().d(), null, l2.this.f, 256, null);
        }
    }

    public static final class f implements AdCallback {
        public f() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            l2.this.a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            l2.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            l2.this.a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            l2.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            l2.this.a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            l2.this.a(event);
        }
    }

    public static final class g extends ContinuationImpl {
        public Object b;
        public Object c;
        public long d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a = l2.a(l2.this, (Context) null, (String) null, (v) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;
        public final /* synthetic */ v f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context, String str, v vVar, Continuation continuation) {
            super(2, continuation);
            this.d = context;
            this.e = str;
            this.f = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l2.this.new h(this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o g = l2.this.g();
                Context context = this.d;
                String str = this.e;
                v vVar = this.f;
                this.b = 1;
                a = g.a(context, str, vVar, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(a);
        }
    }

    public static final class j extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a = l2.a(l2.this, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ShowEvent d;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ShowEvent showEvent, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = showEvent;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l2.this.new k(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                l2.this.i().onAdRequestedToShow(this.d);
                o g = l2.this.g();
                Context context = this.e;
                this.b = 1;
                a = g.a(context, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = ((Result) obj).getValue();
            }
            return Result.m8022boximpl(a);
        }
    }

    public l2(Ad ad, com.chartboost.sdk.impl.d api, AdCallback originalCallback, h6 dependencyContainer, com.chartboost.sdk.impl.j adConfigInternal, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        Intrinsics.checkNotNullParameter(adConfigInternal, "adConfigInternal");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = ad;
        this.b = api;
        this.c = originalCallback;
        this.d = dependencyContainer;
        this.e = adConfigInternal;
        this.f = ioDispatcher;
        this.g = new i2();
        this.j = LazyKt.lazy(new c());
        this.l = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        this.o = new f();
    }

    public abstract void a(String str);

    public abstract Object b(Context context, Continuation continuation);

    public abstract com.chartboost.sdk.impl.l f();

    public abstract AdCallback i();

    public final com.chartboost.sdk.impl.l a(DismissibleAdCallback callback, Function0 onReward) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onReward, "onReward");
        return new e(callback, onReward);
    }

    public final Ad e() {
        return this.a;
    }

    public final com.chartboost.sdk.impl.d h() {
        return this.b;
    }

    public final AdCallback l() {
        return this.c;
    }

    public final h6 k() {
        return this.d;
    }

    public final boolean p() {
        return this.h;
    }

    public final o g() {
        return (o) this.j.getValue();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void r() {
        this.i = false;
    }

    @Override // com.chartboost.sdk.impl.j9
    public void c() {
        String location = this.a.getLocation();
        boolean z = this.i;
        vb f2 = g().f();
        xb.a("Clear loaded ad: location=" + location + ", isNRP=" + z + ", auctionId=" + (f2 != null ? f2.b() : null), (Throwable) null, 2, (Object) null);
        if (!Chartboost.isSdkStarted()) {
            xb.b("Clear failed - SDK not initialized: location=" + this.a.getLocation(), (Throwable) null, 2, (Object) null);
            return;
        }
        c(false);
        r();
        Job job = this.m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.m = null;
        this.n = null;
        d();
        g().c();
    }

    public static final class i extends Lambda implements Function0 {
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            l2.this.b(this.c);
        }
    }

    public void n() {
        this.b.a("", (CBError.Type) CBError.Impression.INVALID_RESPONSE);
    }

    public void q() {
        od c2;
        List w;
        vb f2 = g().f();
        String b2 = f2 != null ? f2.b() : null;
        vb f3 = g().f();
        int size = (f3 == null || (c2 = f3.c()) == null || (w = c2.w()) == null) ? 0 : w.size();
        xb.a("NRP load success - notifying callback: location=" + this.a.getLocation() + ", auctionId=" + b2 + ", renderableCount=" + size, (Throwable) null, 2, (Object) null);
        s();
        i().onAdLoaded(new CacheEvent(b2, this.a), null);
    }

    public boolean o() {
        return this.b.b();
    }

    public void d() {
        this.b.a();
    }

    public void c(boolean z) {
        this.k = z;
    }

    public final void d(boolean z) {
        this.h = z;
    }

    public URL m() {
        od z;
        List w;
        od c2;
        List w2;
        vb f2 = g().f();
        m2 m2Var = (f2 == null || (c2 = f2.c()) == null || (w2 = c2.w()) == null) ? null : (m2) CollectionsKt.firstOrNull(w2);
        wk wkVar = m2Var instanceof wk ? (wk) m2Var : null;
        if (wkVar == null) {
            pj pjVar = m2Var instanceof pj ? (pj) m2Var : null;
            vf vfVar = (pjVar == null || (z = pjVar.z()) == null || (w = z.w()) == null) ? null : (m2) CollectionsKt.firstOrNull(w);
            wkVar = vfVar instanceof wk ? (wk) vfVar : null;
        }
        if (wkVar == null) {
            xb.e("Could not find VideoRenderable for ad with location " + this.a.getLocation() + " to observe expiration.", null, 2, null);
        }
        if (wkVar != null) {
            return wkVar.N();
        }
        return null;
    }

    public void s() {
        Job launch$default;
        t();
        URL m = m();
        if (m == null) {
            xb.d("No video URL to observe for ad at location " + this.a.getLocation() + ".", null, 2, null);
            return;
        }
        this.n = m;
        b7 i2 = this.d.a().i();
        xb.a("Starting cache observer for " + this.a.getLocation() + ", URL: " + m, (Throwable) null, 2, (Object) null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new l(i2, m, this, null), 3, null);
        this.m = launch$default;
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ b7 c;
        public final /* synthetic */ URL d;
        public final /* synthetic */ l2 e;

        public static final class a extends SuspendLambda implements Function3 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ URL d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(URL url, Continuation continuation) {
                super(3, continuation);
                this.d = url;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FlowCollector flowCollector, Throwable th, Continuation continuation) {
                a aVar = new a(this.d, continuation);
                aVar.c = th;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.c;
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Cache observer flow error for URL: " + this.d, th instanceof Exception ? (Exception) th : new Exception(th));
                xb.b(X3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Cache observer error", unknown);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b7 b7Var, URL url, l2 l2Var, Continuation continuation) {
            super(2, continuation);
            this.c = b7Var;
            this.d = url;
            this.e = l2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow m8234catch = FlowKt.m8234catch(this.c.a(this.d), new a(this.d, null));
                    b bVar = new b(this.e);
                    this.b = 1;
                    if (m8234catch.collect(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (CancellationException unused) {
                xb.a("Cache observer cancelled for " + this.e.e().getLocation() + ", URL: " + this.d, (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Failed to collect cache events for " + this.e.e().getLocation(), e);
                xb.b(X3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Cache event collection failed, URL: " + this.d, unknown);
            } finally {
                xb.a("Cache observer collect loop finished for " + this.e.e().getLocation() + ", URL: " + this.d, (Throwable) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }

        public static final class b implements FlowCollector {
            public final /* synthetic */ l2 a;

            public b(l2 l2Var) {
                this.a = l2Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(t3 t3Var, Continuation continuation) {
                if (t3Var instanceof t3.a) {
                    boolean p = this.a.p();
                    vb f = this.a.g().f();
                    String b = f != null ? f.b() : null;
                    if (p) {
                        t3.a aVar = (t3.a) t3Var;
                        xb.b("Ad cache evicted while showing: location=" + this.a.e().getLocation() + ", auctionId=" + b + ", reason=" + aVar.a() + ", url=" + aVar.b(), (Throwable) null, 2, (Object) null);
                    } else {
                        t3.a aVar2 = (t3.a) t3Var;
                        xb.e("Ad cache evicted: location=" + this.a.e().getLocation() + ", auctionId=" + b + ", reason=" + aVar2.a() + ", url=" + aVar2.b(), null, 2, null);
                    }
                    this.a.g().a(((t3.a) t3Var).a());
                    this.a.t();
                }
                return Unit.INSTANCE;
            }
        }
    }

    public void t() {
        Job job = this.m;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                xb.a("Stopping cache observer for " + this.a.getLocation() + ", URL: " + this.n, (Throwable) null, 2, (Object) null);
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
        }
        this.m = null;
        this.n = null;
    }

    @Override // com.chartboost.sdk.impl.j9
    public void b() {
        String location = this.a.getLocation();
        boolean z = this.i;
        vb f2 = g().f();
        xb.a("Coordinator destroy: location=" + location + ", isNRP=" + z + ", auctionId=" + (f2 != null ? f2.b() : null), (Throwable) null, 2, (Object) null);
        t();
        CoroutineScopeKt.cancel$default(this.l, "Coordinator destroyed", null, 2, null);
        g().b();
    }

    public final AdCallback j() {
        return this.o;
    }

    public static final class d extends Lambda implements Function0 {
        public static final d b = new d();

        public d() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class e extends b {
        public final /* synthetic */ DismissibleAdCallback c;
        public final /* synthetic */ Function0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DismissibleAdCallback dismissibleAdCallback, Function0 function0) {
            super();
            this.c = dismissibleAdCallback;
            this.d = function0;
        }

        @Override // com.chartboost.sdk.impl.l2.b, com.chartboost.sdk.impl.l
        public void e() {
            Unit unit;
            vb f = l2.this.g().f();
            ShowEvent showEvent = new ShowEvent(f != null ? f.b() : null, l2.this.e());
            l2.this.u();
            this.c.onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), l2.this.e()));
            if (f != null) {
                l2.this.g().c(f);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.e("Cannot track impression: currentAd is null for location " + l2.this.e().getLocation(), null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l2.b, com.chartboost.sdk.impl.l
        public void d() {
            this.d.mo4828invoke();
        }

        @Override // com.chartboost.sdk.impl.l2.b, com.chartboost.sdk.impl.l
        public void b() {
            l2.this.d(false);
            l2.this.c(false);
            DismissibleAdCallback dismissibleAdCallback = this.c;
            vb f = l2.this.g().f();
            dismissibleAdCallback.onAdDismiss(new DismissEvent(f != null ? f.b() : null, l2.this.e()));
        }
    }

    public class b implements com.chartboost.sdk.impl.l {
        public static void safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(Context p0, Intent p1, Bundle p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.c);
            ContextCompat.startActivity(p0, p1, p2);
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            xb.a("DefaultAdContainerListener: onAdClosed called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            xb.a("DefaultAdContainerListener: onAdRewarded called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            xb.a("DefaultAdContainerListener: onAdImpression called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        public b() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            AdCallback l = l2.this.l();
            vb f = l2.this.g().f();
            l.onAdClicked(new ClickEvent(f != null ? f.b() : null, l2.this.e()), null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(m8 expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            l2.this.c(false);
            l2.this.r();
            new com.chartboost.sdk.impl.e(l2.this.k().d().c()).a(new ExpirationEvent(l2.this.e(), expirationReason), l2.this.l());
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.setFlags(268435456);
            safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(l2.this.k().d().getContext(), intent, null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(re request) {
            Intrinsics.checkNotNullParameter(request, "request");
            xb.a("DefaultAdContainerListener: onRequestOrientation called with " + request + ". Ignoring as this ad type may not support or expect orientation changes.", (Throwable) null, 2, (Object) null);
        }
    }

    public /* synthetic */ l2(Ad ad, com.chartboost.sdk.impl.d dVar, AdCallback adCallback, h6 h6Var, com.chartboost.sdk.impl.j jVar, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad, dVar, adCallback, h6Var, jVar, (i2 & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final void u() {
        c0 a2 = t.a(this.a);
        zg k2 = this.d.a().k();
        k2.a(a2);
        xb.c("Current session impression count: " + k2.b(a2) + " in session: " + k2.b() + " (New Rendering Pipeline)", null, 2, null);
    }

    public void b(boolean z) {
        if (z) {
            this.c.onAdLoaded(new CacheEvent(null, this.a), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            this.c.onAdShown(new ShowEvent(null, this.a), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    public static /* synthetic */ com.chartboost.sdk.impl.l a(l2 l2Var, DismissibleAdCallback dismissibleAdCallback, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFullscreenAdContainerListener");
        }
        if ((i2 & 2) != 0) {
            function0 = d.b;
        }
        return l2Var.a(dismissibleAdCallback, function0);
    }

    public final void a(ClickEvent event, ClickError clickError) {
        Intrinsics.checkNotNullParameter(event, "event");
        xb.a("Forwarding onAdClicked: location=" + this.a.getLocation() + ", auctionId=" + event.getAdID() + ", hasError=" + (clickError != null), (Throwable) null, 2, (Object) null);
        this.c.onAdClicked(event, clickError);
    }

    public final void a(ExpirationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        xb.a("Forwarding onAdExpired: location=" + this.a.getLocation() + ", reason=" + event.getReason(), (Throwable) null, 2, (Object) null);
        this.c.onAdExpired(event);
    }

    public final void a(CacheEvent event, CacheError cacheError) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = cacheError == null ? "SUCCESS" : "FAILURE";
        xb.a("Forwarding onAdLoaded: location=" + this.a.getLocation() + ", auctionId=" + event.getAdID() + ", status=" + str + ", errorCode=" + (cacheError != null ? cacheError.getCode() : null), (Throwable) null, 2, (Object) null);
        c(cacheError == null);
        this.c.onAdLoaded(event, cacheError);
    }

    public final void a(ShowEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        xb.a("Forwarding onAdRequestedToShow: location=" + this.a.getLocation() + ", auctionId=" + event.getAdID(), (Throwable) null, 2, (Object) null);
        this.h = true;
        this.c.onAdRequestedToShow(event);
    }

    public final void a(ShowEvent event, ShowError showError) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = showError == null ? "SUCCESS" : "FAILURE";
        xb.a("Forwarding onAdShown: location=" + this.a.getLocation() + ", auctionId=" + event.getAdID() + ", status=" + str + ", errorCode=" + (showError != null ? showError.getCode() : null), (Throwable) null, 2, (Object) null);
        this.h = showError == null;
        this.c.onAdShown(event, showError);
    }

    public final void a(ImpressionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        xb.a("Forwarding onImpressionRecorded: location=" + this.a.getLocation() + ", auctionId=" + event.getAdID(), (Throwable) null, 2, (Object) null);
        this.c.onImpressionRecorded(event);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Throwable throwable, ShowEvent showEvent) {
        String adID;
        String str;
        od c2;
        List w;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.h = false;
        ShowError b2 = q.b(throwable);
        vb f2 = g().f();
        if (f2 == null || (adID = f2.b()) == null) {
            adID = showEvent.getAdID();
        }
        if (f2 != null && (c2 = f2.c()) != null && (w = c2.w()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(w, 10));
            Iterator it = w.iterator();
            while (it.hasNext()) {
                arrayList.add(((m2) it.next()).getClass().getSimpleName());
            }
            str = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        }
        str = "none";
        ChartboostError chartboostError = throwable instanceof ChartboostError ? (ChartboostError) throwable : null;
        xb.b("Show failed: location=" + this.a.getLocation() + ", auctionId=" + adID + ", adFormat=" + this.e.a() + ", errorCode=" + (chartboostError != null ? chartboostError.getCode() : null) + ", errorConstant=" + (chartboostError != null ? chartboostError.getConstant() : null) + ", renderableTypes=" + str + ", causeDescription=" + (chartboostError != null ? chartboostError.getCauseDescription() : null), (Throwable) null, 2, (Object) null);
        this.c.onAdShown(showEvent, b2);
    }

    public void a(View view, ShowEvent showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.c.onAdShown(showEvent, null);
    }

    @Override // com.chartboost.sdk.impl.j9
    public boolean a() {
        if (this.i) {
            return this.k;
        }
        if (Chartboost.isSdkStarted()) {
            return o();
        }
        return this.k;
    }

    @Override // com.chartboost.sdk.impl.j9
    public Object a(Context context, String str, v vVar, Continuation continuation) {
        return a(this, context, str, vVar, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(4:10|11|12|13)(2:91|92))(4:93|(1:95)(1:159)|96|(2:98|99)(5:100|(2:102|(2:106|107))|(1:158)(1:113)|114|(2:116|117)(2:118|(2:120|121)(1:(2:156|157)(1:(14:126|127|128|(1:130)(1:152)|(9:132|133|134|135|136|137|138|139|(1:141)(1:142))|150|133|134|135|136|137|138|139|(0)(0))(2:154|155))))))|14|15|16|(3:18|(3:20|(1:22)(1:72)|23)(6:73|(1:75)(1:84)|76|(1:78)(1:83)|(1:80)(1:82)|81)|24)(1:85)|(12:26|(1:28)(1:68)|29|(4:35|(2:38|36)|39|40)|67|42|43|44|45|46|47|48)|69|70))|160|6|7|(0)(0)|14|15|16|(0)(0)|(0)|69|70|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:126|(3:127|128|(1:130)(1:152))|(4:(9:132|133|134|135|136|137|138|139|(1:141)(1:142))|138|139|(0)(0))|150|133|134|135|136|137) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x040e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x040f, code lost:
    
        r13 = "] ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x039c, code lost:
    
        if (r1 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0284, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0285, code lost:
    
        r13 = r17;
        r11 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0265 A[Catch: Exception -> 0x0284, TRY_ENTER, TryCatch #5 {Exception -> 0x0284, blocks: (B:15:0x025f, B:18:0x0265, B:20:0x026f, B:22:0x027f, B:23:0x028c, B:24:0x02fb, B:26:0x0303, B:28:0x0343, B:29:0x0349, B:31:0x0353, B:33:0x0359, B:35:0x035f, B:36:0x036e, B:38:0x0374, B:40:0x0386, B:42:0x03a1, B:73:0x02ac, B:75:0x02b4, B:76:0x02b9, B:78:0x02c1, B:80:0x02c9, B:81:0x02cf), top: B:14:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0303 A[Catch: Exception -> 0x0284, TryCatch #5 {Exception -> 0x0284, blocks: (B:15:0x025f, B:18:0x0265, B:20:0x026f, B:22:0x027f, B:23:0x028c, B:24:0x02fb, B:26:0x0303, B:28:0x0343, B:29:0x0349, B:31:0x0353, B:33:0x0359, B:35:0x035f, B:36:0x036e, B:38:0x0374, B:40:0x0386, B:42:0x03a1, B:73:0x02ac, B:75:0x02b4, B:76:0x02b9, B:78:0x02c1, B:80:0x02c9, B:81:0x02cf), top: B:14:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object a(l2 l2Var, Context context, String str, v vVar, Continuation continuation) {
        g gVar;
        int i2;
        long j2;
        String str2;
        l2 l2Var2;
        Ref$ObjectRef ref$ObjectRef;
        String str3;
        String str4;
        long j3;
        int optInt;
        ChartboostError.Load internal2;
        ChartboostError.Load load;
        Result result;
        Unit unit;
        String str5;
        od c2;
        List w;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.h = i3 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar2.h;
                String str6 = X3.j.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String location = l2Var.a.getLocation();
                    u a2 = l2Var.e.a();
                    int length = str != null ? str.length() : 0;
                    xb.a("Load requested: location=" + location + ", adFormat=" + a2 + ", bidResponseLength=" + length + ", isLoaded=" + l2Var.a() + ", isShowing=" + l2Var.h, (Throwable) null, 2, (Object) null);
                    if (!Chartboost.isSdkStarted()) {
                        ChartboostError.Load.NotInitialized notInitialized = ChartboostError.Load.NotInitialized.INSTANCE;
                        xb.b("Load failed - SDK not started: location=" + l2Var.a.getLocation(), (Throwable) null, 2, (Object) null);
                        l2Var.a(notInitialized);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(notInitialized));
                    }
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed()) {
                            ChartboostError.Load.NoContext noContext = ChartboostError.Load.NoContext.INSTANCE;
                            xb.b("Load failed - invalid Activity context: location=" + l2Var.a.getLocation() + ", finishing=" + activity.isFinishing() + ", destroyed=" + activity.isDestroyed(), (Throwable) null, 2, (Object) null);
                            l2Var.a(noContext);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(noContext));
                        }
                    }
                    boolean z = (str == null || str.length() == 0 || !o.r.a(l2Var.g, str)) ? false : true;
                    l2Var.i = z;
                    xb.a("Pipeline detection: isNRP=" + z + ", location=" + l2Var.a.getLocation(), (Throwable) null, 2, (Object) null);
                    if (l2Var.a()) {
                        ChartboostError.Load.AlreadyLoaded alreadyLoaded = ChartboostError.Load.AlreadyLoaded.INSTANCE;
                        xb.e("Load rejected - ad already loaded: location=" + l2Var.a.getLocation() + ", isNRP=" + z, null, 2, null);
                        l2Var.a(alreadyLoaded);
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(alreadyLoaded));
                    }
                    if (StringsKt.isBlank(l2Var.a.getLocation())) {
                        ChartboostError.Load.InvalidPlacement invalidPlacement = ChartboostError.Load.InvalidPlacement.INSTANCE;
                        l2Var.a(invalidPlacement);
                        l2Var.r();
                        Result.Companion companion4 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(invalidPlacement));
                    }
                    if (str == null || str.length() == 0) {
                        l2Var.n();
                        Result.Companion companion5 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.InvalidAdm("Bid response is null or empty for placement: " + l2Var.a.getLocation(), null)));
                    }
                    if (z) {
                        xb.a("Starting NRP load: location=" + l2Var.a.getLocation() + ", adFormat=" + l2Var.e.a(), (Throwable) null, 2, (Object) null);
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        Result.Companion companion6 = Result.INSTANCE;
                        ref$ObjectRef2.element = Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Load initialization failed", null)));
                        try {
                            JSONObject optJSONObject = new JSONObject(l2Var.g.b(str)).optJSONObject("config");
                            optInt = optJSONObject != null ? optJSONObject.optInt("load_timeout", 0) : 0;
                        } catch (Exception unused) {
                        }
                        try {
                            if (optInt > 0) {
                                j2 = optInt * 1000;
                                long j4 = j2;
                                long currentTimeMillis = System.currentTimeMillis();
                                str3 = "] ";
                                str4 = X3.j.d;
                                h hVar = l2Var.new h(context, str, vVar, null);
                                gVar2.b = l2Var;
                                gVar2.c = ref$ObjectRef2;
                                gVar2.d = j4;
                                gVar2.e = currentTimeMillis;
                                gVar2.h = 1;
                                obj = TimeoutKt.withTimeoutOrNull(j4, hVar, gVar2);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                l2Var2 = l2Var;
                                j3 = j4;
                                ref$ObjectRef = ref$ObjectRef2;
                            }
                            h hVar2 = l2Var.new h(context, str, vVar, null);
                            gVar2.b = l2Var;
                            gVar2.c = ref$ObjectRef2;
                            gVar2.d = j4;
                            gVar2.e = currentTimeMillis;
                            gVar2.h = 1;
                            obj = TimeoutKt.withTimeoutOrNull(j4, hVar2, gVar2);
                            if (obj != coroutine_suspended) {
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            str6 = str4;
                            l2Var2 = l2Var;
                            ref$ObjectRef = ref$ObjectRef2;
                            if (e instanceof ChartboostError.Load) {
                            }
                            xb.b(str6 + load.getCode() + str2 + load.getConstant() + " - Ad load failed: " + l2Var2.a.getLocation(), load);
                            l2Var2.a(load);
                            l2Var2.r();
                            Result.Companion companion7 = Result.INSTANCE;
                            ref$ObjectRef.element = Result.m8023constructorimpl(ResultKt.createFailure(load));
                            System.currentTimeMillis();
                            return ref$ObjectRef.element;
                        }
                        j2 = 30000;
                        long j42 = j2;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        str3 = "] ";
                        str4 = X3.j.d;
                    } else {
                        xb.a("Routing to old pipeline: location=" + l2Var.a.getLocation() + ", adFormat=" + l2Var.e.a(), (Throwable) null, 2, (Object) null);
                        l2Var.i = false;
                        l2Var.a(str);
                        Result.Companion companion8 = Result.INSTANCE;
                        return Result.m8023constructorimpl(Unit.INSTANCE);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = gVar2.d;
                    ref$ObjectRef = (Ref$ObjectRef) gVar2.c;
                    l2Var2 = (l2) gVar2.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str3 = "] ";
                        str4 = X3.j.d;
                    } catch (Exception e3) {
                        e = e3;
                        str2 = "] ";
                        if (e instanceof ChartboostError.Load) {
                            load = (ChartboostError.Load) e;
                        } else {
                            if (e instanceof IllegalArgumentException) {
                                internal2 = new ChartboostError.Load.InvalidRequest("Invalid request parameters: " + e.getMessage(), e);
                            } else if (e instanceof IllegalStateException) {
                                internal2 = new ChartboostError.Load.Internal("Invalid state during load: " + e.getMessage(), e);
                            } else {
                                internal2 = new ChartboostError.Load.Internal("Unexpected error during load: " + e.getMessage(), e);
                            }
                            load = internal2;
                        }
                        xb.b(str6 + load.getCode() + str2 + load.getConstant() + " - Ad load failed: " + l2Var2.a.getLocation(), load);
                        l2Var2.a(load);
                        l2Var2.r();
                        Result.Companion companion72 = Result.INSTANCE;
                        ref$ObjectRef.element = Result.m8023constructorimpl(ResultKt.createFailure(load));
                        System.currentTimeMillis();
                        return ref$ObjectRef.element;
                    }
                }
                result = (Result) obj;
                if (result == null) {
                    ?? value = result.getValue();
                    if (Result.m8029isSuccessimpl(value)) {
                        String location2 = l2Var2.a.getLocation();
                        vb f2 = l2Var2.g().f();
                        xb.a("NRP load succeeded: location=" + location2 + ", auctionId=" + (f2 != null ? f2.b() : null), (Throwable) null, 2, (Object) null);
                        l2Var2.q();
                    } else {
                        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
                        ChartboostError chartboostError = m8026exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8026exceptionOrNullimpl : null;
                        xb.b("NRP load failed: location=" + l2Var2.a.getLocation() + ", errorCode=" + (chartboostError != null ? chartboostError.getCode() : null) + ", errorConstant=" + (chartboostError != null ? chartboostError.getConstant() : null), (Throwable) null, 2, (Object) null);
                        l2Var2.a(m8026exceptionOrNullimpl);
                        l2Var2.r();
                    }
                    ref$ObjectRef.element = value;
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ChartboostError.Load.TimedOut timedOut = new ChartboostError.Load.TimedOut("Load operation exceeded timeout of " + j3 + "ms", new TimeoutException("Ad load timed out after " + j3 + " ms"));
                    vb f3 = l2Var2.g().f();
                    String b2 = f3 != null ? f3.b() : null;
                    vb f4 = l2Var2.g().f();
                    if (f4 != null && (c2 = f4.c()) != null && (w = c2.w()) != null) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(w, 10));
                        Iterator it = w.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((m2) it.next()).getClass().getSimpleName());
                        }
                        str5 = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                    }
                    str5 = "unknown";
                    String code = timedOut.getCode();
                    String constant = timedOut.getConstant();
                    String location3 = l2Var2.a.getLocation();
                    StringBuilder sb = new StringBuilder();
                    str6 = str4;
                    try {
                        sb.append(str6);
                        sb.append(code);
                        str2 = str3;
                    } catch (Exception e4) {
                        e = e4;
                        str2 = str3;
                    }
                    try {
                        sb.append(str2);
                        sb.append(constant);
                        sb.append(" - Ad load timed out: location=");
                        sb.append(location3);
                        sb.append(", auctionId=");
                        sb.append(b2);
                        sb.append(", timeoutMs=");
                        sb.append(j3);
                        sb.append(", renderableTypes=[");
                        sb.append(str5);
                        sb.append(X3.j.e);
                        xb.b(sb.toString(), timedOut);
                        l2Var2.a(timedOut);
                        l2Var2.r();
                        Result.Companion companion9 = Result.INSTANCE;
                        ref$ObjectRef.element = Result.m8023constructorimpl(ResultKt.createFailure(timedOut));
                    } catch (Exception e5) {
                        e = e5;
                        if (e instanceof ChartboostError.Load) {
                        }
                        xb.b(str6 + load.getCode() + str2 + load.getConstant() + " - Ad load failed: " + l2Var2.a.getLocation(), load);
                        l2Var2.a(load);
                        l2Var2.r();
                        Result.Companion companion722 = Result.INSTANCE;
                        ref$ObjectRef.element = Result.m8023constructorimpl(ResultKt.createFailure(load));
                        System.currentTimeMillis();
                        return ref$ObjectRef.element;
                    }
                }
                System.currentTimeMillis();
                return ref$ObjectRef.element;
            }
        }
        gVar = l2Var.new g(continuation);
        g gVar22 = gVar;
        Object obj2 = gVar22.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar22.h;
        String str62 = X3.j.d;
        if (i2 != 0) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
        if (unit == null) {
        }
        System.currentTimeMillis();
        return ref$ObjectRef.element;
    }

    public void a(Throwable th) {
        ChartboostError chartboostError = th instanceof ChartboostError ? (ChartboostError) th : null;
        vb f2 = g().f();
        String b2 = f2 != null ? f2.b() : null;
        xb.a("NRP load failure - notifying callback: location=" + this.a.getLocation() + ", auctionId=" + b2 + ", errorCode=" + (chartboostError != null ? chartboostError.getCode() : null) + ", errorConstant=" + (chartboostError != null ? chartboostError.getConstant() : null), (Throwable) null, 2, (Object) null);
        i().onAdLoaded(new CacheEvent(b2, this.a), q.a(th));
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.chartboost.sdk.impl.j9
    public Object a(Context context, Continuation continuation) {
        return a(this, context, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x012f A[Catch: Exception -> 0x0141, TryCatch #1 {Exception -> 0x0141, blocks: (B:19:0x012b, B:21:0x012f, B:23:0x0139, B:25:0x0144, B:27:0x0149, B:61:0x0117), top: B:60:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149 A[Catch: Exception -> 0x0141, TRY_LEAVE, TryCatch #1 {Exception -> 0x0141, blocks: (B:19:0x012b, B:21:0x012f, B:23:0x0139, B:25:0x0144, B:27:0x0149, B:61:0x0117), top: B:60:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object a(l2 l2Var, Context context, Continuation continuation) {
        j jVar;
        int i2;
        ShowEvent showEvent;
        Exception e2;
        ChartboostError.Show unknown;
        Result result;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f = i3 - Integer.MIN_VALUE;
                Object obj = jVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = jVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    xb.a("Show requested: location=" + l2Var.a.getLocation() + ", adFormat=" + l2Var.e.a() + ", isNRP=" + l2Var.i + ", isLoaded=" + l2Var.a(), (Throwable) null, 2, (Object) null);
                    if (!Chartboost.isSdkStarted()) {
                        xb.b("Show failed - SDK not started: location=" + l2Var.a.getLocation(), (Throwable) null, 2, (Object) null);
                        l2Var.a(false);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(ChartboostError.Show.NotInitialized.INSTANCE));
                    }
                    l2Var.a(context);
                    if (l2Var.i) {
                        if (!l2Var.a()) {
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoAd.INSTANCE));
                        }
                        if (context instanceof Activity) {
                            Activity activity = (Activity) context;
                            if (activity.isFinishing() || activity.isDestroyed()) {
                                Result.Companion companion3 = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoContext.INSTANCE));
                            }
                        }
                        vb f2 = l2Var.g().f();
                        showEvent = new ShowEvent(f2 != null ? f2.b() : null, l2Var.a);
                        try {
                            k kVar = l2Var.new k(showEvent, context, null);
                            jVar.b = l2Var;
                            jVar.c = showEvent;
                            jVar.f = 1;
                            obj = TimeoutKt.withTimeoutOrNull(5000L, kVar, jVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            if (e2 instanceof ChartboostError.Show) {
                            }
                            xb.b(X3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Ad show failed: " + l2Var.a.getLocation(), unknown);
                            l2Var.a(unknown, showEvent);
                            Result.Companion companion4 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(unknown));
                        }
                    } else {
                        jVar.f = 2;
                        Object b2 = l2Var.b(context, jVar);
                        return b2 == coroutine_suspended ? coroutine_suspended : b2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    ShowEvent showEvent2 = (ShowEvent) jVar.c;
                    l2 l2Var2 = (l2) jVar.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        showEvent = showEvent2;
                        l2Var = l2Var2;
                    } catch (Exception e4) {
                        e2 = e4;
                        showEvent = showEvent2;
                        l2Var = l2Var2;
                        if (e2 instanceof ChartboostError.Show) {
                            unknown = new ChartboostError.Show.Unknown("Exception during ad show: " + e2.getMessage(), e2);
                        } else {
                            unknown = (ChartboostError.Show) e2;
                        }
                        xb.b(X3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Ad show failed: " + l2Var.a.getLocation(), unknown);
                        l2Var.a(unknown, showEvent);
                        Result.Companion companion42 = Result.INSTANCE;
                        return Result.m8023constructorimpl(ResultKt.createFailure(unknown));
                    }
                }
                result = (Result) obj;
                if (result == null) {
                    Object value = result.getValue();
                    Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
                    if (m8026exceptionOrNullimpl == null) {
                        l2Var.a((View) value, showEvent);
                        return value;
                    }
                    l2Var.a(m8026exceptionOrNullimpl, showEvent);
                    return value;
                }
                ChartboostError.Show.TimedOut timedOut = new ChartboostError.Show.TimedOut("Show operation exceeded timeout of 5000ms", new TimeoutException("Ad show timed out after 5000 ms"));
                xb.b(X3.j.d + timedOut.getCode() + "] " + timedOut.getConstant() + " - Ad show timed out: " + l2Var.a.getLocation(), timedOut);
                l2Var.a(timedOut, showEvent);
                Result.Companion companion5 = Result.INSTANCE;
                return Result.m8023constructorimpl(ResultKt.createFailure(timedOut));
            }
        }
        jVar = l2Var.new j(continuation);
        Object obj2 = jVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = jVar.f;
        if (i2 != 0) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
    }

    public final void a(boolean z) {
        try {
            f4.b.d().c().a(new i(z));
        } catch (Exception e2) {
            ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Failed to post session not started callback for " + this.e.a(), e2);
            xb.b(X3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Cannot post session not started callback", unknown);
        }
    }
}
