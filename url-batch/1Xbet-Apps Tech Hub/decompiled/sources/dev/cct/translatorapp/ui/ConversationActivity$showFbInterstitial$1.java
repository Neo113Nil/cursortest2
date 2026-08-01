package dev.cct.translatorapp.ui;

import android.app.AlertDialog;
import dev.cct.translatorapp.TranslatorAdmobAds.facebookads.FacebookInterstitials;
import dev.cct.translatorapp.ads.ConstantParam;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.objectweb.asm.Opcodes;

/* compiled from: ConversationActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$showFbInterstitial$1", f = "ConversationActivity.kt", i = {}, l = {Opcodes.NEW}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConversationActivity$showFbInterstitial$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationActivity$showFbInterstitial$1(ConversationActivity conversationActivity, Continuation<? super ConversationActivity$showFbInterstitial$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationActivity$showFbInterstitial$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationActivity$showFbInterstitial$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlertDialog alertDialog;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        FacebookInterstitials fbInterstitial = ConstantParam.INSTANCE.getFbInterstitial();
        final ConversationActivity conversationActivity = this.this$0;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.ConversationActivity$showFbInterstitial$1.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AlertDialog alertDialog2;
                alertDialog2 = ConversationActivity.this.loadingDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                ConversationActivity.this.finish();
            }
        };
        final ConversationActivity conversationActivity2 = this.this$0;
        fbInterstitial.showFbInterstitialAd(function0, new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.ConversationActivity$showFbInterstitial$1.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AlertDialog alertDialog2;
                alertDialog2 = ConversationActivity.this.loadingDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                ConversationActivity.this.finish();
            }
        });
        alertDialog = this.this$0.loadingDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        return Unit.INSTANCE;
    }
}
