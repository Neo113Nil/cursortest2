package dev.cct.translatorapp.ui;

import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.util.ExtensionFunction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: TextTranslation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.TextTranslation$showInterstitials$1", f = "TextTranslation.kt", i = {1}, l = {748, 756, 759}, m = "invokeSuspend", n = {"adLoaded"}, s = {"I$0"})
/* loaded from: classes3.dex */
final class TextTranslation$showInterstitials$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ TextTranslation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextTranslation$showInterstitials$1(TextTranslation textTranslation, Continuation<? super TextTranslation$showInterstitials$1> continuation) {
        super(2, continuation);
        this.this$0 = textTranslation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextTranslation$showInterstitials$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextTranslation$showInterstitials$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int booleanValue;
        AlertDialog alertDialog;
        MainCoroutineDispatcher main;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("zh", " Waiting for ad to load...");
            this.label = 1;
            obj = TimeoutKt.withTimeoutOrNull(5000L, new TextTranslation$showInterstitials$1$adLoaded$1(null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                booleanValue = this.I$0;
                ResultKt.throwOnFailure(obj);
                alertDialog = this.this$0.loadingAdDialog;
                if (alertDialog != null) {
                    AdsExtensionKt.dismissLoadingDialog(alertDialog);
                }
                main = Dispatchers.getMain();
                z = booleanValue != 0;
                this.label = 3;
                if (BuildersKt.withContext(main, new AnonymousClass1(z, this.this$0, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        booleanValue = bool != null ? bool.booleanValue() : 0;
        if (booleanValue != 0) {
            this.I$0 = booleanValue;
            this.label = 2;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        alertDialog = this.this$0.loadingAdDialog;
        if (alertDialog != null) {
        }
        main = Dispatchers.getMain();
        if (booleanValue != 0) {
        }
        this.label = 3;
        if (BuildersKt.withContext(main, new AnonymousClass1(z, this.this$0, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TextTranslation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "dev.cct.translatorapp.ui.TextTranslation$showInterstitials$1$1", f = "TextTranslation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.cct.translatorapp.ui.TextTranslation$showInterstitials$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $adLoaded;
        int label;
        final /* synthetic */ TextTranslation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, TextTranslation textTranslation, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$adLoaded = z;
            this.this$0 = textTranslation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$adLoaded, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$adLoaded) {
                Log.d("zh", "onAdsDismiss: scanner inter ");
                TextTranslation textTranslation = this.this$0;
                String textInterstitialsAdmobId = ConstantParam.INSTANCE.getTextInterstitialsAdmobId();
                final TextTranslation textTranslation2 = this.this$0;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation.showInterstitials.1.1.1
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
                        AlertDialog alertDialog;
                        alertDialog = TextTranslation.this.loadingAdDialog;
                        if (alertDialog != null) {
                            AdsExtensionKt.dismissLoadingDialog(alertDialog);
                        }
                        ExtensionFunction.INSTANCE.openActivity(TextTranslation.this, HomeScreenActivity.class);
                    }
                };
                final TextTranslation textTranslation3 = this.this$0;
                AdsExtensionKt.checkAndShowInterstitial(textTranslation, (r17 & 1) != 0, textInterstitialsAdmobId, (r17 & 4) != 0 ? false : false, (r17 & 8) != 0 ? 0L : 0L, function0, (r17 & 32) != 0 ? null : new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation.showInterstitials.1.1.2
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
                        AlertDialog alertDialog;
                        alertDialog = TextTranslation.this.loadingAdDialog;
                        if (alertDialog != null) {
                            AdsExtensionKt.dismissLoadingDialog(alertDialog);
                        }
                        ExtensionFunction.INSTANCE.openActivity(TextTranslation.this, HomeScreenActivity.class);
                    }
                });
            } else {
                Log.d("zh", "Proceeding without ad due to timeout.");
                TextTranslation textTranslation4 = this.this$0;
                String textInterstitialsAdmobId2 = ConstantParam.INSTANCE.getTextInterstitialsAdmobId();
                final TextTranslation textTranslation5 = this.this$0;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation.showInterstitials.1.1.3
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
                        AlertDialog alertDialog;
                        alertDialog = TextTranslation.this.loadingAdDialog;
                        if (alertDialog != null) {
                            AdsExtensionKt.dismissLoadingDialog(alertDialog);
                        }
                        ExtensionFunction.INSTANCE.openActivity(TextTranslation.this, HomeScreenActivity.class);
                    }
                };
                final TextTranslation textTranslation6 = this.this$0;
                AdsExtensionKt.checkAndShowInterstitial(textTranslation4, (r17 & 1) != 0, textInterstitialsAdmobId2, (r17 & 4) != 0 ? false : false, (r17 & 8) != 0 ? 0L : 0L, function02, (r17 & 32) != 0 ? null : new Function0<Unit>() { // from class: dev.cct.translatorapp.ui.TextTranslation.showInterstitials.1.1.4
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
                        AlertDialog alertDialog;
                        alertDialog = TextTranslation.this.loadingAdDialog;
                        if (alertDialog != null) {
                            AdsExtensionKt.dismissLoadingDialog(alertDialog);
                        }
                        ExtensionFunction.INSTANCE.openActivity(TextTranslation.this, HomeScreenActivity.class);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }
}
