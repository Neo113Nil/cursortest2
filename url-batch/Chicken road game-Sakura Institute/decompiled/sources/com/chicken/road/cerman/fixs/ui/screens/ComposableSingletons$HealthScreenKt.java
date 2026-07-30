package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.unit.Dp;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$HealthScreenKt {
    public static final ComposableSingletons$HealthScreenKt INSTANCE = new ComposableSingletons$HealthScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f107lambda1 = ComposableLambdaKt.composableLambdaInstance(260467691, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(260467691, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-1.<anonymous> (HealthScreen.kt:86)");
            }
            IconKt.m1830Iconww6aTOc(AddKt.getAdd(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f115lambda2 = ComposableLambdaKt.composableLambdaInstance(-1936338924, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(-1936338924, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-2.<anonymous> (HealthScreen.kt:93)");
            }
            TextKt.m2373Text4IGK_g("Vaccinations", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f116lambda3 = ComposableLambdaKt.composableLambdaInstance(805778557, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(805778557, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-3.<anonymous> (HealthScreen.kt:94)");
            }
            TextKt.m2373Text4IGK_g("Weight", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f117lambda4 = ComposableLambdaKt.composableLambdaInstance(1356135479, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1356135479, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-4.<anonymous> (HealthScreen.kt:119)");
            }
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(4)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f118lambda5 = ComposableLambdaKt.composableLambdaInstance(1954544741, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1954544741, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-5.<anonymous> (HealthScreen.kt:141)");
            }
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f119lambda6 = ComposableLambdaKt.composableLambdaInstance(-1379004178, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1379004178, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-6.<anonymous> (HealthScreen.kt:168)");
            }
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f120lambda7 = ComposableLambdaKt.composableLambdaInstance(1786607818, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-7$1
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
                ComposerKt.traceEventStart(1786607818, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-7.<anonymous> (HealthScreen.kt:221)");
            }
            IconKt.m1830Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), "Mark done", (Modifier) null, ThemeKt.getForest(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f121lambda8 = ComposableLambdaKt.composableLambdaInstance(-57973569, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57973569, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-8.<anonymous> (HealthScreen.kt:261)");
            }
            TextKt.m2373Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f122lambda9 = ComposableLambdaKt.composableLambdaInstance(-1675414019, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1675414019, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-9.<anonymous> (HealthScreen.kt:263)");
            }
            TextKt.m2373Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f108lambda10 = ComposableLambdaKt.composableLambdaInstance(-1740692328, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-10$1
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
                ComposerKt.traceEventStart(-1740692328, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-10.<anonymous> (HealthScreen.kt:237)");
            }
            TextKt.m2373Text4IGK_g("Vaccine", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109lambda11 = ComposableLambdaKt.composableLambdaInstance(-1191307917, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-11$1
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
                ComposerKt.traceEventStart(-1191307917, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-11.<anonymous> (HealthScreen.kt:249)");
            }
            TextKt.m2373Text4IGK_g("None", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f110lambda12 = ComposableLambdaKt.composableLambdaInstance(-949829465, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-12$1
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
                ComposerKt.traceEventStart(-949829465, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-12.<anonymous> (HealthScreen.kt:254)");
            }
            TextKt.m2373Text4IGK_g("Notes", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f111lambda13 = ComposableLambdaKt.composableLambdaInstance(2113080768, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-13$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2113080768, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-13.<anonymous> (HealthScreen.kt:284)");
            }
            TextKt.m2373Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-14, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f112lambda14 = ComposableLambdaKt.composableLambdaInstance(-1818420030, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-14$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1818420030, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-14.<anonymous> (HealthScreen.kt:286)");
            }
            TextKt.m2373Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-15, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f113lambda15 = ComposableLambdaKt.composableLambdaInstance(-850694457, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-15$1
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
                ComposerKt.traceEventStart(-850694457, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-15.<anonymous> (HealthScreen.kt:273)");
            }
            TextKt.m2373Text4IGK_g("Weight check", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-16, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f114lambda16 = ComposableLambdaKt.composableLambdaInstance(-1102277416, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt$lambda-16$1
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
                ComposerKt.traceEventStart(-1102277416, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$HealthScreenKt.lambda-16.<anonymous> (HealthScreen.kt:277)");
            }
            TextKt.m2373Text4IGK_g("Weight (grams)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6725getLambda1$app_release() {
        return f107lambda1;
    }

    /* renamed from: getLambda-10$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6726getLambda10$app_release() {
        return f108lambda10;
    }

    /* renamed from: getLambda-11$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6727getLambda11$app_release() {
        return f109lambda11;
    }

    /* renamed from: getLambda-12$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6728getLambda12$app_release() {
        return f110lambda12;
    }

    /* renamed from: getLambda-13$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6729getLambda13$app_release() {
        return f111lambda13;
    }

    /* renamed from: getLambda-14$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6730getLambda14$app_release() {
        return f112lambda14;
    }

    /* renamed from: getLambda-15$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6731getLambda15$app_release() {
        return f113lambda15;
    }

    /* renamed from: getLambda-16$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6732getLambda16$app_release() {
        return f114lambda16;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6733getLambda2$app_release() {
        return f115lambda2;
    }

    /* renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6734getLambda3$app_release() {
        return f116lambda3;
    }

    /* renamed from: getLambda-4$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6735getLambda4$app_release() {
        return f117lambda4;
    }

    /* renamed from: getLambda-5$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6736getLambda5$app_release() {
        return f118lambda5;
    }

    /* renamed from: getLambda-6$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6737getLambda6$app_release() {
        return f119lambda6;
    }

    /* renamed from: getLambda-7$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6738getLambda7$app_release() {
        return f120lambda7;
    }

    /* renamed from: getLambda-8$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6739getLambda8$app_release() {
        return f121lambda8;
    }

    /* renamed from: getLambda-9$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6740getLambda9$app_release() {
        return f122lambda9;
    }
}
