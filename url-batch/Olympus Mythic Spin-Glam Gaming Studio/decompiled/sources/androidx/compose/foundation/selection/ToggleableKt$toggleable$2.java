package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ToggleableKt$toggleable$2 extends Lambda implements Function3 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ Role $role;
    final /* synthetic */ boolean $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToggleableKt$toggleable$2(boolean z, boolean z2, Role role, Function1 function1) {
        super(3);
        this.$value = z;
        this.$enabled = z2;
        this.$role = role;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Modifier m501toggleableImpl3WzHGRc;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(290332169);
        ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(this.$value);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        boolean z = this.$enabled;
        Role role = this.$role;
        final Function1 function1 = this.$onValueChange;
        final boolean z2 = this.$value;
        m501toggleableImpl3WzHGRc = ToggleableKt.m501toggleableImpl3WzHGRc(composed, ToggleableState, z, role, mutableInteractionSource, indication, new Function0() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m503invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m503invoke() {
                Function1.this.invoke(Boolean.valueOf(!z2));
            }
        });
        composer.endReplaceableGroup();
        return m501toggleableImpl3WzHGRc;
    }
}
