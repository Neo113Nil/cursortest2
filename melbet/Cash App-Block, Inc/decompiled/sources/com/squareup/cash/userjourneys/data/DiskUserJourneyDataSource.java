package com.squareup.cash.userjourneys.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.moshi.Moshi;
import com.squareup.wire.GrpcMethod;
import java.io.File;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class DiskUserJourneyDataSource {
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioDispatcher;
    public final GrpcMethod journeysFile;
    public final Moshi moshi;

    public DiskUserJourneyDataSource(File file, CoroutineContext coroutineContext, ErrorReporter errorReporter) {
        this.ioDispatcher = coroutineContext;
        this.errorReporter = errorReporter;
        Moshi.Builder builder = new Moshi.Builder();
        builder.add(new UUIDJsonAdapter());
        this.moshi = new Moshi(builder);
        this.journeysFile = new GrpcMethod(file);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r6.errorReporter.report(new com.squareup.cash.userjourneys.data.UserJourneyRepositoryError("Error persisting journey e: " + r7), com.squareup.cash.observability.types.ErrorReporter.DefaultSamplingStrategy.INSTANCE);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object persist$suspendImpl(DiskUserJourneyDataSource diskUserJourneyDataSource, Set set, ContinuationImpl continuationImpl) {
        DiskUserJourneyDataSource$persist$1 diskUserJourneyDataSource$persist$1;
        int i;
        if (continuationImpl instanceof DiskUserJourneyDataSource$persist$1) {
            diskUserJourneyDataSource$persist$1 = (DiskUserJourneyDataSource$persist$1) continuationImpl;
            int i2 = diskUserJourneyDataSource$persist$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                diskUserJourneyDataSource$persist$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = diskUserJourneyDataSource$persist$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diskUserJourneyDataSource$persist$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = diskUserJourneyDataSource.ioDispatcher;
                    RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2 = new RealGcmRegistrar$unregister$2(diskUserJourneyDataSource, set, continuation, 27);
                    diskUserJourneyDataSource$persist$1.L$0 = diskUserJourneyDataSource;
                    diskUserJourneyDataSource$persist$1.label = 1;
                    Object withContext = JobKt.withContext(coroutineContext, realGcmRegistrar$unregister$2, diskUserJourneyDataSource$persist$1);
                    diskUserJourneyDataSource = withContext;
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    DiskUserJourneyDataSource diskUserJourneyDataSource2 = diskUserJourneyDataSource$persist$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    diskUserJourneyDataSource = diskUserJourneyDataSource2;
                }
                return Unit.INSTANCE;
            }
        }
        diskUserJourneyDataSource$persist$1 = new DiskUserJourneyDataSource$persist$1(diskUserJourneyDataSource, continuationImpl);
        Object obj2 = diskUserJourneyDataSource$persist$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diskUserJourneyDataSource$persist$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public abstract Set deserialize(String str);

    public final Object fetch(ContinuationImpl continuationImpl) {
        if (!((File) this.journeysFile.path).exists()) {
            return EmptySet.INSTANCE;
        }
        return JobKt.withContext(this.ioDispatcher, new CashApp$onCreate$1(this, null, 11), continuationImpl);
    }

    public void onPersistenceChanged(String str) {
        str.getClass();
    }

    public abstract String serialize(Set set);
}
