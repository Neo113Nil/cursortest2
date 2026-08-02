package com.squareup.cash.support.chat.backend.real;

import app.cash.api.ApiResult;
import app.cash.zipline.loader.LoaderJniKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.chat.backend.api.ChatSurvey;
import com.squareup.protos.cash.customersurveyor.app.AppService;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyRequest;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse$Result$AlreadySubmitted;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse$Result$Survey;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealChatSurveyService {
    public final Analytics analytics;
    public final AndroidNotificationManager notificationManager;
    public final AppService service;
    public final Flow signOut;
    public final BufferedChannel surveyResponses = PapaEvent.Channel$default(20, null, null, 6);

    public RealChatSurveyService(AppService appService, Analytics analytics, AndroidNotificationManager androidNotificationManager, CoroutineScope coroutineScope, Flow flow) {
        this.service = appService;
        this.analytics = analytics;
        this.notificationManager = androidNotificationManager;
        this.signOut = flow;
        JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1(this, (Continuation) null, 16), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSurvey(String str, ContinuationImpl continuationImpl) {
        RealChatSurveyService$getSurvey$1 realChatSurveyService$getSurvey$1;
        int i;
        ApiResult apiResult;
        GetSupportSurveyResponse.AlreadySubmitted alreadySubmitted;
        GetSupportSurveyResponse.Survey survey;
        GetSupportSurveyResponse.Survey.ReasonList reasonList;
        List list;
        GetSupportSurveyResponse.Survey.ReasonList reasonList2;
        List list2;
        GetSupportSurveyResponse.Survey.ReasonList reasonList3;
        List list3;
        GetSupportSurveyResponse.Survey.ReasonList reasonList4;
        List list4;
        GetSupportSurveyResponse.Survey.ReasonList reasonList5;
        List list5;
        GetSupportSurveyResponse.Survey.ReasonList reasonList6;
        String str2;
        GetSupportSurveyResponse.Survey.ReasonList reasonList7;
        String str3;
        GetSupportSurveyResponse.Survey.ReasonList reasonList8;
        String str4;
        GetSupportSurveyResponse.Survey.ReasonList reasonList9;
        String str5;
        GetSupportSurveyResponse.Survey.ReasonList reasonList10;
        String str6;
        if (continuationImpl instanceof RealChatSurveyService$getSurvey$1) {
            realChatSurveyService$getSurvey$1 = (RealChatSurveyService$getSurvey$1) continuationImpl;
            int i2 = realChatSurveyService$getSurvey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatSurveyService$getSurvey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatSurveyService$getSurvey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatSurveyService$getSurvey$1.label;
                ChatSurvey.Pending.SatisfactionQuestion satisfactionQuestion = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetSupportSurveyRequest getSupportSurveyRequest = new GetSupportSurveyRequest(str, ByteString.EMPTY);
                    realChatSurveyService$getSurvey$1.label = 1;
                    obj = this.service.getSupportSurvey(getSupportSurveyRequest, realChatSurveyService$getSurvey$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    LoaderJniKt loaderJniKt = ((GetSupportSurveyResponse) ((ApiResult.Success) apiResult).response).result;
                    if (loaderJniKt != null) {
                        GetSupportSurveyResponse$Result$AlreadySubmitted getSupportSurveyResponse$Result$AlreadySubmitted = loaderJniKt instanceof GetSupportSurveyResponse$Result$AlreadySubmitted ? (GetSupportSurveyResponse$Result$AlreadySubmitted) loaderJniKt : null;
                        if (getSupportSurveyResponse$Result$AlreadySubmitted != null) {
                            alreadySubmitted = getSupportSurveyResponse$Result$AlreadySubmitted.value;
                            if (alreadySubmitted == null) {
                                return ChatSurvey.Completed.INSTANCE;
                            }
                            if (loaderJniKt != null) {
                                GetSupportSurveyResponse$Result$Survey getSupportSurveyResponse$Result$Survey = loaderJniKt instanceof GetSupportSurveyResponse$Result$Survey ? (GetSupportSurveyResponse$Result$Survey) loaderJniKt : null;
                                if (getSupportSurveyResponse$Result$Survey != null) {
                                    survey = getSupportSurveyResponse$Result$Survey.value;
                                    if (survey != null) {
                                        GetSupportSurveyResponse$Result$Survey getSupportSurveyResponse$Result$Survey2 = loaderJniKt instanceof GetSupportSurveyResponse$Result$Survey ? (GetSupportSurveyResponse$Result$Survey) loaderJniKt : null;
                                        GetSupportSurveyResponse.Survey survey2 = getSupportSurveyResponse$Result$Survey2 != null ? getSupportSurveyResponse$Result$Survey2.value : null;
                                        survey2.getClass();
                                        GetSupportSurveyResponse.Survey.ResolutionQuestion resolutionQuestion = survey2.resolution_question;
                                        GetSupportSurveyResponse.Survey.RatingQuestion ratingQuestion = survey2.rating_question;
                                        ChatSurvey.Pending.ResolutionQuestion resolutionQuestion2 = new ChatSurvey.Pending.ResolutionQuestion(resolutionQuestion != null ? resolutionQuestion.title : null, resolutionQuestion != null ? resolutionQuestion.subtitle : null);
                                        String str7 = ratingQuestion != null ? ratingQuestion.title : null;
                                        MapBuilder mapBuilder = new MapBuilder();
                                        if (ratingQuestion != null && (reasonList10 = ratingQuestion.one_star_reasons) != null && (str6 = reasonList10.prompt) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList9 = ratingQuestion.two_star_reasons) != null && (str5 = reasonList9.prompt) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList8 = ratingQuestion.three_star_reasons) != null && (str4 = reasonList8.prompt) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList7 = ratingQuestion.four_star_reasons) != null && (str3 = reasonList7.prompt) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList6 = ratingQuestion.five_star_reasons) != null && (str2 = reasonList6.prompt) != null) {
                                            mapBuilder.put(5, str2);
                                        }
                                        MapBuilder build = mapBuilder.build();
                                        MapBuilder mapBuilder2 = new MapBuilder();
                                        if (ratingQuestion != null && (reasonList5 = ratingQuestion.one_star_reasons) != null && (list5 = reasonList5.reasons) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList4 = ratingQuestion.two_star_reasons) != null && (list4 = reasonList4.reasons) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList3 = ratingQuestion.three_star_reasons) != null && (list3 = reasonList3.reasons) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList2 = ratingQuestion.four_star_reasons) != null && (list2 = reasonList2.reasons) != null) {
                                        }
                                        if (ratingQuestion != null && (reasonList = ratingQuestion.five_star_reasons) != null && (list = reasonList.reasons) != null) {
                                            mapBuilder2.put(5, list);
                                        }
                                        ChatSurvey.Pending.RatingQuestion ratingQuestion2 = new ChatSurvey.Pending.RatingQuestion(str7, build, mapBuilder2.build());
                                        GetSupportSurveyResponse.Survey.SatisfactionQuestion satisfactionQuestion2 = survey2.satisfaction_question;
                                        if (satisfactionQuestion2 != null) {
                                            String str8 = satisfactionQuestion2.title;
                                            str8.getClass();
                                            satisfactionQuestion = new ChatSurvey.Pending.SatisfactionQuestion(str8);
                                        }
                                        return new ChatSurvey.Pending(resolutionQuestion2, ratingQuestion2, satisfactionQuestion);
                                    }
                                }
                            }
                            survey = null;
                            if (survey != null) {
                            }
                        }
                    }
                    alreadySubmitted = null;
                    if (alreadySubmitted == null) {
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return ChatSurvey.Unavailable.INSTANCE;
            }
        }
        realChatSurveyService$getSurvey$1 = new RealChatSurveyService$getSurvey$1(this, continuationImpl);
        Object obj2 = realChatSurveyService$getSurvey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatSurveyService$getSurvey$1.label;
        ChatSurvey.Pending.SatisfactionQuestion satisfactionQuestion3 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return ChatSurvey.Unavailable.INSTANCE;
    }
}
