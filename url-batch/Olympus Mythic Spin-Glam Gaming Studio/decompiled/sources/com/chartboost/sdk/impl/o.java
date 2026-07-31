package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.o7;
import com.chartboost.sdk.view.FullscreenAdActivity;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class o implements j9 {
    public static final a r = new a(null);
    public static final Map s = new ConcurrentHashMap();
    public final com.chartboost.sdk.impl.j a;
    public final Mediation b;
    public final com.chartboost.sdk.impl.l c;
    public final dl d;
    public final di e;
    public final rh f;
    public final yf g;
    public final dh h;
    public final i2 i;
    public final CoroutineDispatcher j;
    public final CoroutineScope k;
    public final Mutex l;
    public c m;
    public final AtomicBoolean n;
    public Job o;
    public volatile Job p;
    public final d q;

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ b.f d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b.f fVar, Continuation continuation) {
            super(2, continuation);
            this.d = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new e(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                Context d = this.d.d();
                String b = this.d.b();
                v a = this.d.a();
                this.b = 1;
                if (oVar.b(d, b, a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new f(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                b.c cVar = new b.c(this.d);
                this.b = 1;
                if (oVar.a(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                b.d dVar = b.d.a;
                this.b = 1;
                if (oVar.a(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ m8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(m8 m8Var, Continuation continuation) {
            super(2, continuation);
            this.d = m8Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new h(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                b.C0225b c0225b = new b.C0225b(this.d);
                this.b = 1;
                if (oVar.a(c0225b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return o.this.a((b) null, this);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ b d;
        public final /* synthetic */ c e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b bVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.d = bVar;
            this.e = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new j(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                Context b = ((b.i) this.d).b();
                vb a = ((c.d) this.e).a();
                this.b = 1;
                if (oVar.a(b, a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public long f;
        public /* synthetic */ Object g;
        public int i;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            Object a = o.this.a((Context) null, (String) null, (v) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class l extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return o.this.b(null, null, null, this);
        }
    }

    public static final class m extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return o.this.a((Context) null, (vb) null, this);
        }
    }

    public static final class n extends ContinuationImpl {
        public Object b;
        public Object c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a = o.this.a((Context) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.o$o, reason: collision with other inner class name */
    public static final class C0227o extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ o e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0227o(int i, String str, o oVar, Continuation continuation) {
            super(2, continuation);
            this.c = i;
            this.d = str;
            this.e = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0227o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0227o(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.c * 1000;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            xb.a("Expiration timer fired: auctionId=" + this.d, (Throwable) null, 2, (Object) null);
            o oVar = this.e;
            b.C0225b c0225b = new b.C0225b(m8.b);
            this.b = 2;
            if (oVar.a(c0225b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public o(com.chartboost.sdk.impl.j adConfig, Mediation mediation, com.chartboost.sdk.impl.l externalAdContainerListener, dl viewabilityComponent, di trackerComponent, rh telemetryManager, yf renderableFactory, dh sharedPrefsHelper, i2 base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(externalAdContainerListener, "externalAdContainerListener");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(renderableFactory, "renderableFactory");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = adConfig;
        this.b = mediation;
        this.c = externalAdContainerListener;
        this.d = viewabilityComponent;
        this.e = trackerComponent;
        this.f = telemetryManager;
        this.g = renderableFactory;
        this.h = sharedPrefsHelper;
        this.i = base64Wrapper;
        this.j = ioDispatcher;
        this.k = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        this.l = MutexKt.Mutex$default(false, 1, null);
        this.m = c.C0226c.a;
        this.n = new AtomicBoolean(false);
        this.q = new d();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.c);
        p0.startActivity(p1);
    }

    public static final class a {
        public final boolean a(i2 base64Wrapper, String bidResponse) {
            Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
            Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
            try {
                JSONArray optJSONArray = new JSONObject(base64Wrapper.b(bidResponse)).optJSONArray("seatbid");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        return false;
                    }
                }
                return true;
            } catch (JSONException e) {
                xb.e("Failed to parse bid response, routing to legacy pipeline", e);
                return false;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            return o.s;
        }
    }

    public static abstract class c {

        /* renamed from: com.chartboost.sdk.impl.o$c$c, reason: collision with other inner class name */
        public static final class C0226c extends c {
            public static final C0226c a = new C0226c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0226c);
            }

            public int hashCode() {
                return 1837959871;
            }

            public String toString() {
                return "Idle";
            }

            public C0226c() {
                super(null);
            }
        }

        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class e extends c {
            public final String a;
            public final CompletableDeferred b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String bidResponse, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.a = bidResponse;
                this.b = completion;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Loading(bidResponse=" + this.a + ", completion=" + this.b + ")";
            }

            public final String a() {
                return this.a;
            }

            public final CompletableDeferred b() {
                return this.b;
            }
        }

        public static final class d extends c {
            public final vb a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(vb loadedAd) {
                super(null);
                Intrinsics.checkNotNullParameter(loadedAd, "loadedAd");
                this.a = loadedAd;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Loaded(loadedAd=" + this.a + ")";
            }

            public final vb a() {
                return this.a;
            }
        }

        public static final class f extends c {
            public final vb a;
            public final CompletableDeferred b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(vb adBeingShown, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(adBeingShown, "adBeingShown");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.a = adBeingShown;
                this.b = completion;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Showing(adBeingShown=" + this.a + ", completion=" + this.b + ")";
            }

            public final vb a() {
                return this.a;
            }

            public final CompletableDeferred b() {
                return this.b;
            }
        }

        public static final class b extends c {
            public final Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.a = exception;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.a + ")";
            }

            public final Throwable a() {
                return this.a;
            }
        }

        public static final class a extends c {
            public static final a a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1843455502;
            }

            public String toString() {
                return "Destroyed";
            }

            public a() {
                super(null);
            }
        }
    }

    public static abstract class b {
        public b() {
        }

        public static final class f extends b {
            public final Context a;
            public final String b;
            public final CompletableDeferred c;
            public final v d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Context context, String str, CompletableDeferred completion, v adLoadConfig) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                Intrinsics.checkNotNullParameter(adLoadConfig, "adLoadConfig");
                this.a = context;
                this.b = str;
                this.c = completion;
                this.d = adLoadConfig;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c) && Intrinsics.areEqual(this.d, fVar.d);
            }

            public int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "LoadRequested(context=" + this.a + ", bidResponse=" + this.b + ", completion=" + this.c + ", adLoadConfig=" + this.d + ")";
            }

            public final Context d() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final CompletableDeferred c() {
                return this.c;
            }

            public final v a() {
                return this.d;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class g extends b {
            public final vb a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(vb loadedAd) {
                super(null);
                Intrinsics.checkNotNullParameter(loadedAd, "loadedAd");
                this.a = loadedAd;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.a, ((g) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "LoadSucceeded(loadedAd=" + this.a + ")";
            }

            public final vb a() {
                return this.a;
            }
        }

        public static final class e extends b {
            public final Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.a = exception;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.a, ((e) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "LoadFailed(exception=" + this.a + ")";
            }

            public final Throwable a() {
                return this.a;
            }
        }

        public static final class i extends b {
            public final Context a;
            public final CompletableDeferred b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Context context, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.a = context;
                this.b = completion;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.areEqual(this.a, iVar.a) && Intrinsics.areEqual(this.b, iVar.b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "ShowRequested(context=" + this.a + ", completion=" + this.b + ")";
            }

            public final Context b() {
                return this.a;
            }

            public final CompletableDeferred a() {
                return this.b;
            }
        }

        public static final class j extends b {
            public final View a;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.areEqual(this.a, ((j) obj).a);
            }

            public int hashCode() {
                View view = this.a;
                if (view == null) {
                    return 0;
                }
                return view.hashCode();
            }

            public String toString() {
                return "ShowSucceeded(view=" + this.a + ")";
            }

            public final View a() {
                return this.a;
            }

            public j(View view) {
                super(null);
                this.a = view;
            }
        }

        public static final class h extends b {
            public final Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.a = exception;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.areEqual(this.a, ((h) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "ShowFailed(exception=" + this.a + ")";
            }

            public final Throwable a() {
                return this.a;
            }
        }

        public static final class c extends b {
            public final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String callerStackTrace) {
                super(null);
                Intrinsics.checkNotNullParameter(callerStackTrace, "callerStackTrace");
                this.a = callerStackTrace;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "ClearRequested(callerStackTrace=" + this.a + ")";
            }

            public final String a() {
                return this.a;
            }
        }

        public static final class d extends b {
            public static final d a = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -812566506;
            }

            public String toString() {
                return "DestroyRequested";
            }

            public d() {
                super(null);
            }
        }

        public static final class a extends b {
            public static final a a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1722768625;
            }

            public String toString() {
                return "AdClosed";
            }

            public a() {
                super(null);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.o$b$b, reason: collision with other inner class name */
        public static final class C0225b extends b {
            public final m8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0225b(m8 reason) {
                super(null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.a = reason;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0225b) && this.a == ((C0225b) obj).a;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "AdExpired(reason=" + this.a + ")";
            }

            public final m8 a() {
                return this.a;
            }
        }
    }

    public final c g() {
        return this.m;
    }

    public final vb f() {
        c cVar = this.m;
        if (cVar instanceof c.d) {
            return ((c.d) cVar).a();
        }
        if (cVar instanceof c.f) {
            return ((c.f) cVar).a();
        }
        return null;
    }

    public static final class d implements com.chartboost.sdk.impl.l {

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ o c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, Continuation continuation) {
                super(2, continuation);
                this.c = oVar;
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
                    o oVar = this.c;
                    b.a aVar = b.a.a;
                    this.b = 1;
                    if (oVar.a(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ o c;
            public final /* synthetic */ m8 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o oVar, m8 m8Var, Continuation continuation) {
                super(2, continuation);
                this.c = oVar;
                this.d = m8Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o oVar = this.c;
                    b.C0225b c0225b = new b.C0225b(this.d);
                    this.b = 1;
                    if (oVar.a(c0225b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            l.a.a(this);
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            o.this.c.e();
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            vb a2;
            if (o.this.n.compareAndSet(false, true)) {
                c g = o.this.g();
                c.f fVar = g instanceof c.f ? (c.f) g : null;
                if (fVar != null && (a2 = fVar.a()) != null) {
                    o.this.a(a2, false);
                }
                o.this.c.d();
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            BuildersKt__Builders_commonKt.launch$default(o.this.k, null, null, new a(o.this, null), 3, null);
            o.this.c.b();
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            o.this.c.a();
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(m8 expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            BuildersKt__Builders_commonKt.launch$default(o.this.k, null, null, new b(o.this, expirationReason, null), 3, null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            o.this.c.a(url);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(re request) {
            Intrinsics.checkNotNullParameter(request, "request");
            o.this.c.a(request);
        }
    }

    public /* synthetic */ o(com.chartboost.sdk.impl.j jVar, Mediation mediation, com.chartboost.sdk.impl.l lVar, dl dlVar, di diVar, rh rhVar, yf yfVar, dh dhVar, i2 i2Var, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, mediation, lVar, dlVar, diVar, rhVar, yfVar, dhVar, (i2 & 256) != 0 ? new i2() : i2Var, (i2 & 512) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.j9
    public void c() {
        String str;
        vb f2 = f();
        if (f2 == null || (str = f2.b()) == null) {
            str = "<no_current_ad>";
        }
        xb.a("Clear loaded ad: auctionId=" + str + ", adFormat=" + this.a.a() + ", currentState=" + Reflection.getOrCreateKotlinClass(this.m.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new f(w7.a(10), null), 3, null);
    }

    public final void c(vb ad) {
        od c2;
        Intrinsics.checkNotNullParameter(ad, "ad");
        List e2 = ad.a().e();
        int i2 = 0;
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.j.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i2 == 0) {
            xb.e("No explicit impression trackers for auctionId=" + ad.b() + ", adFormat=" + this.a.a() + " — will fall back to repository trackers", null, 2, null);
        } else {
            xb.a("Tracking impression: auctionId=" + ad.b() + ", adFormat=" + this.a.a() + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        }
        rh rhVar = this.f;
        ma maVar = new ma(ad.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, 60, null);
        List e3 = ad.a().e();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.j.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rhVar.a(maVar, arrayList2, o7.b.j);
        vb f2 = f();
        if (f2 == null || (c2 = f2.c()) == null) {
            return;
        }
        c2.o();
    }

    public final void a(b.f fVar) {
        Job launch$default;
        String b2 = fVar.b();
        if (b2 != null && !StringsKt.isBlank(b2)) {
            this.m = new c.e(fVar.b(), fVar.c());
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.k, this.j, null, new e(fVar, null), 2, null);
            this.p = launch$default;
        } else {
            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Bid response is null or empty", null);
            this.m = new c.b(invalidAdm);
            CompletableDeferred c2 = fVar.c();
            Result.Companion companion = Result.INSTANCE;
            c2.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(invalidAdm))));
        }
    }

    @Override // com.chartboost.sdk.impl.j9
    public void b() {
        String str;
        vb f2 = f();
        if (f2 == null || (str = f2.b()) == null) {
            str = "<no_current_ad>";
        }
        xb.a("Destroy requested: auctionId=" + str + ", adFormat=" + this.a.a() + ", currentState=" + Reflection.getOrCreateKotlinClass(this.m.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new g(null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(3:(1:(1:16)(2:13|14))(3:19|20|21)|17|18)(4:49|50|51|52))(9:66|67|68|69|70|(7:73|74|75|76|(2:78|79)(1:81)|80|71)|86|87|(1:89)(1:90))|53|54|(1:56)|17|18))|100|6|7|(0)(0)|53|54|(0)|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
    
        r2 = r23;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x028c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, String str, v vVar, Continuation continuation) {
        l lVar;
        l lVar2;
        Object coroutine_suspended;
        int i2;
        String str2;
        String str3;
        o oVar;
        String str4;
        String str5;
        od odVar;
        z zVar;
        Object a2;
        o oVar2;
        b.g gVar;
        ChartboostError internal2;
        ChartboostError chartboostError;
        b.e eVar;
        b.e eVar2;
        Context context2 = context;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i3 = lVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.h = i3 - Integer.MIN_VALUE;
                lVar2 = lVar;
                Object obj = lVar2.f;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lVar2.h;
                String str6 = "] ";
                String str7 = X3.j.d;
                char c2 = 2;
                Object obj2 = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        try {
                            try {
                                z a3 = z.c.a(new JSONObject(this.i.b(str)));
                                xb.a("Parsed adMarkup in " + (System.currentTimeMillis() - currentTimeMillis) + "ms: auctionId=" + a3.a().c() + ", renderableCount=" + a3.b().size() + ", expiration=" + a3.a().f() + "s", (Throwable) null, 2, (Object) null);
                                boolean a4 = this.h.a("cb_video_mute_state", a3.a().d());
                                List b2 = a3.b();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = b2.iterator();
                                while (it.hasNext()) {
                                    z zVar2 = a3;
                                    ArrayList arrayList2 = arrayList;
                                    str5 = str6;
                                    str4 = str7;
                                    try {
                                        m2 a5 = this.g.a(context, (wf) it.next(), a3.a(), this.a.a(), this.e, this.f, this.d, this.b, vVar, a4);
                                        if (a5 != null) {
                                            arrayList2.add(a5);
                                        }
                                        a3 = zVar2;
                                        arrayList = arrayList2;
                                        str6 = str5;
                                        str7 = str4;
                                        obj2 = null;
                                        c2 = 2;
                                    } catch (JSONException e2) {
                                        e = e2;
                                        oVar = this;
                                        str3 = str5;
                                        str2 = str4;
                                        oVar2 = oVar;
                                        ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                                        xb.b(str2 + invalidAdm.getCode() + str3 + invalidAdm.getConstant() + " - Invalid bid response", invalidAdm);
                                        eVar2 = new b.e(invalidAdm);
                                        lVar2.b = null;
                                        lVar2.c = null;
                                        lVar2.d = null;
                                        lVar2.e = null;
                                        lVar2.h = 3;
                                        if (oVar2.a(eVar2, lVar2) == coroutine_suspended) {
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        oVar = this;
                                        oVar2 = oVar;
                                        if (!(th instanceof ChartboostError.Load)) {
                                        }
                                        xb.b(str4 + chartboostError.getCode() + str5 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                                        eVar = new b.e(chartboostError);
                                        lVar2.b = null;
                                        lVar2.c = null;
                                        lVar2.d = null;
                                        lVar2.e = null;
                                        lVar2.h = 4;
                                        if (oVar2.a(eVar, lVar2) == coroutine_suspended) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                z zVar3 = a3;
                                str4 = str7;
                                str5 = str6;
                                odVar = new od(arrayList, zVar3.a(), a4, null, 8, null);
                                lVar2.b = this;
                                lVar2.c = context2;
                                zVar = zVar3;
                                lVar2.d = zVar;
                                lVar2.e = odVar;
                                lVar2.h = 1;
                                a2 = odVar.a(context2, lVar2);
                                if (a2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oVar2 = this;
                            } catch (JSONException e3) {
                                e = e3;
                                str4 = str7;
                                str5 = str6;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str4 = str7;
                            str5 = str6;
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        str2 = X3.j.d;
                        str3 = "] ";
                        oVar = this;
                    }
                } else if (i2 == 1) {
                    od odVar2 = (od) lVar2.e;
                    zVar = (z) lVar2.d;
                    Context context3 = (Context) lVar2.c;
                    oVar2 = (o) lVar2.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Object value = ((Result) obj).getValue();
                        str4 = X3.j.d;
                        str5 = "] ";
                        odVar = odVar2;
                        context2 = context3;
                        a2 = value;
                    } catch (JSONException e5) {
                        e = e5;
                        str2 = X3.j.d;
                        str3 = "] ";
                        ChartboostError.Load.InvalidAdm invalidAdm2 = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                        xb.b(str2 + invalidAdm2.getCode() + str3 + invalidAdm2.getConstant() + " - Invalid bid response", invalidAdm2);
                        eVar2 = new b.e(invalidAdm2);
                        lVar2.b = null;
                        lVar2.c = null;
                        lVar2.d = null;
                        lVar2.e = null;
                        lVar2.h = 3;
                        if (oVar2.a(eVar2, lVar2) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        str4 = X3.j.d;
                        str5 = "] ";
                        if (!(th instanceof ChartboostError.Load)) {
                        }
                        xb.b(str4 + chartboostError.getCode() + str5 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                        eVar = new b.e(chartboostError);
                        lVar2.b = null;
                        lVar2.c = null;
                        lVar2.d = null;
                        lVar2.e = null;
                        lVar2.h = 4;
                        if (oVar2.a(eVar, lVar2) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i2 == 2) {
                        oVar = (o) lVar2.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (JSONException e6) {
                            e = e6;
                            str2 = X3.j.d;
                            str3 = "] ";
                            oVar2 = oVar;
                            ChartboostError.Load.InvalidAdm invalidAdm22 = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                            xb.b(str2 + invalidAdm22.getCode() + str3 + invalidAdm22.getConstant() + " - Invalid bid response", invalidAdm22);
                            eVar2 = new b.e(invalidAdm22);
                            lVar2.b = null;
                            lVar2.c = null;
                            lVar2.d = null;
                            lVar2.e = null;
                            lVar2.h = 3;
                            if (oVar2.a(eVar2, lVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            str4 = X3.j.d;
                            str5 = "] ";
                            oVar2 = oVar;
                            if (!(th instanceof ChartboostError.Load)) {
                                chartboostError = (ChartboostError.Load) th;
                            } else {
                                if (th instanceof JSONException) {
                                    internal2 = new ChartboostError.Load.InvalidResponse("Failed to parse ad markup: " + th.getMessage(), th);
                                } else if (th instanceof IllegalArgumentException) {
                                    internal2 = new ChartboostError.Load.InvalidRequest("Invalid load parameters: " + th.getMessage(), th);
                                } else if (th instanceof OutOfMemoryError) {
                                    chartboostError = ChartboostError.Load.NoStorage.INSTANCE;
                                } else {
                                    internal2 = new ChartboostError.Load.Internal("Load failed: " + th.getMessage(), th);
                                }
                                chartboostError = internal2;
                            }
                            xb.b(str4 + chartboostError.getCode() + str5 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                            eVar = new b.e(chartboostError);
                            lVar2.b = null;
                            lVar2.c = null;
                            lVar2.d = null;
                            lVar2.e = null;
                            lVar2.h = 4;
                            if (oVar2.a(eVar, lVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i2 != 3 && i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(a2);
                odVar.a(context2);
                gVar = new b.g(new vb(odVar, zVar.a().c(), zVar.a()));
                lVar2.b = oVar2;
                lVar2.c = null;
                lVar2.d = null;
                lVar2.e = null;
                lVar2.h = 2;
                if (oVar2.a(gVar, lVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        lVar = new l(continuation);
        lVar2 = lVar;
        Object obj3 = lVar2.f;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lVar2.h;
        String str62 = "] ";
        String str72 = X3.j.d;
        char c22 = 2;
        Object obj22 = null;
        if (i2 != 0) {
        }
        ResultKt.throwOnFailure(a2);
        odVar.a(context2);
        gVar = new b.g(new vb(odVar, zVar.a().c(), zVar.a()));
        lVar2.b = oVar2;
        lVar2.c = null;
        lVar2.d = null;
        lVar2.e = null;
        lVar2.h = 2;
        if (oVar2.a(gVar, lVar2) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final void e() {
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    public final void d(vb vbVar) {
        List e2 = vbVar.a().e();
        int i2 = 0;
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.m.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        xb.a("Tracking show: auctionId=" + vbVar.b() + ", adFormat=" + this.a.a() + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        rh rhVar = this.f;
        eh ehVar = new eh(vbVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, null, 184, null);
        List e3 = vbVar.a().e();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.m.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, ehVar, arrayList2, (o7.b) null, 4, (Object) null);
    }

    public final void a(c cVar, nh nhVar) {
        String b2;
        if (this.m instanceof c.a) {
            return;
        }
        if (cVar instanceof c.d) {
            b2 = ((c.d) cVar).a().b();
        } else {
            b2 = cVar instanceof c.f ? ((c.f) cVar).a().b() : "<unknown>";
        }
        xb.a("Destroying ad: auctionId=" + b2 + ", oldState=" + Reflection.getOrCreateKotlinClass(cVar.getClass()).getSimpleName() + ", reason=" + nhVar + ", adFormat=" + this.a.a(), (Throwable) null, 2, (Object) null);
        if (cVar instanceof c.e) {
            c.e eVar = (c.e) cVar;
            ChartboostError.Load.Internal internal2 = new ChartboostError.Load.Internal("Load operation was cancelled by destroy request. AuctionId=" + a(eVar.a()) + " Thread=" + Thread.currentThread().getName(), new IllegalStateException("Load cancelled by destroy"));
            xb.b(X3.j.d + internal2.getCode() + "] " + internal2.getConstant() + " - Load cancelled by destroy", internal2);
            CompletableDeferred b3 = eVar.b();
            Result.Companion companion = Result.INSTANCE;
            b3.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(internal2))));
        } else if (cVar instanceof c.d) {
            xb.a("Stopping loaded ad renderable", (Throwable) null, 2, (Object) null);
            ((c.d) cVar).a().c().a(nhVar);
        } else if (cVar instanceof c.f) {
            xb.a("Stopping showing ad renderable", (Throwable) null, 2, (Object) null);
            ((c.f) cVar).a().c().a(nhVar);
        } else {
            xb.a("No ad to stop during destroy, cleaning up", (Throwable) null, 2, (Object) null);
        }
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        CoroutineScopeKt.cancel$default(this.k, "AdController Destroyed with reason: " + nhVar, null, 2, null);
        this.m = c.a.a;
        xb.a("Destroy completed: auctionId=" + b2 + ", now in Destroyed state", (Throwable) null, 2, (Object) null);
    }

    public final void a(m8 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new h(reason, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:11:0x005c, B:13:0x0090, B:15:0x00b9, B:16:0x0394, B:21:0x00d7, B:23:0x00db, B:24:0x00fb, B:27:0x0101, B:29:0x0105, B:30:0x030f, B:32:0x0313, B:34:0x0317, B:35:0x031c, B:36:0x031a, B:37:0x031f, B:39:0x033d, B:41:0x0348, B:42:0x037f, B:43:0x010d, B:45:0x0111, B:47:0x0115, B:48:0x014d, B:50:0x0151, B:51:0x0180, B:53:0x0184, B:54:0x0216, B:56:0x021a, B:58:0x021e, B:59:0x0245, B:61:0x0249, B:62:0x0250, B:64:0x0254, B:65:0x0271, B:67:0x0275, B:69:0x0279, B:70:0x0296, B:72:0x029a, B:74:0x02ae, B:76:0x02b6, B:77:0x02c0, B:78:0x02cc, B:80:0x02d0, B:81:0x02fe, B:83:0x0302, B:85:0x0306, B:86:0x030d), top: B:10:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:11:0x005c, B:13:0x0090, B:15:0x00b9, B:16:0x0394, B:21:0x00d7, B:23:0x00db, B:24:0x00fb, B:27:0x0101, B:29:0x0105, B:30:0x030f, B:32:0x0313, B:34:0x0317, B:35:0x031c, B:36:0x031a, B:37:0x031f, B:39:0x033d, B:41:0x0348, B:42:0x037f, B:43:0x010d, B:45:0x0111, B:47:0x0115, B:48:0x014d, B:50:0x0151, B:51:0x0180, B:53:0x0184, B:54:0x0216, B:56:0x021a, B:58:0x021e, B:59:0x0245, B:61:0x0249, B:62:0x0250, B:64:0x0254, B:65:0x0271, B:67:0x0275, B:69:0x0279, B:70:0x0296, B:72:0x029a, B:74:0x02ae, B:76:0x02b6, B:77:0x02c0, B:78:0x02cc, B:80:0x02d0, B:81:0x02fe, B:83:0x0302, B:85:0x0306, B:86:0x030d), top: B:10:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, Continuation continuation) {
        i iVar;
        int i2;
        b bVar2;
        Mutex mutex;
        o oVar;
        c cVar;
        try {
            if (continuation instanceof i) {
                iVar = (i) continuation;
                int i3 = iVar.g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    iVar.g = i3 - Integer.MIN_VALUE;
                    Object obj = iVar.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = iVar.g;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.l;
                        iVar.b = this;
                        bVar2 = bVar;
                        iVar.c = bVar2;
                        iVar.d = mutex2;
                        iVar.g = 1;
                        if (mutex2.lock(null, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        oVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) iVar.d;
                        bVar2 = (b) iVar.c;
                        oVar = (o) iVar.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    cVar = oVar.m;
                    xb.a(Reflection.getOrCreateKotlinClass(cVar.getClass()).getSimpleName() + " --> " + Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
                    if (!(cVar instanceof c.a)) {
                        xb.a("AdController is already destroyed. Ignoring event " + Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName() + ".", (Throwable) null, 2, (Object) null);
                        if (bVar2 instanceof b.i) {
                            CompletableDeferred a2 = ((b.i) bVar2).a();
                            Result.Companion companion = Result.INSTANCE;
                            a2.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoAd.INSTANCE))));
                        } else if (bVar2 instanceof b.f) {
                            CompletableDeferred c2 = ((b.f) bVar2).c();
                            Result.Companion companion2 = Result.INSTANCE;
                            c2.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Internal("AdController is destroyed", null)))));
                        }
                    } else {
                        if (cVar instanceof c.C0226c) {
                            if (bVar2 instanceof b.f) {
                                oVar.a((b.f) bVar2);
                            }
                        } else if (cVar instanceof c.e) {
                            if (bVar2 instanceof b.g) {
                                oVar.m = new c.d(((b.g) bVar2).a());
                                oVar.a(((b.g) bVar2).a().a().f());
                                CompletableDeferred b2 = ((c.e) cVar).b();
                                Result.Companion companion3 = Result.INSTANCE;
                                b2.complete(Result.m8022boximpl(Result.m8023constructorimpl(Unit.INSTANCE)));
                            } else if (bVar2 instanceof b.e) {
                                oVar.m = new c.b(((b.e) bVar2).a());
                                CompletableDeferred b3 = ((c.e) cVar).b();
                                Result.Companion companion4 = Result.INSTANCE;
                                b3.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(((b.e) bVar2).a()))));
                            } else if (bVar2 instanceof b.c) {
                                ChartboostError.Load.Internal internal2 = new ChartboostError.Load.Internal("Load operation was cancelled by clear request. AuctionId=" + oVar.a(((c.e) cVar).a()) + " Thread=" + Thread.currentThread().getName() + " ClearCallerStackTrace=[" + ((b.c) bVar2).a() + X3.j.e, new IllegalStateException("Load cancelled"));
                                xb.b(X3.j.d + internal2.getCode() + "] " + internal2.getConstant() + " - Load cancelled", internal2);
                                CompletableDeferred b4 = ((c.e) cVar).b();
                                Result.Companion companion5 = Result.INSTANCE;
                                b4.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(internal2))));
                                oVar.a(cVar, nh.f);
                            }
                        } else if (cVar instanceof c.d) {
                            if (bVar2 instanceof b.i) {
                                oVar.m = new c.f(((c.d) cVar).a(), ((b.i) bVar2).a());
                                BuildersKt__Builders_commonKt.launch$default(oVar.k, null, null, oVar.new j(bVar2, cVar, null), 3, null);
                            } else if (bVar2 instanceof b.c) {
                                oVar.a(cVar, nh.f);
                            } else if (bVar2 instanceof b.C0225b) {
                                oVar.b(((c.d) cVar).a());
                                oVar.c.a(((b.C0225b) bVar2).a());
                                oVar.a(cVar, nh.f);
                            }
                        } else if (cVar instanceof c.f) {
                            if (bVar2 instanceof b.j) {
                                CompletableDeferred b5 = ((c.f) cVar).b();
                                Result.Companion companion6 = Result.INSTANCE;
                                b5.complete(Result.m8022boximpl(Result.m8023constructorimpl(((b.j) bVar2).a())));
                            } else if (bVar2 instanceof b.a) {
                                oVar.a(((c.f) cVar).a());
                                if (oVar.a.a() == u.d && !oVar.n.get()) {
                                    oVar.a(((c.f) cVar).a(), true);
                                }
                                oVar.n.set(false);
                                oVar.a(cVar, nh.c);
                            } else if (bVar2 instanceof b.h) {
                                CompletableDeferred b6 = ((c.f) cVar).b();
                                Result.Companion companion7 = Result.INSTANCE;
                                b6.complete(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(((b.h) bVar2).a()))));
                                oVar.m = new c.b(((b.h) bVar2).a());
                            }
                        } else if (cVar instanceof c.b) {
                            if (bVar2 instanceof b.f) {
                                oVar.a((b.f) bVar2);
                            }
                        } else {
                            boolean z = cVar instanceof c.a;
                        }
                        if (bVar2 instanceof b.d) {
                            oVar.a(cVar, cVar instanceof c.f ? nh.c : nh.f);
                        }
                        String simpleName = Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName();
                        c cVar2 = oVar.m;
                        String simpleName2 = Reflection.getOrCreateKotlinClass(cVar2.getClass()).getSimpleName();
                        if ((cVar2 instanceof c.b) && (((c.b) cVar2).a() instanceof ChartboostError)) {
                            Throwable a3 = ((c.b) cVar2).a();
                            xb.a(simpleName + " --> " + simpleName2 + " [" + ((ChartboostError) a3).getCode() + "] " + ((ChartboostError) a3).getConstant(), (Throwable) null, 2, (Object) null);
                        } else {
                            xb.a(simpleName + " --> " + simpleName2, (Throwable) null, 2, (Object) null);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            cVar = oVar.m;
            xb.a(Reflection.getOrCreateKotlinClass(cVar.getClass()).getSimpleName() + " --> " + Reflection.getOrCreateKotlinClass(bVar2.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
            if (!(cVar instanceof c.a)) {
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        iVar = new i(continuation);
        Object obj2 = iVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = iVar.g;
        if (i2 != 0) {
        }
    }

    public final void b(vb vbVar) {
        int i2;
        List e2 = vbVar.a().e();
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.i.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        String a2 = wb.a(wb.a, 0, 1, null);
        int length = a2 != null ? a2.length() : 0;
        xb.a("Tracking expiration: auctionId=" + vbVar.b() + ", adFormat=" + this.a.a() + ", trackerCount=" + i2 + ", logContextSize=" + length, (Throwable) null, 2, (Object) null);
        rh rhVar = this.f;
        l8 l8Var = new l8(vbVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, a2, 60, null);
        List e3 = vbVar.a().e();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.i.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, l8Var, arrayList2, (o7.b) null, 4, (Object) null);
        wb.a.c();
    }

    @Override // com.chartboost.sdk.impl.j9
    public boolean a() {
        return this.m instanceof c.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0176, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.chartboost.sdk.impl.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, String str, v vVar, Continuation continuation) {
        k kVar;
        Object coroutine_suspended;
        int i2;
        String str2;
        CompletableDeferred CompletableDeferred$default;
        long j2;
        o oVar;
        Object await;
        String str3;
        String str4;
        long j3;
        o oVar2;
        Job job;
        Throwable m8026exceptionOrNullimpl;
        String str5;
        String str6 = str;
        try {
            if (continuation instanceof k) {
                kVar = (k) continuation;
                int i3 = kVar.i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.i = i3 - Integer.MIN_VALUE;
                    Object obj = kVar.g;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = kVar.i;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (str6 == null || (str2 = a(str6)) == null) {
                            str2 = "<no_bid_response>";
                        }
                        xb.a("Load started: auctionId=" + str2 + ", adFormat=" + this.a.a() + ", currentState=" + Reflection.getOrCreateKotlinClass(this.m.getClass()).getSimpleName() + ", bidResponseLength=" + (str6 != null ? str.length() : 0), (Throwable) null, 2, (Object) null);
                        CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        b.f fVar = new b.f(context, str6, CompletableDeferred$default, vVar);
                        long currentTimeMillis = System.currentTimeMillis();
                        kVar.b = this;
                        kVar.c = str6;
                        kVar.d = str2;
                        kVar.e = CompletableDeferred$default;
                        kVar.f = currentTimeMillis;
                        kVar.i = 1;
                        if (a(fVar, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = currentTimeMillis;
                        oVar = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j3 = kVar.f;
                            str4 = (String) kVar.d;
                            str3 = (String) kVar.c;
                            oVar2 = (o) kVar.b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Object value = ((Result) obj).getValue();
                                long currentTimeMillis2 = System.currentTimeMillis() - j3;
                                String str7 = !Result.m8029isSuccessimpl(value) ? "SUCCESS" : "FAILURE";
                                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
                                String str8 = "";
                                if (m8026exceptionOrNullimpl != null) {
                                    ChartboostError chartboostError = m8026exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8026exceptionOrNullimpl : null;
                                    if (chartboostError == null) {
                                        str5 = "exceptionType=" + m8026exceptionOrNullimpl.getClass().getSimpleName() + ", message=" + m8026exceptionOrNullimpl.getMessage();
                                    } else {
                                        str5 = "errorCode=" + chartboostError.getCode() + ", errorConstant=" + chartboostError.getConstant() + ", message=" + ((ChartboostError) m8026exceptionOrNullimpl).getMessage();
                                    }
                                }
                                str5 = "";
                                u a2 = oVar2.a.a();
                                if (str5.length() > 0) {
                                    str8 = ", " + str5;
                                }
                                xb.a("Load completed: auctionId=" + str4 + ", adFormat=" + a2 + ", status=" + str7 + ", durationMs=" + currentTimeMillis2 + str8, (Throwable) null, 2, (Object) null);
                                if (str3 != null) {
                                    oVar2.a(value, str3, currentTimeMillis2);
                                }
                                return value;
                            } catch (CancellationException e2) {
                                e = e2;
                                oVar = oVar2;
                                job = oVar.p;
                                if (job != null) {
                                }
                                throw e;
                            }
                        }
                        j2 = kVar.f;
                        CompletableDeferred completableDeferred = (CompletableDeferred) kVar.e;
                        String str9 = (String) kVar.d;
                        String str10 = (String) kVar.c;
                        oVar = (o) kVar.b;
                        ResultKt.throwOnFailure(obj);
                        str2 = str9;
                        CompletableDeferred$default = completableDeferred;
                        str6 = str10;
                    }
                    kVar.b = oVar;
                    kVar.c = str6;
                    kVar.d = str2;
                    kVar.e = null;
                    kVar.f = j2;
                    kVar.i = 2;
                    await = CompletableDeferred$default.await(kVar);
                    if (await != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str6;
                    str4 = str2;
                    obj = await;
                    j3 = j2;
                    oVar2 = oVar;
                    Object value2 = ((Result) obj).getValue();
                    long currentTimeMillis22 = System.currentTimeMillis() - j3;
                    if (!Result.m8029isSuccessimpl(value2)) {
                    }
                    m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value2);
                    String str82 = "";
                    if (m8026exceptionOrNullimpl != null) {
                    }
                    str5 = "";
                    u a22 = oVar2.a.a();
                    if (str5.length() > 0) {
                    }
                    xb.a("Load completed: auctionId=" + str4 + ", adFormat=" + a22 + ", status=" + str7 + ", durationMs=" + currentTimeMillis22 + str82, (Throwable) null, 2, (Object) null);
                    if (str3 != null) {
                    }
                    return value2;
                }
            }
            kVar.b = oVar;
            kVar.c = str6;
            kVar.d = str2;
            kVar.e = null;
            kVar.f = j2;
            kVar.i = 2;
            await = CompletableDeferred$default.await(kVar);
            if (await != coroutine_suspended) {
            }
        } catch (CancellationException e3) {
            e = e3;
            job = oVar.p;
            if (job != null) {
                job.cancel(e);
            }
            throw e;
        }
        kVar = new k(continuation);
        Object obj2 = kVar.g;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.i;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, vb vbVar, Continuation continuation) {
        m mVar;
        int i2;
        Object obj;
        o oVar;
        ChartboostError.Show.Unknown unknown;
        ChartboostError.Show show;
        b.h hVar;
        vb vbVar2;
        o oVar2;
        vb vbVar3 = vbVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i3 = mVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.f = i3 - Integer.MIN_VALUE;
                m mVar2 = mVar;
                Object obj2 = mVar2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = mVar2.f;
                String str = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        vbVar2 = (vb) mVar2.c;
                        oVar2 = (o) mVar2.b;
                    } else if (i2 == 2) {
                        vbVar2 = (vb) mVar2.c;
                        oVar2 = (o) mVar2.b;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    oVar = oVar2;
                    vb vbVar4 = vbVar2;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (Throwable th) {
                        th = th;
                        vbVar3 = vbVar4;
                        obj = null;
                        if (str != null) {
                        }
                        if (th instanceof ChartboostError.Show) {
                        }
                        xb.b(X3.j.d + show.getCode() + "] " + show.getConstant() + " - Ad show failed for auction " + vbVar3.b(), show);
                        oVar.a(vbVar3, show);
                        hVar = new b.h(show);
                        mVar2.b = obj;
                        mVar2.c = obj;
                        mVar2.f = 3;
                        if (oVar.a(hVar, mVar2) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj2);
                    xb.a("Performing show: auctionId=" + vbVar.b() + ", adFormat=" + this.a.a(), (Throwable) null, 2, (Object) null);
                    try {
                        e();
                        xb.a("Creating AdContainerView: auctionId=" + vbVar.b(), (Throwable) null, 2, (Object) null);
                        obj = null;
                        try {
                            com.chartboost.sdk.impl.m mVar3 = new com.chartboost.sdk.impl.m(context, vbVar.c(), this.q, this.a.a(), this.b, null, this.h, 32, null);
                            d(vbVar3);
                            if (this.a.a() == u.b) {
                                mVar3.v();
                                xb.a("AdContainerView started: auctionId=" + vbVar.b(), (Throwable) null, 2, (Object) null);
                                b.j jVar = new b.j(mVar3);
                                mVar2.b = this;
                                mVar2.c = vbVar3;
                                mVar2.f = 1;
                                if (a(jVar, mVar2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                str = vbVar.b() + "_" + SystemClock.uptimeMillis();
                                try {
                                    s.put(str, mVar3);
                                    Intent addFlags = new Intent(context, (Class<?>) FullscreenAdActivity.class).putExtra("com.chartboost.sdk.internal.AdController.AdContainerMap", str).addFlags(268435456);
                                    Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
                                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, addFlags);
                                    try {
                                        b.j jVar2 = new b.j(null);
                                        mVar2.b = this;
                                        mVar2.c = vbVar3;
                                        mVar2.f = 2;
                                        if (a(jVar2, mVar2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        oVar = this;
                                        str = null;
                                        if (str != null) {
                                        }
                                        if (th instanceof ChartboostError.Show) {
                                            show = th;
                                        } else {
                                            if (th instanceof IllegalStateException) {
                                                unknown = new ChartboostError.Show.Unknown("Invalid state during show: " + th.getMessage(), th);
                                            } else if (th instanceof IllegalArgumentException) {
                                                unknown = new ChartboostError.Show.Unknown("Invalid show parameters: " + th.getMessage(), th);
                                            } else {
                                                unknown = new ChartboostError.Show.Unknown("Show failed: " + th.getMessage(), th);
                                            }
                                            show = unknown;
                                        }
                                        xb.b(X3.j.d + show.getCode() + "] " + show.getConstant() + " - Ad show failed for auction " + vbVar3.b(), show);
                                        oVar.a(vbVar3, show);
                                        hVar = new b.h(show);
                                        mVar2.b = obj;
                                        mVar2.c = obj;
                                        mVar2.f = 3;
                                        if (oVar.a(hVar, mVar2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    oVar = this;
                                    if (str != null) {
                                    }
                                    if (th instanceof ChartboostError.Show) {
                                    }
                                    xb.b(X3.j.d + show.getCode() + "] " + show.getConstant() + " - Ad show failed for auction " + vbVar3.b(), show);
                                    oVar.a(vbVar3, show);
                                    hVar = new b.h(show);
                                    mVar2.b = obj;
                                    mVar2.c = obj;
                                    mVar2.f = 3;
                                    if (oVar.a(hVar, mVar2) == coroutine_suspended) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = null;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        mVar = new m(continuation);
        m mVar22 = mVar;
        Object obj22 = mVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = mVar22.f;
        String str2 = null;
        if (i2 == 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a7, code lost:
    
        if (r4 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r4 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.chartboost.sdk.impl.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        n nVar;
        Object coroutine_suspended;
        int i2;
        String str;
        String str2;
        CompletableDeferred completableDeferred;
        long j2;
        od c2;
        List w;
        Object await;
        long j3;
        String str3;
        Throwable m8026exceptionOrNullimpl;
        String str4;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i3 = nVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.g = i3 - Integer.MIN_VALUE;
                Object obj = nVar.e;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = nVar.g;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    vb f2 = f();
                    if (f2 == null || (str = f2.b()) == null) {
                        str = "<no_current_ad>";
                    }
                    vb f3 = f();
                    if (f3 != null && (c2 = f3.c()) != null && (w = c2.w()) != null) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(w, 10));
                        Iterator it = w.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((m2) it.next()).getClass().getSimpleName());
                        }
                        str2 = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                    }
                    str2 = "none";
                    xb.a("Show started: auctionId=" + str + ", adFormat=" + this.a.a() + ", currentState=" + Reflection.getOrCreateKotlinClass(this.m.getClass()).getSimpleName() + ", renderableTypes=[" + str2 + X3.j.e, (Throwable) null, 2, (Object) null);
                    long currentTimeMillis = System.currentTimeMillis();
                    CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    b iVar = new b.i(context, CompletableDeferred$default);
                    nVar.b = str;
                    nVar.c = CompletableDeferred$default;
                    nVar.d = currentTimeMillis;
                    nVar.g = 1;
                    if (a(iVar, nVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableDeferred = CompletableDeferred$default;
                    j2 = currentTimeMillis;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = nVar.d;
                        str3 = (String) nVar.b;
                        ResultKt.throwOnFailure(obj);
                        Object value = ((Result) obj).getValue();
                        long currentTimeMillis2 = System.currentTimeMillis() - j3;
                        String str5 = !Result.m8029isSuccessimpl(value) ? "SUCCESS" : "FAILURE";
                        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value);
                        String str6 = "";
                        if (m8026exceptionOrNullimpl != null) {
                            ChartboostError chartboostError = m8026exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8026exceptionOrNullimpl : null;
                            if (chartboostError == null) {
                                str4 = "exceptionType=" + m8026exceptionOrNullimpl.getClass().getSimpleName() + ", message=" + m8026exceptionOrNullimpl.getMessage();
                            } else {
                                str4 = "errorCode=" + chartboostError.getCode() + ", errorConstant=" + chartboostError.getConstant() + ", message=" + ((ChartboostError) m8026exceptionOrNullimpl).getMessage();
                            }
                        }
                        str4 = "";
                        if (str4.length() > 0) {
                            str6 = ", " + str4;
                        }
                        xb.a("Show completed: auctionId=" + str3 + ", status=" + str5 + ", durationMs=" + currentTimeMillis2 + str6, (Throwable) null, 2, (Object) null);
                        return value;
                    }
                    j2 = nVar.d;
                    completableDeferred = (CompletableDeferred) nVar.c;
                    String str7 = (String) nVar.b;
                    ResultKt.throwOnFailure(obj);
                    str = str7;
                }
                nVar.b = str;
                nVar.c = null;
                nVar.d = j2;
                nVar.g = 2;
                await = completableDeferred.await(nVar);
                if (await != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j3 = j2;
                str3 = str;
                obj = await;
                Object value2 = ((Result) obj).getValue();
                long currentTimeMillis22 = System.currentTimeMillis() - j3;
                if (!Result.m8029isSuccessimpl(value2)) {
                }
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(value2);
                String str62 = "";
                if (m8026exceptionOrNullimpl != null) {
                }
                str4 = "";
                if (str4.length() > 0) {
                }
                xb.a("Show completed: auctionId=" + str3 + ", status=" + str5 + ", durationMs=" + currentTimeMillis22 + str62, (Throwable) null, 2, (Object) null);
                return value2;
            }
        }
        nVar = new n(continuation);
        Object obj2 = nVar.e;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = nVar.g;
        if (i2 != 0) {
        }
        nVar.b = str;
        nVar.c = null;
        nVar.d = j2;
        nVar.g = 2;
        await = completableDeferred.await(nVar);
        if (await != coroutine_suspended) {
        }
    }

    public final void a(int i2) {
        String str;
        Job launch$default;
        vb f2 = f();
        if (f2 == null || (str = f2.b()) == null) {
            str = "<unknown>";
        }
        xb.a("Starting expiration timer: auctionId=" + str + ", expirationSeconds=" + i2, (Throwable) null, 2, (Object) null);
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new C0227o(i2, str, this, null), 3, null);
        this.o = launch$default;
    }

    public final void a(vb vbVar) {
        List e2 = vbVar.a().e();
        int i2 = 0;
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.h.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        xb.a("Tracking close: auctionId=" + vbVar.b() + ", adFormat=" + this.a.a() + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        rh rhVar = this.f;
        u4 u4Var = new u4(vbVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, 60, null);
        List e3 = vbVar.a().e();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.h.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, u4Var, arrayList2, (o7.b) null, 4, (Object) null);
        wb.a.c();
    }

    public final void a(Object obj, String bidResponse, long j2) {
        Object m8023constructorimpl;
        String a2;
        int i2;
        String a3;
        String str;
        List emptyList;
        a0 a4;
        List e2;
        String message;
        a0 a5;
        a0 a6;
        List e3;
        a0 a7;
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(z.c.a(new JSONObject(this.i.b(bidResponse))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        z zVar = (z) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        ChartboostError.Load load = m8026exceptionOrNullimpl instanceof ChartboostError.Load ? (ChartboostError.Load) m8026exceptionOrNullimpl : null;
        boolean z = m8026exceptionOrNullimpl != null || Result.m8028isFailureimpl(m8023constructorimpl);
        String a8 = z ? wb.a(wb.a, 0, 1, null) : null;
        if (zVar == null || (a7 = zVar.a()) == null || (a2 = a7.c()) == null) {
            a2 = a(bidResponse);
        }
        if (zVar == null || (a6 = zVar.a()) == null || (e3 = a6.e()) == null || e3.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e3.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.k.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        String str2 = z ? "FAILURE" : "SUCCESS";
        int length = a8 != null ? a8.length() : 0;
        String code = load != null ? load.getCode() : null;
        String constant = load != null ? load.getConstant() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("Tracking load: auctionId=");
        sb.append(a2);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", durationMs=");
        ChartboostError.Load load2 = load;
        sb.append(j2);
        sb.append(", trackerCount=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(code);
        sb.append(", errorConstant=");
        sb.append(constant);
        sb.append(", logContextSize=");
        sb.append(length);
        xb.a(sb.toString(), (Throwable) null, 2, (Object) null);
        if (load2 != null) {
            xb.a("Tracking load error details: causeDescription=" + load2.getCauseDescription(), (Throwable) null, 2, (Object) null);
        }
        if (zVar == null || (a5 = zVar.a()) == null || (a3 = a5.c()) == null) {
            a3 = a(bidResponse);
        }
        List emptyList2 = CollectionsKt.emptyList();
        if (load2 == null || (message = load2.getMessage()) == null) {
            String message2 = m8026exceptionOrNullimpl != null ? m8026exceptionOrNullimpl.getMessage() : null;
            if (message2 == null) {
                Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                str = m8026exceptionOrNullimpl2 != null ? m8026exceptionOrNullimpl2.getMessage() : null;
            } else {
                str = message2;
            }
        } else {
            str = message;
        }
        rb rbVar = new rb(a3, emptyList2, str, load2 != null ? load2.getCode() : null, load2 != null ? load2.getConstant() : null, load2 != null ? load2.getCauseDescription() : null, Long.valueOf(j2), bidResponse, this.b, a8);
        if (zVar != null && (a4 = zVar.a()) != null && (e2 = a4.e()) != null) {
            ArrayList<o7> arrayList = new ArrayList();
            for (Object obj2 : e2) {
                if (Intrinsics.areEqual(((o7) obj2).d(), o7.b.k.b())) {
                    arrayList.add(obj2);
                }
            }
            emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (o7 o7Var : arrayList) {
                emptyList.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), null, 8, null));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        rh.a(this.f, rbVar, emptyList, (o7.b) null, 4, (Object) null);
    }

    public final void a(vb vbVar, boolean z) {
        List e2 = vbVar.a().e();
        int i2 = 0;
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.l.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        xb.a("Tracking reward: auctionId=" + vbVar.b() + ", adFormat=" + this.a.a() + ", rewardSkipped=" + z + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        rh rhVar = this.f;
        kg kgVar = new kg(vbVar.b(), CollectionsKt.emptyList(), z, null, null, null, null, this.b, 120, null);
        List e3 = vbVar.a().e();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.l.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, kgVar, arrayList2, (o7.b) null, 4, (Object) null);
    }

    public final void a(vb ad, Throwable throwable) {
        int i2;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ChartboostError.Show show = throwable instanceof ChartboostError.Show ? (ChartboostError.Show) throwable : null;
        List e2 = ad.a().e();
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((o7) it.next()).d(), o7.b.m.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i2 > 0) {
            xb.a("Submitting show failure telemetry: auctionId=" + ad.b() + ", errorCode=" + (show != null ? show.getCode() : null) + ", errorConstant=" + (show != null ? show.getConstant() : null) + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        } else {
            xb.e("Show failure telemetry has no trackers: auctionId=" + ad.b() + ", errorCode=" + (show != null ? show.getCode() : null) + ", errorConstant=" + (show != null ? show.getConstant() : null), null, 2, null);
        }
        rh rhVar = this.f;
        eh ehVar = new eh(ad.b(), CollectionsKt.emptyList(), throwable.getMessage(), show != null ? show.getCode() : null, show != null ? show.getCauseDescription() : null, show != null ? show.getConstant() : null, this.b, wb.a(wb.a, 0, 1, null));
        List e3 = ad.a().e();
        ArrayList<o7> arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((o7) obj).d(), o7.b.m.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (o7 o7Var : arrayList) {
            arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), o7Var.b()));
        }
        rh.a(rhVar, ehVar, arrayList2, (o7.b) null, 4, (Object) null);
    }

    public final String a(String str) {
        try {
            String optString = new JSONObject(this.i.b(str)).optString("auction_id", "");
            Intrinsics.checkNotNull(optString);
            return optString;
        } catch (IllegalArgumentException e2) {
            xb.e("Failed to decode bidResponse base64", e2);
            return "<base64_decode_error>";
        } catch (JSONException e3) {
            xb.e("Failed to extract auction_id from bidResponse", e3);
            return "<json_parse_error>";
        } catch (Exception e4) {
            xb.e("Unexpected error extracting auction_id", e4);
            return "<auction_id_error>";
        }
    }
}
