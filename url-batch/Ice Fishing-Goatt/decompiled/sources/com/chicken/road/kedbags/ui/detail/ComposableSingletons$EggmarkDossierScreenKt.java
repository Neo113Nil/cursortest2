package com.chicken.road.kedbags.ui.detail;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EggmarkDossierScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$EggmarkDossierScreenKt {
    public static final ComposableSingletons$EggmarkDossierScreenKt INSTANCE = new ComposableSingletons$EggmarkDossierScreenKt();

    /* renamed from: lambda$-1984350404, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f64lambda$1984350404 = ComposableLambdaKt.composableLambdaInstance(-1984350404, false, new Function3() { // from class: com.chicken.road.kedbags.ui.detail.ComposableSingletons$EggmarkDossierScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$EggmarkDossierScreenKt.lambda__1984350404$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-367171671, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f65lambda$367171671 = ComposableLambdaKt.composableLambdaInstance(-367171671, false, new Function3() { // from class: com.chicken.road.kedbags.ui.detail.ComposableSingletons$EggmarkDossierScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$EggmarkDossierScreenKt.lambda__367171671$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$103614294 = ComposableLambdaKt.composableLambdaInstance(103614294, false, new Function2() { // from class: com.chicken.road.kedbags.ui.detail.ComposableSingletons$EggmarkDossierScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EggmarkDossierScreenKt.lambda_103614294$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1984350404$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6560getLambda$1984350404$app() {
        return f64lambda$1984350404;
    }

    /* renamed from: getLambda$-367171671$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6561getLambda$367171671$app() {
        return f65lambda$367171671;
    }

    public final Function2<Composer, Integer, Unit> getLambda$103614294$app() {
        return lambda$103614294;
    }

    static final Unit lambda__1984350404$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C56@2879L29,56@2874L35:EggmarkDossierScreen.kt#ousbnu");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1984350404, i, -1, "com.chicken.road.kedbags.ui.detail.ComposableSingletons$EggmarkDossierScreenKt.lambda$-1984350404.<anonymous> (EggmarkDossierScreen.kt:56)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.back, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda__367171671$lambda$1(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C87@5296L39,87@5291L45:EggmarkDossierScreen.kt#ousbnu");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-367171671, i, -1, "com.chicken.road.kedbags.ui.detail.ComposableSingletons$EggmarkDossierScreenKt.lambda$-367171671.<anonymous> (EggmarkDossierScreen.kt:87)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.copy_road_note, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit lambda_103614294$lambda$2(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C89@5512L41,89@5507L47:EggmarkDossierScreen.kt#ousbnu");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(103614294, i, -1, "com.chicken.road.kedbags.ui.detail.ComposableSingletons$EggmarkDossierScreenKt.lambda$103614294.<anonymous> (EggmarkDossierScreen.kt:89)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.note_placeholder, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
