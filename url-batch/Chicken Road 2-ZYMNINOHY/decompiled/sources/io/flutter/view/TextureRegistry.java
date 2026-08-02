package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;

/* loaded from: classes.dex */
public interface TextureRegistry {

    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    public interface OnTrimMemoryListener {
        void onTrimMemory(int i4);
    }

    public enum SurfaceLifecycle {
        manual,
        resetInBackground
    }

    public interface SurfaceProducer extends TextureEntry {

        public interface Callback {
            default void onSurfaceAvailable() {
                onSurfaceCreated();
            }

            default void onSurfaceCleanup() {
                onSurfaceDestroyed();
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.27")
            default void onSurfaceCreated() {
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.28")
            default void onSurfaceDestroyed() {
            }
        }

        Surface getForcedNewSurface();

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(Callback callback);

        void setSize(int i4, int i5);
    }

    public interface SurfaceTextureEntry extends TextureEntry {
        default void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener) {
        }

        default void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener) {
        }

        SurfaceTexture surfaceTexture();
    }

    public interface TextureEntry {
        long id();

        void release();
    }

    ImageTextureEntry createImageTexture();

    default SurfaceProducer createSurfaceProducer() {
        return createSurfaceProducer(SurfaceLifecycle.manual);
    }

    SurfaceProducer createSurfaceProducer(SurfaceLifecycle surfaceLifecycle);

    SurfaceTextureEntry createSurfaceTexture();

    default void onTrimMemory(int i4) {
    }

    SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);
}
