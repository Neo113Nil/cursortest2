package com.valentinilk.shimmer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes8.dex */
public final class ShimmerNode extends Modifier.Node implements DrawModifierNode, GlobalPositionAwareModifierNode {
    public ShimmerArea area;
    public ShimmerEffect effect;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        ShimmerEffect shimmerEffect = this.effect;
        ShimmerArea shimmerArea = this.area;
        AndroidPaint androidPaint = shimmerEffect.paint;
        float[] fArr = shimmerEffect.transformationMatrix;
        shimmerArea.getClass();
        if (shimmerArea.shimmerBounds.isEmpty() || shimmerArea.viewBounds.isEmpty()) {
            return;
        }
        float floatValue = ((Number) shimmerEffect.animatedState.getValue()).floatValue();
        float f = shimmerArea.translationDistance;
        float intBitsToFloat = Float.intBitsToFloat((int) (shimmerArea.pivotPoint >> 32)) + (f * floatValue) + ((-f) / 2.0f);
        Matrix.m702resetimpl(fArr);
        Matrix.m705translateimpl(fArr, Float.intBitsToFloat((int) (shimmerArea.pivotPoint >> 32)), Float.intBitsToFloat((int) (shimmerArea.pivotPoint & BodyPartID.bodyIdMax)));
        Matrix.m703rotateZimpl(shimmerEffect.rotation, fArr);
        Matrix.m705translateimpl(fArr, -Float.intBitsToFloat((int) (shimmerArea.pivotPoint >> 32)), -Float.intBitsToFloat((int) (shimmerArea.pivotPoint & BodyPartID.bodyIdMax)));
        Matrix.m705translateimpl(fArr, intBitsToFloat, RecyclerView.DECELERATION_RATE);
        androidPaint.setShader(ShaderKt.m712LinearGradientShaderVjE6UOU(Matrix.m700mapMKHz9U(shimmerEffect.gradientFrom, fArr), Matrix.m700mapMKHz9U(shimmerEffect.gradientTo, fArr), shimmerEffect.shaderColors, shimmerEffect.shaderColorStops));
        Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, canvasDrawScope.mo753getSizeNHjbRc());
        Canvas canvas = canvasDrawScope.drawContext.getCanvas();
        try {
            canvas.saveLayer(m1180Recttz77jQw, shimmerEffect.emptyPaint);
            layoutNodeDrawScope.drawContent();
            canvas.drawRect(m1180Recttz77jQw.left, m1180Recttz77jQw.top, m1180Recttz77jQw.right, m1180Recttz77jQw.bottom, androidPaint);
        } finally {
            canvas.restore();
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        Rect rect;
        try {
            long mo843localToWindowMKHz9U = nodeCoordinator.mo843localToWindowMKHz9U(0L);
            int i = (int) (mo843localToWindowMKHz9U >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (mo843localToWindowMKHz9U & BodyPartID.bodyIdMax);
            rect = new Rect(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + ((int) (nodeCoordinator.measuredSize >> 32)), Float.intBitsToFloat(i2) + ((int) (BodyPartID.bodyIdMax & nodeCoordinator.measuredSize)));
        } catch (IllegalStateException unused) {
            rect = Rect.Zero;
        }
        ShimmerArea shimmerArea = this.area;
        shimmerArea.getClass();
        if (rect.equals(shimmerArea.viewBounds)) {
            return;
        }
        shimmerArea.viewBounds = rect;
        shimmerArea.computeShimmerBounds();
    }
}
