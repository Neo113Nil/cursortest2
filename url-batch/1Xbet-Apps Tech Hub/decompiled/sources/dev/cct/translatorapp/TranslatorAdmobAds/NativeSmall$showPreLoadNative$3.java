package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NativeSmall.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$showPreLoadNative$3", f = "NativeSmall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NativeSmall$showPreLoadNative$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ConstraintLayout $container;
    final /* synthetic */ FrameLayout $frameLayout;
    final /* synthetic */ int $nativeAdLayout;
    final /* synthetic */ FrameLayout $shimmerFrameLayout;
    int label;
    final /* synthetic */ NativeSmall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeSmall$showPreLoadNative$3(NativeSmall nativeSmall, Activity activity, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, Continuation<? super NativeSmall$showPreLoadNative$3> continuation) {
        super(2, continuation);
        this.this$0 = nativeSmall;
        this.$activity = activity;
        this.$nativeAdLayout = i;
        this.$container = constraintLayout;
        this.$frameLayout = frameLayout;
        this.$shimmerFrameLayout = frameLayout2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NativeSmall$showPreLoadNative$3(this.this$0, this.$activity, this.$nativeAdLayout, this.$container, this.$frameLayout, this.$shimmerFrameLayout, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NativeSmall$showPreLoadNative$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NativeAd nativeAd;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NativeSmall nativeSmall = this.this$0;
        Activity activity = this.$activity;
        int i = this.$nativeAdLayout;
        nativeAd = nativeSmall.nativeAd;
        nativeSmall.populateNativeAdView(activity, i, nativeAd, this.$container, this.$frameLayout, this.$shimmerFrameLayout);
        return Unit.INSTANCE;
    }
}
