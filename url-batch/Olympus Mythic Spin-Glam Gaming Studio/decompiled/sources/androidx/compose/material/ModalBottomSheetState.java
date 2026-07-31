package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.ironsource.C4643f8;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModalBottomSheet.kt */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0010\u001a\u00020\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "", "isSkipHalfExpanded", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "", "halfExpand$material_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand", "expand$material_release", n.e, "hide", "Z", "isSkipHalfExpanded$material_release", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", C4643f8.k, "getHasHalfExpandedState$material_release", "hasHalfExpandedState", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes12.dex */
public final class ModalBottomSheetState extends SwipeableState<ModalBottomSheetValue> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isSkipHalfExpanded;
    private final NestedScrollConnection nestedScrollConnection;

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke", "(Landroidx/compose/material/ModalBottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetState$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: isSkipHalfExpanded$material_release, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec animationSpec, boolean z, Function1 confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.isSkipHalfExpanded = z;
        if (z && initialValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
        this.nestedScrollConnection = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public final boolean isVisible() {
        return getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return getAnchors$material_release().values().contains(ModalBottomSheetValue.HalfExpanded);
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke", "(Landroidx/compose/material/ModalBottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetState$2, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass2 extends Lambda implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public final Object halfExpand$material_release(Continuation continuation) {
        if (!getHasHalfExpandedState$material_release()) {
            return Unit.INSTANCE;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.HalfExpanded, null, continuation, 2, null);
        return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
    }

    public final Object expand$material_release(Continuation continuation) {
        Object animateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.Expanded, null, continuation, 2, null);
        return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
    }

    public final Object hide(Continuation continuation) {
        Object animateTo$default = SwipeableState.animateTo$default(this, ModalBottomSheetValue.Hidden, null, continuation, 2, null);
        return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
    }

    /* renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "", "skipHalfExpanded", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver Saver(final AnimationSpec animationSpec, final boolean skipHalfExpanded, final Function1 confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(new Function2() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final ModalBottomSheetValue invoke(@NotNull SaverScope Saver, @NotNull ModalBottomSheetState it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (ModalBottomSheetValue) it.getCurrentValue();
                }
            }, new Function1() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final ModalBottomSheetState invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ModalBottomSheetState(it, animationSpec, skipHalfExpanded, confirmStateChange);
                }
            });
        }
    }
}
