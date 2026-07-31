package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TransformableKt$transformable$2 extends Lambda implements Function3 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ TransformableState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$transformable$2(TransformableState transformableState, boolean z, boolean z2) {
        super(3);
        this.$state = transformableState;
        this.$lockRotationOnZoomPan = z;
        this.$enabled = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1509335853);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$state, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$lockRotationOnZoomPan), composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new TransformableKt$transformable$2$block$1$1(rememberUpdatedState2, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, Unit.INSTANCE, (Function2) rememberedValue) : Modifier.INSTANCE;
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
