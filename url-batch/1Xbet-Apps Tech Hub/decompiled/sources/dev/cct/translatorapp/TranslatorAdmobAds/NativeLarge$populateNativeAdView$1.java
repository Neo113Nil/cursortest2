package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NativeLarge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.TranslatorAdmobAds.NativeLarge$populateNativeAdView$1", f = "NativeLarge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NativeLarge$populateNativeAdView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ConstraintLayout $container;
    final /* synthetic */ FrameLayout $frameLayout;
    final /* synthetic */ NativeAd $nativeAd;
    final /* synthetic */ int $nativeAdLayout;
    final /* synthetic */ FrameLayout $shimmerFrameLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeLarge$populateNativeAdView$1(NativeAd nativeAd, Activity activity, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, Continuation<? super NativeLarge$populateNativeAdView$1> continuation) {
        super(2, continuation);
        this.$nativeAd = nativeAd;
        this.$activity = activity;
        this.$nativeAdLayout = i;
        this.$container = constraintLayout;
        this.$frameLayout = frameLayout;
        this.$shimmerFrameLayout = frameLayout2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NativeLarge$populateNativeAdView$1 nativeLarge$populateNativeAdView$1 = new NativeLarge$populateNativeAdView$1(this.$nativeAd, this.$activity, this.$nativeAdLayout, this.$container, this.$frameLayout, this.$shimmerFrameLayout, continuation);
        nativeLarge$populateNativeAdView$1.L$0 = obj;
        return nativeLarge$populateNativeAdView$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NativeLarge$populateNativeAdView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MediaView mediaView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NativeAd nativeAd = this.$nativeAd;
        Unit unit = null;
        if (nativeAd != null) {
            Activity activity = this.$activity;
            int i = this.$nativeAdLayout;
            ConstraintLayout constraintLayout = this.$container;
            FrameLayout frameLayout = this.$frameLayout;
            FrameLayout frameLayout2 = this.$shimmerFrameLayout;
            Object systemService = activity.getSystemService("layout_inflater");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(i, (ViewGroup) null);
            NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(R.id.ad_view);
            nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
            nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
            nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
            nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
            nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
            View headlineView = nativeAdView.getHeadlineView();
            Intrinsics.checkNotNull(headlineView, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) headlineView).setText(nativeAd.getHeadline());
            MediaContent mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null && (mediaView = nativeAdView.getMediaView()) != null) {
                mediaView.setMediaContent(mediaContent);
            }
            if (nativeAd.getBody() == null) {
                View bodyView = nativeAdView.getBodyView();
                if (bodyView != null) {
                    bodyView.setVisibility(4);
                }
            } else {
                View bodyView2 = nativeAdView.getBodyView();
                if (bodyView2 != null) {
                    bodyView2.setVisibility(0);
                }
                View bodyView3 = nativeAdView.getBodyView();
                Intrinsics.checkNotNull(bodyView3, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) bodyView3).setText(nativeAd.getBody());
            }
            if (nativeAd.getCallToAction() == null) {
                View callToActionView = nativeAdView.getCallToActionView();
                if (callToActionView != null) {
                    callToActionView.setVisibility(4);
                }
            } else {
                View callToActionView2 = nativeAdView.getCallToActionView();
                if (callToActionView2 != null) {
                    callToActionView2.setVisibility(0);
                }
                View callToActionView3 = nativeAdView.getCallToActionView();
                Intrinsics.checkNotNull(callToActionView3, "null cannot be cast to non-null type android.widget.Button");
                ((Button) callToActionView3).setText(nativeAd.getCallToAction());
            }
            if (nativeAd.getIcon() == null) {
                View iconView = nativeAdView.getIconView();
                if (iconView != null) {
                    iconView.setVisibility(4);
                }
            } else {
                View iconView2 = nativeAdView.getIconView();
                if (iconView2 != null) {
                    Intrinsics.checkNotNull(iconView2, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) iconView2;
                    NativeAd.Image icon = nativeAd.getIcon();
                    imageView.setImageDrawable(icon != null ? icon.getDrawable() : null);
                }
                View iconView3 = nativeAdView.getIconView();
                if (iconView3 != null) {
                    iconView3.setVisibility(0);
                }
            }
            nativeAdView.setNativeAd(nativeAd);
            if (constraintLayout != null) {
                ExtensionFunctionKt.show(constraintLayout);
            }
            ExtensionFunctionKt.show(frameLayout);
            ExtensionFunctionKt.hide(frameLayout2);
            frameLayout.removeAllViews();
            if (nativeAdView.getParent() != null) {
                ViewParent parent = nativeAdView.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(inflate);
            }
            frameLayout.addView(inflate);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ConstraintLayout constraintLayout2 = this.$container;
            FrameLayout frameLayout3 = this.$frameLayout;
            FrameLayout frameLayout4 = this.$shimmerFrameLayout;
            if (constraintLayout2 != null) {
                ExtensionFunctionKt.hide(constraintLayout2);
            }
            ExtensionFunctionKt.hide(frameLayout3);
            ExtensionFunctionKt.hide(frameLayout4);
        }
        return Unit.INSTANCE;
    }
}
