package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.Nullable;

/* compiled from: NestedScrollModifier.kt */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b+\u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostFling", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "calculateNestedScrollScope", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "originNestedScrollScope", "Lkotlinx/coroutines/CoroutineScope;", "getOriginNestedScrollScope$ui_release", "()Lkotlinx/coroutines/CoroutineScope;", "setOriginNestedScrollScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParent$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getCoroutineScope", "coroutineScope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NestedScrollDispatcher {
    private Function0 calculateNestedScrollScope = new Function0() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final CoroutineScope mo4828invoke() {
            return NestedScrollDispatcher.this.getOriginNestedScrollScope();
        }
    };
    private CoroutineScope originNestedScrollScope;
    private NestedScrollConnection parent;

    public final void setCalculateNestedScrollScope$ui_release(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.calculateNestedScrollScope = function0;
    }

    /* renamed from: getOriginNestedScrollScope$ui_release, reason: from getter */
    public final CoroutineScope getOriginNestedScrollScope() {
        return this.originNestedScrollScope;
    }

    public final void setOriginNestedScrollScope$ui_release(CoroutineScope coroutineScope) {
        this.originNestedScrollScope = coroutineScope;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = (CoroutineScope) this.calculateNestedScrollScope.mo4828invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void setParent$ui_release(NestedScrollConnection nestedScrollConnection) {
        this.parent = nestedScrollConnection;
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m1824dispatchPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection nestedScrollConnection = this.parent;
        return nestedScrollConnection != null ? nestedScrollConnection.mo374onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m1308getZeroF1C5BW0();
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m1822dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        NestedScrollConnection nestedScrollConnection = this.parent;
        return nestedScrollConnection != null ? nestedScrollConnection.mo277onPostScrollDzOQY0M(consumed, available, source) : Offset.INSTANCE.m1308getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1823dispatchPreFlingQWom1Mo(long j, Continuation continuation) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long m2612getZero9UxMQ8M;
        if (continuation instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuation;
            int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nestedScrollDispatcher$dispatchPreFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection nestedScrollConnection = this.parent;
                    if (nestedScrollConnection == null) {
                        m2612getZero9UxMQ8M = Velocity.INSTANCE.m2612getZero9UxMQ8M();
                        return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                    obj = nestedScrollConnection.mo373onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m2612getZero9UxMQ8M = ((Velocity) obj).getPackedValue();
                return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuation);
        Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i != 0) {
        }
        m2612getZero9UxMQ8M = ((Velocity) obj2).getPackedValue();
        return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1821dispatchPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long m2612getZero9UxMQ8M;
        if (continuation instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuation;
            int i2 = nestedScrollDispatcher$dispatchPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label = i2 - Integer.MIN_VALUE;
                NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                Object obj = nestedScrollDispatcher$dispatchPostFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPostFling$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection nestedScrollConnection = this.parent;
                    if (nestedScrollConnection == null) {
                        m2612getZero9UxMQ8M = Velocity.INSTANCE.m2612getZero9UxMQ8M();
                        return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                    obj = nestedScrollConnection.mo276onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m2612getZero9UxMQ8M = ((Velocity) obj).getPackedValue();
                return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuation);
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPostFling$122.label;
        if (i != 0) {
        }
        m2612getZero9UxMQ8M = ((Velocity) obj2).getPackedValue();
        return Velocity.m2599boximpl(m2612getZero9UxMQ8M);
    }
}
