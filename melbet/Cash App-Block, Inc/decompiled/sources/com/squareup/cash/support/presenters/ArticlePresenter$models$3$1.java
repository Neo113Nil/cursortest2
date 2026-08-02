package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ArticlePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $incidentsState$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ArticlePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticlePresenter$models$3$1(ArticlePresenter articlePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = articlePresenter;
        this.$incidentsState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$incidentsState$delegate;
        ArticlePresenter articlePresenter = this.this$0;
        switch (i) {
            case 0:
                return new ArticlePresenter$models$3$1(articlePresenter, mutableState, continuation, 0);
            default:
                return new ArticlePresenter$models$3$1(articlePresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ArticlePresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        if (r12 == r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        if (r12 == r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r12 == null) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        MutableState mutableState = this.$incidentsState$delegate;
        ArticlePresenter articlePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                    if (((ArticlePresenter.IncidentsState) mutableState.getValue()) != ArticlePresenter.IncidentsState.VIEWED) {
                        ArticlePresenter.IncidentsState incidentsState = (ArticlePresenter.IncidentsState) mutableState.getValue();
                        ArticlePresenter.IncidentsState incidentsState2 = ArticlePresenter.IncidentsState.NOT_APPLICABLE;
                        if (incidentsState != incidentsState2) {
                            if (articlePresenter.args.showIncidents) {
                                RealIncidentsService realIncidentsService = articlePresenter.incidentsService;
                                this.label = 1;
                                obj = realIncidentsService.getOpenIncidents(this);
                                if (obj == coroutineSingletons) {
                                    break;
                                }
                            } else {
                                mutableState.setValue(incidentsState2);
                                break;
                            }
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    if (ArticlePresenter.ONGOING_INCIDENT_TYPES.contains(((Incident) obj3).status)) {
                        arrayList.add(obj3);
                    }
                }
                ArticlePresenter.IncidentsState incidentsState3 = !arrayList.isEmpty() ? ArticlePresenter.IncidentsState.LOADED : ArticlePresenter.IncidentsState.NOT_APPLICABLE;
                List list2 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                mutableState.setValue(incidentsState3);
                break;
            default:
                String str = articlePresenter.articleToken;
                RealArticlesService realArticlesService = articlePresenter.articlesService;
                SupportScreens.FlowScreens.ArticleScreen articleScreen = articlePresenter.args;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            obj2 = (ArticlesService$ArticleResult) obj;
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        obj2 = (ArticlesService$ArticleResult) obj;
                        if ((obj2 instanceof ArticlesService$ArticleResult.Failure) || ((ArticlesService$ArticleResult.Failure) obj2).isRetryable || !articleScreen.fallBackToSupportHome) {
                            List list3 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                            mutableState.setValue(obj2);
                        } else {
                            articlePresenter.navigator.goTo(new SupportScreens.FlowScreens.SupportHomeScreen(str, articleScreen.data, null, 60));
                        }
                        break;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    SupportScreens.FlowScreens.SupportArticleConfig supportArticleConfig = articlePresenter.config;
                    if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) {
                        String str2 = articleScreen.data.flowToken;
                        String str3 = ((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) supportArticleConfig).articleToken;
                        this.label = 1;
                        obj = realArticlesService.getArticle(str2, str3, this);
                        break;
                    } else {
                        String str4 = articlePresenter.entityId;
                        if (str4 != null) {
                            String str5 = articleScreen.data.flowToken;
                            this.label = 2;
                            obj = realArticlesService.getArticleForTransaction(str5, str4, str, this);
                            break;
                        }
                        obj2 = new ArticlesService$ArticleResult.Failure(false);
                        if (obj2 instanceof ArticlesService$ArticleResult.Failure) {
                        }
                        List list32 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                        mutableState.setValue(obj2);
                    }
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
