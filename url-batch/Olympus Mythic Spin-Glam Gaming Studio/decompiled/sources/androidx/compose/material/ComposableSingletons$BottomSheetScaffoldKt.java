package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3 f6lambda1 = ComposableLambdaKt.composableLambdaInstance(895288908, false, new Function3() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull SnackbarHostState it, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 14) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                SnackbarHostKt.SnackbarHost(it, null, null, composer, i & 14, 6);
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3 m821getLambda1$material_release() {
        return f6lambda1;
    }
}
