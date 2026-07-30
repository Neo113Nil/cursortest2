package com.chicken.road.cerman.fixs.roost;

import android.app.Application;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.chicken.road.cerman.fixs.Routes;
import com.chicken.road.cerman.fixs.roost.RoostRoute;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RoostGate.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostGate;", "", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", Routes.FEED, "Lcom/chicken/road/cerman/fixs/roost/RoostFeed;", "client", "Lcom/chicken/road/cerman/fixs/roost/RoostClient;", "trace", "Lcom/chicken/road/cerman/fixs/roost/RoostTrace;", "referrer", "Lcom/chicken/road/cerman/fixs/roost/RoostReferrer;", "store", "Lcom/chicken/road/cerman/fixs/roost/RoostStore;", "decide", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "route", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute$Page;", ImagesContract.URL, "", "settle", "", "started", "", "minMs", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostGate {
    private final Application app;
    private final RoostClient client;
    private final RoostFeed feed;
    private final RoostReferrer referrer;
    private final RoostStore store;
    private final RoostTrace trace;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public RoostGate(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
        this.feed = new RoostFeed();
        this.client = new RoostClient(app, null, 2, 0 == true ? 1 : 0);
        this.trace = new RoostTrace(app);
        this.referrer = new RoostReferrer(app);
        this.store = new RoostStore(app);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m6819constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decide(Continuation<? super RoostRoute> continuation) {
        RoostGate$decide$1 roostGate$decide$1;
        int i;
        if (continuation instanceof RoostGate$decide$1) {
            roostGate$decide$1 = (RoostGate$decide$1) continuation;
            if ((roostGate$decide$1.label & Integer.MIN_VALUE) != 0) {
                roostGate$decide$1.label -= Integer.MIN_VALUE;
                Object obj = roostGate$decide$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roostGate$decide$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    RoostGate roostGate = this;
                    roostGate$decide$1.label = 1;
                    obj = resolve(roostGate$decide$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Object m6819constructorimpl = Result.m6819constructorimpl((RoostRoute) obj);
                return !Result.m6825isFailureimpl(m6819constructorimpl) ? RoostRoute.Home.INSTANCE : m6819constructorimpl;
            }
        }
        roostGate$decide$1 = new RoostGate$decide$1(this, continuation);
        Object obj2 = roostGate$decide$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roostGate$decide$1.label;
        if (i != 0) {
        }
        Object m6819constructorimpl2 = Result.m6819constructorimpl((RoostRoute) obj2);
        if (!Result.m6825isFailureimpl(m6819constructorimpl2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolve(Continuation<? super RoostRoute> continuation) {
        RoostGate$resolve$1 roostGate$resolve$1;
        long currentTimeMillis;
        RoostGate roostGate;
        Object first;
        long j;
        RoostConfig roostConfig;
        RoostGate roostGate2;
        RoostConfig roostConfig2;
        long j2;
        String str;
        String str2;
        Object read;
        RoostGate roostGate3;
        TraceIds traceIds;
        RoostConfig roostConfig3;
        String str3;
        RoostGate roostGate4;
        long j3;
        String str4;
        RoostConfig roostConfig4;
        String str5;
        RoostGate roostGate5;
        long j4;
        String str6;
        RoostReply roostReply;
        String str7;
        RoostGate roostGate6;
        String str8;
        if (continuation instanceof RoostGate$resolve$1) {
            roostGate$resolve$1 = (RoostGate$resolve$1) continuation;
            if ((roostGate$resolve$1.label & Integer.MIN_VALUE) != 0) {
                roostGate$resolve$1.label -= Integer.MIN_VALUE;
                Object obj = roostGate$resolve$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (roostGate$resolve$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        currentTimeMillis = System.currentTimeMillis();
                        RoostFeed roostFeed = this.feed;
                        roostGate$resolve$1.L$0 = this;
                        roostGate$resolve$1.J$0 = currentTimeMillis;
                        roostGate$resolve$1.label = 1;
                        obj = roostFeed.load(8000L, roostGate$resolve$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        roostGate = this;
                        RoostConfig roostConfig5 = (RoostConfig) obj;
                        Flow<Boolean> agreed = roostGate.store.getAgreed();
                        roostGate$resolve$1.L$0 = roostGate;
                        roostGate$resolve$1.L$1 = roostConfig5;
                        roostGate$resolve$1.J$0 = currentTimeMillis;
                        roostGate$resolve$1.label = 2;
                        first = FlowKt.first(agreed, roostGate$resolve$1);
                        if (first != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = currentTimeMillis;
                        roostConfig = roostConfig5;
                        obj = first;
                        long j5 = j;
                        if (!((Boolean) obj).booleanValue()) {
                            roostGate$resolve$1.L$0 = null;
                            roostGate$resolve$1.L$1 = null;
                            roostGate$resolve$1.label = 3;
                            if (settle$default(roostGate, j5, 0L, roostGate$resolve$1, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return RoostRoute.Home.INSTANCE;
                        }
                        Flow<String> pageUrl = roostGate.store.getPageUrl();
                        roostGate$resolve$1.L$0 = roostGate;
                        roostGate$resolve$1.L$1 = roostConfig;
                        roostGate$resolve$1.J$0 = j5;
                        roostGate$resolve$1.label = 4;
                        obj = FlowKt.first(pageUrl, roostGate$resolve$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        roostGate2 = roostGate;
                        roostConfig2 = roostConfig;
                        j2 = j5;
                        str = (String) obj;
                        if (roostConfig2 != null || !roostConfig2.getActive() || StringsKt.isBlank(roostConfig2.getCheckUrl())) {
                            str2 = str;
                            if (str2 == null && str2.length() != 0) {
                                return roostGate2.route(str);
                            }
                            roostGate$resolve$1.L$0 = null;
                            roostGate$resolve$1.L$1 = null;
                            roostGate$resolve$1.label = 5;
                            if (settle$default(roostGate2, j2, 0L, roostGate$resolve$1, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return RoostRoute.Home.INSTANCE;
                        }
                        RoostTrace roostTrace = roostGate2.trace;
                        roostGate$resolve$1.L$0 = roostGate2;
                        roostGate$resolve$1.L$1 = roostConfig2;
                        roostGate$resolve$1.J$0 = j2;
                        roostGate$resolve$1.label = 6;
                        obj = roostTrace.read(roostGate$resolve$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        TraceIds traceIds2 = (TraceIds) obj;
                        RoostReferrer roostReferrer = roostGate2.referrer;
                        roostGate$resolve$1.L$0 = roostGate2;
                        roostGate$resolve$1.L$1 = roostConfig2;
                        roostGate$resolve$1.L$2 = traceIds2;
                        roostGate$resolve$1.J$0 = j2;
                        roostGate$resolve$1.label = 7;
                        read = roostReferrer.read(CoroutineLiveDataKt.DEFAULT_TIMEOUT, roostGate$resolve$1);
                        if (read != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        roostGate3 = roostGate2;
                        traceIds = traceIds2;
                        obj = read;
                        roostConfig3 = roostConfig2;
                        str3 = (String) obj;
                        if (!StringsKt.isBlank(roostConfig3.getTitle())) {
                            RoostBeacon roostBeacon = RoostBeacon.INSTANCE;
                            Application application = roostGate3.app;
                            String title = roostConfig3.getTitle();
                            roostGate$resolve$1.L$0 = roostGate3;
                            roostGate$resolve$1.L$1 = roostConfig3;
                            roostGate$resolve$1.L$2 = traceIds;
                            roostGate$resolve$1.L$3 = str3;
                            roostGate$resolve$1.J$0 = j2;
                            roostGate$resolve$1.label = 8;
                            obj = roostBeacon.activate(application, title, roostGate$resolve$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str6 = (String) obj;
                            if (str6 != null) {
                                roostGate4 = roostGate3;
                                j3 = j2;
                                RoostConfig roostConfig6 = roostConfig3;
                                str4 = str6;
                                str5 = str3;
                                roostConfig4 = roostConfig6;
                                RoostClient roostClient = roostGate4.client;
                                String checkUrl = roostConfig4.getCheckUrl();
                                String gaid = traceIds.getGaid();
                                String deviceUuid = traceIds.getDeviceUuid();
                                roostGate$resolve$1.L$0 = roostGate4;
                                roostGate$resolve$1.L$1 = null;
                                roostGate$resolve$1.L$2 = null;
                                roostGate$resolve$1.L$3 = null;
                                roostGate$resolve$1.J$0 = j3;
                                roostGate$resolve$1.label = 9;
                                long j6 = j3;
                                obj = roostClient.query(checkUrl, gaid, deviceUuid, str5, str4, 15000L, roostGate$resolve$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                roostGate5 = roostGate4;
                                j4 = j6;
                                roostReply = (RoostReply) obj;
                                if (roostReply != null || (str7 = roostReply.getUrl()) == null || !(!StringsKt.isBlank(str7))) {
                                    str7 = null;
                                }
                                if (str7 != null) {
                                    roostGate$resolve$1.L$0 = null;
                                    roostGate$resolve$1.label = 11;
                                    if (settle$default(roostGate5, j4, 0L, roostGate$resolve$1, 2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return RoostRoute.Home.INSTANCE;
                                }
                                RoostStore roostStore = roostGate5.store;
                                String time = roostReply.getTime();
                                roostGate$resolve$1.L$0 = roostGate5;
                                roostGate$resolve$1.L$1 = str7;
                                roostGate$resolve$1.label = 10;
                                if (roostStore.savePage(str7, time, roostGate$resolve$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                roostGate6 = roostGate5;
                                str8 = str7;
                                return roostGate6.route(str8);
                            }
                        }
                        str5 = str3;
                        roostConfig4 = roostConfig3;
                        roostGate4 = roostGate3;
                        str4 = "";
                        j3 = j2;
                        RoostClient roostClient2 = roostGate4.client;
                        String checkUrl2 = roostConfig4.getCheckUrl();
                        String gaid2 = traceIds.getGaid();
                        String deviceUuid2 = traceIds.getDeviceUuid();
                        roostGate$resolve$1.L$0 = roostGate4;
                        roostGate$resolve$1.L$1 = null;
                        roostGate$resolve$1.L$2 = null;
                        roostGate$resolve$1.L$3 = null;
                        roostGate$resolve$1.J$0 = j3;
                        roostGate$resolve$1.label = 9;
                        long j62 = j3;
                        obj = roostClient2.query(checkUrl2, gaid2, deviceUuid2, str5, str4, 15000L, roostGate$resolve$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 1:
                        currentTimeMillis = roostGate$resolve$1.J$0;
                        roostGate = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        RoostConfig roostConfig52 = (RoostConfig) obj;
                        Flow<Boolean> agreed2 = roostGate.store.getAgreed();
                        roostGate$resolve$1.L$0 = roostGate;
                        roostGate$resolve$1.L$1 = roostConfig52;
                        roostGate$resolve$1.J$0 = currentTimeMillis;
                        roostGate$resolve$1.label = 2;
                        first = FlowKt.first(agreed2, roostGate$resolve$1);
                        if (first != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        long j7 = roostGate$resolve$1.J$0;
                        RoostConfig roostConfig7 = (RoostConfig) roostGate$resolve$1.L$1;
                        RoostGate roostGate7 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        j = j7;
                        roostConfig = roostConfig7;
                        roostGate = roostGate7;
                        long j52 = j;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        ResultKt.throwOnFailure(obj);
                        return RoostRoute.Home.INSTANCE;
                    case 4:
                        j2 = roostGate$resolve$1.J$0;
                        roostConfig2 = (RoostConfig) roostGate$resolve$1.L$1;
                        roostGate2 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (roostConfig2 != null) {
                            break;
                        }
                        str2 = str;
                        if (str2 == null) {
                            break;
                        }
                        roostGate$resolve$1.L$0 = null;
                        roostGate$resolve$1.L$1 = null;
                        roostGate$resolve$1.label = 5;
                        if (settle$default(roostGate2, j2, 0L, roostGate$resolve$1, 2, null) == coroutine_suspended) {
                        }
                        return RoostRoute.Home.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return RoostRoute.Home.INSTANCE;
                    case 6:
                        j2 = roostGate$resolve$1.J$0;
                        roostConfig2 = (RoostConfig) roostGate$resolve$1.L$1;
                        roostGate2 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        TraceIds traceIds22 = (TraceIds) obj;
                        RoostReferrer roostReferrer2 = roostGate2.referrer;
                        roostGate$resolve$1.L$0 = roostGate2;
                        roostGate$resolve$1.L$1 = roostConfig2;
                        roostGate$resolve$1.L$2 = traceIds22;
                        roostGate$resolve$1.J$0 = j2;
                        roostGate$resolve$1.label = 7;
                        read = roostReferrer2.read(CoroutineLiveDataKt.DEFAULT_TIMEOUT, roostGate$resolve$1);
                        if (read != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        j2 = roostGate$resolve$1.J$0;
                        TraceIds traceIds3 = (TraceIds) roostGate$resolve$1.L$2;
                        RoostConfig roostConfig8 = (RoostConfig) roostGate$resolve$1.L$1;
                        RoostGate roostGate8 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        roostGate3 = roostGate8;
                        roostConfig3 = roostConfig8;
                        traceIds = traceIds3;
                        str3 = (String) obj;
                        if (!StringsKt.isBlank(roostConfig3.getTitle())) {
                        }
                        str5 = str3;
                        roostConfig4 = roostConfig3;
                        roostGate4 = roostGate3;
                        str4 = "";
                        j3 = j2;
                        RoostClient roostClient22 = roostGate4.client;
                        String checkUrl22 = roostConfig4.getCheckUrl();
                        String gaid22 = traceIds.getGaid();
                        String deviceUuid22 = traceIds.getDeviceUuid();
                        roostGate$resolve$1.L$0 = roostGate4;
                        roostGate$resolve$1.L$1 = null;
                        roostGate$resolve$1.L$2 = null;
                        roostGate$resolve$1.L$3 = null;
                        roostGate$resolve$1.J$0 = j3;
                        roostGate$resolve$1.label = 9;
                        long j622 = j3;
                        obj = roostClient22.query(checkUrl22, gaid22, deviceUuid22, str5, str4, 15000L, roostGate$resolve$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 8:
                        j2 = roostGate$resolve$1.J$0;
                        str3 = (String) roostGate$resolve$1.L$3;
                        traceIds = (TraceIds) roostGate$resolve$1.L$2;
                        roostConfig3 = (RoostConfig) roostGate$resolve$1.L$1;
                        roostGate3 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str6 = (String) obj;
                        if (str6 != null) {
                        }
                        str5 = str3;
                        roostConfig4 = roostConfig3;
                        roostGate4 = roostGate3;
                        str4 = "";
                        j3 = j2;
                        RoostClient roostClient222 = roostGate4.client;
                        String checkUrl222 = roostConfig4.getCheckUrl();
                        String gaid222 = traceIds.getGaid();
                        String deviceUuid222 = traceIds.getDeviceUuid();
                        roostGate$resolve$1.L$0 = roostGate4;
                        roostGate$resolve$1.L$1 = null;
                        roostGate$resolve$1.L$2 = null;
                        roostGate$resolve$1.L$3 = null;
                        roostGate$resolve$1.J$0 = j3;
                        roostGate$resolve$1.label = 9;
                        long j6222 = j3;
                        obj = roostClient222.query(checkUrl222, gaid222, deviceUuid222, str5, str4, 15000L, roostGate$resolve$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 9:
                        long j8 = roostGate$resolve$1.J$0;
                        RoostGate roostGate9 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        roostGate5 = roostGate9;
                        j4 = j8;
                        roostReply = (RoostReply) obj;
                        if (roostReply != null) {
                            break;
                        }
                        str7 = null;
                        if (str7 != null) {
                        }
                        break;
                    case 10:
                        str8 = (String) roostGate$resolve$1.L$1;
                        roostGate6 = (RoostGate) roostGate$resolve$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return roostGate6.route(str8);
                    case 11:
                        ResultKt.throwOnFailure(obj);
                        return RoostRoute.Home.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        roostGate$resolve$1 = new RoostGate$resolve$1(this, continuation);
        Object obj2 = roostGate$resolve$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (roostGate$resolve$1.label) {
        }
    }

    private final RoostRoute.Page route(String url) {
        return new RoostRoute.Page(url, StringsKt.contains$default((CharSequence) url, (CharSequence) RoostBank.INSTANCE.at(4), false, 2, (Object) null));
    }

    static /* synthetic */ Object settle$default(RoostGate roostGate, long j, long j2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 1200;
        }
        return roostGate.settle(j, j2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object settle(long j, long j2, Continuation<? super Unit> continuation) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < j2) {
            Object delay = DelayKt.delay(j2 - currentTimeMillis, continuation);
            return delay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RoostGate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostGate$Companion;", "", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
