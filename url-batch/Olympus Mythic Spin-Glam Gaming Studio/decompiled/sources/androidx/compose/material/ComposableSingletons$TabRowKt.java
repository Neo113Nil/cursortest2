package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$TabRowKt {
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2 f12lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, new Function2() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TabRowDefaults.INSTANCE.m1016Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2 f13lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, new Function2() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TabRowDefaults.INSTANCE.m1016Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2 m827getLambda1$material_release() {
        return f12lambda1;
    }

    /* renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2 m828getLambda2$material_release() {
        return f13lambda2;
    }
}
