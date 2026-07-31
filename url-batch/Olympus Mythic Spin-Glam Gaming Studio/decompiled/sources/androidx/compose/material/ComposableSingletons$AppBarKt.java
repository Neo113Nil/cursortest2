package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$AppBarKt {
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3 f4lambda1 = ComposableLambdaKt.composableLambdaInstance(-771938130, false, new Function3() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3 m819getLambda1$material_release() {
        return f4lambda1;
    }
}
