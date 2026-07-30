package com.chicken.road.kedbags.ui.catalog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.chicken.road.kedbags.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShellRunLedgerScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$ShellRunLedgerScreenKt {
    public static final ComposableSingletons$ShellRunLedgerScreenKt INSTANCE = new ComposableSingletons$ShellRunLedgerScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2038090065 = ComposableLambdaKt.composableLambdaInstance(2038090065, false, new Function3() { // from class: com.chicken.road.kedbags.ui.catalog.ComposableSingletons$ShellRunLedgerScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ShellRunLedgerScreenKt.lambda_2038090065$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$388671802 = ComposableLambdaKt.composableLambdaInstance(388671802, false, new Function3() { // from class: com.chicken.road.kedbags.ui.catalog.ComposableSingletons$ShellRunLedgerScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ShellRunLedgerScreenKt.lambda_388671802$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1867172023 = ComposableLambdaKt.composableLambdaInstance(1867172023, false, new Function3() { // from class: com.chicken.road.kedbags.ui.catalog.ComposableSingletons$ShellRunLedgerScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ShellRunLedgerScreenKt.lambda_1867172023$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1867172023$app() {
        return lambda$1867172023;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2038090065$app() {
        return lambda$2038090065;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$388671802$app() {
        return lambda$388671802;
    }

    static final Unit lambda_2038090065$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C51@2845L29,51@2840L35:ShellRunLedgerScreen.kt#ref9mo");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2038090065, i, -1, "com.chicken.road.kedbags.ui.catalog.ComposableSingletons$ShellRunLedgerScreenKt.lambda$2038090065.<anonymous> (ShellRunLedgerScreen.kt:51)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.back, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_388671802$lambda$1(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C65@3720L35,65@3715L41:ShellRunLedgerScreen.kt#ref9mo");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(388671802, i, -1, "com.chicken.road.kedbags.ui.catalog.ComposableSingletons$ShellRunLedgerScreenKt.lambda$388671802.<anonymous> (ShellRunLedgerScreen.kt:65)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.clear_glow, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_1867172023$lambda$2(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C87@5337L34,87@5332L40:ShellRunLedgerScreen.kt#ref9mo");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867172023, i, -1, "com.chicken.road.kedbags.ui.catalog.ComposableSingletons$ShellRunLedgerScreenKt.lambda$1867172023.<anonymous> (ShellRunLedgerScreen.kt:87)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.read_mark, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
