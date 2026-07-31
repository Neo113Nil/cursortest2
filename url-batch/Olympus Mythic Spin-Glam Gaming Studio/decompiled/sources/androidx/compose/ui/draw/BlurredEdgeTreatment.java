package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Blur.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "", "Landroidx/compose/ui/graphics/Shape;", "shape", "constructor-impl", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/graphics/Shape;", "", "toString-impl", "(Landroidx/compose/ui/graphics/Shape;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/ui/graphics/Shape;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/ui/graphics/Shape;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlurredEdgeTreatment {
    private static final Shape Rectangle = m1230constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m1230constructorimpl(null);
    private final Shape shape;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m1230constructorimpl(Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1231equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && Intrinsics.areEqual(shape, ((BlurredEdgeTreatment) obj).getShape());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1232hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1233toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m1231equalsimpl(this.shape, obj);
    }

    public int hashCode() {
        return m1232hashCodeimpl(this.shape);
    }

    public String toString() {
        return m1233toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }
}
