package com.squareup.scannerview;

import android.graphics.Rect;
import android.media.Image;
import com.squareup.scannerview.scanner.RealObjectScanner;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes8.dex */
public final class PreviewFrame {
    public final Lazy croppedY$delegate;
    public final Lazy debugInfo$delegate;
    public final Rotation rotation;
    public final Rect targetBounds;
    public final Lazy targetHeight$delegate;
    public final Lazy targetWidth$delegate;
    public final PixelGrid uData;
    public final PixelGrid vData;
    public final PixelGrid yData;

    public PreviewFrame(Image.Plane plane, Image.Plane plane2, Image.Plane plane3, int i, int i2, Rotation rotation, Rect rect) {
        RealObjectScanner realObjectScanner = RealObjectScanner.INSTANCE;
        plane.getClass();
        plane2.getClass();
        plane3.getClass();
        this.rotation = rotation;
        Rect rect2 = new Rect(rect);
        rect2.left = Math.max(0, rect2.left);
        rect2.top = Math.max(0, rect2.top);
        rect2.right = Math.min(i, rect2.right);
        rect2.bottom = Math.min(i2, rect2.bottom);
        this.targetBounds = rect2;
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        ByteBuffer buffer = plane.getBuffer();
        buffer.getClass();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        this.yData = new PixelGrid(i, i2, rowStride, pixelStride, 224, bArr);
        int i3 = i / 2;
        int i4 = i2 / 2;
        int rowStride2 = plane2.getRowStride();
        int pixelStride2 = plane2.getPixelStride();
        ByteBuffer buffer2 = plane2.getBuffer();
        buffer2.getClass();
        byte[] bArr2 = new byte[buffer2.remaining()];
        buffer2.get(bArr2);
        this.uData = new PixelGrid(i3, i4, rowStride2, pixelStride2, 224, bArr2);
        int rowStride3 = plane3.getRowStride();
        int pixelStride3 = plane3.getPixelStride();
        ByteBuffer buffer3 = plane3.getBuffer();
        buffer3.getClass();
        byte[] bArr3 = new byte[buffer3.remaining()];
        buffer3.get(bArr3);
        this.vData = new PixelGrid(i3, i4, rowStride3, pixelStride3, 224, bArr3);
        this.croppedY$delegate = LazyKt.lazy(new PreviewFrame$$ExternalSyntheticLambda0(this, 0));
        this.targetWidth$delegate = LazyKt.lazy(new PreviewFrame$$ExternalSyntheticLambda0(this, 2));
        this.targetHeight$delegate = LazyKt.lazy(new PreviewFrame$$ExternalSyntheticLambda0(this, 3));
        this.debugInfo$delegate = LazyKt.lazy(new ListsKt$$ExternalSyntheticLambda0(21, this, rect));
    }

    public final PixelGrid getCroppedY() {
        return (PixelGrid) this.croppedY$delegate.getValue();
    }
}
