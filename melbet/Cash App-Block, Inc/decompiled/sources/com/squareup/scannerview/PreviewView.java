package com.squareup.scannerview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder;
import androidx.camera.view.TextureViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.recyclerview.widget.RecyclerView;
import dev.chrisbanes.haze.Pool;
import utils.StringUtilsKt;

/* loaded from: classes8.dex */
public final class PreviewView extends TextureView {
    public Callback callback;
    public Rotation rotation;
    public int surfaceHeight;
    public int surfaceWidth;

    /* renamed from: com.squareup.scannerview.PreviewView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i3) {
                case 0:
                    surfaceTexture.getClass();
                    PreviewView previewView = (PreviewView) obj;
                    previewView.surfaceWidth = i;
                    previewView.surfaceHeight = i2;
                    previewView.configureTransform();
                    previewView.configureTransform();
                    Callback callback = previewView.callback;
                    callback.getClass();
                    CameraOperator.access$startCaptureSession((CameraOperator) ((Pool) callback).pool);
                    break;
                default:
                    StringUtilsKt.d("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
                    TextureViewImplementation textureViewImplementation = (TextureViewImplementation) obj;
                    textureViewImplementation.mSurfaceTexture = surfaceTexture;
                    if (textureViewImplementation.mSurfaceReleaseFuture == null) {
                        textureViewImplementation.tryToProvidePreviewSurface();
                        break;
                    } else {
                        textureViewImplementation.mSurfaceRequest.getClass();
                        StringUtilsKt.d("TextureViewImpl", "Surface invalidated " + textureViewImplementation.mSurfaceRequest);
                        textureViewImplementation.mSurfaceRequest.mInternalDeferrableSurface.close();
                        break;
                    }
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    surfaceTexture.getClass();
                    PreviewView previewView = (PreviewView) obj;
                    previewView.surfaceWidth = 0;
                    previewView.surfaceHeight = 0;
                    previewView.configureTransform();
                    break;
                default:
                    TextureViewImplementation textureViewImplementation = (TextureViewImplementation) obj;
                    textureViewImplementation.mSurfaceTexture = null;
                    CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = textureViewImplementation.mSurfaceReleaseFuture;
                    if (callbackToFutureAdapter$SafeFuture == null) {
                        StringUtilsKt.d("TextureViewImpl", "SurfaceTexture about to be destroyed");
                        break;
                    } else {
                        Futures.addCallback(callbackToFutureAdapter$SafeFuture, new Recorder.AnonymousClass4(13, this, surfaceTexture), textureViewImplementation.mTextureView.getContext().getMainExecutor());
                        textureViewImplementation.mDetachedSurfaceTexture = surfaceTexture;
                        break;
                    }
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    surfaceTexture.getClass();
                    PreviewView previewView = (PreviewView) this.this$0;
                    previewView.surfaceWidth = i;
                    previewView.surfaceHeight = i2;
                    previewView.configureTransform();
                    previewView.configureTransform();
                    Callback callback = previewView.callback;
                    callback.getClass();
                    CameraOperator.access$startCaptureSession((CameraOperator) ((Pool) callback).pool);
                    break;
                default:
                    StringUtilsKt.d("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
                    break;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            switch (this.$r8$classId) {
                case 0:
                    surfaceTexture.getClass();
                    break;
                default:
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) ((TextureViewImplementation) this.this$0).mNextFrameCompleter.getAndSet(null);
                    if (callbackToFutureAdapter$Completer != null) {
                        callbackToFutureAdapter$Completer.set(null);
                        break;
                    }
                    break;
            }
        }
    }

    public interface Callback {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context) {
        super(context);
        context.getClass();
        this.rotation = Rotation.ROTATION_0;
        setSurfaceTextureListener(new AnonymousClass1(this, 0));
    }

    public final void configureTransform() {
        char c;
        float[] fArr;
        Matrix matrix = new Matrix();
        Rotation rotation = this.rotation;
        Rotation rotation2 = Rotation.ROTATION_90;
        if (rotation == rotation2 || rotation == Rotation.ROTATION_270) {
            int width = getWidth();
            int height = getHeight();
            if (this.rotation == rotation2) {
                float f = height;
                c = 7;
                float f2 = width;
                fArr = new float[]{RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, f, f2, RecyclerView.DECELERATION_RATE};
            } else {
                c = 7;
                float f3 = width;
                float f4 = height;
                fArr = new float[]{f3, RecyclerView.DECELERATION_RATE, f3, f4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f4};
            }
            float f5 = width;
            float f6 = height;
            float[] fArr2 = new float[8];
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = f5;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = f6;
            fArr2[6] = f5;
            fArr2[c] = f6;
            matrix.setPolyToPoly(fArr2, 0, fArr, 0, 4);
        }
        setTransform(matrix);
    }

    public final void setBufferSize(int i, int i2) {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        surfaceTexture.setDefaultBufferSize(i, i2);
    }

    public final void setCallback(Callback callback) {
        callback.getClass();
        this.callback = callback;
    }

    public final void setRotation(Rotation rotation) {
        rotation.getClass();
        this.rotation = rotation;
        configureTransform();
    }
}
