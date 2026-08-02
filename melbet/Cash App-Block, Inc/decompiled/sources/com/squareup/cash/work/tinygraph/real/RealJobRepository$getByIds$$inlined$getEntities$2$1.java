package com.squareup.cash.work.tinygraph.real;

import com.squareup.cash.work.tinygraph.EntityOperationType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealJobRepository$getByIds$$inlined$getEntities$2$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ List L$0;
    public /* synthetic */ Pair L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealJobRepository$getByIds$$inlined$getEntities$2$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        List list = (List) obj;
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                RealJobRepository$getByIds$$inlined$getEntities$2$1 realJobRepository$getByIds$$inlined$getEntities$2$1 = new RealJobRepository$getByIds$$inlined$getEntities$2$1(i, continuation, 0);
                realJobRepository$getByIds$$inlined$getEntities$2$1.L$0 = list;
                realJobRepository$getByIds$$inlined$getEntities$2$1.L$1 = pair;
                return realJobRepository$getByIds$$inlined$getEntities$2$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealJobRepository$getByIds$$inlined$getEntities$2$1 realJobRepository$getByIds$$inlined$getEntities$2$12 = new RealJobRepository$getByIds$$inlined$getEntities$2$1(i, continuation, 1);
                realJobRepository$getByIds$$inlined$getEntities$2$12.L$0 = list;
                realJobRepository$getByIds$$inlined$getEntities$2$12.L$1 = pair;
                return realJobRepository$getByIds$$inlined$getEntities$2$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                RealJobRepository$getByIds$$inlined$getEntities$2$1 realJobRepository$getByIds$$inlined$getEntities$2$13 = new RealJobRepository$getByIds$$inlined$getEntities$2$1(i, continuation, 2);
                realJobRepository$getByIds$$inlined$getEntities$2$13.L$0 = list;
                realJobRepository$getByIds$$inlined$getEntities$2$13.L$1 = pair;
                return realJobRepository$getByIds$$inlined$getEntities$2$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                RealJobRepository$getByIds$$inlined$getEntities$2$1 realJobRepository$getByIds$$inlined$getEntities$2$14 = new RealJobRepository$getByIds$$inlined$getEntities$2$1(i, continuation, i);
                realJobRepository$getByIds$$inlined$getEntities$2$14.L$0 = list;
                realJobRepository$getByIds$$inlined$getEntities$2$14.L$1 = pair;
                return realJobRepository$getByIds$$inlined$getEntities$2$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                RealJobRepository$getByIds$$inlined$getEntities$2$1 realJobRepository$getByIds$$inlined$getEntities$2$15 = new RealJobRepository$getByIds$$inlined$getEntities$2$1(i, continuation, 4);
                realJobRepository$getByIds$$inlined$getEntities$2$15.L$0 = list;
                realJobRepository$getByIds$$inlined$getEntities$2$15.L$1 = pair;
                return realJobRepository$getByIds$$inlined$getEntities$2$15.invokeSuspend(Unit.INSTANCE);
            default:
                RealJobRepository$getByIds$$inlined$getEntities$2$1 realJobRepository$getByIds$$inlined$getEntities$2$16 = new RealJobRepository$getByIds$$inlined$getEntities$2$1(i, continuation, 5);
                realJobRepository$getByIds$$inlined$getEntities$2$16.L$0 = list;
                realJobRepository$getByIds$$inlined$getEntities$2$16.L$1 = pair;
                return realJobRepository$getByIds$$inlined$getEntities$2$16.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final int i = 1;
        switch (this.$r8$classId) {
            case 0:
                List list = this.L$0;
                Pair pair = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final IBaseEntity iBaseEntity = (IBaseEntity) pair.first;
                EntityOperationType entityOperationType = (EntityOperationType) pair.second;
                ArrayList mutableList = CollectionsKt.toMutableList((Collection) list);
                int ordinal = entityOperationType.ordinal();
                if (ordinal == 0) {
                    final int i2 = 0;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i3 = i2;
                            IBaseEntity iBaseEntity2 = iBaseEntity;
                            switch (i3) {
                                case 0:
                                    IBaseEntity iBaseEntity3 = (IBaseEntity) obj2;
                                    iBaseEntity3.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity3.getId(), iBaseEntity2.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity4 = (IBaseEntity) obj2;
                                    iBaseEntity4.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity4.getId(), iBaseEntity2.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity2.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity2.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity2.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity2.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity2.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity2.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity2.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity2.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity2.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity2.getId()));
                            }
                        }
                    });
                    mutableList.add(iBaseEntity);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i3 = i;
                            IBaseEntity iBaseEntity2 = iBaseEntity;
                            switch (i3) {
                                case 0:
                                    IBaseEntity iBaseEntity3 = (IBaseEntity) obj2;
                                    iBaseEntity3.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity3.getId(), iBaseEntity2.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity4 = (IBaseEntity) obj2;
                                    iBaseEntity4.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity4.getId(), iBaseEntity2.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity2.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity2.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity2.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity2.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity2.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity2.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity2.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity2.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity2.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity2.getId()));
                            }
                        }
                    });
                }
                return mutableList;
            case 1:
                List list2 = this.L$0;
                Pair pair2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final IBaseEntity iBaseEntity2 = (IBaseEntity) pair2.first;
                EntityOperationType entityOperationType2 = (EntityOperationType) pair2.second;
                ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) list2);
                int ordinal2 = entityOperationType2.ordinal();
                if (ordinal2 == 0) {
                    final int i3 = 2;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList2, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i3;
                            IBaseEntity iBaseEntity22 = iBaseEntity2;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity3 = (IBaseEntity) obj2;
                                    iBaseEntity3.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity3.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity4 = (IBaseEntity) obj2;
                                    iBaseEntity4.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity4.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                    mutableList2.add(iBaseEntity2);
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    final int i4 = 3;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList2, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i4;
                            IBaseEntity iBaseEntity22 = iBaseEntity2;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity3 = (IBaseEntity) obj2;
                                    iBaseEntity3.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity3.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity4 = (IBaseEntity) obj2;
                                    iBaseEntity4.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity4.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                }
                return mutableList2;
            case 2:
                List list3 = this.L$0;
                Pair pair3 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final IBaseEntity iBaseEntity3 = (IBaseEntity) pair3.first;
                EntityOperationType entityOperationType3 = (EntityOperationType) pair3.second;
                ArrayList mutableList3 = CollectionsKt.toMutableList((Collection) list3);
                int ordinal3 = entityOperationType3.ordinal();
                if (ordinal3 == 0) {
                    final int i5 = 4;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList3, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i5;
                            IBaseEntity iBaseEntity22 = iBaseEntity3;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity4 = (IBaseEntity) obj2;
                                    iBaseEntity4.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity4.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                    mutableList3.add(iBaseEntity3);
                } else {
                    if (ordinal3 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    final int i6 = 5;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList3, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i6;
                            IBaseEntity iBaseEntity22 = iBaseEntity3;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity4 = (IBaseEntity) obj2;
                                    iBaseEntity4.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity4.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                }
                return mutableList3;
            case 3:
                List list4 = this.L$0;
                Pair pair4 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final IBaseEntity iBaseEntity4 = (IBaseEntity) pair4.first;
                EntityOperationType entityOperationType4 = (EntityOperationType) pair4.second;
                ArrayList mutableList4 = CollectionsKt.toMutableList((Collection) list4);
                int ordinal4 = entityOperationType4.ordinal();
                if (ordinal4 == 0) {
                    final int i7 = 6;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList4, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i7;
                            IBaseEntity iBaseEntity22 = iBaseEntity4;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity42 = (IBaseEntity) obj2;
                                    iBaseEntity42.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity42.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                    mutableList4.add(iBaseEntity4);
                } else {
                    if (ordinal4 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    final int i8 = 7;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList4, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i8;
                            IBaseEntity iBaseEntity22 = iBaseEntity4;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity42 = (IBaseEntity) obj2;
                                    iBaseEntity42.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity42.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity5 = (IBaseEntity) obj2;
                                    iBaseEntity5.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity5.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                }
                return mutableList4;
            case 4:
                List list5 = this.L$0;
                Pair pair5 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final IBaseEntity iBaseEntity5 = (IBaseEntity) pair5.first;
                EntityOperationType entityOperationType5 = (EntityOperationType) pair5.second;
                ArrayList mutableList5 = CollectionsKt.toMutableList((Collection) list5);
                int ordinal5 = entityOperationType5.ordinal();
                if (ordinal5 == 0) {
                    final int i9 = 8;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList5, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i9;
                            IBaseEntity iBaseEntity22 = iBaseEntity5;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity42 = (IBaseEntity) obj2;
                                    iBaseEntity42.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity42.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity52 = (IBaseEntity) obj2;
                                    iBaseEntity52.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity52.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                    mutableList5.add(iBaseEntity5);
                } else {
                    if (ordinal5 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    final int i10 = 9;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList5, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i10;
                            IBaseEntity iBaseEntity22 = iBaseEntity5;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity42 = (IBaseEntity) obj2;
                                    iBaseEntity42.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity42.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity52 = (IBaseEntity) obj2;
                                    iBaseEntity52.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity52.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity6 = (IBaseEntity) obj2;
                                    iBaseEntity6.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity6.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                }
                return mutableList5;
            default:
                List list6 = this.L$0;
                Pair pair6 = this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final IBaseEntity iBaseEntity6 = (IBaseEntity) pair6.first;
                EntityOperationType entityOperationType6 = (EntityOperationType) pair6.second;
                ArrayList mutableList6 = CollectionsKt.toMutableList((Collection) list6);
                int ordinal6 = entityOperationType6.ordinal();
                if (ordinal6 == 0) {
                    final int i11 = 10;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList6, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i11;
                            IBaseEntity iBaseEntity22 = iBaseEntity6;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity42 = (IBaseEntity) obj2;
                                    iBaseEntity42.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity42.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity52 = (IBaseEntity) obj2;
                                    iBaseEntity52.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity52.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity62 = (IBaseEntity) obj2;
                                    iBaseEntity62.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity62.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                    mutableList6.add(iBaseEntity6);
                } else {
                    if (ordinal6 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    final int i12 = 11;
                    CollectionsKt__MutableCollectionsKt.removeAll(mutableList6, new Function1() { // from class: com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i32 = i12;
                            IBaseEntity iBaseEntity22 = iBaseEntity6;
                            switch (i32) {
                                case 0:
                                    IBaseEntity iBaseEntity32 = (IBaseEntity) obj2;
                                    iBaseEntity32.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity32.getId(), iBaseEntity22.getId()));
                                case 1:
                                    IBaseEntity iBaseEntity42 = (IBaseEntity) obj2;
                                    iBaseEntity42.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity42.getId(), iBaseEntity22.getId()));
                                case 2:
                                    IBaseEntity iBaseEntity52 = (IBaseEntity) obj2;
                                    iBaseEntity52.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity52.getId(), iBaseEntity22.getId()));
                                case 3:
                                    IBaseEntity iBaseEntity62 = (IBaseEntity) obj2;
                                    iBaseEntity62.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity62.getId(), iBaseEntity22.getId()));
                                case 4:
                                    IBaseEntity iBaseEntity7 = (IBaseEntity) obj2;
                                    iBaseEntity7.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity7.getId(), iBaseEntity22.getId()));
                                case 5:
                                    IBaseEntity iBaseEntity8 = (IBaseEntity) obj2;
                                    iBaseEntity8.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity8.getId(), iBaseEntity22.getId()));
                                case 6:
                                    IBaseEntity iBaseEntity9 = (IBaseEntity) obj2;
                                    iBaseEntity9.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity9.getId(), iBaseEntity22.getId()));
                                case 7:
                                    IBaseEntity iBaseEntity10 = (IBaseEntity) obj2;
                                    iBaseEntity10.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity10.getId(), iBaseEntity22.getId()));
                                case 8:
                                    IBaseEntity iBaseEntity11 = (IBaseEntity) obj2;
                                    iBaseEntity11.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity11.getId(), iBaseEntity22.getId()));
                                case 9:
                                    IBaseEntity iBaseEntity12 = (IBaseEntity) obj2;
                                    iBaseEntity12.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity12.getId(), iBaseEntity22.getId()));
                                case 10:
                                    IBaseEntity iBaseEntity13 = (IBaseEntity) obj2;
                                    iBaseEntity13.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity13.getId(), iBaseEntity22.getId()));
                                default:
                                    IBaseEntity iBaseEntity14 = (IBaseEntity) obj2;
                                    iBaseEntity14.getClass();
                                    return Boolean.valueOf(Intrinsics.areEqual(iBaseEntity14.getId(), iBaseEntity22.getId()));
                            }
                        }
                    });
                }
                return mutableList6;
        }
    }
}
