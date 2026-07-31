package androidx.compose.ui.focus;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusModifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FocusModifierKt$focusModifier$2 extends Lambda implements Function3 {
    public static final FocusModifierKt$focusModifier$2 INSTANCE = new FocusModifierKt$focusModifier$2();

    FocusModifierKt$focusModifier$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1810534337);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final FocusModifier focusModifier = (FocusModifier) rememberedValue;
        EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.focus.FocusModifierKt$focusModifier$2.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m1262invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1262invoke() {
                FocusTransactionsKt.sendOnFocusEvent(FocusModifier.this);
            }
        }, composer, 0);
        Modifier focusTarget = FocusModifierKt.focusTarget(composed, focusModifier);
        composer.endReplaceableGroup();
        return focusTarget;
    }
}
