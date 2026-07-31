package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R6\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R3\u0010*\u001a\u00020)2\u0006\u0010\r\u001a\u00020)8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R*\u00103\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R.\u00106\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R3\u0010:\u001a\u0002092\u0006\u0010\r\u001a\u0002098\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R3\u0010>\u001a\u00020=2\u0006\u0010\r\u001a\u00020=8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R*\u0010A\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010 R*\u0010D\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001c\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R*\u0010G\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u001c\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R*\u0010J\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001c\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 R\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010Q\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", "updatePath", "updateRenderPath", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "value", "name", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "Landroidx/compose/ui/graphics/Brush;", "fill", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "", "fillAlpha", "F", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "I", "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", "strokeLineWidth", "getStrokeLineWidth", "setStrokeLineWidth", VastAttributes.STROKE_COLOR, "getStroke", "setStroke", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineMiter", "getStrokeLineMiter", "setStrokeLineMiter", "trimPathStart", "getTrimPathStart", "setTrimPathStart", "trimPathEnd", "getTrimPathEnd", "setTrimPathEnd", "trimPathOffset", "getTrimPathOffset", "setTrimPathOffset", "", "isPathDirty", "Z", "isStrokeDirty", "isTrimPathDirty", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "strokeStyle", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/graphics/Path;", "renderPath", "Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure$delegate", "Lkotlin/Lazy;", "getPathMeasure", "()Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure", "Landroidx/compose/ui/graphics/vector/PathParser;", "parser", "Landroidx/compose/ui/graphics/vector/PathParser;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PathComponent extends VNode {
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    private String name;
    private final PathParser parser;
    private final Path path;
    private List pathData;
    private int pathFillType;

    /* renamed from: pathMeasure$delegate, reason: from kotlin metadata */
    private final Lazy pathMeasure;
    private final Path renderPath;
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        this.isTrimPathDirty = true;
        this.path = AndroidPath_androidKt.Path();
        this.renderPath = AndroidPath_androidKt.Path();
        this.pathMeasure = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final PathMeasure mo4828invoke() {
                return AndroidPathMeasure_androidKt.PathMeasure();
            }
        });
        this.parser = new PathParser();
    }

    public final void setName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = value;
        invalidate();
    }

    public final void setFill(Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f) {
        this.fillAlpha = f;
        invalidate();
    }

    public final void setPathData(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.pathData = value;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m1729setPathFillTypeoQ8Xj4U(int i) {
        this.pathFillType = i;
        this.renderPath.mo1380setFillTypeoQ8Xj4U(i);
        invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.strokeAlpha = f;
        invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.strokeLineWidth = f;
        invalidate();
    }

    public final void setStroke(Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m1730setStrokeLineCapBeK7IIE(int i) {
        this.strokeLineCap = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m1731setStrokeLineJoinWw9F2mQ(int i) {
        this.strokeLineJoin = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.strokeLineMiter = f;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setTrimPathStart(float f) {
        if (this.trimPathStart == f) {
            return;
        }
        this.trimPathStart = f;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathEnd(float f) {
        if (this.trimPathEnd == f) {
            return;
        }
        this.trimPathEnd = f;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f) {
        if (this.trimPathOffset == f) {
            return;
        }
        this.trimPathOffset = f;
        this.isTrimPathDirty = true;
        invalidate();
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure.getValue();
    }

    private final void updatePath() {
        this.parser.clear();
        this.path.reset();
        this.parser.addPathNodes(this.pathData).toPath(this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        this.renderPath.reset();
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            Path.m1540addPathUv8p0NA$default(this.renderPath, this.path, 0L, 2, null);
            return;
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.trimPathEnd + f2) % 1.0f) * length;
        if (f3 > f4) {
            getPathMeasure().getSegment(f3, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f4, this.renderPath, true);
        } else {
            getPathMeasure().getSegment(f3, f4, this.renderPath, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m1699drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            DrawScope.m1699drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    public String toString() {
        return this.path.toString();
    }
}
