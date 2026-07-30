package kotlinx.coroutines.flow.internal;

import f6.p;
import f6.q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.c0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.n2;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes5.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements p {
    final /* synthetic */ f6.a $arrayFactory;
    final /* synthetic */ kotlinx.coroutines.flow.e[] $flows;
    final /* synthetic */ kotlinx.coroutines.flow.f $this_combineInternal;
    final /* synthetic */ q $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ kotlinx.coroutines.flow.e[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ kotlinx.coroutines.channels.b $resultChannel;
        int label;

        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C03681 implements kotlinx.coroutines.flow.f {
            final /* synthetic */ int $i;
            final /* synthetic */ kotlinx.coroutines.channels.b $resultChannel;

            C03681(kotlinx.coroutines.channels.b bVar, int i8) {
                this.$resultChannel = bVar;
                this.$i = i8;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                Object coroutine_suspended;
                int i8;
                if (cVar instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) cVar;
                    int i9 = combineKt$combineInternal$2$1$1$emit$1.label;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                        Object obj2 = combineKt$combineInternal$2$1$1$emit$1.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                        i8 = combineKt$combineInternal$2$1$1$emit$1.label;
                        if (i8 != 0) {
                            y5.g.throwOnFailure(obj2);
                            kotlinx.coroutines.channels.b bVar = this.$resultChannel;
                            c0 c0Var = new c0(this.$i, obj);
                            combineKt$combineInternal$2$1$1$emit$1.label = 1;
                            if (bVar.send(c0Var, combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y5.g.throwOnFailure(obj2);
                                return w.INSTANCE;
                            }
                            y5.g.throwOnFailure(obj2);
                        }
                        combineKt$combineInternal$2$1$1$emit$1.label = 2;
                        if (n2.yield(combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return w.INSTANCE;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                Object obj22 = combineKt$combineInternal$2$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i8 != 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
                if (n2.yield(combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                }
                return w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.flow.e[] eVarArr, int i8, AtomicInteger atomicInteger, kotlinx.coroutines.channels.b bVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$flows = eVarArr;
            this.$i = i8;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            AtomicInteger atomicInteger;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    kotlinx.coroutines.flow.e[] eVarArr = this.$flows;
                    int i9 = this.$i;
                    kotlinx.coroutines.flow.e eVar = eVarArr[i9];
                    C03681 c03681 = new C03681(this.$resultChannel, i9);
                    this.label = 1;
                    if (eVar.collect(c03681, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    l.a.close$default(this.$resultChannel, null, 1, null);
                }
                return w.INSTANCE;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    l.a.close$default(this.$resultChannel, null, 1, null);
                }
            }
        }

        @Override // f6.p
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombineKt$combineInternal$2(kotlinx.coroutines.flow.e[] eVarArr, f6.a aVar, q qVar, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$flows = eVarArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, cVar);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5 A[LOOP:0: B:17:0x00e5->B:38:?, LOOP_START, PHI: r6 r10
      0x00e5: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:14:0x00e0, B:38:?] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r10v8 kotlin.collections.c0) = (r10v7 kotlin.collections.c0), (r10v21 kotlin.collections.c0) binds: [B:14:0x00e0, B:38:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x012d -> B:8:0x00c2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object[] objArr;
        byte b8;
        byte[] bArr;
        CombineKt$combineInternal$2 combineKt$combineInternal$2;
        int i8;
        kotlinx.coroutines.channels.b bVar;
        byte b9;
        Object obj2;
        Object[] objArr2;
        c0 c0Var;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        int i10 = 2;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            int length = this.$flows.length;
            if (length == 0) {
                return w.INSTANCE;
            }
            objArr = new Object[length];
            kotlin.collections.k.fill$default(objArr, l.UNINITIALIZED, 0, 0, 6, (Object) null);
            kotlinx.coroutines.channels.b Channel$default = kotlinx.coroutines.channels.d.Channel$default(length, null, null, 6, null);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            b8 = 0;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11;
                kotlinx.coroutines.i.launch$default(i0Var, null, null, new AnonymousClass1(this.$flows, i12, atomicInteger, Channel$default, null), 3, null);
                i11 = i12 + 1;
                atomicInteger = atomicInteger;
            }
            bArr = new byte[length];
            combineKt$combineInternal$2 = this;
            i8 = length;
            bVar = Channel$default;
        } else if (i9 == 1) {
            ?? r22 = this.I$1;
            i8 = this.I$0;
            byte[] bArr2 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.b bVar2 = (kotlinx.coroutines.channels.b) this.L$1;
            objArr2 = (Object[]) this.L$0;
            y5.g.throwOnFailure(obj);
            obj2 = ((kotlinx.coroutines.channels.e) obj).m1252unboximpl();
            b9 = r22;
            bArr = bArr2;
            bVar = bVar2;
            combineKt$combineInternal$2 = this;
            c0Var = (c0) kotlinx.coroutines.channels.e.m1245getOrNullimpl(obj2);
            if (c0Var != null) {
                return w.INSTANCE;
            }
            do {
                int index = c0Var.getIndex();
                Object obj3 = objArr2[index];
                objArr2[index] = c0Var.getValue();
                if (obj3 == l.UNINITIALIZED) {
                    i8--;
                }
                if (bArr[index] == b9) {
                    break;
                }
                bArr[index] = b9;
                c0Var = (c0) kotlinx.coroutines.channels.e.m1245getOrNullimpl(bVar.mo1233tryReceivePtdJZtk());
            } while (c0Var != null);
            if (i8 != 0) {
                b8 = b9;
                objArr = objArr2;
            } else {
                Object[] objArr3 = (Object[]) combineKt$combineInternal$2.$arrayFactory.invoke();
                if (objArr3 == null) {
                    q qVar = combineKt$combineInternal$2.$transform;
                    kotlinx.coroutines.flow.f fVar = combineKt$combineInternal$2.$this_combineInternal;
                    combineKt$combineInternal$2.L$0 = objArr2;
                    combineKt$combineInternal$2.L$1 = bVar;
                    combineKt$combineInternal$2.L$2 = bArr;
                    combineKt$combineInternal$2.I$0 = i8;
                    combineKt$combineInternal$2.I$1 = b9;
                    combineKt$combineInternal$2.label = i10;
                    if (qVar.invoke(fVar, objArr2, combineKt$combineInternal$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objArr = objArr2;
                    b8 = b9;
                } else {
                    byte b10 = b9;
                    kotlin.collections.k.copyInto$default(objArr2, objArr3, 0, 0, 0, 14, (Object) null);
                    q qVar2 = combineKt$combineInternal$2.$transform;
                    kotlinx.coroutines.flow.f fVar2 = combineKt$combineInternal$2.$this_combineInternal;
                    combineKt$combineInternal$2.L$0 = objArr2;
                    combineKt$combineInternal$2.L$1 = bVar;
                    combineKt$combineInternal$2.L$2 = bArr;
                    combineKt$combineInternal$2.I$0 = i8;
                    combineKt$combineInternal$2.I$1 = b10;
                    combineKt$combineInternal$2.label = 3;
                    if (qVar2.invoke(fVar2, objArr3, combineKt$combineInternal$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    b8 = b10;
                    objArr = objArr2;
                }
            }
            i10 = 2;
        } else if (i9 == 2) {
            ?? r23 = this.I$1;
            i8 = this.I$0;
            byte[] bArr3 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.b bVar3 = (kotlinx.coroutines.channels.b) this.L$1;
            Object[] objArr4 = (Object[]) this.L$0;
            y5.g.throwOnFailure(obj);
            b8 = r23;
            bArr = bArr3;
            bVar = bVar3;
            objArr = objArr4;
            combineKt$combineInternal$2 = this;
        } else {
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r24 = this.I$1;
            i8 = this.I$0;
            byte[] bArr4 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.b bVar4 = (kotlinx.coroutines.channels.b) this.L$1;
            Object[] objArr5 = (Object[]) this.L$0;
            y5.g.throwOnFailure(obj);
            b8 = r24;
            bArr = bArr4;
            bVar = bVar4;
            objArr = objArr5;
            combineKt$combineInternal$2 = this;
            i10 = 2;
        }
        byte b11 = (byte) (b8 + 1);
        combineKt$combineInternal$2.L$0 = objArr;
        combineKt$combineInternal$2.L$1 = bVar;
        combineKt$combineInternal$2.L$2 = bArr;
        combineKt$combineInternal$2.I$0 = i8;
        combineKt$combineInternal$2.I$1 = b11;
        combineKt$combineInternal$2.label = 1;
        obj2 = bVar.mo1232receiveCatchingJP2dKIU(combineKt$combineInternal$2);
        if (obj2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        b9 = b11;
        objArr2 = objArr;
        c0Var = (c0) kotlinx.coroutines.channels.e.m1245getOrNullimpl(obj2);
        if (c0Var != null) {
        }
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((CombineKt$combineInternal$2) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
