package gbcorp.c312.merkmarker.info.worker;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import gbcorp.c312.merkmarker.info.data.service.GTSLYApiService;
import gbcorp.c312.merkmarker.info.data.service.GTSLYVisitRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: GTSLYVisitRequestWorker.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lgbcorp/c312/merkmarker/info/worker/GTSLYVisitRequestWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", NotificationCompat.CATEGORY_SERVICE, "Lgbcorp/c312/merkmarker/info/data/service/GTSLYApiService;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgbcorp/c312/merkmarker/info/data/service/GTSLYApiService;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYVisitRequestWorker extends CoroutineWorker {
    public static final int $stable = 8;
    private final GTSLYApiService service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTSLYVisitRequestWorker(Context appContext, WorkerParameters workerParams, GTSLYApiService service) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:11:0x0034, B:12:0x0091, B:14:0x0099, B:15:0x00a2, B:19:0x009e, B:28:0x0067, B:31:0x0074), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:11:0x0034, B:12:0x0091, B:14:0x0099, B:15:0x00a2, B:19:0x009e, B:28:0x0067, B:31:0x0074), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        GTSLYVisitRequestWorker$doWork$1 gTSLYVisitRequestWorker$doWork$1;
        Object obj;
        int i;
        ListenableWorker.Result failure;
        try {
            if (continuation instanceof GTSLYVisitRequestWorker$doWork$1) {
                gTSLYVisitRequestWorker$doWork$1 = (GTSLYVisitRequestWorker$doWork$1) continuation;
                if ((gTSLYVisitRequestWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                    gTSLYVisitRequestWorker$doWork$1.label -= Integer.MIN_VALUE;
                    obj = gTSLYVisitRequestWorker$doWork$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gTSLYVisitRequestWorker$doWork$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        String string = getInputData().getString("KEY_PUSH_ID");
                        String string2 = getInputData().getString("KEY_LINK_URL");
                        String str = string2;
                        boolean z = ((str == null || str.length() == 0) ? (char) 1 : (char) 0) ^ 1;
                        GTSLYVisitRequest gTSLYVisitRequest = new GTSLYVisitRequest(string, string2);
                        GTSLYApiService gTSLYApiService = this.service;
                        String str2 = string == null ? "unknown_id" : string;
                        gTSLYVisitRequestWorker$doWork$1.L$0 = SpillingKt.nullOutSpilledVariable(string);
                        gTSLYVisitRequestWorker$doWork$1.L$1 = SpillingKt.nullOutSpilledVariable(string2);
                        gTSLYVisitRequestWorker$doWork$1.L$2 = SpillingKt.nullOutSpilledVariable(gTSLYVisitRequest);
                        gTSLYVisitRequestWorker$doWork$1.I$0 = z ? 1 : 0;
                        gTSLYVisitRequestWorker$doWork$1.label = 1;
                        obj = gTSLYApiService.visit(str2, z, gTSLYVisitRequest, gTSLYVisitRequestWorker$doWork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = gTSLYVisitRequestWorker$doWork$1.I$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!((Response) obj).isSuccessful()) {
                        failure = ListenableWorker.Result.success();
                    } else {
                        failure = ListenableWorker.Result.failure();
                    }
                    Intrinsics.checkNotNull(failure);
                    return failure;
                }
            }
            if (i != 0) {
            }
            if (!((Response) obj).isSuccessful()) {
            }
            Intrinsics.checkNotNull(failure);
            return failure;
        } catch (Exception e) {
            e.printStackTrace();
            ListenableWorker.Result retry = ListenableWorker.Result.retry();
            Intrinsics.checkNotNull(retry);
            return retry;
        }
        gTSLYVisitRequestWorker$doWork$1 = new GTSLYVisitRequestWorker$doWork$1(this, continuation);
        obj = gTSLYVisitRequestWorker$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gTSLYVisitRequestWorker$doWork$1.label;
    }
}
