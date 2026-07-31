package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.ironsource.C4643f8;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0016\u0010\u0019\u001a-\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", C4643f8.p, "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VectorPainterKt {
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final VectorPainter m1751rememberVectorPaintervIP8VLU(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, Function4 content, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1068590786);
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        long m1461getUnspecified0d7_KjU = (i3 & 32) != 0 ? Color.INSTANCE.m1461getUnspecified0d7_KjU() : j;
        int m1419getSrcIn0nO6VwU = (i3 & 64) != 0 ? BlendMode.INSTANCE.m1419getSrcIn0nO6VwU() : i;
        boolean z2 = (i3 & 128) != 0 ? false : z;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float mo271toPx0680j_4 = density.mo271toPx0680j_4(f);
        float mo271toPx0680j_42 = density.mo271toPx0680j_4(f2);
        if (Float.isNaN(f5)) {
            f5 = mo271toPx0680j_4;
        }
        if (Float.isNaN(f6)) {
            f6 = mo271toPx0680j_42;
        }
        Color m1441boximpl = Color.m1441boximpl(m1461getUnspecified0d7_KjU);
        BlendMode m1387boximpl = BlendMode.m1387boximpl(m1419getSrcIn0nO6VwU);
        int i4 = i2 >> 15;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(m1441boximpl) | composer.changed(m1387boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = !Color.m1447equalsimpl0(m1461getUnspecified0d7_KjU, Color.INSTANCE.m1461getUnspecified0d7_KjU()) ? ColorFilter.INSTANCE.m1465tintxETnrds(m1461getUnspecified0d7_KjU, m1419getSrcIn0nO6VwU) : null;
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new VectorPainter();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) rememberedValue2;
        vectorPainter.m1749setSizeuvyYCjk$ui_release(SizeKt.Size(mo271toPx0680j_4, mo271toPx0680j_42));
        vectorPainter.setAutoMirror$ui_release(z2);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.RenderVector$ui_release(str2, f5, f6, content, composer, ((i2 >> 12) & 14) | 32768 | (i4 & 7168));
        composer.endReplaceableGroup();
        return vectorPainter;
    }

    public static final VectorPainter rememberVectorPainter(final ImageVector image, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        composer.startReplaceableGroup(1413834416);
        VectorPainter m1751rememberVectorPaintervIP8VLU = m1751rememberVectorPaintervIP8VLU(image.getDefaultWidth(), image.getDefaultHeight(), image.getViewportWidth(), image.getViewportHeight(), image.getName(), image.getTintColor(), image.getTintBlendMode(), image.getAutoMirror(), ComposableLambdaKt.composableLambda(composer, 1873274766, true, new Function4() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(float f, float f2, @Nullable Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    VectorPainterKt.RenderVectorGroup(ImageVector.this.getRoot(), null, composer2, 0, 2);
                }
            }
        }), composer, 100663296, 0);
        composer.endReplaceableGroup();
        return m1751rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderVectorGroup(final VectorGroup group, Map map, Composer composer, final int i, final int i2) {
        int i3;
        Map emptyMap;
        Iterator<VectorNode> it;
        final Map map2;
        final Map map3;
        Intrinsics.checkNotNullParameter(group, "group");
        Composer startRestartGroup = composer.startRestartGroup(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(group) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 != 2 || (i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else if (i4 != 0) {
                emptyMap = MapsKt.emptyMap();
                startRestartGroup.endDefaults();
                it = group.iterator();
                while (it.hasNext()) {
                    final VectorNode next = it.next();
                    if (next instanceof VectorPath) {
                        startRestartGroup.startReplaceableGroup(-326285835);
                        VectorPath vectorPath = (VectorPath) next;
                        VectorConfig vectorConfig = (VectorConfig) emptyMap.get(vectorPath.getName());
                        if (vectorConfig == null) {
                            vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            };
                        }
                        VectorConfig vectorConfig2 = vectorConfig;
                        VectorComposeKt.m1744Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.getPathFillType(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.getStrokeLineCap(), vectorPath.getStrokeLineJoin(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), startRestartGroup, 8, 0, 0);
                        startRestartGroup.endReplaceableGroup();
                        emptyMap = emptyMap;
                    } else {
                        Map map4 = emptyMap;
                        if (next instanceof VectorGroup) {
                            startRestartGroup.startReplaceableGroup(-326283977);
                            VectorGroup vectorGroup = (VectorGroup) next;
                            map3 = map4;
                            VectorConfig vectorConfig3 = (VectorConfig) map3.get(vectorGroup.getName());
                            if (vectorConfig3 == null) {
                                vectorConfig3 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                };
                            }
                            VectorComposeKt.Group(vectorGroup.getName(), ((Number) vectorConfig3.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup.getRotation()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup.getPivotX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup.getPivotY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup.getScaleX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup.getScaleY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup.getTranslationX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup.getTranslationY()))).floatValue(), (List) vectorConfig3.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup.getClipPathData()), ComposableLambdaKt.composableLambda(startRestartGroup, 1450046638, true, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                public final void invoke(@Nullable Composer composer2, int i5) {
                                    if ((i5 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        VectorPainterKt.RenderVectorGroup((VectorGroup) VectorNode.this, map3, composer2, 64, 0);
                                    }
                                }
                            }), startRestartGroup, 939524096, 0);
                            startRestartGroup.endReplaceableGroup();
                        } else {
                            map3 = map4;
                            startRestartGroup.startReplaceableGroup(-326282507);
                            startRestartGroup.endReplaceableGroup();
                        }
                        emptyMap = map3;
                    }
                }
                map2 = emptyMap;
            }
            emptyMap = map;
            startRestartGroup.endDefaults();
            it = group.iterator();
            while (it.hasNext()) {
            }
            map2 = emptyMap;
        } else {
            startRestartGroup.skipToGroupEnd();
            map2 = map;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                VectorPainterKt.RenderVectorGroup(VectorGroup.this, map2, composer2, i | 1, i2);
            }
        });
    }
}
