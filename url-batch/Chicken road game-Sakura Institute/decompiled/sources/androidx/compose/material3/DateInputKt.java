package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.database.core.ValidationPath;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: DateInput.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001ad\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0098\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010 ¢\u0006\u0002\b!2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010 ¢\u0006\u0002\b!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\n\u0010)\u001a\u00060*j\u0002`+2\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u008e\u0002"}, d2 = {"InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextNonErroneousBottomPadding", "Landroidx/compose/ui/unit/Dp;", "F", "DateInputContent", "", "selectedDateMillis", "", "onDateSelectionChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dateInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "modifier", "Landroidx/compose/ui/Modifier;", "initialDateMillis", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "dateInputValidator", "Landroidx/compose/material3/DateInputValidator;", "dateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "DateInputTextField-tQNruF0", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "material3_release", "text", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = Dp.m6299constructorimpl(16);

    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void DateInputContent(final Long l, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Locale locale;
        DateInputFormat dateInputFormat;
        int i3;
        ?? r13;
        Composer composer2;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(643325609);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateInputContent)P(5,3!1,6,2,4)62@2605L15,64@2655L75,65@2758L45,66@2838L44,67@2916L45,69@2999L551,82@3639L42,86@3836L164,92@4024L62,83@3686L901:DateInput.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
        }
        int i4 = i2;
        if ((599187 & i4) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, i4, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
            }
            Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1825155115, "CC(remember):DateInput.kt#9igjgp");
            boolean changed = startRestartGroup.changed(defaultLocale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(defaultLocale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Strings.Companion companion = Strings.INSTANCE;
            String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            Strings.Companion companion2 = Strings.INSTANCE;
            String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            Strings.Companion companion3 = Strings.INSTANCE;
            String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1825166599, "CC(remember):DateInput.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(dateInputFormat2) | ((57344 & i4) == 16384 || ((32768 & i4) != 0 && startRestartGroup.changed(datePickerFormatter)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                locale = defaultLocale;
                dateInputFormat = dateInputFormat2;
                i3 = i4;
                r13 = 1;
                DateInputValidator dateInputValidator = new DateInputValidator(intRange, selectableDates, dateInputFormat2, datePickerFormatter, m2655getString2EP1pXo, m2655getString2EP1pXo2, m2655getString2EP1pXo3, "", null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            } else {
                locale = defaultLocale;
                dateInputFormat = dateInputFormat2;
                i3 = i4;
                r13 = 1;
                composer2 = startRestartGroup;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Strings.Companion companion4 = Strings.INSTANCE;
            final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_date_input_label), composer2, 0);
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r13, null), InputTextFieldPadding);
            int m1855getSingleDateInputJ2x2o4M = InputIdentifier.INSTANCE.m1855getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis$material3_release(l);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1819015125, r13, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i5) {
                    ComposerKt.sourceInformation(composer4, "C89@3929L47,87@3850L140:DateInput.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1819015125, i5, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
                        }
                        String str = m2655getString2EP1pXo4;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer4, -49706674, "CC(remember):DateInput.kt#9igjgp");
                        boolean changed3 = composer4.changed(m2655getString2EP1pXo4) | composer4.changed(upperCase);
                        final String str2 = m2655getString2EP1pXo4;
                        final String str3 = upperCase;
                        Object rememberedValue3 = composer4.rememberedValue();
                        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                                }
                            };
                            composer4.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        TextKt.m2373Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion5, false, (Function1) rememberedValue3, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }, composer2, 54);
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-564233108, r13, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i5) {
                    ComposerKt.sourceInformation(composer4, "C92@4026L58:DateInput.kt#uh7d8r");
                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564233108, i5, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
                    }
                    TextKt.m2373Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54);
            int i5 = i3 << 3;
            composer3 = composer2;
            m1672DateInputTextFieldtQNruF0(padding, l, function1, calendarModel, rememberComposableLambda, rememberComposableLambda2, m1855getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, locale, datePickerColors, composer2, (i5 & 112) | 1794054 | (i5 & 896) | (i5 & 7168), (i3 >> 18) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i6) {
                    DateInputKt.DateInputContent(l, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m1672DateInputTextFieldtQNruF0(final Modifier modifier, final Long l, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final int i, final DateInputValidator dateInputValidator, final DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        String str;
        float f;
        Composer startRestartGroup = composer.startRestartGroup(-857008589);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateInputTextField)P(8,4,9!1,6,10,5:c#material3.InputIdentifier,3,2,7)122@5091L39,124@5207L488,124@5155L540,142@5766L1458,188@7730L60,191@7875L59,140@5701L2642:DateInput.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(dateInputFormat) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(locale) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857008589, i4, i5, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            int i6 = i4;
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                }
            }, startRestartGroup, 3072, 6);
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.INSTANCE.getSaver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 236419420, "CC(remember):DateInput.kt#9igjgp");
            int i7 = 234881024 & i6;
            boolean changedInstance = ((i6 & 112) == 32) | startRestartGroup.changedInstance(calendarModel) | (i7 == 67108864) | startRestartGroup.changedInstance(locale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
                    
                        if (r0 == null) goto L6;
                     */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MutableState<TextFieldValue> invoke() {
                        String str2;
                        Long l2 = l;
                        if (l2 != null) {
                            CalendarModel calendarModel2 = calendarModel;
                            DateInputFormat dateInputFormat2 = dateInputFormat;
                            str2 = calendarModel2.formatWithPattern(l2.longValue(), dateInputFormat2.getPatternWithoutDelimiters(), locale);
                        }
                        str2 = "";
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str2, TextRangeKt.TextRange(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, startRestartGroup, 0, 4);
            TextFieldValue DateInputTextField_tQNruF0$lambda$4 = DateInputTextField_tQNruF0$lambda$4(rememberSaveable);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 236438278, "CC(remember):DateInput.kt#9igjgp");
            boolean changed = startRestartGroup.changed(rememberSaveable) | (i7 == 67108864) | startRestartGroup.changed(mutableState) | ((i6 & 896) == 256) | startRestartGroup.changedInstance(calendarModel) | ((29360128 & i6) == 8388608) | ((3670016 & i6) == 1048576) | startRestartGroup.changedInstance(locale);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):DateInput.kt#9igjgp";
                rememberedValue2 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue) {
                        if (textFieldValue.getText().length() <= DateInputFormat.this.getPatternWithoutDelimiters().length()) {
                            String text = textFieldValue.getText();
                            for (int i8 = 0; i8 < text.length(); i8++) {
                                if (!Character.isDigit(text.charAt(i8))) {
                                    return;
                                }
                            }
                            rememberSaveable.setValue(textFieldValue);
                            String obj = StringsKt.trim((CharSequence) textFieldValue.getText()).toString();
                            Long l2 = null;
                            if (obj.length() == 0 || obj.length() < DateInputFormat.this.getPatternWithoutDelimiters().length()) {
                                mutableState.setValue("");
                                function1.invoke(null);
                                return;
                            }
                            CalendarDate parse = calendarModel.parse(obj, DateInputFormat.this.getPatternWithoutDelimiters());
                            mutableState.setValue(dateInputValidator.m1673validateXivgLIo(parse, i, locale));
                            Function1<Long, Unit> function12 = function1;
                            if (mutableState.getValue().length() == 0 && parse != null) {
                                l2 = Long.valueOf(parse.getUtcTimeMillis());
                            }
                            function12.invoke(l2);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                str = "CC(remember):DateInput.kt#9igjgp";
            }
            Function1 function12 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (!(!StringsKt.isBlank((CharSequence) mutableState.getValue()))) {
                f = InputTextNonErroneousBottomPadding;
            } else {
                f = Dp.m6299constructorimpl(0);
            }
            Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 236499728, str);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        if (!StringsKt.isBlank(mutableState.getValue())) {
                            SemanticsPropertiesKt.error(semanticsPropertyReceiver, mutableState.getValue());
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            OutlinedTextFieldKt.OutlinedTextField(DateInputTextField_tQNruF0$lambda$4, (Function1<? super TextFieldValue, Unit>) function12, SemanticsModifierKt.semantics$default(m685paddingqDBjuR0$default, false, (Function1) rememberedValue3, 1, null), false, false, (TextStyle) null, function2, function22, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-591991974, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C191@7911L21:DateInput.kt#uh7d8r");
                    if ((i8 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-591991974, i8, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                    }
                    if (!StringsKt.isBlank(mutableState.getValue())) {
                        TextKt.m2373Text4IGK_g(mutableState.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), !StringsKt.isBlank((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, (Boolean) false, KeyboardType.INSTANCE.m6019getNumberPjHm6EE(), ImeAction.INSTANCE.m5963getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 113, (DefaultConstructorMarker) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, datePickerColors.getDateTextFieldColors(), startRestartGroup, (i6 << 6) & 33030144, 12779904, 0, 4001592);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    DateInputKt.m1672DateInputTextFieldtQNruF0(Modifier.this, l, function1, calendarModel, function2, function22, i, dateInputValidator, dateInputFormat, locale, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }

    static {
        float f = 24;
        InputTextFieldPadding = PaddingKt.m678PaddingValuesa9UjIt4$default(Dp.m6299constructorimpl(f), Dp.m6299constructorimpl(10), Dp.m6299constructorimpl(f), 0.0f, 8, null);
    }
}
