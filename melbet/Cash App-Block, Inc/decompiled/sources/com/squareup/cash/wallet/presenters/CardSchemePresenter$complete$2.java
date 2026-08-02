package com.squareup.cash.wallet.presenters;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$4;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardSchemePresenter$complete$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $loadingCallback;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$complete$2(int i, Continuation continuation, Function1 function1, boolean z) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$loadingCallback = function1;
        this.Z$0 = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$loadingCallback;
        switch (i) {
            case 0:
                CardSchemePresenter$complete$2 cardSchemePresenter$complete$2 = new CardSchemePresenter$complete$2(function1, continuation, 0);
                cardSchemePresenter$complete$2.Z$0 = ((Boolean) obj).booleanValue();
                return cardSchemePresenter$complete$2;
            case 1:
                CardSchemePresenter$complete$2 cardSchemePresenter$complete$22 = new CardSchemePresenter$complete$2(function1, continuation, 1);
                cardSchemePresenter$complete$22.Z$0 = ((Boolean) obj).booleanValue();
                return cardSchemePresenter$complete$22;
            case 2:
                return new CardSchemePresenter$complete$2(2, continuation, function1, this.Z$0);
            case 3:
                return new CardSchemePresenter$complete$2(3, continuation, function1, this.Z$0);
            default:
                CardSchemePresenter$complete$2 cardSchemePresenter$complete$23 = new CardSchemePresenter$complete$2(function1, continuation, 4);
                cardSchemePresenter$complete$23.Z$0 = ((Boolean) obj).booleanValue();
                return cardSchemePresenter$complete$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((CardSchemePresenter$complete$2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((CardSchemePresenter$complete$2) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((CardSchemePresenter$complete$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((CardSchemePresenter$complete$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((CardSchemePresenter$complete$2) create(bool3, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$loadingCallback;
        switch (i) {
            case 0:
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
                break;
            case 1:
                boolean z2 = this.Z$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new ReflectionObjectRenderer$$Lambda$4(z2, 1));
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(Boolean.valueOf(this.Z$0));
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(Boolean.valueOf(this.Z$0));
                break;
            default:
                boolean z3 = this.Z$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(Boolean.valueOf(z3));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$complete$2(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$loadingCallback = function1;
    }
}
