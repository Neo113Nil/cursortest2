package com.squareup.cash.storage;

import android.os.Debug;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.storage.StorageLinkType;
import com.squareup.cash.cdf.storage.StorageManageAccountSwitch;
import com.squareup.cash.cdf.storage.StorageManageColdStart;
import com.squareup.cash.cdf.storage.StorageManageSignInComplete;
import com.squareup.cash.cdf.storage.StorageManageSignOut;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.performance.MemoryInfo;
import com.squareup.cash.storage.SessionLinkChangeEvent;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.context.KeyedStorageContextWrapper;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SandboxingAnalyticsLogger {
    public final Analytics analytics;
    public final Storage appStorage;
    public final RealSandboxer sandboxer;

    public SandboxingAnalyticsLogger(RealSandboxer realSandboxer, Analytics analytics, Storage storage, MemoryInfo.Reader reader) {
        this.sandboxer = realSandboxer;
        this.analytics = analytics;
        this.appStorage = storage;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object log(StorageLinkState storageLinkState, ContinuationImpl continuationImpl) {
        SandboxingAnalyticsLogger$log$1 sandboxingAnalyticsLogger$log$1;
        int i;
        String associatedAccountToken;
        StorageLinkType storageLinkType;
        StorageLinkType storageLinkType2;
        long j;
        Long l;
        long j2;
        SessionLinkChangeEvent sessionLinkChangeEvent;
        Event storageManageSignInComplete;
        boolean exists;
        StorageLinkState storageLinkState2 = storageLinkState;
        if (continuationImpl instanceof SandboxingAnalyticsLogger$log$1) {
            sandboxingAnalyticsLogger$log$1 = (SandboxingAnalyticsLogger$log$1) continuationImpl;
            int i2 = sandboxingAnalyticsLogger$log$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sandboxingAnalyticsLogger$log$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sandboxingAnalyticsLogger$log$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sandboxingAnalyticsLogger$log$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    associatedAccountToken = storageLinkState2.event.getAssociatedAccountToken();
                    StorageLink storageLink = storageLinkState2.link;
                    long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                    long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                    if (storageLink instanceof StorageLink.Legacy) {
                        storageLinkType = StorageLinkType.Legacy;
                    } else {
                        if (!(storageLink instanceof StorageLink.Sandboxed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        storageLinkType = StorageLinkType.Sandboxed;
                    }
                    Long id = storageLink.getId();
                    sandboxingAnalyticsLogger$log$1.L$0 = storageLinkState2;
                    sandboxingAnalyticsLogger$log$1.L$1 = associatedAccountToken;
                    sandboxingAnalyticsLogger$log$1.L$4 = storageLinkType;
                    sandboxingAnalyticsLogger$log$1.L$5 = id;
                    sandboxingAnalyticsLogger$log$1.J$0 = freeMemory;
                    sandboxingAnalyticsLogger$log$1.J$1 = nativeHeapAllocatedSize;
                    sandboxingAnalyticsLogger$log$1.label = 1;
                    RealStorage realStorage = (RealStorage) this.appStorage;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new CashApp$onCreate$1(realStorage, continuation, 7), sandboxingAnalyticsLogger$log$1);
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    storageLinkType2 = storageLinkType;
                    j = nativeHeapAllocatedSize;
                    l = id;
                    obj = withContext;
                    j2 = freeMemory;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = sandboxingAnalyticsLogger$log$1.J$1;
                    j2 = sandboxingAnalyticsLogger$log$1.J$0;
                    Long l2 = sandboxingAnalyticsLogger$log$1.L$5;
                    StorageLinkType storageLinkType3 = sandboxingAnalyticsLogger$log$1.L$4;
                    associatedAccountToken = sandboxingAnalyticsLogger$log$1.L$1;
                    StorageLinkState storageLinkState3 = sandboxingAnalyticsLogger$log$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    l = l2;
                    storageLinkState2 = storageLinkState3;
                    storageLinkType2 = storageLinkType3;
                }
                long longValue = ((Number) obj).longValue();
                RealSandboxer realSandboxer = this.sandboxer;
                int size = realSandboxer.getAllActiveStorageLinks().size();
                sessionLinkChangeEvent = storageLinkState2.event;
                if (!(sessionLinkChangeEvent instanceof SessionLinkChangeEvent.ColdStart)) {
                    Long l3 = new Long(j2);
                    String str = associatedAccountToken;
                    Long l4 = new Long(j);
                    Long l5 = new Long(longValue);
                    Integer num = new Integer(size);
                    if (l == null) {
                        exists = false;
                    } else {
                        exists = new KeyedStorageContextWrapper(realSandboxer.baseContext, String.valueOf(l.longValue())).getDatabasePath("cash_app.db").exists();
                    }
                    storageManageSignInComplete = new StorageManageColdStart(str, l3, l4, storageLinkType2, l, l5, num, Boolean.valueOf(exists));
                } else if (sessionLinkChangeEvent instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch) {
                    storageManageSignInComplete = new StorageManageAccountSwitch(associatedAccountToken, new Long(j2), new Long(j), storageLinkType2, l, new Long(longValue), new Integer(size));
                } else if (sessionLinkChangeEvent instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignOut) {
                    storageManageSignInComplete = new StorageManageSignOut(associatedAccountToken, new Long(j2), new Long(j), storageLinkType2, l, new Long(longValue), new Integer(size));
                } else {
                    if (!(sessionLinkChangeEvent instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    storageManageSignInComplete = new StorageManageSignInComplete(associatedAccountToken, new Long(j2), new Long(j), storageLinkType2, l, new Long(longValue), new Integer(size));
                }
                this.analytics.track(storageManageSignInComplete, null);
                return Unit.INSTANCE;
            }
        }
        sandboxingAnalyticsLogger$log$1 = new SandboxingAnalyticsLogger$log$1(this, continuationImpl);
        Object obj2 = sandboxingAnalyticsLogger$log$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sandboxingAnalyticsLogger$log$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        RealSandboxer realSandboxer2 = this.sandboxer;
        int size2 = realSandboxer2.getAllActiveStorageLinks().size();
        sessionLinkChangeEvent = storageLinkState2.event;
        if (!(sessionLinkChangeEvent instanceof SessionLinkChangeEvent.ColdStart)) {
        }
        this.analytics.track(storageManageSignInComplete, null);
        return Unit.INSTANCE;
    }
}
