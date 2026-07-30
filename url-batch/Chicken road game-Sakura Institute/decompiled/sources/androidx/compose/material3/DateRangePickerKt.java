package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a°\u0001\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010.\u001a`\u0010/\u001a\u00020\f2\n\u00100\u001a\u000601j\u0002`22\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a½\u0001\u0010:\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010;\u001a\u0002072:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a°\u0001\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010A\u001a.\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010\u000b\u001a\u00020@2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020HH\u0002\u001aT\u0010J\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001ae\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c2\b\u0010P\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 H\u0002¢\u0006\u0002\u0010Q\u001a&\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerHeadlinePadding", "DateRangePickerTitlePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "selectedStartDateMillis", "", "selectedEndDateMillis", "displayedMonthMillis", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startDateMillis", "endDateMillis", "onDisplayedMonthChange", "Lkotlin/Function1;", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "SwitchableDateEntryContent", "displayMode", "SwitchableDateEntryContent-RN-2D1Q", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "VerticalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "rememberDateRangePickerState", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "updateDateSelection", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m678PaddingValuesa9UjIt4$default(Dp.m6299constructorimpl(24), Dp.m6299constructorimpl(20), 0.0f, Dp.m6299constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m6299constructorimpl(60);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateRangePicker(final DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, DatePickerColors datePickerColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        boolean z2;
        final DatePickerColors datePickerColors2;
        final DatePickerFormatter datePickerFormatter2;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        boolean changed;
        Object rememberedValue;
        DatePickerFormatter datePickerFormatter3;
        final Modifier modifier3;
        final boolean z3;
        final DatePickerColors datePickerColors3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(650830774);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePicker)P(5,3,1,6,2,4)95@4412L47,96@4500L185,102@4729L352,112@5169L8,114@5206L15,115@5246L62,132@5955L5,136@6111L1139,116@5313L1937:DateRangePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                }
                i9 = 128;
                i3 |= i9;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                datePickerColors2 = datePickerColors;
                                if (startRestartGroup.changed(datePickerColors2)) {
                                    i8 = 1048576;
                                    i3 |= i8;
                                }
                            } else {
                                datePickerColors2 = datePickerColors;
                            }
                            i8 = 524288;
                            i3 |= i8;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 4) != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454781303, "CC(remember):DateRangePicker.kt#9igjgp");
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    datePickerFormatter2 = (DatePickerFormatter) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    i3 &= -897;
                                } else {
                                    datePickerFormatter2 = datePickerFormatter;
                                }
                                if (i4 != 0) {
                                    function23 = ComposableLambdaKt.rememberComposableLambda(-162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$2
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i11) {
                                            PaddingValues paddingValues;
                                            ComposerKt.sourceInformation(composer2, "C97@4534L145:DateRangePicker.kt#uh7d8r");
                                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-162164694, i11, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:97)");
                                                }
                                                DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
                                                int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                paddingValues = DateRangePickerKt.DateRangePickerTitlePadding;
                                                dateRangePickerDefaults.m1721DateRangePickerTitlehOD91z4(mo1730getDisplayModejFl4v0, PaddingKt.padding(companion, paddingValues), composer2, 432, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }, startRestartGroup, 54);
                                    i7 = 54;
                                } else {
                                    i7 = 54;
                                }
                                if (i5 != 0) {
                                    function24 = ComposableLambdaKt.rememberComposableLambda(-185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i11) {
                                            PaddingValues paddingValues;
                                            ComposerKt.sourceInformation(composer2, "C103@4763L312:DateRangePicker.kt#uh7d8r");
                                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-185279404, i11, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:103)");
                                                }
                                                DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
                                                Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                                                Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                                                int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                                                DatePickerFormatter datePickerFormatter4 = datePickerFormatter2;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                paddingValues = DateRangePickerKt.DateRangePickerHeadlinePadding;
                                                dateRangePickerDefaults.m1720DateRangePickerHeadlinev84Udv0(selectedStartDateMillis, selectedEndDateMillis, mo1730getDisplayModejFl4v0, datePickerFormatter4, PaddingKt.padding(companion, paddingValues), composer2, 221184, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }, startRestartGroup, i7);
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    datePickerColors2 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                datePickerFormatter2 = datePickerFormatter;
                            }
                            function25 = function24;
                            boolean z4 = z2;
                            Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                            int i11 = i3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(650830774, i11, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:113)");
                            }
                            Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454754600, "CC(remember):DateRangePicker.kt#9igjgp");
                            changed = startRestartGroup.changed(defaultLocale);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = CalendarModel_androidKt.createCalendarModel(defaultLocale);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final CalendarModel calendarModel = (CalendarModel) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(-1454747621);
                            ComposerKt.sourceInformation(startRestartGroup, "122@5491L323");
                            ComposableLambda rememberComposableLambda = z4 ? ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i12) {
                                    ComposerKt.sourceInformation(composer2, "C126@5723L50,123@5513L283:DateRangePicker.kt#uh7d8r");
                                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i12, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                                        }
                                        Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1752251243, "CC(remember):DateRangePicker.kt#9igjgp");
                                        boolean changed2 = composer2.changed(DateRangePickerState.this);
                                        final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                                        Object rememberedValue3 = composer2.rememberedValue();
                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m1728invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m1728invokevCnGnXg(int i13) {
                                                    DateRangePickerState.this.mo1731setDisplayModevCnGnXg(i13);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        DatePickerKt.m1709DisplayModeToggleButtontER2X8s(padding, mo1730getDisplayModejFl4v0, (Function1) rememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54) : null;
                            startRestartGroup.endReplaceGroup();
                            int i12 = ((i11 >> 3) & 14) | 14155776;
                            int i13 = i11 >> 6;
                            DatePickerColors datePickerColors4 = datePickerColors2;
                            DatePickerKt.m1705DateEntryContainerau3_HiA(modifier2, function26, function25, rememberComposableLambda, datePickerColors2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), Dp.m6299constructorimpl(DatePickerModalTokens.INSTANCE.m2831getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.rememberComposableLambda(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i14) {
                                    ComposerKt.sourceInformation(composer2, "C142@6428L467,153@6934L91,137@6121L1123:DateRangePicker.kt#uh7d8r");
                                    if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-57534331, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                                        }
                                        Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                                        Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                                        long displayedMonthMillis = DateRangePickerState.this.getDisplayedMonthMillis();
                                        int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1752274220, "CC(remember):DateRangePicker.kt#9igjgp");
                                        boolean changed2 = composer2.changed(DateRangePickerState.this);
                                        final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                                        Object rememberedValue3 = composer2.rememberedValue();
                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                    invoke2(l, l2);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Long l, Long l2) {
                                                    try {
                                                        DateRangePickerState.this.setSelection(l, l2);
                                                    } catch (IllegalArgumentException unused) {
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue3);
                                        }
                                        Function2 function27 = (Function2) rememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1752290036, "CC(remember):DateRangePicker.kt#9igjgp");
                                        boolean changed3 = composer2.changed(DateRangePickerState.this);
                                        final DateRangePickerState dateRangePickerState3 = DateRangePickerState.this;
                                        Object rememberedValue4 = composer2.rememberedValue();
                                        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                    invoke(l.longValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(long j) {
                                                    DateRangePickerState.this.setDisplayedMonthMillis(j);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue4);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        DateRangePickerKt.m1724SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo1730getDisplayModejFl4v0, function27, (Function1) rememberedValue4, calendarModel, DateRangePickerState.this.getYearRange(), datePickerFormatter2, DateRangePickerState.this.getSelectableDates(), datePickerColors2, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, i12 | (i13 & 112) | (i13 & 896) | (i13 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function26;
                            datePickerFormatter3 = datePickerFormatter2;
                            modifier3 = modifier2;
                            z3 = z4;
                            datePickerColors3 = datePickerColors4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            datePickerFormatter3 = datePickerFormatter;
                            modifier3 = modifier2;
                            function25 = function24;
                            z3 = z2;
                            datePickerColors3 = datePickerColors2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                            final Function2<? super Composer, ? super Integer, Unit> function27 = function23;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$6
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

                                public final void invoke(Composer composer2, int i14) {
                                    DateRangePickerKt.DateRangePicker(DateRangePickerState.this, modifier3, datePickerFormatter4, function27, function25, z3, datePickerColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    if ((1572864 & i) == 0) {
                    }
                    if ((599187 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    function25 = function24;
                    boolean z42 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function262 = function23;
                    int i112 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Locale defaultLocale2 = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454754600, "CC(remember):DateRangePicker.kt#9igjgp");
                    changed = startRestartGroup.changed(defaultLocale2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = CalendarModel_androidKt.createCalendarModel(defaultLocale2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final CalendarModel calendarModel2 = (CalendarModel) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(-1454747621);
                    ComposerKt.sourceInformation(startRestartGroup, "122@5491L323");
                    ComposableLambda rememberComposableLambda2 = z42 ? ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i122) {
                            ComposerKt.sourceInformation(composer2, "C126@5723L50,123@5513L283:DateRangePicker.kt#uh7d8r");
                            if ((i122 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i122, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                                }
                                Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                                ComposerKt.sourceInformationMarkerStart(composer2, 1752251243, "CC(remember):DateRangePicker.kt#9igjgp");
                                boolean changed2 = composer2.changed(DateRangePickerState.this);
                                final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                                Object rememberedValue3 = composer2.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m1728invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m1728invokevCnGnXg(int i132) {
                                            DateRangePickerState.this.mo1731setDisplayModevCnGnXg(i132);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                DatePickerKt.m1709DisplayModeToggleButtontER2X8s(padding, mo1730getDisplayModejFl4v0, (Function1) rememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54) : null;
                    startRestartGroup.endReplaceGroup();
                    int i122 = ((i112 >> 3) & 14) | 14155776;
                    int i132 = i112 >> 6;
                    DatePickerColors datePickerColors42 = datePickerColors2;
                    DatePickerKt.m1705DateEntryContainerau3_HiA(modifier2, function262, function25, rememberComposableLambda2, datePickerColors2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), Dp.m6299constructorimpl(DatePickerModalTokens.INSTANCE.m2831getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.rememberComposableLambda(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            ComposerKt.sourceInformation(composer2, "C142@6428L467,153@6934L91,137@6121L1123:DateRangePicker.kt#uh7d8r");
                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                                }
                                Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                                long displayedMonthMillis = DateRangePickerState.this.getDisplayedMonthMillis();
                                int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                                ComposerKt.sourceInformationMarkerStart(composer2, 1752274220, "CC(remember):DateRangePicker.kt#9igjgp");
                                boolean changed2 = composer2.changed(DateRangePickerState.this);
                                final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                                Object rememberedValue3 = composer2.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                DateRangePickerState.this.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                Function2 function272 = (Function2) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerStart(composer2, 1752290036, "CC(remember):DateRangePicker.kt#9igjgp");
                                boolean changed3 = composer2.changed(DateRangePickerState.this);
                                final DateRangePickerState dateRangePickerState3 = DateRangePickerState.this;
                                Object rememberedValue4 = composer2.rememberedValue();
                                if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            DateRangePickerState.this.setDisplayedMonthMillis(j);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                DateRangePickerKt.m1724SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo1730getDisplayModejFl4v0, function272, (Function1) rememberedValue4, calendarModel2, DateRangePickerState.this.getYearRange(), datePickerFormatter2, DateRangePickerState.this.getSelectableDates(), datePickerColors2, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, i122 | (i132 & 112) | (i132 & 896) | (i132 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function23 = function262;
                    datePickerFormatter3 = datePickerFormatter2;
                    modifier3 = modifier2;
                    z3 = z42;
                    datePickerColors3 = datePickerColors42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                if ((1572864 & i) == 0) {
                }
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                function25 = function24;
                boolean z422 = z2;
                Function2<? super Composer, ? super Integer, Unit> function2622 = function23;
                int i1122 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Locale defaultLocale22 = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454754600, "CC(remember):DateRangePicker.kt#9igjgp");
                changed = startRestartGroup.changed(defaultLocale22);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = CalendarModel_androidKt.createCalendarModel(defaultLocale22);
                startRestartGroup.updateRememberedValue(rememberedValue);
                final CalendarModel calendarModel22 = (CalendarModel) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-1454747621);
                ComposerKt.sourceInformation(startRestartGroup, "122@5491L323");
                ComposableLambda rememberComposableLambda22 = z422 ? ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1222) {
                        ComposerKt.sourceInformation(composer2, "C126@5723L50,123@5513L283:DateRangePicker.kt#uh7d8r");
                        if ((i1222 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1490010652, i1222, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                            }
                            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                            int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                            ComposerKt.sourceInformationMarkerStart(composer2, 1752251243, "CC(remember):DateRangePicker.kt#9igjgp");
                            boolean changed2 = composer2.changed(DateRangePickerState.this);
                            final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                            Object rememberedValue3 = composer2.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                        m1728invokevCnGnXg(displayMode.getValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-vCnGnXg, reason: not valid java name */
                                    public final void m1728invokevCnGnXg(int i1322) {
                                        DateRangePickerState.this.mo1731setDisplayModevCnGnXg(i1322);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            DatePickerKt.m1709DisplayModeToggleButtontER2X8s(padding, mo1730getDisplayModejFl4v0, (Function1) rememberedValue3, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54) : null;
                startRestartGroup.endReplaceGroup();
                int i1222 = ((i1122 >> 3) & 14) | 14155776;
                int i1322 = i1122 >> 6;
                DatePickerColors datePickerColors422 = datePickerColors2;
                DatePickerKt.m1705DateEntryContainerau3_HiA(modifier2, function2622, function25, rememberComposableLambda22, datePickerColors2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), Dp.m6299constructorimpl(DatePickerModalTokens.INSTANCE.m2831getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.rememberComposableLambda(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i14) {
                        ComposerKt.sourceInformation(composer2, "C142@6428L467,153@6934L91,137@6121L1123:DateRangePicker.kt#uh7d8r");
                        if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                            }
                            Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                            long displayedMonthMillis = DateRangePickerState.this.getDisplayedMonthMillis();
                            int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                            ComposerKt.sourceInformationMarkerStart(composer2, 1752274220, "CC(remember):DateRangePicker.kt#9igjgp");
                            boolean changed2 = composer2.changed(DateRangePickerState.this);
                            final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                            Object rememberedValue3 = composer2.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            DateRangePickerState.this.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            Function2 function272 = (Function2) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerStart(composer2, 1752290036, "CC(remember):DateRangePicker.kt#9igjgp");
                            boolean changed3 = composer2.changed(DateRangePickerState.this);
                            final DateRangePickerState dateRangePickerState3 = DateRangePickerState.this;
                            Object rememberedValue4 = composer2.rememberedValue();
                            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        DateRangePickerState.this.setDisplayedMonthMillis(j);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            DateRangePickerKt.m1724SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo1730getDisplayModejFl4v0, function272, (Function1) rememberedValue4, calendarModel22, DateRangePickerState.this.getYearRange(), datePickerFormatter2, DateRangePickerState.this.getSelectableDates(), datePickerColors2, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, i1222 | (i1322 & 112) | (i1322 & 896) | (i1322 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                }
                function23 = function2622;
                datePickerFormatter3 = datePickerFormatter2;
                modifier3 = modifier2;
                z3 = z422;
                datePickerColors3 = datePickerColors422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            function25 = function24;
            boolean z4222 = z2;
            Function2<? super Composer, ? super Integer, Unit> function26222 = function23;
            int i11222 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Locale defaultLocale222 = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454754600, "CC(remember):DateRangePicker.kt#9igjgp");
            changed = startRestartGroup.changed(defaultLocale222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = CalendarModel_androidKt.createCalendarModel(defaultLocale222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final CalendarModel calendarModel222 = (CalendarModel) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1454747621);
            ComposerKt.sourceInformation(startRestartGroup, "122@5491L323");
            ComposableLambda rememberComposableLambda222 = z4222 ? ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12222) {
                    ComposerKt.sourceInformation(composer2, "C126@5723L50,123@5513L283:DateRangePicker.kt#uh7d8r");
                    if ((i12222 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1490010652, i12222, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                        }
                        Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                        int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                        ComposerKt.sourceInformationMarkerStart(composer2, 1752251243, "CC(remember):DateRangePicker.kt#9igjgp");
                        boolean changed2 = composer2.changed(DateRangePickerState.this);
                        final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                    m1728invokevCnGnXg(displayMode.getValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-vCnGnXg, reason: not valid java name */
                                public final void m1728invokevCnGnXg(int i13222) {
                                    DateRangePickerState.this.mo1731setDisplayModevCnGnXg(i13222);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        DatePickerKt.m1709DisplayModeToggleButtontER2X8s(padding, mo1730getDisplayModejFl4v0, (Function1) rememberedValue3, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54) : null;
            startRestartGroup.endReplaceGroup();
            int i12222 = ((i11222 >> 3) & 14) | 14155776;
            int i13222 = i11222 >> 6;
            DatePickerColors datePickerColors4222 = datePickerColors2;
            DatePickerKt.m1705DateEntryContainerau3_HiA(modifier2, function26222, function25, rememberComposableLambda222, datePickerColors2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), Dp.m6299constructorimpl(DatePickerModalTokens.INSTANCE.m2831getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.rememberComposableLambda(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C142@6428L467,153@6934L91,137@6121L1123:DateRangePicker.kt#uh7d8r");
                    if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-57534331, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                        }
                        Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                        Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                        long displayedMonthMillis = DateRangePickerState.this.getDisplayedMonthMillis();
                        int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                        ComposerKt.sourceInformationMarkerStart(composer2, 1752274220, "CC(remember):DateRangePicker.kt#9igjgp");
                        boolean changed2 = composer2.changed(DateRangePickerState.this);
                        final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                    invoke2(l, l2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Long l, Long l2) {
                                    try {
                                        DateRangePickerState.this.setSelection(l, l2);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        Function2 function272 = (Function2) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, 1752290036, "CC(remember):DateRangePicker.kt#9igjgp");
                        boolean changed3 = composer2.changed(DateRangePickerState.this);
                        final DateRangePickerState dateRangePickerState3 = DateRangePickerState.this;
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                    invoke(l.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    DateRangePickerState.this.setDisplayedMonthMillis(j);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        DateRangePickerKt.m1724SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo1730getDisplayModejFl4v0, function272, (Function1) rememberedValue4, calendarModel222, DateRangePickerState.this.getYearRange(), datePickerFormatter2, DateRangePickerState.this.getSelectableDates(), datePickerColors2, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, i12222 | (i13222 & 112) | (i13222 & 896) | (i13222 & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
            function23 = function26222;
            datePickerFormatter3 = datePickerFormatter2;
            modifier3 = modifier2;
            z3 = z4222;
            datePickerColors3 = datePickerColors4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        function25 = function24;
        boolean z42222 = z2;
        Function2<? super Composer, ? super Integer, Unit> function262222 = function23;
        int i112222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Locale defaultLocale2222 = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454754600, "CC(remember):DateRangePicker.kt#9igjgp");
        changed = startRestartGroup.changed(defaultLocale2222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = CalendarModel_androidKt.createCalendarModel(defaultLocale2222);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final CalendarModel calendarModel2222 = (CalendarModel) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-1454747621);
        ComposerKt.sourceInformation(startRestartGroup, "122@5491L323");
        ComposableLambda rememberComposableLambda2222 = z42222 ? ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i122222) {
                ComposerKt.sourceInformation(composer2, "C126@5723L50,123@5513L283:DateRangePicker.kt#uh7d8r");
                if ((i122222 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1490010652, i122222, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                    }
                    Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                    int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                    ComposerKt.sourceInformationMarkerStart(composer2, 1752251243, "CC(remember):DateRangePicker.kt#9igjgp");
                    boolean changed2 = composer2.changed(DateRangePickerState.this);
                    final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                m1728invokevCnGnXg(displayMode.getValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-vCnGnXg, reason: not valid java name */
                            public final void m1728invokevCnGnXg(int i132222) {
                                DateRangePickerState.this.mo1731setDisplayModevCnGnXg(i132222);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    DatePickerKt.m1709DisplayModeToggleButtontER2X8s(padding, mo1730getDisplayModejFl4v0, (Function1) rememberedValue3, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54) : null;
        startRestartGroup.endReplaceGroup();
        int i122222 = ((i112222 >> 3) & 14) | 14155776;
        int i132222 = i112222 >> 6;
        DatePickerColors datePickerColors42222 = datePickerColors2;
        DatePickerKt.m1705DateEntryContainerau3_HiA(modifier2, function262222, function25, rememberComposableLambda2222, datePickerColors2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), Dp.m6299constructorimpl(DatePickerModalTokens.INSTANCE.m2831getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.rememberComposableLambda(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i14) {
                ComposerKt.sourceInformation(composer2, "C142@6428L467,153@6934L91,137@6121L1123:DateRangePicker.kt#uh7d8r");
                if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-57534331, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                    }
                    Long selectedStartDateMillis = DateRangePickerState.this.getSelectedStartDateMillis();
                    Long selectedEndDateMillis = DateRangePickerState.this.getSelectedEndDateMillis();
                    long displayedMonthMillis = DateRangePickerState.this.getDisplayedMonthMillis();
                    int mo1730getDisplayModejFl4v0 = DateRangePickerState.this.mo1730getDisplayModejFl4v0();
                    ComposerKt.sourceInformationMarkerStart(composer2, 1752274220, "CC(remember):DateRangePicker.kt#9igjgp");
                    boolean changed2 = composer2.changed(DateRangePickerState.this);
                    final DateRangePickerState dateRangePickerState2 = DateRangePickerState.this;
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                invoke2(l, l2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Long l, Long l2) {
                                try {
                                    DateRangePickerState.this.setSelection(l, l2);
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    Function2 function272 = (Function2) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1752290036, "CC(remember):DateRangePicker.kt#9igjgp");
                    boolean changed3 = composer2.changed(DateRangePickerState.this);
                    final DateRangePickerState dateRangePickerState3 = DateRangePickerState.this;
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                DateRangePickerState.this.setDisplayedMonthMillis(j);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    DateRangePickerKt.m1724SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo1730getDisplayModejFl4v0, function272, (Function1) rememberedValue4, calendarModel2222, DateRangePickerState.this.getYearRange(), datePickerFormatter2, DateRangePickerState.this.getSelectableDates(), datePickerColors2, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, i122222 | (i132222 & 112) | (i132222 & 896) | (i132222 & 57344));
        if (ComposerKt.isTraceInProgress()) {
        }
        function23 = function262222;
        datePickerFormatter3 = datePickerFormatter2;
        modifier3 = modifier2;
        z3 = z42222;
        datePickerColors3 = datePickerColors42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m1727rememberDateRangePickerStateIlFM19s(Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -2012087461, "C(rememberDateRangePickerState)P(3,2,1,5,0:c#material3.DisplayMode)262@11757L15,263@11866L435,263@11784L517:DateRangePicker.kt#uh7d8r");
        final Long l4 = (i3 & 1) != 0 ? null : l;
        final Long l5 = (i3 & 2) != 0 ? null : l2;
        final Long l6 = (i3 & 4) != 0 ? l4 : l3;
        final IntRange yearRange = (i3 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        final int m1749getPickerjFl4v0 = (i3 & 16) != 0 ? DisplayMode.INSTANCE.m1749getPickerjFl4v0() : i;
        final SelectableDates allDates = (i3 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        final Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.INSTANCE.Saver(allDates, defaultLocale);
        ComposerKt.sourceInformationMarkerStart(composer, -250595241, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean changedInstance = ((((i2 & 112) ^ 48) > 32 && composer.changed(l5)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && composer.changed(l4)) || (i2 & 6) == 4) | ((((i2 & 896) ^ 384) > 256 && composer.changed(l6)) || (i2 & 384) == 256) | composer.changedInstance(yearRange) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(m1749getPickerjFl4v0)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(allDates)) || (i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | composer.changedInstance(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<DateRangePickerStateImpl>() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DateRangePickerStateImpl invoke() {
                    return new DateRangePickerStateImpl(l4, l5, l6, yearRange, m1749getPickerjFl4v0, allDates, defaultLocale, null);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m3426rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return dateRangePickerStateImpl;
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m1723DateRangePickerStateHVP43zI$default(Locale locale, Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        if ((i2 & 8) != 0) {
            l3 = l;
        }
        if ((i2 & 16) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 32) != 0) {
            i = DisplayMode.INSTANCE.m1749getPickerjFl4v0();
        }
        if ((i2 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m1722DateRangePickerStateHVP43zI(locale, l, l2, l3, intRange, i, selectableDates);
    }

    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m1722DateRangePickerStateHVP43zI(Locale locale, Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l, l2, l3, intRange, i, selectableDates, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m1724SwitchableDateEntryContentRN2D1Q(final Long l, final Long l2, final long j, final int i, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-532789335);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)P(9,8,4,3:c#material3.DisplayMode,5,6!1,10,2,7)672@30082L1249,664@29854L1477:DateRangePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(intRange) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= (i2 & 134217728) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i4, i5, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:661)");
            }
            CrossfadeKt.Crossfade(DisplayMode.m1741boximpl(i), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new Function3<DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode, Composer composer2, Integer num) {
                    m1729invokeQujVXRc(displayMode.getValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m1729invokeQujVXRc(int i6, Composer composer2, int i7) {
                    int i8;
                    ComposerKt.sourceInformation(composer2, "CP(0:c#material3.DisplayMode):DateRangePicker.kt#uh7d8r");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer2.changed(i6) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1026642619, i8, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:673)");
                        }
                        if (DisplayMode.m1744equalsimpl0(i6, DisplayMode.INSTANCE.m1749getPickerjFl4v0())) {
                            composer2.startReplaceGroup(-1871305297);
                            ComposerKt.sourceInformation(composer2, "675@30164L618");
                            DateRangePickerKt.DateRangePickerContent(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (DisplayMode.m1744equalsimpl0(i6, DisplayMode.INSTANCE.m1748getInputjFl4v0())) {
                            composer2.startReplaceGroup(-1871284056);
                            ComposerKt.sourceInformation(composer2, "688@30832L483");
                            DateRangeInputKt.DateRangeInputContent(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(2120210493);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 9) & 14) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
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

                public final void invoke(Composer composer2, int i6) {
                    DateRangePickerKt.m1724SwitchableDateEntryContentRN2D1Q(l, l2, j, i, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DateRangePickerContent(final Long l, final Long l2, final long j, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-787063721);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerContent)P(8,7,3,4,5!1,9,2,6)718@31942L87,719@32034L648:DateRangePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:715)");
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(calendarModel.getMonth(j).indexIn(intRange), 0, startRestartGroup, 0, 2);
            Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(Modifier.INSTANCE, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m683paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 556336155, "C720@32122L31,721@32162L514:DateRangePicker.kt#uh7d8r");
            DatePickerKt.WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            composer2 = startRestartGroup;
            VerticalMonthsList(rememberLazyListState, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, ((i2 << 3) & PointerIconCompat.TYPE_TEXT) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (1879048192 & i2));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    DateRangePickerKt.DateRangePickerContent(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalMonthsList(final LazyListState lazyListState, final Long l, final Long l2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1257365001);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalMonthsList)P(3,8,7,4,5!1,9,2,6)756@33410L158,762@33630L5,762@33637L3748,762@33573L3812,839@37420L228,839@37390L258:DateRangePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i2, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:753)");
            }
            final CalendarDate today = calendarModel.getToday();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2140165432, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(intRange);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = calendarModel.getMonth(intRange.getFirst(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    final List customScrollActions;
                    ComposerKt.sourceInformation(composer3, "C763@33668L24,764@33734L59,765@33831L55,769@34067L317,794@35062L2317,786@34687L2692:DateRangePicker.kt#uh7d8r");
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1090773432, i4, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:763)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composer3, -954363344, "CC(remember):Effects.kt#9igjgp");
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Strings.Companion companion = Strings.INSTANCE;
                        String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer3, 0);
                        Strings.Companion companion2 = Strings.INSTANCE;
                        String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -522211194, "CC(remember):DateRangePicker.kt#9igjgp");
                        boolean changed2 = composer3.changed(l) | composer3.changed(l2) | composer3.changed(function2);
                        final Long l3 = l;
                        final Long l4 = l2;
                        final Function2<Long, Long, Unit> function22 = function2;
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Long l5) {
                                    invoke(l5.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    DateRangePickerKt.updateDateSelection(j, l3, l4, function22);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        final Function1 function12 = (Function1) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        customScrollActions = DateRangePickerKt.customScrollActions(lazyListState, coroutineScope, m2655getString2EP1pXo, m2655getString2EP1pXo2);
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }, new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }, false, 4, null));
                            }
                        }, 1, null);
                        LazyListState lazyListState2 = lazyListState;
                        ComposerKt.sourceInformationMarkerStart(composer3, -522177354, "CC(remember):DateRangePicker.kt#9igjgp");
                        boolean changedInstance = composer3.changedInstance(intRange) | composer3.changedInstance(calendarModel) | composer3.changed(calendarMonth) | composer3.changedInstance(datePickerFormatter) | composer3.changedInstance(customScrollActions) | composer3.changed(datePickerColors) | composer3.changed(l) | composer3.changed(l2) | composer3.changed(function12) | composer3.changed(today) | composer3.changed(selectableDates);
                        final IntRange intRange2 = intRange;
                        final CalendarModel calendarModel2 = calendarModel;
                        final CalendarMonth calendarMonth2 = calendarMonth;
                        final Long l5 = l;
                        final Long l6 = l2;
                        final CalendarDate calendarDate = today;
                        final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                        final SelectableDates selectableDates2 = selectableDates;
                        final DatePickerColors datePickerColors2 = datePickerColors;
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                    invoke2(lazyListScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LazyListScope lazyListScope) {
                                    int numberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(IntRange.this);
                                    final CalendarModel calendarModel3 = calendarModel2;
                                    final CalendarMonth calendarMonth3 = calendarMonth2;
                                    final Long l7 = l5;
                                    final Long l8 = l6;
                                    final Function1<Long, Unit> function13 = function12;
                                    final CalendarDate calendarDate2 = calendarDate;
                                    final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                    final SelectableDates selectableDates3 = selectableDates2;
                                    final DatePickerColors datePickerColors3 = datePickerColors2;
                                    final List<CustomAccessibilityAction> list = customScrollActions;
                                    LazyListScope.items$default(lazyListScope, numberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer4, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer4, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope lazyItemScope, int i5, Composer composer4, int i6) {
                                            int i7;
                                            SelectedRangeInfo selectedRangeInfo;
                                            ComposerKt.sourceInformation(composer4, "C797@35229L2126:DateRangePicker.kt#uh7d8r");
                                            if ((i6 & 6) == 0) {
                                                i7 = i6 | (composer4.changed(lazyItemScope) ? 4 : 2);
                                            } else {
                                                i7 = i6;
                                            }
                                            if ((i6 & 48) == 0) {
                                                i7 |= composer4.changed(i5) ? 32 : 16;
                                            }
                                            if ((i7 & 147) != 146 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1413501381, i7, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:796)");
                                                }
                                                final CalendarMonth plusMonths = CalendarModel.this.plusMonths(calendarMonth3, i5);
                                                Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
                                                Long l9 = l7;
                                                Long l10 = l8;
                                                Function1<Long, Unit> function14 = function13;
                                                CalendarDate calendarDate3 = calendarDate2;
                                                final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                                SelectableDates selectableDates4 = selectableDates3;
                                                final DatePickerColors datePickerColors4 = datePickerColors3;
                                                final List<CustomAccessibilityAction> list2 = list;
                                                CalendarModel calendarModel4 = CalendarModel.this;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, fillParentMaxWidth$default);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer4);
                                                Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 1459498729, "C798@35370L5,798@35377L623,798@35300L700,824@36791L546:DateRangePicker.kt#uh7d8r");
                                                TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer4, 6), ComposableLambdaKt.rememberComposableLambda(1622100276, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i8) {
                                                        ComposerKt.sourceInformation(composer5, "C803@35605L15,807@35843L45,799@35403L575:DateRangePicker.kt#uh7d8r");
                                                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1622100276, i8, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:799)");
                                                            }
                                                            String formatMonthYear = DatePickerFormatter.this.formatMonthYear(Long.valueOf(plusMonths.getStartUtcTimeMillis()), CalendarLocale_androidKt.defaultLocale(composer5, 0));
                                                            if (formatMonthYear == null) {
                                                                formatMonthYear = "-";
                                                            }
                                                            String str = formatMonthYear;
                                                            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.getCalendarMonthSubheadPadding());
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -77518095, "CC(remember):DateRangePicker.kt#9igjgp");
                                                            boolean changedInstance2 = composer5.changedInstance(list2);
                                                            final List<CustomAccessibilityAction> list3 = list2;
                                                            Object rememberedValue5 = composer5.rememberedValue();
                                                            if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1
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
                                                                        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list3);
                                                                    }
                                                                };
                                                                composer5.updateRememberedValue(rememberedValue5);
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            TextKt.m2373Text4IGK_g(str, SemanticsModifierKt.semantics$default(padding, false, (Function1) rememberedValue5, 1, null), datePickerColors4.getSubheadContentColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131064);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 48);
                                                composer4.startReplaceGroup(2125314509);
                                                ComposerKt.sourceInformation(composer4, "813@36190L488");
                                                if (l9 == null || l10 == null) {
                                                    selectedRangeInfo = null;
                                                } else {
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2125317517, "CC(remember):DateRangePicker.kt#9igjgp");
                                                    boolean changed3 = composer4.changed(l9) | composer4.changed(l10);
                                                    Object rememberedValue5 = composer4.rememberedValue();
                                                    if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue5 = SelectedRangeInfo.INSTANCE.calculateRangeInfo(plusMonths, calendarModel4.getCanonicalDate(l9.longValue()), calendarModel4.getCanonicalDate(l10.longValue()));
                                                        composer4.updateRememberedValue(rememberedValue5);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    selectedRangeInfo = (SelectedRangeInfo) rememberedValue5;
                                                }
                                                composer4.endReplaceGroup();
                                                DatePickerKt.Month(plusMonths, function14, calendarDate3.getUtcTimeMillis(), l9, l10, selectedRangeInfo, datePickerFormatter4, selectableDates4, datePickerColors4, composer4, 0);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), 6, null);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LazyDslKt.LazyColumn(semantics$default, lazyListState2, null, false, null, null, null, false, (Function1) rememberedValue4, composer3, 0, 252);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2140037042, "CC(remember):DateRangePicker.kt#9igjgp");
            int i4 = i3 & 14;
            boolean changedInstance = (i4 == 4) | ((i3 & 57344) == 16384) | startRestartGroup.changedInstance(calendarModel) | startRestartGroup.changedInstance(intRange);
            DateRangePickerKt$VerticalMonthsList$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, function1, calendarModel, intRange, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer2, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    DateRangePickerKt.VerticalMonthsList(LazyListState.this, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j, Long l, Long l2, Function2<? super Long, ? super Long, Unit> function2) {
        if ((l == null && l2 == null) || (l != null && l2 != null)) {
            function2.invoke(Long.valueOf(j), null);
        } else if (l != null && j >= l.longValue()) {
            function2.invoke(l, Long.valueOf(j));
        } else {
            function2.invoke(Long.valueOf(j), null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m1726drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j) {
        float m3668getWidthimpl;
        float f = contentDrawScope.mo373toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f2 = contentDrawScope.mo373toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f3 = contentDrawScope.mo373toPx0680j_4(DatePickerModalTokens.INSTANCE.m2824getDateStateLayerHeightD9Ej5fM());
        float f4 = 2;
        float f5 = (f2 - f3) / f4;
        float f6 = 7;
        float m3668getWidthimpl2 = (Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()) - (f6 * f)) / f6;
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int m6427getXimpl = IntOffset.m6427getXimpl(gridStartCoordinates);
        int m6428getYimpl = IntOffset.m6428getYimpl(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int m6427getXimpl2 = IntOffset.m6427getXimpl(gridEndCoordinates);
        int m6428getYimpl2 = IntOffset.m6428getYimpl(gridEndCoordinates);
        float f7 = f + m3668getWidthimpl2;
        float f8 = m3668getWidthimpl2 / f4;
        float f9 = (m6427getXimpl * f7) + (selectedRangeInfo.getFirstIsSelectionStart() ? f / f4 : 0.0f) + f8;
        float f10 = (m6428getYimpl * f2) + f5;
        float f11 = m6427getXimpl2 * f7;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            f /= f4;
        }
        float f12 = f11 + f + f8;
        float f13 = (m6428getYimpl2 * f2) + f5;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            f9 = Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()) - f9;
            f12 = Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()) - f12;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        long Offset = OffsetKt.Offset(f9, f10);
        if (m6428getYimpl == m6428getYimpl2) {
            m3668getWidthimpl = f12 - f9;
        } else {
            m3668getWidthimpl = z ? -f9 : Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()) - f9;
        }
        DrawScope.m4390drawRectnJ9OG0$default(contentDrawScope2, j, Offset, SizeKt.Size(m3668getWidthimpl, f3), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        if (m6428getYimpl != m6428getYimpl2) {
            for (int i = (m6428getYimpl2 - m6428getYimpl) - 1; i > 0; i--) {
                DrawScope.m4390drawRectnJ9OG0$default(contentDrawScope2, j, OffsetKt.Offset(0.0f, (i * f2) + f10), SizeKt.Size(Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()), f3), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            }
            long Offset2 = OffsetKt.Offset(contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr ? Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()) : 0.0f, f13);
            if (z) {
                f12 -= Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc());
            }
            DrawScope.m4390drawRectnJ9OG0$default(contentDrawScope2, j, Offset2, SizeKt.Size(f12, f3), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                if (LazyListState.this.getCanScrollBackward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(LazyListState.this, null), 3, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1032}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() - 1, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                if (LazyListState.this.getCanScrollForward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(LazyListState.this, null), 3, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* compiled from: DateRangePicker.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1040}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() + 1, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        })});
    }

    static {
        float f = 64;
        float f2 = 12;
        DateRangePickerTitlePadding = PaddingKt.m678PaddingValuesa9UjIt4$default(Dp.m6299constructorimpl(f), 0.0f, Dp.m6299constructorimpl(f2), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m678PaddingValuesa9UjIt4$default(Dp.m6299constructorimpl(f), 0.0f, Dp.m6299constructorimpl(f2), Dp.m6299constructorimpl(f2), 2, null);
    }
}
