package com.squareup.preferences;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SharedPreferencesKeyValue$get$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SharedPreferencesKeyValue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPreferencesKeyValue$get$2(SharedPreferencesKeyValue sharedPreferencesKeyValue, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = sharedPreferencesKeyValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SharedPreferencesKeyValue sharedPreferencesKeyValue = this.this$0;
        switch (i) {
            case 0:
                return new SharedPreferencesKeyValue$get$2(sharedPreferencesKeyValue, continuation, 0);
            default:
                return new SharedPreferencesKeyValue$get$2(sharedPreferencesKeyValue, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SharedPreferencesKeyValue$get$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SharedPreferencesKeyValue sharedPreferencesKeyValue = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SharedPreferences.Editor remove = sharedPreferencesKeyValue.preferences.edit().remove(sharedPreferencesKeyValue.key);
                if (sharedPreferencesKeyValue.atomic) {
                    return Boolean.valueOf(remove.commit());
                }
                remove.apply();
                return Unit.INSTANCE;
        }
    }
}
