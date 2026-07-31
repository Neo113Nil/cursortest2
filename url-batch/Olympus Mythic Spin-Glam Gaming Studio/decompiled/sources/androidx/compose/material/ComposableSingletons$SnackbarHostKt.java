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

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3 f11lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, new Function3() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull SnackbarData it, @Nullable Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(it) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                SnackbarKt.m971SnackbarsPrSdHI(it, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, 254);
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3 m826getLambda1$material_release() {
        return f11lambda1;
    }
}
