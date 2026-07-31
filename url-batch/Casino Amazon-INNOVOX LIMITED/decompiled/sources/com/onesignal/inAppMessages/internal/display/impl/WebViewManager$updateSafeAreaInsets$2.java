package com.onesignal.inAppMessages.internal.display.impl;

import com.onesignal.common.ViewUtils;
import java.util.Arrays;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebViewManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$updateSafeAreaInsets$2", f = "WebViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebViewManager$updateSafeAreaInsets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewManager$updateSafeAreaInsets$2(WebViewManager webViewManager, Continuation<? super WebViewManager$updateSafeAreaInsets$2> continuation) {
        super(2, continuation);
        this.this$0 = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewManager$updateSafeAreaInsets$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebViewManager$updateSafeAreaInsets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OSWebView oSWebView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            int[] cutoutAndStatusBarInsets = ViewUtils.INSTANCE.getCutoutAndStatusBarInsets(this.this$0.activity);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(WebViewManager.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Boxing.boxInt(cutoutAndStatusBarInsets[0]), Boxing.boxInt(cutoutAndStatusBarInsets[1]), Boxing.boxInt(cutoutAndStatusBarInsets[2]), Boxing.boxInt(cutoutAndStatusBarInsets[3])}, 4));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(WebViewManager.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{format}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            oSWebView = this.this$0.webView;
            Intrinsics.checkNotNull(oSWebView);
            oSWebView.evaluateJavascript(format2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
