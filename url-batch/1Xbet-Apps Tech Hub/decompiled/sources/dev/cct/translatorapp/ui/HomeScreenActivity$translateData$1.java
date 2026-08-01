package dev.cct.translatorapp.ui;

import android.widget.TextView;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.util.ApiService;
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

/* compiled from: HomeScreenActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$translateData$1", f = "HomeScreenActivity.kt", i = {}, l = {646}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeScreenActivity$translateData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeScreenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenActivity$translateData$1(HomeScreenActivity homeScreenActivity, Continuation<? super HomeScreenActivity$translateData$1> continuation) {
        super(2, continuation);
        this.this$0 = homeScreenActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenActivity$translateData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenActivity$translateData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences preferences;
        Preferences preferences2;
        Object translateText;
        TextView textView;
        HistoryViewModel historyViewModel;
        Preferences preferences3;
        Preferences preferences4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        Preferences preferences5 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TextView textView2 = this.this$0.getBinding().outputText;
            ApiService apiService = new ApiService();
            String obj2 = this.this$0.getBinding().editText.getText().toString();
            ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
            preferences = this.this$0.pref;
            if (preferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
                preferences = null;
            }
            String langCode = translateLangList.get(preferences.getTranslateInput()).getLangCode();
            ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
            preferences2 = this.this$0.pref;
            if (preferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
                preferences2 = null;
            }
            this.L$0 = textView2;
            this.label = 1;
            translateText = apiService.translateText(obj2, langCode, translateLangList2.get(preferences2.getTranslateOutput()).getLangCode(), this);
            if (translateText == coroutine_suspended) {
                return coroutine_suspended;
            }
            textView = textView2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textView = (TextView) this.L$0;
            ResultKt.throwOnFailure(obj);
            translateText = obj;
        }
        textView.setText((CharSequence) translateText);
        historyViewModel = this.this$0.getHistoryViewModel();
        ArrayList<LanguageListModel> translateLangList3 = ExtensionFunctionKt.getTranslateLangList();
        preferences3 = this.this$0.pref;
        if (preferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            preferences3 = null;
        }
        String langCode2 = translateLangList3.get(preferences3.getTranslateInput()).getLangCode();
        ArrayList<LanguageListModel> translateLangList4 = ExtensionFunctionKt.getTranslateLangList();
        preferences4 = this.this$0.pref;
        if (preferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
        } else {
            preferences5 = preferences4;
        }
        String langCode3 = translateLangList4.get(preferences5.getTranslateOutput()).getLangCode();
        String obj3 = this.this$0.getBinding().editText.getText().toString();
        CharSequence text = this.this$0.getBinding().outputText.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        Job insert = historyViewModel.insert(new HistoryModel(0, langCode2, langCode3, obj3, (String) text, false, false, 64, null));
        final HomeScreenActivity homeScreenActivity = this.this$0;
        insert.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: dev.cct.translatorapp.ui.HomeScreenActivity$translateData$1.1
            {
                super(1);
            }

            /* compiled from: HomeScreenActivity.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$translateData$1$1$1", f = "HomeScreenActivity.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: dev.cct.translatorapp.ui.HomeScreenActivity$translateData$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ HomeScreenActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01251(HomeScreenActivity homeScreenActivity, Continuation<? super C01251> continuation) {
                    super(2, continuation);
                    this.this$0 = homeScreenActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01251(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    HistoryViewModel historyViewModel;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        historyViewModel = this.this$0.getHistoryViewModel();
                        HistoryModel lastTranslation = historyViewModel.getLastTranslation();
                        this.label = 1;
                        if (BuildersKt.withContext(Dispatchers.getMain(), new C01261(this.this$0, lastTranslation, null), this) == coroutine_suspended) {
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

                /* compiled from: HomeScreenActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "dev.cct.translatorapp.ui.HomeScreenActivity$translateData$1$1$1$1", f = "HomeScreenActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: dev.cct.translatorapp.ui.HomeScreenActivity$translateData$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ HistoryModel $result;
                    int label;
                    final /* synthetic */ HomeScreenActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01261(HomeScreenActivity homeScreenActivity, HistoryModel historyModel, Continuation<? super C01261> continuation) {
                        super(2, continuation);
                        this.this$0 = homeScreenActivity;
                        this.$result = historyModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01261(this.this$0, this.$result, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getAdapter().addData(this.$result);
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
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C01251(HomeScreenActivity.this, null), 3, null);
            }
        });
        return Unit.INSTANCE;
    }
}
