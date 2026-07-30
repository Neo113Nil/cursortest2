package com.onevcat.uniwebview;

import android.graphics.Bitmap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0086 J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086 J)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086 ¨\u0006\u0012"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewNativeTexture;", "", "()V", "startBitmapStream", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "streamId", "", "width", "", "height", "generation", "stopBitmapStream", "", "uploadBitmapFrame", "bitmap", "Landroid/graphics/Bitmap;", "uniwebview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UniWebViewNativeTexture {
    public static final UniWebViewNativeTexture INSTANCE = new UniWebViewNativeTexture();

    static {
        System.loadLibrary("UniWebViewNativeTexture");
    }

    private UniWebViewNativeTexture() {
    }

    public final native boolean startBitmapStream(String name, long streamId, int width, int height, long generation);

    public final native void stopBitmapStream(String name, long streamId);

    public final native boolean uploadBitmapFrame(String name, long streamId, long generation, Bitmap bitmap);
}
