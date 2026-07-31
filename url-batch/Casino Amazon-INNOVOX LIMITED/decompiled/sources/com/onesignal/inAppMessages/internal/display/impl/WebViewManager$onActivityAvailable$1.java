package com.onesignal.inAppMessages.internal.display.impl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewManager.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$onActivityAvailable$1", f = "WebViewManager.kt", i = {}, l = {299, 306, 310}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebViewManager$onActivityAvailable$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $lastActivityName;
    int label;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewManager$onActivityAvailable$1(String str, WebViewManager webViewManager, Continuation<? super WebViewManager$onActivityAvailable$1> continuation) {
        super(1, continuation);
        this.$lastActivityName = str;
        this.this$0 = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WebViewManager$onActivityAvailable$1(this.$lastActivityName, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WebViewManager$onActivityAvailable$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r6 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r6 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object calculateHeightAndShowWebViewAfterNewActivity;
        Integer num;
        Object showMessageView;
        Object showMessageView2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$lastActivityName;
            if (str2 == null) {
                this.label = 1;
                showMessageView2 = this.this$0.showMessageView(null, this);
            } else {
                str = this.this$0.currentActivityName;
                if (!Intrinsics.areEqual(str2, str)) {
                    if (!this.this$0.closing) {
                        if (this.this$0.messageView != null) {
                            InAppMessageView inAppMessageView = this.this$0.messageView;
                            Intrinsics.checkNotNull(inAppMessageView);
                            inAppMessageView.removeAllViews();
                        }
                        WebViewManager webViewManager = this.this$0;
                        num = webViewManager.lastPageHeight;
                        this.label = 2;
                        showMessageView = webViewManager.showMessageView(num, this);
                    }
                } else {
                    this.label = 3;
                    calculateHeightAndShowWebViewAfterNewActivity = this.this$0.calculateHeightAndShowWebViewAfterNewActivity(this);
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
