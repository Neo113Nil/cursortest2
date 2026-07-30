package com.aviatorvaangu.aviapp46.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AviationArtwork.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\b\u001a)\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"AviationHero", "", "mode", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "drawClouds", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRunway", "drawPlane", "center", "Landroidx/compose/ui/geometry/Offset;", "scale", "", "color", "Landroidx/compose/ui/graphics/Color;", "drawPlane-icVWoeI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class AviationArtworkKt {
    static final Unit AviationHero$lambda$4(int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        AviationHero(i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AviationHero(final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-341496038);
        ComposerKt.sourceInformation(startRestartGroup, "C(AviationHero)N(mode,modifier)22@888L1300:AviationArtwork.kt#xqf9wq");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-341496038, i4, -1, "com.aviatorvaangu.aviapp46.components.AviationHero (AviationArtwork.kt:21)");
                }
                Modifier background$default = BackgroundKt.background$default(ClipKt.clip(companion, RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(24.0f))), Brush.Companion.m4694verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4729boximpl(ColorKt.Color(4280942592L)), Color.m4729boximpl(ColorKt.Color(4287299584L)), Color.m4729boximpl(ColorKt.Color(4279308561L))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, background$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4009constructorimpl = Updater.m4009constructorimpl(startRestartGroup);
                Updater.m4017setimpl(m4009constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4017setimpl(m4009constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4013initimpl(m4009constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4015reconcileimpl(m4009constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4017setimpl(m4009constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -544659568, "C27@1137L1045,27@1095L1087:AviationArtwork.kt#xqf9wq");
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1541589015, "CC(remember):AviationArtwork.kt#9igjgp");
                boolean z = (i4 & 14) == 4;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.aviatorvaangu.aviapp46.components.AviationArtworkKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AviationArtworkKt.AviationHero$lambda$3$lambda$2$lambda$1(i, (DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.components.AviationArtworkKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AviationArtworkKt.AviationHero$lambda$4(i, companion, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static final Unit AviationHero$lambda$3$lambda$2$lambda$1(int i, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        drawClouds(Canvas);
        if (i == 1) {
            drawRunway(Canvas);
            float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.54f;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.36f;
            m7954drawPlaneicVWoeI(Canvas, Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), 1.1f, Color.INSTANCE.m4776getWhite0d7_KjU());
        } else if (i != 2) {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.52f;
            float intBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.45f;
            m7954drawPlaneicVWoeI(Canvas, Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), 1.25f, Color.INSTANCE.m4776getWhite0d7_KjU());
        } else {
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.12f, Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.75f);
            Path.cubicTo(Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.35f, Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.58f, Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.52f, Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.36f, Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.88f, Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.24f);
            DrawScope.m5303drawPathLG529CI$default(Canvas, Path, AppColorsKt.getDeepBlue(), 0.0f, new Stroke(Canvas.mo407toPx0680j_4(Dp.m7522constructorimpl(5.0f)), 0.0f, StrokeCap.INSTANCE.m5114getRoundKaPHkGw(), 0, null, 26, null), null, 0, 52, null);
            float intBitsToFloat5 = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() >> 32)) * 0.58f;
            float intBitsToFloat6 = Float.intBitsToFloat((int) (Canvas.mo5313getSizeNHjbRc() & 4294967295L)) * 0.42f;
            m7954drawPlaneicVWoeI(Canvas, Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32)), 1.0f, Color.INSTANCE.m4776getWhite0d7_KjU());
        }
        return Unit.INSTANCE;
    }

    public static final void drawClouds(DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        Intrinsics.checkNotNullParameter(drawScope2, "<this>");
        long m4738copywmQWz5c$default = Color.m4738copywmQWz5c$default(Color.INSTANCE.m4776getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null);
        char c = ' ';
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() >> 32)) * 0.16f;
        long j = 4294967295L;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() & 4294967295L)) * 0.22f;
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() >> 32)) * 0.78f;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() & 4294967295L)) * 0.18f;
        long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat3);
        float intBitsToFloat5 = Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() >> 32)) * 0.28f;
        Iterator it = CollectionsKt.listOf((Object[]) new Offset[]{Offset.m4483boximpl(Offset.m4486constructorimpl(floatToRawIntBits2 | (floatToRawIntBits << 32))), Offset.m4483boximpl(Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (floatToRawIntBits3 << 32))), Offset.m4483boximpl(Offset.m4486constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() & 4294967295L)) * 0.62f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32)))}).iterator();
        while (it.hasNext()) {
            long m4504unboximpl = ((Offset) it.next()).m4504unboximpl();
            float intBitsToFloat6 = Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() >> c)) * 0.18f;
            DrawScope.m5301drawOvalnJ9OG0$default(drawScope2, m4738copywmQWz5c$default, m4504unboximpl, Size.m4554constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo5313getSizeNHjbRc() & j)) * 0.08f) & j) | (Float.floatToRawIntBits(intBitsToFloat6) << c)), 0.0f, null, null, 0, 120, null);
            char c2 = c;
            long j2 = j;
            DrawScope.m5294drawCircleVaOC9Bg$default(drawScope, m4738copywmQWz5c$default, Size.m4562getMinDimensionimpl(drawScope.mo5313getSizeNHjbRc()) * 0.045f, Offset.m4499plusMKHz9U(m4504unboximpl, Offset.m4486constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> c)) * 0.05f) << c) | (Float.floatToRawIntBits(0.0f) & j))), 0.0f, null, null, 0, 120, null);
            drawScope2 = drawScope;
            DrawScope.m5294drawCircleVaOC9Bg$default(drawScope2, m4738copywmQWz5c$default, 0.035f * Size.m4562getMinDimensionimpl(drawScope.mo5313getSizeNHjbRc()), Offset.m4499plusMKHz9U(m4504unboximpl, Offset.m4486constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> c2)) * 0.105f) << c2) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & j2)) * 0.01f) & j2))), 0.0f, null, null, 0, 120, null);
            c = c2;
            j = j2;
        }
    }

    public static final void drawRunway(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> 32)) * 0.38f, Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & 4294967295L)));
        Path.lineTo(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> 32)) * 0.62f, Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & 4294967295L)));
        Path.lineTo(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> 32)) * 0.54f, Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & 4294967295L)) * 0.55f);
        Path.lineTo(Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> 32)) * 0.46f, Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & 4294967295L)) * 0.55f);
        Path.close();
        DrawScope.m5303drawPathLG529CI$default(drawScope, Path, Color.m4738copywmQWz5c$default(ColorKt.Color(4281417810L), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
        long Color = ColorKt.Color(4294920778L);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> 32)) * 0.5f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & 4294967295L)) * 0.62f;
        long m4486constructorimpl = Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() >> 32)) * 0.5f;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo5313getSizeNHjbRc() & 4294967295L)) * 0.92f;
        DrawScope.m5299drawLineNGM6Ib0$default(drawScope, Color, m4486constructorimpl, Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), drawScope.mo407toPx0680j_4(Dp.m7522constructorimpl(4.0f)), 0, null, 0.0f, null, 0, 496, null);
    }

    /* renamed from: drawPlane-icVWoeI, reason: not valid java name */
    public static final void m7954drawPlaneicVWoeI(DrawScope drawPlane, long j, float f, long j2) {
        Intrinsics.checkNotNullParameter(drawPlane, "$this$drawPlane");
        float m4562getMinDimensionimpl = Size.m4562getMinDimensionimpl(drawPlane.mo5313getSizeNHjbRc()) * 0.08f * f;
        Path Path = AndroidPath_androidKt.Path();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        Path.moveTo(Float.intBitsToFloat(i) + (2.1f * m4562getMinDimensionimpl), Float.intBitsToFloat(i2));
        float f2 = 1.35f * m4562getMinDimensionimpl;
        float f3 = 0.45f * m4562getMinDimensionimpl;
        Path.lineTo(Float.intBitsToFloat(i) - f2, Float.intBitsToFloat(i2) - f3);
        Path.lineTo(Float.intBitsToFloat(i) - (0.9f * m4562getMinDimensionimpl), Float.intBitsToFloat(i2));
        Path.lineTo(Float.intBitsToFloat(i) - f2, Float.intBitsToFloat(i2) + f3);
        Path.close();
        DrawScope.m5303drawPathLG529CI$default(drawPlane, Path, j2, 0.0f, null, null, 0, 60, null);
        Path Path2 = AndroidPath_androidKt.Path();
        float f4 = m4562getMinDimensionimpl * 0.1f;
        Path2.moveTo(Float.intBitsToFloat(i) - f4, Float.intBitsToFloat(i2));
        float f5 = m4562getMinDimensionimpl * 0.78f;
        float f6 = m4562getMinDimensionimpl * 1.0f;
        Path2.lineTo(Float.intBitsToFloat(i) - f5, Float.intBitsToFloat(i2) - f6);
        float f7 = m4562getMinDimensionimpl * 0.42f;
        float f8 = m4562getMinDimensionimpl * 0.12f;
        Path2.lineTo(Float.intBitsToFloat(i) + f7, Float.intBitsToFloat(i2) - f8);
        Path2.close();
        DrawScope.m5303drawPathLG529CI$default(drawPlane, Path2, ColorKt.Color(4294916923L), 0.0f, null, null, 0, 60, null);
        Path Path3 = AndroidPath_androidKt.Path();
        Path3.moveTo(Float.intBitsToFloat(i) - f4, Float.intBitsToFloat(i2));
        Path3.lineTo(Float.intBitsToFloat(i) - f5, Float.intBitsToFloat(i2) + f6);
        Path3.lineTo(Float.intBitsToFloat(i) + f7, Float.intBitsToFloat(i2) + f8);
        Path3.close();
        DrawScope.m5303drawPathLG529CI$default(drawPlane, Path3, ColorKt.Color(4294916923L), 0.0f, null, null, 0, 60, null);
    }
}
