package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import com.yandex.div.core.timer.TimerController;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\u0083\u0001\u0084\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u0004*\u00020 2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u0004*\u00020#2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u0004*\u00020&2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u0004*\u00020)2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u0004*\u00020,2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u0004*\u00020/2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u0004*\u0002022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u0004*\u0002052\u0006\u00107\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u0004*\u00020:2\u0006\u00107\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u00020\u0004*\u00020=2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u00020\u0004*\u00020@2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\u00020\u0004*\u00020G2\u0006\u0010D\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u00020\u0004*\u00020J2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010N\u001a\u00020\u0004*\u00020M2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bN\u0010OJ_\u0010[\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00112\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020Q2\u0006\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020Q2\u0006\u0010W\u001a\u00020Q2\u0006\u0010X\u001a\u00020Q2\u0006\u0010Y\u001a\u0002062\u0006\u0010Z\u001a\u000206H\u0002¢\u0006\u0004\b[\u0010\\J_\u0010c\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00112\u0006\u0010]\u001a\u00020Q2\u0006\u0010^\u001a\u00020Q2\u0006\u0010V\u001a\u00020Q2\u0006\u0010W\u001a\u00020Q2\u0006\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020Q2\u0006\u0010X\u001a\u00020Q2\u0006\u0010a\u001a\u00020Q2\u0006\u0010b\u001a\u00020QH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010i\u001a\u00020\u00042\u0006\u0010f\u001a\u00020e2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ\u001f\u0010n\u001a\u00020l2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020g2\u0006\u0010k\u001a\u00020\u0006H\u0002¢\u0006\u0004\bp\u0010qJ'\u0010s\u001a\u00020g2\u0006\u0010r\u001a\u00020g2\u0006\u0010a\u001a\u00020l2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bs\u0010tJ'\u0010w\u001a\u00020\u00042\u0006\u0010k\u001a\u00020\u00062\u0006\u0010a\u001a\u00020l2\u0006\u0010v\u001a\u00020uH\u0002¢\u0006\u0004\bw\u0010xJ\u0013\u0010y\u001a\u00020Q*\u00020QH\u0002¢\u0006\u0004\by\u0010zR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0016\u0010\u0081\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u007f¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "", "clear", "", "pathData", "parsePathString", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/vector/PathParser;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "(Ljava/util/List;)Landroidx/compose/ui/graphics/vector/PathParser;", "toNodes", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/Path;", "target", "toPath", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "close", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "relativeMoveTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "moveTo", "(Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "relativeLineTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "lineTo", "(Landroidx/compose/ui/graphics/vector/PathNode$LineTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "relativeHorizontalTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "horizontalTo", "(Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "relativeVerticalTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "verticalTo", "(Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "relativeCurveTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "curveTo", "(Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "prevIsCurve", "relativeReflectiveCurveTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;ZLandroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "reflectiveCurveTo", "(Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;ZLandroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "relativeQuadTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "quadTo", "(Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "prevIsQuad", "relativeReflectiveQuadTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;ZLandroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "reflectiveQuadTo", "(Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;ZLandroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "relativeArcTo", "(Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "arcTo", "(Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;Landroidx/compose/ui/graphics/Path;)V", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "isMoreThanHalf", "isPositiveArc", "drawArc", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "", "cmd", "", "args", "addNode", "(C[F)V", "s", "", "end", "nextStart", "(Ljava/lang/String;I)I", "getFloats", "(Ljava/lang/String;)[F", "original", "copyOfRange", "([FII)[F", "Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "result", "extract", "(Ljava/lang/String;ILandroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;)V", "toRadians", "(D)D", "", "Ljava/util/List;", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "currentPoint", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "ctrlPoint", "segmentPoint", "reflectiveCtrlPoint", "ExtractFloatResult", "PathPoint", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PathParser {
    private final PathPoint ctrlPoint;
    private final PathPoint currentPoint;
    private final List nodes = new ArrayList();
    private final PathPoint reflectiveCtrlPoint;
    private final PathPoint segmentPoint;

    private final double toRadians(double d) {
        return (d / 180) * 3.141592653589793d;
    }

    public PathParser() {
        float f = 0.0f;
        int i = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.currentPoint = new PathPoint(f, f, i, defaultConstructorMarker);
        this.ctrlPoint = new PathPoint(f, f, i, defaultConstructorMarker);
        this.segmentPoint = new PathPoint(f, f, i, defaultConstructorMarker);
        this.reflectiveCtrlPoint = new PathPoint(f, f, i, defaultConstructorMarker);
    }

    /* compiled from: PathParser.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "<init>", "(FF)V", "", TimerController.RESET_COMMAND, "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final /* data */ class PathPoint {
        private float x;
        private float y;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) other;
            return Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(pathPoint.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(pathPoint.y));
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public String toString() {
            return "PathPoint(x=" + this.x + ", y=" + this.y + ')';
        }

        public PathPoint(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public /* synthetic */ PathPoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        public final void reset() {
            this.x = 0.0f;
            this.y = 0.0f;
        }
    }

    public final void clear() {
        this.nodes.clear();
    }

    public final PathParser parsePathString(String pathData) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.nodes.clear();
        int i = 0;
        int i2 = 1;
        while (i2 < pathData.length()) {
            int nextStart = nextStart(pathData, i2);
            String substring = pathData.substring(i, nextStart);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = Intrinsics.compare((int) substring.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            String obj = substring.subSequence(i3, length + 1).toString();
            if (obj.length() > 0) {
                addNode(obj.charAt(0), getFloats(obj));
            }
            i = nextStart;
            i2 = nextStart + 1;
        }
        if (i2 - i == 1 && i < pathData.length()) {
            addNode(pathData.charAt(i), new float[0]);
        }
        return this;
    }

    public final PathParser addPathNodes(List nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.nodes.addAll(nodes);
        return this;
    }

    /* renamed from: toNodes, reason: from getter */
    public final List getNodes() {
        return this.nodes;
    }

    public final Path toPath(Path target) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List list = this.nodes;
        int size = list.size();
        PathNode pathNode = null;
        int i = 0;
        while (i < size) {
            PathNode pathNode2 = (PathNode) list.get(i);
            if (pathNode == null) {
                pathNode = pathNode2;
            }
            if (pathNode2 instanceof PathNode.Close) {
                close(target);
            } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.MoveTo) {
                moveTo((PathNode.MoveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                relativeLineTo((PathNode.RelativeLineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.LineTo) {
                lineTo((PathNode.LineTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                horizontalTo((PathNode.HorizontalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.VerticalTo) {
                verticalTo((PathNode.VerticalTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.CurveTo) {
                curveTo((PathNode.CurveTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                Intrinsics.checkNotNull(pathNode);
                relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                Intrinsics.checkNotNull(pathNode);
                reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.getIsCurve(), target);
            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.QuadTo) {
                quadTo((PathNode.QuadTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                Intrinsics.checkNotNull(pathNode);
                relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                Intrinsics.checkNotNull(pathNode);
                reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.getIsQuad(), target);
            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                relativeArcTo((PathNode.RelativeArcTo) pathNode2, target);
            } else if (pathNode2 instanceof PathNode.ArcTo) {
                arcTo((PathNode.ArcTo) pathNode2, target);
            }
            i++;
            pathNode = pathNode2;
        }
        return target;
    }

    private final void close(Path target) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        target.close();
        target.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeMoveTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeMoveTo.getDy());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeLineTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeLineTo.getDy());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeHorizontalTo.getDx());
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(pathPoint.getY() + relativeVerticalTo.getDy());
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeCurveTo.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeCurveTo.getDy2());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeCurveTo.getDx3());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeCurveTo.getDy3());
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeReflectiveCurveTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeReflectiveCurveTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveCurveTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveCurveTo.getDy2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeQuadTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeQuadTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeQuadTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeQuadTo.getDy2());
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveQuadTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveQuadTo.getDy());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z, Path path) {
        if (z) {
            float f = 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, this.currentPoint.getX(), this.currentPoint.getY(), arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void drawArc(Path p, double x0, double y0, double x1, double y1, double a, double b, double theta, boolean isMoreThanHalf, boolean isPositiveArc) {
        double d;
        double d2;
        double radians = toRadians(theta);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = ((x0 * cos) + (y0 * sin)) / a;
        double d4 = (((-x0) * sin) + (y0 * cos)) / b;
        double d5 = ((x1 * cos) + (y1 * sin)) / a;
        double d6 = (((-x1) * sin) + (y1 * cos)) / b;
        double d7 = d3 - d5;
        double d8 = d4 - d6;
        double d9 = 2;
        double d10 = (d3 + d5) / d9;
        double d11 = (d4 + d6) / d9;
        double d12 = (d7 * d7) + (d8 * d8);
        if (d12 == 0.0d) {
            return;
        }
        double d13 = (1.0d / d12) - 0.25d;
        if (d13 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d12) / 1.99999d);
            drawArc(p, x0, y0, x1, y1, a * sqrt, b * sqrt, theta, isMoreThanHalf, isPositiveArc);
            return;
        }
        double sqrt2 = Math.sqrt(d13);
        double d14 = d7 * sqrt2;
        double d15 = sqrt2 * d8;
        if (isMoreThanHalf == isPositiveArc) {
            d = d10 - d15;
            d2 = d11 + d14;
        } else {
            d = d10 + d15;
            d2 = d11 - d14;
        }
        double atan2 = Math.atan2(d4 - d2, d3 - d);
        double atan22 = Math.atan2(d6 - d2, d5 - d) - atan2;
        if (isPositiveArc != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d16 = d * a;
        double d17 = d2 * b;
        arcToBezier(p, (d16 * cos) - (d17 * sin), (d16 * sin) + (d17 * cos), a, b, x0, y0, radians, atan2, atan22);
    }

    private final void arcToBezier(Path p, double cx, double cy, double a, double b, double e1x, double e1y, double theta, double start, double sweep) {
        double d = a;
        double d2 = 4;
        int ceil = (int) Math.ceil(Math.abs((sweep * d2) / 3.141592653589793d));
        double cos = Math.cos(theta);
        double sin = Math.sin(theta);
        double cos2 = Math.cos(start);
        double sin2 = Math.sin(start);
        double d3 = -d;
        double d4 = d3 * cos;
        double d5 = b * sin;
        double d6 = (d4 * sin2) - (d5 * cos2);
        double d7 = d3 * sin;
        double d8 = b * cos;
        double d9 = (sin2 * d7) + (cos2 * d8);
        double d10 = sweep / ceil;
        double d11 = e1x;
        double d12 = d9;
        double d13 = d6;
        int i = 0;
        double d14 = e1y;
        double d15 = start;
        while (i < ceil) {
            double d16 = d15 + d10;
            double sin3 = Math.sin(d16);
            double cos3 = Math.cos(d16);
            int i2 = ceil;
            double d17 = (cx + ((d * cos) * cos3)) - (d5 * sin3);
            double d18 = cy + (d * sin * cos3) + (d8 * sin3);
            double d19 = (d4 * sin3) - (d5 * cos3);
            double d20 = (sin3 * d7) + (cos3 * d8);
            double d21 = d16 - d15;
            double tan = Math.tan(d21 / 2);
            double sin4 = (Math.sin(d21) * (Math.sqrt(d2 + ((3.0d * tan) * tan)) - 1)) / 3;
            p.cubicTo((float) (d11 + (d13 * sin4)), (float) (d14 + (d12 * sin4)), (float) (d17 - (sin4 * d19)), (float) (d18 - (sin4 * d20)), (float) d17, (float) d18);
            i++;
            d10 = d10;
            sin = sin;
            d11 = d17;
            d7 = d7;
            d15 = d16;
            d12 = d20;
            d2 = d2;
            d13 = d19;
            cos = cos;
            ceil = i2;
            d14 = d18;
            d = a;
        }
    }

    private final void addNode(char cmd, float[] args) {
        this.nodes.addAll(PathNodeKt.toPathNodes(cmd, args));
    }

    private final int nextStart(String s, int end) {
        while (end < s.length()) {
            char charAt = s.charAt(end);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float[] getFloats(String s) {
        int i = 0;
        Object[] objArr = 0;
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[s.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(i, objArr == true ? 1 : 0, 3, null);
        int length = s.length();
        int i2 = 1;
        int i3 = 0;
        while (i2 < length) {
            extract(s, i2, extractFloatResult);
            int endPosition = extractFloatResult.getEndPosition();
            if (i2 < endPosition) {
                String substring = s.substring(i2, endPosition);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i3] = Float.parseFloat(substring);
                i3++;
            }
            i2 = extractFloatResult.getEndWithNegativeOrDot() ? endPosition : endPosition + 1;
        }
        return copyOfRange(fArr, 0, i3);
    }

    private final float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int length = original.length;
        if (start < 0 || start > length) {
            throw new IndexOutOfBoundsException();
        }
        int i = end - start;
        int min = Math.min(i, length - start);
        float[] fArr = new float[i];
        ArraysKt.copyInto(original, fArr, 0, start, min + start);
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:0: B:2:0x0008->B:15:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[EDGE_INSN: B:16:0x004a->B:17:0x004a BREAK  A[LOOP:0: B:2:0x0008->B:15:0x0047], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void extract(String s, int start, ExtractFloatResult result) {
        result.setEndWithNegativeOrDot(false);
        int i = start;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i < s.length()) {
            char charAt = s.charAt(i);
            if (charAt != ' ' && charAt != ',') {
                if (charAt == '-') {
                    if (i != start && !z) {
                        result.setEndWithNegativeOrDot(true);
                    }
                    z = false;
                } else if (charAt != '.') {
                    if (charAt == 'e' || charAt == 'E') {
                        z = true;
                    }
                    z = false;
                } else if (z2) {
                    result.setEndWithNegativeOrDot(true);
                } else {
                    z = false;
                    z2 = true;
                }
                if (!z3) {
                    break;
                } else {
                    i++;
                }
            }
            z = false;
            z3 = true;
            if (!z3) {
            }
        }
        result.setEndPosition(i);
    }

    /* compiled from: PathParser.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "", "", "endPosition", "", "endWithNegativeOrDot", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getEndPosition", "setEndPosition", "(I)V", "Z", "getEndWithNegativeOrDot", "()Z", "setEndWithNegativeOrDot", "(Z)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final /* data */ class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) other;
            return this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.endPosition) * 31;
            boolean z = this.endWithNegativeOrDot;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }

        public ExtractFloatResult(int i, boolean z) {
            this.endPosition = i;
            this.endWithNegativeOrDot = z;
        }

        public /* synthetic */ ExtractFloatResult(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        public final void setEndWithNegativeOrDot(boolean z) {
            this.endWithNegativeOrDot = z;
        }
    }
}
