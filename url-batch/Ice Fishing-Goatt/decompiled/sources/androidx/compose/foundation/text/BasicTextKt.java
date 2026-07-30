package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010 \u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010!\u001a°\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a@\u0010,\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u0001000.\u0018\u00010-2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e00H\u0002\u001a\u001e\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207062\b\u00108\u001a\u0004\u0018\u000109H\u0002\u001aÂ\u0001\u0010:\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0014\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<\u0018\u00010-2\u001c\u0010>\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010?0-\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\n\u0010C\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "LayoutWithLinksAndInlineContent", "hasInlineContent", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "LayoutWithLinksAndInlineContent-vOo2fZY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "measureWithTextRangeMeasureConstraints", "", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/Placeable;", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "shouldMeasureLinks", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "placeholders", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "textModifier-cFh6CEA", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation_release", "displayedText"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023d, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b7  */
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m968BasicTextVhcvRP8(final String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        String str2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        SelectionController selectionController;
        final SelectionRegistrar selectionRegistrar;
        int i17;
        int i18;
        ColorProducer colorProducer2;
        Function1<? super TextLayoutResult, Unit> function13;
        Composer composer2;
        boolean z3;
        Modifier modifier4;
        int i19;
        Function1<? super TextLayoutResult, Unit> function14;
        Modifier m971textModifiercFh6CEA;
        ColorProducer colorProducer3;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        Composer composer3;
        final TextStyle textStyle3;
        final ColorProducer colorProducer4;
        final boolean z4;
        final int i20;
        final int i21;
        final Modifier modifier5;
        final Function1<? super TextLayoutResult, Unit> function15;
        final int i22;
        Object obj;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1186827822);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)101@5004L7,151@6858L41:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i4 & 6) == 0) {
                i6 = (startRestartGroup.changed(str2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i4) == 0) {
                            z2 = z;
                            i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i13 = i5 & 128;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i14 = i13;
                                i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                                i15 = i5 & 256;
                                if (i15 != 0) {
                                    i6 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i16 = i15;
                                    i6 |= startRestartGroup.changedInstance(colorProducer) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    if ((i6 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                        modifier3 = i23 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        selectionController = null;
                                        if (i8 != 0) {
                                            function12 = null;
                                        }
                                        if (i9 != 0) {
                                            i10 = TextOverflow.INSTANCE.m6203getClipgIe3tQ8();
                                        }
                                        if (i11 != 0) {
                                            z2 = true;
                                        }
                                        int i24 = i12 == 0 ? Integer.MAX_VALUE : i2;
                                        int i25 = i14 == 0 ? i3 : 1;
                                        ColorProducer colorProducer5 = i16 == 0 ? null : colorProducer;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:96)");
                                        }
                                        HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
                                        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localSelectionRegistrar);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        selectionRegistrar = (SelectionRegistrar) consume;
                                        if (selectionRegistrar == null) {
                                            startRestartGroup.startReplaceGroup(-1589202404);
                                            ComposerKt.sourceInformation(startRestartGroup, "103@5140L7,105@5286L69,105@5203L152,108@5364L234");
                                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume2 = startRestartGroup.consume(localTextSelectionColors);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            function13 = function12;
                                            long backgroundColor = ((TextSelectionColors) consume2).getBackgroundColor();
                                            Object[] objArr = {selectionRegistrar};
                                            Saver<Long, Long> selectionIdSaver = selectionIdSaver(selectionRegistrar);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -328352935, "CC(remember):BasicText.kt#9igjgp");
                                            boolean changedInstance = startRestartGroup.changedInstance(selectionRegistrar);
                                            i17 = i25;
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Long invoke() {
                                                        return Long.valueOf(SelectionRegistrar.this.nextSelectableId());
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Object m3409rememberSaveable = RememberSaveableKt.m3409rememberSaveable(objArr, selectionIdSaver, (String) null, (Function0<? extends Object>) rememberedValue, startRestartGroup, 0, 4);
                                            Composer composer4 = startRestartGroup;
                                            i18 = i24;
                                            colorProducer2 = colorProducer5;
                                            long longValue = ((Number) m3409rememberSaveable).longValue();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -328350274, "CC(remember):BasicText.kt#9igjgp");
                                            boolean changed = composer4.changed(longValue) | composer4.changed(selectionRegistrar) | composer4.changed(backgroundColor);
                                            Object rememberedValue2 = composer4.rememberedValue();
                                            if (!changed) {
                                                obj = rememberedValue2;
                                            }
                                            Object selectionController2 = new SelectionController(longValue, selectionRegistrar, backgroundColor, null, 8, null);
                                            composer4.updateRememberedValue(selectionController2);
                                            obj = selectionController2;
                                            selectionController = (SelectionController) obj;
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endReplaceGroup();
                                            composer2 = composer4;
                                        } else {
                                            i17 = i25;
                                            i18 = i24;
                                            colorProducer2 = colorProducer5;
                                            function13 = function12;
                                            Composer composer5 = startRestartGroup;
                                            composer5.startReplaceGroup(-1588686502);
                                            composer5.endReplaceGroup();
                                            composer2 = composer5;
                                        }
                                        if (selectionController == null || function13 != null) {
                                            ColorProducer colorProducer6 = colorProducer2;
                                            z3 = z2;
                                            composer2.startReplaceGroup(-1588564052);
                                            ComposerKt.sourceInformation(composer2, "130@6178L7");
                                            modifier4 = modifier3;
                                            Modifier m3983graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                            AnnotatedString annotatedString = new AnnotatedString(str, null, null, 6, null);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer2.consume(localFontFamilyResolver);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            i19 = i10;
                                            function14 = function13;
                                            m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default, annotatedString, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume3, null, null, selectionController, colorProducer6, null);
                                            colorProducer3 = colorProducer6;
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(-1587866335);
                                            ComposerKt.sourceInformation(composer2, "143@6671L7");
                                            Modifier m3983graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                            i19 = i10;
                                            Modifier modifier6 = modifier3;
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer2.consume(localFontFamilyResolver2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ColorProducer colorProducer7 = colorProducer2;
                                            z3 = z2;
                                            m971textModifiercFh6CEA = m3983graphicsLayerAp8cVGQ$default2.then(new TextStringSimpleElement(str2, textStyle2, (FontFamily.Resolver) consume4, i19, z3, i18, i17, colorProducer7, null));
                                            composer2.endReplaceGroup();
                                            colorProducer3 = colorProducer7;
                                            modifier4 = modifier6;
                                            function14 = function13;
                                        }
                                        EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (!composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                                        Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3 = composer2;
                                        textStyle3 = textStyle2;
                                        colorProducer4 = colorProducer3;
                                        z4 = z3;
                                        i20 = i18;
                                        i21 = i17;
                                        modifier5 = modifier4;
                                        function15 = function14;
                                        i22 = i19;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        i20 = i2;
                                        colorProducer4 = colorProducer;
                                        composer3 = startRestartGroup;
                                        modifier5 = modifier2;
                                        textStyle3 = textStyle2;
                                        function15 = function12;
                                        i22 = i10;
                                        z4 = z2;
                                        i21 = i3;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i26) {
                                                BasicTextKt.m968BasicTextVhcvRP8(str, modifier5, textStyle3, function15, i22, z4, i20, i21, colorProducer4, composer6, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i16 = i15;
                                if ((i6 & 38347923) == 38347922) {
                                }
                                if (i23 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                selectionController = null;
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
                                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume5 = startRestartGroup.consume(localSelectionRegistrar2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                selectionRegistrar = (SelectionRegistrar) consume5;
                                if (selectionRegistrar == null) {
                                }
                                if (selectionController == null) {
                                }
                                ColorProducer colorProducer62 = colorProducer2;
                                z3 = z2;
                                composer2.startReplaceGroup(-1588564052);
                                ComposerKt.sourceInformation(composer2, "130@6178L7");
                                modifier4 = modifier3;
                                Modifier m3983graphicsLayerAp8cVGQ$default3 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                AnnotatedString annotatedString2 = new AnnotatedString(str, null, null, 6, null);
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver3 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume32 = composer2.consume(localFontFamilyResolver3);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                i19 = i10;
                                function14 = function13;
                                m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default3, annotatedString2, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume32, null, null, selectionController, colorProducer62, null);
                                colorProducer3 = colorProducer62;
                                composer2.endReplaceGroup();
                                EmptyMeasurePolicy emptyMeasurePolicy2 = EmptyMeasurePolicy.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                                Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3316constructorimpl.getInserting()) {
                                }
                                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer3 = composer2;
                                textStyle3 = textStyle2;
                                colorProducer4 = colorProducer3;
                                z4 = z3;
                                i20 = i18;
                                i21 = i17;
                                modifier5 = modifier4;
                                function15 = function14;
                                i22 = i19;
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i5 & 256;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            if ((i6 & 38347923) == 38347922) {
                            }
                            if (i23 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            selectionController = null;
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
                            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar22 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume52 = startRestartGroup.consume(localSelectionRegistrar22);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (SelectionRegistrar) consume52;
                            if (selectionRegistrar == null) {
                            }
                            if (selectionController == null) {
                            }
                            ColorProducer colorProducer622 = colorProducer2;
                            z3 = z2;
                            composer2.startReplaceGroup(-1588564052);
                            ComposerKt.sourceInformation(composer2, "130@6178L7");
                            modifier4 = modifier3;
                            Modifier m3983graphicsLayerAp8cVGQ$default32 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                            AnnotatedString annotatedString22 = new AnnotatedString(str, null, null, 6, null);
                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver32 = CompositionLocalsKt.getLocalFontFamilyResolver();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume322 = composer2.consume(localFontFamilyResolver32);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            i19 = i10;
                            function14 = function13;
                            m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default32, annotatedString22, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume322, null, null, selectionController, colorProducer622, null);
                            colorProducer3 = colorProducer622;
                            composer2.endReplaceGroup();
                            EmptyMeasurePolicy emptyMeasurePolicy22 = EmptyMeasurePolicy.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                            }
                            m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                            Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m3323setimpl(m3316constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3316constructorimpl.getInserting()) {
                            }
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer3 = composer2;
                            textStyle3 = textStyle2;
                            colorProducer4 = colorProducer3;
                            z4 = z3;
                            i20 = i18;
                            i21 = i17;
                            modifier5 = modifier4;
                            function15 = function14;
                            i22 = i19;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        z2 = z;
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & 128;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i5 & 256;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        if ((i6 & 38347923) == 38347922) {
                        }
                        if (i23 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        selectionController = null;
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
                        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume522 = startRestartGroup.consume(localSelectionRegistrar222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        selectionRegistrar = (SelectionRegistrar) consume522;
                        if (selectionRegistrar == null) {
                        }
                        if (selectionController == null) {
                        }
                        ColorProducer colorProducer6222 = colorProducer2;
                        z3 = z2;
                        composer2.startReplaceGroup(-1588564052);
                        ComposerKt.sourceInformation(composer2, "130@6178L7");
                        modifier4 = modifier3;
                        Modifier m3983graphicsLayerAp8cVGQ$default322 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                        AnnotatedString annotatedString222 = new AnnotatedString(str, null, null, 6, null);
                        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver322 = CompositionLocalsKt.getLocalFontFamilyResolver();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume3222 = composer2.consume(localFontFamilyResolver322);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        i19 = i10;
                        function14 = function13;
                        m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default322, annotatedString222, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume3222, null, null, selectionController, colorProducer6222, null);
                        colorProducer3 = colorProducer6222;
                        composer2.endReplaceGroup();
                        EmptyMeasurePolicy emptyMeasurePolicy222 = EmptyMeasurePolicy.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                        CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3316constructorimpl.getInserting()) {
                        }
                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer3 = composer2;
                        textStyle3 = textStyle2;
                        colorProducer4 = colorProducer3;
                        z4 = z3;
                        i20 = i18;
                        i21 = i17;
                        modifier5 = modifier4;
                        function15 = function14;
                        i22 = i19;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    z2 = z;
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    if ((i6 & 38347923) == 38347922) {
                    }
                    if (i23 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    selectionController = null;
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5222 = startRestartGroup.consume(localSelectionRegistrar2222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (SelectionRegistrar) consume5222;
                    if (selectionRegistrar == null) {
                    }
                    if (selectionController == null) {
                    }
                    ColorProducer colorProducer62222 = colorProducer2;
                    z3 = z2;
                    composer2.startReplaceGroup(-1588564052);
                    ComposerKt.sourceInformation(composer2, "130@6178L7");
                    modifier4 = modifier3;
                    Modifier m3983graphicsLayerAp8cVGQ$default3222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                    AnnotatedString annotatedString2222 = new AnnotatedString(str, null, null, 6, null);
                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver3222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32222 = composer2.consume(localFontFamilyResolver3222);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    i19 = i10;
                    function14 = function13;
                    m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default3222, annotatedString2222, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume32222, null, null, selectionController, colorProducer62222, null);
                    colorProducer3 = colorProducer62222;
                    composer2.endReplaceGroup();
                    EmptyMeasurePolicy emptyMeasurePolicy2222 = EmptyMeasurePolicy.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                    CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                    Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3316constructorimpl.getInserting()) {
                    }
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer3 = composer2;
                    textStyle3 = textStyle2;
                    colorProducer4 = colorProducer3;
                    z4 = z3;
                    i20 = i18;
                    i21 = i17;
                    modifier5 = modifier4;
                    function15 = function14;
                    i22 = i19;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                z2 = z;
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & 128;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                if ((i6 & 38347923) == 38347922) {
                }
                if (i23 == 0) {
                }
                if (i7 != 0) {
                }
                selectionController = null;
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar22222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52222 = startRestartGroup.consume(localSelectionRegistrar22222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (SelectionRegistrar) consume52222;
                if (selectionRegistrar == null) {
                }
                if (selectionController == null) {
                }
                ColorProducer colorProducer622222 = colorProducer2;
                z3 = z2;
                composer2.startReplaceGroup(-1588564052);
                ComposerKt.sourceInformation(composer2, "130@6178L7");
                modifier4 = modifier3;
                Modifier m3983graphicsLayerAp8cVGQ$default32222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                AnnotatedString annotatedString22222 = new AnnotatedString(str, null, null, 6, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver32222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322222 = composer2.consume(localFontFamilyResolver32222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                i19 = i10;
                function14 = function13;
                m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default32222, annotatedString22222, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume322222, null, null, selectionController, colorProducer622222, null);
                colorProducer3 = colorProducer622222;
                composer2.endReplaceGroup();
                EmptyMeasurePolicy emptyMeasurePolicy22222 = EmptyMeasurePolicy.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                CompositionLocalMap currentCompositionLocalMap22222 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting()) {
                }
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer2;
                textStyle3 = textStyle2;
                colorProducer4 = colorProducer3;
                z4 = z3;
                i20 = i18;
                i21 = i17;
                modifier5 = modifier4;
                function15 = function14;
                i22 = i19;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            z2 = z;
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & 128;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            if ((i6 & 38347923) == 38347922) {
            }
            if (i23 == 0) {
            }
            if (i7 != 0) {
            }
            selectionController = null;
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar222222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522222 = startRestartGroup.consume(localSelectionRegistrar222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (SelectionRegistrar) consume522222;
            if (selectionRegistrar == null) {
            }
            if (selectionController == null) {
            }
            ColorProducer colorProducer6222222 = colorProducer2;
            z3 = z2;
            composer2.startReplaceGroup(-1588564052);
            ComposerKt.sourceInformation(composer2, "130@6178L7");
            modifier4 = modifier3;
            Modifier m3983graphicsLayerAp8cVGQ$default322222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
            AnnotatedString annotatedString222222 = new AnnotatedString(str, null, null, 6, null);
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver322222 = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222222 = composer2.consume(localFontFamilyResolver322222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            i19 = i10;
            function14 = function13;
            m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default322222, annotatedString222222, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume3222222, null, null, selectionController, colorProducer6222222, null);
            colorProducer3 = colorProducer6222222;
            composer2.endReplaceGroup();
            EmptyMeasurePolicy emptyMeasurePolicy222222 = EmptyMeasurePolicy.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
            CompositionLocalMap currentCompositionLocalMap222222 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m3316constructorimpl = Updater.m3316constructorimpl(composer2);
            Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            composer3 = composer2;
            textStyle3 = textStyle2;
            colorProducer4 = colorProducer3;
            z4 = z3;
            i20 = i18;
            i21 = i17;
            modifier5 = modifier4;
            function15 = function14;
            i22 = i19;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        z2 = z;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        if ((i6 & 38347923) == 38347922) {
        }
        if (i23 == 0) {
        }
        if (i7 != 0) {
        }
        selectionController = null;
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        HeightInLinesModifierKt.validateMinMaxLines(i25, i24);
        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2222222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222222 = startRestartGroup.consume(localSelectionRegistrar2222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (SelectionRegistrar) consume5222222;
        if (selectionRegistrar == null) {
        }
        if (selectionController == null) {
        }
        ColorProducer colorProducer62222222 = colorProducer2;
        z3 = z2;
        composer2.startReplaceGroup(-1588564052);
        ComposerKt.sourceInformation(composer2, "130@6178L7");
        modifier4 = modifier3;
        Modifier m3983graphicsLayerAp8cVGQ$default3222222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
        AnnotatedString annotatedString2222222 = new AnnotatedString(str, null, null, 6, null);
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver3222222 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222222 = composer2.consume(localFontFamilyResolver3222222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        i19 = i10;
        function14 = function13;
        m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default3222222, annotatedString2222222, textStyle2, function14, i19, z3, i18, i17, (FontFamily.Resolver) consume32222222, null, null, selectionController, colorProducer62222222, null);
        colorProducer3 = colorProducer62222222;
        composer2.endReplaceGroup();
        EmptyMeasurePolicy emptyMeasurePolicy2222222 = EmptyMeasurePolicy.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
        CompositionLocalMap currentCompositionLocalMap2222222 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(composer2);
        Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer3 = composer2;
        textStyle3 = textStyle2;
        colorProducer4 = colorProducer3;
        z4 = z3;
        i20 = i18;
        i21 = i17;
        modifier5 = modifier4;
        function15 = function14;
        i22 = i19;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0219, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0271, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0485  */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m966BasicTextRWo7tUw(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier3;
        int i20;
        Map<String, InlineTextContent> emptyMap;
        ColorProducer colorProducer2;
        final SelectionRegistrar selectionRegistrar;
        int i21;
        boolean z3;
        int i22;
        TextStyle textStyle3;
        SelectionController selectionController;
        boolean hasInlineContent;
        Composer composer2;
        int i23;
        int i24;
        boolean z4;
        boolean z5;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Function1<? super TextLayoutResult, Unit> function13;
        int i25;
        final int i26;
        final ColorProducer colorProducer3;
        final Map<String, InlineTextContent> map2;
        final boolean z6;
        final int i27;
        final Function1<? super TextLayoutResult, Unit> function14;
        final TextStyle textStyle4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)196@9257L7:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                            i13 = i2;
                        } else {
                            i13 = i2;
                            if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i13) ? 1048576 : 524288;
                            }
                        }
                        i14 = i5 & 128;
                        if (i14 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i15 = i14;
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                            i16 = i5 & 256;
                            if (i16 == 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i17 = i16;
                                i6 |= startRestartGroup.changedInstance(map) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                i18 = i5 & 512;
                                if (i18 != 0) {
                                    i6 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i19 = i18;
                                    i6 |= startRestartGroup.changedInstance(colorProducer) ? 536870912 : 268435456;
                                    if ((i6 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                                        modifier3 = i28 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if (i8 != 0) {
                                            function12 = null;
                                        }
                                        if (i9 != 0) {
                                            i10 = TextOverflow.INSTANCE.m6203getClipgIe3tQ8();
                                        }
                                        if (i11 != 0) {
                                            z2 = true;
                                        }
                                        if (i12 != 0) {
                                            i13 = Integer.MAX_VALUE;
                                        }
                                        int i29 = i13;
                                        i20 = i15 == 0 ? 1 : i3;
                                        emptyMap = i17 == 0 ? MapsKt.emptyMap() : map;
                                        colorProducer2 = i19 == 0 ? null : colorProducer;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:191)");
                                        }
                                        HeightInLinesModifierKt.validateMinMaxLines(i20, i29);
                                        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localSelectionRegistrar);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        selectionRegistrar = (SelectionRegistrar) consume;
                                        if (selectionRegistrar == null) {
                                            startRestartGroup.startReplaceGroup(-1584983428);
                                            ComposerKt.sourceInformation(startRestartGroup, "198@9393L7,200@9539L69,200@9456L152,203@9617L234");
                                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume2 = startRestartGroup.consume(localTextSelectionColors);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            textStyle3 = textStyle2;
                                            long backgroundColor = ((TextSelectionColors) consume2).getBackgroundColor();
                                            Object[] objArr = {selectionRegistrar};
                                            Saver<Long, Long> selectionIdSaver = selectionIdSaver(selectionRegistrar);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -328216839, "CC(remember):BasicText.kt#9igjgp");
                                            boolean changedInstance = startRestartGroup.changedInstance(selectionRegistrar);
                                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (changedInstance) {
                                                i21 = i6;
                                            } else {
                                                i21 = i6;
                                            }
                                            rememberedValue3 = (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Long invoke() {
                                                    return Long.valueOf(SelectionRegistrar.this.nextSelectableId());
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Number number = (Number) RememberSaveableKt.m3409rememberSaveable(objArr, (Saver) selectionIdSaver, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 4);
                                            boolean z7 = z2;
                                            i22 = i29;
                                            long longValue = number.longValue();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -328214178, "CC(remember):BasicText.kt#9igjgp");
                                            boolean changed2 = startRestartGroup.changed(longValue) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(backgroundColor);
                                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (changed2) {
                                                z3 = z7;
                                            } else {
                                                z3 = z7;
                                            }
                                            rememberedValue4 = new SelectionController(longValue, selectionRegistrar, backgroundColor, null, 8, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                            selectionController = (SelectionController) rememberedValue4;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                        } else {
                                            i21 = i6;
                                            z3 = z2;
                                            i22 = i29;
                                            textStyle3 = textStyle2;
                                            startRestartGroup.startReplaceGroup(-1584467526);
                                            startRestartGroup.endReplaceGroup();
                                            selectionController = null;
                                        }
                                        hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                                        boolean hasLinks = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                                        if (hasInlineContent && !hasLinks) {
                                            startRestartGroup.startReplaceGroup(-1584294453);
                                            ComposerKt.sourceInformation(startRestartGroup, "229@10603L7,217@10089L814");
                                            Modifier m3983graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                                            i23 = i10;
                                            composer2 = startRestartGroup;
                                            Function1<? super TextLayoutResult, Unit> function15 = function12;
                                            i24 = i22;
                                            z4 = z3;
                                            Modifier m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function15, i23, z4, i24, i20, resolver, null, null, selectionController, colorProducer2, null);
                                            EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m971textModifiercFh6CEA);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                                            Updater.m3323setimpl(m3316constructorimpl, emptyMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceGroup();
                                            function13 = function15;
                                        } else {
                                            SelectionController selectionController2 = selectionController;
                                            composer2 = startRestartGroup;
                                            i23 = i10;
                                            i24 = i22;
                                            z4 = z3;
                                            composer2.startReplaceGroup(-1583391888);
                                            ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                                            ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                                            z5 = (i21 & 14) != 4;
                                            rememberedValue = composer2.rememberedValue();
                                            if (!z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                                                composer2.updateRememberedValue(rememberedValue);
                                            }
                                            final MutableState mutableState = (MutableState) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            AnnotatedString BasicText_RWo7tUw$lambda$5 = BasicText_RWo7tUw$lambda$5(mutableState);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer2.consume(localFontFamilyResolver2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            FontFamily.Resolver resolver2 = (FontFamily.Resolver) consume4;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                                            changed = composer2.changed(mutableState);
                                            rememberedValue2 = composer2.rememberedValue();
                                            if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                        invoke2(textSubstitutionValue);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                        AnnotatedString original;
                                                        MutableState<AnnotatedString> mutableState2 = mutableState;
                                                        if (textSubstitutionValue.isShowingSubstitution()) {
                                                            original = textSubstitutionValue.getSubstitution();
                                                        } else {
                                                            original = textSubstitutionValue.getOriginal();
                                                        }
                                                        mutableState2.setValue(original);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue2);
                                            }
                                            Function1 function16 = (Function1) rememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            int i30 = i21 << 6;
                                            Function1<? super TextLayoutResult, Unit> function17 = function12;
                                            Modifier modifier4 = modifier3;
                                            m969LayoutWithLinksAndInlineContentvOo2fZY(modifier4, BasicText_RWo7tUw$lambda$5, function17, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver2, selectionController2, colorProducer2, function16, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i30) | (29360128 & i30) | (234881024 & i30) | (i30 & 1879048192), (i21 >> 21) & 896, 0);
                                            function13 = function17;
                                            modifier3 = modifier4;
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        i25 = i24;
                                        i26 = i20;
                                        colorProducer3 = colorProducer2;
                                        map2 = emptyMap;
                                        modifier2 = modifier3;
                                        z6 = z4;
                                        i27 = i23;
                                        function14 = function13;
                                        textStyle4 = textStyle3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        i26 = i3;
                                        colorProducer3 = colorProducer;
                                        composer2 = startRestartGroup;
                                        i25 = i13;
                                        z6 = z2;
                                        textStyle4 = textStyle2;
                                        function14 = function12;
                                        i27 = i10;
                                        map2 = map;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        final Modifier modifier5 = modifier2;
                                        final int i31 = i25;
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
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

                                            public final void invoke(Composer composer3, int i32) {
                                                BasicTextKt.m966BasicTextRWo7tUw(AnnotatedString.this, modifier5, textStyle4, function14, i27, z6, i31, i26, map2, colorProducer3, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i19 = i18;
                                if ((i6 & 306783379) == 306783378) {
                                }
                                if (i28 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                int i292 = i13;
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                HeightInLinesModifierKt.validateMinMaxLines(i20, i292);
                                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume5 = startRestartGroup.consume(localSelectionRegistrar2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                selectionRegistrar = (SelectionRegistrar) consume5;
                                if (selectionRegistrar == null) {
                                }
                                hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                                boolean hasLinks2 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                                if (hasInlineContent) {
                                }
                                SelectionController selectionController22 = selectionController;
                                composer2 = startRestartGroup;
                                i23 = i10;
                                i24 = i22;
                                z4 = z3;
                                composer2.startReplaceGroup(-1583391888);
                                ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                                ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                                if ((i21 & 14) != 4) {
                                }
                                rememberedValue = composer2.rememberedValue();
                                if (!z5) {
                                }
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                                composer2.updateRememberedValue(rememberedValue);
                                final MutableState<AnnotatedString> mutableState2 = (MutableState) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                AnnotatedString BasicText_RWo7tUw$lambda$52 = BasicText_RWo7tUw$lambda$5(mutableState2);
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume42 = composer2.consume(localFontFamilyResolver22);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                FontFamily.Resolver resolver22 = (FontFamily.Resolver) consume42;
                                ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                                changed = composer2.changed(mutableState2);
                                rememberedValue2 = composer2.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                        invoke2(textSubstitutionValue);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                        AnnotatedString original;
                                        MutableState<AnnotatedString> mutableState22 = mutableState2;
                                        if (textSubstitutionValue.isShowingSubstitution()) {
                                            original = textSubstitutionValue.getSubstitution();
                                        } else {
                                            original = textSubstitutionValue.getOriginal();
                                        }
                                        mutableState22.setValue(original);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                                Function1 function162 = (Function1) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                int i302 = i21 << 6;
                                Function1<? super TextLayoutResult, Unit> function172 = function12;
                                Modifier modifier42 = modifier3;
                                m969LayoutWithLinksAndInlineContentvOo2fZY(modifier42, BasicText_RWo7tUw$lambda$52, function172, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver22, selectionController22, colorProducer2, function162, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i302) | (29360128 & i302) | (234881024 & i302) | (i302 & 1879048192), (i21 >> 21) & 896, 0);
                                function13 = function172;
                                modifier3 = modifier42;
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i25 = i24;
                                i26 = i20;
                                colorProducer3 = colorProducer2;
                                map2 = emptyMap;
                                modifier2 = modifier3;
                                z6 = z4;
                                i27 = i23;
                                function14 = function13;
                                textStyle4 = textStyle3;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i17 = i16;
                            i18 = i5 & 512;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            if ((i6 & 306783379) == 306783378) {
                            }
                            if (i28 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            int i2922 = i13;
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i20, i2922);
                            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar22 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume52 = startRestartGroup.consume(localSelectionRegistrar22);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (SelectionRegistrar) consume52;
                            if (selectionRegistrar == null) {
                            }
                            hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                            boolean hasLinks22 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                            if (hasInlineContent) {
                            }
                            SelectionController selectionController222 = selectionController;
                            composer2 = startRestartGroup;
                            i23 = i10;
                            i24 = i22;
                            z4 = z3;
                            composer2.startReplaceGroup(-1583391888);
                            ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                            ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                            if ((i21 & 14) != 4) {
                            }
                            rememberedValue = composer2.rememberedValue();
                            if (!z5) {
                            }
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                            composer2.updateRememberedValue(rememberedValue);
                            final MutableState<AnnotatedString> mutableState22 = (MutableState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            AnnotatedString BasicText_RWo7tUw$lambda$522 = BasicText_RWo7tUw$lambda$5(mutableState22);
                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume422 = composer2.consume(localFontFamilyResolver222);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            FontFamily.Resolver resolver222 = (FontFamily.Resolver) consume422;
                            ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                            changed = composer2.changed(mutableState22);
                            rememberedValue2 = composer2.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                    invoke2(textSubstitutionValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                    AnnotatedString original;
                                    MutableState<AnnotatedString> mutableState222 = mutableState22;
                                    if (textSubstitutionValue.isShowingSubstitution()) {
                                        original = textSubstitutionValue.getSubstitution();
                                    } else {
                                        original = textSubstitutionValue.getOriginal();
                                    }
                                    mutableState222.setValue(original);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                            Function1 function1622 = (Function1) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            int i3022 = i21 << 6;
                            Function1<? super TextLayoutResult, Unit> function1722 = function12;
                            Modifier modifier422 = modifier3;
                            m969LayoutWithLinksAndInlineContentvOo2fZY(modifier422, BasicText_RWo7tUw$lambda$522, function1722, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver222, selectionController222, colorProducer2, function1622, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i3022) | (29360128 & i3022) | (234881024 & i3022) | (i3022 & 1879048192), (i21 >> 21) & 896, 0);
                            function13 = function1722;
                            modifier3 = modifier422;
                            composer2.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i25 = i24;
                            i26 = i20;
                            colorProducer3 = colorProducer2;
                            map2 = emptyMap;
                            modifier2 = modifier3;
                            z6 = z4;
                            i27 = i23;
                            function14 = function13;
                            textStyle4 = textStyle3;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i15 = i14;
                        i16 = i5 & 256;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i5 & 512;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        if ((i6 & 306783379) == 306783378) {
                        }
                        if (i28 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        int i29222 = i13;
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        HeightInLinesModifierKt.validateMinMaxLines(i20, i29222);
                        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume522 = startRestartGroup.consume(localSelectionRegistrar222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        selectionRegistrar = (SelectionRegistrar) consume522;
                        if (selectionRegistrar == null) {
                        }
                        hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                        boolean hasLinks222 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                        if (hasInlineContent) {
                        }
                        SelectionController selectionController2222 = selectionController;
                        composer2 = startRestartGroup;
                        i23 = i10;
                        i24 = i22;
                        z4 = z3;
                        composer2.startReplaceGroup(-1583391888);
                        ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                        ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                        if ((i21 & 14) != 4) {
                        }
                        rememberedValue = composer2.rememberedValue();
                        if (!z5) {
                        }
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                        composer2.updateRememberedValue(rememberedValue);
                        final MutableState<AnnotatedString> mutableState222 = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        AnnotatedString BasicText_RWo7tUw$lambda$5222 = BasicText_RWo7tUw$lambda$5(mutableState222);
                        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume4222 = composer2.consume(localFontFamilyResolver2222);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        FontFamily.Resolver resolver2222 = (FontFamily.Resolver) consume4222;
                        ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                        changed = composer2.changed(mutableState222);
                        rememberedValue2 = composer2.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                invoke2(textSubstitutionValue);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                AnnotatedString original;
                                MutableState<AnnotatedString> mutableState2222 = mutableState222;
                                if (textSubstitutionValue.isShowingSubstitution()) {
                                    original = textSubstitutionValue.getSubstitution();
                                } else {
                                    original = textSubstitutionValue.getOriginal();
                                }
                                mutableState2222.setValue(original);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                        Function1 function16222 = (Function1) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        int i30222 = i21 << 6;
                        Function1<? super TextLayoutResult, Unit> function17222 = function12;
                        Modifier modifier4222 = modifier3;
                        m969LayoutWithLinksAndInlineContentvOo2fZY(modifier4222, BasicText_RWo7tUw$lambda$5222, function17222, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver2222, selectionController2222, colorProducer2, function16222, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i30222) | (29360128 & i30222) | (234881024 & i30222) | (i30222 & 1879048192), (i21 >> 21) & 896, 0);
                        function13 = function17222;
                        modifier3 = modifier4222;
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i25 = i24;
                        i26 = i20;
                        colorProducer3 = colorProducer2;
                        map2 = emptyMap;
                        modifier2 = modifier3;
                        z6 = z4;
                        i27 = i23;
                        function14 = function13;
                        textStyle4 = textStyle3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i14 = i5 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 256;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i5 & 512;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if ((i6 & 306783379) == 306783378) {
                    }
                    if (i28 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    int i292222 = i13;
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    HeightInLinesModifierKt.validateMinMaxLines(i20, i292222);
                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5222 = startRestartGroup.consume(localSelectionRegistrar2222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (SelectionRegistrar) consume5222;
                    if (selectionRegistrar == null) {
                    }
                    hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                    boolean hasLinks2222 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                    if (hasInlineContent) {
                    }
                    SelectionController selectionController22222 = selectionController;
                    composer2 = startRestartGroup;
                    i23 = i10;
                    i24 = i22;
                    z4 = z3;
                    composer2.startReplaceGroup(-1583391888);
                    ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                    ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                    if ((i21 & 14) != 4) {
                    }
                    rememberedValue = composer2.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                    composer2.updateRememberedValue(rememberedValue);
                    final MutableState<AnnotatedString> mutableState2222 = (MutableState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    AnnotatedString BasicText_RWo7tUw$lambda$52222 = BasicText_RWo7tUw$lambda$5(mutableState2222);
                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume42222 = composer2.consume(localFontFamilyResolver22222);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    FontFamily.Resolver resolver22222 = (FontFamily.Resolver) consume42222;
                    ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                    changed = composer2.changed(mutableState2222);
                    rememberedValue2 = composer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                            invoke2(textSubstitutionValue);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                            AnnotatedString original;
                            MutableState<AnnotatedString> mutableState22222 = mutableState2222;
                            if (textSubstitutionValue.isShowingSubstitution()) {
                                original = textSubstitutionValue.getSubstitution();
                            } else {
                                original = textSubstitutionValue.getOriginal();
                            }
                            mutableState22222.setValue(original);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                    Function1 function162222 = (Function1) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    int i302222 = i21 << 6;
                    Function1<? super TextLayoutResult, Unit> function172222 = function12;
                    Modifier modifier42222 = modifier3;
                    m969LayoutWithLinksAndInlineContentvOo2fZY(modifier42222, BasicText_RWo7tUw$lambda$52222, function172222, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver22222, selectionController22222, colorProducer2, function162222, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i302222) | (29360128 & i302222) | (234881024 & i302222) | (i302222 & 1879048192), (i21 >> 21) & 896, 0);
                    function13 = function172222;
                    modifier3 = modifier42222;
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i25 = i24;
                    i26 = i20;
                    colorProducer3 = colorProducer2;
                    map2 = emptyMap;
                    modifier2 = modifier3;
                    z6 = z4;
                    i27 = i23;
                    function14 = function13;
                    textStyle4 = textStyle3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i14 = i5 & 128;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i5 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i5 & 512;
                if (i18 != 0) {
                }
                i19 = i18;
                if ((i6 & 306783379) == 306783378) {
                }
                if (i28 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                int i2922222 = i13;
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeightInLinesModifierKt.validateMinMaxLines(i20, i2922222);
                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar22222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52222 = startRestartGroup.consume(localSelectionRegistrar22222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (SelectionRegistrar) consume52222;
                if (selectionRegistrar == null) {
                }
                hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                boolean hasLinks22222 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                if (hasInlineContent) {
                }
                SelectionController selectionController222222 = selectionController;
                composer2 = startRestartGroup;
                i23 = i10;
                i24 = i22;
                z4 = z3;
                composer2.startReplaceGroup(-1583391888);
                ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                if ((i21 & 14) != 4) {
                }
                rememberedValue = composer2.rememberedValue();
                if (!z5) {
                }
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                composer2.updateRememberedValue(rememberedValue);
                final MutableState<AnnotatedString> mutableState22222 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                AnnotatedString BasicText_RWo7tUw$lambda$522222 = BasicText_RWo7tUw$lambda$5(mutableState22222);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver222222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume422222 = composer2.consume(localFontFamilyResolver222222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                FontFamily.Resolver resolver222222 = (FontFamily.Resolver) consume422222;
                ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                changed = composer2.changed(mutableState22222);
                rememberedValue2 = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                        invoke2(textSubstitutionValue);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                        AnnotatedString original;
                        MutableState<AnnotatedString> mutableState222222 = mutableState22222;
                        if (textSubstitutionValue.isShowingSubstitution()) {
                            original = textSubstitutionValue.getSubstitution();
                        } else {
                            original = textSubstitutionValue.getOriginal();
                        }
                        mutableState222222.setValue(original);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
                Function1 function1622222 = (Function1) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                int i3022222 = i21 << 6;
                Function1<? super TextLayoutResult, Unit> function1722222 = function12;
                Modifier modifier422222 = modifier3;
                m969LayoutWithLinksAndInlineContentvOo2fZY(modifier422222, BasicText_RWo7tUw$lambda$522222, function1722222, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver222222, selectionController222222, colorProducer2, function1622222, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i3022222) | (29360128 & i3022222) | (234881024 & i3022222) | (i3022222 & 1879048192), (i21 >> 21) & 896, 0);
                function13 = function1722222;
                modifier3 = modifier422222;
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                i25 = i24;
                i26 = i20;
                colorProducer3 = colorProducer2;
                map2 = emptyMap;
                modifier2 = modifier3;
                z6 = z4;
                i27 = i23;
                function14 = function13;
                textStyle4 = textStyle3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i14 = i5 & 128;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i5 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i5 & 512;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i6 & 306783379) == 306783378) {
            }
            if (i28 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            int i29222222 = i13;
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HeightInLinesModifierKt.validateMinMaxLines(i20, i29222222);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar222222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522222 = startRestartGroup.consume(localSelectionRegistrar222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (SelectionRegistrar) consume522222;
            if (selectionRegistrar == null) {
            }
            hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
            boolean hasLinks222222 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
            if (hasInlineContent) {
            }
            SelectionController selectionController2222222 = selectionController;
            composer2 = startRestartGroup;
            i23 = i10;
            i24 = i22;
            z4 = z3;
            composer2.startReplaceGroup(-1583391888);
            ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
            ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
            if ((i21 & 14) != 4) {
            }
            rememberedValue = composer2.rememberedValue();
            if (!z5) {
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
            composer2.updateRememberedValue(rememberedValue);
            final MutableState<AnnotatedString> mutableState222222 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            AnnotatedString BasicText_RWo7tUw$lambda$5222222 = BasicText_RWo7tUw$lambda$5(mutableState222222);
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2222222 = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4222222 = composer2.consume(localFontFamilyResolver2222222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            FontFamily.Resolver resolver2222222 = (FontFamily.Resolver) consume4222222;
            ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
            changed = composer2.changed(mutableState222222);
            rememberedValue2 = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                    invoke2(textSubstitutionValue);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                    AnnotatedString original;
                    MutableState<AnnotatedString> mutableState2222222 = mutableState222222;
                    if (textSubstitutionValue.isShowingSubstitution()) {
                        original = textSubstitutionValue.getSubstitution();
                    } else {
                        original = textSubstitutionValue.getOriginal();
                    }
                    mutableState2222222.setValue(original);
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
            Function1 function16222222 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            int i30222222 = i21 << 6;
            Function1<? super TextLayoutResult, Unit> function17222222 = function12;
            Modifier modifier4222222 = modifier3;
            m969LayoutWithLinksAndInlineContentvOo2fZY(modifier4222222, BasicText_RWo7tUw$lambda$5222222, function17222222, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver2222222, selectionController2222222, colorProducer2, function16222222, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i30222222) | (29360128 & i30222222) | (234881024 & i30222222) | (i30222222 & 1879048192), (i21 >> 21) & 896, 0);
            function13 = function17222222;
            modifier3 = modifier4222222;
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            i25 = i24;
            i26 = i20;
            colorProducer3 = colorProducer2;
            map2 = emptyMap;
            modifier2 = modifier3;
            z6 = z4;
            i27 = i23;
            function14 = function13;
            textStyle4 = textStyle3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i14 = i5 & 128;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i5 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i5 & 512;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i6 & 306783379) == 306783378) {
        }
        if (i28 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        int i292222222 = i13;
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        HeightInLinesModifierKt.validateMinMaxLines(i20, i292222222);
        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2222222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222222 = startRestartGroup.consume(localSelectionRegistrar2222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (SelectionRegistrar) consume5222222;
        if (selectionRegistrar == null) {
        }
        hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
        boolean hasLinks2222222 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
        if (hasInlineContent) {
        }
        SelectionController selectionController22222222 = selectionController;
        composer2 = startRestartGroup;
        i23 = i10;
        i24 = i22;
        z4 = z3;
        composer2.startReplaceGroup(-1583391888);
        ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
        ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
        if ((i21 & 14) != 4) {
        }
        rememberedValue = composer2.rememberedValue();
        if (!z5) {
        }
        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
        composer2.updateRememberedValue(rememberedValue);
        final MutableState<AnnotatedString> mutableState2222222 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        AnnotatedString BasicText_RWo7tUw$lambda$52222222 = BasicText_RWo7tUw$lambda$5(mutableState2222222);
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22222222 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume42222222 = composer2.consume(localFontFamilyResolver22222222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        FontFamily.Resolver resolver22222222 = (FontFamily.Resolver) consume42222222;
        ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
        changed = composer2.changed(mutableState2222222);
        rememberedValue2 = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                invoke2(textSubstitutionValue);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                AnnotatedString original;
                MutableState<AnnotatedString> mutableState22222222 = mutableState2222222;
                if (textSubstitutionValue.isShowingSubstitution()) {
                    original = textSubstitutionValue.getSubstitution();
                } else {
                    original = textSubstitutionValue.getOriginal();
                }
                mutableState22222222.setValue(original);
            }
        };
        composer2.updateRememberedValue(rememberedValue2);
        Function1 function162222222 = (Function1) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        int i302222222 = i21 << 6;
        Function1<? super TextLayoutResult, Unit> function172222222 = function12;
        Modifier modifier42222222 = modifier3;
        m969LayoutWithLinksAndInlineContentvOo2fZY(modifier42222222, BasicText_RWo7tUw$lambda$52222222, function172222222, hasInlineContent, emptyMap, textStyle3, i23, z4, i24, i20, resolver22222222, selectionController22222222, colorProducer2, function162222222, composer2, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i302222222) | (29360128 & i302222222) | (234881024 & i302222222) | (i302222222 & 1879048192), (i21 >> 21) & 896, 0);
        function13 = function172222222;
        modifier3 = modifier42222222;
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        i25 = i24;
        i26 = i20;
        colorProducer3 = colorProducer2;
        map2 = emptyMap;
        modifier2 = modifier3;
        z6 = z4;
        i27 = i23;
        function14 = function13;
        textStyle4 = textStyle3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final AnnotatedString BasicText_RWo7tUw$lambda$5(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m965BasicTextBpD7jsM(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        String str2;
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i12;
        final int i13;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)279@12355L234:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i3 & 6) == 0) {
                i5 = (startRestartGroup.changed(str2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i6 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                if (i7 != 0) {
                                    function12 = null;
                                }
                                if (i8 != 0) {
                                    i9 = TextOverflow.INSTANCE.m6203getClipgIe3tQ8();
                                }
                                if (i10 != 0) {
                                    z2 = true;
                                }
                                int i15 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:278)");
                                }
                                TextStyle textStyle4 = textStyle2;
                                int i16 = i9;
                                Function1 function14 = function12;
                                Modifier modifier4 = companion;
                                m968BasicTextVhcvRP8(str2, modifier4, textStyle4, (Function1<? super TextLayoutResult, Unit>) function14, i16, z2, i15, 1, (ColorProducer) null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                textStyle3 = textStyle4;
                                function13 = function14;
                                i12 = i16;
                                i13 = i15;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i13 = i2;
                                modifier3 = modifier2;
                                textStyle3 = textStyle2;
                                function13 = function12;
                                i12 = i9;
                            }
                            final boolean z3 = z2;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
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

                                    public final void invoke(Composer composer2, int i17) {
                                        BasicTextKt.m965BasicTextBpD7jsM(str, modifier3, textStyle3, function13, i12, z3, i13, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        if ((i5 & 599187) == 599186) {
                        }
                        if (i14 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TextStyle textStyle42 = textStyle2;
                        int i162 = i9;
                        Function1 function142 = function12;
                        Modifier modifier42 = companion;
                        m968BasicTextVhcvRP8(str2, modifier42, textStyle42, (Function1<? super TextLayoutResult, Unit>) function142, i162, z2, i15, 1, (ColorProducer) null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        textStyle3 = textStyle42;
                        function13 = function142;
                        i12 = i162;
                        i13 = i15;
                        final boolean z32 = z2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    if (i14 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TextStyle textStyle422 = textStyle2;
                    int i1622 = i9;
                    Function1 function1422 = function12;
                    Modifier modifier422 = companion;
                    m968BasicTextVhcvRP8(str2, modifier422, textStyle422, (Function1<? super TextLayoutResult, Unit>) function1422, i1622, z2, i15, 1, (ColorProducer) null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier422;
                    textStyle3 = textStyle422;
                    function13 = function1422;
                    i12 = i1622;
                    i13 = i15;
                    final boolean z322 = z2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                if (i14 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                TextStyle textStyle4222 = textStyle2;
                int i16222 = i9;
                Function1 function14222 = function12;
                Modifier modifier4222 = companion;
                m968BasicTextVhcvRP8(str2, modifier4222, textStyle4222, (Function1<? super TextLayoutResult, Unit>) function14222, i16222, z2, i15, 1, (ColorProducer) null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4222;
                textStyle3 = textStyle4222;
                function13 = function14222;
                i12 = i16222;
                i13 = i15;
                final boolean z3222 = z2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            if (i14 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle textStyle42222 = textStyle2;
            int i162222 = i9;
            Function1 function142222 = function12;
            Modifier modifier42222 = companion;
            m968BasicTextVhcvRP8(str2, modifier42222, textStyle42222, (Function1<? super TextLayoutResult, Unit>) function142222, i162222, z2, i15, 1, (ColorProducer) null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42222;
            textStyle3 = textStyle42222;
            function13 = function142222;
            i12 = i162222;
            i13 = i15;
            final boolean z32222 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        if (i14 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        TextStyle textStyle422222 = textStyle2;
        int i1622222 = i9;
        Function1 function1422222 = function12;
        Modifier modifier422222 = companion;
        m968BasicTextVhcvRP8(str2, modifier422222, textStyle422222, (Function1<? super TextLayoutResult, Unit>) function1422222, i1622222, z2, i15, 1, (ColorProducer) null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier422222;
        textStyle3 = textStyle422222;
        function13 = function1422222;
        i12 = i1622222;
        i13 = i15;
        final boolean z322222 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006c  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m963BasicText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, Composer composer, final int i3, final int i4) {
        AnnotatedString annotatedString2;
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i14;
        final boolean z3;
        final int i15;
        final Map map2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)303@13046L273:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i3 & 6) == 0) {
                i5 = (startRestartGroup.changed(annotatedString2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i4 & 128;
                            if (i12 == 0) {
                                i5 |= 12582912;
                            } else if ((i3 & 12582912) == 0) {
                                i13 = i12;
                                i5 |= startRestartGroup.changedInstance(map) ? 8388608 : 4194304;
                                if ((i5 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i7 != 0) {
                                        function12 = null;
                                    }
                                    if (i8 != 0) {
                                        i9 = TextOverflow.INSTANCE.m6203getClipgIe3tQ8();
                                    }
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    int i17 = i11 != 0 ? Integer.MAX_VALUE : i2;
                                    Map emptyMap = i13 != 0 ? MapsKt.emptyMap() : map;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:302)");
                                    }
                                    Modifier modifier4 = companion;
                                    int i18 = i17;
                                    Function1 function14 = function12;
                                    boolean z4 = z2;
                                    int i19 = i9;
                                    TextStyle textStyle4 = textStyle2;
                                    m966BasicTextRWo7tUw(annotatedString2, modifier4, textStyle4, function14, i19, z4, i18, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    function13 = function14;
                                    i14 = i19;
                                    z3 = z4;
                                    i15 = i18;
                                    map2 = emptyMap;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i15 = i2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    i14 = i9;
                                    z3 = z2;
                                    map2 = map;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                                        public final void invoke(Composer composer2, int i20) {
                                            BasicTextKt.m963BasicText4YKlhWE(AnnotatedString.this, modifier3, textStyle3, function13, i14, z3, i15, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i13 = i12;
                            if ((i5 & 4793491) == 4793490) {
                            }
                            if (i16 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifier42 = companion;
                            int i182 = i17;
                            Function1 function142 = function12;
                            boolean z42 = z2;
                            int i192 = i9;
                            TextStyle textStyle42 = textStyle2;
                            m966BasicTextRWo7tUw(annotatedString2, modifier42, textStyle42, function142, i192, z42, i182, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            textStyle3 = textStyle42;
                            function13 = function142;
                            i14 = i192;
                            z3 = z42;
                            i15 = i182;
                            map2 = emptyMap;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i4 & 128;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if ((i5 & 4793491) == 4793490) {
                        }
                        if (i16 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier422 = companion;
                        int i1822 = i17;
                        Function1 function1422 = function12;
                        boolean z422 = z2;
                        int i1922 = i9;
                        TextStyle textStyle422 = textStyle2;
                        m966BasicTextRWo7tUw(annotatedString2, modifier422, textStyle422, function1422, i1922, z422, i1822, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier422;
                        textStyle3 = textStyle422;
                        function13 = function1422;
                        i14 = i1922;
                        z3 = z422;
                        i15 = i1822;
                        map2 = emptyMap;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i5 & 4793491) == 4793490) {
                    }
                    if (i16 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier4222 = companion;
                    int i18222 = i17;
                    Function1 function14222 = function12;
                    boolean z4222 = z2;
                    int i19222 = i9;
                    TextStyle textStyle4222 = textStyle2;
                    m966BasicTextRWo7tUw(annotatedString2, modifier4222, textStyle4222, function14222, i19222, z4222, i18222, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4222;
                    textStyle3 = textStyle4222;
                    function13 = function14222;
                    i14 = i19222;
                    z3 = z4222;
                    i15 = i18222;
                    map2 = emptyMap;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                i12 = i4 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i5 & 4793491) == 4793490) {
                }
                if (i16 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42222 = companion;
                int i182222 = i17;
                Function1 function142222 = function12;
                boolean z42222 = z2;
                int i192222 = i9;
                TextStyle textStyle42222 = textStyle2;
                m966BasicTextRWo7tUw(annotatedString2, modifier42222, textStyle42222, function142222, i192222, z42222, i182222, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42222;
                textStyle3 = textStyle42222;
                function13 = function142222;
                i14 = i192222;
                z3 = z42222;
                i15 = i182222;
                map2 = emptyMap;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            i12 = i4 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i5 & 4793491) == 4793490) {
            }
            if (i16 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier422222 = companion;
            int i1822222 = i17;
            Function1 function1422222 = function12;
            boolean z422222 = z2;
            int i1922222 = i9;
            TextStyle textStyle422222 = textStyle2;
            m966BasicTextRWo7tUw(annotatedString2, modifier422222, textStyle422222, function1422222, i1922222, z422222, i1822222, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422222;
            textStyle3 = textStyle422222;
            function13 = function1422222;
            i14 = i1922222;
            z3 = z422222;
            i15 = i1822222;
            map2 = emptyMap;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        i12 = i4 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i5 & 4793491) == 4793490) {
        }
        if (i16 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier4222222 = companion;
        int i18222222 = i17;
        Function1 function14222222 = function12;
        boolean z4222222 = z2;
        int i19222222 = i9;
        TextStyle textStyle4222222 = textStyle2;
        m966BasicTextRWo7tUw(annotatedString2, modifier4222222, textStyle4222222, function14222222, i19222222, z4222222, i18222222, 1, emptyMap, null, startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222222;
        textStyle3 = textStyle4222222;
        function13 = function14222222;
        i14 = i19222222;
        z3 = z4222222;
        i15 = i18222222;
        map2 = emptyMap;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006c  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m964BasicText4YKlhWE(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        String str2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i15;
        final boolean z3;
        final int i16;
        final int i17;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)327@13717L86:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i4 & 6) == 0) {
                i6 = (startRestartGroup.changed(str2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i18 = i5 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i4) == 0) {
                            z2 = z;
                            i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i13 = i5 & 128;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i14 = i13;
                                i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                                if ((i6 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i18 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i7 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i8 != 0) {
                                        function12 = null;
                                    }
                                    if (i9 != 0) {
                                        i10 = TextOverflow.INSTANCE.m6203getClipgIe3tQ8();
                                    }
                                    if (i11 != 0) {
                                        z2 = true;
                                    }
                                    int i19 = i12 != 0 ? Integer.MAX_VALUE : i2;
                                    int i20 = i14 != 0 ? 1 : i3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:327)");
                                    }
                                    Modifier modifier4 = companion;
                                    int i21 = i19;
                                    Function1 function14 = function12;
                                    boolean z4 = z2;
                                    int i22 = i10;
                                    TextStyle textStyle4 = textStyle2;
                                    m968BasicTextVhcvRP8(str2, modifier4, textStyle4, (Function1<? super TextLayoutResult, Unit>) function14, i22, z4, i21, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    function13 = function14;
                                    i15 = i22;
                                    z3 = z4;
                                    i16 = i21;
                                    i17 = i20;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i16 = i2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    i15 = i10;
                                    z3 = z2;
                                    i17 = i3;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
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

                                        public final void invoke(Composer composer2, int i23) {
                                            BasicTextKt.m964BasicText4YKlhWE(str, modifier3, textStyle3, function13, i15, z3, i16, i17, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i13;
                            if ((i6 & 4793491) == 4793490) {
                            }
                            if (i18 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifier42 = companion;
                            int i212 = i19;
                            Function1 function142 = function12;
                            boolean z42 = z2;
                            int i222 = i10;
                            TextStyle textStyle42 = textStyle2;
                            m968BasicTextVhcvRP8(str2, modifier42, textStyle42, (Function1<? super TextLayoutResult, Unit>) function142, i222, z42, i212, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            textStyle3 = textStyle42;
                            function13 = function142;
                            i15 = i222;
                            z3 = z42;
                            i16 = i212;
                            i17 = i20;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & 128;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        if ((i6 & 4793491) == 4793490) {
                        }
                        if (i18 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier422 = companion;
                        int i2122 = i19;
                        Function1 function1422 = function12;
                        boolean z422 = z2;
                        int i2222 = i10;
                        TextStyle textStyle422 = textStyle2;
                        m968BasicTextVhcvRP8(str2, modifier422, textStyle422, (Function1<? super TextLayoutResult, Unit>) function1422, i2222, z422, i2122, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier422;
                        textStyle3 = textStyle422;
                        function13 = function1422;
                        i15 = i2222;
                        z3 = z422;
                        i16 = i2122;
                        i17 = i20;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    z2 = z;
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    if ((i6 & 4793491) == 4793490) {
                    }
                    if (i18 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier4222 = companion;
                    int i21222 = i19;
                    Function1 function14222 = function12;
                    boolean z4222 = z2;
                    int i22222 = i10;
                    TextStyle textStyle4222 = textStyle2;
                    m968BasicTextVhcvRP8(str2, modifier4222, textStyle4222, (Function1<? super TextLayoutResult, Unit>) function14222, i22222, z4222, i21222, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4222;
                    textStyle3 = textStyle4222;
                    function13 = function14222;
                    i15 = i22222;
                    z3 = z4222;
                    i16 = i21222;
                    i17 = i20;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                z2 = z;
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & 128;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i6 & 4793491) == 4793490) {
                }
                if (i18 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42222 = companion;
                int i212222 = i19;
                Function1 function142222 = function12;
                boolean z42222 = z2;
                int i222222 = i10;
                TextStyle textStyle42222 = textStyle2;
                m968BasicTextVhcvRP8(str2, modifier42222, textStyle42222, (Function1<? super TextLayoutResult, Unit>) function142222, i222222, z42222, i212222, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42222;
                textStyle3 = textStyle42222;
                function13 = function142222;
                i15 = i222222;
                z3 = z42222;
                i16 = i212222;
                i17 = i20;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            z2 = z;
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & 128;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i6 & 4793491) == 4793490) {
            }
            if (i18 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier422222 = companion;
            int i2122222 = i19;
            Function1 function1422222 = function12;
            boolean z422222 = z2;
            int i2222222 = i10;
            TextStyle textStyle422222 = textStyle2;
            m968BasicTextVhcvRP8(str2, modifier422222, textStyle422222, (Function1<? super TextLayoutResult, Unit>) function1422222, i2222222, z422222, i2122222, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422222;
            textStyle3 = textStyle422222;
            function13 = function1422222;
            i15 = i2222222;
            z3 = z422222;
            i16 = i2122222;
            i17 = i20;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        z2 = z;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i6 & 4793491) == 4793490) {
        }
        if (i18 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier4222222 = companion;
        int i21222222 = i19;
        Function1 function14222222 = function12;
        boolean z4222222 = z2;
        int i22222222 = i10;
        TextStyle textStyle4222222 = textStyle2;
        m968BasicTextVhcvRP8(str2, modifier4222222, textStyle4222222, (Function1<? super TextLayoutResult, Unit>) function14222222, i22222222, z4222222, i21222222, i20, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222222;
        textStyle3 = textStyle4222222;
        function13 = function14222222;
        i15 = i22222222;
        z3 = z4222222;
        i16 = i21222222;
        i17 = i20;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a5  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m967BasicTextVhcvRP8(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, Composer composer, final int i4, final int i5) {
        AnnotatedString annotatedString2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i17;
        final boolean z3;
        final int i18;
        final int i19;
        final Map map2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)341@14269L240:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i4 & 6) == 0) {
                i6 = (startRestartGroup.changed(annotatedString2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i20 = i5 & 2;
        if (i20 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i4) == 0) {
                            z2 = z;
                            i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i13 = i5 & 128;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i14 = i13;
                                i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                                i15 = i5 & 256;
                                if (i15 != 0) {
                                    i6 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i16 = i15;
                                    i6 |= startRestartGroup.changedInstance(map) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    if ((i6 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                        if (i20 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if (i8 != 0) {
                                            function12 = null;
                                        }
                                        if (i9 != 0) {
                                            i10 = TextOverflow.INSTANCE.m6203getClipgIe3tQ8();
                                        }
                                        if (i11 != 0) {
                                            z2 = true;
                                        }
                                        int i21 = i12 == 0 ? Integer.MAX_VALUE : i2;
                                        int i22 = i14 == 0 ? i3 : 1;
                                        Map emptyMap = i16 == 0 ? MapsKt.emptyMap() : map;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:341)");
                                        }
                                        int i23 = i22;
                                        int i24 = i21;
                                        TextStyle textStyle4 = textStyle2;
                                        int i25 = i10;
                                        boolean z4 = z2;
                                        Modifier modifier4 = modifier2;
                                        Function1 function14 = function12;
                                        m966BasicTextRWo7tUw(annotatedString2, modifier4, textStyle4, function14, i25, z4, i24, i23, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyle4;
                                        function13 = function14;
                                        i17 = i25;
                                        z3 = z4;
                                        i18 = i24;
                                        i19 = i23;
                                        map2 = emptyMap;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        i18 = i2;
                                        map2 = map;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        function13 = function12;
                                        i17 = i10;
                                        z3 = z2;
                                        i19 = i3;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
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

                                            public final void invoke(Composer composer2, int i26) {
                                                BasicTextKt.m967BasicTextVhcvRP8(AnnotatedString.this, modifier3, textStyle3, function13, i17, z3, i18, i19, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i16 = i15;
                                if ((i6 & 38347923) == 38347922) {
                                }
                                if (i20 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i232 = i22;
                                int i242 = i21;
                                TextStyle textStyle42 = textStyle2;
                                int i252 = i10;
                                boolean z42 = z2;
                                Modifier modifier42 = modifier2;
                                Function1 function142 = function12;
                                m966BasicTextRWo7tUw(annotatedString2, modifier42, textStyle42, function142, i252, z42, i242, i232, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                                textStyle3 = textStyle42;
                                function13 = function142;
                                i17 = i252;
                                z3 = z42;
                                i18 = i242;
                                i19 = i232;
                                map2 = emptyMap;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i5 & 256;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            if ((i6 & 38347923) == 38347922) {
                            }
                            if (i20 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i2322 = i22;
                            int i2422 = i21;
                            TextStyle textStyle422 = textStyle2;
                            int i2522 = i10;
                            boolean z422 = z2;
                            Modifier modifier422 = modifier2;
                            Function1 function1422 = function12;
                            m966BasicTextRWo7tUw(annotatedString2, modifier422, textStyle422, function1422, i2522, z422, i2422, i2322, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier422;
                            textStyle3 = textStyle422;
                            function13 = function1422;
                            i17 = i2522;
                            z3 = z422;
                            i18 = i2422;
                            i19 = i2322;
                            map2 = emptyMap;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        z2 = z;
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & 128;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i5 & 256;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        if ((i6 & 38347923) == 38347922) {
                        }
                        if (i20 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i23222 = i22;
                        int i24222 = i21;
                        TextStyle textStyle4222 = textStyle2;
                        int i25222 = i10;
                        boolean z4222 = z2;
                        Modifier modifier4222 = modifier2;
                        Function1 function14222 = function12;
                        m966BasicTextRWo7tUw(annotatedString2, modifier4222, textStyle4222, function14222, i25222, z4222, i24222, i23222, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4222;
                        textStyle3 = textStyle4222;
                        function13 = function14222;
                        i17 = i25222;
                        z3 = z4222;
                        i18 = i24222;
                        i19 = i23222;
                        map2 = emptyMap;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    z2 = z;
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    if ((i6 & 38347923) == 38347922) {
                    }
                    if (i20 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i232222 = i22;
                    int i242222 = i21;
                    TextStyle textStyle42222 = textStyle2;
                    int i252222 = i10;
                    boolean z42222 = z2;
                    Modifier modifier42222 = modifier2;
                    Function1 function142222 = function12;
                    m966BasicTextRWo7tUw(annotatedString2, modifier42222, textStyle42222, function142222, i252222, z42222, i242222, i232222, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42222;
                    textStyle3 = textStyle42222;
                    function13 = function142222;
                    i17 = i252222;
                    z3 = z42222;
                    i18 = i242222;
                    i19 = i232222;
                    map2 = emptyMap;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                z2 = z;
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & 128;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                if ((i6 & 38347923) == 38347922) {
                }
                if (i20 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2322222 = i22;
                int i2422222 = i21;
                TextStyle textStyle422222 = textStyle2;
                int i2522222 = i10;
                boolean z422222 = z2;
                Modifier modifier422222 = modifier2;
                Function1 function1422222 = function12;
                m966BasicTextRWo7tUw(annotatedString2, modifier422222, textStyle422222, function1422222, i2522222, z422222, i2422222, i2322222, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier422222;
                textStyle3 = textStyle422222;
                function13 = function1422222;
                i17 = i2522222;
                z3 = z422222;
                i18 = i2422222;
                i19 = i2322222;
                map2 = emptyMap;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            z2 = z;
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & 128;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            if ((i6 & 38347923) == 38347922) {
            }
            if (i20 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i23222222 = i22;
            int i24222222 = i21;
            TextStyle textStyle4222222 = textStyle2;
            int i25222222 = i10;
            boolean z4222222 = z2;
            Modifier modifier4222222 = modifier2;
            Function1 function14222222 = function12;
            m966BasicTextRWo7tUw(annotatedString2, modifier4222222, textStyle4222222, function14222222, i25222222, z4222222, i24222222, i23222222, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4222222;
            textStyle3 = textStyle4222222;
            function13 = function14222222;
            i17 = i25222222;
            z3 = z4222222;
            i18 = i24222222;
            i19 = i23222222;
            map2 = emptyMap;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        z2 = z;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        if ((i6 & 38347923) == 38347922) {
        }
        if (i20 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i232222222 = i22;
        int i242222222 = i21;
        TextStyle textStyle42222222 = textStyle2;
        int i252222222 = i10;
        boolean z42222222 = z2;
        Modifier modifier42222222 = modifier2;
        Function1 function142222222 = function12;
        m966BasicTextRWo7tUw(annotatedString2, modifier42222222, textStyle42222222, function142222222, i252222222, z42222222, i242222222, i232222222, emptyMap, null, startRestartGroup, i6 & 268435454, 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier42222222;
        textStyle3 = textStyle42222222;
        function13 = function142222222;
        i17 = i252222222;
        z3 = z42222222;
        i18 = i242222222;
        i19 = i232222222;
        map2 = emptyMap;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final Long invoke(SaverScope saverScope, long j) {
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<Placeable, Function0<IntOffset>>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, Function0<Boolean> function0) {
        if (!function0.invoke().booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            Object parentData = measurable.getParentData();
            Intrinsics.checkNotNull(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult measure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.mo5152measureBRTryo0(Constraints.INSTANCE.m6227fitPrioritizingWidthZbe2FdA(measure.getWidth(), measure.getWidth(), measure.getHeight(), measure.getHeight())), measure.getPlace()));
        }
        return arrayList;
    }

    /* renamed from: textModifier-cFh6CEA, reason: not valid java name */
    private static final Modifier m971textModifiercFh6CEA(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13) {
        if (selectionController == null) {
            return modifier.then(Modifier.INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, function13, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0319  */
    /* renamed from: LayoutWithLinksAndInlineContent-vOo2fZY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m969LayoutWithLinksAndInlineContentvOo2fZY(final Modifier modifier, final AnnotatedString annotatedString, final Function1<? super TextLayoutResult, Unit> function1, final boolean z, Map<String, InlineTextContent> map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamily.Resolver resolver, final SelectionController selectionController, final ColorProducer colorProducer, final Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function12, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Map<String, InlineTextContent> map2;
        TextStyle textStyle2;
        int i8;
        boolean z3;
        int i9;
        int i10;
        final TextLinkScope textLinkScope;
        Function0 function0;
        Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> pair;
        Map<String, InlineTextContent> map3;
        List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> component2;
        List<AnnotatedString.Range<Placeholder>> list;
        Function1 function13;
        final MutableState mutableState;
        boolean changedInstance;
        Object rememberedValue;
        TextMeasurePolicy textMeasurePolicy;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        final Map<String, InlineTextContent> map4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(645129368);
        ComposerKt.sourceInformation(startRestartGroup, "C(LayoutWithLinksAndInlineContent)P(6,13,8,2,3,12,9:c#ui.text.style.TextOverflow,11,4,5,1,10)578@22283L117,565@21843L1459:BasicText.kt#423gt5");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i11 = i6 & 16;
        if (i11 != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            map2 = map;
            i7 |= startRestartGroup.changedInstance(map2) ? 16384 : 8192;
            if ((i6 & 32) == 0) {
                i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i7 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
            }
            if ((i6 & 64) == 0) {
                i7 |= 1572864;
                i8 = i;
            } else {
                i8 = i;
                if ((i4 & 1572864) == 0) {
                    i7 |= startRestartGroup.changed(i8) ? 1048576 : 524288;
                }
            }
            if ((i6 & 128) == 0) {
                i7 |= 12582912;
            } else if ((12582912 & i4) == 0) {
                z3 = z2;
                i7 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                if ((i6 & 256) != 0) {
                    i7 |= 100663296;
                } else if ((100663296 & i4) == 0) {
                    i9 = i2;
                    i7 |= startRestartGroup.changed(i9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    if ((i6 & 512) == 0) {
                        i7 |= 805306368;
                    } else if ((805306368 & i4) == 0) {
                        i7 |= startRestartGroup.changed(i3) ? 536870912 : 268435456;
                        if ((i6 & 1024) != 0) {
                            i10 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i10 = i5 | (startRestartGroup.changedInstance(resolver) ? 4 : 2);
                        } else {
                            i10 = i5;
                        }
                        if ((i6 & 2048) != 0) {
                            i10 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i10 |= startRestartGroup.changedInstance(selectionController) ? 32 : 16;
                        }
                        int i12 = i10;
                        if ((i6 & 4096) != 0) {
                            i12 |= 384;
                        } else if ((i5 & 384) == 0) {
                            i12 |= startRestartGroup.changedInstance(colorProducer) ? 256 : 128;
                            if ((i6 & 8192) == 0) {
                                i12 |= 3072;
                            } else if ((i5 & 3072) == 0) {
                                i12 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                                if ((i7 & 306783379) == 306783378 || (i12 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                    Map<String, InlineTextContent> emptyMap = i11 != 0 ? MapsKt.emptyMap() : map2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(645129368, i7, i12, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)");
                                    }
                                    if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                                        startRestartGroup.startReplaceGroup(-619323167);
                                        ComposerKt.sourceInformation(startRestartGroup, "539@20954L38");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297072527, "CC(remember):BasicText.kt#9igjgp");
                                        boolean z4 = (i7 & 112) == 32;
                                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new TextLinkScope(annotatedString);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                        textLinkScope = (TextLinkScope) rememberedValue2;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-619265198);
                                        startRestartGroup.endReplaceGroup();
                                        textLinkScope = null;
                                    }
                                    if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                                        startRestartGroup.startReplaceGroup(-619074547);
                                        ComposerKt.sourceInformation(startRestartGroup, "545@21203L90");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297064507, "CC(remember):BasicText.kt#9igjgp");
                                        boolean changed = ((i7 & 112) == 32) | startRestartGroup.changed(textLinkScope);
                                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function0) new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final AnnotatedString invoke() {
                                                    AnnotatedString applyAnnotators$foundation_release;
                                                    TextLinkScope textLinkScope2 = TextLinkScope.this;
                                                    return (textLinkScope2 == null || (applyAnnotators$foundation_release = textLinkScope2.applyAnnotators$foundation_release()) == null) ? annotatedString : applyAnnotators$foundation_release;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        function0 = (Function0) rememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-618966357);
                                        ComposerKt.sourceInformation(startRestartGroup, "548@21307L8");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297061261, "CC(remember):BasicText.kt#9igjgp");
                                        boolean z5 = (i7 & 112) == 32;
                                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (z5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = (Function0) new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final AnnotatedString invoke() {
                                                    return AnnotatedString.this;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        function0 = (Function0) rememberedValue4;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    if (z) {
                                        pair = AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, emptyMap);
                                        map3 = emptyMap;
                                    } else {
                                        map3 = emptyMap;
                                        pair = new Pair<>(null, null);
                                    }
                                    List<AnnotatedString.Range<Placeholder>> component1 = pair.component1();
                                    component2 = pair.component2();
                                    if (z) {
                                        list = component1;
                                        startRestartGroup.startReplaceGroup(-618671702);
                                        ComposerKt.sourceInformation(startRestartGroup, "558@21610L61");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297051512, "CC(remember):BasicText.kt#9igjgp");
                                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            function13 = null;
                                            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        } else {
                                            function13 = null;
                                        }
                                        mutableState = (MutableState) rememberedValue5;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        list = component1;
                                        function13 = null;
                                        startRestartGroup.startReplaceGroup(-618591630);
                                        startRestartGroup.endReplaceGroup();
                                        mutableState = null;
                                    }
                                    if (z) {
                                        startRestartGroup.startReplaceGroup(-618506565);
                                        ComposerKt.sourceInformation(startRestartGroup, "562@21777L44");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297046185, "CC(remember):BasicText.kt#9igjgp");
                                        boolean changed2 = startRestartGroup.changed(mutableState);
                                        Object rememberedValue6 = startRestartGroup.rememberedValue();
                                        if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue6 = (Function1) new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list2) {
                                                    invoke2((List<Rect>) list2);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(List<Rect> list2) {
                                                    MutableState<List<Rect>> mutableState2 = mutableState;
                                                    if (mutableState2 == null) {
                                                        return;
                                                    }
                                                    mutableState2.setValue(list2);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue6);
                                        }
                                        function13 = (Function1) rememberedValue6;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-618442830);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    Modifier m3983graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                    AnnotatedString annotatedString2 = (AnnotatedString) function0.invoke();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                                    Function1 function14 = function13;
                                    changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                                TextLinkScope textLinkScope2 = TextLinkScope.this;
                                                if (textLinkScope2 != null) {
                                                    textLinkScope2.setTextLayoutResult(textLayoutResult);
                                                }
                                                Function1<TextLayoutResult, Unit> function15 = function1;
                                                if (function15 != null) {
                                                    function15.invoke(textLayoutResult);
                                                }
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier m971textModifiercFh6CEA = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default, annotatedString2, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function14, selectionController, colorProducer, function12);
                                    if (!z) {
                                        startRestartGroup.startReplaceGroup(-617362851);
                                        ComposerKt.sourceInformation(startRestartGroup, "595@22992L55");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297007294, "CC(remember):BasicText.kt#9igjgp");
                                        boolean changedInstance2 = startRestartGroup.changedInstance(textLinkScope);
                                        Object rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue7 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextLinkScope textLinkScope2 = TextLinkScope.this;
                                                    return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue7);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        LinksTextMeasurePolicy linksTextMeasurePolicy = new LinksTextMeasurePolicy((Function0) rememberedValue7);
                                        startRestartGroup.endReplaceGroup();
                                        textMeasurePolicy = linksTextMeasurePolicy;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-617202116);
                                        ComposerKt.sourceInformation(startRestartGroup, "599@23147L55,600@23233L39");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297002334, "CC(remember):BasicText.kt#9igjgp");
                                        boolean changedInstance3 = startRestartGroup.changedInstance(textLinkScope);
                                        Object rememberedValue8 = startRestartGroup.rememberedValue();
                                        if (changedInstance3 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue8 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextLinkScope textLinkScope2 = TextLinkScope.this;
                                                    return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue8);
                                        }
                                        Function0 function02 = (Function0) rememberedValue8;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -296999598, "CC(remember):BasicText.kt#9igjgp");
                                        boolean changed3 = startRestartGroup.changed(mutableState);
                                        Object rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (changed3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue9 = (Function0) new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final List<? extends Rect> invoke() {
                                                    MutableState<List<Rect>> mutableState2 = mutableState;
                                                    if (mutableState2 != null) {
                                                        return mutableState2.getValue();
                                                    }
                                                    return null;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue9);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        TextMeasurePolicy textMeasurePolicy2 = new TextMeasurePolicy(function02, (Function0) rememberedValue9);
                                        startRestartGroup.endReplaceGroup();
                                        textMeasurePolicy = textMeasurePolicy2;
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA);
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
                                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                                    Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                                    if (textLinkScope == null) {
                                        startRestartGroup.startReplaceGroup(-515480539);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(537560924);
                                        ComposerKt.sourceInformation(startRestartGroup, "567@21894L18");
                                        textLinkScope.LinksComposables(startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    if (component2 == null) {
                                        startRestartGroup.startReplaceGroup(-515428893);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-515428892);
                                        ComposerKt.sourceInformation(startRestartGroup, "*569@21966L48");
                                        AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, component2, startRestartGroup, (i7 >> 3) & 14);
                                        Unit unit2 = Unit.INSTANCE;
                                        startRestartGroup.endReplaceGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    map4 = map3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    map4 = map2;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
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

                                        public final void invoke(Composer composer2, int i13) {
                                            BasicTextKt.m969LayoutWithLinksAndInlineContentvOo2fZY(Modifier.this, annotatedString, function1, z, map4, textStyle, i, z2, i2, i3, resolver, selectionController, colorProducer, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            if (i11 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                            }
                            if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                            }
                            if (z) {
                            }
                            List<AnnotatedString.Range<Placeholder>> component12 = pair.component1();
                            component2 = pair.component2();
                            if (z) {
                            }
                            if (z) {
                            }
                            Modifier m3983graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                            AnnotatedString annotatedString22 = (AnnotatedString) function0.invoke();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                            Function1 function142 = function13;
                            changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                    TextLinkScope textLinkScope2 = TextLinkScope.this;
                                    if (textLinkScope2 != null) {
                                        textLinkScope2.setTextLayoutResult(textLayoutResult);
                                    }
                                    Function1<TextLayoutResult, Unit> function15 = function1;
                                    if (function15 != null) {
                                        function15.invoke(textLayoutResult);
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier m971textModifiercFh6CEA2 = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default2, annotatedString22, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function142, selectionController, colorProducer, function12);
                            if (!z) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                            Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3316constructorimpl.getInserting()) {
                            }
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                            if (textLinkScope == null) {
                            }
                            if (component2 == null) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            map4 = map3;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i6 & 8192) == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                        }
                        if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                        }
                        if (z) {
                        }
                        List<AnnotatedString.Range<Placeholder>> component122 = pair.component1();
                        component2 = pair.component2();
                        if (z) {
                        }
                        if (z) {
                        }
                        Modifier m3983graphicsLayerAp8cVGQ$default22 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                        AnnotatedString annotatedString222 = (AnnotatedString) function0.invoke();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                        Function1 function1422 = function13;
                        changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                TextLinkScope textLinkScope2 = TextLinkScope.this;
                                if (textLinkScope2 != null) {
                                    textLinkScope2.setTextLayoutResult(textLayoutResult);
                                }
                                Function1<TextLayoutResult, Unit> function15 = function1;
                                if (function15 != null) {
                                    function15.invoke(textLayoutResult);
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier m971textModifiercFh6CEA22 = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default22, annotatedString222, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function1422, selectionController, colorProducer, function12);
                        if (!z) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3316constructorimpl.getInserting()) {
                        }
                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                        if (textLinkScope == null) {
                        }
                        if (component2 == null) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        map4 = map3;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i6 & 1024) != 0) {
                    }
                    if ((i6 & 2048) != 0) {
                    }
                    int i122 = i10;
                    if ((i6 & 4096) != 0) {
                    }
                    if ((i6 & 8192) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                    }
                    if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                    }
                    if (z) {
                    }
                    List<AnnotatedString.Range<Placeholder>> component1222 = pair.component1();
                    component2 = pair.component2();
                    if (z) {
                    }
                    if (z) {
                    }
                    Modifier m3983graphicsLayerAp8cVGQ$default222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                    AnnotatedString annotatedString2222 = (AnnotatedString) function0.invoke();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                    Function1 function14222 = function13;
                    changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                            TextLinkScope textLinkScope2 = TextLinkScope.this;
                            if (textLinkScope2 != null) {
                                textLinkScope2.setTextLayoutResult(textLayoutResult);
                            }
                            Function1<TextLayoutResult, Unit> function15 = function1;
                            if (function15 != null) {
                                function15.invoke(textLayoutResult);
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m971textModifiercFh6CEA222 = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default222, annotatedString2222, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function14222, selectionController, colorProducer, function12);
                    if (!z) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3316constructorimpl.getInserting()) {
                    }
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                    if (textLinkScope == null) {
                    }
                    if (component2 == null) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    map4 = map3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i2;
                if ((i6 & 512) == 0) {
                }
                if ((i6 & 1024) != 0) {
                }
                if ((i6 & 2048) != 0) {
                }
                int i1222 = i10;
                if ((i6 & 4096) != 0) {
                }
                if ((i6 & 8192) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                }
                if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                }
                if (z) {
                }
                List<AnnotatedString.Range<Placeholder>> component12222 = pair.component1();
                component2 = pair.component2();
                if (z) {
                }
                if (z) {
                }
                Modifier m3983graphicsLayerAp8cVGQ$default2222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                AnnotatedString annotatedString22222 = (AnnotatedString) function0.invoke();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                Function1 function142222 = function13;
                changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                        TextLinkScope textLinkScope2 = TextLinkScope.this;
                        if (textLinkScope2 != null) {
                            textLinkScope2.setTextLayoutResult(textLayoutResult);
                        }
                        Function1<TextLayoutResult, Unit> function15 = function1;
                        if (function15 != null) {
                            function15.invoke(textLayoutResult);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier m971textModifiercFh6CEA2222 = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default2222, annotatedString22222, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function142222, selectionController, colorProducer, function12);
                if (!z) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting()) {
                }
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                if (textLinkScope == null) {
                }
                if (component2 == null) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                map4 = map3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((i6 & 256) != 0) {
            }
            i9 = i2;
            if ((i6 & 512) == 0) {
            }
            if ((i6 & 1024) != 0) {
            }
            if ((i6 & 2048) != 0) {
            }
            int i12222 = i10;
            if ((i6 & 4096) != 0) {
            }
            if ((i6 & 8192) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
            }
            if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
            }
            if (z) {
            }
            List<AnnotatedString.Range<Placeholder>> component122222 = pair.component1();
            component2 = pair.component2();
            if (z) {
            }
            if (z) {
            }
            Modifier m3983graphicsLayerAp8cVGQ$default22222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
            AnnotatedString annotatedString222222 = (AnnotatedString) function0.invoke();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
            Function1 function1422222 = function13;
            changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                    invoke2(textLayoutResult);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextLayoutResult textLayoutResult) {
                    TextLinkScope textLinkScope2 = TextLinkScope.this;
                    if (textLinkScope2 != null) {
                        textLinkScope2.setTextLayoutResult(textLayoutResult);
                    }
                    Function1<TextLayoutResult, Unit> function15 = function1;
                    if (function15 != null) {
                        function15.invoke(textLayoutResult);
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m971textModifiercFh6CEA22222 = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default22222, annotatedString222222, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function1422222, selectionController, colorProducer, function12);
            if (!z) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA22222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
            if (textLinkScope == null) {
            }
            if (component2 == null) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            map4 = map3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        map2 = map;
        if ((i6 & 32) == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        if ((i6 & 128) == 0) {
        }
        z3 = z2;
        if ((i6 & 256) != 0) {
        }
        i9 = i2;
        if ((i6 & 512) == 0) {
        }
        if ((i6 & 1024) != 0) {
        }
        if ((i6 & 2048) != 0) {
        }
        int i122222 = i10;
        if ((i6 & 4096) != 0) {
        }
        if ((i6 & 8192) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
        }
        if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
        }
        if (z) {
        }
        List<AnnotatedString.Range<Placeholder>> component1222222 = pair.component1();
        component2 = pair.component2();
        if (z) {
        }
        if (z) {
        }
        Modifier m3983graphicsLayerAp8cVGQ$default222222 = GraphicsLayerModifierKt.m3983graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
        AnnotatedString annotatedString2222222 = (AnnotatedString) function0.invoke();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
        Function1 function14222222 = function13;
        changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                invoke2(textLayoutResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextLayoutResult textLayoutResult) {
                TextLinkScope textLinkScope2 = TextLinkScope.this;
                if (textLinkScope2 != null) {
                    textLinkScope2.setTextLayoutResult(textLayoutResult);
                }
                Function1<TextLayoutResult, Unit> function15 = function1;
                if (function15 != null) {
                    function15.invoke(textLayoutResult);
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m971textModifiercFh6CEA222222 = m971textModifiercFh6CEA(m3983graphicsLayerAp8cVGQ$default222222, annotatedString2222222, textStyle2, (Function1) rememberedValue, i8, z3, i9, i3, resolver, list, function14222222, selectionController, colorProducer, function12);
        if (!z) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m971textModifiercFh6CEA222222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -515487512, "C:BasicText.kt#423gt5");
        if (textLinkScope == null) {
        }
        if (component2 == null) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        map4 = map3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
