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

/* compiled from: BackdropScaffold.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$BackdropScaffoldKt {
    public static final ComposableSingletons$BackdropScaffoldKt INSTANCE = new ComposableSingletons$BackdropScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3 f5lambda1 = ComposableLambdaKt.composableLambdaInstance(229445492, false, new Function3() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1
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
    public final Function3 m820getLambda1$material_release() {
        return f5lambda1;
    }
}
