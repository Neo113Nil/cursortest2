package com.squareup.cash.treehouse.sqldelight;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AndroidSqlDelightBridge$endTransaction$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidSqlDelightBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidSqlDelightBridge$endTransaction$2(AndroidSqlDelightBridge androidSqlDelightBridge, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = androidSqlDelightBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AndroidSqlDelightBridge androidSqlDelightBridge = this.this$0;
        switch (i) {
            case 0:
                return new AndroidSqlDelightBridge$endTransaction$2(androidSqlDelightBridge, continuation, 0);
            case 1:
                return new AndroidSqlDelightBridge$endTransaction$2(androidSqlDelightBridge, continuation, 1);
            default:
                return new AndroidSqlDelightBridge$endTransaction$2(androidSqlDelightBridge, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AndroidSqlDelightBridge$endTransaction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AndroidSqlDelightBridge androidSqlDelightBridge = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SupportSQLiteDatabase supportSQLiteDatabase = androidSqlDelightBridge.database;
                supportSQLiteDatabase.setTransactionSuccessful();
                supportSQLiteDatabase.endTransaction();
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SupportSQLiteDatabase supportSQLiteDatabase2 = androidSqlDelightBridge.database;
                supportSQLiteDatabase2.beginTransactionNonExclusive();
                return Boolean.valueOf(supportSQLiteDatabase2.yieldIfContendedSafely());
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                androidSqlDelightBridge.database.endTransaction();
                return Unit.INSTANCE;
        }
    }
}
