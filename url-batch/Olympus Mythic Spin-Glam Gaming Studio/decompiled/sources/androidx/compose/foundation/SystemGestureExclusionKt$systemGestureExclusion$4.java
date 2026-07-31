package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SystemGestureExclusion.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class SystemGestureExclusionKt$systemGestureExclusion$4 extends Lambda implements Function3 {
    final /* synthetic */ Function1 $exclusion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SystemGestureExclusionKt$systemGestureExclusion$4(Function1 function1) {
        super(3);
        this.$exclusion = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(108999);
        Function1 function1 = this.$exclusion;
        composer.startReplaceableGroup(202618556);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(view) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new ExcludeFromSystemGestureModifier(view, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier = (ExcludeFromSystemGestureModifier) rememberedValue;
        EffectsKt.DisposableEffect(excludeFromSystemGestureModifier, new SystemGestureExclusionKt$excludeFromSystemGestureR$1(excludeFromSystemGestureModifier), composer, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return excludeFromSystemGestureModifier;
    }
}
