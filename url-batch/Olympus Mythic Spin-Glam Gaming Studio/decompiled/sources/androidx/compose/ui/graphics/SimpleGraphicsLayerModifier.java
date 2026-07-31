package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010'\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u001d\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\u001d\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u00103R\u001d\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u00103R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "F", "J", "Landroidx/compose/ui/graphics/Shape;", "Z", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SimpleGraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final Function1 layerBlock;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, function1);
    }

    private SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, Function1 function1) {
        super(function1);
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.layerBlock = new Function1() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                float f11;
                float f12;
                float f13;
                float f14;
                float f15;
                float f16;
                float f17;
                float f18;
                float f19;
                float f20;
                long j4;
                Shape shape2;
                boolean z2;
                RenderEffect renderEffect2;
                long j5;
                long j6;
                Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
                f11 = SimpleGraphicsLayerModifier.this.scaleX;
                graphicsLayerScope.setScaleX(f11);
                f12 = SimpleGraphicsLayerModifier.this.scaleY;
                graphicsLayerScope.setScaleY(f12);
                f13 = SimpleGraphicsLayerModifier.this.alpha;
                graphicsLayerScope.setAlpha(f13);
                f14 = SimpleGraphicsLayerModifier.this.translationX;
                graphicsLayerScope.setTranslationX(f14);
                f15 = SimpleGraphicsLayerModifier.this.translationY;
                graphicsLayerScope.setTranslationY(f15);
                f16 = SimpleGraphicsLayerModifier.this.shadowElevation;
                graphicsLayerScope.setShadowElevation(f16);
                f17 = SimpleGraphicsLayerModifier.this.rotationX;
                graphicsLayerScope.setRotationX(f17);
                f18 = SimpleGraphicsLayerModifier.this.rotationY;
                graphicsLayerScope.setRotationY(f18);
                f19 = SimpleGraphicsLayerModifier.this.rotationZ;
                graphicsLayerScope.setRotationZ(f19);
                f20 = SimpleGraphicsLayerModifier.this.cameraDistance;
                graphicsLayerScope.setCameraDistance(f20);
                j4 = SimpleGraphicsLayerModifier.this.transformOrigin;
                graphicsLayerScope.mo1498setTransformOrigin__ExYCQ(j4);
                shape2 = SimpleGraphicsLayerModifier.this.shape;
                graphicsLayerScope.setShape(shape2);
                z2 = SimpleGraphicsLayerModifier.this.clip;
                graphicsLayerScope.setClip(z2);
                renderEffect2 = SimpleGraphicsLayerModifier.this.renderEffect;
                graphicsLayerScope.setRenderEffect(renderEffect2);
                j5 = SimpleGraphicsLayerModifier.this.ambientShadowColor;
                graphicsLayerScope.mo1496setAmbientShadowColor8_81llA(j5);
                j6 = SimpleGraphicsLayerModifier.this.spotShadowColor;
                graphicsLayerScope.mo1497setSpotShadowColor8_81llA(j6);
            }
        };
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable placeable = Placeable.this;
                function1 = this.layerBlock;
                Placeable.PlacementScope.placeWithLayer$default(layout, placeable, 0, 0, 0.0f, function1, 4, null);
            }
        }, 4, null);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m1624hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((((hashCode + (renderEffect != null ? renderEffect.hashCode() : 0)) * 31) + Color.m1453hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m1453hashCodeimpl(this.spotShadowColor);
    }

    public boolean equals(Object other) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = other instanceof SimpleGraphicsLayerModifier ? (SimpleGraphicsLayerModifier) other : null;
        return simpleGraphicsLayerModifier != null && this.scaleX == simpleGraphicsLayerModifier.scaleX && this.scaleY == simpleGraphicsLayerModifier.scaleY && this.alpha == simpleGraphicsLayerModifier.alpha && this.translationX == simpleGraphicsLayerModifier.translationX && this.translationY == simpleGraphicsLayerModifier.translationY && this.shadowElevation == simpleGraphicsLayerModifier.shadowElevation && this.rotationX == simpleGraphicsLayerModifier.rotationX && this.rotationY == simpleGraphicsLayerModifier.rotationY && this.rotationZ == simpleGraphicsLayerModifier.rotationZ && this.cameraDistance == simpleGraphicsLayerModifier.cameraDistance && TransformOrigin.m1621equalsimpl0(this.transformOrigin, simpleGraphicsLayerModifier.transformOrigin) && Intrinsics.areEqual(this.shape, simpleGraphicsLayerModifier.shape) && this.clip == simpleGraphicsLayerModifier.clip && Intrinsics.areEqual(this.renderEffect, simpleGraphicsLayerModifier.renderEffect) && Color.m1447equalsimpl0(this.ambientShadowColor, simpleGraphicsLayerModifier.ambientShadowColor) && Color.m1447equalsimpl0(this.spotShadowColor, simpleGraphicsLayerModifier.spotShadowColor);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m1625toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m1454toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m1454toStringimpl(this.spotShadowColor)) + ')';
    }
}
