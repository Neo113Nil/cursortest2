package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicText.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$BasicTextKt {
    public static final ComposableSingletons$BasicTextKt INSTANCE = new ComposableSingletons$BasicTextKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2 f2lambda1 = ComposableLambdaKt.composableLambdaInstance(1699492330, false, new Function2() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextKt$lambda-1$1
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

    /* renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function2 m525getLambda1$foundation_release() {
        return f2lambda1;
    }
}
