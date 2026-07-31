package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Blur.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BlurKt$blur$1 extends Lambda implements Function1 {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ Shape $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlurKt$blur$1(float f, float f2, int i, Shape shape, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = shape;
        this.$clip = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        float mo271toPx0680j_4 = graphicsLayer.mo271toPx0680j_4(this.$radiusX);
        float mo271toPx0680j_42 = graphicsLayer.mo271toPx0680j_4(this.$radiusY);
        graphicsLayer.setRenderEffect((mo271toPx0680j_4 <= 0.0f || mo271toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m1569BlurEffect3YTHUZs(mo271toPx0680j_4, mo271toPx0680j_42, this.$tileMode));
        Shape shape = this.$edgeTreatment;
        if (shape == null) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayer.setShape(shape);
        graphicsLayer.setClip(this.$clip);
    }
}
