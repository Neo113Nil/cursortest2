package com.yandex.mobile.ads.feed;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.C1795a4;
import com.yandex.mobile.ads.impl.da0;
import com.yandex.mobile.ads.impl.dt;
import com.yandex.mobile.ads.impl.fe2;
import com.yandex.mobile.ads.impl.ol2;
import com.yandex.mobile.ads.impl.w80;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class FeedAdAdapter extends w80 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private FeedAdEventListener f22463g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final dt f22464h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final fe2 f22465i;

    private final class a implements dt {

        /* renamed from: com.yandex.mobile.ads.feed.FeedAdAdapter$a$a, reason: collision with other inner class name */
        static final class C0180a extends s implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FeedAdAdapter f22467b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0180a(FeedAdAdapter feedAdAdapter) {
                super(0);
                this.f22467b = feedAdAdapter;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FeedAdEventListener eventListener = this.f22467b.getEventListener();
                if (eventListener != null) {
                    eventListener.onAdClicked();
                }
                return Unit.f41027a;
            }
        }

        static final class b extends s implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FeedAdAdapter f22468b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ol2 f22469c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FeedAdAdapter feedAdAdapter, ol2 ol2Var) {
                super(0);
                this.f22468b = feedAdAdapter;
                this.f22469c = ol2Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FeedAdEventListener eventListener = this.f22468b.getEventListener();
                if (eventListener != null) {
                    eventListener.onImpression(this.f22469c);
                }
                return Unit.f41027a;
            }
        }

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void a(@Nullable C1795a4 c1795a4) {
            new CallbackStackTraceMarker(new b(FeedAdAdapter.this, c1795a4 != null ? new ol2(c1795a4) : null));
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void closeNativeAd() {
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void onAdClicked() {
            new CallbackStackTraceMarker(new C0180a(FeedAdAdapter.this));
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void onLeftApplication() {
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void onReturnedToApplication() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeedAdAdapter(@NotNull FeedAd feedAd) {
        super(r3, null, 2, null);
        Intrinsics.checkNotNullParameter(feedAd, "feedAd");
        da0 a4 = feedAd.a();
        Intrinsics.checkNotNullExpressionValue(a4, "getFeedViewModel(...)");
        this.f22464h = new a();
        this.f22465i = new fe2();
    }

    @Override // com.yandex.mobile.ads.impl.w80
    @NotNull
    protected final dt a() {
        return this.f22464h;
    }

    @Override // com.yandex.mobile.ads.impl.w80
    @NotNull
    protected final fe2 b() {
        return this.f22465i;
    }

    @Nullable
    public final FeedAdEventListener getEventListener() {
        return this.f22463g;
    }

    public final void setEventListener(@Nullable FeedAdEventListener feedAdEventListener) {
        this.f22463g = feedAdEventListener;
    }
}
