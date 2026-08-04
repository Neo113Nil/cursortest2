package io.invertase.googlemobileads;

import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ReactNativeGoogleMobileAdsNativeAdView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1", f = "ReactNativeGoogleMobileAdsNativeAdView.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReactNativeGoogleMobileAdsNativeAdView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1(ReactNativeGoogleMobileAdsNativeAdView reactNativeGoogleMobileAdsNativeAdView, Continuation<? super ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1> continuation) {
        super(2, continuation);
        this.this$0 = reactNativeGoogleMobileAdsNativeAdView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactNativeGoogleMobileAdsNativeAdView$reloadAd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NativeAd nativeAd;
        NativeAdView nativeAdView;
        NativeAdView nativeAdView2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        nativeAd = this.this$0.nativeAd;
        if (nativeAd != null) {
            nativeAdView2 = this.this$0.nativeAdView;
            nativeAdView2.setNativeAd(nativeAd);
        }
        nativeAdView = this.this$0.nativeAdView;
        nativeAdView.getRootView().requestLayout();
        return Unit.INSTANCE;
    }
}
