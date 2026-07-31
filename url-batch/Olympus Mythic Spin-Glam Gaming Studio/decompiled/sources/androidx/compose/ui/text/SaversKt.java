package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\t\u0010\u000b\"&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\".\u0010\u0013\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00120\u0011\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\"(\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0012\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000e\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000e\" \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000e\" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000e\"#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010\u000e\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010\u000e\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u000e\"#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010\u000e\")\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010\u000e\u0012\u0004\b/\u00100\"#\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u0010\u000e\" \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000e\" \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000e\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u0000*\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u0000*\u00020;8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010<\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u0000*\u00020=8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010>\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0000*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010@\"'\u0010:\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u0000*\u00020A8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u0010B\"'\u0010:\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0\u0000*\u00020C8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u0010D\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u0000*\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010F\"'\u0010:\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u0000*\u00020G8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u0010H\"'\u0010:\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u0000*\u00020I8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u0010J\"'\u0010:\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u0000*\u00020K8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u0010L\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u0000*\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010N\"$\u0010:\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", "T", "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", "save", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeListSaver", "AnnotationRangeSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "ParagraphStyleSaver", "getParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "SpanStyleSaver", "getSpanStyleSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextIndentSaver", "Landroidx/compose/ui/text/font/FontWeight;", "FontWeightSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "BaselineShiftSaver", "Landroidx/compose/ui/text/TextRange;", "TextRangeSaver", "Landroidx/compose/ui/graphics/Shadow;", "ShadowSaver", "Landroidx/compose/ui/graphics/Color;", "ColorSaver", "Landroidx/compose/ui/unit/TextUnit;", "TextUnitSaver", "getTextUnitSaver$annotations", "()V", "Landroidx/compose/ui/geometry/Offset;", "OffsetSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/Locale;", "LocaleSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "getSaver", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SaversKt {
    private static final Saver AnnotatedStringSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString it) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object save = SaversKt.save(it.getText());
            List spanStyles = it.getSpanStyles();
            saver = SaversKt.AnnotationRangeListSaver;
            Object save2 = SaversKt.save(spanStyles, saver, Saver);
            List paragraphStyles = it.getParagraphStyles();
            saver2 = SaversKt.AnnotationRangeListSaver;
            Object save3 = SaversKt.save(paragraphStyles, saver2, Saver);
            List annotations = it.getAnnotations();
            saver3 = SaversKt.AnnotationRangeListSaver;
            return CollectionsKt.arrayListOf(save, save2, save3, SaversKt.save(annotations, saver3, Saver));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString invoke(@NotNull Object it) {
            Saver saver;
            Saver saver2;
            Saver saver3;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            List list2 = null;
            String str = obj != null ? (String) obj : null;
            Intrinsics.checkNotNull(str);
            Object obj2 = list.get(1);
            saver = SaversKt.AnnotationRangeListSaver;
            Boolean bool = Boolean.FALSE;
            List list3 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (List) saver.restore(obj2);
            Intrinsics.checkNotNull(list3);
            Object obj3 = list.get(2);
            saver2 = SaversKt.AnnotationRangeListSaver;
            List list4 = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : (List) saver2.restore(obj3);
            Intrinsics.checkNotNull(list4);
            Object obj4 = list.get(3);
            saver3 = SaversKt.AnnotationRangeListSaver;
            if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
                list2 = (List) saver3.restore(obj4);
            }
            Intrinsics.checkNotNull(list2);
            return new AnnotatedString(str, list3, list4, list2);
        }
    });
    private static final Saver AnnotationRangeListSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull List<? extends AnnotatedString.Range<? extends Object>> it) {
            Saver saver;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            int size = it.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<? extends Object> range = it.get(i);
                saver = SaversKt.AnnotationRangeSaver;
                arrayList.add(SaversKt.save(range, saver, Saver));
            }
            return arrayList;
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final List<AnnotatedString.Range<? extends Object>> invoke(@NotNull Object it) {
            Saver saver;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    range = (AnnotatedString.Range) saver.restore(obj);
                }
                Intrinsics.checkNotNull(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });
    private static final Saver AnnotationRangeSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString.Range<? extends Object> it) {
            AnnotationType annotationType;
            Object save;
            Saver saver;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object item = it.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else {
                annotationType = item instanceof VerbatimTtsAnnotation ? AnnotationType.VerbatimTts : AnnotationType.String;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 1) {
                save = SaversKt.save((ParagraphStyle) it.getItem(), SaversKt.getParagraphStyleSaver(), Saver);
            } else if (i == 2) {
                save = SaversKt.save((SpanStyle) it.getItem(), SaversKt.getSpanStyleSaver(), Saver);
            } else if (i == 3) {
                VerbatimTtsAnnotation verbatimTtsAnnotation = (VerbatimTtsAnnotation) it.getItem();
                saver = SaversKt.VerbatimTtsAnnotationSaver;
                save = SaversKt.save(verbatimTtsAnnotation, saver, Saver);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                save = SaversKt.save(it.getItem());
            }
            return CollectionsKt.arrayListOf(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(it.getStart())), SaversKt.save(Integer.valueOf(it.getEnd())), SaversKt.save(it.getTag()));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object it) {
            Saver saver;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            AnnotationType annotationType = obj != null ? (AnnotationType) obj : null;
            Intrinsics.checkNotNull(annotationType);
            Object obj2 = list.get(2);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Object obj3 = list.get(3);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.checkNotNull(num2);
            int intValue2 = num2.intValue();
            Object obj4 = list.get(4);
            String str = obj4 != null ? (String) obj4 : null;
            Intrinsics.checkNotNull(str);
            int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 1) {
                Object obj5 = list.get(1);
                Saver paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                if (!Intrinsics.areEqual(obj5, Boolean.FALSE) && obj5 != null) {
                    r1 = (ParagraphStyle) paragraphStyleSaver.restore(obj5);
                }
                Intrinsics.checkNotNull(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            }
            if (i == 2) {
                Object obj6 = list.get(1);
                Saver spanStyleSaver = SaversKt.getSpanStyleSaver();
                if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                    r1 = (SpanStyle) spanStyleSaver.restore(obj6);
                }
                Intrinsics.checkNotNull(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj7 = list.get(1);
                r1 = obj7 != null ? (String) obj7 : null;
                Intrinsics.checkNotNull(r1);
                return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
            }
            Object obj8 = list.get(1);
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            if (!Intrinsics.areEqual(obj8, Boolean.FALSE) && obj8 != null) {
                r1 = (VerbatimTtsAnnotation) saver.restore(obj8);
            }
            Intrinsics.checkNotNull(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
    });
    private static final Saver VerbatimTtsAnnotationSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull VerbatimTtsAnnotation it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return SaversKt.save(it.getVerbatim());
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final VerbatimTtsAnnotation invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new VerbatimTtsAnnotation((String) it);
        }
    });
    private static final Saver ParagraphStyleSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull ParagraphStyle it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(SaversKt.save(it.getTextAlign()), SaversKt.save(it.getTextDirection()), SaversKt.save(TextUnit.m2573boximpl(it.getLineHeight()), SaversKt.getSaver(TextUnit.INSTANCE), Saver), SaversKt.save(it.getTextIndent(), SaversKt.getSaver(TextIndent.INSTANCE), Saver));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ParagraphStyle invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextAlign textAlign = obj != null ? (TextAlign) obj : null;
            Object obj2 = list.get(1);
            TextDirection textDirection = obj2 != null ? (TextDirection) obj2 : null;
            Object obj3 = list.get(2);
            Saver saver = SaversKt.getSaver(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnit = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : (TextUnit) saver.restore(obj3);
            Intrinsics.checkNotNull(textUnit);
            long packedValue = textUnit.getPackedValue();
            Object obj4 = list.get(3);
            return new ParagraphStyle(textAlign, textDirection, packedValue, (Intrinsics.areEqual(obj4, bool) || obj4 == null) ? null : (TextIndent) SaversKt.getSaver(TextIndent.INSTANCE).restore(obj4), null);
        }
    });
    private static final Saver SpanStyleSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull SpanStyle it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Color m1441boximpl = Color.m1441boximpl(it.m2225getColor0d7_KjU());
            Color.Companion companion = Color.INSTANCE;
            Object save = SaversKt.save(m1441boximpl, SaversKt.getSaver(companion), Saver);
            TextUnit m2573boximpl = TextUnit.m2573boximpl(it.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return CollectionsKt.arrayListOf(save, SaversKt.save(m2573boximpl, SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getFontWeight(), SaversKt.getSaver(FontWeight.INSTANCE), Saver), SaversKt.save(it.getFontStyle()), SaversKt.save(it.getFontSynthesis()), SaversKt.save(-1), SaversKt.save(it.getFontFeatureSettings()), SaversKt.save(TextUnit.m2573boximpl(it.getLetterSpacing()), SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getBaselineShift(), SaversKt.getSaver(BaselineShift.INSTANCE), Saver), SaversKt.save(it.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.INSTANCE), Saver), SaversKt.save(it.getLocaleList(), SaversKt.getSaver(LocaleList.INSTANCE), Saver), SaversKt.save(Color.m1441boximpl(it.getBackground()), SaversKt.getSaver(companion), Saver), SaversKt.save(it.getTextDecoration(), SaversKt.getSaver(TextDecoration.INSTANCE), Saver), SaversKt.save(it.getShadow(), SaversKt.getSaver(Shadow.INSTANCE), Saver));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SpanStyle invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Color.Companion companion = Color.INSTANCE;
            Saver saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Color color = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : (Color) saver.restore(obj);
            Intrinsics.checkNotNull(color);
            long value = color.getValue();
            Object obj2 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            TextUnit textUnit = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (TextUnit) SaversKt.getSaver(companion2).restore(obj2);
            Intrinsics.checkNotNull(textUnit);
            long packedValue = textUnit.getPackedValue();
            Object obj3 = list.get(2);
            FontWeight fontWeight = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : (FontWeight) SaversKt.getSaver(FontWeight.INSTANCE).restore(obj3);
            Object obj4 = list.get(3);
            FontStyle fontStyle = obj4 != null ? (FontStyle) obj4 : null;
            Object obj5 = list.get(4);
            FontSynthesis fontSynthesis = obj5 != null ? (FontSynthesis) obj5 : null;
            Object obj6 = list.get(6);
            String str = obj6 != null ? (String) obj6 : null;
            Object obj7 = list.get(7);
            TextUnit textUnit2 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : (TextUnit) SaversKt.getSaver(companion2).restore(obj7);
            Intrinsics.checkNotNull(textUnit2);
            long packedValue2 = textUnit2.getPackedValue();
            Object obj8 = list.get(8);
            BaselineShift baselineShift = (Intrinsics.areEqual(obj8, bool) || obj8 == null) ? null : (BaselineShift) SaversKt.getSaver(BaselineShift.INSTANCE).restore(obj8);
            Object obj9 = list.get(9);
            TextGeometricTransform textGeometricTransform = (Intrinsics.areEqual(obj9, bool) || obj9 == null) ? null : (TextGeometricTransform) SaversKt.getSaver(TextGeometricTransform.INSTANCE).restore(obj9);
            Object obj10 = list.get(10);
            LocaleList localeList = (Intrinsics.areEqual(obj10, bool) || obj10 == null) ? null : (LocaleList) SaversKt.getSaver(LocaleList.INSTANCE).restore(obj10);
            Object obj11 = list.get(11);
            Color color2 = (Intrinsics.areEqual(obj11, bool) || obj11 == null) ? null : (Color) SaversKt.getSaver(companion).restore(obj11);
            Intrinsics.checkNotNull(color2);
            long value2 = color2.getValue();
            Object obj12 = list.get(12);
            TextDecoration textDecoration = (Intrinsics.areEqual(obj12, bool) || obj12 == null) ? null : (TextDecoration) SaversKt.getSaver(TextDecoration.INSTANCE).restore(obj12);
            Object obj13 = list.get(13);
            return new SpanStyle(value, packedValue, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str, packedValue2, baselineShift, textGeometricTransform, localeList, value2, textDecoration, (Intrinsics.areEqual(obj13, bool) || obj13 == null) ? null : (Shadow) SaversKt.getSaver(Shadow.INSTANCE).restore(obj13), 32, (DefaultConstructorMarker) null);
        }
    });
    private static final Saver TextDecorationSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextDecoration it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getMask());
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextDecoration invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new TextDecoration(((Integer) it).intValue());
        }
    });
    private static final Saver TextGeometricTransformSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextGeometricTransform it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextGeometricTransform invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    private static final Saver TextIndentSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextIndent it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            TextUnit m2573boximpl = TextUnit.m2573boximpl(it.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return CollectionsKt.arrayListOf(SaversKt.save(m2573boximpl, SaversKt.getSaver(companion), Saver), SaversKt.save(TextUnit.m2573boximpl(it.getRestLine()), SaversKt.getSaver(companion), Saver));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextIndent invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnit = null;
            TextUnit textUnit2 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : (TextUnit) saver.restore(obj);
            Intrinsics.checkNotNull(textUnit2);
            long packedValue = textUnit2.getPackedValue();
            Object obj2 = list.get(1);
            Saver saver2 = SaversKt.getSaver(companion);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                textUnit = (TextUnit) saver2.restore(obj2);
            }
            Intrinsics.checkNotNull(textUnit);
            return new TextIndent(packedValue, textUnit.getPackedValue(), null);
        }
    });
    private static final Saver FontWeightSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull FontWeight it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getWeight());
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final FontWeight invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FontWeight(((Integer) it).intValue());
        }
    });
    private static final Saver BaselineShiftSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2211invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).getMultiplier());
        }

        @Nullable
        /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m2211invoke8a2Sb4w(@NotNull SaverScope Saver, float f) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Float.valueOf(f);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BaselineShift.m2411boximpl(BaselineShift.m2412constructorimpl(((Float) it).floatValue()));
        }
    });
    private static final Saver TextRangeSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2217invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).getPackedValue());
        }

        @Nullable
        /* renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m2217invokeFDrldGo(@NotNull SaverScope Saver, long j) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return CollectionsKt.arrayListOf((Integer) SaversKt.save(Integer.valueOf(TextRange.m2249getStartimpl(j))), (Integer) SaversKt.save(Integer.valueOf(TextRange.m2244getEndimpl(j))));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Integer num = obj != null ? (Integer) obj : null;
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Object obj2 = list.get(1);
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.checkNotNull(num2);
            return TextRange.m2237boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
        }
    });
    private static final Saver ShadowSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull Shadow it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(SaversKt.save(Color.m1441boximpl(it.getColor()), SaversKt.getSaver(Color.INSTANCE), Saver), SaversKt.save(Offset.m1288boximpl(it.getOffset()), SaversKt.getSaver(Offset.INSTANCE), Saver), SaversKt.save(Float.valueOf(it.getBlurRadius())));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Shadow invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver saver = SaversKt.getSaver(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            Color color = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : (Color) saver.restore(obj);
            Intrinsics.checkNotNull(color);
            long value = color.getValue();
            Object obj2 = list.get(1);
            Offset offset = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (Offset) SaversKt.getSaver(Offset.INSTANCE).restore(obj2);
            Intrinsics.checkNotNull(offset);
            long packedValue = offset.getPackedValue();
            Object obj3 = list.get(2);
            Float f = obj3 != null ? (Float) obj3 : null;
            Intrinsics.checkNotNull(f);
            return new Shadow(value, packedValue, f.floatValue(), null);
        }
    });
    private static final Saver ColorSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2213invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).getValue());
        }

        @Nullable
        /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m2213invoke4WTKRHQ(@NotNull SaverScope Saver, long j) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return ULong.m8076boximpl(j);
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Color.m1441boximpl(Color.m1442constructorimpl(((ULong) it).m8081unboximpl()));
        }
    });
    private static final Saver TextUnitSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2219invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).getPackedValue());
        }

        @Nullable
        /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m2219invokempE4wyQ(@NotNull SaverScope Saver, long j) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(TextUnit.m2579getValueimpl(j))), SaversKt.save(TextUnitType.m2589boximpl(TextUnit.m2578getTypeUIouoOA(j))));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Float f = obj != null ? (Float) obj : null;
            Intrinsics.checkNotNull(f);
            float floatValue = f.floatValue();
            Object obj2 = list.get(1);
            TextUnitType textUnitType = obj2 != null ? (TextUnitType) obj2 : null;
            Intrinsics.checkNotNull(textUnitType);
            return TextUnit.m2573boximpl(TextUnitKt.m2584TextUnitanM5pPY(floatValue, textUnitType.getType()));
        }
    });
    private static final Saver OffsetSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2215invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).getPackedValue());
        }

        @Nullable
        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m2215invokeUv8p0NA(@NotNull SaverScope Saver, long j) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            if (Offset.m1294equalsimpl0(j, Offset.INSTANCE.m1307getUnspecifiedF1C5BW0())) {
                return Boolean.FALSE;
            }
            return CollectionsKt.arrayListOf((Float) SaversKt.save(Float.valueOf(Offset.m1297getXimpl(j))), (Float) SaversKt.save(Float.valueOf(Offset.m1298getYimpl(j))));
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it, Boolean.FALSE)) {
                return Offset.m1288boximpl(Offset.INSTANCE.m1307getUnspecifiedF1C5BW0());
            }
            List list = (List) it;
            Object obj = list.get(0);
            Float f = obj != null ? (Float) obj : null;
            Intrinsics.checkNotNull(f);
            float floatValue = f.floatValue();
            Object obj2 = list.get(1);
            Float f2 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.checkNotNull(f2);
            return Offset.m1288boximpl(OffsetKt.Offset(floatValue, f2.floatValue()));
        }
    });
    private static final Saver LocaleListSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull LocaleList it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            List localeList = it.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList.size());
            int size = localeList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(SaversKt.save((Locale) localeList.get(i), SaversKt.getSaver(Locale.INSTANCE), Saver));
            }
            return arrayList;
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final LocaleList invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                Saver saver = SaversKt.getSaver(Locale.INSTANCE);
                Locale locale = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    locale = (Locale) saver.restore(obj);
                }
                Intrinsics.checkNotNull(locale);
                arrayList.add(locale);
            }
            return new LocaleList(arrayList);
        }
    });
    private static final Saver LocaleSaver = SaverKt.Saver(new Function2() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull Locale it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toLanguageTag();
        }
    }, new Function1() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Locale invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Locale((String) it);
        }
    });

    public static final Object save(Object obj) {
        return obj;
    }

    public static final Object save(Object obj, Saver saver, SaverScope scope) {
        Object save;
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return (obj == null || (save = saver.save(scope, obj)) == null) ? Boolean.FALSE : save;
    }

    public static final Saver getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    public static final Saver getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final Saver getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final Saver getSaver(TextDecoration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextDecorationSaver;
    }

    public static final Saver getSaver(TextGeometricTransform.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextGeometricTransformSaver;
    }

    public static final Saver getSaver(TextIndent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextIndentSaver;
    }

    public static final Saver getSaver(FontWeight.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return FontWeightSaver;
    }

    public static final Saver getSaver(BaselineShift.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return BaselineShiftSaver;
    }

    public static final Saver getSaver(TextRange.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextRangeSaver;
    }

    public static final Saver getSaver(Shadow.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ShadowSaver;
    }

    public static final Saver getSaver(Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ColorSaver;
    }

    public static final Saver getSaver(TextUnit.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextUnitSaver;
    }

    public static final Saver getSaver(Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetSaver;
    }

    public static final Saver getSaver(LocaleList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleListSaver;
    }

    public static final Saver getSaver(Locale.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleSaver;
    }
}
