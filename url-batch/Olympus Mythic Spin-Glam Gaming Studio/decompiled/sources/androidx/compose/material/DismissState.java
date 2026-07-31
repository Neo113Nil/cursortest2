package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeToDismiss.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes11.dex */
public final class DismissState extends SwipeableState<DismissValue> {

    /* compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DismissValue;", "invoke", "(Landroidx/compose/material/DismissValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DismissState$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DismissValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissState(DismissValue initialValue, Function1 confirmStateChange) {
        super(initialValue, null, confirmStateChange, 2, null);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }
}
