package com.onesignal.core.internal.preferences.impl;

import android.content.SharedPreferences;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreferencesService.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.preferences.impl.PreferencesService$doWorkAsync$1", f = "PreferencesService.kt", i = {0, 1}, l = {232, 236}, m = "invokeSuspend", n = {"lastSyncTime", "lastSyncTime"}, s = {"J$0", "J$0"})
/* loaded from: classes3.dex */
final class PreferencesService$doWorkAsync$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final /* synthetic */ PreferencesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesService$doWorkAsync$1(PreferencesService preferencesService, Continuation<? super PreferencesService$doWorkAsync$1> continuation) {
        super(1, continuation);
        this.this$0 = preferencesService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PreferencesService$doWorkAsync$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((PreferencesService$doWorkAsync$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0128, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r12) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012e, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0140, code lost:
    
        if (r13.waitForWake(r12) == r0) goto L68;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0140 -> B:8:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Waiter waiter;
        Map map;
        ITime iTime;
        Map map2;
        SharedPreferences sharedPrefsByName;
        boolean z;
        Waiter waiter2;
        boolean z2;
        ITime iTime2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Logging.log(LogLevel.ERROR, "Error with Preference work loop", th);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Logging.debug$default("OneSignal: PreferencesService write loop running", null, 2, null);
            iTime2 = this.this$0._time;
            j = iTime2.getCurrentTimeMillis();
        } else if (i == 1) {
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            waiter = this.this$0.waiter;
            this.J$0 = j;
            this.label = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            map = this.this$0.prefsToApply;
            for (String str : map.keySet()) {
                map2 = this.this$0.prefsToApply;
                Object obj2 = map2.get(str);
                Intrinsics.checkNotNull(obj2);
                Map map3 = (Map) obj2;
                sharedPrefsByName = this.this$0.getSharedPrefsByName(str);
                if (sharedPrefsByName == null) {
                    z = this.this$0.hasLoggedMissingAppContext;
                    if (!z) {
                        Logging.warn$default("OneSignal: PreferencesService app context unavailable, deferring writes", null, 2, null);
                        this.this$0.hasLoggedMissingAppContext = true;
                    }
                    waiter2 = this.this$0.waiter;
                    waiter2.wake();
                } else {
                    z2 = this.this$0.hasLoggedMissingAppContext;
                    if (z2) {
                        Logging.info$default("OneSignal: PreferencesService app context is now available, resuming writes", null, 2, null);
                        this.this$0.hasLoggedMissingAppContext = false;
                    }
                    SharedPreferences.Editor edit = sharedPrefsByName.edit();
                    synchronized (map3) {
                        for (String str2 : map3.keySet()) {
                            Object obj3 = map3.get(str2);
                            if (obj3 instanceof String) {
                                edit.putString(str2, (String) obj3);
                            } else if (obj3 instanceof Boolean) {
                                edit.putBoolean(str2, ((Boolean) obj3).booleanValue());
                            } else if (obj3 instanceof Integer) {
                                edit.putInt(str2, ((Integer) obj3).intValue());
                            } else if (obj3 instanceof Long) {
                                edit.putLong(str2, ((Long) obj3).longValue());
                            } else if (obj3 instanceof Set) {
                                edit.putStringSet(str2, (Set) obj3);
                            } else if (obj3 == null) {
                                edit.remove(str2);
                            }
                        }
                        map3.clear();
                        Unit unit = Unit.INSTANCE;
                    }
                    edit.apply();
                }
            }
            iTime = this.this$0._time;
            long currentTimeMillis = iTime.getCurrentTimeMillis();
            long j2 = (j - currentTimeMillis) + 200;
            if (j2 <= 0) {
                break;
            }
            try {
                this.J$0 = currentTimeMillis;
                this.label = 1;
            } catch (Throwable th2) {
                j = currentTimeMillis;
                Logging.log(LogLevel.ERROR, "Error with Preference work loop", th2);
            }
            Logging.log(LogLevel.ERROR, "Error with Preference work loop", th2);
        }
        return coroutine_suspended;
    }
}
