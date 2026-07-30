package kotlinx.coroutines.flow;

import com.realsil.sdk.dfu.DfuException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__ZipKt {

    public static final class a implements e {
        final /* synthetic */ e $flow$inlined;
        final /* synthetic */ e $this_combine$inlined;
        final /* synthetic */ f6.q $transform$inlined;

        public a(e eVar, e eVar2, f6.q qVar) {
            this.$this_combine$inlined = eVar;
            this.$flow$inlined = eVar2;
            this.$transform$inlined = qVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object combineInternal = CombineKt.combineInternal(fVar, new e[]{this.$this_combine$inlined, this.$flow$inlined}, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new FlowKt__ZipKt$combine$1$1(this.$transform$inlined, null), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return combineInternal == coroutine_suspended ? combineInternal : y5.w.INSTANCE;
        }
    }

    public static final <T1, T2, R> e combine(e eVar, e eVar2, f6.q qVar) {
        return g.flowCombine(eVar, eVar2, qVar);
    }

    public static final /* synthetic */ <T, R> e combineTransform(e[] eVarArr, f6.q qVar) {
        kotlin.jvm.internal.s.needClassReification();
        return g.flow(new FlowKt__ZipKt$combineTransform$6(eVarArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> e combineTransformUnsafe$FlowKt__ZipKt(e[] eVarArr, f6.q qVar) {
        kotlin.jvm.internal.s.needClassReification();
        return g.flow(new FlowKt__ZipKt$combineTransformUnsafe$1(eVarArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> e combineUnsafe$FlowKt__ZipKt(e[] eVarArr, f6.p pVar) {
        kotlin.jvm.internal.s.needClassReification();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(eVarArr, pVar);
    }

    public static final <T1, T2, R> e flowCombine(e eVar, e eVar2, f6.q qVar) {
        return new a(eVar, eVar2, qVar);
    }

    public static final <T1, T2, R> e flowCombineTransform(e eVar, e eVar2, f6.r rVar) {
        return g.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new e[]{eVar, eVar2}, null, rVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> f6.a nullArrayFactory$FlowKt__ZipKt() {
        return new f6.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // f6.a
            public final Void invoke() {
                return null;
            }
        };
    }

    public static final <T1, T2, R> e zip(e eVar, e eVar2, f6.q qVar) {
        return CombineKt.zipImpl(eVar, eVar2, qVar);
    }

    public static final /* synthetic */ <T, R> e combine(Iterable<? extends e> iterable, f6.p pVar) {
        e[] eVarArr = (e[]) CollectionsKt___CollectionsKt.toList(iterable).toArray(new e[0]);
        kotlin.jvm.internal.s.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(eVarArr, pVar);
    }

    public static final /* synthetic */ <T, R> e combineTransform(Iterable<? extends e> iterable, f6.q qVar) {
        e[] eVarArr = (e[]) CollectionsKt___CollectionsKt.toList(iterable).toArray(new e[0]);
        kotlin.jvm.internal.s.needClassReification();
        return g.flow(new FlowKt__ZipKt$combineTransform$7(eVarArr, qVar, null));
    }

    public static final <T1, T2, T3, R> e combine(e eVar, e eVar2, e eVar3, final f6.r rVar) {
        final e[] eVarArr = {eVar, eVar2, eVar3};
        return new e() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements f6.q {
                final /* synthetic */ f6.r $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, f6.r rVar) {
                    super(3, cVar);
                    this.$transform$inlined = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    f fVar;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    int i8 = this.label;
                    if (i8 == 0) {
                        y5.g.throwOnFailure(obj);
                        fVar = (f) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        f6.r rVar = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.L$0 = fVar;
                        this.label = 1;
                        kotlin.jvm.internal.r.mark(6);
                        obj = rVar.invoke(obj2, obj3, obj4, this);
                        kotlin.jvm.internal.r.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj);
                            return y5.w.INSTANCE;
                        }
                        fVar = (f) this.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (fVar.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return y5.w.INSTANCE;
                }

                @Override // f6.q
                public final Object invoke(f fVar, Object[] objArr, kotlin.coroutines.c cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.$transform$inlined);
                    anonymousClass2.L$0 = fVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(y5.w.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object combineInternal = CombineKt.combineInternal(fVar, eVarArr, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new AnonymousClass2(null, rVar), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return combineInternal == coroutine_suspended ? combineInternal : y5.w.INSTANCE;
            }
        };
    }

    public static final <T1, T2, R> e combineTransform(e eVar, e eVar2, f6.r rVar) {
        return g.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new e[]{eVar, eVar2}, null, rVar));
    }

    public static final <T1, T2, T3, T4, R> e combine(e eVar, e eVar2, e eVar3, e eVar4, final f6.s sVar) {
        final e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        return new e() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements f6.q {
                final /* synthetic */ f6.s $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.c cVar, f6.s sVar) {
                    super(3, cVar);
                    this.$transform$inlined = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    f fVar;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    int i8 = this.label;
                    if (i8 == 0) {
                        y5.g.throwOnFailure(obj);
                        fVar = (f) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        f6.s sVar = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.L$0 = fVar;
                        this.label = 1;
                        kotlin.jvm.internal.r.mark(6);
                        obj = sVar.invoke(obj2, obj3, obj4, obj5, this);
                        kotlin.jvm.internal.r.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj);
                            return y5.w.INSTANCE;
                        }
                        fVar = (f) this.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (fVar.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return y5.w.INSTANCE;
                }

                @Override // f6.q
                public final Object invoke(f fVar, Object[] objArr, kotlin.coroutines.c cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.$transform$inlined);
                    anonymousClass2.L$0 = fVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(y5.w.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object combineInternal = CombineKt.combineInternal(fVar, eVarArr, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new AnonymousClass2(null, sVar), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return combineInternal == coroutine_suspended ? combineInternal : y5.w.INSTANCE;
            }
        };
    }

    public static final <T1, T2, T3, R> e combineTransform(e eVar, e eVar2, e eVar3, f6.s sVar) {
        return g.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new e[]{eVar, eVar2, eVar3}, null, sVar));
    }

    public static final <T1, T2, T3, T4, T5, R> e combine(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, final f6.t tVar) {
        final e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        return new e(eVarArr, tVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3
            final /* synthetic */ e[] $flows$inlined;
            final /* synthetic */ f6.t $transform$inlined$1;

            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements f6.q {
                final /* synthetic */ f6.t $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass2(kotlin.coroutines.c cVar, f6.t tVar) {
                    super(3, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            f fVar = (f) this.L$0;
                            y5.g.throwOnFailure(obj);
                            this.L$0 = null;
                            this.label = 2;
                            if (fVar.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj);
                        }
                        return y5.w.INSTANCE;
                    }
                    y5.g.throwOnFailure(obj);
                    f fVar2 = (f) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.L$0 = fVar2;
                    this.label = 1;
                    kotlin.jvm.internal.r.mark(6);
                    throw null;
                }

                @Override // f6.q
                public final Object invoke(f fVar, Object[] objArr, kotlin.coroutines.c cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, null);
                    anonymousClass2.L$0 = fVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(y5.w.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
            public Object collect(f fVar, kotlin.coroutines.c cVar) {
                Object coroutine_suspended;
                Object combineInternal = CombineKt.combineInternal(fVar, this.$flows$inlined, FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt(), new AnonymousClass2(null, null), cVar);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                return combineInternal == coroutine_suspended ? combineInternal : y5.w.INSTANCE;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> e combineTransform(e eVar, e eVar2, e eVar3, e eVar4, f6.t tVar) {
        return g.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new e[]{eVar, eVar2, eVar3, eVar4}, null, tVar));
    }

    public static final /* synthetic */ <T, R> e combine(e[] eVarArr, f6.p pVar) {
        kotlin.jvm.internal.s.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(eVarArr, pVar);
    }

    public static final <T1, T2, T3, T4, T5, R> e combineTransform(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, f6.u uVar) {
        return g.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new e[]{eVar, eVar2, eVar3, eVar4, eVar5}, null, uVar));
    }
}
