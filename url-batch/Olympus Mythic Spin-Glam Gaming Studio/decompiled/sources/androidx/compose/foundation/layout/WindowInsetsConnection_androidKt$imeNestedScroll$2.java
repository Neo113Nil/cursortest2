package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends Lambda implements Function3 {
    public static final WindowInsetsConnection_androidKt$imeNestedScroll$2 INSTANCE = new WindowInsetsConnection_androidKt$imeNestedScroll$2();

    WindowInsetsConnection_androidKt$imeNestedScroll$2() {
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
        composer.startReplaceableGroup(-369978792);
        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(composed, WindowInsetsConnection_androidKt.m369rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.INSTANCE.current(composer, 8).getIme(), WindowInsetsSides.INSTANCE.m389getBottomJoeWqyM(), composer, 48), null, 2, null);
        composer.endReplaceableGroup();
        return nestedScroll$default;
    }
}
