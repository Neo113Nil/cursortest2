package com.chartboost.sdk.ads;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.f4;
import com.chartboost.sdk.impl.j9;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.l5;
import com.chartboost.sdk.impl.lg;
import com.chartboost.sdk.impl.mg;
import com.chartboost.sdk.impl.xb;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/chartboost/sdk/ads/Rewarded;", "Lcom/chartboost/sdk/ads/Ad;", "", "postSessionNotStartedInMainThread", "()V", "cache", "", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", "location", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/callbacks/RewardedCallback;", "callback", "Lcom/chartboost/sdk/callbacks/RewardedCallback;", "Lcom/chartboost/sdk/Mediation;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/lg;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/lg;", "api", "Lcom/chartboost/sdk/impl/j9;", "adController", "Lcom/chartboost/sdk/impl/j9;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/callbacks/RewardedCallback;Lcom/chartboost/sdk/Mediation;)V", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class Rewarded implements Ad {

    @NotNull
    private final j9 adController;

    /* renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    @NotNull
    private final RewardedCallback callback;

    @NotNull
    private final String location;

    @Nullable
    private final Mediation mediation;

    @NotNull
    private final CoroutineScope scope;

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.d = context;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Rewarded.this.new b(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j9 j9Var = Rewarded.this.adController;
                Context context = this.d;
                String str = this.e;
                this.b = 1;
                if (j9.a.a(j9Var, context, str, null, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            Rewarded.this.callback.onAdLoaded(new CacheEvent(null, Rewarded.this), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Continuation continuation) {
            super(2, continuation);
            this.d = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Rewarded.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j9 j9Var = Rewarded.this.adController;
                Context context = this.d;
                this.b = 1;
                if (j9Var.a(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public Rewarded(@NotNull String location, @NotNull RewardedCallback callback, @Nullable Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.location = location;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.lazy(new a());
        this.adController = new mg(getApi(), callback, this, f4.b);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            f4.b.d().c().a(new c());
        } catch (Exception e) {
            xb.b("Rewarded ad cannot post session not started callback " + e, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache() {
        if (Chartboost.isSdkStarted()) {
            getApi().a(this, this.callback);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void clearCache() {
        this.adController.c();
    }

    @Override // com.chartboost.sdk.ads.Ad
    @NotNull
    public String getLocation() {
        return this.location;
    }

    @Override // com.chartboost.sdk.ads.Ad
    @Nullable
    public Mediation getMediation() {
        return this.mediation;
    }

    @Override // com.chartboost.sdk.ads.Ad
    @Deprecated
    public boolean isCached() {
        return this.adController.a();
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void show() {
        Context a2 = l5.a.a();
        if (a2 == null) {
            postSessionNotStartedInMainThread();
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new d(a2, null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(@Nullable String bidResponse) {
        Context a2 = l5.a.a();
        if (a2 != null) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(a2, bidResponse, null), 3, null);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    public /* synthetic */ Rewarded(String str, RewardedCallback rewardedCallback, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rewardedCallback, (i & 4) != 0 ? null : mediation);
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lg mo4828invoke() {
            return k.c(Rewarded.this.getMediation());
        }
    }

    private final lg getApi() {
        return (lg) this.api.getValue();
    }
}
