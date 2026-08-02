package kotlin.reflect.jvm.internal.types;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.zzae;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KVariance;

/* loaded from: classes4.dex */
public abstract class KTypeSubstitutorKt {
    public static final KVariance access$intersectWith(KVariance kVariance, KVariance kVariance2) {
        KVariance kVariance3 = KVariance.INVARIANT;
        if (kVariance == kVariance3) {
            return kVariance2;
        }
        if (kVariance2 == kVariance3 || kVariance == kVariance2) {
            return kVariance;
        }
        a$$ExternalSyntheticBUOutline0.m$1("CONFLICTING_PROJECTION");
        return null;
    }

    public static NetworkStatus.Unavailable carryForwardTimeOrCreate(NetworkStatus networkStatus, Function0 function0) {
        return (networkStatus instanceof NetworkStatus.Unavailable ? (NetworkStatus.Unavailable) networkStatus : null) != null ? new NetworkStatus.Unavailable(((NetworkStatus.Unavailable) networkStatus).sinceMillis) : new NetworkStatus.Unavailable(((Number) function0.invoke()).longValue());
    }

    public static ByteBuffer convertToNv21Buffer(InputImage inputImage) {
        int i = inputImage.zzg;
        int i2 = 0;
        if (i != -1) {
            if (i == 17) {
                ByteBuffer byteBuffer = inputImage.zzb;
                zzae.checkNotNull(byteBuffer);
                return byteBuffer;
            }
            if (i == 35) {
                Image.Plane[] planes = inputImage.getPlanes();
                zzae.checkNotNull(planes);
                return yuv420ThreePlanesToNV21(planes, inputImage.zzd, inputImage.zze);
            }
            if (i != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = inputImage.zzb;
            zzae.checkNotNull(byteBuffer2);
            return yv12ToNv21Buffer(byteBuffer2, false);
        }
        Bitmap bitmap = inputImage.zza;
        zzae.checkNotNull(bitmap);
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < height) {
            int i7 = i2;
            while (i7 < width) {
                int i8 = iArr[i6];
                int i9 = i8 >> 16;
                int i10 = i8 >> 8;
                int i11 = i8 & 255;
                int i12 = i5 + 1;
                int i13 = i9 & 255;
                int i14 = i10 & 255;
                allocateDirect.put(i5, (byte) Math.min(255, (Boxes$$ExternalSyntheticOutline1.m(i11, 25, (i14 * EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) + (i13 * 66), 128) >> 8) + 16));
                if (i4 % 2 == 0 && i6 % 2 == 0) {
                    int i15 = ((((i13 * 112) - (i14 * 94)) - (i11 * 18)) + 128) >> 8;
                    int i16 = (((((i13 * (-38)) - (i14 * 74)) + (i11 * 112)) + 128) >> 8) + 128;
                    int i17 = i3 + 1;
                    allocateDirect.put(i3, (byte) Math.min(255, i15 + 128));
                    i3 += 2;
                    allocateDirect.put(i17, (byte) Math.min(255, i16));
                }
                i6++;
                i7++;
                i5 = i12;
            }
            i4++;
            i2 = 0;
        }
        return allocateDirect;
    }

    public static Bitmap nv21ToBitmap(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] bArr;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArr = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int limit = byteBuffer.limit();
            byte[] bArr2 = new byte[limit];
            byteBuffer.get(bArr2, 0, limit);
            bArr = bArr2;
        }
        byte[] zzb = zzb(i, i2, bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzb, 0, zzb.length);
        return zza(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    public static ByteBuffer yuv420ThreePlanesToNV21(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr = new byte[FillrEnv$EnumUnboxingLocalUtility.m$1(i3, 4, i3)];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i4 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i4 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i4 - 1);
        } else {
            zzc(planeArr[0], i, i2, bArr, 0, 1);
            zzc(planeArr[1], i, i2, bArr, i3 + 1, 2);
            zzc(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static ByteBuffer yv12ToNv21Buffer(ByteBuffer byteBuffer, boolean z) {
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        ByteBuffer allocate = z ? ByteBuffer.allocate(limit) : ByteBuffer.allocateDirect(limit);
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            allocate.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            allocate.put(i + i4, byteBuffer.get((i4 / 2) + ((i4 % 2) * i2) + i));
        }
        return allocate;
    }

    public static Bitmap zza(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    public static byte[] zzb(int i, int i2, byte[] bArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException(13, e, "Image conversion error from NV21 format");
        }
    }

    public static final void zzc(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int i6 = 0;
        for (int i7 = 0; i7 < rowStride; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }
}
