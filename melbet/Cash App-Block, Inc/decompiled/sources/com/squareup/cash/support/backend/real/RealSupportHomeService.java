package com.squareup.cash.support.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.backend.api.articles.ArticlesService$AllArticlesResult;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealSupportHomeService {
    public final RealArticlesService articlesService;
    public final RealChatManager chatManager;
    public final LinkedHashMap articlesCache = new LinkedHashMap();
    public final LinkedHashMap chatStatusCache = new LinkedHashMap();

    public RealSupportHomeService(RealArticlesService realArticlesService, RealChatManager realChatManager) {
        this.articlesService = realArticlesService;
        this.chatManager = realChatManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getArticles(String str, String str2, ContinuationImpl continuationImpl) {
        RealSupportHomeService$getArticles$1 realSupportHomeService$getArticles$1;
        int i;
        ArticlesService$AllArticlesResult articlesService$AllArticlesResult;
        if (continuationImpl instanceof RealSupportHomeService$getArticles$1) {
            realSupportHomeService$getArticles$1 = (RealSupportHomeService$getArticles$1) continuationImpl;
            int i2 = realSupportHomeService$getArticles$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportHomeService$getArticles$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportHomeService$getArticles$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportHomeService$getArticles$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realSupportHomeService$getArticles$1.L$0 = str;
                    realSupportHomeService$getArticles$1.label = 1;
                    obj = JobKt.coroutineScope(new NotificationActionService$onHandleIntent$1(this.articlesService, str, str2, (Continuation) null), realSupportHomeService$getArticles$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realSupportHomeService$getArticles$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                articlesService$AllArticlesResult = (ArticlesService$AllArticlesResult) obj;
                if (articlesService$AllArticlesResult instanceof ArticlesService$AllArticlesResult.Success) {
                    LinkedHashMap linkedHashMap = this.articlesCache;
                    linkedHashMap.clear();
                    linkedHashMap.put(str, articlesService$AllArticlesResult);
                }
                return articlesService$AllArticlesResult;
            }
        }
        realSupportHomeService$getArticles$1 = new RealSupportHomeService$getArticles$1(this, continuationImpl);
        Object obj2 = realSupportHomeService$getArticles$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportHomeService$getArticles$1.label;
        if (i != 0) {
        }
        articlesService$AllArticlesResult = (ArticlesService$AllArticlesResult) obj2;
        if (articlesService$AllArticlesResult instanceof ArticlesService$AllArticlesResult.Success) {
        }
        return articlesService$AllArticlesResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatStatus(String str, ContinuationImpl continuationImpl) {
        RealSupportHomeService$getChatStatus$1 realSupportHomeService$getChatStatus$1;
        int i;
        if (continuationImpl instanceof RealSupportHomeService$getChatStatus$1) {
            realSupportHomeService$getChatStatus$1 = (RealSupportHomeService$getChatStatus$1) continuationImpl;
            int i2 = realSupportHomeService$getChatStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportHomeService$getChatStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportHomeService$getChatStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportHomeService$getChatStatus$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realSupportHomeService$getChatStatus$1.L$0 = str;
                    realSupportHomeService$getChatStatus$1.label = 1;
                    obj = this.chatManager.getChatStatus(realSupportHomeService$getChatStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realSupportHomeService$getChatStatus$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ChatStatus chatStatus = (ChatStatus) obj;
                LinkedHashMap linkedHashMap = this.chatStatusCache;
                linkedHashMap.clear();
                linkedHashMap.put(str, chatStatus);
                return chatStatus;
            }
        }
        realSupportHomeService$getChatStatus$1 = new RealSupportHomeService$getChatStatus$1(this, continuationImpl);
        Object obj2 = realSupportHomeService$getChatStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportHomeService$getChatStatus$1.label;
        if (i != 0) {
        }
        ChatStatus chatStatus2 = (ChatStatus) obj2;
        LinkedHashMap linkedHashMap2 = this.chatStatusCache;
        linkedHashMap2.clear();
        linkedHashMap2.put(str, chatStatus2);
        return chatStatus2;
    }
}
