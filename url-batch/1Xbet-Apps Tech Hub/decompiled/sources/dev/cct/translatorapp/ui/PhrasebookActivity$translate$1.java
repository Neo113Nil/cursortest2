package dev.cct.translatorapp.ui;

import android.util.Log;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.dataModel.PhrasebookModel;
import dev.cct.translatorapp.util.ApiService;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PhrasebookActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.PhrasebookActivity$translate$1", f = "PhrasebookActivity.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PhrasebookActivity$translate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $text;
    Object L$0;
    int label;
    final /* synthetic */ PhrasebookActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhrasebookActivity$translate$1(Ref.ObjectRef<String> objectRef, PhrasebookActivity phrasebookActivity, Continuation<? super PhrasebookActivity$translate$1> continuation) {
        super(2, continuation);
        this.$text = objectRef;
        this.this$0 = phrasebookActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PhrasebookActivity$translate$1(this.$text, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhrasebookActivity$translate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences preferences;
        PhrasebookActivity phrasebookActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Iterator<PhrasebookModel> it = ExtensionFunctionKt.getCategoryList().iterator();
                while (it.hasNext()) {
                    PhrasebookModel next = it.next();
                    Ref.ObjectRef<String> objectRef = this.$text;
                    objectRef.element = ((Object) objectRef.element) + next.getCategory() + "/";
                }
                PhrasebookActivity phrasebookActivity2 = this.this$0;
                ApiService apiService = new ApiService();
                String str = this.$text.element;
                ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
                preferences = this.this$0.pref;
                if (preferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pref");
                    preferences = null;
                }
                this.L$0 = phrasebookActivity2;
                this.label = 1;
                Object translateText = apiService.translateText(str, "en", translateLangList.get(preferences.getPhInputLang()).getLangCode(), this);
                if (translateText == coroutine_suspended) {
                    return coroutine_suspended;
                }
                phrasebookActivity = phrasebookActivity2;
                obj = translateText;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                phrasebookActivity = (PhrasebookActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            List split$default = StringsKt.split$default((CharSequence) obj, new String[]{"/"}, false, 0, 6, (Object) null);
            Intrinsics.checkNotNull(split$default, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            phrasebookActivity.setList((ArrayList) split$default);
            this.this$0.getList().remove(this.this$0.getList().size() - 1);
            this.this$0.getAdapter().setData(this.this$0.getList());
            this.this$0.getBinding().progressBar.setVisibility(4);
        } catch (Exception e) {
            Log.d("TAG", "translate: failed with exception=" + e);
        }
        return Unit.INSTANCE;
    }
}
