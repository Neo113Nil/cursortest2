package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0019\u0010\u000b\u001a\u00060\u0005j\u0002`\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u00052\u00020\u0005¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/Canvas;", "ActualCanvas", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidCanvas_androidKt {
    private static final android.graphics.Canvas EmptyCanvas = new android.graphics.Canvas();

    public static final Canvas ActualCanvas(ImageBitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new android.graphics.Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(image)));
        return androidCanvas;
    }

    public static final android.graphics.Canvas getNativeCanvas(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
