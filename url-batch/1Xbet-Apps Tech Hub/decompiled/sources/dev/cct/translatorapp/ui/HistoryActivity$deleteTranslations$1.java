package dev.cct.translatorapp.ui;

import android.app.Dialog;
import dev.cct.translatorapp.adapter.HistoryAdapter;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HistoryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.ui.HistoryActivity$deleteTranslations$1", f = "HistoryActivity.kt", i = {}, l = {234, 237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryActivity$deleteTranslations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dialog $delPressDialog;
    final /* synthetic */ ArrayList<HistoryModel> $toDelete;
    Object L$0;
    int label;
    final /* synthetic */ HistoryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryActivity$deleteTranslations$1(ArrayList<HistoryModel> arrayList, HistoryActivity historyActivity, Dialog dialog, Continuation<? super HistoryActivity$deleteTranslations$1> continuation) {
        super(2, continuation);
        this.$toDelete = arrayList;
        this.this$0 = historyActivity;
        this.$delPressDialog = dialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryActivity$deleteTranslations$1(this.$toDelete, this.this$0, this.$delPressDialog, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryActivity$deleteTranslations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HistoryActivity$deleteTranslations$1 historyActivity$deleteTranslations$1;
        Iterator<HistoryModel> it;
        HistoryViewModel historyViewModel;
        HistoryViewModel historyViewModel2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList<HistoryModel> arrayList = this.$toDelete;
            if (arrayList != null) {
                it = arrayList.iterator();
            } else {
                historyActivity$deleteTranslations$1 = this;
                HistoryActivity historyActivity = historyActivity$deleteTranslations$1.this$0;
                historyViewModel = historyActivity.getHistoryViewModel();
                List<HistoryModel> translations = historyViewModel.getTranslations();
                Intrinsics.checkNotNull(translations, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.HistoryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.HistoryModel> }");
                historyActivity.allHistory = (ArrayList) translations;
                historyActivity$deleteTranslations$1.L$0 = null;
                historyActivity$deleteTranslations$1.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(historyActivity$deleteTranslations$1.this$0, historyActivity$deleteTranslations$1.$delPressDialog, null), historyActivity$deleteTranslations$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            it = (Iterator) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        historyActivity$deleteTranslations$1 = this;
        while (it.hasNext()) {
            HistoryModel i2 = it.next();
            historyViewModel2 = historyActivity$deleteTranslations$1.this$0.getHistoryViewModel();
            Intrinsics.checkNotNullExpressionValue(i2, "i");
            historyActivity$deleteTranslations$1.L$0 = it;
            historyActivity$deleteTranslations$1.label = 1;
            if (historyViewModel2.deleteTranslation(i2, historyActivity$deleteTranslations$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        HistoryActivity historyActivity2 = historyActivity$deleteTranslations$1.this$0;
        historyViewModel = historyActivity2.getHistoryViewModel();
        List<HistoryModel> translations2 = historyViewModel.getTranslations();
        Intrinsics.checkNotNull(translations2, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.HistoryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.HistoryModel> }");
        historyActivity2.allHistory = (ArrayList) translations2;
        historyActivity$deleteTranslations$1.L$0 = null;
        historyActivity$deleteTranslations$1.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(historyActivity$deleteTranslations$1.this$0, historyActivity$deleteTranslations$1.$delPressDialog, null), historyActivity$deleteTranslations$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HistoryActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "dev.cct.translatorapp.ui.HistoryActivity$deleteTranslations$1$1", f = "HistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: dev.cct.translatorapp.ui.HistoryActivity$deleteTranslations$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Dialog $delPressDialog;
        int label;
        final /* synthetic */ HistoryActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HistoryActivity historyActivity, Dialog dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = historyActivity;
            this.$delPressDialog = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$delPressDialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HistoryAdapter historyAdapter;
            ArrayList arrayList;
            ArrayList arrayList2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                historyAdapter = this.this$0.adapter;
                if (historyAdapter != null) {
                    arrayList2 = this.this$0.allHistory;
                    historyAdapter.loadAdapter(arrayList2);
                }
                this.$delPressDialog.dismiss();
                this.this$0.getBinding().deleteBtn.setVisibility(8);
                this.this$0.getBinding().selectAllLayout.setVisibility(8);
                arrayList = this.this$0.allHistory;
                if (arrayList.isEmpty()) {
                    this.this$0.getBinding().deleteHistoryIcon.setVisibility(4);
                    this.this$0.getBinding().noHistoryLayout.setVisibility(0);
                } else {
                    this.this$0.getBinding().deleteHistoryIcon.setVisibility(0);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
