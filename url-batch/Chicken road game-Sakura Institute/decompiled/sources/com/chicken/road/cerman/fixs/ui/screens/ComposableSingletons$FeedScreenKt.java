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

/* compiled from: FeedScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FeedScreenKt {
    public static final ComposableSingletons$FeedScreenKt INSTANCE = new ComposableSingletons$FeedScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f90lambda1 = ComposableLambdaKt.composableLambdaInstance(60513356, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(60513356, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-1.<anonymous> (FeedScreen.kt:68)");
            }
            TextKt.m2373Text4IGK_g("Log feeding", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f91lambda2 = ComposableLambdaKt.composableLambdaInstance(-922480021, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(-922480021, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-2.<anonymous> (FeedScreen.kt:67)");
            }
            IconKt.m1830Iconww6aTOc(AddKt.getAdd(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f92lambda3 = ComposableLambdaKt.composableLambdaInstance(941896020, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(941896020, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-3.<anonymous> (FeedScreen.kt:104)");
            }
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f93lambda4 = ComposableLambdaKt.composableLambdaInstance(-1359958888, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-4$1
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
                ComposerKt.traceEventStart(-1359958888, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-4.<anonymous> (FeedScreen.kt:167)");
            }
            TextKt.m2373Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f94lambda5 = ComposableLambdaKt.composableLambdaInstance(1986956442, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-5$1
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
                ComposerKt.traceEventStart(1986956442, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-5.<anonymous> (FeedScreen.kt:169)");
            }
            TextKt.m2373Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f95lambda6 = ComposableLambdaKt.composableLambdaInstance(-1825003233, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-6$1
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
                ComposerKt.traceEventStart(-1825003233, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-6.<anonymous> (FeedScreen.kt:135)");
            }
            TextKt.m2373Text4IGK_g("Log feeding", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f96lambda7 = ComposableLambdaKt.composableLambdaInstance(1687781296, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-7$1
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
                ComposerKt.traceEventStart(1687781296, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-7.<anonymous> (FeedScreen.kt:150)");
            }
            TextKt.m2373Text4IGK_g("Quantity (kg)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f97lambda8 = ComposableLambdaKt.composableLambdaInstance(-1044804953, false, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt$lambda-8$1
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
                ComposerKt.traceEventStart(-1044804953, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ComposableSingletons$FeedScreenKt.lambda-8.<anonymous> (FeedScreen.kt:151)");
            }
            TextKt.m2373Text4IGK_g("Price per kg", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6708getLambda1$app_release() {
        return f90lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6709getLambda2$app_release() {
        return f91lambda2;
    }

    /* renamed from: getLambda-3$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6710getLambda3$app_release() {
        return f92lambda3;
    }

    /* renamed from: getLambda-4$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6711getLambda4$app_release() {
        return f93lambda4;
    }

    /* renamed from: getLambda-5$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6712getLambda5$app_release() {
        return f94lambda5;
    }

    /* renamed from: getLambda-6$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6713getLambda6$app_release() {
        return f95lambda6;
    }

    /* renamed from: getLambda-7$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6714getLambda7$app_release() {
        return f96lambda7;
    }

    /* renamed from: getLambda-8$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6715getLambda8$app_release() {
        return f97lambda8;
    }
}
