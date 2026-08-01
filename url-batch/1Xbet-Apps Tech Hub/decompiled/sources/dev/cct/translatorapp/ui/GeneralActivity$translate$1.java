package dev.cct.translatorapp.ui;

import android.widget.Toast;
import dev.cct.translatorapp.adapter.GeneralAdapter;
import dev.cct.translatorapp.util.ApiService;
import java.util.ArrayList;
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
import org.json.JSONArray;

/* compiled from: GeneralActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.GeneralActivity$translate$1", f = "GeneralActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GeneralActivity$translate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GeneralAdapter $adapter;
    final /* synthetic */ JSONArray $phList;
    final /* synthetic */ Ref.ObjectRef<String> $text;
    Object L$0;
    int label;
    final /* synthetic */ GeneralActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeneralActivity$translate$1(JSONArray jSONArray, Ref.ObjectRef<String> objectRef, GeneralActivity generalActivity, GeneralAdapter generalAdapter, Continuation<? super GeneralActivity$translate$1> continuation) {
        super(2, continuation);
        this.$phList = jSONArray;
        this.$text = objectRef;
        this.this$0 = generalActivity;
        this.$adapter = generalAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GeneralActivity$translate$1(this.$phList, this.$text, this.this$0, this.$adapter, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GeneralActivity$translate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        GeneralActivity generalActivity;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception unused) {
            Toast.makeText(this.this$0, "No Internet Connection", 0).show();
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int length = this.$phList.length();
            for (int i2 = 0; i2 < length; i2++) {
                Ref.ObjectRef<String> objectRef = this.$text;
                String str2 = objectRef.element;
                Object obj2 = this.$phList.get(i2);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                objectRef.element = ((Object) str2) + ((String) obj2) + "/";
            }
            GeneralActivity generalActivity2 = this.this$0;
            str = generalActivity2.iLang;
            if (str == null) {
                generalActivity = generalActivity2;
                list = null;
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                generalActivity.setList((ArrayList) list);
                this.this$0.getList().remove(this.this$0.getList().size() - 1);
                this.$adapter.setData(this.this$0.getList());
                this.this$0.getBinding().progressBar.setVisibility(4);
                return Unit.INSTANCE;
            }
            Ref.ObjectRef<String> objectRef2 = this.$text;
            ApiService apiService = new ApiService();
            String str3 = objectRef2.element;
            this.L$0 = generalActivity2;
            this.label = 1;
            Object translateText = apiService.translateText(str3, "en", str, this);
            if (translateText == coroutine_suspended) {
                return coroutine_suspended;
            }
            generalActivity = generalActivity2;
            obj = translateText;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            generalActivity = (GeneralActivity) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        list = StringsKt.split$default((CharSequence) obj, new String[]{"/"}, false, 0, 6, (Object) null);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        generalActivity.setList((ArrayList) list);
        this.this$0.getList().remove(this.this$0.getList().size() - 1);
        this.$adapter.setData(this.this$0.getList());
        this.this$0.getBinding().progressBar.setVisibility(4);
        return Unit.INSTANCE;
    }
}
