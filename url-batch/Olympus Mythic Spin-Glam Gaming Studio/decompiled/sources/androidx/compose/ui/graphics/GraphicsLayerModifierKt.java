package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a»\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0007¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "graphicsLayer-pANQ8Wg", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJ)Landroidx/compose/ui/Modifier;", "graphicsLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "block", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GraphicsLayerModifierKt {
    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final Modifier m1494graphicsLayerpANQ8Wg(Modifier graphicsLayer, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, final float f9, final float f10, final long j, final Shape shape, final boolean z, final RenderEffect renderEffect, final long j2, final long j3) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return graphicsLayer.then(new SimpleGraphicsLayerModifier(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("graphicsLayer");
                inspectorInfo.getProperties().set("scaleX", Float.valueOf(f));
                inspectorInfo.getProperties().set("scaleY", Float.valueOf(f2));
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f3));
                inspectorInfo.getProperties().set("translationX", Float.valueOf(f4));
                inspectorInfo.getProperties().set("translationY", Float.valueOf(f5));
                inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(f6));
                inspectorInfo.getProperties().set("rotationX", Float.valueOf(f7));
                inspectorInfo.getProperties().set("rotationY", Float.valueOf(f8));
                inspectorInfo.getProperties().set("rotationZ", Float.valueOf(f9));
                inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(f10));
                inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m1618boximpl(j));
                inspectorInfo.getProperties().set("shape", shape);
                inspectorInfo.getProperties().set("clip", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("renderEffect", renderEffect);
                inspectorInfo.getProperties().set("ambientShadowColor", Color.m1441boximpl(j2));
                inspectorInfo.getProperties().set("spotShadowColor", Color.m1441boximpl(j3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: graphicsLayer-pANQ8Wg$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1495graphicsLayerpANQ8Wg$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, Object obj) {
        return m1494graphicsLayerpANQ8Wg(modifier, (i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) == 0 ? f3 : 1.0f, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & 256) == 0 ? f9 : 0.0f, (i & 512) != 0 ? 8.0f : f10, (i & 1024) != 0 ? TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ() : j, (i & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : renderEffect, (i & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, (i & 32768) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3);
    }

    public static final Modifier graphicsLayer(Modifier modifier, final Function1 block) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return modifier.then(new BlockGraphicsLayerModifier(block, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("graphicsLayer");
                inspectorInfo.getProperties().set("block", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m1495graphicsLayerpANQ8Wg$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null)) : modifier;
    }
}
