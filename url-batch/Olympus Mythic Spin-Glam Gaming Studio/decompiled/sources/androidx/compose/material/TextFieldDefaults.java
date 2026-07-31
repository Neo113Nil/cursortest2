package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDefaults.kt */
@Immutable
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J=\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J=\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010 Jç\u0001\u0010>\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020&2\b\b\u0002\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020&2\b\b\u0002\u0010/\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020&2\b\b\u0002\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u00020&2\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020&2\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020&2\b\b\u0002\u00109\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020&2\b\b\u0002\u0010;\u001a\u00020&H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=Jç\u0001\u0010D\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020&2\b\b\u0002\u0010?\u001a\u00020&2\b\b\u0002\u0010@\u001a\u00020&2\b\b\u0002\u0010A\u001a\u00020&2\b\b\u0002\u0010B\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020&2\b\b\u0002\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u00020&2\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020&2\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020&2\b\b\u0002\u00109\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020&2\b\b\u0002\u0010;\u001a\u00020&H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010=JÄ\u0001\u0010R\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u00160G¢\u0006\u0002\bH2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010P\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010Q\u001a\u00020\u001eH\u0007¢\u0006\u0004\bR\u0010SJÙ\u0001\u0010U\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u00160G¢\u0006\u0002\bH2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010P\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010Q\u001a\u00020\u001e2\u0013\b\u0002\u0010T\u001a\r\u0012\u0004\u0012\u00020\u00160G¢\u0006\u0002\bHH\u0007¢\u0006\u0004\bU\u0010VR \u0010W\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010[\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR \u0010]\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010ZR \u0010_\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010ZR\u0011\u0010c\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010e\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bd\u0010b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "BorderBox", "start", "end", ViewHierarchyConstants.DIMENSION_TOP_KEY, "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "border", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getOutlinedTextFieldShape", "OutlinedTextFieldShape", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m2507constructorimpl(56);
    private static final float MinWidth = Dp.m2507constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m2507constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m2507constructorimpl(2);

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1033indicatorLinegv0btCI(Modifier indicatorLine, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors colors, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", colors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                State m1040animateBorderStrokeAsStateNuRrP5Q;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1398930845);
                m1040animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1040animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f, f2, composer, 0);
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) m1040animateBorderStrokeAsStateNuRrP5Q.getValue());
                composer.endReplaceableGroup();
                return drawIndicatorLine;
            }
        });
    }

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1031getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1032getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer composer, int i) {
        return CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
    }

    public final Shape getOutlinedTextFieldShape(Composer composer, int i) {
        return MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        if ((r29 & 64) != 0) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1030BorderBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors colors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        float f3;
        float f4;
        State m1040animateBorderStrokeAsStateNuRrP5Q;
        final Shape shape3;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(943754022);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 16384;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 8192;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i6 = 131072;
                    i3 |= i6;
                }
            } else {
                f3 = f;
            }
            i6 = 65536;
            i3 |= i6;
        } else {
            f3 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i5 = 1048576;
                    i3 |= i5;
                }
            } else {
                f4 = f2;
            }
            i5 = 524288;
            i3 |= i5;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) == 0) {
            i4 = (29360128 & i) == 0 ? startRestartGroup.changed(this) ? 8388608 : 4194304 : 12582912;
            if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 16) != 0) {
                        shape2 = getOutlinedTextFieldShape(startRestartGroup, (i3 >> 21) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        f3 = FocusedBorderThickness;
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        f4 = UnfocusedBorderThickness;
                        i3 &= -3670017;
                    }
                    Shape shape4 = shape2;
                    float f7 = f3;
                    float f8 = f4;
                    startRestartGroup.endDefaults();
                    int i8 = i3 & 8190;
                    int i9 = i3 >> 3;
                    m1040animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1040animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f7, f8, startRestartGroup, (57344 & i9) | i8 | (i9 & 458752));
                    BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) m1040animateBorderStrokeAsStateNuRrP5Q.getValue(), shape4), startRestartGroup, 0);
                    shape3 = shape4;
                    f5 = f7;
                    f6 = f8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                shape3 = shape2;
                f5 = f3;
                f6 = f4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$BorderBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    TextFieldDefaults.this.m1030BorderBoxnbWgWpA(z, z2, interactionSource, colors, shape3, f5, f6, composer2, i | 1, i2);
                }
            });
            return;
        }
        i3 |= i4;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        Shape shape42 = shape2;
        float f72 = f3;
        float f82 = f4;
        startRestartGroup.endDefaults();
        int i82 = i3 & 8190;
        int i92 = i3 >> 3;
        m1040animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1040animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f72, f82, startRestartGroup, (57344 & i92) | i82 | (i92 & 458752));
        BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) m1040animateBorderStrokeAsStateNuRrP5Q.getValue(), shape42), startRestartGroup, 0);
        shape3 = shape42;
        f5 = f72;
        f6 = f82;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1028textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1037textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1037textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m332PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1029textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1038textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1038textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m332PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1027outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1035outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1035outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m332PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1036textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(231892599);
        long m1445copywmQWz5c$default = (i4 & 1) != 0 ? Color.m1445copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m1445copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1445copywmQWz5c$default3 = (i4 & 4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m796getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j4;
        long m790getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j5;
        long m1445copywmQWz5c$default4 = (i4 & 32) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m1445copywmQWz5c$default5 = (i4 & 64) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1445copywmQWz5c$default6 = (i4 & 128) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m790getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j9;
        long m1445copywmQWz5c$default7 = (i4 & 512) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m1445copywmQWz5c$default8 = (i4 & 1024) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m1445copywmQWz5c$default7 : j12;
        long m1445copywmQWz5c$default9 = (i4 & 4096) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m1445copywmQWz5c$default10 = (i4 & 8192) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m790getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j15;
        long m1445copywmQWz5c$default11 = (32768 & i4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m1445copywmQWz5c$default12 = (65536 & i4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m1445copywmQWz5c$default13 = (131072 & i4) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m790getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j19;
        long m1445copywmQWz5c$default14 = (524288 & i4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m1445copywmQWz5c$default, m1445copywmQWz5c$default2, m796getPrimary0d7_KjU, m790getError0d7_KjU, m1445copywmQWz5c$default4, m1445copywmQWz5c$default5, m790getError0d7_KjU2, m1445copywmQWz5c$default6, m1445copywmQWz5c$default7, m1445copywmQWz5c$default8, j22, m1445copywmQWz5c$default9, m1445copywmQWz5c$default10, m790getError0d7_KjU3, m1445copywmQWz5c$default3, m1445copywmQWz5c$default11, m1445copywmQWz5c$default12, m1445copywmQWz5c$default13, m790getError0d7_KjU4, m1445copywmQWz5c$default14, (i4 & 1048576) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1034outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(1762667317);
        long m1445copywmQWz5c$default = (i4 & 1) != 0 ? Color.m1445copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m1445copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1460getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m1460getTransparent0d7_KjU() : j3;
        long m796getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU() : j4;
        long m790getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j5;
        long m1445copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m1445copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1445copywmQWz5c$default5 = (i4 & 128) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m790getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j9;
        long m1445copywmQWz5c$default6 = (i4 & 512) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m1445copywmQWz5c$default7 = (i4 & 1024) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m1445copywmQWz5c$default6 : j12;
        long m1445copywmQWz5c$default8 = (i4 & 4096) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m1445copywmQWz5c$default9 = (i4 & 8192) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m790getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j15;
        long m1445copywmQWz5c$default10 = (32768 & i4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m796getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m1445copywmQWz5c$default11 = (65536 & i4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m1445copywmQWz5c$default12 = (131072 & i4) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m790getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m790getError0d7_KjU() : j19;
        long m1445copywmQWz5c$default13 = (524288 & i4) != 0 ? Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m1445copywmQWz5c$default, m1445copywmQWz5c$default2, m796getPrimary0d7_KjU, m790getError0d7_KjU, m1445copywmQWz5c$default3, m1445copywmQWz5c$default4, m790getError0d7_KjU2, m1445copywmQWz5c$default5, m1445copywmQWz5c$default6, m1445copywmQWz5c$default7, j22, m1445copywmQWz5c$default8, m1445copywmQWz5c$default9, m790getError0d7_KjU3, m1460getTransparent0d7_KjU, m1445copywmQWz5c$default10, m1445copywmQWz5c$default11, m1445copywmQWz5c$default12, m790getError0d7_KjU4, m1445copywmQWz5c$default13, (i4 & 1048576) != 0 ? Color.m1445copywmQWz5c$default(m1445copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(final String value, final Function2 innerTextField, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Function2 function25;
        int i8;
        int i9;
        int i10;
        int i11;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors3;
        Function2 function26;
        boolean z4;
        Function2 function27;
        Function2 function28;
        PaddingValues m1028textFieldWithLabelPaddinga9UjIt4$default;
        Composer composer2;
        final TextFieldColors textFieldColors4;
        final boolean z5;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(1171040065);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    i14 = (i & 458752) == 0 ? startRestartGroup.changed(interactionSource) ? 131072 : 65536 : 196608;
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(function2) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                        function25 = function22;
                    } else {
                        function25 = function22;
                        if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(function25) ? 67108864 : 33554432;
                        }
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changed(function23) ? 536870912 : 268435456;
                    }
                    i9 = i4;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changed(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                            i13 = 32;
                            i11 |= i13;
                        }
                        i13 = 16;
                        i11 |= i13;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                            i12 = 256;
                            i11 |= i12;
                        }
                        i12 = 128;
                        i11 |= i12;
                    }
                    int i15 = i11;
                    if ((i3 & 8192) == 0) {
                        i15 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i15 |= startRestartGroup.changed(this) ? 2048 : 1024;
                        if ((i9 & 1533916891) == 306783378 || (i15 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                boolean z6 = i5 != 0 ? false : z3;
                                Function2 function213 = i6 != 0 ? null : function2;
                                if (i7 != 0) {
                                    function25 = null;
                                }
                                Function2 function214 = i8 != 0 ? null : function23;
                                Function2 function215 = i10 == 0 ? function24 : null;
                                if ((i3 & 2048) != 0) {
                                    textFieldColors2 = m1036textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i15 >> 6) & 112, 2097151);
                                    i15 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                } else {
                                    textFieldColors2 = textFieldColors;
                                }
                                if ((i3 & 4096) != 0) {
                                    if (function213 == null) {
                                        m1028textFieldWithLabelPaddinga9UjIt4$default = m1029textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        m1028textFieldWithLabelPaddinga9UjIt4$default = m1028textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i15 &= -897;
                                    textFieldColors3 = textFieldColors2;
                                    function26 = function214;
                                    z4 = z6;
                                    function27 = function213;
                                    function28 = function215;
                                    paddingValues2 = m1028textFieldWithLabelPaddinga9UjIt4$default;
                                } else {
                                    paddingValues2 = paddingValues;
                                    textFieldColors3 = textFieldColors2;
                                    function26 = function214;
                                    z4 = z6;
                                    function27 = function213;
                                    function28 = function215;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 2048) != 0) {
                                    i15 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                }
                                if ((i3 & 4096) != 0) {
                                    i15 &= -897;
                                }
                                z4 = z3;
                                function27 = function2;
                                function26 = function23;
                                function28 = function24;
                                textFieldColors3 = textFieldColors;
                                paddingValues2 = paddingValues;
                            }
                            Function2 function216 = function25;
                            startRestartGroup.endDefaults();
                            int i16 = i9 << 3;
                            int i17 = i9 >> 9;
                            composer2 = startRestartGroup;
                            textFieldColors4 = textFieldColors3;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function27, function216, function26, function28, z2, z, z4, interactionSource, paddingValues2, textFieldColors4, null, composer2, (i16 & 896) | (i16 & 112) | 6 | ((i9 >> 3) & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | ((i15 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i15 & 896) | ((i15 << 6) & 7168), 16384);
                            z5 = z4;
                            function29 = function27;
                            function210 = function216;
                            function211 = function26;
                            function212 = function28;
                            paddingValues3 = paddingValues2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function29 = function2;
                            function211 = function23;
                            function212 = function24;
                            textFieldColors4 = textFieldColors;
                            composer2 = startRestartGroup;
                            function210 = function25;
                            paddingValues3 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i18) {
                                TextFieldDefaults.this.TextFieldDecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function29, function210, function211, function212, textFieldColors4, paddingValues3, composer3, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    if ((i9 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    if ((i3 & 4096) != 0) {
                    }
                    Function2 function2162 = function25;
                    startRestartGroup.endDefaults();
                    int i162 = i9 << 3;
                    int i172 = i9 >> 9;
                    composer2 = startRestartGroup;
                    textFieldColors4 = textFieldColors3;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function27, function2162, function26, function28, z2, z, z4, interactionSource, paddingValues2, textFieldColors4, null, composer2, (i162 & 896) | (i162 & 112) | 6 | ((i9 >> 3) & 7168) | (i172 & 57344) | (i172 & 458752) | (i172 & 3670016) | ((i15 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i15 & 896) | ((i15 << 6) & 7168), 16384);
                    z5 = z4;
                    function29 = function27;
                    function210 = function2162;
                    function211 = function26;
                    function212 = function28;
                    paddingValues3 = paddingValues2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 |= i14;
                i5 = i3 & 64;
                if (i5 == 0) {
                }
                i6 = i3 & 128;
                if (i6 == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i4;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i152 = i11;
                if ((i3 & 8192) == 0) {
                }
                if ((i9 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                if ((i3 & 4096) != 0) {
                }
                Function2 function21622 = function25;
                startRestartGroup.endDefaults();
                int i1622 = i9 << 3;
                int i1722 = i9 >> 9;
                composer2 = startRestartGroup;
                textFieldColors4 = textFieldColors3;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function27, function21622, function26, function28, z2, z, z4, interactionSource, paddingValues2, textFieldColors4, null, composer2, (i1622 & 896) | (i1622 & 112) | 6 | ((i9 >> 3) & 7168) | (i1722 & 57344) | (i1722 & 458752) | (i1722 & 3670016) | ((i152 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i152 & 896) | ((i152 << 6) & 7168), 16384);
                z5 = z4;
                function29 = function27;
                function210 = function21622;
                function211 = function26;
                function212 = function28;
                paddingValues3 = paddingValues2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i4 |= i14;
            i5 = i3 & 64;
            if (i5 == 0) {
            }
            i6 = i3 & 128;
            if (i6 == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i4;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i1522 = i11;
            if ((i3 & 8192) == 0) {
            }
            if ((i9 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            Function2 function216222 = function25;
            startRestartGroup.endDefaults();
            int i16222 = i9 << 3;
            int i17222 = i9 >> 9;
            composer2 = startRestartGroup;
            textFieldColors4 = textFieldColors3;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function27, function216222, function26, function28, z2, z, z4, interactionSource, paddingValues2, textFieldColors4, null, composer2, (i16222 & 896) | (i16222 & 112) | 6 | ((i9 >> 3) & 7168) | (i17222 & 57344) | (i17222 & 458752) | (i17222 & 3670016) | ((i1522 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i1522 & 896) | ((i1522 << 6) & 7168), 16384);
            z5 = z4;
            function29 = function27;
            function210 = function216222;
            function211 = function26;
            function212 = function28;
            paddingValues3 = paddingValues2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i14;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i4;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i15222 = i11;
        if ((i3 & 8192) == 0) {
        }
        if ((i9 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        Function2 function2162222 = function25;
        startRestartGroup.endDefaults();
        int i162222 = i9 << 3;
        int i172222 = i9 >> 9;
        composer2 = startRestartGroup;
        textFieldColors4 = textFieldColors3;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function27, function2162222, function26, function28, z2, z, z4, interactionSource, paddingValues2, textFieldColors4, null, composer2, (i162222 & 896) | (i162222 & 112) | 6 | ((i9 >> 3) & 7168) | (i172222 & 57344) | (i172222 & 458752) | (i172222 & 3670016) | ((i15222 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i15222 & 896) | ((i15222 << 6) & 7168), 16384);
        z5 = z4;
        function29 = function27;
        function210 = function2162222;
        function211 = function26;
        function212 = function28;
        paddingValues3 = paddingValues2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(final String value, final Function2 innerTextField, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        final int i9;
        int i10;
        int i11;
        int i12;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        boolean z4;
        Function2 function29;
        Function2 function210;
        Composer composer2;
        final TextFieldColors textFieldColors4;
        final boolean z5;
        final Function2 function211;
        final Function2 function212;
        final Function2 function213;
        final Function2 function214;
        final PaddingValues paddingValues4;
        final Function2 function215;
        ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1280721485);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    i15 = (i & 458752) == 0 ? startRestartGroup.changed(interactionSource) ? 131072 : 65536 : 196608;
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(function2) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changed(function22) ? 67108864 : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changed(function23) ? 536870912 : 268435456;
                    }
                    i9 = i4;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i11 = i2 | (startRestartGroup.changed(function24) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                            i14 = 32;
                            i11 |= i14;
                        }
                        i14 = 16;
                        i11 |= i14;
                    }
                    if ((i2 & 896) == 0) {
                        if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                            i13 = 256;
                            i11 |= i13;
                        }
                        i13 = 128;
                        i11 |= i13;
                    }
                    int i16 = i11;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i16 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i16 |= startRestartGroup.changed(function25) ? 2048 : 1024;
                        if ((i3 & 16384) != 0) {
                            i16 |= 24576;
                        } else if ((i2 & 57344) == 0) {
                            i16 |= startRestartGroup.changed(this) ? 16384 : 8192;
                            if ((i9 & 1533916891) == 306783378 || (46811 & i16) != 9362 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i5 == 0 ? false : z3;
                                    Function2 function216 = i6 == 0 ? null : function2;
                                    Function2 function217 = i7 == 0 ? null : function22;
                                    Function2 function218 = i8 == 0 ? null : function23;
                                    Function2 function219 = i10 == 0 ? function24 : null;
                                    if ((i3 & 2048) == 0) {
                                        textFieldColors2 = m1034outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i16 >> 9) & 112, 2097151);
                                        i16 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                    } else {
                                        textFieldColors2 = textFieldColors;
                                    }
                                    Function2 function220 = function218;
                                    if ((i3 & 4096) == 0) {
                                        paddingValues2 = m1027outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i16 &= -897;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    if (i12 == 0) {
                                        final boolean z7 = z6;
                                        final TextFieldColors textFieldColors5 = textFieldColors2;
                                        final int i17 = i16;
                                        textFieldColors3 = textFieldColors2;
                                        paddingValues3 = paddingValues2;
                                        function27 = function220;
                                        function26 = ComposableLambdaKt.composableLambda(startRestartGroup, 1261916269, true, new Function2() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
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
                                            public final void invoke(@Nullable Composer composer3, int i18) {
                                                if ((i18 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                boolean z8 = z;
                                                boolean z9 = z7;
                                                InteractionSource interactionSource2 = interactionSource;
                                                TextFieldColors textFieldColors6 = textFieldColors5;
                                                int i19 = i9;
                                                textFieldDefaults.m1030BorderBoxnbWgWpA(z8, z9, interactionSource2, textFieldColors6, null, 0.0f, 0.0f, composer3, ((i19 >> 9) & 896) | ((i19 >> 6) & 14) | 12582912 | ((i19 >> 15) & 112) | ((i17 << 6) & 7168), 112);
                                            }
                                        });
                                    } else {
                                        textFieldColors3 = textFieldColors2;
                                        paddingValues3 = paddingValues2;
                                        function26 = function25;
                                        function27 = function220;
                                    }
                                    function28 = function216;
                                    z4 = z6;
                                    function29 = function217;
                                    function210 = function219;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i16 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i16 &= -897;
                                    }
                                    z4 = z3;
                                    function28 = function2;
                                    function29 = function22;
                                    function27 = function23;
                                    function210 = function24;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    function26 = function25;
                                }
                                startRestartGroup.endDefaults();
                                int i18 = i9 << 3;
                                int i19 = i9 >> 9;
                                composer2 = startRestartGroup;
                                textFieldColors4 = textFieldColors3;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function28, function29, function27, function210, z2, z, z4, interactionSource, paddingValues3, textFieldColors4, function26, composer2, (i18 & 896) | (i18 & 112) | 6 | ((i9 >> 3) & 7168) | (i19 & 57344) | (458752 & i19) | (i19 & 3670016) | ((i16 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i16 & 896) | ((i16 << 6) & 7168) | ((i16 << 3) & 57344), 0);
                                z5 = z4;
                                function211 = function28;
                                function212 = function29;
                                function213 = function27;
                                function214 = function210;
                                paddingValues4 = paddingValues3;
                                function215 = function26;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function211 = function2;
                                function212 = function22;
                                function213 = function23;
                                function214 = function24;
                                textFieldColors4 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function215 = function25;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function211, function212, function213, function214, textFieldColors4, paddingValues4, function215, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        if ((i9 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        Function2 function2202 = function218;
                        if ((i3 & 4096) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        function28 = function216;
                        z4 = z6;
                        function29 = function217;
                        function210 = function219;
                        startRestartGroup.endDefaults();
                        int i182 = i9 << 3;
                        int i192 = i9 >> 9;
                        composer2 = startRestartGroup;
                        textFieldColors4 = textFieldColors3;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function28, function29, function27, function210, z2, z, z4, interactionSource, paddingValues3, textFieldColors4, function26, composer2, (i182 & 896) | (i182 & 112) | 6 | ((i9 >> 3) & 7168) | (i192 & 57344) | (458752 & i192) | (i192 & 3670016) | ((i16 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i16 & 896) | ((i16 << 6) & 7168) | ((i16 << 3) & 57344), 0);
                        z5 = z4;
                        function211 = function28;
                        function212 = function29;
                        function213 = function27;
                        function214 = function210;
                        paddingValues4 = paddingValues3;
                        function215 = function26;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((i9 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    Function2 function22022 = function218;
                    if ((i3 & 4096) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    function28 = function216;
                    z4 = z6;
                    function29 = function217;
                    function210 = function219;
                    startRestartGroup.endDefaults();
                    int i1822 = i9 << 3;
                    int i1922 = i9 >> 9;
                    composer2 = startRestartGroup;
                    textFieldColors4 = textFieldColors3;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function28, function29, function27, function210, z2, z, z4, interactionSource, paddingValues3, textFieldColors4, function26, composer2, (i1822 & 896) | (i1822 & 112) | 6 | ((i9 >> 3) & 7168) | (i1922 & 57344) | (458752 & i1922) | (i1922 & 3670016) | ((i16 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i16 & 896) | ((i16 << 6) & 7168) | ((i16 << 3) & 57344), 0);
                    z5 = z4;
                    function211 = function28;
                    function212 = function29;
                    function213 = function27;
                    function214 = function210;
                    paddingValues4 = paddingValues3;
                    function215 = function26;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i15;
                i5 = i3 & 64;
                if (i5 == 0) {
                }
                i6 = i3 & 128;
                if (i6 == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i4;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i162 = i11;
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((i9 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                Function2 function220222 = function218;
                if ((i3 & 4096) == 0) {
                }
                if (i12 == 0) {
                }
                function28 = function216;
                z4 = z6;
                function29 = function217;
                function210 = function219;
                startRestartGroup.endDefaults();
                int i18222 = i9 << 3;
                int i19222 = i9 >> 9;
                composer2 = startRestartGroup;
                textFieldColors4 = textFieldColors3;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function28, function29, function27, function210, z2, z, z4, interactionSource, paddingValues3, textFieldColors4, function26, composer2, (i18222 & 896) | (i18222 & 112) | 6 | ((i9 >> 3) & 7168) | (i19222 & 57344) | (458752 & i19222) | (i19222 & 3670016) | ((i162 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i162 & 896) | ((i162 << 6) & 7168) | ((i162 << 3) & 57344), 0);
                z5 = z4;
                function211 = function28;
                function212 = function29;
                function213 = function27;
                function214 = function210;
                paddingValues4 = paddingValues3;
                function215 = function26;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i4 |= i15;
            i5 = i3 & 64;
            if (i5 == 0) {
            }
            i6 = i3 & 128;
            if (i6 == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i4;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i1622 = i11;
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i9 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            Function2 function2202222 = function218;
            if ((i3 & 4096) == 0) {
            }
            if (i12 == 0) {
            }
            function28 = function216;
            z4 = z6;
            function29 = function217;
            function210 = function219;
            startRestartGroup.endDefaults();
            int i182222 = i9 << 3;
            int i192222 = i9 >> 9;
            composer2 = startRestartGroup;
            textFieldColors4 = textFieldColors3;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function28, function29, function27, function210, z2, z, z4, interactionSource, paddingValues3, textFieldColors4, function26, composer2, (i182222 & 896) | (i182222 & 112) | 6 | ((i9 >> 3) & 7168) | (i192222 & 57344) | (458752 & i192222) | (i192222 & 3670016) | ((i1622 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i1622 & 896) | ((i1622 << 6) & 7168) | ((i1622 << 3) & 57344), 0);
            z5 = z4;
            function211 = function28;
            function212 = function29;
            function213 = function27;
            function214 = function210;
            paddingValues4 = paddingValues3;
            function215 = function26;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i15;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i4;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i16222 = i11;
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i9 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        Function2 function22022222 = function218;
        if ((i3 & 4096) == 0) {
        }
        if (i12 == 0) {
        }
        function28 = function216;
        z4 = z6;
        function29 = function217;
        function210 = function219;
        startRestartGroup.endDefaults();
        int i1822222 = i9 << 3;
        int i1922222 = i9 >> 9;
        composer2 = startRestartGroup;
        textFieldColors4 = textFieldColors3;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function28, function29, function27, function210, z2, z, z4, interactionSource, paddingValues3, textFieldColors4, function26, composer2, (i1822222 & 896) | (i1822222 & 112) | 6 | ((i9 >> 3) & 7168) | (i1922222 & 57344) | (458752 & i1922222) | (i1922222 & 3670016) | ((i16222 << 21) & 29360128) | ((i9 << 15) & 234881024) | ((i9 << 21) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 12) & 112) | (i16222 & 896) | ((i16222 << 6) & 7168) | ((i16222 << 3) & 57344), 0);
        z5 = z4;
        function211 = function28;
        function212 = function29;
        function213 = function27;
        function214 = function210;
        paddingValues4 = paddingValues3;
        function215 = function26;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
