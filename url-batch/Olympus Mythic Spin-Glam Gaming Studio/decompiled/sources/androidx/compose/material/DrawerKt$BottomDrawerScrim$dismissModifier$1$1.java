package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$1$1", f = "Drawer.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawerScrim$dismissModifier$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function0 $onDismiss;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawerKt$BottomDrawerScrim$dismissModifier$1$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$onDismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        DrawerKt$BottomDrawerScrim$dismissModifier$1$1 drawerKt$BottomDrawerScrim$dismissModifier$1$1 = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(this.$onDismiss, continuation);
        drawerKt$BottomDrawerScrim$dismissModifier$1$1.L$0 = obj;
        return drawerKt$BottomDrawerScrim$dismissModifier$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((DrawerKt$BottomDrawerScrim$dismissModifier$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final Function0 function0 = this.$onDismiss;
            Function1 function1 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$1$1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m854invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m854invokek4lQ0M(long j) {
                    Function0.this.mo4828invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, function1, this, 7, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
