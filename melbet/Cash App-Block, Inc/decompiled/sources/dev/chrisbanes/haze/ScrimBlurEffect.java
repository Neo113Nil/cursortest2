package dev.chrisbanes.haze;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.squareup.util.cash.Countries;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* loaded from: classes9.dex */
public final class ScrimBlurEffect implements BlurEffect {
    public final HazeEffectNode node;

    public ScrimBlurEffect(HazeEffectNode hazeEffectNode) {
        this.node = hazeEffectNode;
    }

    @Override // dev.chrisbanes.haze.BlurEffect
    public final void drawEffect(LayoutNodeDrawScope layoutNodeDrawScope) {
        Lazy lazy = HazeEffectNodeKt.renderEffectCache$delegate;
        HazeEffectNode hazeEffectNode = this.node;
        HazeTint hazeTint = hazeEffectNode.fallbackTint;
        HazeTint hazeTint2 = null;
        if (!hazeTint.isSpecified()) {
            hazeTint = null;
        }
        if (hazeTint == null) {
            hazeTint = hazeEffectNode.style.fallbackTint;
            if (!hazeTint.isSpecified()) {
                hazeTint = null;
            }
            if (hazeTint == null) {
                hazeTint = hazeEffectNode.compositionLocalStyle.fallbackTint;
            }
        }
        if (!hazeTint.isSpecified()) {
            hazeTint = null;
        }
        if (hazeTint == null) {
            HazeTint hazeTint3 = (HazeTint) CollectionsKt.firstOrNull(HazeEffectNodeKt.resolveTints(hazeEffectNode));
            if (hazeTint3 != null) {
                Brush brush = hazeTint3.brush;
                float resolveBlurRadius = HazeEffectNodeKt.resolveBlurRadius(hazeEffectNode);
                if (Float.isNaN(resolveBlurRadius)) {
                    resolveBlurRadius = RecyclerView.DECELERATION_RATE;
                }
                if (brush != null) {
                    hazeTint2 = hazeTint3;
                } else {
                    if (Float.isNaN(resolveBlurRadius)) {
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = HazeDefaults.blurredEdgeTreatment;
                        resolveBlurRadius = 20.0f;
                    }
                    long j = hazeTint3.color;
                    float m677getAlphaimpl = Color.m677getAlphaimpl(j) * ((resolveBlurRadius / 72.0f) + 1.0f);
                    if (m677getAlphaimpl > 1.0f) {
                        m677getAlphaimpl = 1.0f;
                    }
                    hazeTint2 = new HazeTint(Color.m675copywmQWz5c$default(m677getAlphaimpl, j, 14), hazeTint3.blendMode, brush);
                }
            }
            if (hazeTint2 == null) {
                return;
            }
        } else {
            hazeTint2 = hazeTint;
        }
        float f = hazeEffectNode.alpha;
        if (f >= 1.0f) {
            HazeKt.m4112drawScrimDBWKusU(layoutNodeDrawScope, hazeTint2, hazeEffectNode, 0L, layoutNodeDrawScope.mo753getSizeNHjbRc());
            return;
        }
        GraphicsContext graphicsContext = (GraphicsContext) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalGraphicsContext);
        GraphicsLayer createGraphicsLayer = graphicsContext.createGraphicsLayer();
        try {
            createGraphicsLayer.getClass();
            createGraphicsLayer.setAlpha(f);
            layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc()), createGraphicsLayer, new OverridingUtil.AnonymousClass7(15, hazeTint2, this));
            SizeKt.drawLayer(layoutNodeDrawScope, createGraphicsLayer);
        } finally {
            graphicsContext.releaseGraphicsLayer(createGraphicsLayer);
        }
    }
}
