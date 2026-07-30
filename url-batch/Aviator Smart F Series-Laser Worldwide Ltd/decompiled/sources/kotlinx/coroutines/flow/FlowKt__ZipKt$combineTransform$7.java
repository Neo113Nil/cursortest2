package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.internal.CombineKt;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combineTransform$7 extends SuspendLambda implements f6.p {
    final /* synthetic */ e[] $flowArray;
    final /* synthetic */ f6.q $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements f6.a {
        final /* synthetic */ e[] $flowArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e[] eVarArr) {
            super(0);
            this.$flowArray = eVarArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
        @Override // f6.a
        public final T[] invoke() {
            int length = this.$flowArray.length;
            kotlin.jvm.internal.s.reifiedOperationMarker(0, "T?");
            return new Object[length];
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements f6.q {
        final /* synthetic */ f6.q $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f6.q qVar, kotlin.coroutines.c cVar) {
            super(3, cVar);
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                f fVar = (f) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                f6.q qVar = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (qVar.invoke(fVar, objArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            return y5.w.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((f) this.L$0, (Object[]) this.L$1, this);
            return y5.w.INSTANCE;
        }

        @Override // f6.q
        public final Object invoke(f fVar, T[] tArr, kotlin.coroutines.c cVar) {
            kotlin.jvm.internal.s.needClassReification();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, cVar);
            anonymousClass2.L$0 = fVar;
            anonymousClass2.L$1 = tArr;
            return anonymousClass2.invokeSuspend(y5.w.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$7(e[] eVarArr, f6.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$flowArray = eVarArr;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.$flowArray, this.$transform, cVar);
        flowKt__ZipKt$combineTransform$7.L$0 = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            f fVar = (f) this.L$0;
            e[] eVarArr = this.$flowArray;
            kotlin.jvm.internal.s.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
            kotlin.jvm.internal.s.needClassReification();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
            this.label = 1;
            if (CombineKt.combineInternal(fVar, eVarArr, anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return y5.w.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        f fVar = (f) this.L$0;
        e[] eVarArr = this.$flowArray;
        kotlin.jvm.internal.s.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
        kotlin.jvm.internal.s.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
        kotlin.jvm.internal.r.mark(0);
        CombineKt.combineInternal(fVar, eVarArr, anonymousClass1, anonymousClass2, this);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(f fVar, kotlin.coroutines.c cVar) {
        return ((FlowKt__ZipKt$combineTransform$7) create(fVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
