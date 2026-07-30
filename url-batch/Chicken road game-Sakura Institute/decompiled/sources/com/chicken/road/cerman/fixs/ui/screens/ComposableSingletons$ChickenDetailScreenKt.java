package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ChickenDetailScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ChickenDetailScreenKt {
    public static final ComposableSingletons$ChickenDetailScreenKt INSTANCE = new ComposableSingletons$ChickenDetailScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f72lambda1 = ComposableLambdaKt.composableLambdaInstance(-1791179157, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$ChickenDetailScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1791179157, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$ChickenDetailScreenKt.lambda-1.<anonymous> (ChickenDetailScreen.kt:75)");
            }
            IconKt.m1830Iconww6aTOc(EditKt.getEdit(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f73lambda2 = ComposableLambdaKt.composableLambdaInstance(-853165918, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$ChickenDetailScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(-853165918, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$ChickenDetailScreenKt.lambda-2.<anonymous> (ChickenDetailScreen.kt:81)");
            }
            IconKt.m1830Iconww6aTOc(DeleteKt.getDelete(Icons.Filled.INSTANCE), (String) null, (Modifier) null, ThemeKt.getBrick(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f74lambda3 = ComposableLambdaKt.composableLambdaInstance(-2036754679, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$ChickenDetailScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(-2036754679, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$ChickenDetailScreenKt.lambda-3.<anonymous> (ChickenDetailScreen.kt:286)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6690getLambda1$app_release() {
        return f72lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6691getLambda2$app_release() {
        return f73lambda2;
    }

    /* renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6692getLambda3$app_release() {
        return f74lambda3;
    }
}
