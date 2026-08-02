package com.squareup.cash.treehouse.android.configuration;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.integration.api.ProductionApiModule$Companion$createTreelotService$1;
import com.squareup.protos.cash.treelot.app.TreehouseApp;
import com.squareup.protos.cash.treelot.app.TreehouseConfigRequest;
import com.squareup.protos.cash.treelot.app.TreehouseConfigResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealTreehouseConfigSyncer {
    public final MutexImpl mutex = new MutexImpl();
    public boolean syncedSuccessfully;
    public final ProductionApiModule$Companion$createTreelotService$1 treelotService;

    public RealTreehouseConfigSyncer(ProductionApiModule$Companion$createTreelotService$1 productionApiModule$Companion$createTreelotService$1) {
        this.treelotService = productionApiModule$Companion$createTreelotService$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x007e, B:15:0x0084, B:19:0x0098, B:21:0x009c, B:22:0x00b9, B:24:0x00bf, B:26:0x00cb, B:27:0x00e7, B:28:0x00ec), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x007e, B:15:0x0084, B:19:0x0098, B:21:0x009c, B:22:0x00b9, B:24:0x00bf, B:26:0x00cb, B:27:0x00e7, B:28:0x00ec), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:36:0x0055, B:38:0x0059, B:41:0x0063), top: B:35:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:36:0x0055, B:38:0x0059, B:41:0x0063), top: B:35:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sync(ContinuationImpl continuationImpl) {
        RealTreehouseConfigSyncer$sync$1 realTreehouseConfigSyncer$sync$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        ApiResult apiResult;
        try {
            if (continuationImpl instanceof RealTreehouseConfigSyncer$sync$1) {
                realTreehouseConfigSyncer$sync$1 = (RealTreehouseConfigSyncer$sync$1) continuationImpl;
                int i3 = realTreehouseConfigSyncer$sync$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realTreehouseConfigSyncer$sync$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realTreehouseConfigSyncer$sync$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realTreehouseConfigSyncer$sync$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = this.mutex;
                        realTreehouseConfigSyncer$sync$1.L$0 = mutexImpl;
                        realTreehouseConfigSyncer$sync$1.I$0 = 0;
                        realTreehouseConfigSyncer$sync$1.label = 1;
                        if (mutexImpl.lock(realTreehouseConfigSyncer$sync$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = realTreehouseConfigSyncer$sync$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            apiResult = (ApiResult) obj;
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Timber.Forest.i("Failed to fetch Treehouse config: " + apiResult, new Object[0]);
                            } else {
                                if (!(apiResult instanceof ApiResult.Success)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.syncedSuccessfully = true;
                                Timber.Forest forest = Timber.Forest;
                                List list = ((TreehouseConfigResponse) ((ApiResult.Success) apiResult).response).apps;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((TreehouseApp) it.next()).app_name);
                                }
                                forest.i("Fetched Treehouse config for " + arrayList, new Object[0]);
                            }
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    i2 = realTreehouseConfigSyncer$sync$1.I$0;
                    ?? r8 = realTreehouseConfigSyncer$sync$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = r8;
                    if (!this.syncedSuccessfully) {
                        Unit unit = Unit.INSTANCE;
                        mutexImpl.unlock(null);
                        return unit;
                    }
                    ProductionApiModule$Companion$createTreelotService$1 productionApiModule$Companion$createTreelotService$1 = this.treelotService;
                    TreehouseConfigRequest treehouseConfigRequest = new TreehouseConfigRequest(ByteString.EMPTY);
                    realTreehouseConfigSyncer$sync$1.L$0 = mutexImpl;
                    realTreehouseConfigSyncer$sync$1.I$0 = i2;
                    realTreehouseConfigSyncer$sync$1.label = 2;
                    Object treehouseConfigAuthenticated = productionApiModule$Companion$createTreelotService$1.$retrofitService.getTreehouseConfigAuthenticated(treehouseConfigRequest, realTreehouseConfigSyncer$sync$1);
                    if (treehouseConfigAuthenticated != coroutineSingletons) {
                        mutex = mutexImpl;
                        obj = treehouseConfigAuthenticated;
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Failure)) {
                        }
                        mutex.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
            }
            if (!this.syncedSuccessfully) {
            }
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realTreehouseConfigSyncer$sync$1 = new RealTreehouseConfigSyncer$sync$1(this, continuationImpl);
        Object obj2 = realTreehouseConfigSyncer$sync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTreehouseConfigSyncer$sync$1.label;
        if (i != 0) {
        }
    }
}
