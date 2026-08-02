package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.backend.api.articles.ArticlesService$AllArticlesResult;
import com.squareup.cash.support.backend.real.RealSupportHomeService;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.support.screens.SupportScreens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportHomePresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $articlesResult$delegate;
    public final /* synthetic */ int $r8$classId;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ SupportHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SupportHomePresenter$models$5$1(SupportHomePresenter supportHomePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = supportHomePresenter;
        this.$articlesResult$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$articlesResult$delegate;
        SupportHomePresenter supportHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new SupportHomePresenter$models$5$1(supportHomePresenter, mutableState, continuation, 0);
            default:
                return new SupportHomePresenter$models$5$1(supportHomePresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SupportHomePresenter$models$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SupportHomePresenter supportHomePresenter = this.this$0;
        MutableState mutableState = this.$articlesResult$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((ArticlesService$AllArticlesResult) mutableState.getValue()) == null) {
                        RealSupportHomeService realSupportHomeService = supportHomePresenter.supportHomeService;
                        SupportScreens.FlowScreens.Data data = supportHomePresenter.args.data;
                        String str = data.flowToken;
                        String str2 = data.paymentToken;
                        this.L$0 = mutableState;
                        this.label = 1;
                        obj = realSupportHomeService.getArticles(str, str2, this);
                        if (obj == coroutineSingletons) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((ArticlesService$AllArticlesResult) obj);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSupportHomeService realSupportHomeService2 = supportHomePresenter.supportHomeService;
                    String str3 = supportHomePresenter.args.data.flowToken;
                    this.L$0 = mutableState;
                    this.label = 1;
                    obj = realSupportHomeService2.getChatStatus(str3, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((ChatStatus) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
