package androidx.compose.material.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$ExposedDropdownMenuPopupKt {
    public static final ComposableSingletons$ExposedDropdownMenuPopupKt INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopupKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2 f14lambda1 = ComposableLambdaKt.composableLambdaInstance(-1627646060, false, new Function2() { // from class: androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2 m1057getLambda1$material_release() {
        return f14lambda1;
    }
}
