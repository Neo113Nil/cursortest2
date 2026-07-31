package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0016\u001a\u00020\u00158\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001b\u001a\u00020\u001a8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"", "pathStr", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "addPathNodes", "(Ljava/lang/String;)Ljava/util/List;", "EmptyPath", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultStrokeLineCap", "I", "getDefaultStrokeLineCap", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultStrokeLineJoin", "getDefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "DefaultTintBlendMode", "getDefaultTintBlendMode", "Landroidx/compose/ui/graphics/Color;", "DefaultTintColor", "J", "getDefaultTintColor", "()J", "Landroidx/compose/ui/graphics/PathFillType;", "DefaultFillType", "getDefaultFillType", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VectorKt {
    private static final List EmptyPath = CollectionsKt.emptyList();
    private static final int DefaultStrokeLineCap = StrokeCap.INSTANCE.m1594getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.INSTANCE.m1605getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.INSTANCE.m1419getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.INSTANCE.m1460getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.INSTANCE.m1549getNonZeroRgk1Os();

    public static final List getEmptyPath() {
        return EmptyPath;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final List addPathNodes(String str) {
        if (str == null) {
            return EmptyPath;
        }
        return new PathParser().parsePathString(str).getNodes();
    }
}
