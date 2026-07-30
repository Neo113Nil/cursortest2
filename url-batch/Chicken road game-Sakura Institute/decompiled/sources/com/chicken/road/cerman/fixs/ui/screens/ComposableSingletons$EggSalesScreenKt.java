package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EggSalesScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EggSalesScreenKt {
    public static final ComposableSingletons$EggSalesScreenKt INSTANCE = new ComposableSingletons$EggSalesScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f75lambda1 = ComposableLambdaKt.composableLambdaInstance(1681277835, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(1681277835, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-1.<anonymous> (EggSalesScreen.kt:73)");
            }
            IconKt.m1830Iconww6aTOc(AddKt.getAdd(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f82lambda2 = ComposableLambdaKt.composableLambdaInstance(1161128756, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(1161128756, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-2.<anonymous> (EggSalesScreen.kt:83)");
            }
            TextKt.m2373Text4IGK_g("Eggs collected", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f83lambda3 = ComposableLambdaKt.composableLambdaInstance(1327264541, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(1327264541, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-3.<anonymous> (EggSalesScreen.kt:84)");
            }
            TextKt.m2373Text4IGK_g("Sales", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f84lambda4 = ComposableLambdaKt.composableLambdaInstance(-1734408443, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-4$1
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
                ComposerKt.traceEventStart(-1734408443, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-4.<anonymous> (EggSalesScreen.kt:111)");
            }
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f85lambda5 = ComposableLambdaKt.composableLambdaInstance(-1672630514, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-5$1
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
                ComposerKt.traceEventStart(-1672630514, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-5.<anonymous> (EggSalesScreen.kt:141)");
            }
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f86lambda6 = ComposableLambdaKt.composableLambdaInstance(-971816924, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-6$1
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
                ComposerKt.traceEventStart(-971816924, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-6.<anonymous> (EggSalesScreen.kt:178)");
            }
            TextKt.m2373Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f87lambda7 = ComposableLambdaKt.composableLambdaInstance(-682997534, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-7$1
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
                ComposerKt.traceEventStart(-682997534, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-7.<anonymous> (EggSalesScreen.kt:180)");
            }
            TextKt.m2373Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f88lambda8 = ComposableLambdaKt.composableLambdaInstance(456598077, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-8$1
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
                ComposerKt.traceEventStart(456598077, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-8.<anonymous> (EggSalesScreen.kt:167)");
            }
            TextKt.m2373Text4IGK_g("Log eggs", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f89lambda9 = ComposableLambdaKt.composableLambdaInstance(-1352632820, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-9$1
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
                ComposerKt.traceEventStart(-1352632820, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-9.<anonymous> (EggSalesScreen.kt:171)");
            }
            TextKt.m2373Text4IGK_g("Egg count", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f76lambda10 = ComposableLambdaKt.composableLambdaInstance(1740910598, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-10$1
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
                ComposerKt.traceEventStart(1740910598, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-10.<anonymous> (EggSalesScreen.kt:218)");
            }
            TextKt.m2373Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f77lambda11 = ComposableLambdaKt.composableLambdaInstance(2104377096, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-11$1
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
                ComposerKt.traceEventStart(2104377096, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-11.<anonymous> (EggSalesScreen.kt:220)");
            }
            TextKt.m2373Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f78lambda12 = ComposableLambdaKt.composableLambdaInstance(-1222864627, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-12$1
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
                ComposerKt.traceEventStart(-1222864627, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-12.<anonymous> (EggSalesScreen.kt:194)");
            }
            TextKt.m2373Text4IGK_g("Record sale", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f79lambda13 = ComposableLambdaKt.composableLambdaInstance(-1474447586, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-13$1
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
                ComposerKt.traceEventStart(-1474447586, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-13.<anonymous> (EggSalesScreen.kt:207)");
            }
            TextKt.m2373Text4IGK_g("Quantity", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-14, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f80lambda14 = ComposableLambdaKt.composableLambdaInstance(264334997, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-14$1
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
                ComposerKt.traceEventStart(264334997, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-14.<anonymous> (EggSalesScreen.kt:208)");
            }
            TextKt.m2373Text4IGK_g("Unit price", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-15, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f81lambda15 = ComposableLambdaKt.composableLambdaInstance(387238934, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt$lambda-15$1
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
                ComposerKt.traceEventStart(387238934, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$EggSalesScreenKt.lambda-15.<anonymous> (EggSalesScreen.kt:209)");
            }
            TextKt.m2373Text4IGK_g("Buyer (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6693getLambda1$app_release() {
        return f75lambda1;
    }

    /* renamed from: getLambda-10$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6694getLambda10$app_release() {
        return f76lambda10;
    }

    /* renamed from: getLambda-11$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6695getLambda11$app_release() {
        return f77lambda11;
    }

    /* renamed from: getLambda-12$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6696getLambda12$app_release() {
        return f78lambda12;
    }

    /* renamed from: getLambda-13$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6697getLambda13$app_release() {
        return f79lambda13;
    }

    /* renamed from: getLambda-14$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6698getLambda14$app_release() {
        return f80lambda14;
    }

    /* renamed from: getLambda-15$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6699getLambda15$app_release() {
        return f81lambda15;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6700getLambda2$app_release() {
        return f82lambda2;
    }

    /* renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6701getLambda3$app_release() {
        return f83lambda3;
    }

    /* renamed from: getLambda-4$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6702getLambda4$app_release() {
        return f84lambda4;
    }

    /* renamed from: getLambda-5$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6703getLambda5$app_release() {
        return f85lambda5;
    }

    /* renamed from: getLambda-6$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6704getLambda6$app_release() {
        return f86lambda6;
    }

    /* renamed from: getLambda-7$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6705getLambda7$app_release() {
        return f87lambda7;
    }

    /* renamed from: getLambda-8$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6706getLambda8$app_release() {
        return f88lambda8;
    }

    /* renamed from: getLambda-9$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6707getLambda9$app_release() {
        return f89lambda9;
    }
}
