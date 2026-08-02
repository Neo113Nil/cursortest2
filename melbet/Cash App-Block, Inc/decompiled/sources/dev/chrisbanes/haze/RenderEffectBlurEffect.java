package dev.chrisbanes.haze;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;

/* loaded from: classes9.dex */
public final class RenderEffectBlurEffect implements BlurEffect {
    public final HazeEffectNode node;
    public RenderEffect renderEffect;

    public RenderEffectBlurEffect(HazeEffectNode hazeEffectNode) {
        this.node = hazeEffectNode;
    }

    @Override // dev.chrisbanes.haze.BlurEffect
    public final void drawEffect(LayoutNodeDrawScope layoutNodeDrawScope) {
        FieldBinding$$ExternalSyntheticLambda5 fieldBinding$$ExternalSyntheticLambda5 = new FieldBinding$$ExternalSyntheticLambda5(this, 21);
        HazeEffectNode hazeEffectNode = this.node;
        float m4109calculateInputScaleFactor3ABfNKs$default = HazeEffectNodeKt.m4109calculateInputScaleFactor3ABfNKs$default(hazeEffectNode);
        int i = 0;
        boolean z = hazeEffectNode.blurredEdgeTreatment != null;
        GraphicsContext graphicsContext = (GraphicsContext) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalGraphicsContext);
        GraphicsLayer m4110createScaledContentLayerwZMzALA = HazeKt.m4110createScaledContentLayerwZMzALA(layoutNodeDrawScope, hazeEffectNode, m4109calculateInputScaleFactor3ABfNKs$default, hazeEffectNode.layerSize, hazeEffectNode.layerOffset);
        if (m4110createScaledContentLayerwZMzALA != null) {
            m4110createScaledContentLayerwZMzALA.setClip(z);
            HazeKt.m4111drawScaledContentLF441nw(layoutNodeDrawScope, hazeEffectNode.layerOffset ^ (-9223372034707292160L), Size.m645times7Ah8Wj8(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc(), m4109calculateInputScaleFactor3ABfNKs$default), z, new BlurEffectKt$$ExternalSyntheticLambda1(i, fieldBinding$$ExternalSyntheticLambda5, m4110createScaledContentLayerwZMzALA));
            graphicsContext.releaseGraphicsLayer(m4110createScaledContentLayerwZMzALA);
        }
    }
}
