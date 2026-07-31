package androidx.compose.ui.window;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPopup.android.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AndroidPopup_androidKt {
    public static final ComposableSingletons$AndroidPopup_androidKt INSTANCE = new ComposableSingletons$AndroidPopup_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2 f19lambda1 = ComposableLambdaKt.composableLambdaInstance(-1131826196, false, new Function2() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda-1$1
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

    /* renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final Function2 m2627getLambda1$ui_release() {
        return f19lambda1;
    }
}
