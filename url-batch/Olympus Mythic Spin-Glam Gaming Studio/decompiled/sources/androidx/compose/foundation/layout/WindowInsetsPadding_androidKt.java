package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsetsPadding.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "displayCutoutPadding", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WindowInsetsPadding_androidKt {
    public static final Modifier displayCutoutPadding(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("displayCutoutPadding");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getDisplayCutout(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }
}
