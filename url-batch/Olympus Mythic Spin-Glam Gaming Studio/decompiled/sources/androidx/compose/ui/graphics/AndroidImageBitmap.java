package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "prepareToDraw", "()V", "Landroid/graphics/Bitmap;", "getBitmap$ui_graphics_release", "()Landroid/graphics/Bitmap;", "", "getWidth", "()I", "width", "getHeight", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "config", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidImageBitmap implements ImageBitmap {
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
    }

    /* renamed from: getBitmap$ui_graphics_release, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo1356getConfig_sVssgQ() {
        Bitmap.Config config = this.bitmap.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "bitmap.config");
        return AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }
}
