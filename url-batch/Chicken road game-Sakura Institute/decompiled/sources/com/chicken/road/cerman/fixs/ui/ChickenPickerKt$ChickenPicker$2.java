package com.chicken.road.cerman.fixs.ui;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChickenPicker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChickenPickerKt$ChickenPicker$2 implements Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $allowNone;
    final /* synthetic */ List<Chicken> $chickens;
    final /* synthetic */ String $display;
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ String $label;
    final /* synthetic */ Function1<Long, Unit> $onPick;

    /* JADX WARN: Multi-variable type inference failed */
    ChickenPickerKt$ChickenPicker$2(String str, String str2, MutableState<Boolean> mutableState, boolean z, Function1<? super Long, Unit> function1, List<Chicken> list) {
        this.$display = str;
        this.$label = str2;
        this.$expanded$delegate = mutableState;
        this.$allowNone = z;
        this.$onPick = function1;
        this.$chickens = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer, Integer num) {
        invoke(exposedDropdownMenuBoxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ExposedDropdownMenuBoxScope ExposedDropdownMenuBox, Composer composer, int i) {
        int i2;
        boolean ChickenPicker$lambda$1;
        Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(ExposedDropdownMenuBox) : composer.changedInstance(ExposedDropdownMenuBox) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1531652620, i2, -1, "com.chicken.road.cerman.fixs.ui.ChickenPicker.<anonymous> (ChickenPicker.kt:33)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ExposedDropdownMenuBox.menuAnchor(Modifier.INSTANCE), 0.0f, 1, null);
            String str = this.$display;
            composer.startReplaceGroup(-1398008066);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = ChickenPickerKt$ChickenPicker$2.invoke$lambda$1$lambda$0((String) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            final String str2 = this.$label;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1453433486, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1453433486, i3, -1, "com.chicken.road.cerman.fixs.ui.ChickenPicker.<anonymous>.<anonymous> (ChickenPicker.kt:37)");
                    }
                    TextKt.m2373Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final MutableState<Boolean> mutableState = this.$expanded$delegate;
            OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default, false, true, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) rememberComposableLambda, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(936389163, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    boolean ChickenPicker$lambda$12;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(936389163, i3, -1, "com.chicken.road.cerman.fixs.ui.ChickenPicker.<anonymous>.<anonymous> (ChickenPicker.kt:38)");
                    }
                    ExposedDropdownMenuDefaults exposedDropdownMenuDefaults = ExposedDropdownMenuDefaults.INSTANCE;
                    ChickenPicker$lambda$12 = ChickenPickerKt.ChickenPicker$lambda$1(mutableState);
                    exposedDropdownMenuDefaults.TrailingIcon(ChickenPicker$lambda$12, null, composer2, ExposedDropdownMenuDefaults.$stable << 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 806903856, 0, 0, 8388008);
            ChickenPicker$lambda$1 = ChickenPickerKt.ChickenPicker$lambda$1(this.$expanded$delegate);
            composer.startReplaceGroup(-1397998960);
            final MutableState<Boolean> mutableState2 = this.$expanded$delegate;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = ChickenPickerKt$ChickenPicker$2.invoke$lambda$3$lambda$2(MutableState.this);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            AndroidMenu_androidKt.m1443DropdownMenuIlH_yew(ChickenPicker$lambda$1, (Function0) rememberedValue2, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1763163047, true, new AnonymousClass5(this.$allowNone, this.$onPick, this.$chickens, this.$expanded$delegate), composer, 54), composer, 48, 48, 2044);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: ChickenPicker.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2$5, reason: invalid class name */
    static final class AnonymousClass5 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ boolean $allowNone;
        final /* synthetic */ List<Chicken> $chickens;
        final /* synthetic */ MutableState<Boolean> $expanded$delegate;
        final /* synthetic */ Function1<Long, Unit> $onPick;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(boolean z, Function1<? super Long, Unit> function1, List<Chicken> list, MutableState<Boolean> mutableState) {
            this.$allowNone = z;
            this.$onPick = function1;
            this.$chickens = list;
            this.$expanded$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1763163047, i, -1, "com.chicken.road.cerman.fixs.ui.ChickenPicker.<anonymous>.<anonymous> (ChickenPicker.kt:42)");
                }
                composer.startReplaceGroup(-1757014078);
                if (this.$allowNone) {
                    Function2<Composer, Integer, Unit> m6679getLambda1$app_release = ComposableSingletons$ChickenPickerKt.INSTANCE.m6679getLambda1$app_release();
                    composer.startReplaceGroup(-1757009987);
                    boolean changed = composer.changed(this.$onPick);
                    final Function1<Long, Unit> function1 = this.$onPick;
                    final MutableState<Boolean> mutableState = this.$expanded$delegate;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2$5$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$1$lambda$0;
                                invoke$lambda$1$lambda$0 = ChickenPickerKt$ChickenPicker$2.AnonymousClass5.invoke$lambda$1$lambda$0(Function1.this, mutableState);
                                return invoke$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    AndroidMenu_androidKt.DropdownMenuItem(m6679getLambda1$app_release, (Function0) rememberedValue, null, null, null, false, null, null, null, composer, 6, 508);
                }
                composer.endReplaceGroup();
                List<Chicken> list = this.$chickens;
                final Function1<Long, Unit> function12 = this.$onPick;
                final MutableState<Boolean> mutableState2 = this.$expanded$delegate;
                for (final Chicken chicken : list) {
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1472361621, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2$5$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1472361621, i2, -1, "com.chicken.road.cerman.fixs.ui.ChickenPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChickenPicker.kt:50)");
                            }
                            TextKt.m2373Text4IGK_g(Chicken.this.getName() + " Â· " + Chicken.this.getBreed(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54);
                    composer.startReplaceGroup(56170012);
                    boolean changed2 = composer.changed(function12) | composer.changed(chicken);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$ChickenPicker$2$5$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$4$lambda$3$lambda$2;
                                invoke$lambda$4$lambda$3$lambda$2 = ChickenPickerKt$ChickenPicker$2.AnonymousClass5.invoke$lambda$4$lambda$3$lambda$2(Function1.this, chicken, mutableState2);
                                return invoke$lambda$4$lambda$3$lambda$2;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue2, null, null, null, false, null, null, null, composer, 6, 508);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState) {
            function1.invoke(null);
            ChickenPickerKt.ChickenPicker$lambda$2(mutableState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, Chicken chicken, MutableState mutableState) {
            function1.invoke(Long.valueOf(chicken.getId()));
            ChickenPickerKt.ChickenPicker$lambda$2(mutableState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableState mutableState) {
        ChickenPickerKt.ChickenPicker$lambda$2(mutableState, false);
        return Unit.INSTANCE;
    }
}
