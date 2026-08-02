package dev.chrisbanes.haze;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class HazeEffectNode$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LayoutNodeDrawScope f$0;

    public /* synthetic */ HazeEffectNode$$ExternalSyntheticLambda2(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.f$0 = layoutNodeDrawScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        LayoutNodeDrawScope layoutNodeDrawScope = this.f$0;
        DrawScope drawScope = (DrawScope) obj;
        switch (i) {
            case 0:
                drawScope.getClass();
                HazeKt.drawContentSafely(layoutNodeDrawScope);
                break;
            default:
                drawScope.getClass();
                HazeKt.drawContentSafely(layoutNodeDrawScope);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ HazeEffectNode$$ExternalSyntheticLambda2(LayoutNodeDrawScope layoutNodeDrawScope, GraphicsLayer graphicsLayer) {
        this.f$0 = layoutNodeDrawScope;
    }
}
