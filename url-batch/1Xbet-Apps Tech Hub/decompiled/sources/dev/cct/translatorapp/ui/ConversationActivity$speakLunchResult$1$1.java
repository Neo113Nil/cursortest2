package dev.cct.translatorapp.ui;

import android.util.Log;
import com.google.android.material.internal.ViewUtils;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.dataModel.ConversationModel;
import dev.cct.translatorapp.util.ApiService;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: ConversationActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$speakLunchResult$1$1", f = "ConversationActivity.kt", i = {0, 0, 0, 0}, l = {469}, m = "invokeSuspend", n = {"iLang", "oLang", "iLangInput", "oLangOutput"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class ConversationActivity$speakLunchResult$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $speakText;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ConversationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationActivity$speakLunchResult$1$1(ConversationActivity conversationActivity, String str, Continuation<? super ConversationActivity$speakLunchResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationActivity;
        this.$speakText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationActivity$speakLunchResult$1$1(this.this$0, this.$speakText, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationActivity$speakLunchResult$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Preferences preferences;
        String langCode;
        String str2;
        Preferences preferences2;
        String langCode2;
        String str3;
        Preferences preferences3;
        int langName;
        String str4;
        Preferences preferences4;
        int langName2;
        Object translateText;
        String str5;
        int i;
        String str6;
        int i2;
        Preferences preferences5;
        Preferences preferences6;
        Preferences preferences7;
        Preferences preferences8;
        HistoryViewModel historyViewModel;
        String str7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            str = this.this$0.itemType;
            Preferences preferences9 = null;
            if (Intrinsics.areEqual(str, "first_voice")) {
                ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
                preferences8 = this.this$0.pref;
                if (preferences8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences8 = null;
                }
                langCode = translateLangList.get(preferences8.getConInputLang()).getLangCode();
            } else {
                ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
                preferences = this.this$0.pref;
                if (preferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences = null;
                }
                langCode = translateLangList2.get(preferences.getConOutputLang()).getLangCode();
            }
            str2 = this.this$0.itemType;
            if (Intrinsics.areEqual(str2, "first_voice")) {
                ArrayList<LanguageListModel> translateLangList3 = ExtensionFunctionKt.getTranslateLangList();
                preferences7 = this.this$0.pref;
                if (preferences7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences7 = null;
                }
                langCode2 = translateLangList3.get(preferences7.getConOutputLang()).getLangCode();
            } else {
                ArrayList<LanguageListModel> translateLangList4 = ExtensionFunctionKt.getTranslateLangList();
                preferences2 = this.this$0.pref;
                if (preferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences2 = null;
                }
                langCode2 = translateLangList4.get(preferences2.getConInputLang()).getLangCode();
            }
            str3 = this.this$0.itemType;
            if (Intrinsics.areEqual(str3, "first_voice")) {
                ArrayList<LanguageListModel> translateLangList5 = ExtensionFunctionKt.getTranslateLangList();
                preferences6 = this.this$0.pref;
                if (preferences6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences6 = null;
                }
                langName = translateLangList5.get(preferences6.getConInputLang()).getLangName();
            } else {
                ArrayList<LanguageListModel> translateLangList6 = ExtensionFunctionKt.getTranslateLangList();
                preferences3 = this.this$0.pref;
                if (preferences3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences3 = null;
                }
                langName = translateLangList6.get(preferences3.getConOutputLang()).getLangName();
            }
            str4 = this.this$0.itemType;
            if (Intrinsics.areEqual(str4, "first_voice")) {
                ArrayList<LanguageListModel> translateLangList7 = ExtensionFunctionKt.getTranslateLangList();
                preferences5 = this.this$0.pref;
                if (preferences5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                } else {
                    preferences9 = preferences5;
                }
                langName2 = translateLangList7.get(preferences9.getConOutputLang()).getLangName();
            } else {
                ArrayList<LanguageListModel> translateLangList8 = ExtensionFunctionKt.getTranslateLangList();
                preferences4 = this.this$0.pref;
                if (preferences4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                } else {
                    preferences9 = preferences4;
                }
                langName2 = translateLangList8.get(preferences9.getConInputLang()).getLangName();
            }
            ApiService apiService = new ApiService();
            String speakText = this.$speakText;
            Intrinsics.checkNotNullExpressionValue(speakText, "speakText");
            this.L$0 = langCode;
            this.L$1 = langCode2;
            this.I$0 = langName;
            this.I$1 = langName2;
            this.label = 1;
            translateText = apiService.translateText(speakText, langCode, langCode2, this);
            if (translateText == coroutine_suspended) {
                return coroutine_suspended;
            }
            str5 = langCode;
            i = langName2;
            str6 = langCode2;
            i2 = langName;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            i2 = this.I$0;
            String str8 = (String) this.L$1;
            String str9 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str6 = str8;
            str5 = str9;
            translateText = obj;
        }
        String str10 = (String) translateText;
        historyViewModel = this.this$0.getHistoryViewModel();
        String speakText2 = this.$speakText;
        Intrinsics.checkNotNullExpressionValue(speakText2, "speakText");
        String string = this.this$0.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(iLangInput)");
        String string2 = this.this$0.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(oLangOutput)");
        str7 = this.this$0.itemType;
        Job insertConversation = historyViewModel.insertConversation(new ConversationModel(0, speakText2, str10, string, string2, str7, str5, str6, false, false, ViewUtils.EDGE_TO_EDGE_FLAGS, null));
        final ConversationActivity conversationActivity = this.this$0;
        insertConversation.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: dev.cct.translatorapp.ui.ConversationActivity$speakLunchResult$1$1.1
            {
                super(1);
            }

            /* compiled from: ConversationActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$speakLunchResult$1$1$1$1", f = "ConversationActivity.kt", i = {}, l = {491}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: dev.cct.translatorapp.ui.ConversationActivity$speakLunchResult$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ ConversationActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01221(ConversationActivity conversationActivity, Continuation<? super C01221> continuation) {
                    super(2, continuation);
                    this.this$0 = conversationActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01221(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    HistoryViewModel historyViewModel;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        historyViewModel = this.this$0.getHistoryViewModel();
                        ConversationModel lastConversation = historyViewModel.getLastConversation();
                        this.label = 1;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new C01231(this.this$0, lastConversation, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: ConversationActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "dev.cct.translatorapp.ui.ConversationActivity$speakLunchResult$1$1$1$1$1", f = "ConversationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: dev.cct.translatorapp.ui.ConversationActivity$speakLunchResult$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ ConversationModel $lastConversation;
                    int label;
                    final /* synthetic */ ConversationActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01231(ConversationActivity conversationActivity, ConversationModel conversationModel, Continuation<? super C01231> continuation) {
                        super(2, continuation);
                        this.this$0 = conversationActivity;
                        this.$lastConversation = conversationModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01231(this.this$0, this.$lastConversation, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        boolean z;
                        boolean z2;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getBinding().conversation.setVisibility(4);
                        z = this.this$0.isSelectedAllOn;
                        Log.e("delete", "djksjfskd " + z + ": ");
                        z2 = this.this$0.isSelectedAllOn;
                        if (z2) {
                            this.this$0.getBinding().deleteIcon.setVisibility(4);
                        } else {
                            this.this$0.getBinding().deleteIcon.setVisibility(4);
                        }
                        this.this$0.getAdapter().hideCheckBox();
                        this.this$0.getBinding().deleteBtn.setVisibility(8);
                        this.this$0.getBinding().selectAllLayout.setVisibility(8);
                        this.this$0.getBinding().deleteIcon.setVisibility(4);
                        this.this$0.isSelectedAllOn = false;
                        this.this$0.isAllDeleteConv = false;
                        this.this$0.getBinding().inputText.setText(this.$lastConversation.getInput());
                        this.this$0.getBinding().outputText.setText(this.$lastConversation.getOutput());
                        this.this$0.getBinding().inputLang.setText(this.$lastConversation.getInputLang());
                        this.this$0.getBinding().outputLang.setText(this.$lastConversation.getOutputLang());
                        this.this$0.getBinding().crossIcon.setVisibility(0);
                        this.this$0.getBinding().scrollableConversation.setVisibility(0);
                        this.this$0.getBinding().emptyDataImg.setVisibility(8);
                        this.this$0.getBinding().tapToSpeakText.setVisibility(8);
                        this.this$0.getAdapter().addData(this.$lastConversation);
                        this.this$0.loadAdapter();
                        if (ExtensionFunction.INSTANCE.checkInternetConnection(this.this$0)) {
                            this.this$0.showInterAd();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C01221(ConversationActivity.this, null), 3, null);
            }
        });
        return Unit.INSTANCE;
    }
}
