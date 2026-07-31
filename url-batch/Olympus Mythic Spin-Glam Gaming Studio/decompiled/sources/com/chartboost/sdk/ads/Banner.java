package com.chartboost.sdk.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.impl.f2;
import com.chartboost.sdk.impl.f4;
import com.chartboost.sdk.impl.h2;
import com.chartboost.sdk.impl.j9;
import com.chartboost.sdk.impl.k;
import com.chartboost.sdk.impl.v;
import com.chartboost.sdk.impl.xb;
import com.ironsource.mediationsdk.j;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00013B3\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b1\u00102J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/chartboost/sdk/ads/Banner;", "Landroid/widget/FrameLayout;", "Lcom/chartboost/sdk/ads/Ad;", "", "postSessionNotStartedInMainThread", "()V", "cache", "", "bidResponse", "(Ljava/lang/String;)V", "show", "clearCache", "", "isCached", "()Z", "", "getBannerWidth", "()I", "getBannerHeight", "detach", "location", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "size", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "callback", "Lcom/chartboost/sdk/callbacks/BannerCallback;", "Lcom/chartboost/sdk/Mediation;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "Lcom/chartboost/sdk/impl/f2;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/chartboost/sdk/impl/f2;", "api", "Lcom/chartboost/sdk/impl/j9;", "adController", "Lcom/chartboost/sdk/impl/j9;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/sdk/ads/Banner$BannerSize;Lcom/chartboost/sdk/callbacks/BannerCallback;Lcom/chartboost/sdk/Mediation;)V", "BannerSize", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes11.dex */
public final class Banner extends FrameLayout implements Ad {

    @NotNull
    private final j9 adController;

    /* renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    @NotNull
    private final BannerCallback callback;

    @NotNull
    private final String location;

    @Nullable
    private final Mediation mediation;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final BannerSize size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/sdk/ads/Banner$BannerSize;", "", "width", "", "height", "(Ljava/lang/String;III)V", "getHeight", "()I", "getWidth", "STANDARD", "MEDIUM", j.d, "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BannerSize {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BannerSize[] $VALUES;
        private final int height;
        private final int width;
        public static final BannerSize STANDARD = new BannerSize("STANDARD", 0, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
        public static final BannerSize MEDIUM = new BannerSize("MEDIUM", 1, 300, POBCommonConstants.DEFAULT_MIN_BITRATE);
        public static final BannerSize LEADERBOARD = new BannerSize(j.d, 2, 728, 90);

        private static final /* synthetic */ BannerSize[] $values() {
            return new BannerSize[]{STANDARD, MEDIUM, LEADERBOARD};
        }

        static {
            BannerSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BannerSize(String str, int i, int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BannerSize valueOf(String str) {
            return (BannerSize) Enum.valueOf(BannerSize.class, str);
        }

        public static BannerSize[] values() {
            return (BannerSize[]) $VALUES.clone();
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new b(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v vVar = new v(Boxing.boxInt(Banner.this.size.getWidth()), Boxing.boxInt(Banner.this.size.getHeight()));
                j9 j9Var = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String str = this.d;
                this.b = 1;
                if (j9Var.a(context, str, vVar, this) == coroutine_suspended) {
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
            Banner.this.callback.onAdLoaded(new CacheEvent(null, Banner.this), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
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

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Banner.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                j9 j9Var = Banner.this.adController;
                Context context = Banner.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
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

    public /* synthetic */ Banner(Context context, String str, BannerSize bannerSize, BannerCallback bannerCallback, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bannerSize, bannerCallback, (i & 16) != 0 ? null : mediation);
    }

    private final void postSessionNotStartedInMainThread() {
        try {
            f4.b.d().c().a(new c());
        } catch (Exception e) {
            xb.b("Banner ad cannot post session not started callback " + e, (Throwable) null, 2, (Object) null);
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

    public final void detach() {
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        if (Chartboost.isSdkStarted()) {
            this.adController.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getBannerHeight() {
        return this.size.getHeight();
    }

    public final int getBannerWidth() {
        return this.size.getWidth();
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

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void show() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new d(null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(@NotNull Context context, @NotNull String location, @NotNull BannerSize size, @NotNull BannerCallback callback, @Nullable Mediation mediation) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.location = location;
        this.size = size;
        this.callback = callback;
        this.mediation = mediation;
        this.api = LazyKt.lazy(new a());
        this.adController = new h2(getApi(), callback, this, f4.b);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
    }

    @Override // com.chartboost.sdk.ads.Ad
    public void cache(@Nullable String bidResponse) {
        if (Chartboost.isSdkStarted()) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(bidResponse, null), 3, null);
        } else {
            postSessionNotStartedInMainThread();
        }
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f2 mo4828invoke() {
            return k.a(Banner.this.getMediation());
        }
    }

    private final f2 getApi() {
        return (f2) this.api.getValue();
    }
}
