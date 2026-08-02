package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewContactOptions;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.Article;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ArticlePresenter$models$9$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $loadedArticle$delegate;
    public final /* synthetic */ MutableState $phoneStatus$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArticlePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlePresenter$models$9$1(ArticlePresenter articlePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = articlePresenter;
        this.$loadedArticle$delegate = mutableState;
        this.$phoneStatus$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ArticlePresenter$models$9$1(this.this$0, this.$loadedArticle$delegate, this.$phoneStatus$delegate, continuation, 0);
            default:
                return new ArticlePresenter$models$9$1(this.this$0, this.$loadedArticle$delegate, this.$phoneStatus$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ArticlePresenter$models$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ArticlePresenter articlePresenter = this.this$0;
        MutableState mutableState = this.$loadedArticle$delegate;
        MutableState mutableState2 = this.$phoneStatus$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                if (((Article) mutableState.getValue()) != null) {
                    Article article = (Article) mutableState.getValue();
                    SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) mutableState2.getValue();
                    articlePresenter.analytics.track(new CustomerSupportAccessViewContactOptions(articlePresenter.args.data.flowToken, articlePresenter.articleToken, null, CustomerSupportAccessViewContactOptions.Trigger.NODE, article != null ? ArticlePresenter.contactOptionVisibility(article, Article.ContactOption.CHAT, supportPhoneStatus) : null, article != null ? ArticlePresenter.contactOptionVisibility(article, Article.ContactOption.PHONE, supportPhoneStatus) : null, article != null ? ArticlePresenter.contactOptionVisibility(article, Article.ContactOption.EMAIL, supportPhoneStatus) : null), null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list2 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                if (!((Boolean) mutableState.getValue()).booleanValue() && !((Boolean) mutableState2.getValue()).booleanValue()) {
                    articlePresenter.observabilityManager.addTiming("finish_loading");
                    mutableState2.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
