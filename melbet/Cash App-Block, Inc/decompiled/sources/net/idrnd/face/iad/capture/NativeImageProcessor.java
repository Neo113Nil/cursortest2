package net.idrnd.face.iad.capture;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015Jh\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\tH\u0086 ¢\u0006\u0004\b&\u0010'J\"\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lnet/idrnd/face/iad/capture/NativeImageProcessor;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "rgbBuffer", "", "bitmapToRgb", "(Landroid/graphics/Bitmap;[B)Z", "", "nv21ByteArrayPointer", "", "width", "height", "rgbOutput", "", "convertNv21ToRgb", "(JII[B)V", "", "argbOutput", "convertNv21ToArgb", "(JII[I)V", "Ljava/nio/ByteBuffer;", "yBuffer", "yPixelStride", "yRowStride", "uBuffer", "uPixelStride", "uRowStride", "vBuffer", "vPixelStride", "vRowStride", "convertYuv420ToNv21", "(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIII)J", "byteArrayPointer", "byteArraySize", "copyNativeByteArray", "(JI)J", "freeNativeByteArray", "(J)V", "copyToJavaByteArray", "(JI)[B", "byteArray", "copyJavaByteArrayToNativeMemory", "([B)J", "iad-2.5.1_misnap"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class NativeImageProcessor {
    public static final NativeImageProcessor a = new NativeImageProcessor();

    static {
        System.loadLibrary("FaceIad");
    }

    public final native boolean bitmapToRgb(Bitmap bitmap, byte[] rgbBuffer);

    public final native void convertNv21ToArgb(long nv21ByteArrayPointer, int width, int height, int[] argbOutput);

    public final native void convertNv21ToRgb(long nv21ByteArrayPointer, int width, int height, byte[] rgbOutput);

    public final native long convertYuv420ToNv21(ByteBuffer yBuffer, int yPixelStride, int yRowStride, ByteBuffer uBuffer, int uPixelStride, int uRowStride, ByteBuffer vBuffer, int vPixelStride, int vRowStride, int width, int height);

    public final native long copyJavaByteArrayToNativeMemory(byte[] byteArray);

    public final native long copyNativeByteArray(long byteArrayPointer, int byteArraySize);

    public final native byte[] copyToJavaByteArray(long byteArrayPointer, int byteArraySize);

    public final native void freeNativeByteArray(long byteArrayPointer);
}
