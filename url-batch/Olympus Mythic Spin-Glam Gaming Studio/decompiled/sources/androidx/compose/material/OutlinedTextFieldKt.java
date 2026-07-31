package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0089\u0002\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0089\u0002\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020$2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010%\u001aÆ\u0001\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0006\u0010/\u001a\u00020.H\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aE\u0010;\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001aU\u0010D\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\u0006\u0010A\u001a\u00020)2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a\u0083\u0001\u0010Q\u001a\u00020\u0003*\u00020E2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001a2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010J\u001a\u0004\u0018\u00010H2\u0006\u0010K\u001a\u00020H2\b\u0010L\u001a\u0004\u0018\u00010H2\b\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010N\u001a\u00020H2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010A\u001a\u00020)2\u0006\u0010P\u001a\u00020O2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bQ\u0010R\u001a)\u0010V\u001a\u00020\u0005*\u00020\u00052\u0006\u0010S\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010U\"\u0017\u0010X\u001a\u00020W8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bX\u0010Y\"\u001d\u0010Z\u001a\u00020W8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bZ\u0010Y\u001a\u0004\b[\u0010\\\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "border", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "calculateWidth", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "density", "calculateHeight-zUg2_y0", "(IIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m2507constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m2507constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final String value, final Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        TextStyle textStyle2;
        Function2 function25;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i19;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        KeyboardActions keyboardActions3;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function28;
        Modifier modifier2;
        VisualTransformation visualTransformation2;
        Function2 function29;
        KeyboardOptions keyboardOptions3;
        boolean z5;
        TextStyle textStyle3;
        boolean z6;
        TextFieldColors textFieldColors2;
        Shape shape3;
        boolean z7;
        boolean z8;
        long m2260getColor0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        final boolean z9;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final boolean z10;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final TextFieldColors textFieldColors3;
        final boolean z11;
        final TextStyle textStyle4;
        final boolean z12;
        final Function2 function213;
        final int i20;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-2099955827);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i23 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(function23) ? 67108864 : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(keyboardOptions)) {
                        i21 = 256;
                        i13 |= i21;
                    }
                    i21 = 128;
                    i13 |= i21;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) == 0 && startRestartGroup.changed(keyboardActions)) {
                        i23 = 2048;
                    }
                    i13 |= i23;
                }
                i15 = i13;
                i16 = i4 & 16384;
                if (i16 != 0) {
                    i15 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i15 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i17 = i4 & 32768;
                if (i17 != 0) {
                    i15 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    i15 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                i18 = i4 & 65536;
                if (i18 != 0) {
                    i15 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i15 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 29360128) == 0) {
                    i15 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                }
                if ((i3 & 234881024) == 0) {
                    i15 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? 67108864 : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i22 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z13 = i6 != 0 ? true : z;
                        boolean z14 = i7 != 0 ? false : z2;
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        function25 = i8 != 0 ? null : function2;
                        Function2 function214 = i9 != 0 ? null : function22;
                        Function2 function215 = i10 != 0 ? null : function23;
                        Function2 function216 = i11 != 0 ? null : function24;
                        boolean z15 = i12 != 0 ? false : z3;
                        VisualTransformation none = i14 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i15 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            i15 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z16 = i16 != 0 ? false : z4;
                        i19 = i17 != 0 ? Integer.MAX_VALUE : i;
                        KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i18 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            function26 = function215;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            function26 = function215;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 131072) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                            i15 = (-29360129) & i15;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shape;
                        }
                        if ((262144 & i4) != 0) {
                            i15 &= -234881025;
                            keyboardActions3 = keyboardActions5;
                            function27 = function26;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function28 = function216;
                            modifier2 = modifier4;
                            visualTransformation2 = none;
                            function29 = function214;
                            keyboardOptions3 = keyboardOptions2;
                            z5 = z16;
                            textStyle3 = textStyle2;
                            z6 = z14;
                            shape3 = shape2;
                            textFieldColors2 = TextFieldDefaults.INSTANCE.m1034outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                        } else {
                            keyboardActions3 = keyboardActions5;
                            function27 = function26;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function28 = function216;
                            modifier2 = modifier4;
                            visualTransformation2 = none;
                            function29 = function214;
                            keyboardOptions3 = keyboardOptions2;
                            z5 = z16;
                            textStyle3 = textStyle2;
                            z6 = z14;
                            textFieldColors2 = textFieldColors;
                            shape3 = shape2;
                        }
                        z7 = z13;
                        i5 = i24;
                        z8 = z15;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 4096) != 0) {
                            i15 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i15 &= -7169;
                        }
                        if ((i4 & 131072) != 0) {
                            i15 &= -29360129;
                        }
                        if ((262144 & i4) != 0) {
                            i15 &= -234881025;
                        }
                        modifier2 = modifier;
                        z7 = z;
                        z6 = z2;
                        textStyle3 = textStyle;
                        function25 = function2;
                        function29 = function22;
                        function27 = function23;
                        function28 = function24;
                        z8 = z3;
                        visualTransformation2 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z5 = z4;
                        i19 = i;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape3 = shape;
                        textFieldColors2 = textFieldColors;
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1961394975);
                    m2260getColor0d7_KjU = textStyle3.m2260getColor0d7_KjU();
                    if (m2260getColor0d7_KjU == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
                        m2260getColor0d7_KjU = ((Color) textFieldColors2.textColor(z7, startRestartGroup, ((i5 >> 9) & 14) | ((i15 >> 21) & 112)).getValue()).getValue();
                    }
                    long j = m2260getColor0d7_KjU;
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge = textStyle3.merge(new TextStyle(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
                    int i25 = (i15 >> 21) & 112;
                    Modifier m157backgroundbw27NRU = BackgroundKt.m157backgroundbw27NRU(function25 != null ? PaddingKt.m338paddingqDBjuR0$default(modifier2, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, ((Color) textFieldColors2.backgroundColor(z7, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue()).getValue(), shape3);
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    final boolean z17 = z7;
                    final boolean z18 = z5;
                    final VisualTransformation visualTransformation4 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final boolean z19 = z8;
                    final Function2 function217 = function25;
                    final Function2 function218 = function29;
                    final Function2 function219 = function27;
                    final Function2 function220 = function28;
                    final TextFieldColors textFieldColors4 = textFieldColors2;
                    final int i26 = i5;
                    final int i27 = i15;
                    final Shape shape5 = shape3;
                    int i28 = i15 << 12;
                    TextFieldColors textFieldColors5 = textFieldColors2;
                    composer2 = startRestartGroup;
                    boolean z20 = z8;
                    TextStyle textStyle5 = textStyle3;
                    boolean z21 = z7;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m345defaultMinSizeVpY3zN4(m157backgroundbw27NRU, textFieldDefaults.m1032getMinWidthD9Ej5fM(), textFieldDefaults.m1031getMinHeightD9Ej5fM()), z7, z6, merge, keyboardOptions3, keyboardActions3, z5, i19, visualTransformation2, (Function1) null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors2.cursorColor(z8, startRestartGroup, i25 | (i15 & 14)).getValue()).getValue(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new Function3() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget
                        public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer3, int i29) {
                            int i30;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                String str = value;
                                final boolean z22 = z17;
                                boolean z23 = z18;
                                VisualTransformation visualTransformation5 = visualTransformation4;
                                final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                final boolean z24 = z19;
                                Function2 function221 = function217;
                                Function2 function222 = function218;
                                Function2 function223 = function219;
                                Function2 function224 = function220;
                                final TextFieldColors textFieldColors6 = textFieldColors4;
                                final Shape shape6 = shape5;
                                final int i31 = i26;
                                final int i32 = i27;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 329542189, true, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i33) {
                                        if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.INSTANCE;
                                            boolean z25 = z22;
                                            boolean z26 = z24;
                                            MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                            TextFieldColors textFieldColors7 = textFieldColors6;
                                            Shape shape7 = shape6;
                                            int i34 = ((i31 >> 9) & 14) | 12582912;
                                            int i35 = i32;
                                            textFieldDefaults3.m1030BorderBoxnbWgWpA(z25, z26, mutableInteractionSource8, textFieldColors7, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                int i33 = i26;
                                int i34 = i27;
                                textFieldDefaults2.OutlinedTextFieldDecorationBox(str, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function221, function222, function223, function224, textFieldColors6, null, composableLambda, composer3, (i33 & 14) | ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 64638) | (i28 & 3670016) | (KeyboardActions.$stable << 21) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
                    modifier3 = modifier2;
                    z9 = z6;
                    function210 = function29;
                    function211 = function27;
                    function212 = function28;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                    z10 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors5;
                    z11 = z20;
                    textStyle4 = textStyle5;
                    z12 = z21;
                    function213 = function25;
                    i20 = i19;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    z12 = z;
                    z9 = z2;
                    textStyle4 = textStyle;
                    function210 = function22;
                    function211 = function23;
                    function212 = function24;
                    z11 = z3;
                    visualTransformation3 = visualTransformation;
                    keyboardOptions4 = keyboardOptions;
                    keyboardActions4 = keyboardActions;
                    z10 = z4;
                    i20 = i;
                    mutableInteractionSource5 = mutableInteractionSource;
                    shape4 = shape;
                    textFieldColors3 = textFieldColors;
                    composer2 = startRestartGroup;
                    function213 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i29) {
                        OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier3, z12, z9, textStyle4, function213, function210, function211, function212, z11, visualTransformation3, keyboardOptions4, keyboardActions4, z10, i20, mutableInteractionSource5, shape4, textFieldColors3, composer3, i2 | 1, i3, i4);
                    }
                });
                return;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i15 = i13;
            i16 = i4 & 16384;
            if (i16 != 0) {
            }
            i17 = i4 & 32768;
            if (i17 != 0) {
            }
            i18 = i4 & 65536;
            if (i18 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i4 & 4096) != 0) {
            }
            int i242 = i5;
            if ((i4 & 8192) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            KeyboardActions keyboardActions52 = keyboardActions2;
            if (i18 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((262144 & i4) != 0) {
            }
            z7 = z13;
            i5 = i242;
            z8 = z15;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1961394975);
            m2260getColor0d7_KjU = textStyle3.m2260getColor0d7_KjU();
            if (m2260getColor0d7_KjU == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            }
            long j2 = m2260getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2 = textStyle3.merge(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
            int i252 = (i15 >> 21) & 112;
            Modifier m157backgroundbw27NRU2 = BackgroundKt.m157backgroundbw27NRU(function25 != null ? PaddingKt.m338paddingqDBjuR0$default(modifier2, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, ((Color) textFieldColors2.backgroundColor(z7, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue()).getValue(), shape3);
            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
            final boolean z172 = z7;
            final boolean z182 = z5;
            final VisualTransformation visualTransformation42 = visualTransformation2;
            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final boolean z192 = z8;
            final Function2 function2172 = function25;
            final Function2 function2182 = function29;
            final Function2 function2192 = function27;
            final Function2 function2202 = function28;
            final TextFieldColors textFieldColors42 = textFieldColors2;
            final int i262 = i5;
            final int i272 = i15;
            final Shape shape52 = shape3;
            int i282 = i15 << 12;
            TextFieldColors textFieldColors52 = textFieldColors2;
            composer2 = startRestartGroup;
            boolean z202 = z8;
            TextStyle textStyle52 = textStyle3;
            boolean z212 = z7;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m345defaultMinSizeVpY3zN4(m157backgroundbw27NRU2, textFieldDefaults2.m1032getMinWidthD9Ej5fM(), textFieldDefaults2.m1031getMinHeightD9Ej5fM()), z7, z6, merge2, keyboardOptions3, keyboardActions3, z5, i19, visualTransformation2, (Function1) null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors2.cursorColor(z8, startRestartGroup, i252 | (i15 & 14)).getValue()).getValue(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new Function3() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                @ComposableInferredTarget
                public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer3, int i29) {
                    int i30;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i29 & 14) == 0) {
                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i30 = i29;
                    }
                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                        TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                        String str = value;
                        final boolean z22 = z172;
                        boolean z23 = z182;
                        VisualTransformation visualTransformation5 = visualTransformation42;
                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                        final boolean z24 = z192;
                        Function2 function221 = function2172;
                        Function2 function222 = function2182;
                        Function2 function223 = function2192;
                        Function2 function224 = function2202;
                        final TextFieldColors textFieldColors6 = textFieldColors42;
                        final Shape shape6 = shape52;
                        final int i31 = i262;
                        final int i32 = i272;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 329542189, true, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i33) {
                                if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.INSTANCE;
                                    boolean z25 = z22;
                                    boolean z26 = z24;
                                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                    TextFieldColors textFieldColors7 = textFieldColors6;
                                    Shape shape7 = shape6;
                                    int i34 = ((i31 >> 9) & 14) | 12582912;
                                    int i35 = i32;
                                    textFieldDefaults3.m1030BorderBoxnbWgWpA(z25, z26, mutableInteractionSource8, textFieldColors7, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        int i33 = i262;
                        int i34 = i272;
                        textFieldDefaults22.OutlinedTextFieldDecorationBox(str, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function221, function222, function223, function224, textFieldColors6, null, composableLambda, composer3, (i33 & 14) | ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i5 & 64638) | (i282 & 3670016) | (KeyboardActions.$stable << 21) | (i282 & 29360128) | (i282 & 234881024) | (i282 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
            modifier3 = modifier2;
            z9 = z6;
            function210 = function29;
            function211 = function27;
            function212 = function28;
            visualTransformation3 = visualTransformation2;
            keyboardOptions4 = keyboardOptions3;
            keyboardActions4 = keyboardActions3;
            z10 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors52;
            z11 = z202;
            textStyle4 = textStyle52;
            z12 = z212;
            function213 = function25;
            i20 = i19;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        int i232 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i15 = i13;
        i16 = i4 & 16384;
        if (i16 != 0) {
        }
        i17 = i4 & 32768;
        if (i17 != 0) {
        }
        i18 = i4 & 65536;
        if (i18 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i4 & 4096) != 0) {
        }
        int i2422 = i5;
        if ((i4 & 8192) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        KeyboardActions keyboardActions522 = keyboardActions2;
        if (i18 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
        z7 = z13;
        i5 = i2422;
        z8 = z15;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1961394975);
        m2260getColor0d7_KjU = textStyle3.m2260getColor0d7_KjU();
        if (m2260getColor0d7_KjU == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
        }
        long j22 = m2260getColor0d7_KjU;
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22 = textStyle3.merge(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
        int i2522 = (i15 >> 21) & 112;
        Modifier m157backgroundbw27NRU22 = BackgroundKt.m157backgroundbw27NRU(function25 != null ? PaddingKt.m338paddingqDBjuR0$default(modifier2, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, ((Color) textFieldColors2.backgroundColor(z7, startRestartGroup, ((i5 >> 9) & 14) | i2522).getValue()).getValue(), shape3);
        TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
        final boolean z1722 = z7;
        final boolean z1822 = z5;
        final VisualTransformation visualTransformation422 = visualTransformation2;
        final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final boolean z1922 = z8;
        final Function2 function21722 = function25;
        final Function2 function21822 = function29;
        final Function2 function21922 = function27;
        final Function2 function22022 = function28;
        final TextFieldColors textFieldColors422 = textFieldColors2;
        final int i2622 = i5;
        final int i2722 = i15;
        final Shape shape522 = shape3;
        int i2822 = i15 << 12;
        TextFieldColors textFieldColors522 = textFieldColors2;
        composer2 = startRestartGroup;
        boolean z2022 = z8;
        TextStyle textStyle522 = textStyle3;
        boolean z2122 = z7;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m345defaultMinSizeVpY3zN4(m157backgroundbw27NRU22, textFieldDefaults22.m1032getMinWidthD9Ej5fM(), textFieldDefaults22.m1031getMinHeightD9Ej5fM()), z7, z6, merge22, keyboardOptions3, keyboardActions3, z5, i19, visualTransformation2, (Function1) null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors2.cursorColor(z8, startRestartGroup, i2522 | (i15 & 14)).getValue()).getValue(), null), ComposableLambdaKt.composableLambda(startRestartGroup, 986454116, true, new Function3() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget
            public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer3, int i29) {
                int i30;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i29 & 14) == 0) {
                    i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i30 = i29;
                }
                if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                    TextFieldDefaults textFieldDefaults222 = TextFieldDefaults.INSTANCE;
                    String str = value;
                    final boolean z22 = z1722;
                    boolean z23 = z1822;
                    VisualTransformation visualTransformation5 = visualTransformation422;
                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                    final boolean z24 = z1922;
                    Function2 function221 = function21722;
                    Function2 function222 = function21822;
                    Function2 function223 = function21922;
                    Function2 function224 = function22022;
                    final TextFieldColors textFieldColors6 = textFieldColors422;
                    final Shape shape6 = shape522;
                    final int i31 = i2622;
                    final int i32 = i2722;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 329542189, true, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i33) {
                            if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.INSTANCE;
                                boolean z25 = z22;
                                boolean z26 = z24;
                                MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                TextFieldColors textFieldColors7 = textFieldColors6;
                                Shape shape7 = shape6;
                                int i34 = ((i31 >> 9) & 14) | 12582912;
                                int i35 = i32;
                                textFieldDefaults3.m1030BorderBoxnbWgWpA(z25, z26, mutableInteractionSource8, textFieldColors7, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    int i33 = i2622;
                    int i34 = i2722;
                    textFieldDefaults222.OutlinedTextFieldDecorationBox(str, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function221, function222, function223, function224, textFieldColors6, null, composableLambda, composer3, (i33 & 14) | ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i5 & 64638) | (i2822 & 3670016) | (KeyboardActions.$stable << 21) | (i2822 & 29360128) | (i2822 & 234881024) | (i2822 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
        modifier3 = modifier2;
        z9 = z6;
        function210 = function29;
        function211 = function27;
        function212 = function28;
        visualTransformation3 = visualTransformation2;
        keyboardOptions4 = keyboardOptions3;
        keyboardActions4 = keyboardActions3;
        z10 = z5;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors522;
        z11 = z2022;
        textStyle4 = textStyle522;
        z12 = z2122;
        function213 = function25;
        i20 = i19;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        TextStyle textStyle2;
        Function2 function25;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i19;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        KeyboardActions keyboardActions3;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function28;
        Modifier modifier2;
        VisualTransformation visualTransformation2;
        Function2 function29;
        KeyboardOptions keyboardOptions3;
        boolean z5;
        TextStyle textStyle3;
        boolean z6;
        TextFieldColors textFieldColors2;
        Shape shape3;
        boolean z7;
        boolean z8;
        long m2260getColor0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        final boolean z9;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final boolean z10;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final TextFieldColors textFieldColors3;
        final boolean z11;
        final TextStyle textStyle4;
        final boolean z12;
        final Function2 function213;
        final int i20;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-288998816);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i23 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(function2) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(function22) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(function23) ? 67108864 : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(function24) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i13 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 112) == 0) {
                    i13 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(keyboardOptions)) {
                        i21 = 256;
                        i13 |= i21;
                    }
                    i21 = 128;
                    i13 |= i21;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) == 0 && startRestartGroup.changed(keyboardActions)) {
                        i23 = 2048;
                    }
                    i13 |= i23;
                }
                i15 = i13;
                i16 = i4 & 16384;
                if (i16 != 0) {
                    i15 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i15 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i17 = i4 & 32768;
                if (i17 != 0) {
                    i15 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    i15 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                i18 = i4 & 65536;
                if (i18 != 0) {
                    i15 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i15 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i3 & 29360128) == 0) {
                    i15 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                }
                if ((i3 & 234881024) == 0) {
                    i15 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? 67108864 : 33554432;
                }
                if ((i5 & 1533916891) == 306783378 || (191739611 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i22 != 0 ? Modifier.INSTANCE : modifier;
                        boolean z13 = i6 != 0 ? true : z;
                        boolean z14 = i7 != 0 ? false : z2;
                        if ((i4 & 32) != 0) {
                            textStyle2 = (TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle());
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        function25 = i8 != 0 ? null : function2;
                        Function2 function214 = i9 != 0 ? null : function22;
                        Function2 function215 = i10 != 0 ? null : function23;
                        Function2 function216 = i11 != 0 ? null : function24;
                        boolean z15 = i12 != 0 ? false : z3;
                        VisualTransformation none = i14 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                        if ((i4 & 4096) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i15 &= -897;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        int i24 = i5;
                        if ((i4 & 8192) != 0) {
                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                            i15 &= -7169;
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        boolean z16 = i16 != 0 ? false : z4;
                        i19 = i17 != 0 ? Integer.MAX_VALUE : i;
                        KeyboardActions keyboardActions5 = keyboardActions2;
                        if (i18 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            function26 = function215;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            function26 = function215;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 131072) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                            i15 = (-29360129) & i15;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shape;
                        }
                        if ((262144 & i4) != 0) {
                            i15 &= -234881025;
                            keyboardActions3 = keyboardActions5;
                            function27 = function26;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function28 = function216;
                            modifier2 = modifier4;
                            visualTransformation2 = none;
                            function29 = function214;
                            keyboardOptions3 = keyboardOptions2;
                            z5 = z16;
                            textStyle3 = textStyle2;
                            z6 = z14;
                            shape3 = shape2;
                            textFieldColors2 = TextFieldDefaults.INSTANCE.m1034outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                        } else {
                            keyboardActions3 = keyboardActions5;
                            function27 = function26;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            function28 = function216;
                            modifier2 = modifier4;
                            visualTransformation2 = none;
                            function29 = function214;
                            keyboardOptions3 = keyboardOptions2;
                            z5 = z16;
                            textStyle3 = textStyle2;
                            z6 = z14;
                            textFieldColors2 = textFieldColors;
                            shape3 = shape2;
                        }
                        z7 = z13;
                        i5 = i24;
                        z8 = z15;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 4096) != 0) {
                            i15 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i15 &= -7169;
                        }
                        if ((i4 & 131072) != 0) {
                            i15 &= -29360129;
                        }
                        if ((262144 & i4) != 0) {
                            i15 &= -234881025;
                        }
                        modifier2 = modifier;
                        z7 = z;
                        z6 = z2;
                        textStyle3 = textStyle;
                        function25 = function2;
                        function29 = function22;
                        function27 = function23;
                        function28 = function24;
                        z8 = z3;
                        visualTransformation2 = visualTransformation;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z5 = z4;
                        i19 = i;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape3 = shape;
                        textFieldColors2 = textFieldColors;
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1961402586);
                    m2260getColor0d7_KjU = textStyle3.m2260getColor0d7_KjU();
                    if (m2260getColor0d7_KjU == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
                        m2260getColor0d7_KjU = ((Color) textFieldColors2.textColor(z7, startRestartGroup, ((i5 >> 9) & 14) | ((i15 >> 21) & 112)).getValue()).getValue();
                    }
                    long j = m2260getColor0d7_KjU;
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge = textStyle3.merge(new TextStyle(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
                    int i25 = (i15 >> 21) & 112;
                    Modifier m157backgroundbw27NRU = BackgroundKt.m157backgroundbw27NRU(function25 != null ? PaddingKt.m338paddingqDBjuR0$default(modifier2, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, ((Color) textFieldColors2.backgroundColor(z7, startRestartGroup, ((i5 >> 9) & 14) | i25).getValue()).getValue(), shape3);
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    final boolean z17 = z7;
                    final boolean z18 = z5;
                    final VisualTransformation visualTransformation4 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                    final boolean z19 = z8;
                    final Function2 function217 = function25;
                    final Function2 function218 = function29;
                    final Function2 function219 = function27;
                    final Function2 function220 = function28;
                    final TextFieldColors textFieldColors4 = textFieldColors2;
                    final int i26 = i5;
                    final int i27 = i15;
                    final Shape shape5 = shape3;
                    int i28 = i15 << 12;
                    TextFieldColors textFieldColors5 = textFieldColors2;
                    composer2 = startRestartGroup;
                    boolean z20 = z8;
                    TextStyle textStyle5 = textStyle3;
                    boolean z21 = z7;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m345defaultMinSizeVpY3zN4(m157backgroundbw27NRU, textFieldDefaults.m1032getMinWidthD9Ej5fM(), textFieldDefaults.m1031getMinHeightD9Ej5fM()), z7, z6, merge, keyboardOptions3, keyboardActions3, z5, i19, visualTransformation2, (Function1) null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors2.cursorColor(z8, startRestartGroup, i25 | (i15 & 14)).getValue()).getValue(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new Function3() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget
                        public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer3, int i29) {
                            int i30;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i29 & 14) == 0) {
                                i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i30 = i29;
                            }
                            if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                String text = TextFieldValue.this.getText();
                                final boolean z22 = z17;
                                boolean z23 = z18;
                                VisualTransformation visualTransformation5 = visualTransformation4;
                                final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                final boolean z24 = z19;
                                Function2 function221 = function217;
                                Function2 function222 = function218;
                                Function2 function223 = function219;
                                Function2 function224 = function220;
                                final TextFieldColors textFieldColors6 = textFieldColors4;
                                final Shape shape6 = shape5;
                                final int i31 = i26;
                                final int i32 = i27;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i33) {
                                        if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.INSTANCE;
                                            boolean z25 = z22;
                                            boolean z26 = z24;
                                            MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                            TextFieldColors textFieldColors7 = textFieldColors6;
                                            Shape shape7 = shape6;
                                            int i34 = ((i31 >> 9) & 14) | 12582912;
                                            int i35 = i32;
                                            textFieldDefaults3.m1030BorderBoxnbWgWpA(z25, z26, mutableInteractionSource8, textFieldColors7, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                int i33 = i26;
                                int i34 = i27;
                                textFieldDefaults2.OutlinedTextFieldDecorationBox(text, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function221, function222, function223, function224, textFieldColors6, null, composableLambda, composer3, ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i5 & 64638) | (i28 & 3670016) | (KeyboardActions.$stable << 21) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
                    modifier3 = modifier2;
                    z9 = z6;
                    function210 = function29;
                    function211 = function27;
                    function212 = function28;
                    visualTransformation3 = visualTransformation2;
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                    z10 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors5;
                    z11 = z20;
                    textStyle4 = textStyle5;
                    z12 = z21;
                    function213 = function25;
                    i20 = i19;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    z12 = z;
                    z9 = z2;
                    textStyle4 = textStyle;
                    function210 = function22;
                    function211 = function23;
                    function212 = function24;
                    z11 = z3;
                    visualTransformation3 = visualTransformation;
                    keyboardOptions4 = keyboardOptions;
                    keyboardActions4 = keyboardActions;
                    z10 = z4;
                    i20 = i;
                    mutableInteractionSource5 = mutableInteractionSource;
                    shape4 = shape;
                    textFieldColors3 = textFieldColors;
                    composer2 = startRestartGroup;
                    function213 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i29) {
                        OutlinedTextFieldKt.OutlinedTextField(TextFieldValue.this, onValueChange, modifier3, z12, z9, textStyle4, function213, function210, function211, function212, z11, visualTransformation3, keyboardOptions4, keyboardActions4, z10, i20, mutableInteractionSource5, shape4, textFieldColors3, composer3, i2 | 1, i3, i4);
                    }
                });
                return;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i15 = i13;
            i16 = i4 & 16384;
            if (i16 != 0) {
            }
            i17 = i4 & 32768;
            if (i17 != 0) {
            }
            i18 = i4 & 65536;
            if (i18 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i4 & 4096) != 0) {
            }
            int i242 = i5;
            if ((i4 & 8192) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            KeyboardActions keyboardActions52 = keyboardActions2;
            if (i18 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((262144 & i4) != 0) {
            }
            z7 = z13;
            i5 = i242;
            z8 = z15;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1961402586);
            m2260getColor0d7_KjU = textStyle3.m2260getColor0d7_KjU();
            if (m2260getColor0d7_KjU == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            }
            long j2 = m2260getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            TextStyle merge2 = textStyle3.merge(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
            int i252 = (i15 >> 21) & 112;
            Modifier m157backgroundbw27NRU2 = BackgroundKt.m157backgroundbw27NRU(function25 != null ? PaddingKt.m338paddingqDBjuR0$default(modifier2, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, ((Color) textFieldColors2.backgroundColor(z7, startRestartGroup, ((i5 >> 9) & 14) | i252).getValue()).getValue(), shape3);
            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
            final boolean z172 = z7;
            final boolean z182 = z5;
            final VisualTransformation visualTransformation42 = visualTransformation2;
            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
            final boolean z192 = z8;
            final Function2 function2172 = function25;
            final Function2 function2182 = function29;
            final Function2 function2192 = function27;
            final Function2 function2202 = function28;
            final TextFieldColors textFieldColors42 = textFieldColors2;
            final int i262 = i5;
            final int i272 = i15;
            final Shape shape52 = shape3;
            int i282 = i15 << 12;
            TextFieldColors textFieldColors52 = textFieldColors2;
            composer2 = startRestartGroup;
            boolean z202 = z8;
            TextStyle textStyle52 = textStyle3;
            boolean z212 = z7;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m345defaultMinSizeVpY3zN4(m157backgroundbw27NRU2, textFieldDefaults2.m1032getMinWidthD9Ej5fM(), textFieldDefaults2.m1031getMinHeightD9Ej5fM()), z7, z6, merge2, keyboardOptions3, keyboardActions3, z5, i19, visualTransformation2, (Function1) null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors2.cursorColor(z8, startRestartGroup, i252 | (i15 & 14)).getValue()).getValue(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new Function3() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                @ComposableInferredTarget
                public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer3, int i29) {
                    int i30;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i29 & 14) == 0) {
                        i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i30 = i29;
                    }
                    if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                        TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                        String text = TextFieldValue.this.getText();
                        final boolean z22 = z172;
                        boolean z23 = z182;
                        VisualTransformation visualTransformation5 = visualTransformation42;
                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                        final boolean z24 = z192;
                        Function2 function221 = function2172;
                        Function2 function222 = function2182;
                        Function2 function223 = function2192;
                        Function2 function224 = function2202;
                        final TextFieldColors textFieldColors6 = textFieldColors42;
                        final Shape shape6 = shape52;
                        final int i31 = i262;
                        final int i32 = i272;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i33) {
                                if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.INSTANCE;
                                    boolean z25 = z22;
                                    boolean z26 = z24;
                                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                    TextFieldColors textFieldColors7 = textFieldColors6;
                                    Shape shape7 = shape6;
                                    int i34 = ((i31 >> 9) & 14) | 12582912;
                                    int i35 = i32;
                                    textFieldDefaults3.m1030BorderBoxnbWgWpA(z25, z26, mutableInteractionSource8, textFieldColors7, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        int i33 = i262;
                        int i34 = i272;
                        textFieldDefaults22.OutlinedTextFieldDecorationBox(text, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function221, function222, function223, function224, textFieldColors6, null, composableLambda, composer3, ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i5 & 64638) | (i282 & 3670016) | (KeyboardActions.$stable << 21) | (i282 & 29360128) | (i282 & 234881024) | (i282 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
            modifier3 = modifier2;
            z9 = z6;
            function210 = function29;
            function211 = function27;
            function212 = function28;
            visualTransformation3 = visualTransformation2;
            keyboardOptions4 = keyboardOptions3;
            keyboardActions4 = keyboardActions3;
            z10 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors52;
            z11 = z202;
            textStyle4 = textStyle52;
            z12 = z212;
            function213 = function25;
            i20 = i19;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        int i232 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i15 = i13;
        i16 = i4 & 16384;
        if (i16 != 0) {
        }
        i17 = i4 & 32768;
        if (i17 != 0) {
        }
        i18 = i4 & 65536;
        if (i18 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i4 & 4096) != 0) {
        }
        int i2422 = i5;
        if ((i4 & 8192) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        KeyboardActions keyboardActions522 = keyboardActions2;
        if (i18 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((262144 & i4) != 0) {
        }
        z7 = z13;
        i5 = i2422;
        z8 = z15;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1961402586);
        m2260getColor0d7_KjU = textStyle3.m2260getColor0d7_KjU();
        if (m2260getColor0d7_KjU == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
        }
        long j22 = m2260getColor0d7_KjU;
        startRestartGroup.endReplaceableGroup();
        TextStyle merge22 = textStyle3.merge(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null));
        int i2522 = (i15 >> 21) & 112;
        Modifier m157backgroundbw27NRU22 = BackgroundKt.m157backgroundbw27NRU(function25 != null ? PaddingKt.m338paddingqDBjuR0$default(modifier2, 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, ((Color) textFieldColors2.backgroundColor(z7, startRestartGroup, ((i5 >> 9) & 14) | i2522).getValue()).getValue(), shape3);
        TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
        final boolean z1722 = z7;
        final boolean z1822 = z5;
        final VisualTransformation visualTransformation422 = visualTransformation2;
        final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
        final boolean z1922 = z8;
        final Function2 function21722 = function25;
        final Function2 function21822 = function29;
        final Function2 function21922 = function27;
        final Function2 function22022 = function28;
        final TextFieldColors textFieldColors422 = textFieldColors2;
        final int i2622 = i5;
        final int i2722 = i15;
        final Shape shape522 = shape3;
        int i2822 = i15 << 12;
        TextFieldColors textFieldColors522 = textFieldColors2;
        composer2 = startRestartGroup;
        boolean z2022 = z8;
        TextStyle textStyle522 = textStyle3;
        boolean z2122 = z7;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m345defaultMinSizeVpY3zN4(m157backgroundbw27NRU22, textFieldDefaults22.m1032getMinWidthD9Ej5fM(), textFieldDefaults22.m1031getMinHeightD9Ej5fM()), z7, z6, merge22, keyboardOptions3, keyboardActions3, z5, i19, visualTransformation2, (Function1) null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors2.cursorColor(z8, startRestartGroup, i2522 | (i15 & 14)).getValue()).getValue(), null), ComposableLambdaKt.composableLambda(startRestartGroup, -1219079113, true, new Function3() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget
            public final void invoke(@NotNull Function2 innerTextField, @Nullable Composer composer3, int i29) {
                int i30;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i29 & 14) == 0) {
                    i30 = i29 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i30 = i29;
                }
                if ((i30 & 91) != 18 || !composer3.getSkipping()) {
                    TextFieldDefaults textFieldDefaults222 = TextFieldDefaults.INSTANCE;
                    String text = TextFieldValue.this.getText();
                    final boolean z22 = z1722;
                    boolean z23 = z1822;
                    VisualTransformation visualTransformation5 = visualTransformation422;
                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                    final boolean z24 = z1922;
                    Function2 function221 = function21722;
                    Function2 function222 = function21822;
                    Function2 function223 = function21922;
                    Function2 function224 = function22022;
                    final TextFieldColors textFieldColors6 = textFieldColors422;
                    final Shape shape6 = shape522;
                    final int i31 = i2622;
                    final int i32 = i2722;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 1225313536, true, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i33) {
                            if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.INSTANCE;
                                boolean z25 = z22;
                                boolean z26 = z24;
                                MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                TextFieldColors textFieldColors7 = textFieldColors6;
                                Shape shape7 = shape6;
                                int i34 = ((i31 >> 9) & 14) | 12582912;
                                int i35 = i32;
                                textFieldDefaults3.m1030BorderBoxnbWgWpA(z25, z26, mutableInteractionSource8, textFieldColors7, shape7, 0.0f, 0.0f, composer4, i34 | ((i35 << 3) & 112) | ((i35 >> 12) & 896) | ((i35 >> 15) & 7168) | ((i35 >> 9) & 57344), 96);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    int i33 = i2622;
                    int i34 = i2722;
                    textFieldDefaults222.OutlinedTextFieldDecorationBox(text, innerTextField, z22, z23, visualTransformation5, mutableInteractionSource7, z24, function221, function222, function223, function224, textFieldColors6, null, composableLambda, composer3, ((i30 << 3) & 112) | ((i33 >> 3) & 896) | ((i34 >> 3) & 7168) | ((i34 << 9) & 57344) | ((i34 >> 3) & 458752) | ((i34 << 18) & 3670016) | ((i33 << 3) & 29360128) | ((i33 << 3) & 234881024) | ((i33 << 3) & 1879048192), ((i33 >> 27) & 14) | 27648 | ((i34 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i5 & 64638) | (i2822 & 3670016) | (KeyboardActions.$stable << 21) | (i2822 & 29360128) | (i2822 & 234881024) | (i2822 & 1879048192), ((i15 >> 3) & 14) | 24576 | ((i15 >> 12) & 896), 2048);
        modifier3 = modifier2;
        z9 = z6;
        function210 = function29;
        function211 = function27;
        function212 = function28;
        visualTransformation3 = visualTransformation2;
        keyboardOptions4 = keyboardOptions3;
        keyboardActions4 = keyboardActions3;
        z10 = z5;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors522;
        z11 = z2022;
        textStyle4 = textStyle522;
        z12 = z2122;
        function213 = function25;
        i20 = i19;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2 textField, final Function3 function3, final Function2 function2, final Function2 function22, final Function2 function23, final boolean z, final float f, final Function1 onLabelMeasured, final Function2 border, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        int i4 = (i & 14) == 0 ? (startRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= startRestartGroup.changed(onLabelMeasured) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changed(border) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i4 & 1533916891) == 306783378 && (i5 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 4; i6 < i7; i7 = 4) {
                z2 |= startRestartGroup.changed(objArr[i6]);
                i6++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(118153609);
            border.invoke(startRestartGroup, Integer.valueOf((i4 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169914108);
            if (function22 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor2 = companion.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(then);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1691709354);
                function22.invoke(startRestartGroup, Integer.valueOf((i4 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169914393);
            if (function23 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(then2);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl3, density3, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection4, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1351586719);
                function23.invoke(startRestartGroup, Integer.valueOf((i4 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function22 != null) {
                i3 = 0;
                calculateStartPadding = Dp.m2507constructorimpl(RangesKt.coerceAtLeast(Dp.m2507constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m2507constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (function23 != null) {
                calculateEndPadding = Dp.m2507constructorimpl(RangesKt.coerceAtLeast(Dp.m2507constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m2507constructorimpl(i3)));
            }
            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(companion2, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1169915404);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m338paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i4 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m338paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor4 = companion.getConstructor();
            Function3 materializerOf4 = LayoutKt.materializerOf(then3);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl4 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl4, density4, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl4, layoutDirection5, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1205597937);
            textField.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor5 = companion.getConstructor();
                Function3 materializerOf5 = LayoutKt.materializerOf(layoutId);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl5 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl5, density5, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl5, layoutDirection6, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl5, viewConfiguration5, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf5.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(-55131805);
                function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                OutlinedTextFieldKt.OutlinedTextFieldLayout(Modifier.this, textField, function3, function2, function22, function23, z, f, onLabelMeasured, border, paddingValues, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m923calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m2489getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-zUg2_y0, reason: not valid java name */
    public static final int m922calculateHeightzUg2_y0(int i, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        return Math.max(Constraints.m2488getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(Math.max(i3, i5) + (paddingValues.getBottom() * f) + Math.max(paddingValues.getTop() * f, i4 / 2.0f)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int roundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f3 = 1 - f;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : f3 * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + roundToInt2, MathKt.roundToInt(((z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : roundToInt) * f3) - ((placeable4.getHeight() / 2) * f)), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), roundToInt, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m1961place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m2558getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m924outlineCutout12SF9DM(Modifier outlineCutout, final long j, final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new Function1() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ContentDrawScope drawWithContent) {
                float f;
                float coerceAtLeast;
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float m1335getWidthimpl = Size.m1335getWidthimpl(j);
                if (m1335getWidthimpl > 0.0f) {
                    f = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                    float mo271toPx0680j_4 = drawWithContent.mo271toPx0680j_4(f);
                    float mo271toPx0680j_42 = drawWithContent.mo271toPx0680j_4(paddingValues.mo320calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - mo271toPx0680j_4;
                    float f2 = 2;
                    float f3 = m1335getWidthimpl + mo271toPx0680j_42 + (mo271toPx0680j_4 * f2);
                    LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        coerceAtLeast = Size.m1335getWidthimpl(drawWithContent.mo1708getSizeNHjbRc()) - f3;
                    } else {
                        coerceAtLeast = RangesKt.coerceAtLeast(mo271toPx0680j_42, 0.0f);
                    }
                    float f4 = coerceAtLeast;
                    if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        f3 = Size.m1335getWidthimpl(drawWithContent.mo1708getSizeNHjbRc()) - RangesKt.coerceAtLeast(mo271toPx0680j_42, 0.0f);
                    }
                    float f5 = f3;
                    float m1333getHeightimpl = Size.m1333getHeightimpl(j);
                    float f6 = (-m1333getHeightimpl) / f2;
                    float f7 = m1333getHeightimpl / f2;
                    int m1439getDifferencertfAjoo = ClipOp.INSTANCE.m1439getDifferencertfAjoo();
                    DrawContext drawContext = drawWithContent.getDrawContext();
                    long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo1688clipRectN_I0leg(f4, f6, f5, f7, m1439getDifferencertfAjoo);
                    drawWithContent.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
                    return;
                }
                drawWithContent.drawContent();
            }
        });
    }
}
