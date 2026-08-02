package com.squareup.cash.treehouse.sqldelight;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SqlDelightBridge$Companion$Adapter$GeneratedOutboundService implements SqlDelightBridge, OutboundService {
    public final OutboundCallHandler callHandler;

    public SqlDelightBridge$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object beginTransaction(ContinuationImpl continuationImpl) {
        SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1 sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1;
        int i;
        if (continuationImpl instanceof SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1) {
            sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1 = (SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1) continuationImpl;
            int i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 2, new Object[0], sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1);
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
                obj.getClass();
                return (Integer) obj;
            }
        }
        sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1 = new SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1(this, continuationImpl);
        Object obj2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$beginTransaction$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Integer) obj2;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 5, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object endTransaction(int i, ContinuationImpl continuationImpl) {
        SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1 sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1;
        int i2;
        if (continuationImpl instanceof SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1) {
            sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1 = (SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1) continuationImpl;
            int i3 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {new Integer(i)};
                    sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 3, objArr, sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1 = new SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1(this, continuationImpl);
        Object obj2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$endTransaction$1.label;
        if (i2 != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, List list, int i, ContinuationImpl continuationImpl) {
        SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1 sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1;
        int i2;
        if (continuationImpl instanceof SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1) {
            sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1 = (SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1) continuationImpl;
            int i3 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {str, list, new Integer(i)};
                    sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, objArr, sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Long) obj;
            }
        }
        sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1 = new SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1(this, continuationImpl);
        Object obj2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1.label;
        if (i2 != 0) {
        }
        obj2.getClass();
        return (Long) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeQuery(String str, List list, int i, ContinuationImpl continuationImpl) {
        SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1 sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1;
        int i2;
        if (continuationImpl instanceof SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1) {
            sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1 = (SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1) continuationImpl;
            int i3 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {str, list, new Integer(i)};
                    sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 1, objArr, sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (List) obj;
            }
        }
        sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1 = new SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1(this, continuationImpl);
        Object obj2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$executeQuery$1.label;
        if (i2 != 0) {
        }
        obj2.getClass();
        return (List) obj2;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.sqldelight.SqlDelightBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rollbackTransaction(int i, ContinuationImpl continuationImpl) {
        SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1 sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1;
        int i2;
        if (continuationImpl instanceof SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1) {
            sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1 = (SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1) continuationImpl;
            int i3 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {new Integer(i)};
                    sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 4, objArr, sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1 = new SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1(this, continuationImpl);
        Object obj2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService$rollbackTransaction$1.label;
        if (i2 != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }
}
