package dev.cct.translatorapp.ads;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NativeSplashAd.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ads.NativeSplashAd$populateNativeAdView$1", f = "NativeSplashAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NativeSplashAd$populateNativeAdView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PAGNativeAd $nativeAd;
    final /* synthetic */ FrameLayout $nativeAdLayout;
    final /* synthetic */ int $nativeLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeSplashAd$populateNativeAdView$1(PAGNativeAd pAGNativeAd, Context context, int i, FrameLayout frameLayout, Continuation<? super NativeSplashAd$populateNativeAdView$1> continuation) {
        super(2, continuation);
        this.$nativeAd = pAGNativeAd;
        this.$context = context;
        this.$nativeLayout = i;
        this.$nativeAdLayout = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NativeSplashAd$populateNativeAdView$1 nativeSplashAd$populateNativeAdView$1 = new NativeSplashAd$populateNativeAdView$1(this.$nativeAd, this.$context, this.$nativeLayout, this.$nativeAdLayout, continuation);
        nativeSplashAd$populateNativeAdView$1.L$0 = obj;
        return nativeSplashAd$populateNativeAdView$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NativeSplashAd$populateNativeAdView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PAGNativeAdData nativeAdData;
        PAGImageItem icon;
        String imageUrl;
        PAGNativeAdData nativeAdData2;
        PAGNativeAdData nativeAdData3;
        PAGNativeAdData nativeAdData4;
        PAGNativeAdData nativeAdData5;
        PAGNativeAdData nativeAdData6;
        PAGNativeAdData nativeAdData7;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PAGNativeAd pAGNativeAd = this.$nativeAd;
        Context context = this.$context;
        int i = this.$nativeLayout;
        FrameLayout frameLayout = this.$nativeAdLayout;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        PAGMediaView pAGMediaView = null;
        View mainAdView = ((LayoutInflater) systemService).inflate(i, (ViewGroup) null);
        FrameLayout frameLayout2 = (FrameLayout) mainAdView.findViewById(R.id.ad_media);
        View findViewById = mainAdView.findViewById(R.id.ad_headline);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mainAdView.findViewById(R.id.ad_headline)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = mainAdView.findViewById(R.id.ad_body);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mainAdView.findViewById(R.id.ad_body)");
        TextView textView2 = (TextView) findViewById2;
        AppCompatButton appCompatButton = (AppCompatButton) mainAdView.findViewById(R.id.ad_call_to_action);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mainAdView.findViewById(R.id.ad_app_icon);
        textView.setText((pAGNativeAd == null || (nativeAdData7 = pAGNativeAd.getNativeAdData()) == null) ? null : nativeAdData7.getTitle());
        if (((pAGNativeAd == null || (nativeAdData6 = pAGNativeAd.getNativeAdData()) == null) ? null : nativeAdData6.getDescription()) == null) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            textView2.setText(pAGNativeAd.getNativeAdData().getDescription());
        }
        if (((pAGNativeAd == null || (nativeAdData5 = pAGNativeAd.getNativeAdData()) == null) ? null : nativeAdData5.getButtonText()) != null) {
            if (appCompatButton != null) {
                appCompatButton.setVisibility(0);
            }
            if (appCompatButton != null) {
                appCompatButton.setText((pAGNativeAd == null || (nativeAdData = pAGNativeAd.getNativeAdData()) == null) ? null : nativeAdData.getButtonText());
            }
        } else if (appCompatButton != null) {
            appCompatButton.setVisibility(4);
        }
        if (((pAGNativeAd == null || (nativeAdData4 = pAGNativeAd.getNativeAdData()) == null) ? null : nativeAdData4.getIcon()) != null) {
            PAGNativeAdData nativeAdData8 = pAGNativeAd.getNativeAdData();
            if (nativeAdData8 != null && (icon = nativeAdData8.getIcon()) != null && (imageUrl = icon.getImageUrl()) != null) {
                Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
                if (appCompatImageView != null) {
                    Log.e("PangleNative", "native Icon - " + imageUrl);
                    Glide.with(appCompatImageView.getContext()).load(imageUrl).into(appCompatImageView);
                    appCompatImageView.setVisibility(0);
                }
            }
        } else if (appCompatImageView != null) {
            appCompatImageView.setVisibility(4);
        }
        if (pAGNativeAd != null && (nativeAdData3 = pAGNativeAd.getNativeAdData()) != null) {
            nativeAdData3.getAdLogoView();
        }
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(mainAdView, "mainAdView");
        arrayList.add(mainAdView);
        ArrayList arrayList2 = new ArrayList();
        if (appCompatButton != null) {
            Boxing.boxBoolean(arrayList2.add(appCompatButton));
        }
        if (appCompatImageView != null) {
            Boxing.boxBoolean(arrayList2.add(appCompatImageView));
        }
        arrayList2.add(textView);
        if (pAGNativeAd != null && (nativeAdData2 = pAGNativeAd.getNativeAdData()) != null) {
            pAGMediaView = nativeAdData2.getMediaView();
        }
        if (pAGMediaView != null && pAGMediaView.getParent() == null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(pAGMediaView);
        }
        if (pAGNativeAd != null) {
            pAGNativeAd.registerViewForInteraction((ViewGroup) mainAdView, arrayList, arrayList2, (View) null, new PAGNativeAdInteractionListener() { // from class: dev.cct.translatorapp.ads.NativeSplashAd$populateNativeAdView$1$1$5
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                }
            });
        }
        FrameLayout frameLayout3 = frameLayout;
        ExtensionFunctionKt.show(frameLayout3);
        frameLayout.removeAllViews();
        if (mainAdView.getParent() != null) {
            ViewParent parent = mainAdView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(frameLayout3);
        }
        frameLayout.addView(mainAdView);
        return Unit.INSTANCE;
    }
}
