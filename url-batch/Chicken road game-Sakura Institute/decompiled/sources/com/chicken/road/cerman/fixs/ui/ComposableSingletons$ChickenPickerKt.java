package com.chicken.road.cerman.fixs.ui;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ChickenPicker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ChickenPickerKt {
    public static final ComposableSingletons$ChickenPickerKt INSTANCE = new ComposableSingletons$ChickenPickerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f67lambda1 = ComposableLambdaKt.composableLambdaInstance(225955342, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.ComposableSingletons$ChickenPickerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(225955342, i, -1, "com.chicken.road.cerman.fixs.ui.ComposableSingletons$ChickenPickerKt.lambda-1.<anonymous> (ChickenPicker.kt:44)");
            }
            TextKt.m2373Text4IGK_g("Whole flock", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6679getLambda1$app_release() {
        return f67lambda1;
    }
}
