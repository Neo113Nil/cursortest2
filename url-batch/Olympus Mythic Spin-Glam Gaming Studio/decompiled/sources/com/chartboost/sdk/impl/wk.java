package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.media3.common.PlaybackException;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.bk;
import com.chartboost.sdk.impl.i4;
import com.chartboost.sdk.impl.jf;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.video.POBVastError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class wk extends m2 implements hl, qk {
    public static final a M = new a(null);
    public final Lazy A;
    public final CoroutineExceptionHandler B;
    public final CoroutineScope C;
    public boolean D;
    public long E;
    public String F;
    public Cif G;
    public Bitmap H;
    public final Set I;
    public CancellableContinuation J;
    public volatile boolean K;
    public boolean L;
    public final Context n;
    public final URL o;
    public final b7 p;
    public final pk q;
    public final Set r;
    public final String s;
    public final dl t;
    public final Set u;
    public final List v;
    public ll w;
    public boolean x;
    public final Lazy y;
    public final Lazy z;

    public static final class h extends Lambda implements Function0 {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y2 mo4828invoke() {
            return f4.b.a().p();
        }
    }

    public static final class j extends Lambda implements Function1 {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(qi it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.a(), this.b));
        }
    }

    public static final class k extends Lambda implements Function1 {
        public final /* synthetic */ Map b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Map map) {
            super(1);
            this.b = map;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qi invoke(qi it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return qi.a(it, null, null, 0, null, this.b, null, 47, null);
        }
    }

    public static final class l extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = wk.this.a((Context) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int b;

        public m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wk.this.new m(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            if (r0 == null) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                pk pkVar = wk.this.q;
                Context G = wk.this.G();
                URL N = wk.this.N();
                b7 b7Var = wk.this.p;
                this.b = 1;
                a = pkVar.a(G, N, b7Var, this);
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
            if (Result.m8028isFailureimpl(a)) {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = new IOException("Unknown player load initiation error.");
                }
                if (m8026exceptionOrNullimpl instanceof IOException) {
                    String message = m8026exceptionOrNullimpl.getMessage();
                    if (message != null) {
                        str = message.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    str = "";
                    m8026exceptionOrNullimpl = (StringsKt.contains$default((CharSequence) str, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "disk full", false, 2, (Object) null)) ? ChartboostError.Load.NoStorage.INSTANCE : (Exception) m8026exceptionOrNullimpl;
                }
                xb.b("VideoRenderable: videoPlayer.load() returned immediate failure for " + wk.this.N() + ".", m8026exceptionOrNullimpl);
                wk.this.a(m8026exceptionOrNullimpl);
            } else {
                View a2 = wk.this.q.a(wk.this.G());
                if (a2 != null && wk.this.b() == null) {
                    wk.this.a(a2);
                }
                wk wkVar = wk.this;
                bk.i iVar = bk.i.b;
                if (wkVar.I.add(iVar)) {
                    wkVar.a(iVar);
                } else {
                    xb.a("One-off VAST event '" + iVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ float e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z, float f, Continuation continuation) {
            super(2, continuation);
            this.d = z;
            this.e = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wk.this.new o(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            wk.this.q.setVolume(0.0f);
            if (this.d) {
                Set set = wk.this.r;
                ArrayList<qi> arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (Intrinsics.areEqual(((qi) obj2).a(), "mute")) {
                        arrayList.add(obj2);
                    }
                }
                xb.a("VideoRenderable.mute() called. Current volume: " + this.e + ", Mute tracking events found: " + arrayList.size(), (Throwable) null, 2, (Object) null);
                if (arrayList.isEmpty()) {
                    xb.e("No mute tracking events found in VAST XML. trackingEvents size: " + wk.this.r.size(), null, 2, null);
                }
                ll b = wk.this.b();
                if (b != null) {
                    b.a(0.0f);
                }
                wk.a(wk.this, bk.k.b, (qi) null, 2, (Object) null);
                wk wkVar = wk.this;
                for (qi qiVar : arrayList) {
                    xb.a("Firing mute tracking event: " + qiVar.e(), (Throwable) null, 2, (Object) null);
                    wkVar.b(bk.k.b, qiVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function0 {
        public static final p b = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final he mo4828invoke() {
            return f4.b.g().a();
        }
    }

    public static final class q extends SuspendLambda implements Function2 {
        public int b;

        public q(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wk.this.new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            wk.this.q.pause();
            wk.this.a(bk.l.b);
            return Unit.INSTANCE;
        }
    }

    public static final class r extends SuspendLambda implements Function2 {
        public int b;

        public r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wk.this.new r(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            wk.this.q.play();
            wk.this.a(bk.n.b);
            return Unit.INSTANCE;
        }
    }

    public static final class u extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ nh c;
        public final /* synthetic */ wk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(nh nhVar, wk wkVar, Continuation continuation) {
            super(2, continuation);
            this.c = nhVar;
            this.d = wkVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new u(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.c == nh.b) {
                wk wkVar = this.d;
                bk.o oVar = bk.o.b;
                if (wkVar.I.add(oVar)) {
                    wkVar.a(oVar);
                } else {
                    xb.a("One-off VAST event '" + oVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
            }
            ll b = this.d.b();
            if (b != null) {
                b.a();
            }
            Cif cif = this.d.G;
            if (cif != null) {
                cif.d();
            }
            this.d.G = null;
            wk wkVar2 = this.d;
            wkVar2.E = wkVar2.q.c();
            wk wkVar3 = this.d;
            wkVar3.F = wkVar3.A();
            Bitmap bitmap = this.d.H;
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.d.H = null;
            this.d.q.a(this.c);
            zf j = this.d.j();
            if (j != null) {
                j.a(re.b);
            }
            xb.a("VideoRenderable releasing player: url=" + this.d.N() + ", auctionId=" + this.d.q().c() + ", reason=" + this.c, (Throwable) null, 2, (Object) null);
            this.d.q.release();
            CoroutineScopeKt.cancel$default(this.d.C, "VideoRenderable stopped (" + this.c + ") for " + this.d.N(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class v extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ float d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(float f, boolean z, Continuation continuation) {
            super(2, continuation);
            this.d = f;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wk.this.new v(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            wk.this.q.setVolume(this.d);
            if (this.e) {
                Set set = wk.this.r;
                ArrayList<qi> arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (Intrinsics.areEqual(((qi) obj2).a(), "unmute")) {
                        arrayList.add(obj2);
                    }
                }
                xb.a("VideoRenderable.unmute() called. Restore volume: " + this.d + ", Unmute tracking events found: " + arrayList.size(), (Throwable) null, 2, (Object) null);
                if (arrayList.isEmpty()) {
                    xb.e("No unmute tracking events found in VAST XML. trackingEvents size: " + wk.this.r.size(), null, 2, null);
                }
                ll b = wk.this.b();
                if (b != null) {
                    b.a(1.0f);
                }
                wk.a(wk.this, bk.r.b, (qi) null, 2, (Object) null);
                wk wkVar = wk.this;
                for (qi qiVar : arrayList) {
                    xb.a("Firing unmute tracking event: " + qiVar.e(), (Throwable) null, 2, (Object) null);
                    wkVar.b(bk.r.b, qiVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(Context context, URL videoUrl, wf renderableConfig, a0 adMarkupConfig, b7 downloaderCache, pk videoPlayer, Set trackingEvents, String str, di trackerComponent, rh telemetryManager, dl viewabilityComponent, Set set, List verificationNotExecutedUrls, com.chartboost.sdk.impl.u adFormat, Mediation mediation, boolean z) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(downloaderCache, "downloaderCache");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(verificationNotExecutedUrls, "verificationNotExecutedUrls");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.n = context;
        this.o = videoUrl;
        this.p = downloaderCache;
        this.q = videoPlayer;
        this.r = trackingEvents;
        this.s = str;
        this.t = viewabilityComponent;
        this.u = set;
        this.v = verificationNotExecutedUrls;
        this.x = z;
        this.y = LazyKt.lazy(p.b);
        this.z = LazyKt.lazy(h.b);
        this.A = LazyKt.lazy(new i(renderableConfig));
        s sVar = new s(CoroutineExceptionHandler.Key, this, adMarkupConfig);
        this.B = sVar;
        this.C = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain()).plus(sVar));
        this.I = new LinkedHashSet();
        videoPlayer.a(this);
    }

    public final Context G() {
        return this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[FALL_THROUGH, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int i2 = error.errorCode;
        switch (i2) {
            case 1000:
            case 1001:
            case 1004:
                return POBVastError.UNDEFINED_ERROR;
            case 1002:
                return 400;
            case 1003:
                return 402;
            default:
                switch (i2) {
                    case 2000:
                    case 2007:
                    case 2008:
                        break;
                    case 2001:
                    case 2002:
                        break;
                    case 2003:
                        return 405;
                    case 2004:
                    case 2005:
                    case 2006:
                        return 401;
                    default:
                        switch (i2) {
                            default:
                                switch (i2) {
                                }
                            case 3001:
                            case 3002:
                            case 3003:
                            case 3004:
                                break;
                        }
                }
        }
    }

    public final URL N() {
        return this.o;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.hl
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public ll b() {
        return this.w;
    }

    public static final class s extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ wk b;
        public final /* synthetic */ a0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(CoroutineExceptionHandler.Key key, wk wkVar, a0 a0Var) {
            super(key);
            this.b = wkVar;
            this.c = a0Var;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            ChartboostError.Load unknown;
            xb.b("VideoRenderable coroutine exception: url=" + this.b.N() + ", auctionId=" + this.c.c() + ", error=" + th.getMessage(), th);
            if (th instanceof ChartboostError.Load) {
                unknown = (ChartboostError.Load) th;
            } else {
                unknown = new ChartboostError.Load.Unknown(th.getMessage(), th);
            }
            CancellableContinuation cancellableContinuation = this.b.J;
            if (cancellableContinuation != null) {
                if (!cancellableContinuation.isActive()) {
                    cancellableContinuation = null;
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(unknown)));
                }
            }
            this.b.J = null;
            zf j = this.b.j();
            if (j != null) {
                j.b(unknown);
            }
        }
    }

    public final boolean I() {
        return this.x;
    }

    public final he K() {
        return (he) this.y.getValue();
    }

    public final y2 E() {
        return (y2) this.z.getValue();
    }

    public static final class i extends Lambda implements Function0 {
        public final /* synthetic */ wf b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(wf wfVar) {
            super(0);
            this.b = wfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            nj o = this.b.o();
            if (o != null && !o.f()) {
                nj o2 = this.b.o();
                return (o2 != null ? o2.a() : null) != null ? "2" : "0";
            }
            return "1";
        }
    }

    public final String F() {
        return (String) this.A.getValue();
    }

    public final boolean J() {
        return this.K;
    }

    public final ChartboostError.Render b(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.errorCode) {
            case 2000:
            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2007:
            case 2008:
                return new ChartboostError.Render.AssetUnavailable(this.o.toString(), "Playback error: " + error.getErrorCodeName(), error);
            case 2003:
            case 2006:
            default:
                return new ChartboostError.Render.VideoPlaybackError("Playback error: " + error.getErrorCodeName(), error);
        }
    }

    public static final class n extends Lambda implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ wk c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wk wkVar, Continuation continuation) {
                super(2, continuation);
                this.c = wkVar;
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.q.a(nh.f);
                this.c.q.release();
                return Unit.INSTANCE;
            }
        }

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void a(Throwable th) {
            xb.e("VideoRenderable: Load operation cancelled for " + wk.this.N() + ".", null, 2, null);
            if (!wk.this.J()) {
                wk.this.B();
            }
            BuildersKt__Builders_commonKt.launch$default(wk.this.C, NonCancellable.INSTANCE, null, new a(wk.this, null), 2, null);
            wk.this.J = null;
        }
    }

    @Override // com.chartboost.sdk.impl.qk
    public void e() {
        long a2 = this.q.a();
        xb.a("Video ready: url=" + this.o + ", auctionId=" + q().c() + ", durationMs=" + a2, (Throwable) null, 2, (Object) null);
        this.K = true;
        CancellableContinuation cancellableContinuation = this.J;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(Unit.INSTANCE))));
            }
        }
        this.J = null;
    }

    public final long H() {
        return this.D ? this.E : this.q.c();
    }

    public final long M() {
        return this.q.a();
    }

    public final String L() {
        return this.D ? this.F : A();
    }

    @Override // com.chartboost.sdk.impl.m2
    public void y() {
        xb.a("Video start requested: url=" + this.o + ", auctionId=" + q().c(), (Throwable) null, 2, (Object) null);
        if (this.q.a(this.n) != null) {
            BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new t(null), 3, null);
            return;
        }
        ChartboostError.Show.Unknown unknown = new ChartboostError.Show.Unknown("Player view not available for " + this.o, null);
        xb.b("Video start failed - player view null: url=" + this.o + ", auctionId=" + q().c(), (Throwable) null, 2, (Object) null);
        zf j2 = j();
        if (j2 != null) {
            j2.b(unknown);
        }
    }

    @Override // com.chartboost.sdk.impl.qk
    public void d() {
        String str = "Video asset invalidated (evicted from cache): url=" + this.o + ", auctionId=" + q().c();
        xb.b(str, (Throwable) null, 2, (Object) null);
        ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(this.o.toString(), str, new IOException(str));
        CancellableContinuation cancellableContinuation = this.J;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(assetUnavailable)));
            }
        }
        this.J = null;
        zf j2 = j();
        if (j2 != null) {
            j2.b(assetUnavailable);
        }
        a(nh.f);
    }

    @Override // com.chartboost.sdk.impl.vf
    public View k() {
        View a2 = this.q.a(this.n);
        if (a2 == null) {
            xb.e("VideoRenderable.nextAd(): getPlayerView returned null for " + this.o, null, 2, null);
        } else if (b() == null) {
            a(a2);
        }
        return a2;
    }

    @Override // com.chartboost.sdk.impl.vf
    public long h() {
        return this.q.a() / 1000;
    }

    public static final class t extends SuspendLambda implements Function2 {
        public int b;

        public t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return wk.this.new t(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Long l = null;
            xb.a("Video playback starting: url=" + wk.this.N() + ", auctionId=" + wk.this.q().c() + ", durationMs=" + wk.this.q.a(), (Throwable) null, 2, (Object) null);
            ll b = wk.this.b();
            if (b != null) {
                b.b();
            }
            wk.this.D();
            wk.this.q.play();
            wk wkVar = wk.this;
            bk.p pVar = bk.p.b;
            if (wkVar.I.add(pVar)) {
                List<qi> a2 = wkVar.a("start", MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_DURATION, Boxing.boxFloat(wkVar.q.a() / 1000.0f)), TuplesKt.to("volume", Boxing.boxFloat(wkVar.q.getVolume()))));
                wkVar.a(pVar, (qi) CollectionsKt.firstOrNull(a2));
                for (qi qiVar : a2) {
                    oj ojVar = oj.a;
                    bk.p pVar2 = bk.p.b;
                    Context G = wkVar.G();
                    he K = wkVar.K();
                    y2 E = wkVar.E();
                    Boolean boxBoolean = Boxing.boxBoolean(wkVar.I());
                    com.chartboost.sdk.impl.u p = wkVar.p();
                    String F = wkVar.F();
                    Long boxLong = Boxing.boxLong(wkVar.q.a());
                    n5 d = wkVar.w().d();
                    ojVar.a(pVar2, new ck(null, qiVar, G, K, E, boxBoolean, p, null, F, boxLong, d != null ? Boxing.boxLong(d.b()) : l, wkVar.A(), wkVar.N().toString(), Boxing.boxLong(wkVar.q.c()), 129, null));
                    l = null;
                }
                bk.e eVar = bk.e.b;
                if (wkVar.I.add(eVar)) {
                    wkVar.a(eVar);
                } else {
                    xb.a("One-off VAST event '" + eVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
                bk.h hVar = bk.h.b;
                if (wkVar.I.add(hVar)) {
                    wkVar.a(hVar);
                } else {
                    xb.a("One-off VAST event '" + hVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
            } else {
                xb.a("One-off VAST event '" + pVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
            }
            List z = wk.this.z();
            wk wkVar2 = wk.this;
            Cif cif = new Cif(new a(wkVar2), z, 50L, wk.this.C);
            cif.c();
            wkVar2.G = cif;
            wk.super.y();
            return Unit.INSTANCE;
        }

        public static final class a implements ve {
            public final /* synthetic */ wk a;

            public a(wk wkVar) {
                this.a = wkVar;
            }

            @Override // com.chartboost.sdk.impl.ve
            public long b() {
                return this.a.q.c();
            }

            @Override // com.chartboost.sdk.impl.ve
            public long a() {
                return this.a.q.a();
            }
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public Bitmap g() {
        Bitmap bitmap = this.H;
        this.H = null;
        return bitmap;
    }

    @Override // com.chartboost.sdk.impl.vf
    public void l() {
        zf j2 = j();
        if (j2 != null) {
            j2.a(re.b);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void m() {
        xb.a("Video pausing: url=" + this.o + ", auctionId=" + q().c() + ", positionMs=" + this.q.c(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new q(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void n() {
        xb.a("Video resuming: url=" + this.o + ", auctionId=" + q().c() + ", positionMs=" + this.q.c(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new r(null), 3, null);
    }

    public final String A() {
        View a2 = this.q.a(this.n);
        if (a2 == null) {
            return null;
        }
        int width = a2.getWidth();
        int height = a2.getHeight();
        if (width == 0 && height == 0) {
            return null;
        }
        s6 s6Var = s6.a;
        return s6Var.a(width, this.n) + StringUtils.COMMA + s6Var.a(height, this.n);
    }

    public final void D() {
        if (this.v.isEmpty()) {
            return;
        }
        i3 b2 = oj.a.b();
        if (b2 == null) {
            xb.e("Cannot fire verificationNotExecuted URLs: network service not available", null, 2, null);
            return;
        }
        for (String str : this.v) {
            xb.a("Firing verificationNotExecuted tracker: " + str, (Throwable) null, 2, (Object) null);
            b2.a(new dk(str));
        }
    }

    public final List z() {
        jf b2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hf(new jf.a(0.25d), new b(a("firstQuartile"))));
        arrayList.add(new hf(new jf.a(0.5d), new c(a("midpoint"))));
        arrayList.add(new hf(new jf.a(0.75d), new d(a("thirdQuartile"))));
        arrayList.add(new hf(new jf.a(0.99d), new e()));
        Set set = this.r;
        ArrayList<qi> arrayList2 = new ArrayList();
        for (Object obj : set) {
            qi qiVar = (qi) obj;
            if (Intrinsics.areEqual(qiVar.a(), "progress") && qiVar.d() != null) {
                arrayList2.add(obj);
            }
        }
        for (qi qiVar2 : arrayList2) {
            String d2 = qiVar2.d();
            if (d2 != null && (b2 = b(d2)) != null) {
                arrayList.add(new hf(b2, new f(b2, this, qiVar2)));
            }
        }
        arrayList.add(new hf(new jf.b(2000L), new g()));
        return arrayList;
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            wk.a(wk.this, bk.g.b, (qi) null, 2, (Object) null);
            List list = this.c;
            wk wkVar = wk.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wkVar.b(bk.g.b, (qi) it.next());
            }
        }
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            wk.a(wk.this, bk.j.b, (qi) null, 2, (Object) null);
            List list = this.c;
            wk wkVar = wk.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wkVar.b(bk.j.b, (qi) it.next());
            }
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(0);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            wk.a(wk.this, bk.q.b, (qi) null, 2, (Object) null);
            List list = this.c;
            wk wkVar = wk.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wkVar.b(bk.q.b, (qi) it.next());
            }
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            if (wk.this.H == null) {
                wk wkVar = wk.this;
                wkVar.H = wkVar.q.b();
            }
        }
    }

    public static final class f extends Lambda implements Function0 {
        public final /* synthetic */ jf b;
        public final /* synthetic */ wk c;
        public final /* synthetic */ qi d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(jf jfVar, wk wkVar, qi qiVar) {
            super(0);
            this.b = jfVar;
            this.c = wkVar;
            this.d = qiVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            int a;
            jf jfVar = this.b;
            if (jfVar instanceof jf.b) {
                a = (int) (((jf.b) jfVar).a() / 1000);
            } else if (jfVar instanceof jf.a) {
                a = (int) ((((jf.a) this.b).a() * this.c.q.a()) / 1000);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.c.b(new bk.m(a), this.d);
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            if (wk.this.L) {
                return;
            }
            wk.this.L = true;
            List a = wk.this.a("viewable");
            wk wkVar = wk.this;
            Iterator it = a.iterator();
            while (it.hasNext()) {
                wkVar.b(bk.s.b, (qi) it.next());
            }
        }
    }

    public final void C() {
        this.L = true;
        Iterator it = a("notViewable").iterator();
        while (it.hasNext()) {
            b(bk.s.b, (qi) it.next());
        }
    }

    public final void B() {
        Iterator it = a("error", MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", 402))).iterator();
        while (it.hasNext()) {
            oj.a.a(bk.f.b, new ck(null, (qi) it.next(), this.n, K(), E(), null, null, null, null, null, null, null, null, null, 16353, null));
        }
    }

    public final void a(View view) {
        Set set;
        oj ojVar = oj.a;
        Integer num = null;
        ojVar.a((ll) null);
        try {
            el b2 = this.t.b();
            if (!b2.b() || (set = this.u) == null || set.isEmpty()) {
                return;
            }
            n5 d2 = w().d();
            Integer valueOf = d2 != null ? Integer.valueOf((int) d2.b()) : null;
            long a2 = this.q.a() / 1000;
            if (valueOf == null || a2 <= 0 || valueOf.intValue() <= a2) {
                num = valueOf;
            }
            ll a3 = this.t.a().a(b2, view, set, num);
            ojVar.a(a3);
            this.w = a3;
        } catch (Exception e2) {
            URL url = this.o;
            String c2 = q().c();
            Set set2 = this.u;
            xb.b("VideoRenderable viewability tracker creation failed: url=" + url + ", auctionId=" + c2 + ", vendorCount=" + (set2 != null ? set2.size() : 0), e2);
            throw new uj("Failed to execute/initialize AdVerification unit: " + e2.getMessage(), 410);
        }
    }

    public final jf b(String offset) {
        ChartboostError.Load invalidAdm;
        jf bVar;
        Intrinsics.checkNotNullParameter(offset, "offset");
        try {
            if (StringsKt.endsWith$default(offset, "%", false, 2, (Object) null)) {
                Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.removeSuffix(offset, "%"));
                if (doubleOrNull == null) {
                    return null;
                }
                bVar = new jf.a(RangesKt.coerceIn(doubleOrNull.doubleValue() / 100.0d, 0.0d, 1.0d));
            } else if (new Regex("\\d+s").matches(offset)) {
                Long longOrNull = StringsKt.toLongOrNull(StringsKt.removeSuffix(offset, "s"));
                if (longOrNull == null) {
                    return null;
                }
                bVar = new jf.b(RangesKt.coerceAtLeast(longOrNull.longValue() * 1000, 0L));
            } else if (new Regex("\\d{1,2}:\\d{1,2}:\\d{1,2}(\\.\\d+)?").matches(offset)) {
                List split$default = StringsKt.split$default((CharSequence) offset, new String[]{":"}, false, 0, 6, (Object) null);
                Long longOrNull2 = StringsKt.toLongOrNull((String) split$default.get(0));
                long longValue = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                Long longOrNull3 = StringsKt.toLongOrNull((String) split$default.get(1));
                long longValue2 = longOrNull3 != null ? longOrNull3.longValue() : 0L;
                Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) split$default.get(2));
                if (doubleOrNull2 != null) {
                    bVar = new jf.b(RangesKt.coerceAtLeast((long) (((longValue * 3600) + (longValue2 * 60) + doubleOrNull2.doubleValue()) * 1000), 0L));
                } else {
                    xb.e(X3.j.d + new ChartboostError.Load.InvalidAdm("Invalid time format in VAST offset: " + offset + ". Seconds part could not be parsed.", null).getCode() + "] Failed to parse time offset seconds: " + split$default.get(2) + " in offset: " + offset, null, 2, null);
                    return null;
                }
            } else {
                xb.d("Unrecognized offset format: " + offset, null, 2, null);
                return null;
            }
            return bVar;
        } catch (Exception e2) {
            if (e2 instanceof ChartboostError.Load) {
                invalidAdm = (ChartboostError.Load) e2;
            } else {
                invalidAdm = new ChartboostError.Load.InvalidAdm("Failed to parse VAST offset string: " + offset + ". " + e2.getMessage(), e2);
            }
            xb.e(X3.j.d + invalidAdm.getCode() + "] Exception parsing offset string: " + offset, invalidAdm);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.qk
    public void c() {
        xb.a("Video completed: url=" + this.o + ", auctionId=" + q().c(), (Throwable) null, 2, (Object) null);
        if (this.H == null) {
            this.H = this.q.b();
        }
        Cif cif = this.G;
        if (cif != null) {
            cif.b();
        }
        bk.d dVar = bk.d.b;
        if (!this.I.add(dVar)) {
            xb.a("One-off VAST event '" + dVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
        } else {
            a(dVar);
        }
        zf j2 = j();
        if (j2 != null) {
            j2.a();
        }
    }

    public final int c(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (error != null && linkedHashSet.add(error)) {
            if (error instanceof rj) {
                Integer a2 = ((rj) error).a();
                if (a2 != null) {
                    return a2.intValue();
                }
            } else {
                if (error instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                    int b2 = ((com.chartboost.sdk.internal.Networking.okhttp.a) error).b();
                    return (b2 == 408 || b2 == 504) ? 402 : 401;
                }
                if ((error instanceof SocketTimeoutException) || (error instanceof InterruptedIOException)) {
                    return 402;
                }
                if ((error instanceof UnknownHostException) || (error instanceof ConnectException) || (error instanceof NoRouteToHostException)) {
                    return 400;
                }
            }
            error = error.getCause();
        }
        return POBVastError.UNDEFINED_ERROR;
    }

    public final List a(String str) {
        Set set = this.r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((qi) obj).a(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b(bk bkVar, qi qiVar) {
        oj ojVar = oj.a;
        Context context = this.n;
        he K = K();
        y2 E = E();
        Boolean valueOf = Boolean.valueOf(this.x);
        com.chartboost.sdk.impl.u p2 = p();
        String F = F();
        Long valueOf2 = Long.valueOf(this.q.a());
        n5 d2 = w().d();
        ojVar.a(bkVar, new ck(null, qiVar, context, K, E, valueOf, p2, null, F, valueOf2, d2 != null ? Long.valueOf(d2.b()) : null, A(), this.o.toString(), Long.valueOf(this.q.c()), 129, null));
    }

    public final List a(String str, Map map) {
        List list = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.r), new j(str)), new k(map)));
        return !list.isEmpty() ? list : CollectionsKt.listOf(new qi(str, null, 0, null, map, null, 40, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.vf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        l lVar;
        int i2;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i3 = lVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.e = i3 - Integer.MIN_VALUE;
                Object obj = lVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lVar.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    lVar.b = this;
                    lVar.e = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(lVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    this.J = cancellableContinuationImpl;
                    xb.a("Video load initiated: url=" + N() + ", auctionId=" + q().c() + ", trackingEventsCount=" + this.r.size(), (Throwable) null, 2, (Object) null);
                    BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new m(null), 3, null);
                    cancellableContinuationImpl.invokeOnCancellation(new n());
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(lVar);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        lVar = new l(continuation);
        Object obj2 = lVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lVar.e;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final ChartboostError.Load a(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.errorCode) {
            case 4001:
            case 4002:
            case 4003:
            case 4004:
            case 4005:
                String a2 = kc.a();
                URL url = this.o;
                int i2 = error.errorCode;
                String errorCodeName = error.getErrorCodeName();
                Throwable cause = error.getCause();
                xb.b("Codec error during video playback: url=" + url + ", errorCode=" + i2 + ", errorCodeName=" + errorCodeName + ", cause=" + (cause != null ? cause.getMessage() : null) + ". " + a2, (Throwable) null, 2, (Object) null);
                kc.c();
                return new ChartboostError.Load.UnsupportedCodec("Playback error: " + error.getErrorCodeName() + ", url=" + this.o + ". " + a2, error);
            default:
                return new ChartboostError.Load.AssetUnavailable(this.o.toString(), "Playback error: " + error.getErrorCodeName(), error);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public float a(boolean z) {
        float volume = this.q.getVolume();
        super.a(z);
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new o(z, volume, null), 3, null);
        return volume;
    }

    public final void a(bk bkVar, qi qiVar) {
        bkVar.a(new ck(b(), qiVar, this.n, K(), E(), null, null, null, null, null, null, null, null, null, 16352, null));
    }

    public static /* synthetic */ void a(wk wkVar, bk bkVar, qi qiVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qiVar = null;
        }
        wkVar.a(bkVar, qiVar);
    }

    @Override // com.chartboost.sdk.impl.qk
    public void a(Throwable error) {
        ChartboostError chartboostError;
        int c2;
        Intrinsics.checkNotNullParameter(error, "error");
        CancellableContinuation cancellableContinuation = this.J;
        boolean z = cancellableContinuation != null && cancellableContinuation.isActive();
        String str = z ? "LOAD" : "RENDER";
        xb.b("VideoRenderable.onVideoError: phase=" + str + ", url=" + this.o + ", auctionId=" + q().c() + ", errorType=" + error.getClass().getSimpleName(), error);
        Cif cif = this.G;
        if (cif != null) {
            cif.d();
        }
        this.G = null;
        Throwable cause = error.getCause();
        ChartboostError chartboostError2 = cause instanceof ChartboostError ? (ChartboostError) cause : null;
        if (chartboostError2 == null) {
            chartboostError2 = error instanceof ChartboostError ? (ChartboostError) error : null;
        }
        CancellableContinuation cancellableContinuation2 = this.J;
        if (cancellableContinuation2 != null && cancellableContinuation2.isActive()) {
            chartboostError = chartboostError2 instanceof ChartboostError.Load ? (ChartboostError.Load) chartboostError2 : null;
            if (chartboostError == null) {
                if (error instanceof PlaybackException) {
                    chartboostError = a((PlaybackException) error);
                } else if (error instanceof IOException) {
                    chartboostError = new ChartboostError.Load.AssetUnavailable(this.o.toString(), "Asset unavailable: " + error.getMessage(), error);
                } else {
                    chartboostError = new ChartboostError.Load.Unknown("An unknown video error occurred: " + error.getMessage(), error);
                }
            }
        } else {
            chartboostError = chartboostError2 instanceof ChartboostError.Render ? (ChartboostError.Render) chartboostError2 : null;
            if (chartboostError == null) {
                if (error instanceof PlaybackException) {
                    chartboostError = b((PlaybackException) error);
                } else if (error instanceof IOException) {
                    chartboostError = new ChartboostError.Render.AssetUnavailable(this.o.toString(), "Asset unavailable: " + error.getMessage(), error);
                } else {
                    chartboostError = new ChartboostError.Render.Unknown("An unknown video error occurred: " + error.getMessage(), error);
                }
            }
        }
        if (chartboostError instanceof ChartboostError.Load) {
            CancellableContinuation cancellableContinuation3 = this.J;
            if (cancellableContinuation3 != null) {
                if (!cancellableContinuation3.isActive()) {
                    cancellableContinuation3 = null;
                }
                if (cancellableContinuation3 != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation3.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(chartboostError)));
                }
            }
            this.J = null;
        } else if (chartboostError instanceof ChartboostError.Render) {
            a((ChartboostError.Render) chartboostError);
        }
        if (error instanceof PlaybackException) {
            c2 = c((PlaybackException) error);
        } else {
            c2 = c(error);
        }
        xb.e("VideoRenderable tracking VAST error: vastErrorCode=" + c2 + ", url=" + this.o + ", auctionId=" + q().c() + ", chartboostError=" + chartboostError.getCode(), null, 2, null);
        List<qi> a2 = a("error", MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(c2))));
        a(this, bk.f.b, (qi) null, 2, (Object) null);
        for (qi qiVar : a2) {
            oj ojVar = oj.a;
            bk.f fVar = bk.f.b;
            qi a3 = qi.a(qiVar, null, null, 0, null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(c2))), null, 47, null);
            Context context = this.n;
            he K = K();
            y2 E = E();
            Boolean valueOf = Boolean.valueOf(this.x);
            com.chartboost.sdk.impl.u p2 = p();
            String F = F();
            Long valueOf2 = Long.valueOf(this.q.a());
            n5 d2 = w().d();
            ojVar.a(fVar, new ck(null, a3, context, K, E, valueOf, p2, null, F, valueOf2, d2 != null ? Long.valueOf(d2.b()) : null, A(), this.o.toString(), Long.valueOf(this.q.c()), 129, null));
        }
        if (!z && !this.L && this.q.c() < 2000) {
            C();
        }
        zf j2 = j();
        if (j2 != null) {
            j2.b(error);
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(nh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.D) {
            xb.a("VideoRenderable already stopped, ignoring stop(" + reason + "): url=" + this.o, (Throwable) null, 2, (Object) null);
            return;
        }
        this.D = true;
        CancellableContinuation cancellableContinuation = this.J;
        if ((cancellableContinuation == null || !cancellableContinuation.isActive()) && !this.L && this.q.c() < 2000) {
            C();
        }
        xb.a("Video stopping: url=" + this.o + ", auctionId=" + q().c() + ", reason=" + reason + ", positionMs=" + this.q.c(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.C, NonCancellable.INSTANCE, null, new u(reason, this, null), 2, null);
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(boolean z, Integer num, Integer num2, i4 i4Var) {
        a(this.s, z);
        j4 r2 = r();
        if (i4Var == null) {
            i4Var = new i4.d(CollectionsKt.emptyList(), this.s);
        }
        if (r2.a(i4Var, z)) {
            a(num, num2);
            zf j2 = j();
            if (j2 != null) {
                j2.f();
            }
        }
    }

    public final void a(Integer num, Integer num2) {
        wk wkVar = this;
        Long l2 = null;
        String str = (num == null || num2 == null) ? null : num + StringUtils.COMMA + num2;
        Set set = wkVar.r;
        ArrayList<qi> arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((qi) obj).a(), "click")) {
                arrayList.add(obj);
            }
        }
        a(wkVar, bk.a.b, (qi) null, 2, (Object) null);
        for (qi qiVar : arrayList) {
            oj ojVar = oj.a;
            bk.a aVar = bk.a.b;
            Context context = wkVar.n;
            he K = K();
            y2 E = E();
            Boolean valueOf = Boolean.valueOf(wkVar.x);
            com.chartboost.sdk.impl.u p2 = p();
            String F = F();
            Long valueOf2 = Long.valueOf(wkVar.q.a());
            n5 d2 = w().d();
            ojVar.a(aVar, new ck(null, qiVar, context, K, E, valueOf, p2, str, F, valueOf2, d2 != null ? Long.valueOf(d2.b()) : l2, A(), wkVar.o.toString(), Long.valueOf(wkVar.q.c()), 1, null));
            l2 = null;
            wkVar = this;
        }
    }

    public final void a(bk bkVar) {
        List a2 = a(bkVar.a());
        a(bkVar, (qi) CollectionsKt.firstOrNull(a2));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            b(bkVar, (qi) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(float f2, boolean z) {
        super.a(f2, z);
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new v(f2, z, null), 3, null);
    }
}
