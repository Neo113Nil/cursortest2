package com.squareup.cash.treehouse.discover;

import app.cash.redwood.treehouse.AndroidTreehouseDispatchers;
import app.cash.redwood.treehouse.RealTreehouseApp;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HostDiscoverDataBridge {
    public final RealTreehouseApp treehouseApp;

    public HostDiscoverDataBridge(RealTreehouseApp realTreehouseApp) {
        realTreehouseApp.getClass();
        this.treehouseApp = realTreehouseApp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r10, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDetailsPage(String str, ContinuationImpl continuationImpl) {
        HostDiscoverDataBridge$getDetailsPage$1 hostDiscoverDataBridge$getDetailsPage$1;
        int i;
        if (continuationImpl instanceof HostDiscoverDataBridge$getDetailsPage$1) {
            hostDiscoverDataBridge$getDetailsPage$1 = (HostDiscoverDataBridge$getDetailsPage$1) continuationImpl;
            int i2 = hostDiscoverDataBridge$getDetailsPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                hostDiscoverDataBridge$getDetailsPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = hostDiscoverDataBridge$getDetailsPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hostDiscoverDataBridge$getDetailsPage$1.label;
                RealTreehouseApp realTreehouseApp = this.treehouseApp;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidTreehouseDispatchers androidTreehouseDispatchers = realTreehouseApp.dispatchers;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    ChatInputView$Content$1$1$1 chatInputView$Content$1$1$1 = new ChatInputView$Content$1$1$1(this, continuation, 28);
                    hostDiscoverDataBridge$getDetailsPage$1.L$0 = str;
                    hostDiscoverDataBridge$getDetailsPage$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = hostDiscoverDataBridge$getDetailsPage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = realTreehouseApp.dispatchers.zipline;
                TaxWebAppBridge.AnonymousClass3 anonymousClass3 = new TaxWebAppBridge.AnonymousClass3(this, str, continuation, 20);
                hostDiscoverDataBridge$getDetailsPage$1.L$0 = null;
                hostDiscoverDataBridge$getDetailsPage$1.label = 2;
                Object withContext = JobKt.withContext(executorCoroutineDispatcherImpl, anonymousClass3, hostDiscoverDataBridge$getDetailsPage$1);
                return withContext != coroutineSingletons ? coroutineSingletons : withContext;
            }
        }
        hostDiscoverDataBridge$getDetailsPage$1 = new HostDiscoverDataBridge$getDetailsPage$1(this, continuationImpl);
        Object obj2 = hostDiscoverDataBridge$getDetailsPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hostDiscoverDataBridge$getDetailsPage$1.label;
        RealTreehouseApp realTreehouseApp2 = this.treehouseApp;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl2 = realTreehouseApp2.dispatchers.zipline;
        TaxWebAppBridge.AnonymousClass3 anonymousClass32 = new TaxWebAppBridge.AnonymousClass3(this, str, continuation2, 20);
        hostDiscoverDataBridge$getDetailsPage$1.L$0 = null;
        hostDiscoverDataBridge$getDetailsPage$1.label = 2;
        Object withContext2 = JobKt.withContext(executorCoroutineDispatcherImpl2, anonymousClass32, hostDiscoverDataBridge$getDetailsPage$1);
        if (withContext2 != coroutineSingletons2) {
        }
    }
}
