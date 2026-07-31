package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicTextField.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BasicTextFieldKt {
    public static final ComposableSingletons$BasicTextFieldKt INSTANCE = new ComposableSingletons$BasicTextFieldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3 f0lambda1 = ComposableLambdaKt.composableLambdaInstance(434140383, false, new Function3() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget
        public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= composer.changed(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                innerTextField.invoke(composer, Integer.valueOf(i & 14));
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3 f1lambda2 = ComposableLambdaKt.composableLambdaInstance(-34833998, false, new Function3() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget
        public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= composer.changed(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                innerTextField.invoke(composer, Integer.valueOf(i & 14));
            }
        }
    });

    /* renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function3 m523getLambda1$foundation_release() {
        return f0lambda1;
    }

    /* renamed from: getLambda-2$foundation_release, reason: not valid java name */
    public final Function3 m524getLambda2$foundation_release() {
        return f1lambda2;
    }
}
